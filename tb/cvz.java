package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes4.dex */
public class cvz {

    /* renamed from: a  reason: collision with root package name */
    private Context f26559a;
    private SharedPreferences b;
    private Object c;

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static cvz f26560a;

        static {
            kge.a(1809789889);
            f26560a = new cvz();
        }
    }

    static {
        kge.a(-562812329);
    }

    private cvz() {
        this.c = new Object();
        Context n = cvf.a().n();
        if (n != null) {
            this.f26559a = a(n);
        }
        Context context = this.f26559a;
        if (context != null) {
            this.b = context.getSharedPreferences("shared_msg_sdk", 0);
        }
    }

    private Context a(Context context) {
        boolean a2 = cvv.a();
        cvy.a("fbeVersion is " + a2);
        return (!a2 || Build.VERSION.SDK_INT < 24) ? context.getApplicationContext() : context.createDeviceProtectedStorageContext();
    }

    public static cvz c() {
        return a.f26560a;
    }

    private SharedPreferences d() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.c) {
            if (this.b != null || this.f26559a == null) {
                return this.b;
            }
            this.b = this.f26559a.getSharedPreferences("shared_msg_sdk", 0);
            return this.b;
        }
    }

    public void a(String str) {
        SharedPreferences d = d();
        if (d != null) {
            d.edit().putString("decryptTag", str).commit();
        }
    }

    public void a(boolean z) {
        SharedPreferences d = d();
        if (d != null) {
            d.edit().putBoolean("hasDefaultChannelCreated", z).commit();
        }
    }

    public boolean a() {
        SharedPreferences d = d();
        if (d != null) {
            return d.getBoolean("hasDefaultChannelCreated", false);
        }
        return false;
    }

    public String b() {
        SharedPreferences d = d();
        return d != null ? d.getString("decryptTag", "DES") : "DES";
    }
}
