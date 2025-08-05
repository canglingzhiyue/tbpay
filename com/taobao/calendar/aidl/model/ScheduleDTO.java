package com.taobao.calendar.aidl.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class ScheduleDTO implements Parcelable {
    public static final Parcelable.Creator<ScheduleDTO> CREATOR = new Parcelable.Creator<ScheduleDTO>() { // from class: com.taobao.calendar.aidl.model.ScheduleDTO.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public ScheduleDTO mo1042createFromParcel(Parcel parcel) {
            return new ScheduleDTO(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public ScheduleDTO[] mo1043newArray(int i) {
            return new ScheduleDTO[i];
        }
    };
    private long alartTime;
    private String description;
    private String endTime;
    private String eventId;
    private int isallday;
    private int iseditable;
    private int isrepeat;
    private String link;
    private int remind;
    private int sourceId;
    private String startTime;
    private String title;

    public ScheduleDTO() {
    }

    public ScheduleDTO(Parcel parcel) {
        this.sourceId = parcel.readInt();
        this.eventId = parcel.readString();
        this.startTime = parcel.readString();
        this.endTime = parcel.readString();
        this.remind = parcel.readInt();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.link = parcel.readString();
        this.isallday = parcel.readInt();
        this.isrepeat = parcel.readInt();
        this.iseditable = parcel.readInt();
        this.alartTime = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAlartTime() {
        return this.alartTime;
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

    public int getSourceId() {
        return this.sourceId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAlartTime(long j) {
        this.alartTime = j;
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

    public void setSourceId(int i) {
        this.sourceId = i;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sourceId);
        parcel.writeString(this.eventId);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeInt(this.remind);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.link);
        parcel.writeInt(this.isallday);
        parcel.writeInt(this.isrepeat);
        parcel.writeInt(this.iseditable);
        parcel.writeLong(this.alartTime);
    }
}
