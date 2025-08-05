package com.alibaba.poplayer.layermanager.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class ConfigItem implements Parcelable {
    public static final Parcelable.Creator<ConfigItem> CREATOR;
    public boolean enqueue;
    public boolean exclusive;
    public boolean forcePopRespectingPriority;
    public int level;
    public int priority;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ConfigItem() {
    }

    protected ConfigItem(Parcel parcel) {
        this.level = parcel.readInt();
        this.priority = parcel.readInt();
        boolean z = true;
        this.enqueue = parcel.readByte() != 0;
        this.forcePopRespectingPriority = parcel.readByte() != 0;
        this.exclusive = parcel.readByte() == 0 ? false : z;
    }

    static {
        kge.a(1423706749);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ConfigItem>() { // from class: com.alibaba.poplayer.layermanager.config.ConfigItem.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.poplayer.layermanager.config.ConfigItem] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ConfigItem createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.poplayer.layermanager.config.ConfigItem[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ConfigItem[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ConfigItem a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ConfigItem) ipChange.ipc$dispatch("16274c59", new Object[]{this, parcel}) : new ConfigItem(parcel);
            }

            public ConfigItem[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ConfigItem[]) ipChange.ipc$dispatch("f975680a", new Object[]{this, new Integer(i)}) : new ConfigItem[i];
            }
        };
    }

    public String toString() {
        return "{level=" + this.level + ", priority=" + this.priority + ", enqueue=" + this.enqueue + ", force=" + this.forcePopRespectingPriority + ", exclusive=" + this.exclusive + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.level);
        parcel.writeInt(this.priority);
        parcel.writeByte(this.enqueue ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.forcePopRespectingPriority ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.exclusive ? (byte) 1 : (byte) 0);
    }
}
