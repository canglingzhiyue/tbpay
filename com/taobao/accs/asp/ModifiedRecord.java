package com.taobao.accs.asp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ModifiedRecord implements Parcelable {
    public static final Parcelable.Creator<ModifiedRecord> CREATOR;
    boolean isClear;
    Bundle modified;
    String name;
    long timestampVersion;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeBundle(this.modified);
        parcel.writeInt(this.isClear ? 1 : 0);
        parcel.writeLong(this.timestampVersion);
    }

    private ModifiedRecord(Parcel parcel) {
        this.name = parcel.readString();
        this.modified = parcel.readBundle(getClass().getClassLoader());
        this.isClear = parcel.readInt() != 1 ? false : true;
        this.timestampVersion = parcel.readLong();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModifiedRecord(String str) {
        this.name = str;
    }

    static {
        kge.a(598538709);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ModifiedRecord>() { // from class: com.taobao.accs.asp.ModifiedRecord.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.accs.asp.ModifiedRecord] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ModifiedRecord createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.accs.asp.ModifiedRecord[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ModifiedRecord[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ModifiedRecord a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ModifiedRecord) ipChange.ipc$dispatch("db77d8ab", new Object[]{this, parcel}) : new ModifiedRecord(parcel);
            }

            public ModifiedRecord[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ModifiedRecord[]) ipChange.ipc$dispatch("67af40da", new Object[]{this, new Integer(i)}) : new ModifiedRecord[i];
            }
        };
    }
}
