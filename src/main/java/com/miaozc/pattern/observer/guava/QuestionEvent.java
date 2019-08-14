package com.miaozc.pattern.observer.guava;

/**
 * 事件
 * Created by Tom on 2019/3/17.
 */
public class QuestionEvent {

    private String userName;
    private String content;
    private String gPerName;

    public String getgPerName() {
        return gPerName;
    }

    public void setgPerName(String gPerName) {
        this.gPerName = gPerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
