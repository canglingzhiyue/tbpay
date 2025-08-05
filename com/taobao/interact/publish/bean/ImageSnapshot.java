package com.taobao.interact.publish.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.riy;

/* loaded from: classes7.dex */
public class ImageSnapshot implements Parcelable, Comparable<ImageSnapshot> {
    public static final Parcelable.Creator<ImageSnapshot> CREATOR = new Parcelable.Creator<ImageSnapshot>() { // from class: com.taobao.interact.publish.bean.ImageSnapshot.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.interact.publish.bean.ImageSnapshot, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImageSnapshot createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.interact.publish.bean.ImageSnapshot[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImageSnapshot[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
        }

        public ImageSnapshot[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageSnapshot[]) ipChange.ipc$dispatch("1da0e969", new Object[]{this, new Integer(i)}) : new ImageSnapshot[i];
        }

        public ImageSnapshot a(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageSnapshot) ipChange.ipc$dispatch("27374fba", new Object[]{this, parcel});
            }
            ImageSnapshot imageSnapshot = new ImageSnapshot();
            imageSnapshot.path = parcel.readString();
            imageSnapshot.thumbnails = parcel.readString();
            imageSnapshot.imageId = parcel.readLong();
            imageSnapshot.stickerIds = parcel.readArrayList(Long.class.getClassLoader());
            return imageSnapshot;
        }
    };
    private long imageId;
    private boolean isJumpCameraActivity;
    private String path;
    private int sequence;
    private ArrayList<Long> stickerIds;
    private String thumbnails;
    private long time;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ImageSnapshot() {
    }

    public ImageSnapshot(String str, long j) {
        this.path = str;
        this.imageId = j;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getThumbnails() {
        return this.thumbnails;
    }

    public void setThumbnails(String str) {
        this.thumbnails = str;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public long getImageId() {
        return this.imageId;
    }

    public void setImageId(long j) {
        this.imageId = j;
    }

    public boolean isJumpCameraActivity() {
        return this.isJumpCameraActivity;
    }

    public void setJumpCameraActivity(boolean z) {
        this.isJumpCameraActivity = z;
    }

    public ArrayList<Long> getStickerIds() {
        return this.stickerIds;
    }

    public void setStickerIds(ArrayList<Long> arrayList) {
        this.stickerIds = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.thumbnails);
        parcel.writeLong(this.imageId);
        parcel.writeList(this.stickerIds);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageSnapshot) {
            return this.path.equals(((ImageSnapshot) obj).path);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return "ImageSnapshot [path=" + this.path + ", thumbnails=" + this.thumbnails + ", imageId=" + this.imageId + ", sequence=" + this.sequence + riy.ARRAY_END_STR;
    }

    @Override // java.lang.Comparable
    public int compareTo(ImageSnapshot imageSnapshot) {
        return this.sequence - imageSnapshot.sequence;
    }
}
