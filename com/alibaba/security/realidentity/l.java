package com.alibaba.security.realidentity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes3.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", j.c(context), null));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            a.a("SettingUtils", e);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packageName", j.c(context));
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            context.startActivity(intent);
        } catch (Exception unused) {
            a(context);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", j.c(context));
            context.startActivity(intent);
        } catch (Exception unused) {
            a(context);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity"));
            intent.putExtra("extra_pkgname", j.c(context));
            context.startActivity(intent);
        } catch (Exception unused) {
            a(context);
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packageName", j.c(context));
            intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
            context.startActivity(intent);
        } catch (Exception unused) {
            a(context);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else if (m.f()) {
            b(context);
        } else if (m.g()) {
            c(context);
        } else if (m.j()) {
            d(context);
        } else if (m.h()) {
            e(context);
        } else if (m.i()) {
            g(context);
        } else {
            a(context);
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
            return;
        }
        try {
            if ((Build.MODEL.contains("Y85") && !Build.MODEL.contains("Y85A")) || Build.MODEL.contains("vivo Y53L")) {
                Intent intent = new Intent();
                intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity");
                intent.putExtra(NewHtcHomeBadger.PACKAGENAME, j.c(context));
                intent.putExtra(com.taobao.tao.infoflow.multitab.e.KEY_TAB_ID, "1");
                context.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
            intent2.setAction("secure.intent.action.softPermissionDetail");
            intent2.putExtra(NewHtcHomeBadger.PACKAGENAME, j.c(context));
            context.startActivity(intent2);
        } catch (Exception unused) {
            a(context);
        }
    }
}
