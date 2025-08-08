package com.etao.feimagesearch;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.util.ArrayMap;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.CaptureActivity;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.model.a;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.f;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.nav.Nav;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex.c;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.TBSearchApi;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.taobao.taobao.R;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import tb.cof;
import tb.coh;
import tb.cok;
import tb.com;
import tb.cor;
import tb.cot;
import tb.cou;
import tb.cox;
import tb.coz;
import tb.kge;
import tb.lbu;

/* loaded from: classes3.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALBUM_URL = "http://h5.m.taobao.com/tusou/album/index.html";

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f6925a;

    public static /* synthetic */ String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("76f063c6", new Object[]{strArr}) : e(strArr);
    }

    public static /* synthetic */ String[] b(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("7e5598e5", new Object[]{strArr}) : d(strArr);
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            c();
        }
    }

    static {
        kge.a(122834723);
        f6925a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f6925a) {
        } else {
            f6925a = true;
            cok.a(new lbu());
            com.a(new d());
            cor.a(new i());
            cot.a(com.etao.feimagesearch.util.k.a());
            cof.a(new b());
            com.taobao.android.weex.e.a().a(com.b(), new c.a() { // from class: com.etao.feimagesearch.o.1
            });
            coh.a(new c());
            coz.a(new n());
            cox.a(new f());
            cou.a(new e());
            a.sActivityClass = CaptureActivity.class;
            a.sActivityUrl = ALBUM_URL;
            com.etao.feimagesearch.model.b.sActivityClass = CaptureActivity.class;
            com.etao.feimagesearch.model.b.sActivityUrl = com.taobao.search.common.util.k.PAILITAO_URL;
            com.etao.feimagesearch.model.c.sActivityUrl = "http://h5.m.taobao.com/tusou/history.html";
            IrpParamModel.sActivityClass = IrpActivity.class;
            IrpParamModel.sActivityUrl = "http://h5.m.taobao.com/tusou/image_editor/index.html";
            NetConfig.AUTH_CODE = "iWTZJud96F/KmWgt7lxWuPPsBKTIWG5EWrHIr+elF8zJEKls/LfkklUneGWsvyhOTZXRkuLYBCMmrTE+2aGON8+NkxOAlBfwqsKvDI+t1hs=";
            d();
            b();
            final ScheduledExecutorService newSingleThreadScheduledExecutor = VExecutors.newSingleThreadScheduledExecutor(new com.taobao.android.virtual_thread.face.h() { // from class: com.etao.feimagesearch.o.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : "Plt_init_task";
                }
            });
            final boolean cf = com.etao.feimagesearch.config.b.cf();
            newSingleThreadScheduledExecutor.schedule(new ac() { // from class: com.etao.feimagesearch.o.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (!PailitaoCUtil.d()) {
                        PailitaoCUtil.c();
                    }
                    if (!cf) {
                        com.etao.feimagesearch.nn.f.Companion.a().d();
                    }
                    com.etao.feimagesearch.mnn.j.Companion.a().a();
                    o.e();
                    com.etao.feimagesearch.capture.dynamic.templates.b.a();
                    newSingleThreadScheduledExecutor.shutdown();
                }
            }, com.etao.feimagesearch.config.b.dA(), TimeUnit.MILLISECONDS);
            newSingleThreadScheduledExecutor.schedule(new ac() { // from class: com.etao.feimagesearch.o.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        new PailitaoCUtil();
                    }
                }
            }, com.etao.feimagesearch.config.b.ad(), TimeUnit.MILLISECONDS);
            if (!cf) {
                return;
            }
            com.etao.feimagesearch.nn.f.Companion.a().d();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            SearchSdk.init();
        } catch (Exception unused) {
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        final boolean aR = com.etao.feimagesearch.config.b.aR();
        final boolean an = com.etao.feimagesearch.config.b.an();
        if (!aR && !an) {
            return;
        }
        com.etao.feimagesearch.nn.f.Companion.a().a("", new f.b() { // from class: com.etao.feimagesearch.o.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.f.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (aR) {
                    com.etao.feimagesearch.mnn.a.Companion.a().c();
                    com.etao.feimagesearch.mnn.autodetect.c.Companion.a().c();
                }
                if (!an) {
                    return;
                }
                com.etao.feimagesearch.mnn.channel.c.Companion.a().c();
            }
        });
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            com.taobao.search.rainbow.a.a(TaoApplication.getVersion(), UTDevice.getUtdid(Globals.getApplication()), Globals.getApplication());
            com.taobao.search.rainbow.a.b();
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements com.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1646309667);
            kge.a(192487146);
        }

        private d() {
        }

        @Override // tb.com.a
        public Application a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : Globals.getApplication();
        }

        @Override // tb.com.a
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : TaoPackageInfo.getTTID();
        }

        @Override // tb.com.a
        public String a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : UTDevice.getUtdid(context);
        }

        @Override // tb.com.a
        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : GetAppKeyFromSecurity.getAppKey(0);
        }

        @Override // tb.com.a
        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : TBSearchApi.getCurrentSVersion();
        }

        @Override // tb.com.a
        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : TaoApplication.getVersion();
        }

        @Override // tb.com.a
        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
            }
            int a2 = EnvironmentSwitcher.a();
            if (a2 >= 0 && a2 <= 2) {
                return a2;
            }
            return 0;
        }

        @Override // tb.com.a
        public long g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : TimeStampManager.instance().getCurrentTimeStamp();
        }

        @Override // tb.com.a
        public String i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : com.taobao.application.common.c.a().a(com.taobao.tbdeviceevaluator.c.KEY_CPU_BRAND, "unknown");
        }

        @Override // tb.com.a
        public String k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : com.taobao.application.common.c.a().a("mobileModel", Build.MODEL);
        }

        @Override // tb.com.a
        public int l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : Constants.screen_height;
        }

        @Override // tb.com.a
        public int m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : Constants.screen_width;
        }

        @Override // tb.com.a
        public boolean n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : (Globals.getApplication() == null || Globals.getApplication().getApplicationInfo() == null || (Globals.getApplication().getApplicationInfo().flags & 2) == 0) ? false : true;
        }

        @Override // tb.com.a
        public boolean o() {
            Application application;
            ApplicationInfo applicationInfo;
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 29 && (application = Globals.getApplication()) != null && (applicationInfo = application.getApplicationInfo()) != null && applicationInfo.targetSdkVersion >= 29;
        }

        @Override // tb.com.a
        public boolean p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
            }
            try {
                if (com.taobao.search.mmd.util.j.INSTANCE.b()) {
                    if (com.etao.feimagesearch.config.b.W()) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }

        @Override // tb.com.a
        public boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
            }
            Application application = Globals.getApplication();
            return application != null && com.taobao.android.autosize.l.b(application);
        }

        @Override // tb.com.a
        public boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
            }
            Application application = Globals.getApplication();
            return application != null && com.taobao.android.autosize.l.d(application);
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements cof.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1197585286);
            kge.a(1576243434);
        }

        private b() {
        }

        @Override // tb.cof.a
        public String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : com.taobao.search.rainbow.a.a(str);
        }

        @Override // tb.cof.a
        public String b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : com.taobao.search.rainbow.a.c(str);
        }
    }

    private static boolean c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbb58d79", new Object[]{strArr})).booleanValue();
        }
        if (strArr != null && strArr.length != 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] != null && strArr[i].contains("rainbow")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String[] d(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8d200323", new Object[]{strArr});
        }
        if (!c(strArr)) {
            if (strArr == null) {
                strArr = new String[2];
            } else {
                String[] strArr2 = new String[strArr.length + 2];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 2] = "rainbow";
                strArr[strArr.length - 1] = URLEncoder.encode(com.taobao.search.rainbow.a.c());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    private static String[] e(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("94853842", new Object[]{strArr});
        }
        if (!c(strArr)) {
            if (strArr == null) {
                strArr = new String[1];
            } else {
                String[] strArr2 = new String[strArr.length + 1];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 1] = "rainbow=" + URLEncoder.encode(com.taobao.search.rainbow.a.c());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    /* loaded from: classes3.dex */
    public static class f implements cox.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(24352001);
            kge.a(991469290);
        }

        private f() {
        }

        @Override // tb.cox.a
        public void a(Context context, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            try {
                map.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
            } catch (Exception unused) {
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }

        @Override // tb.cox.a
        public void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
            }
        }

        @Override // tb.cox.a
        public void a(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
            } else {
                TBS.Adv.ctrlClicked(CT.Button, str, o.a(strArr));
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            Map<String, String> map2 = map;
            if (!map2.containsKey("rainbow")) {
                map2.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str + "-" + str2, "", "", map2).build());
        }

        @Override // tb.cox.a
        public void a(String str, String str2, int i, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9077b79e", new Object[]{this, str, str2, new Integer(i), map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            Map<String, String> map2 = map;
            if (!map2.containsKey("rainbow")) {
                map2.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str + "-" + str2, "", "", map2).build());
        }

        @Override // tb.cox.a
        public void a(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strArr});
                return;
            }
            String[] b = o.b(strArr);
            ArrayMap arrayMap = new ArrayMap();
            if (b != null && b.length % 2 == 0) {
                String str3 = null;
                for (String str4 : b) {
                    if (str3 == null) {
                        if (str4 == null) {
                            str4 = "";
                        }
                        str3 = str4;
                    } else {
                        arrayMap.put(str3, str4);
                        str3 = null;
                    }
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_Show-" + str2, "", "", arrayMap).build());
        }

        @Override // tb.cox.a
        public void b(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
                return;
            }
            ArrayMap arrayMap = new ArrayMap();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    arrayMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            arrayMap.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_Show-" + str2, "", "", arrayMap).build());
        }

        @Override // tb.cox.a
        public void b(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49523982", new Object[]{this, str, str2, strArr});
            } else {
                TBS.Adv.ctrlClicked(str, CT.Button, str2, o.a(strArr));
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
                return;
            }
            MeasureValueSet create = MeasureValueSet.create();
            for (String str3 : map.keySet()) {
                create.setValue(str3, map.get(str3).doubleValue());
            }
            DimensionValueSet create2 = DimensionValueSet.create();
            for (String str4 : map2.keySet()) {
                create2.setValue(str4, map2.get(str4));
            }
            AppMonitor.Stat.commit(str, str2, create2, create);
        }

        @Override // tb.cox.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                AppMonitor.Alarm.commitSuccess(str, str2);
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            } else {
                AppMonitor.Alarm.commitFail(str, str2, str3, str4);
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
            } else {
                a(str, str2, list, (List<String>) null);
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9371b55e", new Object[]{this, str, str2, list, list2});
                return;
            }
            MeasureSet create = MeasureSet.create();
            if (list != null && list.size() > 0) {
                for (String str3 : list) {
                    create.addMeasure(str3);
                }
            }
            DimensionSet create2 = DimensionSet.create();
            if (list2 != null && list2.size() > 0) {
                for (String str4 : list2) {
                    create2.addDimension(str4);
                }
            }
            AppMonitor.register(str, str2, create, create2);
        }
    }

    /* loaded from: classes3.dex */
    public static class e implements cou.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1357141403);
            kge.a(740270672);
        }

        private e() {
        }

        @Override // tb.cou.a
        public void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            } else if (context == null || StringUtils.isEmpty(str)) {
            } else {
                Nav.from(context).toUri(str);
            }
        }

        @Override // tb.cou.a
        public void a(Activity activity, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e36e85ce", new Object[]{this, activity, str, str2});
            } else {
                a(activity, str);
            }
        }

        @Override // tb.cou.a
        public void a(Context context, IrpParamModel irpParamModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adcb4e01", new Object[]{this, context, irpParamModel});
            } else if (context == null || irpParamModel == null) {
            } else {
                try {
                    Intent createJumpIntent = irpParamModel.createJumpIntent();
                    if (!(context instanceof Activity)) {
                        createJumpIntent.addFlags(268435456);
                    }
                    if (irpParamModel.getPhotoFrom() == PhotoFrom.Values.WIDGET || irpParamModel.getPhotoFrom() == PhotoFrom.Values.FLOAT_BAR) {
                        createJumpIntent.setComponent(new ComponentName(context, SingleIrpActivity.class));
                    }
                    context.startActivity(createJumpIntent);
                } catch (Exception unused) {
                }
                com.etao.feimagesearch.newresult.perf.a.at();
            }
        }

        @Override // tb.cou.a
        public void a(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cabb0489", new Object[]{this, activity, new Integer(i)});
                return;
            }
            Uri.Builder buildUpon = Uri.parse("https://m.taobao.com/image_search/permission_guide/index.html").buildUpon();
            buildUpon.appendQueryParameter(com.taobao.android.detail.wrapper.nav.c.STDPOP_NAV_MODE, com.taobao.android.detail.wrapper.nav.c.STDPOP_MODE_VALUE);
            buildUpon.appendQueryParameter(com.taobao.android.detail.wrapper.nav.c.STDPOP_MODE, "fullscreen");
            buildUpon.appendQueryParameter("permissionType", String.valueOf(i));
            Nav.from(activity).toUri(buildUpon.build().toString());
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements coh.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1390315296);
            kge.a(-1263615050);
        }

        private c() {
        }

        @Override // tb.coh.a
        public void a(Activity activity, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cadf9ba", new Object[]{this, activity, new Boolean(z), new Boolean(z2)});
                return;
            }
            int i = R.anim.push_left_in;
            if (z) {
                i = 0;
            }
            int i2 = 17432577;
            if (z2) {
                i2 = 0;
            }
            activity.overridePendingTransition(i, i2);
        }
    }
}
