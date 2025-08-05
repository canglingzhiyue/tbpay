package com.alipay.mobile.common.ipc.api.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class IPCParameter implements Parcelable {
    public static final Parcelable.Creator<IPCParameter> CREATOR = new Parcelable.Creator<IPCParameter>() { // from class: com.alipay.mobile.common.ipc.api.aidl.IPCParameter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public IPCParameter mo557createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCParameter) ipChange.ipc$dispatch("45c84b58", new Object[]{this, parcel}) : new IPCParameter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public IPCParameter[] mo558newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IPCParameter[]) ipChange.ipc$dispatch("9a68c3c1", new Object[]{this, new Integer(i)}) : new IPCParameter[i];
        }
    };
    public static final byte SER_TYPE_PARCELABLE = 2;
    public static final byte SER_TYPE_SERIALIZE = 1;
    private static final String TAG = "IPCParameter";
    public String className;
    public String methodName;
    public String[] paramTypes;
    public List<byte[]> paramValues;
    public Parcelable parcelable;
    public String returnType;
    public byte serType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IPCParameter() {
        this.className = "";
        this.methodName = "";
        this.serType = (byte) 1;
    }

    public IPCParameter(Parcel parcel) {
        this.className = "";
        this.methodName = "";
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        try {
            this.serType = parcel.readByte();
            this.className = parcel.readString();
            this.methodName = parcel.readString();
            this.returnType = parcel.readString();
            this.paramTypes = parcel.createStringArray();
            if (this.paramTypes != null && this.paramTypes.length != 0) {
                if (this.serType == 2) {
                    this.parcelable = parcel.readParcelable(getClass().getClassLoader());
                    return;
                }
                this.paramValues = new ArrayList(this.paramTypes.length);
                for (int i = 0; i < this.paramTypes.length; i++) {
                    this.paramValues.add(parcel.createByteArray());
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "readFromParcel exception occurs", e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.serType);
            parcel.writeString(this.className);
            parcel.writeString(this.methodName);
            parcel.writeString(this.returnType);
            if (this.paramTypes == null || this.paramTypes.length == 0) {
                this.paramTypes = new String[0];
            }
            parcel.writeStringArray(this.paramTypes);
            if (this.serType == 2) {
                parcel.writeParcelable(this.parcelable, i);
                return;
            }
            for (int i2 = 0; i2 < this.paramTypes.length; i2++) {
                parcel.writeByteArray(this.paramValues.get(i2));
            }
        } catch (Exception e) {
            Log.e(TAG, "writeToParcel exception occurs", e);
        }
    }

    public String toString() {
        return "IPCParameter{className='" + this.className + "', methodName='" + this.methodName + "', paramTypes=" + Arrays.toString(this.paramTypes) + '}';
    }
}
