package controllers;


import helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
    @Autowired
    private FileUploadHelper fileUploadHelper;
    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file){
//        System.out.println("hi");
//        System.out.println(file.getName());
//        System.out.println(file.getContentType());
//        System.out.println(file.getSize());
//        System.out.println(file.getOriginalFilename());
        if(file.isEmpty()){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request Must Contain File");
        }
        if(!file.getContentType().equals("image/png")){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only png type contain is allowed");

        }
        //file upload code
        try{
            boolean f=fileUploadHelper.uploadFile(file);
            if(f){
                return ResponseEntity.ok("File is uplaaded");
            }

        }catch (Exception e){
            e.printStackTrace();

        }




        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went wrong try again");
    }
}
