package com.polito.bookingsystem.dto;

import java.util.Date;

public class LectureDto {
    private Integer lectureId;
    private Integer numberOfLesson;
    private CourseDto courseDto;
    private ProfessorDto professorDto;
    private Boolean remotly;
    private Date date;
    private String programDetails;
    private RoomDto roomDto;

    public LectureDto() {
    }

    public LectureDto(Integer lectureId, Integer numberOfLesson, CourseDto courseDto, ProfessorDto professorDto, Boolean remotly,
                      Date date, String programDetails, RoomDto roomDto) {
        super();
        this.lectureId = lectureId;
        this.numberOfLesson = numberOfLesson;
        this.courseDto = courseDto;
        this.professorDto = professorDto;
        this.remotly = remotly;
        this.date = date;
        this.programDetails = programDetails;
        this.roomDto = roomDto;
    }
    public Integer getLectureId() {
        return lectureId;
    }
    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }
    public Integer getNumberOfLesson() {
        return numberOfLesson;
    }
    public void setNumberOfLesson(Integer numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public CourseDto getCourseDto() {
        return courseDto;
    }
    public void setCourseDto(CourseDto courseDto) {
        this.courseDto = courseDto;
    }
    public ProfessorDto getProfessorDto() {
        return professorDto;
    }
    public void setProfessorDto(ProfessorDto professorDto) {
        this.professorDto = professorDto;
    }
    public Boolean getRemotly() {
        return remotly;
    }
    public void setRemotly(Boolean remotly) {
        this.remotly = remotly;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getProgramDetails() {
        return programDetails;
    }
    public void setProgramDetails(String programDetails) {
        this.programDetails = programDetails;
    }

    public RoomDto getRoomDto() {
        return roomDto;
    }

    public void setRoomDto(RoomDto roomDto) {
        this.roomDto = roomDto;
    }




}