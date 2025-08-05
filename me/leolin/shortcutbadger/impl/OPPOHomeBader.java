package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.security.realidentity.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.b;
import tb.rxb;
import tb.rxc;

/* loaded from: classes9.dex */
public class OPPOHomeBader implements b {

    /* renamed from: a  reason: collision with root package name */
    private static int f24991a = -1;

    private Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Object a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        Method a2;
        if (cls == null || a((Object) str) || (a2 = a(cls, str, clsArr)) == null) {
            return null;
        }
        a2.setAccessible(true);
        try {
            return a2.invoke(null, objArr);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private Method a(Class cls, String str, Class[] clsArr) {
        if (cls != null && !a((Object) str)) {
            try {
                try {
                    cls.getMethods();
                    cls.getDeclaredMethods();
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (Exception unused) {
                    return cls.getMethod(str, clsArr);
                }
            } catch (Exception unused2) {
                if (cls.getSuperclass() != null) {
                    return a(cls.getSuperclass(), str, clsArr);
                }
            }
        }
        return null;
    }

    private boolean a(Object obj) {
        return obj == null || obj.toString().equals("") || obj.toString().trim().equals("null");
    }

    private int b() {
        int i;
        int i2 = f24991a;
        if (i2 >= 0) {
            return i2;
        }
        try {
            i = ((Integer) a(a("com.color.os.ColorBuild"), "getColorOSVERSION", null, null)).intValue();
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            try {
                String b = b(m.y);
                if (b.startsWith("V1.4")) {
                    return 3;
                }
                if (b.startsWith("V2.0")) {
                    return 4;
                }
                if (b.startsWith("V2.1")) {
                    return 5;
                }
            } catch (Exception unused2) {
            }
        }
        f24991a = i;
        return i;
    }

    private String b(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            rxc.a(bufferedReader);
            return readLine;
        } catch (IOException unused2) {
            rxc.a(bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            rxc.a(bufferedReader2);
            throw th;
        }
    }

    @Override // me.leolin.shortcutbadger.b
    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // me.leolin.shortcutbadger.b
    public void a(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        if (rxb.a(context, intent)) {
            context.sendBroadcast(intent);
        } else if (b() != 6) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        }
    }
}
