//package com.leo2020.awsimageupload.filestore;
//
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class FileStore {
//    private final AmazonS3 s3;
//
//    @Autowired
//    public FileStore(AmazonS3 s3) {
//        this.s3 = s3;
//
//    }
//
//    public void save(String path,
//                     String fileName,
//                     Optional<Map<String, String>> optionalMetadata,
//                     InputStream inputStream){
//        ObjectMetadata objectMetadata = new ObjectMetadata();
//        optionalMetadata.ifPresent(map -> )
//        try {
//            s3.putObject(path, fileName, inputStream, metadata)
//        }
//    }
//}
