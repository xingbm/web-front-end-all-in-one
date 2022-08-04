package org.ds.notes.vo;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringJoiner;

/**
 * Created by xingbm on 2021/1/2 15:26
 */
public class NodesDiaryVO implements Serializable {

    private static final long serialVersionUID = -4068778570318046223L;

    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate diaryDate;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime diaryTimeBegin;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime diaryTimeEnd;

    private String diaryType;

    private String diaryContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDiaryDate() {
        return diaryDate;
    }

    public void setDiaryDate(LocalDate diaryDate) {
        this.diaryDate = diaryDate;
    }

    public LocalTime getDiaryTimeBegin() {
        return diaryTimeBegin;
    }

    public void setDiaryTimeBegin(LocalTime diaryTimeBegin) {
        this.diaryTimeBegin = diaryTimeBegin;
    }

    public LocalTime getDiaryTimeEnd() {
        return diaryTimeEnd;
    }

    public void setDiaryTimeEnd(LocalTime diaryTimeEnd) {
        this.diaryTimeEnd = diaryTimeEnd;
    }

    public String getDiaryType() {
        return diaryType;
    }

    public void setDiaryType(String diaryType) {
        this.diaryType = diaryType;
    }

    public String getDiaryContent() {
        return diaryContent;
    }

    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", NodesDiaryVO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("diaryDate=" + diaryDate)
                .add("diaryTimeBegin=" + diaryTimeBegin)
                .add("diaryTimeEnd=" + diaryTimeEnd)
                .add("diaryType='" + diaryType + "'")
                .add("diaryContent='" + diaryContent + "'")
                .toString();
    }

}
