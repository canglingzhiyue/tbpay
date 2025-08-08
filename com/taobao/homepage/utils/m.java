package com.taobao.homepage.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.homepage.utils.o;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.util.MtopConvert;
import tb.kge;
import tb.lap;
import tb.lar;
import tb.oqc;
import tb.ord;
import tb.ovr;
import tb.xnh;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "home.perfManager";

    /* renamed from: a  reason: collision with root package name */
    private static final List<Integer> f17294a;
    private static AwesomeGetResponse b;
    private static WeakReference<Activity> c;

    static {
        kge.a(24302281);
        f17294a = new CopyOnWriteArrayList();
        b = null;
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (activity == null) {
        } else {
            c = new WeakReference<>(activity);
        }
    }

    public static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[0]);
        }
        Activity activity = null;
        WeakReference<Activity> weakReference = c;
        if (weakReference != null) {
            activity = weakReference.get();
        }
        return activity == null ? Globals.getApplication() : activity;
    }

    public static boolean a(String str, com.taobao.tao.recommend3.gateway.request.d dVar) {
        AwesomeGetResponse b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b02c72", new Object[]{str, dVar})).booleanValue();
        }
        if (!n.f() || !StringUtils.equals(str, "coldStart") || dVar == null || (b2 = b()) == null) {
            return false;
        }
        dVar.a(b2.mo2429getData());
        com.taobao.android.home.component.utils.e.e(TAG, "mock data ,callback 回调");
        return true;
    }

    public static AwesomeGetResponse b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetResponse) ipChange.ipc$dispatch("31142041", new Object[0]);
        }
        AwesomeGetResponse awesomeGetResponse = b;
        if (awesomeGetResponse != null) {
            return awesomeGetResponse;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b = (AwesomeGetResponse) MtopConvert.convertJsonToOutputDO(com.taobao.android.launcher.common.h.a(".home_data", "").getBytes(android.taobao.util.b.ISO88591), AwesomeGetResponse.class);
            com.taobao.android.home.component.utils.e.e(TAG, "mock data ,useTime=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.a(TAG, "mock data ,error, useTime=" + (System.currentTimeMillis() - currentTimeMillis), th);
        }
        return b;
    }

    public static void a(String str, List<SectionModel> list, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc787c76", new Object[]{str, list, str2, new Integer(i)});
            return;
        }
        Context a2 = a();
        if (a2 == null) {
            return;
        }
        boolean equals = StringUtils.equals(str2, "loadCache");
        com.taobao.android.home.component.utils.e.e(TAG, "preloadCards isCacheRender ： " + equals + " , cid " + str + " ,threadName : " + Thread.currentThread().getName());
        boolean equals2 = StringUtils.equals(str2, "scrollNextPage");
        boolean equals3 = StringUtils.equals(str2, "coldStart");
        if (!equals && !equals2 && !equals3) {
            return;
        }
        com.taobao.android.home.component.utils.e.e(TAG, "preRender, requestType : " + str2 + " , cid : " + str);
        if (b.c() || b.b()) {
            return;
        }
        if (equals) {
            a(str, list, a2, true, i);
            b(str, list, a2);
        } else if (!xnh.a()) {
        } else {
            a(str, list, a2, false, i);
        }
    }

    private static void b(String str, List<SectionModel> list, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19157e4", new Object[]{str, list, context});
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().e(com.taobao.tao.recommend3.tracelog.b.HOME_MAIN_PRERENDER);
        com.taobao.tao.recommend3.tracelog.b.a().a(com.taobao.tao.recommend3.tracelog.b.HOME_MAIN_PRERENDER, 2);
        if (!oqc.a().d(str)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        com.taobao.android.home.component.utils.e.e(TAG, "preRenderOnMainContainer ");
        final DXRenderOptions a2 = new DXRenderOptions.a().a((ba) RecommendDxUserContext.newInstance().addContext("containerId", str)).a();
        final DinamicXEngine b2 = com.taobao.tao.homepage.f.a().b();
        a(str, list, new com.taobao.performance.i() { // from class: com.taobao.homepage.utils.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.performance.i
            public void a(SectionModel sectionModel, DXTemplateItem dXTemplateItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8c7776e", new Object[]{this, sectionModel, dXTemplateItem});
                    return;
                }
                m.a(Integer.valueOf(System.identityHashCode(sectionModel)));
                lar.i("dxPreRender_" + dXTemplateItem.f());
                DXTemplateItem a3 = DinamicXEngine.this.a(dXTemplateItem);
                if (a3 != null) {
                    com.taobao.android.home.component.utils.e.e("dxPreRender", "preRenderCards dxPreRender_" + a3.f() + "_" + a3.b);
                    DinamicXEngine.this.a(context, a3, sectionModel, -1, a2);
                }
                lar.j("dxPreRender_" + dXTemplateItem.f());
                com.taobao.android.home.component.utils.e.e(m.TAG, "preRenderOnMainContainer preRenderTemplate " + (System.currentTimeMillis() - currentTimeMillis));
                com.taobao.tao.recommend3.tracelog.b.a().f(com.taobao.tao.recommend3.tracelog.b.HOME_MAIN_PRERENDER);
                com.taobao.tao.recommend3.tracelog.b.a().b(com.taobao.tao.recommend3.tracelog.b.HOME_MAIN_PRERENDER);
            }
        });
    }

    private static void a(String str, List<SectionModel> list, Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48818174", new Object[]{str, list, context, new Boolean(z), new Integer(i)});
        } else if (oqc.a().d(str)) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            ovr.d().a(str, list, context, z, i);
            com.taobao.android.home.component.utils.e.e(TAG, "preRenderOnSubContainer isColdStartRender = false ,time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{str, new Boolean(z), new Boolean(z2)});
        } else if (!z || com.taobao.tao.recommend3.tracelog.c.c()) {
        } else {
            if (z2) {
                com.taobao.tao.recommend3.tracelog.c.d();
                com.taobao.tao.recommend3.tracelog.b.a(str).b("homeUiRefresh");
                com.taobao.tao.recommend3.tracelog.b.a(str).d("homeNetDataRefresh");
                NotifyApm.a().a(ord.a(), 2);
                return;
            }
            com.taobao.tao.recommend3.tracelog.b.a(str).d("homeCacheDataRefresh");
        }
    }

    public static void b(Activity activity) {
        if (activity == null) {
            return;
        }
        com.taobao.tao.recommend3.tracelog.b.a().d("homeWelcomeFinish");
        LocalBroadcastManager.getInstance(activity).sendBroadcast(new Intent("action_welcome_need_finish"));
        try {
            Activity.class.getMethod("convertFromTranslucent", new Class[0]).invoke(activity, new Object[0]);
        } catch (Throwable th) {
            lap.a("Performance", TAG, "convertFromTranslucent error" + th.getMessage());
        }
    }

    public static void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{num});
            return;
        }
        com.taobao.android.home.component.utils.e.e(TAG, "addPreRenderTemple sectionId: " + num);
        if (f17294a.contains(num)) {
            return;
        }
        com.taobao.android.home.component.utils.e.e(TAG, "addPreRenderTemple add : " + num);
        f17294a.add(num);
    }

    public static boolean b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68e053f2", new Object[]{num})).booleanValue();
        }
        boolean contains = f17294a.contains(num);
        com.taobao.android.home.component.utils.e.e(TAG, "isPreRender contains : " + contains);
        return contains;
    }

    public static void a(String str, List<SectionModel> list, com.taobao.performance.i iVar) {
        JSONObject jSONObject;
        DXTemplateItem e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4028fb", new Object[]{str, list, iVar});
            return;
        }
        for (SectionModel sectionModel : new ArrayList(list)) {
            if (sectionModel != null && (jSONObject = sectionModel.getJSONObject("template")) != null) {
                o.a a2 = o.a(jSONObject);
                if (a2.a() && (e = a2.e()) != null && !b(Integer.valueOf(System.identityHashCode(sectionModel)))) {
                    iVar.a(sectionModel, e);
                }
            }
        }
    }
}
