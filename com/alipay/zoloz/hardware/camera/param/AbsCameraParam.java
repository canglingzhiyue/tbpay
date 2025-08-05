package com.alipay.zoloz.hardware.camera.param;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AbsCameraParam implements Parcelable {
    public static final int BIG_ENDIAN = 1;
    public static final Parcelable.Creator<AbsCameraParam> CREATOR = new Parcelable.Creator<AbsCameraParam>() { // from class: com.alipay.zoloz.hardware.camera.param.AbsCameraParam.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public AbsCameraParam mo600createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AbsCameraParam) ipChange.ipc$dispatch("bd3213c9", new Object[]{this, parcel}) : new AbsCameraParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public AbsCameraParam[] mo601newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AbsCameraParam[]) ipChange.ipc$dispatch("db4e56c0", new Object[]{this, new Integer(i)}) : new AbsCameraParam[i];
        }
    };
    public static final int LITTLE_ENDIAN = 0;
    public int format;
    public int height;
    public boolean isMirror;
    public int rotate;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AbsCameraParam() {
    }

    public AbsCameraParam(int i, int i2, int i3, int i4, boolean z) {
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.rotate = i4;
        this.isMirror = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsCameraParam(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.format = parcel.readInt();
        this.rotate = parcel.readInt();
        this.isMirror = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.format);
        parcel.writeInt(this.rotate);
        parcel.writeByte(this.isMirror ? (byte) 1 : (byte) 0);
    }

    public String toString() {
        return "CameraParam{width=" + this.width + ", height=" + this.height + ", format=" + this.format + ", rotate=" + this.rotate + ", isMirror=" + this.isMirror + '}';
    }
}
