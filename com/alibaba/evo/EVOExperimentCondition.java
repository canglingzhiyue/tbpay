package com.alibaba.evo;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class EVOExperimentCondition implements Parcelable {
    public static final Parcelable.Creator<EVOExperimentCondition> CREATOR;
    public static final String NAME_APP_VERSION = "mtop.appVersion";
    public static final String NAME_PLATFORM = "mtop.platform";
    public static final String OPERATOR_EQUALS = "$eq";
    public static final String OPERATOR_GREATER_THAN = "$gt";
    public static final String OPERATOR_GREATER_THAN_OR_EQUALS = "$gte";
    private static final String TAG = "EVOExperimentConditionCriterion";
    private String name;
    private String operator;
    private String value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EVOExperimentCondition(String str, String str2, String str3) {
        this.name = str;
        this.value = str2;
        this.operator = str3;
    }

    protected EVOExperimentCondition(Parcel parcel) {
        this.name = parcel.readString();
        this.value = parcel.readString();
        this.operator = parcel.readString();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.operator);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVOExperimentCondition.writeToParcel", th);
        }
    }

    static {
        kge.a(218253362);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<EVOExperimentCondition>() { // from class: com.alibaba.evo.EVOExperimentCondition.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.alibaba.evo.EVOExperimentCondition, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EVOExperimentCondition createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.alibaba.evo.EVOExperimentCondition[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EVOExperimentCondition[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public EVOExperimentCondition a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (EVOExperimentCondition) ipChange.ipc$dispatch("2b3dfb6e", new Object[]{this, parcel});
                }
                try {
                    return new EVOExperimentCondition(parcel);
                } catch (Throwable th) {
                    com.alibaba.ut.abtest.internal.util.b.a("EVOExperimentCondition.createFromParcel", th);
                    return null;
                }
            }

            public EVOExperimentCondition[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (EVOExperimentCondition[]) ipChange.ipc$dispatch("8017b41d", new Object[]{this, new Integer(i)}) : new EVOExperimentCondition[i];
            }
        };
    }
}
