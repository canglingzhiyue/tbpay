package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.loc.bt;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes4.dex */
public final class fk {

    /* renamed from: a  reason: collision with root package name */
    public static int f7794a = 1;
    public static int b = 2;
    private static fk e;
    private Context j;
    private String k;
    private long c = 0;
    private boolean d = false;
    private ArrayList<String> f = new ArrayList<>();
    private et g = new et();
    private et h = new et();
    private long i = 120000;
    private boolean l = false;

    private fk(Context context) {
        this.j = context;
    }

    public static synchronized fk a(Context context) {
        fk fkVar;
        synchronized (fk.class) {
            if (e == null) {
                e = new fk(context);
            }
            fkVar = e;
        }
        return fkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public et b(int i) {
        return i == b ? this.h : this.g;
    }

    private synchronized void b(boolean z, final int i) {
        if (!z) {
            if (!fq.o() && this.l) {
                return;
            }
        }
        if (this.c != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.c < this.i) {
                return;
            }
            if (currentTimeMillis - this.c < 60000) {
                return;
            }
        }
        this.c = System.currentTimeMillis();
        this.l = true;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        for (StackTraceElement stackTraceElement : stackTrace) {
            stringBuffer.append(stackTraceElement.getClassName() + riy.BRACKET_START_STR + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber() + "),");
        }
        cr.a().b(new cs() { // from class: com.loc.fk.1
            @Override // com.loc.cs
            public final void a() {
                int i2;
                StringBuilder sb = new StringBuilder(com.taobao.search.common.util.k.HTTP_PREFIX);
                sb.append(fq.q());
                sb.append("?host=dualstack-a.apilocate.amap.com&query=");
                sb.append(i == fk.b ? 6 : 4);
                String sb2 = sb.toString();
                fl flVar = new fl();
                flVar.b(sb2);
                flVar.c(sb2);
                flVar.a(bt.a.SINGLE);
                flVar.a(bt.c.HTTP);
                try {
                    bo.a();
                    JSONObject jSONObject = new JSONObject(new String(bo.a(flVar).f7708a));
                    String[] b2 = fk.b(jSONObject.optJSONArray(DnsPreference.KEY_IPS), fk.f7794a);
                    if (b2 != null && b2.length > 0 && !fk.b(b2, fk.this.b(fk.f7794a).a())) {
                        fk.this.b(fk.f7794a).a(b2);
                        fk.this.f(fk.f7794a);
                    }
                    String[] b3 = fk.b(jSONObject.optJSONArray("ipsv6"), fk.b);
                    if (b3 != null && b3.length > 0 && !fk.b(b3, fk.this.b(fk.b).a())) {
                        fk.this.b(fk.b).a(b3);
                        fk.this.f(fk.b);
                    }
                    if ((!jSONObject.has(DnsPreference.KEY_IPS) && !jSONObject.has("ipsv6")) || !jSONObject.has(RemoteMessageConst.TTL) || (i2 = jSONObject.getInt(RemoteMessageConst.TTL)) <= 30) {
                        return;
                    }
                    fk.this.i = i2 * 1000;
                } catch (Throwable th) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("key", "dnsError");
                        jSONObject2.put("reason", th.getMessage());
                    } catch (Throwable unused) {
                    }
                    fw.a(fk.this.j, "O018", jSONObject2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0 || strArr.length != strArr2.length) {
            return false;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (!strArr[i].equals(strArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] b(JSONArray jSONArray, int i) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new String[0];
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            if (!StringUtils.isEmpty(string)) {
                if (i == b) {
                    string = riy.ARRAY_START_STR + string + riy.ARRAY_END_STR;
                }
                strArr[i2] = string;
            }
        }
        return strArr;
    }

    private static String c(int i) {
        return i == b ? "last_ip_6" : "last_ip_4";
    }

    private void d(int i) {
        if (b(i).d()) {
            SharedPreferences.Editor a2 = fx.a(this.j, "cbG9jaXA");
            fx.a(a2, c(i));
            fx.a(a2);
            b(i).a(false);
        }
    }

    private String e(int i) {
        String str;
        int i2 = 0;
        b(false, i);
        String[] a2 = b(i).a();
        if (a2 == null || a2.length <= 0) {
            g(i);
            return b(i).b();
        }
        int length = a2.length;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            str = a2[i2];
            if (!this.f.contains(str)) {
                break;
            }
            i2++;
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        b(i).a(str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        if (b(i).a() == null || b(i).a().length <= 0) {
            return;
        }
        String str = b(i).a()[0];
        if (str.equals(this.k) || this.f.contains(str)) {
            return;
        }
        this.k = str;
        SharedPreferences.Editor a2 = fx.a(this.j, "cbG9jaXA");
        fx.a(a2, c(i), str);
        fx.a(a2);
    }

    private void g(int i) {
        String a2 = fx.a(this.j, "cbG9jaXA", c(i), (String) null);
        if (StringUtils.isEmpty(a2) || this.f.contains(a2)) {
            return;
        }
        b(i).a(a2);
        b(i).b(a2);
        b(i).a(true);
    }

    public final String a(fn fnVar, int i) {
        try {
            if (fq.p() && fnVar != null) {
                String b2 = fnVar.b();
                String host = new URL(b2).getHost();
                if (!"http://abroad.apilocate.amap.com/mobile/binary".equals(b2) && !"abroad.apilocate.amap.com".equals(host)) {
                    String str = "apilocate.amap.com".equalsIgnoreCase(host) ? "httpdns.apilocate.amap.com" : host;
                    if (!m.g(str)) {
                        return null;
                    }
                    String e2 = e(i);
                    if (!StringUtils.isEmpty(e2)) {
                        fnVar.d(b2.replace(host, e2));
                        fnVar.a().put("host", str);
                        fnVar.e(str);
                        fnVar.a(i == b);
                        return e2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void a(int i) {
        if (b(i).e()) {
            d(i);
            return;
        }
        this.f.add(b(i).b());
        d(i);
        b(true, i);
    }

    public final void a(boolean z, int i) {
        b(i).b(z);
        if (z) {
            String c = b(i).c();
            String b2 = b(i).b();
            if (StringUtils.isEmpty(b2) || b2.equals(c)) {
                return;
            }
            SharedPreferences.Editor a2 = fx.a(this.j, "cbG9jaXA");
            fx.a(a2, c(i), b2);
            fx.a(a2);
        }
    }
}
