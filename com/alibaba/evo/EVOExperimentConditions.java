package com.alibaba.evo;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class EVOExperimentConditions implements Parcelable {
    public static final Parcelable.Creator<EVOExperimentConditions> CREATOR;
    private static final String TAG = "EVOExperimentCondition";
    private ArrayList<EVOExperimentCondition> conditions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EVOExperimentConditions(ArrayList<EVOExperimentCondition> arrayList) {
        this.conditions = arrayList;
    }

    protected EVOExperimentConditions(Parcel parcel) {
        this.conditions = parcel.readArrayList(EVOExperimentConditions.class.getClassLoader());
    }

    public ArrayList<EVOExperimentCondition> getConditions() {
        return this.conditions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeList(this.conditions);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVOExperimentConditions.writeToParcel", th);
        }
    }

    static {
        kge.a(-1824080255);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<EVOExperimentConditions>() { // from class: com.alibaba.evo.EVOExperimentConditions.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.evo.EVOExperimentConditions, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EVOExperimentConditions createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.evo.EVOExperimentConditions[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EVOExperimentConditions[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public EVOExperimentConditions a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (EVOExperimentConditions) ipChange.ipc$dispatch("3c817955", new Object[]{this, parcel});
                }
                try {
                    return new EVOExperimentConditions(parcel);
                } catch (Throwable th) {
                    com.alibaba.ut.abtest.internal.util.b.a("EVOExperimentConditions.createFromParcel", th);
                    return null;
                }
            }

            public EVOExperimentConditions[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EVOExperimentConditions[]) ipChange.ipc$dispatch("82ded686", new Object[]{this, new Integer(i)}) : new EVOExperimentConditions[i];
            }
        };
    }
}
