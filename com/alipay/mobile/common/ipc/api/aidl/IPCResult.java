package com.alipay.mobile.common.ipc.api.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IPCResult implements Parcelable {
    public static final Parcelable.Creator<IPCResult> CREATOR = new Parcelable.Creator<IPCResult>() { // from class: com.alipay.mobile.common.ipc.api.aidl.IPCResult.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public IPCResult mo559createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCResult) ipChange.ipc$dispatch("a80183d8", new Object[]{this, parcel}) : new IPCResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public IPCResult[] mo560newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCResult[]) ipChange.ipc$dispatch("156d0c0f", new Object[]{this, new Integer(i)}) : new IPCResult[i];
        }
    };
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
            if (TextUtils.isEmpty(this.resultType)) {
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
            LogCatUtil.error(TAG, "writeToParcel exception", e);
        }
    }

    public void readFromParcel(Parcel parcel) {
        try {
            this.serType = parcel.readByte();
            this.resultCode = parcel.readInt();
            this.resultMsg = parcel.readString();
            this.resultType = parcel.readString();
            if (TextUtils.equals(this.resultType, Void.TYPE.getName())) {
                return;
            }
            if (this.serType == 2) {
                this.parcelable = parcel.readParcelable(getClass().getClassLoader());
            } else {
                this.resultValue = parcel.createByteArray();
            }
        } catch (Exception e) {
            LogCatUtil.error(TAG, "readFromParcel exception", e);
        }
    }
}
