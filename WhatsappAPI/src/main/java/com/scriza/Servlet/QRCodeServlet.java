//package com.scriza.Servlet;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//
//@WebServlet("/qr-code")
//public class QRCodeServlet extends HttpServlet {
//private static final String SCREENSHOT_PATH = "./Screenshots/QRCODE.png";
//
//
//
//@Override
//protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    File qrCodeFile = new File(SCREENSHOT_PATH);
//    if (!qrCodeFile.exists()) {
//        resp.sendError(HttpServletResponse.SC_NOT_FOUND);
//        return;
//    }
//
//    resp.setContentType("image/png");
//    resp.setContentLength((int) qrCodeFile.length());
//
//    try (FileInputStream in = new FileInputStream(qrCodeFile);
//         OutputStream out = resp.getOutputStream()) {
//
//        byte[] buffer = new byte[1024];
//        int bytesRead;
//        while ((bytesRead = in.read(buffer)) != -1) {
//            out.write(buffer, 0, bytesRead);
//        }
//    }
//}
//
//}