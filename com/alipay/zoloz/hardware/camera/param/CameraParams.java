package com.alipay.zoloz.hardware.camera.param;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CameraParams implements Parcelable {
    public static final Parcelable.Creator<CameraParams> CREATOR = new Parcelable.Creator<CameraParams>() { // from class: com.alipay.zoloz.hardware.camera.param.CameraParams.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public CameraParams mo604createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CameraParams) ipChange.ipc$dispatch("3fee9af4", new Object[]{this, parcel}) : new CameraParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public CameraParams[] mo605newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CameraParams[]) ipChange.ipc$dispatch("7f5d2fab", new Object[]{this, new Integer(i)}) : new CameraParams[i];
        }
    };
    public String cameraSN;
    public ColorCameraParam colorParam;
    public DepthCameraParam depthParam;
    public String firmwareVersion;
    public String name;
    public SlirCameraParam slirParam;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected CameraParams(Parcel parcel) {
        this.name = parcel.readString();
        this.colorParam = (ColorCameraParam) parcel.readParcelable(AbsCameraParam.class.getClassLoader());
        this.depthParam = (DepthCameraParam) parcel.readParcelable(AbsCameraParam.class.getClassLoader());
        this.slirParam = (SlirCameraParam) parcel.readParcelable(AbsCameraParam.class.getClassLoader());
        this.cameraSN = parcel.readString();
        this.firmwareVersion = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.colorParam, i);
        parcel.writeParcelable(this.depthParam, i);
        parcel.writeParcelable(this.slirParam, i);
        parcel.writeString(this.cameraSN);
        parcel.writeString(this.firmwareVersion);
    }

    public String toString() {
        return "CameraParams{name=" + this.name + ", colorParam=" + this.colorParam + ", depthParam=" + this.depthParam + ", slirParam=" + this.slirParam + ", cameraSN='" + this.cameraSN + "', firmwareVersion='" + this.firmwareVersion + "'}";
    }
}
