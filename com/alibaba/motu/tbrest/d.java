package com.alibaba.motu.tbrest;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.Map;
import tb.bzd;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    static final d p;

    /* renamed from: a  reason: collision with root package name */
    public Context f3151a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public Boolean i = false;
    public String j = null;
    public String k = null;
    public String l = null;
    public String m = null;
    public String n = null;
    public String o = null;
    public String r = null;
    private c q = new c();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        private String b;
        private Context c;
        private String d;
        private Boolean e;
        private long f;
        private String g;
        private int h;
        private Object i;
        private Object j;
        private Object k;
        private Map<String, String> l;

        static {
            kge.a(57600791);
            kge.a(-1390502639);
        }

        public a(String str, String str2, Context context, String str3, long j, String str4, int i, Object obj, Object obj2, Object obj3, Map<String, String> map, Boolean bool) {
            this.e = false;
            this.c = context;
            this.d = str3;
            this.f = j;
            this.g = str4;
            this.h = i;
            this.i = obj;
            this.j = obj2;
            this.k = obj3;
            this.l = map;
            this.b = str2;
            this.e = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.e.booleanValue()) {
                    com.alibaba.motu.tbrest.rest.c.b(this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
                } else {
                    com.alibaba.motu.tbrest.rest.c.a(this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
                }
            } catch (Exception e) {
                bzd.b("send log asyn error ", e);
            }
        }
    }

    static {
        kge.a(-779424181);
        p = new d();
    }

    public static d a() {
        return p;
    }

    private Boolean b() {
        boolean z;
        if (this.b == null || this.e == null || this.c == null || this.f3151a == null) {
            bzd.c("have send args is null，you must init first. appId " + this.b + " appVersion " + this.e + " appKey " + this.c);
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean a(String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        boolean z;
        String str3;
        if (b().booleanValue()) {
            if (str == null) {
                String str4 = this.h;
                if (str4 == null) {
                    str4 = "h-adashx.ut.taobao.com";
                }
                str3 = str4;
            } else {
                str3 = str;
            }
            z = com.alibaba.motu.tbrest.rest.c.a(this.c, this.f3151a, str3, j, str2, i, obj, obj2, obj3, map);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void a(Context context, String str, String str2, String str3, String str4, String str5) {
        String string;
        this.f3151a = context;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("build_id", "string", context.getPackageName());
        if (identifier > 0) {
            try {
                string = resources.getString(identifier);
            } catch (Exception e) {
                Log.e("SendService", e.getMessage());
            }
            this.k = string;
        }
        string = "unknown";
        this.k = string;
    }

    public void a(String str) {
        if (str != null) {
            this.e = str;
        }
    }

    public void b(String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        String str3;
        if (b().booleanValue()) {
            if (str == null) {
                String str4 = this.h;
                if (str4 == null) {
                    str4 = "h-adashx.ut.taobao.com";
                }
                str3 = str4;
            } else {
                str3 = str;
            }
            this.q.a(new a("rest thread", this.c, this.f3151a, str3, j, str2, i, obj, obj2, obj3, map, false));
        }
    }

    public void c(String str) {
        if (str != null) {
            this.f = str;
        }
    }
}
