package Models;

import java.util.Date;

/**
 * Created by _red_ on 08.06.17.
 */
public class Lesson {
    private String name;
    private Date startTime;
    private Date endTime;
    private Integer lectureRoom;
    private String description;
    private Subject subject;
    private String lector;
    private Long groupID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (!startTime.equals(lesson.startTime)) return false;
        if (!endTime.equals(lesson.endTime)) return false;
        return groupID.equals(lesson.groupID);
    }

    @Override
    public int hashCode() {
        int result = startTime.hashCode() + endTime.hashCode();
        result = 21 * result + 42 * groupID.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStarTime() {
        return startTime;
    }

    public void setTime(Date time) {
        this.startTime = time;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date time) {
        this.endTime = time;
    }

    public Integer getLectureRoom() {
        return lectureRoom;
    }

    public void setLectureRoom(Integer lectureRoom) {
        this.lectureRoom = lectureRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }
}
