package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class af implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Integer> f24257a = new HashMap<>();
    private static final HashMap<String, Long> b = new HashMap<>();
    private static final HashMap<String, String> c = new HashMap<>();
    private static af d;
    private Context e;
    private e f;
    private boolean g;

    private af(Context context) {
        this.g = false;
        this.e = context;
        this.g = a(context);
        u.d("SystemCache", "init status is " + this.g + ";  curCache is " + this.f);
    }

    public static synchronized af b(Context context) {
        af afVar;
        synchronized (af.class) {
            if (d == null) {
                d = new af(context.getApplicationContext());
            }
            afVar = d;
        }
        return afVar;
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        e eVar;
        String str3 = c.get(str);
        return (str3 != null || (eVar = this.f) == null) ? str3 : eVar.a(str, str2);
    }

    public final void a() {
        ae aeVar = new ae();
        if (!aeVar.a(this.e)) {
            return;
        }
        aeVar.a();
        u.d("SystemCache", "sp cache is cleared");
    }

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        this.f = new ac();
        boolean a2 = this.f.a(context);
        if (!a2) {
            this.f = new ae();
            a2 = this.f.a(context);
        }
        if (!a2) {
            this.f = null;
        }
        return a2;
    }

    @Override // com.vivo.push.util.e
    public final void b(String str, String str2) {
        e eVar;
        c.put(str, str2);
        if (!this.g || (eVar = this.f) == null) {
            return;
        }
        eVar.b(str, str2);
    }
}
