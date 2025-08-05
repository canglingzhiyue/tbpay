package com.loc;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class ez extends ex<fa> {
    public ez(Context context, String str, Handler handler) {
        super(context, str, handler);
    }

    private static String a(fa faVar) {
        return faVar == null ? "" : faVar.b();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(fa faVar, long j) {
        if (faVar != null) {
            faVar.t = j;
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static int b2(fa faVar) {
        if (faVar == null) {
            return 99;
        }
        return faVar.s;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private static long c2(fa faVar) {
        if (faVar == null) {
            return 0L;
        }
        return faVar.t;
    }

    @Override // com.loc.ex
    final /* bridge */ /* synthetic */ void a(fa faVar, long j) {
        a2(faVar, j);
    }

    @Override // com.loc.ex
    final long b() {
        return eu.g;
    }

    @Override // com.loc.ex
    public final /* synthetic */ String b(fa faVar) {
        return a(faVar);
    }

    @Override // com.loc.ex
    final /* synthetic */ int c(fa faVar) {
        return b2(faVar);
    }

    @Override // com.loc.ex
    final long c() {
        return eu.h;
    }

    @Override // com.loc.ex
    final /* synthetic */ long d(fa faVar) {
        return c2(faVar);
    }
}
