package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* loaded from: classes9.dex */
final class ac implements e {

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f24255a;

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        try {
            return Settings.System.getString(this.f24255a, str);
        } catch (Exception e) {
            e.printStackTrace();
            u.b("SettingsCache", "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        if (n.b()) {
            this.f24255a = context.getContentResolver();
            return true;
        }
        return false;
    }

    @Override // com.vivo.push.util.e
    public final void b(String str, String str2) {
        try {
            Settings.System.putString(this.f24255a, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            u.b("SettingsCache", "putString error by ".concat(String.valueOf(str)));
        }
    }
}
