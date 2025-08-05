package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class Image implements Parcelable, Comparable<Image> {
    public static final Parcelable.Creator<Image> CREATOR;
    private String coverPath;
    private String coverUrl;
    private int duration;
    private String fileId;
    private int height;
    private String mediaType;
    private String path;
    private String resourceUrl;
    private int sequence;
    private int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.resourceUrl);
        parcel.writeString(this.coverPath);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.mediaType);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.sequence);
        parcel.writeString(this.fileId);
    }

    static {
        kge.a(1113172027);
        kge.a(1630535278);
        kge.a(415966670);
        CREATOR = new Parcelable.Creator<Image>() { // from class: com.taobao.interact.publish.service.Image.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.interact.publish.service.Image] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Image createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.interact.publish.service.Image[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Image[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public Image a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Image) ipChange.ipc$dispatch("754fd41b", new Object[]{this, parcel});
                }
                Image image = new Image();
                image.setPath(parcel.readString());
                image.setResourceUrl(parcel.readString());
                image.setCoverPath(parcel.readString());
                image.setCoverUrl(parcel.readString());
                image.setMediaType(parcel.readString());
                image.setWidth(parcel.readInt());
                image.setHeight(parcel.readInt());
                image.setDuration(parcel.readInt());
                image.setSequence(parcel.readInt());
                image.setFileId(parcel.readString());
                return image;
            }

            public Image[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Image[]) ipChange.ipc$dispatch("99caa90c", new Object[]{this, new Integer(i)}) : new Image[i];
            }
        };
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public String getCoverPath() {
        return this.coverPath;
    }

    public void setCoverPath(String str) {
        this.coverPath = str;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String getThumbPath() {
        String str = this.coverPath;
        return str == null ? this.path : str;
    }

    public String getImagePath() {
        return this.path;
    }

    public String toString() {
        return "Image{path='" + this.path + "', resourceUrl='" + this.resourceUrl + "', coverPath='" + this.coverPath + "', coverUrl='" + this.coverUrl + "', width=" + this.width + ", height=" + this.height + ", mediaType='" + this.mediaType + "', duration=" + this.duration + ", fileId=" + this.fileId + ", sequence=" + this.sequence + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(Image image) {
        return this.sequence - image.sequence;
    }
}
