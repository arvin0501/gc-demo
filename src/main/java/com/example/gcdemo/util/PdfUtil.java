package com.example.gcdemo.util;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Marx
 */
public class PdfUtil {

    public static void pdf2Picture(String srcFile, String destPath) {
        try {
            File file = new File(srcFile);
            PDDocument doc = PDDocument.load(file);
            PDFRenderer pdfRenderer = new PDFRenderer(doc);
            PDPageTree pageTree = doc.getPages();
            int pageCounter = 0;
            for (PDPage page : pageTree) {
                float width = page.getCropBox().getWidth();
                float scale = 1.0f;
                if (width > 720) {
                    scale = 720 / width;
                }
                BufferedImage bim = pdfRenderer.renderImage(pageCounter, scale, ImageType.RGB);
                ImageIOUtil.writeImage(bim, destPath + (pageCounter++) + ".jpg", 300);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
