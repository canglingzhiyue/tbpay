package com.alipay.zoloz.hardware.camera.param;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class CameraIntrinParam implements Parcelable {
    public static final Parcelable.Creator<CameraIntrinParam> CREATOR = new Parcelable.Creator<CameraIntrinParam>() { // from class: com.alipay.zoloz.hardware.camera.param.CameraIntrinParam.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public CameraIntrinParam mo602createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CameraIntrinParam) ipChange.ipc$dispatch("8bbe0a17", new Object[]{this, parcel}) : new CameraIntrinParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public CameraIntrinParam[] mo603newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CameraIntrinParam[]) ipChange.ipc$dispatch("8692cfc0", new Object[]{this, new Integer(i)}) : new CameraIntrinParam[i];
        }
    };
    public float[] colorIntrin;
    public float[] depthIntrin;
    public float[] extrin;
    public boolean isAligned;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CameraIntrinParam() {
        this.isAligned = true;
    }

    public CameraIntrinParam(float[] fArr, float[] fArr2, float[] fArr3, boolean z) {
        this.isAligned = true;
        this.colorIntrin = fArr;
        this.depthIntrin = fArr2;
        this.extrin = fArr3;
        this.isAligned = z;
    }

    protected CameraIntrinParam(Parcel parcel) {
        boolean z = true;
        this.isAligned = true;
        this.colorIntrin = parcel.createFloatArray();
        this.depthIntrin = parcel.createFloatArray();
        this.extrin = parcel.createFloatArray();
        this.isAligned = parcel.readByte() == 0 ? false : z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.colorIntrin);
        parcel.writeFloatArray(this.depthIntrin);
        parcel.writeFloatArray(this.extrin);
        parcel.writeByte(this.isAligned ? (byte) 1 : (byte) 0);
    }

    public String toString() {
        return "CameraIntrinParam{colorIntrin=" + Arrays.toString(this.colorIntrin) + ", depthIntrin=" + Arrays.toString(this.depthIntrin) + ", extrin=" + Arrays.toString(this.extrin) + ", isAligned=" + this.isAligned + '}';
    }
}
