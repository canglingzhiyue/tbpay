package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import tb.kge;

/* loaded from: classes4.dex */
public class TextObject extends MediaObject {
    public static final Parcelable.Creator<TextObject> CREATOR;
    private static final long serialVersionUID = -5610314414793811821L;
    public String text;

    static {
        kge.a(666091957);
        CREATOR = new Parcelable.Creator<TextObject>() { // from class: com.sina.weibo.sdk.api.TextObject.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public final TextObject mo797createFromParcel(Parcel parcel) {
                return new TextObject(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public final TextObject[] mo798newArray(int i) {
                return new TextObject[i];
            }
        };
    }

    public TextObject() {
    }

    protected TextObject(Parcel parcel) {
        this.text = parcel.readString();
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
