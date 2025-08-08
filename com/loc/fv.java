package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.amap.api.location.AMapLocation;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class fv {
    private static fv f;
    private static long i;
    private File d;
    private String e;
    private Context g;
    private boolean h;
    private LinkedHashMap<String, Long> c = new LinkedHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    String f7804a = "";
    String b = null;

    private fv(Context context) {
        this.e = null;
        this.g = context.getApplicationContext();
        String path = this.g.getFilesDir().getPath();
        if (this.e == null) {
            this.e = fy.l(this.g);
        }
        try {
            this.d = new File(path, "reportRecorder");
        } catch (Throwable th) {
            ej.a(th);
        }
        c();
    }

    public static synchronized fv a(Context context) {
        fv fvVar;
        synchronized (fv.class) {
            if (f == null) {
                f = new fv(context);
            }
            fvVar = f;
        }
        return fvVar;
    }

    private boolean b(Context context) {
        if (this.b == null) {
            this.b = fx.a(context, "pref", "lastavedate", "0");
        }
        if (this.b.equals(this.f7804a)) {
            return false;
        }
        SharedPreferences.Editor a2 = fx.a(context, "pref");
        fx.a(a2, "lastavedate", this.f7804a);
        fx.a(a2);
        this.b = this.f7804a;
        return true;
    }

    private synchronized void c() {
        if (this.c == null || this.c.size() <= 0) {
            this.f7804a = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
            for (String str : fy.a(this.d)) {
                try {
                    String[] split = new String(fg.b(p.b(str), this.e), "UTF-8").split(",");
                    if (split != null && split.length > 1) {
                        this.c.put(split[0], Long.valueOf(Long.parseLong(split[1])));
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                try {
                    String str = entry.getKey() + "," + entry.getValue();
                    sb.append(p.b(fg.a(str.getBytes("UTF-8"), this.e)) + "\n");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            String sb2 = sb.toString();
            if (StringUtils.isEmpty(sb2)) {
                return;
            }
            fy.a(this.d, sb2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void a() {
        if (this.h) {
            d();
            this.h = false;
        }
    }

    public final synchronized void a(AMapLocation aMapLocation) {
        try {
            if ((!this.c.containsKey(this.f7804a) && this.c.size() >= 8) || (this.c.containsKey(this.f7804a) && this.c.size() >= 9)) {
                ArrayList<String> arrayList = new ArrayList();
                for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                    arrayList.add(entry.getKey());
                    if (arrayList.size() == this.c.size() - 7) {
                        break;
                    }
                }
                for (String str : arrayList) {
                    this.c.remove(str);
                }
            }
            if (aMapLocation.getErrorCode() != 0) {
                return;
            }
            if (aMapLocation.getLocationType() != 6 && aMapLocation.getLocationType() != 5) {
                if (this.c.containsKey(this.f7804a)) {
                    long longValue = this.c.get(this.f7804a).longValue() + 1;
                    i = longValue;
                    this.c.put(this.f7804a, Long.valueOf(longValue));
                } else {
                    this.c.put(this.f7804a, 1L);
                    i = 1L;
                }
                if (i != 0 && i % 100 == 0) {
                    a();
                }
                this.h = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void b() {
        try {
            if (!b(this.g)) {
                return;
            }
            for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                if (!this.f7804a.equals(entry.getKey())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("param_long_first", entry.getKey());
                    jSONObject.put("param_long_second", entry.getValue());
                    fw.a(this.g, "O023", jSONObject);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
