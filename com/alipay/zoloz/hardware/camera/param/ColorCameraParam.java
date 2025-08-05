package com.alipay.zoloz.hardware.camera.param;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ColorCameraParam extends AbsCameraParam {
    public static final Parcelable.Creator<ColorCameraParam> CREATOR = new Parcelable.Creator<ColorCameraParam>() { // from class: com.alipay.zoloz.hardware.camera.param.ColorCameraParam.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public ColorCameraParam mo606createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ColorCameraParam) ipChange.ipc$dispatch("95b203a", new Object[]{this, parcel}) : new ColorCameraParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public ColorCameraParam[] mo607newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ColorCameraParam[]) ipChange.ipc$dispatch("11728171", new Object[]{this, new Integer(i)}) : new ColorCameraParam[i];
        }
    };
    public static final int FACE_AE_HARDWARE = 2;
    public static final int FACE_AE_NOT_SUPPORT = 0;
    public static final int FACE_AE_SOFTWARE = 1;
    public int faceAe;

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ColorCameraParam() {
        this.faceAe = 0;
    }

    public ColorCameraParam(int i, int i2, int i3, int i4, boolean z) {
        this(i, i2, i3, i4, z, 0);
    }

    public ColorCameraParam(int i, int i2, int i3, int i4, boolean z, int i5) {
        super(i, i2, i3, i4, z);
        this.faceAe = 0;
        this.faceAe = i5;
    }

    protected ColorCameraParam(Parcel parcel) {
        super(parcel);
        this.faceAe = 0;
        this.faceAe = parcel.readInt();
    }

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.faceAe);
    }

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam
    public String toString() {
        return "ColorCameraParam{" + super.toString() + ", faceAe=" + this.faceAe + '}';
    }
}
