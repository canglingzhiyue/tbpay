package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0292a();

    /* renamed from: a  reason: collision with root package name */
    private int f8006a;
    private String b;

    /* renamed from: com.meizu.cloud.pushsdk.notification.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0292a implements Parcelable.Creator<a> {
        C0292a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
        this.f8006a = 0;
    }

    protected a(Parcel parcel) {
        this.f8006a = 0;
        this.f8006a = parcel.readInt();
        this.b = parcel.readString();
    }

    public static int a(MessageV3 messageV3) {
        a b = b(messageV3);
        if (b != null) {
            return b.a();
        }
        return 0;
    }

    private static a a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return b(new JSONObject(str).getString("no"));
            }
        } catch (JSONException e) {
            DebugLogger.e("NotifyOption", "parse notificationMessage error " + e.getMessage());
        }
        return null;
    }

    public static a a(JSONObject jSONObject) {
        String str;
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("ni")) {
                    aVar.a(jSONObject.getInt("ni"));
                }
                if (!jSONObject.isNull("nk")) {
                    aVar.c(jSONObject.getString("nk"));
                }
            } catch (JSONException e) {
                str = "parse json obj error " + e.getMessage();
            }
            return aVar;
        }
        str = "no such tag NotifyOption";
        DebugLogger.e("NotifyOption", str);
        return aVar;
    }

    public static a b(MessageV3 messageV3) {
        a a2;
        try {
            a2 = !TextUtils.isEmpty(messageV3.getNotificationMessage()) ? a(new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getJSONObject("no")) : null;
        } catch (Exception e) {
            DebugLogger.e("NotifyOption", "parse flyme NotifyOption setting error " + e.getMessage() + " so get from notificationMessage");
            a2 = a(messageV3.getNotificationMessage());
        }
        DebugLogger.i("NotifyOption", "current notify option is " + a2);
        return a2;
    }

    public static a b(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                DebugLogger.e("NotifyOption", "parse json string error " + e.getMessage());
            }
            return a(jSONObject);
        }
        jSONObject = null;
        return a(jSONObject);
    }

    public int a() {
        return this.f8006a;
    }

    public void a(int i) {
        this.f8006a = i;
    }

    public String b() {
        return this.b;
    }

    public void c(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotifyOption{notifyId=" + this.f8006a + ", notifyKey='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8006a);
        parcel.writeString(this.b);
    }
}
