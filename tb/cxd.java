package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import tb.cww;

/* loaded from: classes.dex */
public class cxd extends cwx {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26581a;
    private final String b;
    private cwy c;
    private volatile cxe d;
    private final Object e = new Object();
    private cwr f = cwr.UNKNOWN;
    private final Map<String, String> g = new HashMap();
    private volatile cxf h;

    public cxd(Context context, String str) {
        this.f26581a = context;
        this.b = str;
    }

    private static String b(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return fxb.DIR + str.substring(i);
    }

    private String c(String str) {
        cww.a aVar;
        Map<String, cww.a> a2 = cww.a();
        if (a2.containsKey(str) && (aVar = a2.get(str)) != null) {
            return aVar.a(this);
        }
        return null;
    }

    private void d() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    if (this.c != null) {
                        this.d = new cxi(this.c.b(), "UTF-8");
                        this.c.a();
                        this.c = null;
                    } else {
                        this.d = new cxl(this.f26581a, this.b);
                    }
                    this.h = new cxf(this.d);
                }
                e();
            }
        }
    }

    private void e() {
        if (this.f != cwr.UNKNOWN || this.d == null) {
            return;
        }
        this.f = cxa.a(this.d.a("/region", null), this.d.a("/agcgw/url", null));
    }

    @Override // tb.cwu
    public String a() {
        return cxa.DEFAULT_NAME;
    }

    @Override // tb.cwu
    public String a(String str) {
        return a(str, (String) null);
    }

    public String a(String str, String str2) {
        if (str != null) {
            if (this.d == null) {
                d();
            }
            String b = b(str);
            String str3 = this.g.get(b);
            if (str3 != null) {
                return str3;
            }
            String c = c(b);
            if (c != null) {
                return c;
            }
            String a2 = this.d.a(b, str2);
            return cxf.a(a2) ? this.h.a(a2, str2) : a2;
        }
        throw new NullPointerException("path must not be null.");
    }

    @Override // tb.cwu
    public Context b() {
        return this.f26581a;
    }

    @Override // tb.cwu
    public cwr c() {
        if (this.f == null) {
            this.f = cwr.UNKNOWN;
        }
        if (this.f == cwr.UNKNOWN && this.d == null) {
            d();
        }
        cwr cwrVar = this.f;
        return cwrVar == null ? cwr.UNKNOWN : cwrVar;
    }
}
