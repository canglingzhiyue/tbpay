package com.taobao.android.detail.wrapper.nav;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.tao.Globals;
import tb.ado;
import tb.dyo;
import tb.ecg;
import tb.eip;
import tb.eiq;
import tb.fac;
import tb.fef;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DETAIL_NAV = "detail_nav";
    public static final String STDPOP_ANIMATION = "animation";
    public static final String STDPOP_ANIMATION_NON = "noneInOut";
    public static final String STDPOP_ANIM_BACKGROUND = "animateBackground";
    public static final String STDPOP_CONFIG = "stdpop_config";
    public static final String STDPOP_CONFIG_BACK = "droidShouldHandleBack";
    public static final String STDPOP_CONFIG_WINDOW_NOTIFY = "enableWindowChangeNotify";
    public static final String STDPOP_MASK_TYPE = "stdpop_mask_type";
    public static final String STDPOP_MODE = "stdpop_mode";
    public static final String STDPOP_MODE_FULL_SCREEN = "fullscreen";
    public static final String STDPOP_MODE_VALUE = "std_mega_pop";
    public static final String STDPOP_NAV_MODE = "nav_jump_mode";
    public static final String STDPOP_POP_ID = "stdpop_popId";
    public static final String STDPOP_POP_ID_DETAIL = "DETAIL";

    static {
        kge.a(-597563981);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "DetailNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        long uptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null || TTDetailPageManager.a(dVar.a(), intent)) {
            return true;
        }
        try {
            com.taobao.android.detail.core.utils.h.a("nav_processor_start");
            uptimeMillis = SystemClock.uptimeMillis();
            if (eip.b()) {
                fac.a();
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            eip.a();
            eiq.a();
            String a2 = com.taobao.android.detail.core.performance.d.a("DetailNavProcessor");
            com.taobao.android.detail.core.utils.i.c(a2, "上游业务进入详情nav, TBDetailInitializer初始化时间: " + (uptimeMillis2 - uptimeMillis) + ",开关初始化总时间: " + (SystemClock.uptimeMillis() - uptimeMillis));
            ecg.b(dVar.a(), data);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.d.a("DetailNavProcessor"), "上游业务进入详情nav异常", e);
            ecg.a(dVar.a(), e);
        }
        if (!eip.f27330a) {
            return true;
        }
        String a3 = a(data);
        if (!StringUtils.isEmpty(a3)) {
            String a4 = com.taobao.android.detail.core.performance.d.a("DetailNavProcessor");
            com.taobao.android.detail.core.utils.i.c(a4, "补齐scheme的url:" + a3);
            data = Uri.parse(a3);
        }
        if (StringUtils.equals("true", data.getQueryParameter("hybrid"))) {
            ecg.a(dVar.a());
            return true;
        }
        if (eip.T && (StringUtils.equals("/awp/core/detail/inside.htm", data.getPath()) || "true".equals(data.getQueryParameter("insideDetail")))) {
            String queryParameter = data.getQueryParameter("stdPopId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(STDPOP_CONFIG_WINDOW_NOTIFY, (Object) true);
            jSONObject.put("animation", (Object) STDPOP_ANIMATION_NON);
            jSONObject.put(STDPOP_ANIM_BACKGROUND, (Object) false);
            jSONObject.put(STDPOP_MASK_TYPE, (Object) com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE);
            Uri.Builder appendQueryParameter = data.buildUpon().appendQueryParameter(STDPOP_NAV_MODE, STDPOP_MODE_VALUE);
            if (queryParameter == null) {
                queryParameter = STDPOP_POP_ID_DETAIL;
            }
            data = appendQueryParameter.appendQueryParameter(STDPOP_POP_ID, queryParameter).appendQueryParameter(STDPOP_MODE, "fullscreen").appendQueryParameter(STDPOP_CONFIG, jSONObject.toString()).build();
            intent.setData(data);
        }
        intent.putExtra(KEY_DETAIL_NAV, "true");
        intent.putExtra(dyo.STREAM_FLAG, String.valueOf(new Object().hashCode()));
        if (!StringUtils.isEmpty(a3)) {
            intent = a(intent, data);
        }
        a aVar = new a(Globals.getApplication().getApplicationContext(), intent);
        c(aVar);
        a(aVar);
        b(aVar);
        String a5 = com.taobao.android.detail.core.performance.d.a("DetailNavProcessor");
        com.taobao.android.detail.core.utils.i.c(a5, "process time=" + (SystemClock.uptimeMillis() - uptimeMillis));
        return true;
    }

    private Intent a(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("9a0b9b11", new Object[]{this, intent, uri});
        }
        Intent intent2 = new Intent(intent);
        intent2.setData(uri);
        return intent2;
    }

    private String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{this, uri});
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            String uri2 = uri.toString();
            if (uri2.startsWith(ado.URL_SEPARATOR)) {
                return "http:" + uri2;
            }
            return com.taobao.search.common.util.k.HTTP_PREFIX + uri2;
        } else if (!scheme.startsWith(ado.URL_SEPARATOR)) {
            return null;
        } else {
            return "http:" + uri.toString();
        }
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ed88b", new Object[]{this, aVar});
        } else if (fef.b()) {
            eip.c();
            com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.k.a("DetailNavProcessor"), "一次进程中预请求未命中次数超过orange配置的最大阈值，强制关闭预请求");
        } else if (!eip.c) {
        } else {
            aVar.a();
        }
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c16662a", new Object[]{this, aVar});
        } else if (!eip.k) {
        } else {
            aVar.b();
        }
    }

    private void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58df3c9", new Object[]{this, aVar});
        } else {
            aVar.c();
        }
    }
}
