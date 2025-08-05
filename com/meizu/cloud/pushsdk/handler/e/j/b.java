package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.Ta;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f7987a;
    private com.meizu.cloud.pushsdk.handler.e.j.a b;
    private f c;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b() {
    }

    protected b(Parcel parcel) {
        this.f7987a = parcel.readString();
        this.b = (com.meizu.cloud.pushsdk.handler.e.j.a) parcel.readParcelable(com.meizu.cloud.pushsdk.handler.e.j.a.class.getClassLoader());
        this.c = (f) parcel.readParcelable(f.class.getClassLoader());
    }

    public b(String str, String str2, String str3) {
        this.f7987a = str;
        if (TextUtils.isEmpty(str)) {
            this.b = new com.meizu.cloud.pushsdk.handler.e.j.a();
            this.c = new f();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b = com.meizu.cloud.pushsdk.handler.e.j.a.a(jSONObject.getJSONObject("ctl"));
            f a2 = f.a(jSONObject.getJSONObject(Ta.c));
            this.c = a2;
            a2.a(str2);
            this.c.b(str3);
        } catch (JSONException e) {
            this.b = new com.meizu.cloud.pushsdk.handler.e.j.a();
            this.c = new f();
            DebugLogger.e("ControlMessage", "parse control message error " + e.getMessage());
        }
    }

    public static b a(String str) {
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.a(com.meizu.cloud.pushsdk.handler.e.j.a.a(jSONObject.getJSONObject("ctl")));
            bVar.a(f.a(jSONObject.getJSONObject(Ta.c)));
        } catch (Exception e) {
            DebugLogger.e("ControlMessage", "parse control message error " + e.getMessage());
            bVar.a(new f());
            bVar.a(new com.meizu.cloud.pushsdk.handler.e.j.a());
        }
        return bVar;
    }

    public com.meizu.cloud.pushsdk.handler.e.j.a a() {
        return this.b;
    }

    public void a(com.meizu.cloud.pushsdk.handler.e.j.a aVar) {
        this.b = aVar;
    }

    public void a(f fVar) {
        this.c = fVar;
    }

    public f b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ControlMessage{controlMessage='" + this.f7987a + "', control=" + this.b + ", statics=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7987a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
