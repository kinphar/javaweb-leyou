package com.leyou.upload.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     : dqf
 * @ Date       : Create in 00:16 2019-06-20
 * @ Modified By: xxx
 */

@Service
@Slf4j
public class UploadService {
    private static final List<String> ALLOW_TPYES = Arrays.asList("image/jpeg", "image/png", "image/bmp");
    private static final String savePath = "/Users/kinphar/Documents/project/javaweb/upload/";

    public String uploadImage(MultipartFile file) {
        try {
            // 校验文件类型
            String contentType = file.getContentType();
            if (!ALLOW_TPYES.contains(contentType)) {
                throw new LyException(ExceptionEnum.INVALID_FILE_TYPE);
            }

            // 校验文件内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                throw new LyException(ExceptionEnum.INVALID_FILE_CONTENT);
            }

            // 准备目标路径
            File dest = new File(savePath, file.getOriginalFilename());

            // 保存文件到本地
            file.transferTo(dest);

            // 返回路径
            return "http://image.leyou.com/" + file.getOriginalFilename();
        } catch (IOException e) {
            log.error("上传文件失败！", e);
            throw new LyException(ExceptionEnum.UPLOAD_FILE_ERROR);
        }
    }
}
