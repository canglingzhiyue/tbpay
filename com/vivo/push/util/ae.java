package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class ae implements e {

    /* renamed from: a  reason: collision with root package name */
    private static String f24256a = "SpCache";
    private static String b = "com.vivo.push.cache";
    private SharedPreferences c;

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        String string = this.c.getString(str, str2);
        String str3 = f24256a;
        u.d(str3, "getString " + str + " is " + string);
        return string;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.c.edit();
        if (edit != null) {
            edit.clear();
            c.a(edit);
        }
        u.d(f24256a, "system cache is cleared");
    }

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        if (this.c == null) {
            this.c = context.getSharedPreferences(b, 0);
            return true;
        }
        return true;
    }

    @Override // com.vivo.push.util.e
    public final void b(String str, String str2) {
        SharedPreferences.Editor edit = this.c.edit();
        if (edit == null) {
            u.b(f24256a, "putString error by ".concat(String.valueOf(str)));
            return;
        }
        edit.putString(str, str2);
        c.a(edit);
        u.d(f24256a, "putString by ".concat(String.valueOf(str)));
    }
}
