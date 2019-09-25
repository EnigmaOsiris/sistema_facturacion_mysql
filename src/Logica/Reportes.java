package Logica;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.ResultSet;

public class Reportes {
    public static void reporteFacturas(String nomArch, ResultSet rsDatosReporte){
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nomArch));
            
            //colocamos el titulo del reporte
            String texto = "REPORTE FACTURAS";
            Paragraph parrafo = new Paragraph(texto);
            documento.open();
            documento.add(parrafo);
            parrafo = new Paragraph(" ");
            documento.add(parrafo);
            
            boolean hayRegistros = rsDatosReporte.next();
            PdfPTable tabla;
                    
            //totales
            int toCantFac = 0;
            double totValFac = 0;
            double totCanGen = 0;
            double totVaGen = 0;
            
            //iniciamos el cuerpo del reporte
            while(hayRegistros){
                //imprimimos el encabezado de la factura
                tabla = new PdfPTable(2);
                tabla.addCell("Factura #: ");
                tabla.addCell(rsDatosReporte.getString("idFactura"));
                tabla.addCell("id cliente: ");
                tabla.addCell(rsDatosReporte.getString("idCliente"));
                tabla.addCell("Nombre: ");
                tabla.addCell(rsDatosReporte.getString("nombreFull"));
                tabla.addCell("Fecha: ");
                tabla.addCell(rsDatosReporte.getString("fecha"));
                
                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                parrafo = new Paragraph(" ");
                documento.add(parrafo);
            
                //inicializamos totales de factura
                toCantFac = 0;
                totValFac = 0;
                
                //colocamos los encabezados del detalle
                tabla = new PdfPTable(6);
                tabla.addCell("Linea");
                tabla.addCell("Id Producto");
                tabla.addCell("Descripcion");
                tabla.addCell("Precio");
                tabla.addCell("Cantidad");
                tabla.addCell("Valor");
                
                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                
                int facturaActual = rsDatosReporte.getInt("idFactura");
                while(hayRegistros && facturaActual==rsDatosReporte.getInt("idFactura")){
                    tabla = new PdfPTable(6);
                    tabla.addCell(rsDatosReporte.getString("idLinea"));
                    tabla.addCell(rsDatosReporte.getString("idProducto"));
                    tabla.addCell(rsDatosReporte.getString("descripcion"));
                    tabla.addCell(rsDatosReporte.getString("precio"));
                    tabla.addCell(rsDatosReporte.getString("cantidadProductos"));
                    tabla.addCell(rsDatosReporte.getString("valor"));
                    parrafo = new Paragraph();
                    parrafo.add(tabla);
                    documento.add(parrafo);
                    
                    toCantFac += rsDatosReporte.getInt("cantidadProductos");
                    totValFac += rsDatosReporte.getInt("valor");
                    hayRegistros = rsDatosReporte.next();
                }

                //imprimir totales
                tabla = new PdfPTable(6);
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell(" ");
                tabla.addCell("TOTAL FACTURA: ");
                tabla.addCell("" + toCantFac);
                tabla.addCell("" + totValFac);
                parrafo = new Paragraph();
                parrafo.add(tabla);
                documento.add(parrafo);
                
                //acumulamos totales generales
                totCanGen += toCantFac;
                totVaGen += totValFac;
                //colocamos un espacio en blanco
                parrafo = new Paragraph(" ");
                documento.add(parrafo);
            }
            //imprimir totales generales
            tabla = new PdfPTable(6);
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell("TOTAL GENERAL: ");
            tabla.addCell("" + totCanGen);
            tabla.addCell("" + totVaGen);
            parrafo = new Paragraph();
            parrafo.add(tabla);
            documento.add(parrafo);
        } catch (Exception e) {
        }finally{
            documento.close();
        }
    }
}
