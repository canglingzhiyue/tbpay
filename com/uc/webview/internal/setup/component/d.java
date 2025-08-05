package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.internal.setup.component.h;
import com.uc.webview.stat.a;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class d {
    private static final long o = System.currentTimeMillis() / 1000;

    /* renamed from: a  reason: collision with root package name */
    final int f23905a;
    String b;
    String c;
    long g;
    long h;
    long i;
    long j;
    long k;
    long l;
    int m;
    private final String n;
    private boolean p;
    int d = -1;
    long f = -1;
    long e = com.uc.webview.base.h.a(b(), 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, int i) {
        this.n = str;
        this.f23905a = i;
    }

    private String a() {
        return this.b + "." + this.c;
    }

    private void a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("id~");
        sb.append(this.f23905a);
        if (!this.p || (i != -108 && !a(i))) {
            sb.append("^hs~");
            sb.append(this.d);
        } else {
            sb.append("^hs~");
            sb.append(this.d | 16);
            if (a(i)) {
                com.uc.webview.base.h.a().a(c(), a()).a(b(), 0L).a();
            }
        }
        sb.append("^sid~");
        sb.append(o);
        sb.append("^sc~");
        sb.append(this.f);
        sb.append("^cc~");
        sb.append(this.m);
        sb.append("^e~");
        sb.append(i);
        sb.append("^es~");
        sb.append(com.uc.webview.internal.stats.g.a(System.currentTimeMillis()));
        if (this.g > 0) {
            sb.append("^dc~");
            sb.append(this.e);
            sb.append("^ds~");
            sb.append(com.uc.webview.stat.a.a(this.g));
        }
        if (this.h > 0) {
            sb.append("^de~");
            sb.append(com.uc.webview.stat.a.a(this.h));
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append("^v~");
            sb.append(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            sb.append("^s~");
            sb.append(this.c);
        }
        if (this.g > 0 && this.h > 0) {
            sb.append("^dt~");
            sb.append(this.h - this.g);
        }
        if (this.j > 0) {
            sb.append("^et~");
            sb.append(this.j - this.i);
        }
        if (this.l > 0) {
            sb.append("^pt~");
            sb.append(this.l - this.k);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("^m~");
            sb.append(str.replace('^', '.').replace(android.taobao.windvane.cache.c.DIVISION, '.'));
        }
        a.r rVar = new a.r();
        rVar.b = sb.toString();
        rVar.k();
    }

    private static boolean a(int i) {
        return i == -121 || i == -124 || i == -125;
    }

    private String b() {
        return "cpn" + this.f23905a + "dc";
    }

    private String c() {
        return "cpn" + this.f23905a + "verinfo";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, String str, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i == -450) {
            this.m++;
        } else if (i == -143) {
            this.l = currentTimeMillis;
        } else if (i != -141) {
            if (i != -126) {
                if (i == -113) {
                    this.j = currentTimeMillis;
                } else if (i == -112) {
                    this.i = currentTimeMillis;
                } else if (i != -109) {
                    if (i == -108) {
                        this.g = currentTimeMillis;
                        com.uc.webview.base.h.a().a(b(), this.e + 1).a();
                    } else if (i == -101 ? this.f <= 0 : i == -100) {
                        this.f = com.uc.webview.internal.stats.g.a(System.currentTimeMillis());
                    }
                }
            }
            this.h = currentTimeMillis;
        } else {
            this.k = currentTimeMillis;
        }
        if (!h.b.a(i)) {
            return;
        }
        String str2 = "";
        if (i != -454 && i != -121 && i != -101 && i != -125 && i != -124 && i != -106 && i != -105) {
            if (str != null) {
                str2 = str;
            }
            if (th != null) {
                str2 = str2 + riy.BRACKET_START_STR + th + riy.BRACKET_END_STR;
            }
        }
        a(i, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(i iVar) {
        this.b = iVar.h;
        this.c = iVar.i;
        String a2 = a();
        String a3 = com.uc.webview.base.h.a(c(), a2);
        this.p = !a2.equals(a3);
        if (this.p) {
            l.b(this.n, "ver changed: %s <- %s", a2, a3);
        }
    }
}
