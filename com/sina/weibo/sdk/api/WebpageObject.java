package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import tb.kge;

/* loaded from: classes4.dex */
public class WebpageObject extends MediaObject {
    public static final Parcelable.Creator<WebpageObject> CREATOR;
    private static final long serialVersionUID = 7142128794153927442L;
    public String defaultText;

    static {
        kge.a(-1538153095);
        CREATOR = new Parcelable.Creator<WebpageObject>() { // from class: com.sina.weibo.sdk.api.WebpageObject.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public final WebpageObject mo801createFromParcel(Parcel parcel) {
                return new WebpageObject(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public final WebpageObject[] mo802newArray(int i) {
                return new WebpageObject[i];
            }
        };
    }

    public WebpageObject() {
    }

    public WebpageObject(Parcel parcel) {
        super(parcel);
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
