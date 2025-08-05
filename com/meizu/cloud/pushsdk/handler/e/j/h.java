package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private b f7995a;
    private String b;
    private int c;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h[] newArray(int i) {
            return new h[i];
        }
    }

    protected h(Parcel parcel) {
        this.f7995a = (b) parcel.readParcelable(b.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readInt();
    }

    public h(String str, String str2, String str3, String str4, String str5) {
        this.b = str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("notifyId")) {
                this.c = jSONObject.getInt("notifyId");
            }
        } catch (JSONException e) {
            DebugLogger.e("WithDrawMessage", "parse WithDrawMessage error " + e.getMessage());
        }
        this.f7995a = new b(str3, str4, str5);
    }

    public b a() {
        return this.f7995a;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WithDrawMessage{controlMessage=" + this.f7995a + ", revokePackageName='" + this.b + "', notifyId=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7995a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
