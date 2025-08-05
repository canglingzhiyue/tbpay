package com.vivo.push.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.d;
import com.vivo.push.e.b;
import com.vivo.push.i;
import com.vivo.push.util.aa;
import com.vivo.push.util.ab;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.util.List;

/* loaded from: classes9.dex */
public final class a {
    public static void a(Context context, Intent intent) throws Exception {
        if (context == null) {
            u.d("CommandBridge", "enter startService context is null");
            throw new Exception("context is null");
        }
        try {
            context.startService(intent);
        } catch (Exception e) {
            u.a("CommandBridge", "start service error", e);
            intent.setComponent(null);
            context.sendBroadcast(intent);
        }
    }

    public static void a(Context context, v vVar, String str) {
        try {
            boolean d = aa.d(context, str);
            String str2 = d ? "com.vivo.pushservice.action.RECEIVE" : "com.vivo.pushclient.action.RECEIVE";
            if (TextUtils.isEmpty(str)) {
                u.c(context, "消息接受者包名为空！");
                throw new Exception("消息接受者包名为空！");
            } else if (!d && !a(context, str2, str)) {
            } else {
                if (TextUtils.isEmpty(vVar.a())) {
                    vVar.a(context.getPackageName());
                }
                Intent intent = new Intent();
                intent.setFlags(1048576);
                if (!TextUtils.isEmpty(str2)) {
                    intent.setAction(str2);
                }
                intent.setPackage(str);
                intent.setClassName(str, d ? "com.vivo.push.sdk.service.CommandService" : "com.vivo.push.sdk.service.CommandClientService");
                intent.putExtra("security_avoid_pull", com.vivo.push.util.a.a(context).a("com.vivo.pushservice"));
                vVar.b(intent);
                intent.putExtra("command_type", "reflect_receiver");
                if (Build.VERSION.SDK_INT >= 18) {
                    intent.putExtra("security_avoid_pull_rsa", b.a().a(context).a("com.vivo.pushservice"));
                    intent.putExtra("security_avoid_rsa_public_key", ab.a(b.a().a(context).a()));
                }
                a(context, intent);
            }
        } catch (Exception e) {
            u.a("CommandBridge", "CommandBridge sendCommandToClient exception", e);
        }
    }

    public static void a(Context context, String str, v vVar) {
        boolean c = vVar.c();
        i a2 = i.a(context, c ? "com.vivo.vms.upstageservice" : "com.vivo.vms.aidlservice");
        boolean a3 = a2.a();
        if (TextUtils.isEmpty(vVar.a())) {
            vVar.a(context.getPackageName());
        }
        if (a3 && !"com.vivo.pushservice".equals(context.getPackageName())) {
            d dVar = new d(vVar.a(), str, new Bundle());
            vVar.a(dVar);
            if (a2.a(dVar.b())) {
                return;
            }
            u.b("CommandBridge", "send command error by aidl");
            u.c(context, "send command error by aidl");
        }
        Intent intent = new Intent("com.vivo.pushservice.action.METHOD");
        intent.setPackage(str);
        intent.setClassName(str, c ? "com.vivo.push.sdk.service.UpstageService" : "com.vivo.push.sdk.service.PushService");
        vVar.a(intent);
        try {
            a(context, intent);
        } catch (Exception e) {
            u.a("CommandBridge", "CommandBridge startService exception: ", e);
        }
    }

    private static boolean a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setPackage(str2);
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return true;
            }
            u.b("CommandBridge", "action check error：action>>" + str + ";pkgname>>" + str2);
            return false;
        } catch (Exception unused) {
            u.b("CommandBridge", "queryBroadcastReceivers error");
            return false;
        }
    }
}
