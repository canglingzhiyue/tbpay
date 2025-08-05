package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.taobao.accs.common.Constants;
import com.xiaomi.push.ak;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class du {

    /* renamed from: a  reason: collision with root package name */
    private static volatile du f24432a;

    /* renamed from: a  reason: collision with other field name */
    private Context f230a;

    /* renamed from: a  reason: collision with other field name */
    private final ConcurrentLinkedQueue<b> f231a = new ConcurrentLinkedQueue<>();

    /* loaded from: classes9.dex */
    class a extends b {
        a() {
            super();
        }

        @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
        /* renamed from: b */
        public void mo1827b() {
            du.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class b extends ak.b {

        /* renamed from: a  reason: collision with root package name */
        long f24434a = System.currentTimeMillis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        @Override // com.xiaomi.push.ak.b
        public boolean a() {
            return true;
        }

        @Override // com.xiaomi.push.ak.b
        /* renamed from: b */
        public void mo1827b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.xiaomi.push.ak.b
        /* renamed from: b  reason: collision with other method in class */
        public final boolean mo1827b() {
            return System.currentTimeMillis() - this.f24434a > AuthenticatorCache.MAX_CACHE_TIME;
        }
    }

    /* loaded from: classes9.dex */
    class c extends b {

        /* renamed from: a  reason: collision with root package name */
        int f24435a;

        /* renamed from: a  reason: collision with other field name */
        File f233a;

        /* renamed from: a  reason: collision with other field name */
        String f234a;

        /* renamed from: a  reason: collision with other field name */
        boolean f235a;
        String b;

        /* renamed from: b  reason: collision with other field name */
        boolean f236b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, String str2, File file, boolean z) {
            super();
            this.f234a = str;
            this.b = str2;
            this.f233a = file;
            this.f236b = z;
        }

        private boolean c() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = du.this.f230a.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt(Constants.KEY_TIMES);
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 86400000) {
                currentTimeMillis = System.currentTimeMillis();
            } else if (i > 10) {
                return false;
            } else {
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", currentTimeMillis);
                jSONObject2.put(Constants.KEY_TIMES, i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e) {
                com.xiaomi.channel.commonutils.logger.b.c("JSONException on put " + e.getMessage());
            }
            return true;
        }

        @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
        public boolean a() {
            if (!bg.e(du.this.f230a)) {
                return this.f236b && bg.b(du.this.f230a);
            }
            return true;
        }

        @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
        /* renamed from: b */
        public void mo1827b() {
            try {
                if (c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", com.xiaomi.push.service.bw.m2320a());
                    hashMap.put("token", this.b);
                    hashMap.put("net", bg.m1732a(du.this.f230a));
                    bg.a(this.f234a, hashMap, this.f233a, "file");
                }
                this.f235a = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.ak.b
        /* renamed from: c  reason: collision with other method in class */
        public void mo1828c() {
            if (!this.f235a) {
                this.f24435a++;
                if (this.f24435a < 3) {
                    du.this.f231a.add(this);
                }
            }
            if (this.f235a || this.f24435a >= 3) {
                this.f233a.delete();
            }
            du.this.a((1 << this.f24435a) * 1000);
        }
    }

    private du(Context context) {
        this.f230a = context;
        this.f231a.add(new a());
        b(0L);
    }

    public static du a(Context context) {
        if (f24432a == null) {
            synchronized (du.class) {
                if (f24432a == null) {
                    f24432a = new du(context);
                }
            }
        }
        f24432a.f230a = context;
        return f24432a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        b peek = this.f231a.peek();
        if (peek == null || !peek.a()) {
            return;
        }
        b(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (z.b() || z.m2369a()) {
            return;
        }
        try {
            File file = new File(this.f230a.getExternalFilesDir(null) + "/.logcache");
            if (!file.exists() || !file.isDirectory()) {
                return;
            }
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        } catch (NullPointerException unused) {
        }
    }

    private void b(long j) {
        if (!this.f231a.isEmpty()) {
            ht.a(new dw(this), j);
        }
    }

    private void c() {
        while (!this.f231a.isEmpty()) {
            b peek = this.f231a.peek();
            if (peek != null) {
                if (!peek.mo1827b() && this.f231a.size() <= 6) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.c("remove Expired task");
                this.f231a.remove(peek);
            }
        }
    }

    public void a() {
        c();
        a(0L);
    }

    public void a(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f231a.add(new dv(this, i, date, date2, str, str2, z));
        b(0L);
    }
}
