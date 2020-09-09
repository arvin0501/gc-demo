package com.example.gcdemo;

import com.example.gcdemo.util.PdfUtil;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//@SpringBootTest
class GcDemoApplicationTests {

    @Test
    void contextLoads() {

        PdfUtil.pdf2Picture("C:\\Users\\arvin\\Desktop\\a.pdf", "C:\\Users\\arvin\\Desktop\\");
    }

}
