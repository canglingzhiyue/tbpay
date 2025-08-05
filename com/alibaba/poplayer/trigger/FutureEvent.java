package com.alibaba.poplayer.trigger;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class FutureEvent implements Parcelable, Serializable {
    public static final Parcelable.Creator<FutureEvent> CREATOR;
    private String param;
    private long popEndTimeStamp;
    private String popPageParamContains;
    private String[] popPageUris;
    private String uri;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FutureEvent(String str, String str2, String[] strArr, String str3, long j) {
        this.uri = str;
        this.param = str2;
        this.popPageUris = strArr;
        this.popPageParamContains = str3;
        this.popEndTimeStamp = j;
    }

    public String getUri() {
        return this.uri;
    }

    public String getParam() {
        return this.param;
    }

    public String[] getPopPageUris() {
        return this.popPageUris;
    }

    public String getPopPageParamContains() {
        return this.popPageParamContains;
    }

    public long getPopEndTimeStamp() {
        return this.popEndTimeStamp;
    }

    protected FutureEvent(Parcel parcel) {
        this.uri = parcel.readString();
        this.param = parcel.readString();
        this.popPageUris = parcel.createStringArray();
        this.popPageParamContains = parcel.readString();
        this.popEndTimeStamp = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (obj instanceof FutureEvent) {
            FutureEvent futureEvent = (FutureEvent) obj;
            if (!TextUtils.isEmpty(this.uri) && !TextUtils.isEmpty(this.param)) {
                return this.uri.equals(futureEvent.uri) && this.param.equals(futureEvent.param);
            }
        }
        return super.equals(obj);
    }

    static {
        kge.a(1247229778);
        kge.a(1028243835);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<FutureEvent>() { // from class: com.alibaba.poplayer.trigger.FutureEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.poplayer.trigger.FutureEvent] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FutureEvent createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.poplayer.trigger.FutureEvent[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FutureEvent[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public FutureEvent a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FutureEvent) ipChange.ipc$dispatch("77ac3b0e", new Object[]{this, parcel}) : new FutureEvent(parcel);
            }

            public FutureEvent[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (FutureEvent[]) ipChange.ipc$dispatch("fcfa83fd", new Object[]{this, new Integer(i)}) : new FutureEvent[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.param);
        parcel.writeStringArray(this.popPageUris);
        parcel.writeString(this.popPageParamContains);
        parcel.writeLong(this.popEndTimeStamp);
    }
}
