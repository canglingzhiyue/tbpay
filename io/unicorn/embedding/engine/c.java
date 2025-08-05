package io.unicorn.embedding.engine;

import android.content.Context;
import io.unicorn.embedding.engine.a;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.rtc;
import tb.rtg;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    final List<a> f24830a;
    private String[] b;
    private String[] c;

    static {
        kge.a(-2035282282);
    }

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, String[] strArr) {
        this(context, strArr, null);
    }

    public c(Context context, String[] strArr, String[] strArr2) {
        this.f24830a = new ArrayList();
        this.b = null;
        this.c = null;
        rtg c = rtc.a().c();
        if (!c.a()) {
            c.a(context.getApplicationContext());
            c.a(context, strArr);
        }
        this.c = strArr;
        this.b = strArr2;
    }

    public a a(Context context, String[] strArr) {
        final a b = this.f24830a.size() == 0 ? b(context) : this.f24830a.get(0).a(context, strArr);
        this.f24830a.add(b);
        b.a(new a.InterfaceC1058a() { // from class: io.unicorn.embedding.engine.c.1
            @Override // io.unicorn.embedding.engine.a.InterfaceC1058a
            public void a() {
            }

            @Override // io.unicorn.embedding.engine.a.InterfaceC1058a
            public void b() {
                c.this.f24830a.remove(b);
            }
        });
        return b;
    }

    a b(Context context) {
        return new a(context, this.c, this.b);
    }
}
