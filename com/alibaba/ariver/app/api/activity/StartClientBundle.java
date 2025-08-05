package com.alibaba.ariver.app.api.activity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class StartClientBundle implements Parcelable {
    public static final Parcelable.Creator<StartClientBundle> CREATOR;
    public String appId;
    public String appType;
    public boolean needWaitIpc;
    public Bundle sceneParams;
    public StartAction startAction;
    public Bundle startParams;
    public long startToken;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StartClientBundle() {
    }

    protected StartClientBundle(Parcel parcel) {
        this.appId = parcel.readString();
        this.appType = parcel.readString();
        this.startToken = parcel.readLong();
        this.startAction = StartAction.valueOf(parcel.readString());
        this.needWaitIpc = parcel.readByte() != 0;
        this.startParams = parcel.readBundle(StartClientBundle.class.getClassLoader());
        this.sceneParams = parcel.readBundle(StartClientBundle.class.getClassLoader());
    }

    static {
        kge.a(86861717);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<StartClientBundle>() { // from class: com.alibaba.ariver.app.api.activity.StartClientBundle.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public StartClientBundle mo158createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (StartClientBundle) ipChange.ipc$dispatch("29cf6833", new Object[]{this, parcel}) : new StartClientBundle(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public StartClientBundle[] mo159newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (StartClientBundle[]) ipChange.ipc$dispatch("47ebab2a", new Object[]{this, new Integer(i)}) : new StartClientBundle[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.appType);
        parcel.writeLong(this.startToken);
        parcel.writeString(this.startAction.name());
        parcel.writeByte(this.needWaitIpc ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.startParams);
        parcel.writeBundle(this.sceneParams);
    }

    public String toString() {
        return "StartClientBundle{appId=" + this.appId + ", appType=" + this.appType + ", startToken=" + this.startToken + ", needWaitIpc=" + this.needWaitIpc + ", startAction=" + this.startAction + ", startParams=" + this.startParams + ", sceneParams=" + this.sceneParams + '}';
    }
}
