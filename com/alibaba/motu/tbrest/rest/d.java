package com.alibaba.motu.tbrest.rest;

import tb.byo;
import tb.byw;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final com.alibaba.motu.tbrest.c f3161a;
    private b b = new b();

    /* loaded from: classes.dex */
    public interface a {
        void a(byo byoVar);

        void b(byo byoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static {
            kge.a(-2006677957);
        }

        b() {
        }

        boolean a(String str, String str2, byte[] bArr) {
            try {
                return (str != null ? byw.a(str2, bArr) : byw.a(str, str2, bArr)).a();
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }

    static {
        kge.a(2043738562);
        f3161a = new com.alibaba.motu.tbrest.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, byte[] bArr) {
        return this.b.a(str, str2, bArr);
    }

    public void a(final byo byoVar, final a aVar) {
        f3161a.a(new Runnable() { // from class: com.alibaba.motu.tbrest.rest.d.1
            @Override // java.lang.Runnable
            public void run() {
                boolean a2 = d.this.a(byoVar.a(), byoVar.b(), byoVar.d());
                a aVar2 = aVar;
                if (aVar2 != null) {
                    if (a2) {
                        aVar2.a(byoVar);
                    } else {
                        aVar2.b(byoVar);
                    }
                }
            }
        });
    }
}
