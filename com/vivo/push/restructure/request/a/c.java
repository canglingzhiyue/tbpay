package com.vivo.push.restructure.request.a;

import com.vivo.push.restructure.request.a.a.b;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class c implements com.vivo.push.restructure.request.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a<c> f24235a = new d();
    private String b;
    private int c;
    private long d;
    private int e;

    public c(int i, int i2) {
        this.b = com.vivo.push.restructure.a.a().b().getPackageName();
        this.c = i;
        this.d = 341L;
        this.e = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(com.vivo.push.restructure.request.a.a.a aVar) {
        try {
            this.b = aVar.c();
            this.c = aVar.a();
            this.d = aVar.b();
            this.e = aVar.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.a(this.d);
        aVar.a(this.e);
    }
}
