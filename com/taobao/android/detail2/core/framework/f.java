package com.taobao.android.detail2.core.framework;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexV2Module;
import com.taobao.android.detail2.core.framework.base.weex.VideoWeexModule;
import com.taobao.android.preload.DetailPreloadBucket;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.livephoto.weex.LivePhotoWeexView;
import com.taobao.tao.TBMainHost;
import java.util.HashMap;
import tb.fig;
import tb.fjt;
import tb.fkt;
import tb.fky;
import tb.ipa;
import tb.kge;
import tb.nlb;
import tb.xjj;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1692367485);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        fjt.c(fjt.TAG_RENDER, "NewDetailLaunchIdleTask调用");
        xjj.b();
        xjj.a();
        MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
        MUSEngine.registerPlatformView("livephotoview", LivePhotoWeexView.class);
        MUSEngine.registerModule("newdetail_message", DetailWeexV2Module.class);
        MUSEngine.registerModule(VideoWeexModule.MODULE_NAME, VideoWeexModule.class);
        fig.j = true;
        fig.c = true;
        ipa.h("idle");
        ipa.i("idle");
        com.taobao.android.preload.h a2 = com.taobao.android.preload.i.a("new_detail");
        if (a2 != null) {
            a2.b(fkt.b(com.taobao.tao.navigation.a.b()));
        }
        if (!a(application)) {
            return;
        }
        if (!(TBMainHost.a().getContext() instanceof Activity)) {
            fjt.c(fjt.TAG_RENDER, "NewDetailLaunchIdleTask 没拿到首页activity");
            return;
        }
        fig.e = true;
        if (ipa.I()) {
            fjt.c("NewDetailLaunchIdleTask", "TikTest Idle Task , Run , preloadWeexV2FromCache 02");
            com.taobao.android.detail2.core.framework.base.weex.h.d();
            z = true;
        } else {
            nlb.a("weex_sync_delete_code", "idleTask init preloadDetailCardMainPicWeex Error:" + ipa.ba());
        }
        if (z) {
            fig.d = true;
        }
        if (!ipa.a("fast_key_pre_init_switch")) {
            return;
        }
        ipa.ac();
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!a()) {
            fjt.a(fjt.TAG_RENDER, "orange开关关闭，不执行NewDetail的闲时任务");
            return false;
        }
        DetailPreloadBucket e = com.taobao.android.preload.i.a("new_detail").e("InfoFlow");
        if (e == null || TextUtils.isEmpty(e.bucketId)) {
            return b(context);
        }
        return a(e, context);
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        fkt.a();
        return true;
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        String h = fky.h(context);
        fjt.a(fjt.TAG_RENDER, "缓存读到了enablePreloadNewDetail为: " + h);
        if ("true".equals(h)) {
            fig.g = true;
            fig.i = true;
            return true;
        }
        if ("false".equals(h)) {
            fig.g = true;
        }
        return false;
    }

    private static boolean a(DetailPreloadBucket detailPreloadBucket, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95393fbe", new Object[]{detailPreloadBucket, context})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(detailPreloadBucket.bucketId);
            if (parseObject == null) {
                return false;
            }
            String string = parseObject.getString("enablePreLoadNewDetail");
            fjt.a(fjt.TAG_RENDER, "从预请求sdk读到了enablePreloadNewDetail为: " + string);
            fky.b(context, string);
            if ("true".equals(string)) {
                fig.f = true;
                fig.h = true;
                return true;
            }
            if ("false".equals(string)) {
                fig.f = true;
            }
            return false;
        } catch (Exception e) {
            fjt.a("new_detail异常", "闲时任务解析bucket json异常", e);
            return false;
        }
    }
}
