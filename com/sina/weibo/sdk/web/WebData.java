package com.sina.weibo.sdk.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes4.dex */
public class WebData implements Parcelable, Serializable {
    public static final Parcelable.Creator<WebData> CREATOR;
    private static final long serialVersionUID = -4038177938155795889L;
    protected AuthInfo av;
    protected String aw;
    protected String i;
    protected int type;

    static {
        kge.a(1717676559);
        kge.a(1630535278);
        kge.a(1028243835);
        CREATOR = new Parcelable.Creator<WebData>() { // from class: com.sina.weibo.sdk.web.WebData.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ WebData createFromParcel(Parcel parcel) {
                return new WebData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ WebData[] newArray(int i) {
                return new WebData[i];
            }
        };
    }

    protected WebData(Parcel parcel) {
        this.av = (AuthInfo) parcel.readParcelable(AuthInfo.class.getClassLoader());
        this.type = parcel.readInt();
        this.i = parcel.readString();
        this.aw = parcel.readString();
    }

    public WebData(AuthInfo authInfo, int i, String str, String str2) {
        this.av = authInfo;
        this.type = i;
        this.i = str;
        this.aw = str2;
    }

    public final AuthInfo a() {
        return this.av;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.i;
    }

    public final String r() {
        return this.aw;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.av, i);
        parcel.writeInt(this.type);
        parcel.writeString(this.i);
        parcel.writeString(this.aw);
    }
}
