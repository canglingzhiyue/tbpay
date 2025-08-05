package com.loc;

import android.content.Context;

/* loaded from: classes4.dex */
public final class bx {

    /* renamed from: a  reason: collision with root package name */
    private Context f7710a;
    private w b;
    private String c;

    public bx(Context context, w wVar, String str) {
        this.f7710a = context.getApplicationContext();
        this.b = wVar;
        this.c = str;
    }

    private static String a(Context context, w wVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(wVar.c());
            sb.append("\",\"product\":\"");
            sb.append(wVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(o.c(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a() {
        return x.a(a(this.f7710a, this.b, this.c));
    }
}
