package com.alibaba.mtl.appmonitor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.appmonitor.pool.a;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class Transaction implements Parcelable {
    public static Parcelable.Creator<Transaction> CREATOR;
    public DimensionValueSet dimensionValues;
    public Integer eventId;
    private Object lock;
    public String module;
    public String monitorPoint;
    public String transactionId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Transaction(Integer num, String str, String str2, DimensionValueSet dimensionValueSet) {
        this.eventId = num;
        this.module = str;
        this.monitorPoint = str2;
        this.transactionId = UUID.randomUUID().toString();
        this.dimensionValues = dimensionValueSet;
        this.lock = new Object();
    }

    public Transaction() {
    }

    public void begin(String str) {
        apr.c();
        if (AnalyticsMgr.f2031a == null) {
            return;
        }
        try {
            AnalyticsMgr.f2031a.transaction_begin(this, str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void end(String str) {
        apr.c();
        if (AnalyticsMgr.f2031a == null) {
            return;
        }
        try {
            AnalyticsMgr.f2031a.transaction_end(this, str);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void addDimensionValues(DimensionValueSet dimensionValueSet) {
        synchronized (this.lock) {
            if (this.dimensionValues == null) {
                this.dimensionValues = dimensionValueSet;
            } else {
                this.dimensionValues.addValues(dimensionValueSet);
            }
        }
    }

    public void addDimensionValues(String str, String str2) {
        synchronized (this.lock) {
            if (this.dimensionValues == null) {
                this.dimensionValues = (DimensionValueSet) a.a().a(DimensionValueSet.class, new Object[0]);
            }
            this.dimensionValues.setValue(str, str2);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dimensionValues, i);
        parcel.writeInt(this.eventId.intValue());
        parcel.writeString(this.module);
        parcel.writeString(this.monitorPoint);
        parcel.writeString(this.transactionId);
    }

    static Transaction readFromParcel(Parcel parcel) {
        Transaction transaction = new Transaction();
        try {
            transaction.dimensionValues = (DimensionValueSet) parcel.readParcelable(Transaction.class.getClassLoader());
            transaction.eventId = Integer.valueOf(parcel.readInt());
            transaction.module = parcel.readString();
            transaction.monitorPoint = parcel.readString();
            transaction.transactionId = parcel.readString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return transaction;
    }

    static {
        kge.a(323112275);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Transaction>() { // from class: com.alibaba.mtl.appmonitor.Transaction.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public Transaction mo223createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Transaction) ipChange.ipc$dispatch("26b8e3fb", new Object[]{this, parcel}) : Transaction.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public Transaction[] mo224newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Transaction[]) ipChange.ipc$dispatch("3743f1e4", new Object[]{this, new Integer(i)}) : new Transaction[i];
            }
        };
    }
}
