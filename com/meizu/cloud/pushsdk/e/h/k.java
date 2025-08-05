package com.meizu.cloud.pushsdk.e.h;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static j f7944a;
    private static long b;

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a() {
        synchronized (k.class) {
            j jVar = f7944a;
            if (jVar != null) {
                f7944a = jVar.f;
                jVar.f = null;
                b -= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return jVar;
            }
            return new j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(j jVar) {
        if (jVar.f == null && jVar.g == null) {
            if (jVar.d) {
                return;
            }
            synchronized (k.class) {
                long j = b + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                if (j > 65536) {
                    return;
                }
                b = j;
                jVar.f = f7944a;
                jVar.c = 0;
                jVar.b = 0;
                f7944a = jVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
