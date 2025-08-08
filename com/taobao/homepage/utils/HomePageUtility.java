package com.taobao.homepage.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import tb.dmp;
import tb.fpr;
import tb.gbg;
import tb.jqm;
import tb.kge;
import tb.ksk;
import tb.kst;
import tb.lap;
import tb.laq;
import tb.lar;
import tb.oiy;
import tb.ojd;
import tb.ope;
import tb.oqc;

/* loaded from: classes.dex */
public class HomePageUtility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1081892754);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0 != 4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.utils.HomePageUtility.a(java.lang.String):boolean");
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String a2 = com.taobao.android.home.component.utils.i.a();
        if (a2.equalsIgnoreCase("main")) {
            return ksk.HOME_MAIN.f30287a;
        }
        if (a2.equalsIgnoreCase(com.taobao.android.home.component.utils.h.HOMEPAGE_CTAO)) {
            return ksk.HOME_CUN.f30287a;
        }
        if (a2.equalsIgnoreCase("old")) {
            return ksk.HOME_OLD.f30287a;
        }
        return ksk.HOME_INTL.f30287a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String a2 = com.taobao.android.home.component.utils.i.a();
        if (a2.equalsIgnoreCase("main")) {
            return ksk.HOME_MAIN.b;
        }
        if (a2.equalsIgnoreCase(com.taobao.android.home.component.utils.h.HOMEPAGE_CTAO)) {
            return ksk.HOME_CUN.b;
        }
        if (a2.equalsIgnoreCase("old")) {
            return ksk.HOME_OLD.b;
        }
        return ksk.HOME_INTL.b;
    }

    public static List<String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{new Boolean(z)});
        }
        List<String> b = kst.b(b());
        if (!z && "main".equals(com.taobao.android.home.component.utils.i.a()) && b.size() == 1) {
            b.add(ksk.REC_MAIN.f30287a);
        }
        return b;
    }

    @Deprecated
    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : Math.round(fpr.a(context) * (f / 375.0f));
    }

    public static int a(DinamicXEngine dinamicXEngine, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534b544", new Object[]{dinamicXEngine, context, new Float(f)})).intValue();
        }
        if (dinamicXEngine == null) {
            return gbg.b(context, f);
        }
        return gbg.a(dinamicXEngine, context, f);
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[0]);
        }
        final laq c = laq.a().a("SearchBar").b("getD3SearchViewSection").c("HomePageUtility.getD3SearchViewSection");
        String l = oqc.a().l();
        ope f = com.taobao.tao.homepage.d.f(l);
        if (f == null) {
            c.a(com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, "is null").b();
            return null;
        }
        List<SectionModel> g = f.g(l);
        c.a("isNewFace", "true").a("主容器Id", l);
        if (g != null) {
            c.a(AbsListWidgetInstance.SLOT_SECTION, "is not null");
            for (SectionModel sectionModel : g) {
                if (StringUtils.equals(sectionModel.getString("sectionBizCode"), "DXSearchBar")) {
                    c.a("sectionBizCode", "DXSearchBar").b();
                    return sectionModel;
                }
            }
        }
        c.a("getSection", "null");
        Boolean bool = (Boolean) com.taobao.android.home.component.utils.m.a().a("homeNetLowOptimization", Boolean.class);
        if (bool != null && bool.booleanValue()) {
            com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: com.taobao.homepage.utils.HomePageUtility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        laq.this.b();
                    }
                }
            });
        } else {
            c.b();
        }
        return null;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            SystemBarDecorator systemBarDecorator = new SystemBarDecorator((Activity) context);
            Map<String, String> j = FestivalMgr.a().j();
            String str = j.get("navStyle");
            if (StringUtils.equals(j.get("isFestivalOn"), "1")) {
                if (!StringUtils.equals(str, "0") && !StringUtils.equals(str, "1")) {
                    if (StringUtils.equals(str, "2")) {
                        systemBarDecorator.enableImmersiveStatusBar(true);
                    }
                }
                systemBarDecorator.enableImmersiveStatusBar(false);
            } else {
                systemBarDecorator.enableImmersiveStatusBar(true);
            }
            if (!com.taobao.homepage.page.weexv2.a.d()) {
                return;
            }
            systemBarDecorator.enableImmersiveStatusBar(false);
        } catch (Throwable unused) {
        }
    }

    public static void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{new Long(j), str});
            return;
        }
        c.a.b("homepage_common", "homeBaseCacheTime" + str, j + "");
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        try {
            return Long.valueOf(c.a.a("homepage_common", "homeBaseCacheTime" + str, "0")).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31c0dbb7", new Object[]{jSONObject, strArr});
        }
        if (jSONObject != null && strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                jSONObject = jSONObject.getJSONObject(str);
                if (jSONObject == null) {
                    break;
                }
            }
        }
        return jSONObject;
    }

    public static float a(RecyclerView recyclerView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ef4d2c8", new Object[]{recyclerView, view, new Boolean(z)})).floatValue();
        }
        if (recyclerView != null && recyclerView.getAdapter() != null && recyclerView.getLayoutManager() != null && view != null) {
            if (z) {
                view = recyclerView.getLayoutManager().findContainingItemView(view);
            }
            if (view != null && view.getHeight() > 0 && recyclerView.getHeight() > 0) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr);
                recyclerView.getLocationOnScreen(iArr2);
                float abs = 1.0f - ((Math.abs(Math.min(0, iArr[1] - iArr2[1])) + Math.max(0, (iArr[1] + view.getHeight()) - (iArr2[1] + recyclerView.getHeight()))) / view.getHeight());
                if (abs < 0.0f) {
                    abs = 0.0f;
                }
                if (abs > 1.0f) {
                    abs = 1.0f;
                }
                com.taobao.android.home.component.utils.e.e("HomePageUtility", "exposeRatio = " + abs);
                return abs;
            }
        }
        return -1.0f;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            str = Globals.getApplication().getResources().getString(R.string.homepage_recommend);
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        return str + "-" + str2;
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float a2 = (f * 750.0f) / fpr.a(Globals.getApplication());
        double d = a2;
        if (d > 0.005d && a2 < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    public static boolean a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e236be8", new Object[]{awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData == null) {
            return true;
        }
        if (awesomeGetContainerData.base != null) {
            return awesomeGetContainerData.base.isCacheData;
        }
        if (awesomeGetContainerData.delta == null) {
            return true;
        }
        return awesomeGetContainerData.delta.isCacheData;
    }

    public static View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1cc208fb", new Object[]{layoutInflater, viewGroup});
        }
        try {
            com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_CREATE_CONTAINER);
            oiy.a().f();
            oiy.a().g();
            oiy.a().h();
            lar.e("inflateRoot");
            View c = ojd.a().c(layoutInflater, viewGroup);
            oiy.a().a(layoutInflater, viewGroup);
            lar.f("inflateRoot");
            com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_CREATE_CONTAINER);
            return c;
        } catch (Throwable th) {
            lap.a("Performance", "initViewContainer error", th.getMessage());
            String str = "initViewContainer error : " + lap.a(th);
            com.taobao.android.home.component.utils.e.a("HomePageUtility", str, th);
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.JAVA_ONLY).addHeaderInfo("initViewContainer", str);
            if (jqm.a()) {
                throw th;
            }
            return null;
        }
    }

    public static com.taobao.tao.recommend3.tracelog.b a(Set<String> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.recommend3.tracelog.b) ipChange.ipc$dispatch("45a7184", new Object[]{set}) : com.taobao.tao.recommend3.tracelog.b.a(b(set));
    }

    public static String b(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ef0ebaa", new Object[]{set});
        }
        String str = null;
        if (set == null || set.isEmpty()) {
            return null;
        }
        for (String str2 : set) {
            if (!StringUtils.equals(str2, oqc.a().l())) {
                if (str2 != null) {
                    return str2;
                }
                str = str2;
            }
        }
        return str;
    }

    public static Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("805a9220", new Object[]{jSONObject, str});
        }
        if (StringUtils.isEmpty(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = a(obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    private static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && !StringUtils.isEmpty(str)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt < jSONArray.size()) {
                        return jSONArray.get(parseInt);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }
}
