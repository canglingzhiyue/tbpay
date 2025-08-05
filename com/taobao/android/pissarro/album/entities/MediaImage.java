package com.taobao.android.pissarro.album.entities;

import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ici;
import tb.kge;

/* loaded from: classes6.dex */
public class MediaImage implements Parcelable {
    public static final Parcelable.Creator<MediaImage> CREATOR;
    private String displayName;
    private String id;
    private boolean isEdited;
    private String mimeType;
    private String path;
    private int sequence;
    private long size;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaImage() {
    }

    public MediaImage(String str, String str2, long j, String str3, String str4) {
        this.displayName = str3;
        this.id = str;
        this.path = str2;
        this.size = j;
        this.mimeType = str4;
    }

    public static MediaImage valueOf(Cursor cursor) {
        String string;
        String string2 = cursor.getString(cursor.getColumnIndex("_id"));
        if (ici.a()) {
            string = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, string2).toString();
        } else {
            string = cursor.getString(cursor.getColumnIndex("_data"));
        }
        return new MediaImage(string2, string, cursor.getLong(cursor.getColumnIndex("_size")), cursor.getString(cursor.getColumnIndex("_display_name")), cursor.getString(cursor.getColumnIndex("mime_type")));
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public boolean isEdited() {
        return this.isEdited;
    }

    public void setEdited(boolean z) {
        this.isEdited = z;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MediaImage mediaImage = (MediaImage) obj;
            String str = this.id;
            if (str != null) {
                return str.equals(mediaImage.id);
            }
            if (mediaImage.id == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.path);
        parcel.writeLong(this.size);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.isEdited ? 1 : 0);
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.sequence);
    }

    static {
        kge.a(-936324816);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MediaImage>() { // from class: com.taobao.android.pissarro.album.entities.MediaImage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.pissarro.album.entities.MediaImage] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MediaImage createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.pissarro.album.entities.MediaImage[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MediaImage[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MediaImage a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    return (MediaImage) ipChange.ipc$dispatch("35058946", new Object[]{this, parcel});
                }
                MediaImage mediaImage = new MediaImage();
                mediaImage.id = parcel.readString();
                mediaImage.path = parcel.readString();
                mediaImage.size = parcel.readLong();
                mediaImage.displayName = parcel.readString();
                if (parcel.readInt() == 1) {
                    z = true;
                }
                mediaImage.isEdited = z;
                mediaImage.mimeType = parcel.readString();
                mediaImage.sequence = parcel.readInt();
                return mediaImage;
            }

            public MediaImage[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MediaImage[]) ipChange.ipc$dispatch("7d3b7cb7", new Object[]{this, new Integer(i)}) : new MediaImage[i];
            }
        };
    }
}
