package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class IPCResult implements Parcelable {
    public static final Parcelable.Creator<IPCResult> CREATOR;
    public static final byte SER_TYPE_PARCELABLE = 2;
    public static final byte SER_TYPE_SERIALIZE = 1;
    private static final String TAG = "IPCResult";
    public Parcelable parcelable;
    public int resultCode;
    public String resultMsg;
    public String resultType;
    public byte[] resultValue;
    public byte serType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IPCResult() {
        this.resultCode = 0;
        this.resultMsg = "";
        this.serType = (byte) 1;
    }

    public IPCResult(Parcel parcel) {
        this.resultCode = 0;
        this.resultMsg = "";
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.serType);
            parcel.writeInt(this.resultCode);
            parcel.writeString(this.resultMsg);
            if (StringUtils.isEmpty(this.resultType)) {
                this.resultType = Void.TYPE.getName();
                parcel.writeString(this.resultType);
                return;
            }
            parcel.writeString(this.resultType);
            if (this.serType == 2) {
                parcel.writeParcelable(this.parcelable, i);
                return;
            }
            if (this.resultValue == null) {
                this.resultValue = new byte[0];
            }
            parcel.writeByteArray(this.resultValue);
        } catch (Exception e) {
            RVLogger.e(TAG, "writeToParcel exception", e);
        }
    }

    public void readFromParcel(Parcel parcel) {
        try {
            this.serType = parcel.readByte();
            this.resultCode = parcel.readInt();
            this.resultMsg = parcel.readString();
            this.resultType = parcel.readString();
            if (StringUtils.equals(this.resultType, Void.TYPE.getName())) {
                return;
            }
            if (this.serType == 2) {
                this.parcelable = parcel.readParcelable(getClass().getClassLoader());
            } else {
                this.resultValue = parcel.createByteArray();
            }
        } catch (Exception e) {
            RVLogger.e(TAG, "readFromParcel exception", e);
        }
    }

    static {
        kge.a(-1146980964);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<IPCResult>() { // from class: com.alibaba.ariver.kernel.ipc.uniform.IPCResult.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public IPCResult mo178createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (IPCResult) ipChange.ipc$dispatch("7eab90cc", new Object[]{this, parcel}) : new IPCResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public IPCResult[] mo179newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (IPCResult[]) ipChange.ipc$dispatch("ec171903", new Object[]{this, new Integer(i)}) : new IPCResult[i];
            }
        };
    }
}
