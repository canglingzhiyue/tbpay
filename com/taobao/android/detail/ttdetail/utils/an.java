package com.taobao.android.detail.ttdetail.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class an {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1769982436);
    }

    public static Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{uri});
        }
        if (!TextUtils.equals("/awp/core/detail/inside.htm", uri.getPath()) && !"true".equals(uri.getQueryParameter("insideDetail"))) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter("stdPopId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_WINDOW_NOTIFY, (Object) true);
        jSONObject.put("animation", (Object) (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sInsideWithStdPopAnim)) ? com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT : com.taobao.android.detail.wrapper.nav.c.STDPOP_ANIMATION_NON));
        jSONObject.put(com.taobao.android.detail.wrapper.nav.c.STDPOP_ANIM_BACKGROUND, (Object) false);
        jSONObject.put(com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_BACK, (Object) false);
        jSONObject.put(com.taobao.android.detail.wrapper.nav.c.STDPOP_MASK_TYPE, (Object) com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE);
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter(com.taobao.android.detail.wrapper.nav.c.STDPOP_NAV_MODE, com.taobao.android.detail.wrapper.nav.c.STDPOP_MODE_VALUE);
        if (queryParameter == null) {
            queryParameter = com.taobao.android.detail.wrapper.nav.c.STDPOP_POP_ID_DETAIL;
        }
        return appendQueryParameter.appendQueryParameter(com.taobao.android.detail.wrapper.nav.c.STDPOP_POP_ID, queryParameter).appendQueryParameter(com.taobao.android.detail.wrapper.nav.c.STDPOP_MODE, "fullscreen").appendQueryParameter(com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG, jSONObject.toString()).build();
    }
}
