package com.taobao.android.launcher.bootstrap.tao;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.regex.Pattern;
import tb.gtk;
import tb.gtx;
import tb.guc;
import tb.gvk;
import tb.gvw;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f13087a = Pattern.compile("(.*)/wow/a/act/(tmall|tao|ju)/tmc/(.*)wh_pid(.*)");

        public static /* synthetic */ Pattern a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("8d215c31", new Object[0]) : f13087a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(Application application, gtx gtxVar, gtk gtkVar, String str);
    }

    public static /* synthetic */ boolean a(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59c83e97", new Object[]{application, gtkVar, str})).booleanValue() : f(application, gtkVar, str);
    }

    public static /* synthetic */ boolean b(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5afe9176", new Object[]{application, gtkVar, str})).booleanValue() : e(application, gtkVar, str);
    }

    public static /* synthetic */ boolean c(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c34e455", new Object[]{application, gtkVar, str})).booleanValue() : g(application, gtkVar, str);
    }

    public static /* synthetic */ boolean d(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d6b3734", new Object[]{application, gtkVar, str})).booleanValue() : h(application, gtkVar, str);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        Uri parse2 = Uri.parse(queryParameter);
        if (parse2.isOpaque()) {
            return false;
        }
        String queryParameter2 = parse2.getQueryParameter(RVStartParams.KEY_URL_SHORT);
        if (TextUtils.isEmpty(queryParameter2)) {
            return false;
        }
        return a(queryParameter2, gvw.CONFIG_LAUNCH, "1") || a.a().matcher(queryParameter2).matches();
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (!parse.isOpaque()) {
            return parse.getQueryParameterNames().contains(str2);
        }
        return false;
    }

    private static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (!parse.isOpaque()) {
            return TextUtils.equals(str3, parse.getQueryParameter(str2));
        }
        return false;
    }

    private static boolean e(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ea18a13", new Object[]{application, gtkVar, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque() || !com.taobao.linkmanager.afc.utils.e.a(parse)) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("bc_fl_src");
        if (TextUtils.isEmpty(queryParameter) || !queryParameter.startsWith("tanx_df_")) {
            return false;
        }
        String[] split = queryParameter.split("_");
        if (split.length < 3) {
            return false;
        }
        String str2 = split[2];
        if (!guc.a(application, "adzoneid_" + str2) || split.length < 12) {
            return false;
        }
        String str3 = split[11];
        if (!guc.a(application, "adsrc_" + str3)) {
            return false;
        }
        a(gtkVar);
        return true;
    }

    private static boolean f(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fd7dcf2", new Object[]{application, gtkVar, str})).booleanValue();
        }
        if (!a(str)) {
            return false;
        }
        a(gtkVar);
        return true;
    }

    private static void a(gtk gtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaec60fa", new Object[]{gtkVar});
            return;
        }
        boolean a2 = InstrumentationDelegate.a(gtkVar);
        LauncherRuntime.n = a2;
        if (!a2) {
            return;
        }
        LauncherRuntime.o = true;
        LinkRule b2 = com.taobao.android.launcher.bootstrap.tao.ability.h.b();
        String str = null;
        String str2 = b2 == null ? null : b2.component;
        if (b2 != null) {
            str = b2.name;
        }
        BootstrapMode.a(3, str, str2);
    }

    private static Pair<String, String> a(Application application, String str) {
        String[] split;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d9093d8b", new Object[]{application, str});
        }
        Uri parse = Uri.parse(str);
        if (!"tbopen".equals(parse.getScheme()) || parse.isOpaque()) {
            return null;
        }
        String queryParameter = parse.getQueryParameter("h5Url");
        String queryParameter2 = parse.getQueryParameter("bc_fl_src");
        if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
            if (queryParameter2.split("_", 3).length >= 2) {
                str2 = split[0] + "_" + split[1];
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (guc.a(application, "link_opt_src_" + str2)) {
                    return Pair.create(queryParameter, str2);
                }
            }
        }
        return null;
    }

    private static boolean g(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("610e2fd1", new Object[]{application, gtkVar, str})).booleanValue();
        }
        Pair<String, String> a2 = a(application, str);
        if (a2 == null) {
            return false;
        }
        String str2 = (String) a2.first;
        if (TextUtils.isEmpty(str2) || a(str, gvw.CONFIG_LAUNCH, "0") || a(str, "module", "native")) {
            return false;
        }
        if (a(str2, gvw.CONFIG_LAUNCH, "0") && (!a(str2, "sKeep") || a(str2, "sKeep", "0"))) {
            return false;
        }
        if (com.taobao.android.launcher.bootstrap.tao.ability.h.b(str2) && com.taobao.android.launcher.bootstrap.tao.ability.h.b(application, str2) == null) {
            return false;
        }
        if (com.taobao.android.launcher.bootstrap.tao.ability.h.a((Context) application, str2, true) == null && !"growth_dhh".equals(a2.second)) {
            return false;
        }
        a(gtkVar);
        return true;
    }

    private static boolean h(Application application, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624482b0", new Object[]{application, gtkVar, str})).booleanValue();
        }
        if (!guc.a(application, "link_opt_open_sso")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tbopen".equals(parse.getScheme()) || parse.isOpaque() || !"true".equals(parse.getQueryParameter("sso_tao_simple"))) {
            return false;
        }
        LauncherRuntime.n = InstrumentationDelegate.a(gtkVar);
        return true;
    }

    private static boolean a(Application application, gtk gtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f94e50d", new Object[]{application, gtkVar})).booleanValue();
        }
        gvk a2 = gvk.a();
        if (a2 == null || a2.f28515a) {
            return false;
        }
        String c = gvk.c(a2);
        int indexOf = c.indexOf("/");
        String substring = indexOf >= 0 ? c.substring(indexOf + 1) : c;
        SparseIntArray a3 = BootstrapMode.a(application, substring);
        if (a3.get(0, 0) == 1) {
            BootstrapMode.a(-2, c, a3.get(1, 0));
            LauncherRuntime.n = InstrumentationDelegate.a(gtkVar);
            return true;
        }
        if (!guc.a(application, Build.MANUFACTURER.toUpperCase() + "_slim_boost_" + substring)) {
            return false;
        }
        BootstrapMode.a(-2, c);
        LauncherRuntime.n = InstrumentationDelegate.a(gtkVar);
        return true;
    }

    public static void a(Application application, gtx gtxVar, gtk gtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642c0e6e", new Object[]{application, gtxVar, gtkVar});
        } else if (!TextUtils.equals(gtxVar.f28453a, gtxVar.b)) {
            InstrumentationDelegate.a(gtxVar, gtkVar);
        } else {
            i iVar = new i();
            android.taobao.safemode.k d = LauncherRuntime.d();
            if (a(application, gtkVar)) {
                iVar.a(application, gtxVar, gtkVar, "");
            } else if (d == null || !d.f1531a || d.e == null) {
                iVar.a(application, gtxVar, gtkVar, "");
            } else {
                String dataString = d.e.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    iVar.a(application, gtxVar, gtkVar, "");
                } else if (!BootstrapMode.a()) {
                    iVar.a(application, gtxVar, gtkVar, "");
                } else {
                    b[] bVarArr = {new b() { // from class: com.taobao.android.launcher.bootstrap.tao.g.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.launcher.bootstrap.tao.g.b
                        public boolean a(Application application2, gtx gtxVar2, gtk gtkVar2, String str) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("647fb8bc", new Object[]{this, application2, gtxVar2, gtkVar2, str})).booleanValue() : g.a(application2, gtkVar2, str);
                        }
                    }, new b() { // from class: com.taobao.android.launcher.bootstrap.tao.g.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.launcher.bootstrap.tao.g.b
                        public boolean a(Application application2, gtx gtxVar2, gtk gtkVar2, String str) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("647fb8bc", new Object[]{this, application2, gtxVar2, gtkVar2, str})).booleanValue() : g.b(application2, gtkVar2, str);
                        }
                    }, new b() { // from class: com.taobao.android.launcher.bootstrap.tao.g.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.launcher.bootstrap.tao.g.b
                        public boolean a(Application application2, gtx gtxVar2, gtk gtkVar2, String str) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("647fb8bc", new Object[]{this, application2, gtxVar2, gtkVar2, str})).booleanValue() : g.c(application2, gtkVar2, str);
                        }
                    }, iVar, new b() { // from class: com.taobao.android.launcher.bootstrap.tao.g.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.launcher.bootstrap.tao.g.b
                        public boolean a(Application application2, gtx gtxVar2, gtk gtkVar2, String str) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("647fb8bc", new Object[]{this, application2, gtxVar2, gtkVar2, str})).booleanValue() : g.d(application2, gtkVar2, str);
                        }
                    }};
                    int length = bVarArr.length;
                    for (int i = 0; i < length && !bVarArr[i].a(application, gtxVar, gtkVar, dataString); i++) {
                    }
                }
            }
        }
    }

    public static void a(ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9ebc16", new Object[]{scheduleComposer});
        } else {
            InstrumentationDelegate.a(scheduleComposer);
        }
    }
}
