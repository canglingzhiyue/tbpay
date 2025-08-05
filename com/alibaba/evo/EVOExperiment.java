package com.alibaba.evo;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class EVOExperiment implements Parcelable {
    public static final Parcelable.Creator<EVOExperiment> CREATOR;
    private static final String TAG = "EVOExperiment";
    private EVOExperimentConditions conditions;
    private long id;
    private String key;
    private String namespace;
    private long releaseId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EVOExperiment(long j, long j2, String str, String str2, EVOExperimentConditions eVOExperimentConditions) {
        this.id = j;
        this.releaseId = j2;
        this.namespace = str;
        this.key = str2;
        this.conditions = eVOExperimentConditions;
    }

    protected EVOExperiment(Parcel parcel) {
        this.id = parcel.readLong();
        this.releaseId = parcel.readLong();
        this.namespace = parcel.readString();
        this.key = parcel.readString();
        this.conditions = (EVOExperimentConditions) parcel.readParcelable(EVOExperiment.class.getClassLoader());
    }

    public long getId() {
        return this.id;
    }

    public long getReleaseId() {
        return this.releaseId;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getKey() {
        return this.key;
    }

    public EVOExperimentConditions getConditions() {
        return this.conditions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeLong(this.id);
            parcel.writeLong(this.releaseId);
            parcel.writeString(this.namespace);
            parcel.writeString(this.key);
            parcel.writeParcelable(this.conditions, i);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVOExperiment.writeToParcel", th);
        }
    }

    static {
        kge.a(1796897513);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<EVOExperiment>() { // from class: com.alibaba.evo.EVOExperiment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.evo.EVOExperiment] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EVOExperiment createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.evo.EVOExperiment[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EVOExperiment[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public EVOExperiment a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (EVOExperiment) ipChange.ipc$dispatch("effe57ad", new Object[]{this, parcel});
                }
                try {
                    return new EVOExperiment(parcel);
                } catch (Throwable th) {
                    com.alibaba.ut.abtest.internal.util.b.a("EVOExperiment.createFromParcel", th);
                    return null;
                }
            }

            public EVOExperiment[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EVOExperiment[]) ipChange.ipc$dispatch("93e44e1e", new Object[]{this, new Integer(i)}) : new EVOExperiment[i];
            }
        };
    }
}
