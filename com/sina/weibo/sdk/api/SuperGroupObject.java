package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import tb.kge;

/* loaded from: classes4.dex */
public class SuperGroupObject extends MediaObject {
    public static final Parcelable.Creator<SuperGroupObject> CREATOR;
    public String secName;
    public String sgExtParam;
    public String sgName;

    static {
        kge.a(-818649012);
        CREATOR = new Parcelable.Creator<SuperGroupObject>() { // from class: com.sina.weibo.sdk.api.SuperGroupObject.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public final SuperGroupObject mo795createFromParcel(Parcel parcel) {
                return new SuperGroupObject(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public final SuperGroupObject[] mo796newArray(int i) {
                return new SuperGroupObject[i];
            }
        };
    }

    public SuperGroupObject() {
    }

    protected SuperGroupObject(Parcel parcel) {
        this.sgName = parcel.readString();
        this.secName = parcel.readString();
        this.sgExtParam = parcel.readString();
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sgName);
        parcel.writeString(this.secName);
        parcel.writeString(this.sgExtParam);
    }
}
