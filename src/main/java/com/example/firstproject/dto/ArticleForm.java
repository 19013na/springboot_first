package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    private String title;   // 제목 받을 필드
    private String content; // 내용 받을 필드

    // 생성자 : 전송받은 제목과 내용을 필드에 저장한다.
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // toString()메서드 데이터 잘 받았는지 확인 메서드
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
