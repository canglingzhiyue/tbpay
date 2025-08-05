package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public final class ResultRecord implements Parcelable {
    public static final Parcelable.Creator<ResultRecord> CREATOR;
    public int requestCode;
    public Bundle resultBundle;
    public int resultCode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ResultRecord() {
        this.resultCode = 0;
    }

    protected ResultRecord(Parcel parcel) {
        this.resultCode = 0;
        this.requestCode = parcel.readInt();
        this.resultCode = parcel.readInt();
        this.resultBundle = parcel.readBundle(getClass().getClassLoader());
    }

    static {
        kge.a(-1031276538);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ResultRecord>() { // from class: com.taobao.tao.tbmainfragment.ResultRecord.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.tbmainfragment.ResultRecord, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ResultRecord createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.tao.tbmainfragment.ResultRecord[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ResultRecord[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ResultRecord a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ResultRecord) ipChange.ipc$dispatch("b0912b9a", new Object[]{this, parcel}) : new ResultRecord(parcel);
            }

            public ResultRecord[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ResultRecord[]) ipChange.ipc$dispatch("1b70f4c9", new Object[]{this, new Integer(i)}) : new ResultRecord[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.resultCode);
        parcel.writeBundle(this.resultBundle);
    }
}
