package com.alipay.zoloz.hardware.camera.param;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SlirCameraParam extends AbsCameraParam {
    public static final Parcelable.Creator<SlirCameraParam> CREATOR = new Parcelable.Creator<SlirCameraParam>() { // from class: com.alipay.zoloz.hardware.camera.param.SlirCameraParam.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public SlirCameraParam mo610createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SlirCameraParam) ipChange.ipc$dispatch("c3e42651", new Object[]{this, parcel}) : new SlirCameraParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public SlirCameraParam[] mo611newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SlirCameraParam[]) ipChange.ipc$dispatch("6950423a", new Object[]{this, new Integer(i)}) : new SlirCameraParam[i];
        }
    };
    public int byteOrder;
    public String pattern;

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SlirCameraParam() {
        this.byteOrder = 0;
    }

    public SlirCameraParam(int i, int i2, int i3, int i4, boolean z, String str) {
        this(i, i2, i3, i4, z, 0, str);
    }

    public SlirCameraParam(int i, int i2, int i3, int i4, boolean z, int i5, String str) {
        super(i, i2, i3, i4, z);
        this.byteOrder = 0;
        this.byteOrder = i5;
        this.pattern = str;
    }

    protected SlirCameraParam(Parcel parcel) {
        super(parcel);
        this.byteOrder = 0;
        this.byteOrder = parcel.readInt();
        this.pattern = parcel.readString();
    }

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.byteOrder);
        parcel.writeString(this.pattern);
    }

    @Override // com.alipay.zoloz.hardware.camera.param.AbsCameraParam
    public String toString() {
        return "SlirCameraParam{" + super.toString() + ", byteOrder=" + this.byteOrder + ", type='" + this.pattern + "'}";
    }
}
