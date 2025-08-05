package com.huawei.nb.searchmanager.client.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes4.dex */
public class ChangedIndexContent implements Parcelable {
    public static final Parcelable.Creator<ChangedIndexContent> CREATOR = null;

    public ChangedIndexContent(List<IndexData> list, List<IndexData> list2, List<IndexData> list3) {
        throw new RuntimeException("stub");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        throw new RuntimeException("stub");
    }

    public List<IndexData> getDeletedItems() {
        throw new RuntimeException("stub");
    }

    public List<IndexData> getInsertedItems() {
        throw new RuntimeException("stub");
    }

    public List<IndexData> getUpdatedItems() {
        throw new RuntimeException("stub");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        throw new RuntimeException("stub");
    }
}
