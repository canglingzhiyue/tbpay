package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import java.util.List;
import org.json.JSONObject;
import tb.cew;

/* loaded from: classes4.dex */
public final class j {
    static fi b;
    static az e;
    static long g;

    /* renamed from: a  reason: collision with root package name */
    String f7821a = null;
    fi c = null;
    fi d = null;
    long f = 0;
    boolean h = false;
    private Context i;

    public j(Context context) {
        this.i = context.getApplicationContext();
    }

    private void e() {
        if (b == null || fy.b() - g > cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT) {
            fi f = f();
            g = fy.b();
            if (f == null || !fy.a(f.a())) {
                return;
            }
            b = f;
        }
    }

    private fi f() {
        Throwable th;
        fi fiVar;
        byte[] b2;
        byte[] b3;
        String str = null;
        if (this.i == null) {
            return null;
        }
        a();
        try {
        } catch (Throwable th2) {
            th = th2;
            fiVar = null;
        }
        if (e == null) {
            return null;
        }
        List a2 = e.a("_id=1", fi.class);
        if (a2 == null || a2.size() <= 0) {
            fiVar = null;
        } else {
            fiVar = (fi) a2.get(0);
            try {
                byte[] b4 = p.b(fiVar.c());
                String str2 = (b4 == null || b4.length <= 0 || (b3 = fg.b(b4, this.f7821a)) == null || b3.length <= 0) ? null : new String(b3, "UTF-8");
                byte[] b5 = p.b(fiVar.b());
                if (b5 != null && b5.length > 0 && (b2 = fg.b(b5, this.f7821a)) != null && b2.length > 0) {
                    str = new String(b2, "UTF-8");
                }
                fiVar.a(str);
                str = str2;
            } catch (Throwable th3) {
                th = th3;
                fr.a(th, "LastLocationManager", "readLastFix");
                return fiVar;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            AMapLocation aMapLocation = new AMapLocation("");
            fr.a(aMapLocation, new JSONObject(str));
            if (fy.b(aMapLocation)) {
                fiVar.a(aMapLocation);
            }
        }
        return fiVar;
    }

    public final AMapLocation a(AMapLocation aMapLocation, String str, long j) {
        if (aMapLocation == null || aMapLocation.getErrorCode() == 0 || aMapLocation.getLocationType() == 1 || aMapLocation.getErrorCode() == 7) {
            return aMapLocation;
        }
        try {
            e();
            if (b != null && b.a() != null) {
                boolean z = false;
                if (TextUtils.isEmpty(str)) {
                    long b2 = fy.b() - b.d();
                    if (b2 >= 0 && b2 <= j) {
                        z = true;
                    }
                    aMapLocation.setTrustedLevel(3);
                } else {
                    z = fy.a(b.b(), str);
                    aMapLocation.setTrustedLevel(2);
                }
                if (!z) {
                    return aMapLocation;
                }
                AMapLocation a2 = b.a();
                try {
                    a2.setLocationType(9);
                    a2.setFixLastLocation(true);
                    a2.setLocationDetail(aMapLocation.getLocationDetail());
                    return a2;
                } catch (Throwable th) {
                    th = th;
                    aMapLocation = a2;
                    fr.a(th, "LastLocationManager", "fixLastLocation");
                    return aMapLocation;
                }
            }
            return aMapLocation;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a() {
        if (this.h) {
            return;
        }
        try {
            if (this.f7821a == null) {
                this.f7821a = fg.a("MD5", o.k());
            }
            if (e == null) {
                e = new az(this.i, az.a((Class<? extends ay>) fj.class));
            }
        } catch (Throwable th) {
            fr.a(th, "LastLocationManager", "<init>:DBOperation");
        }
        this.h = true;
    }

    public final boolean a(AMapLocation aMapLocation, String str) {
        if (this.i != null && aMapLocation != null && fy.a(aMapLocation) && aMapLocation.getLocationType() != 2 && !aMapLocation.isMock() && !aMapLocation.isFixLastLocation()) {
            fi fiVar = new fi();
            fiVar.a(aMapLocation);
            if (aMapLocation.getLocationType() == 1) {
                fiVar.a((String) null);
            } else {
                fiVar.a(str);
            }
            try {
                b = fiVar;
                g = fy.b();
                this.c = fiVar;
                if (this.d != null && fy.a(this.d.a(), fiVar.a()) <= 500.0f) {
                    return false;
                }
                if (fy.b() - this.f > 30000) {
                    return true;
                }
            } catch (Throwable th) {
                fr.a(th, "LastLocationManager", "setLastFix");
            }
        }
        return false;
    }

    public final AMapLocation b() {
        e();
        fi fiVar = b;
        if (fiVar != null && fy.a(fiVar.a())) {
            return b.a();
        }
        return null;
    }

    public final void c() {
        try {
            d();
            this.f = 0L;
            this.h = false;
            this.c = null;
            this.d = null;
        } catch (Throwable th) {
            fr.a(th, "LastLocationManager", "destroy");
        }
    }

    public final void d() {
        String str;
        try {
            a();
            if (this.c != null && fy.a(this.c.a()) && e != null && this.c != this.d && this.c.d() == 0) {
                String str2 = this.c.a().toStr();
                String b2 = this.c.b();
                this.d = this.c;
                String str3 = null;
                if (!TextUtils.isEmpty(str2)) {
                    str = p.b(fg.a(str2.getBytes("UTF-8"), this.f7821a));
                    if (!TextUtils.isEmpty(b2)) {
                        str3 = p.b(fg.a(b2.getBytes("UTF-8"), this.f7821a));
                    }
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                fi fiVar = new fi();
                fiVar.b(str);
                fiVar.a(fy.b());
                fiVar.a(str3);
                e.a(fiVar, "_id=1");
                this.f = fy.b();
                if (b == null) {
                    return;
                }
                b.a(fy.b());
            }
        } catch (Throwable th) {
            fr.a(th, "LastLocationManager", "saveLastFix");
        }
    }
}
