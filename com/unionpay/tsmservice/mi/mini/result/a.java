package com.unionpay.tsmservice.mi.mini.result;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public final QueryVendorPayStatusResult createFromParcel(Parcel parcel) {
        return new QueryVendorPayStatusResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public final QueryVendorPayStatusResult[] newArray(int i) {
        return new QueryVendorPayStatusResult[i];
    }
}
