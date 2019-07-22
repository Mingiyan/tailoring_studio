package ru.halmg.handler;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class FileUploader {
    public String uploadFile(MultipartFile file, String pathToSave) {
        String fileName = file.getOriginalFilename();
        String fileGuid = UUID.randomUUID().toString();
        String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
        String finalName = fileGuid + "." + fileExt;
        File convFile = new File(finalName);
        try (FileOutputStream fos = new FileOutputStream(pathToSave + convFile)){
            convFile.createNewFile();
            fos.write(file.getBytes());
            return finalName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}