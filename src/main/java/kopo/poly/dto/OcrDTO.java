package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcrDTO {

    private String filePath;
    // 저장된 이미지 파일의 파일 저장 경로
    // private = 값이 바뀌는걸 막기위해 => 모종의 이유로
    // 변수명이 같다거나 복잡한코드에서

    private String fileName;
    // 저장된 이미지 파일 이름

    private String result;
    // 저장된 이미지로부터 읽은 글씨

}
