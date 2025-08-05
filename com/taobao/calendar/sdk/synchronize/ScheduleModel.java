package com.taobao.calendar.sdk.synchronize;

import java.io.Serializable;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class ScheduleModel implements Serializable {
    private String alarmTime;
    private int deleted;
    private String description;
    private String endTime;
    private String eventId;
    private int isallday;
    private int iseditable;
    private int isrepeat;
    private String link;
    private int remind;
    private String repeat;
    private int sourceId;
    private String startTime;
    private String thedate;
    private String title;
    private String uid;
    private String userId;

    static {
        kge.a(-2024052864);
        kge.a(1028243835);
    }

    public String getAlarmTime() {
        return this.alarmTime;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getEventId() {
        return this.eventId;
    }

    public int getIsallday() {
        return this.isallday;
    }

    public int getIseditable() {
        return this.iseditable;
    }

    public int getIsrepeat() {
        return this.isrepeat;
    }

    public String getLink() {
        return this.link;
    }

    public int getRemind() {
        return this.remind;
    }

    public String getRepeat() {
        return this.repeat;
    }

    public int getSourceId() {
        return this.sourceId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getThedate() {
        return this.thedate;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setAlarmTime(String str) {
        this.alarmTime = str;
    }

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setIsallday(int i) {
        this.isallday = i;
    }

    public void setIseditable(int i) {
        this.iseditable = i;
    }

    public void setIsrepeat(int i) {
        this.isrepeat = i;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setRemind(int i) {
        this.remind = i;
    }

    public void setRepeat(String str) {
        this.repeat = str;
    }

    public void setSourceId(int i) {
        this.sourceId = i;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setThedate(String str) {
        this.thedate = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "ScheduleModel [uid=" + this.uid + ", userId=" + this.userId + ", sourceId=" + this.sourceId + ", eventId=" + this.eventId + ", thedate=" + this.thedate + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", alarmTime=" + this.alarmTime + ", remind=" + this.remind + ", title=" + this.title + ", description=" + this.description + ", link=" + this.link + ", isallday=" + this.isallday + ", isrepeat=" + this.isrepeat + ", repeat=" + this.repeat + ", deleted=" + this.deleted + ", iseditable=" + this.iseditable + riy.ARRAY_END_STR;
    }
}
