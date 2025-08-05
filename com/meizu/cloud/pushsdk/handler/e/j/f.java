package com.meizu.cloud.pushsdk.handler.e.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.security.ccrc.service.build.Ta;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f7993a;
    private String b;
    private boolean c;
    private String d;
    private String e;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    public f() {
        this.c = false;
    }

    protected f(Parcel parcel) {
        boolean z = false;
        this.c = false;
        this.f7993a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0 ? true : z;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    public static f a(JSONObject jSONObject) {
        String str;
        f fVar = new f();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(com.taobao.tao.powermsg.model.a.COL_TASK)) {
                    fVar.c(jSONObject.getString(com.taobao.tao.powermsg.model.a.COL_TASK));
                }
                if (!jSONObject.isNull("time")) {
                    fVar.d(jSONObject.getString("time"));
                }
                if (!jSONObject.isNull("pushExtra")) {
                    fVar.a(jSONObject.getInt("pushExtra") == 0);
                }
            } catch (JSONException e) {
                str = " parse statics message error " + e.getMessage();
            }
            return fVar;
        }
        str = "no control statics can parse ";
        DebugLogger.e(Ta.c, str);
        return fVar;
    }

    public String a() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void b(String str) {
        this.e = str;
    }

    public boolean b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.f7993a = str;
    }

    public String d() {
        return this.f7993a;
    }

    public void d(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.b;
    }

    public String toString() {
        return "Statics{taskId='" + this.f7993a + "', time='" + this.b + "', pushExtra=" + this.c + ", deviceId='" + this.d + "', seqId='" + this.e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7993a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
