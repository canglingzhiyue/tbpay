package com.alibaba.ut.abtest.internal.bucketing;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class DefaultVariationSet implements VariationSet {
    public static final Parcelable.Creator<DefaultVariationSet> CREATOR;
    private static final String TAG = "DefaultVariationSet";
    private long experimentGroupId;
    private long experimentId;
    private long experimentReleaseId;
    private Map<String, Variation> variations;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected DefaultVariationSet(Parcel parcel) {
        this.experimentId = parcel.readLong();
        this.experimentReleaseId = parcel.readLong();
        this.experimentGroupId = parcel.readLong();
        this.variations = parcel.readHashMap(DefaultVariationSet.class.getClassLoader());
    }

    public DefaultVariationSet(com.alibaba.ut.abtest.internal.bucketing.model.b bVar) {
        this.experimentId = bVar.c();
        this.experimentReleaseId = bVar.b();
        this.experimentGroupId = bVar.d();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : bVar.g().entrySet()) {
            hashMap.put(entry.getKey(), new DefaultVariation(entry.getKey(), entry.getValue()));
        }
        this.variations = Collections.unmodifiableMap(hashMap);
    }

    public DefaultVariationSet(com.alibaba.ut.abtest.internal.bucketing.model.a aVar) {
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            if (aVar.c() != null && !aVar.c().isEmpty()) {
                ExperimentV5 experimentV5 = aVar.c().get(0);
                this.experimentId = experimentV5.getId();
                this.experimentReleaseId = experimentV5.getReleaseId();
                this.experimentGroupId = experimentV5.getGroups().get(0).getId();
            }
            if (aVar.a() != null) {
                for (Map.Entry<String, String> entry : aVar.a().entrySet()) {
                    hashMap.put(entry.getKey(), new DefaultVariation(entry.getKey(), entry.getValue()));
                }
            }
        }
        this.variations = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    @Deprecated
    public long getExperimentBucketId() {
        return this.experimentGroupId;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public long getExperimentId() {
        return this.experimentId;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public long getExperimentReleaseId() {
        return this.experimentReleaseId;
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public Variation getVariation(String str) {
        return this.variations.get(str);
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public boolean contains(String str) {
        return this.variations.containsKey(str);
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public Iterator<Variation> iterator() {
        return this.variations.values().iterator();
    }

    @Override // com.alibaba.ut.abtest.VariationSet
    public int size() {
        return this.variations.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeLong(this.experimentId);
            parcel.writeLong(this.experimentReleaseId);
            parcel.writeLong(this.experimentGroupId);
            parcel.writeMap(this.variations);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("DefaultVariationSet.writeToParcel", th);
        }
    }

    static {
        kge.a(1800617076);
        kge.a(1844752572);
        CREATOR = new Parcelable.Creator<DefaultVariationSet>() { // from class: com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DefaultVariationSet createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ DefaultVariationSet[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public DefaultVariationSet a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (DefaultVariationSet) ipChange.ipc$dispatch("be7af5ac", new Object[]{this, parcel});
                }
                try {
                    return new DefaultVariationSet(parcel);
                } catch (Throwable th) {
                    com.alibaba.ut.abtest.internal.util.b.a("DefaultVariationSet.createFromParcel", th);
                    return null;
                }
            }

            public DefaultVariationSet[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultVariationSet[]) ipChange.ipc$dispatch("58a2711b", new Object[]{this, new Integer(i)}) : new DefaultVariationSet[i];
            }
        };
    }

    public String toString() {
        return "DefaultVariationSet{experimentId=" + this.experimentId + ", experimentReleaseId=" + this.experimentReleaseId + ", experimentGroupId=" + this.experimentGroupId + '}';
    }
}
