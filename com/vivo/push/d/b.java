package com.vivo.push.d;

import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class b implements com.vivo.push.restructure.request.a.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static c.a<b> f24180a = new c();
    private String b;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.b = aVar.c();
    }

    public b(String str) {
        this.b = str;
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        aVar.a(this.b);
        return aVar.d();
    }

    public final String b() {
        return this.b;
    }
}
