package com.alipay.zoloz.hardware.camera.param;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DepthCameraParam extends AbsCameraParam {
    public static final Parcelable.Creator<DepthCameraParam> CREATOR = new Parcelable.Creator<DepthCameraParam>() { // from class: com.alipay.zoloz.hardware.camera.param.DepthCameraParam.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public DepthCameraParam mo608createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DepthCameraParam) ipChange.ipc$dispatch("9f6ab9a", new Object[]{this, parcel}) : new DepthCameraParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public DepthCameraParam[] mo609newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DepthCameraParam[]) ipChange.ipc$dispatch("120e0cd1", new Object[]{this, new Integer(i)}) : new DepthCameraParam[i];
        }
    };
    public int byteOrder;
    public CameraIntrinParam intrinParam;

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DepthCameraParam() {
        this.byteOrder = 0;
    }

    public DepthCameraParam(int i, int i2, int i3, int i4, boolean z, CameraIntrinParam cameraIntrinParam) {
        this(i, i2, i3, i4, z, 0, cameraIntrinParam);
    }

    public DepthCameraParam(int i, int i2, int i3, int i4, boolean z, int i5, CameraIntrinParam cameraIntrinParam) {
        super(i, i2, i3, i4, z);
        this.byteOrder = 0;
        this.byteOrder = i5;
        this.intrinParam = cameraIntrinParam;
    }

    protected DepthCameraParam(Parcel parcel) {
        super(parcel);
        this.byteOrder = 0;
        this.byteOrder = parcel.readInt();
        this.intrinParam = (CameraIntrinParam) parcel.readParcelable(DepthCameraParam.class.getClassLoader());
    }

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.byteOrder);
        parcel.writeParcelable(this.intrinParam, i);
    }

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam
    public String toString() {
        return "DepthCameraParam{" + super.toString() + ", byteOrder=" + this.byteOrder + ", intrinParam=" + this.intrinParam + '}';
    }
}
