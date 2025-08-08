package com.taobao.android.launcher.bootstrap.tao;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.ut.device.UTDevice;
import tb.gtv;
import tb.gtx;
import tb.gty;
import tb.guc;
import tb.gvk;
import tb.jzk;
import tb.nso;
import tb.riy;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        h.b("Delegates", "empty invoke provision for class " + str2 + " of bundle " + str);
        return true;
    }

    public static gtv a(Application application, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gtv) ipChange.ipc$dispatch("d9200d21", new Object[]{application, gtxVar});
        }
        if (!StringUtils.equals(gtxVar.f28453a, gtxVar.b)) {
            return a(application) ? new p() : new j();
        } else if (!gty.a(application)) {
            return new k();
        } else {
            if (a(application)) {
                return new p();
            }
            BootstrapMode.a(application);
            return a();
        }
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        h.b("Delegates", "usingNGNextApp: (SDK_INT=" + Build.VERSION.SDK_INT + ", CODENAME=" + Build.VERSION.CODENAME + riy.BRACKET_END_STR);
        if (jzk.e()) {
            return true;
        }
        boolean optPrewarmByProvider = ADaemon.optPrewarmByProvider(context);
        h.b("Delegates", "usingNGNextApp: preWarm:" + optPrewarmByProvider);
        return optPrewarmByProvider || guc.a(context, "ngNextAppDelegate");
    }

    public static gtv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gtv) ipChange.ipc$dispatch("f053915", new Object[0]);
        }
        if (!BootstrapMode.a()) {
            return new j();
        }
        if (gvk.a(gvk.a()) == 1 && nso.a()) {
            h.b("Delegates", "using TaoNGAppDelegate");
            return new n();
        }
        return new j();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            UTDevice.setCollectDelayTime(60000L);
        }
    }
}
