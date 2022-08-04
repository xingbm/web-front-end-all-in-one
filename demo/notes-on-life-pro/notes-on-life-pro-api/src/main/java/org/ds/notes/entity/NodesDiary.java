package org.ds.notes.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringJoiner;

/**
 * Created by xingbm on 2021/1/2 15:26
 */
@Entity
@Table(name = "nodes_diary", schema = "java_all_in_one")
public class NodesDiary implements Serializable {

    private static final long serialVersionUID = -7313093472109102374L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "diary_date")
    private LocalDate diaryDate;

    @Column(name = "diary_time_begin")
    private LocalTime diaryTimeBegin;

    @Column(name = "diary_time_end")
    private LocalTime diaryTimeEnd;

    @Column(name = "diary_type")
    private String diaryType;

    @Column(name = "diary_content")
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
        return new StringJoiner(", ", NodesDiary.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("diaryDate=" + diaryDate)
                .add("diaryTimeBegin=" + diaryTimeBegin)
                .add("diaryTimeEnd=" + diaryTimeEnd)
                .add("diaryType='" + diaryType + "'")
                .add("diaryContent='" + diaryContent + "'")
                .toString();
    }

}
