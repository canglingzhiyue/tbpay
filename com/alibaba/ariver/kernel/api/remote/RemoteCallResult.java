package com.alibaba.ariver.kernel.api.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class RemoteCallResult implements Parcelable {
    public static final Parcelable.Creator<RemoteCallResult> CREATOR;
    private boolean isError;
    private Object value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RemoteCallResult(Object obj) {
        this.isError = false;
        if (obj instanceof Throwable) {
            this.isError = true;
        }
        this.value = obj;
    }

    protected RemoteCallResult(Parcel parcel) {
        boolean z = false;
        this.isError = false;
        this.isError = parcel.readByte() != 0 ? true : z;
        this.value = parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isError ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.value);
    }

    public boolean isError() {
        return this.isError;
    }

    public Object getValue() {
        return this.value;
    }

    static {
        kge.a(-935289274);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<RemoteCallResult>() { // from class: com.alibaba.ariver.kernel.api.remote.RemoteCallResult.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public RemoteCallResult mo170createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RemoteCallResult) ipChange.ipc$dispatch("c92307a2", new Object[]{this, parcel}) : new RemoteCallResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public RemoteCallResult[] mo171newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RemoteCallResult[]) ipChange.ipc$dispatch("e73f4a99", new Object[]{this, new Integer(i)}) : new RemoteCallResult[i];
            }
        };
    }
}
