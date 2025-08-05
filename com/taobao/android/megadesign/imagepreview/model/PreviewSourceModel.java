package com.taobao.android.megadesign.imagepreview.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class PreviewSourceModel implements Parcelable {
    public static final Parcelable.Creator<PreviewSourceModel> CREATOR = new Parcelable.Creator<PreviewSourceModel>() { // from class: com.taobao.android.megadesign.imagepreview.model.PreviewSourceModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.megadesign.imagepreview.model.PreviewSourceModel] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PreviewSourceModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.megadesign.imagepreview.model.PreviewSourceModel[]] */
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PreviewSourceModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
        }

        public PreviewSourceModel a(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PreviewSourceModel) ipChange.ipc$dispatch("6a2f0154", new Object[]{this, parcel}) : new PreviewSourceModel(parcel);
        }

        public PreviewSourceModel[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PreviewSourceModel[]) ipChange.ipc$dispatch("a1599b05", new Object[]{this, new Integer(i)}) : new PreviewSourceModel[i];
        }
    };
    private String pictureURL;
    private String type;
    private String videoURL;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PreviewSourceModel(String str, String str2, String str3) {
        this.type = str;
        this.pictureURL = str2;
        this.videoURL = str3;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getPictureURL() {
        return this.pictureURL;
    }

    public void setPictureURL(String str) {
        this.pictureURL = str;
    }

    public String getVideoURL() {
        return this.videoURL;
    }

    public void setVideoURL(String str) {
        this.videoURL = str;
    }

    protected PreviewSourceModel(Parcel parcel) {
        this.type = parcel.readString();
        this.pictureURL = parcel.readString();
        this.videoURL = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.pictureURL);
        parcel.writeString(this.videoURL);
    }
}
