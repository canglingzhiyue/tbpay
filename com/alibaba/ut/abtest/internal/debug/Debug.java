package com.alibaba.ut.abtest.internal.debug;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class Debug implements Parcelable {
    public static final Parcelable.Creator<Debug> CREATOR;
    private static final String TAG = "Debug";
    @JSONField(name = "debug_key")
    public String debugKey;
    @JSONField(name = "debug_sampling_option")
    public String debugSamplingOption;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.debugKey);
            parcel.writeString(this.debugSamplingOption);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("Debug.writeToParcel", th);
        }
    }

    static {
        kge.a(-1089117838);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Debug>() { // from class: com.alibaba.ut.abtest.internal.debug.Debug.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.ut.abtest.internal.debug.Debug, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Debug createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.ut.abtest.internal.debug.Debug[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Debug[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public Debug a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Debug) ipChange.ipc$dispatch("45b0efae", new Object[]{this, parcel});
                }
                Debug debug = new Debug();
                debug.debugKey = parcel.readString();
                debug.debugSamplingOption = parcel.readString();
                return debug;
            }

            public Debug[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Debug[]) ipChange.ipc$dispatch("b090b8dd", new Object[]{this, new Integer(i)}) : new Debug[i];
            }
        };
    }
}
