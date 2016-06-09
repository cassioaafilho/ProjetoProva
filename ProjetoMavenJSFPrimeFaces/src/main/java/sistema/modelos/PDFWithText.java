package sistema.modelos;

import java.util.List;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
public class PDFWithText {
    
    @SuppressWarnings("deprecation")
	public void createPDF(List<Pergunta> perguntas, String nome) throws IOException
    {
    	 Document doc = null;
        OutputStream os = null;
        try {
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
            os = new FileOutputStream("C:\\temp\\" + nome  + ".pdf");
            PdfWriter.getInstance(doc, os);
            doc.open();
            int count = 1;
            for(Pergunta perg : perguntas)
	        {
            	String text = Integer.toString(count) + "- ";
            	count++;
	        	text += perg.getTitulo();
            	Paragraph p = new Paragraph(text);
                doc.add(p);
                Paragraph p2 = new Paragraph("R:");
                doc.add(p2);
	        }
        } 
        catch(Exception e)
        {
        	
        }
        finally {
            if (doc != null) {
                doc.close();
            }
            if (os != null) {
               //fechamento da stream de sa�da
               os.close();
            }
        }

    }
}
