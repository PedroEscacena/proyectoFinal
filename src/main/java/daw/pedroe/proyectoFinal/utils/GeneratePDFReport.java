package daw.pedroe.proyectoFinal.utils;

import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import daw.pedroe.proyectoFinal.model.Report;

public class GeneratePDFReport {

	public static ByteArrayOutputStream getPdfFile(Report report) {

		Document document = new Document();
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		try {

			PdfPTable table = new PdfPTable(2);
			table.setWidthPercentage(60);
			table.setWidths(new int[] { 1, 3 });

			Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

			PdfPCell hcell;
			hcell = new PdfPCell(new Phrase("Doctor", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Date", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			PdfPCell cell;

			cell = new PdfPCell(new Phrase(report.getDoctor().getName() + " " + report.getDoctor().getSurname()));
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);

			cell = new PdfPCell(new Phrase(report.getMedApp().getDate()+""));
			cell.setPaddingLeft(5);
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);

			PdfPTable table2 = new PdfPTable(2);
			table2.setWidthPercentage(60);
			table2.setWidths(new int[] { 1, 5 });

			PdfPCell hcell2;
			hcell2 = new PdfPCell(new Phrase("Patient", headFont));
			hcell2.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(hcell2);

			hcell2 = new PdfPCell(new Phrase("Medicine", headFont));
			hcell2.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(hcell2);

			

				PdfPCell cell2;

				cell2 = new PdfPCell(new Phrase(report.getPatient().getName()+" "+ report.getPatient().getSurname()));
				cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
				table2.addCell(cell2);

				cell2 = new PdfPCell(new Phrase(report.getMedicine()));
				cell2.setPaddingLeft(5);
				cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
				table2.addCell(cell2);
			

			PdfWriter.getInstance(document, bout);
			document.open();
			document.add(table);
			document.add(table2);

			document.close();

		} catch (DocumentException ex) {

			Logger.getLogger(GeneratePDFReport.class.getName()).log(Level.SEVERE, null, ex);
		}

		return bout;
	}

}
