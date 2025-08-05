package com.taobao.themis.widget;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.utils.o;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lcom/taobao/themis/widget/WidgetUtUtils;", "", "()V", "commitClick", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "commitExpose", "startTime", "", "commitTouch", "getCommonArgs", "Lcom/alibaba/fastjson/JSONObject;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    static {
        kge.a(-1157608999);
        INSTANCE = new d();
    }

    private d() {
    }

    private final JSONObject c(f fVar) {
        String relationUrl;
        JSONObject sceneParamObject;
        String e;
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2cd314f", new Object[]{this, fVar});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "miniapp_id", fVar.h());
        jSONObject3.put((JSONObject) com.alibaba.triver.triver_shop.adapter.c.MINIAPP_ORI_URL_KEY, fVar.g());
        jSONObject3.put((JSONObject) "miniapp_trace_id", fVar.d);
        jSONObject3.put((JSONObject) "miniapp_type", "widget");
        String g = k.g(fVar);
        if (g != null) {
            jSONObject3.put((JSONObject) "miniapp_template_id", g);
        }
        TMSMetaInfoWrapper v = fVar.v();
        if (v != null && (m = v.m()) != null && (jSONObject = m.getJSONObject("customLaunchParams")) != null) {
            jSONObject3.put((JSONObject) "miniapp_appinfo_launch_params", (String) jSONObject);
        }
        ITMSPage c = fVar.b().c();
        if (c != null && (e = c.e()) != null) {
            jSONObject3.put((JSONObject) "miniapp_page_name", o.c(e));
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) fVar.a(WidgetStartParams.class);
        if (widgetStartParams != null && (sceneParamObject = widgetStartParams.getSceneParamObject()) != null) {
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.putAll(sceneParamObject);
            jSONObject5.remove("moduleData");
            jSONObject5.remove("shopModuleData");
            t tVar = t.INSTANCE;
            jSONObject4.put((JSONObject) "widget_params", (String) jSONObject5);
            t tVar2 = t.INSTANCE;
            jSONObject3.put((JSONObject) "miniapp_biz_launch_params", (String) jSONObject4);
        }
        if (widgetStartParams != null && (relationUrl = widgetStartParams.getRelationUrl()) != null) {
            jSONObject3.put((JSONObject) "miniapp_module_redirect_miniapp", Uri.parse(relationUrl).getQueryParameter(i.APP_ID));
        }
        return jSONObject2;
    }

    public final void a(f instance, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a63237", new Object[]{this, instance, new Long(j)});
            return;
        }
        q.d(instance, "instance");
        JSONObject c = c(instance);
        if (j > 0) {
            c.put((JSONObject) "miniapp_module_stay_time", (String) Long.valueOf(System.currentTimeMillis() - j));
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        String encode = URLEncoder.encode(c.toJSONString(), "UTF-8");
        q.b(encode, "URLEncoder.encode(common….toJSONString(), \"UTF-8\")");
        hashMap2.put("utparam-cnt", encode);
        String h = instance.h();
        q.b(h, "instance.appId");
        hashMap2.put("miniapp_id", h);
        WidgetStartParams widgetStartParams = (WidgetStartParams) instance.a(WidgetStartParams.class);
        if (widgetStartParams == null || (str = widgetStartParams.getRealSpmUrl()) == null) {
            str = "";
        }
        hashMap2.put("spm-cnt", str);
        String c2 = instance.c();
        q.b(c2, "instance.spmOri");
        hashMap2.put("spm_ori", c2);
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("MiniApp_Widget", 2201, "MiniApp_Widget_Exposure", null, null, hashMap2);
        String a2 = com.taobao.themis.kernel.logger.b.a(instance);
        String b = com.taobao.themis.kernel.logger.b.b(instance);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "eventId", "MiniApp_Widget_Exposure");
        jSONObject2.put((JSONObject) "params", (String) hashMap);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_MONITOR, com.taobao.themis.kernel.logger.a.EVENT_ON_COMMIT_UT_MONITOR, a2, b, jSONObject);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }

    public final void a(f instance) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        JSONObject c = c(instance);
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("MiniApp_Widget", "Touch");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        String encode = URLEncoder.encode(c.toJSONString(), "UTF-8");
        q.b(encode, "URLEncoder.encode(common….toJSONString(), \"UTF-8\")");
        hashMap2.put("utparam-cnt", encode);
        String h = instance.h();
        q.b(h, "instance.appId");
        hashMap2.put("miniapp_id", h);
        WidgetStartParams widgetStartParams = (WidgetStartParams) instance.a(WidgetStartParams.class);
        if (widgetStartParams == null || (str = widgetStartParams.getRealSpmUrl()) == null) {
            str = "";
        }
        hashMap2.put("spm-cnt", str);
        String c2 = instance.c();
        q.b(c2, "instance.spmOri");
        hashMap2.put("spm_ori", c2);
        uTControlHitBuilder.setProperties(hashMap2);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTControlHitBuilder.build());
        String a2 = com.taobao.themis.kernel.logger.b.a(instance);
        String b = com.taobao.themis.kernel.logger.b.b(instance);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "eventId", "MiniApp_Widget_Touch");
        jSONObject2.put((JSONObject) "params", (String) hashMap);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_MONITOR, com.taobao.themis.kernel.logger.a.EVENT_ON_COMMIT_UT_MONITOR, a2, b, jSONObject);
    }

    public final void b(f instance) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea3462e", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        JSONObject c = c(instance);
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("MiniApp_Widget", "Click");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        String encode = URLEncoder.encode(c.toJSONString(), "UTF-8");
        q.b(encode, "URLEncoder.encode(common….toJSONString(), \"UTF-8\")");
        hashMap2.put("utparam-cnt", encode);
        String h = instance.h();
        q.b(h, "instance.appId");
        hashMap2.put("miniapp_id", h);
        WidgetStartParams widgetStartParams = (WidgetStartParams) instance.a(WidgetStartParams.class);
        if (widgetStartParams == null || (str = widgetStartParams.getRealSpmUrl()) == null) {
            str = "";
        }
        hashMap2.put("spm-cnt", str);
        String c2 = instance.c();
        q.b(c2, "instance.spmOri");
        hashMap2.put("spm_ori", c2);
        uTControlHitBuilder.setProperties(hashMap2);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTControlHitBuilder.build());
        String a2 = com.taobao.themis.kernel.logger.b.a(instance);
        String b = com.taobao.themis.kernel.logger.b.b(instance);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "eventId", "MiniApp_Widget_Click");
        jSONObject2.put((JSONObject) "params", (String) hashMap);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_MONITOR, com.taobao.themis.kernel.logger.a.EVENT_ON_COMMIT_UT_MONITOR, a2, b, jSONObject);
    }
}
