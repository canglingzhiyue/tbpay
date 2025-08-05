package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class EncodeError implements Parcelable {
    public static final Parcelable.Creator<EncodeError> CREATOR;
    public int errorCode;
    public String errorMessage;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EncodeError(int i) {
        this.errorCode = i;
    }

    public EncodeError(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMessage);
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMessage = parcel.readString();
    }

    static {
        kge.a(-2050233018);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<EncodeError>() { // from class: com.taobao.taobao.scancode.encode.aidlservice.EncodeError.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taobao.scancode.encode.aidlservice.EncodeError, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EncodeError createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taobao.scancode.encode.aidlservice.EncodeError[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EncodeError[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public EncodeError[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EncodeError[]) ipChange.ipc$dispatch("a9102d61", new Object[]{this, new Integer(i)}) : new EncodeError[i];
            }

            public EncodeError a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EncodeError) ipChange.ipc$dispatch("1cd35a70", new Object[]{this, parcel}) : new EncodeError(parcel.readInt(), parcel.readString());
            }
        };
    }
}
