package com.taobao.themis.kernel.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"addUtParamOnUri", "Landroid/net/Uri;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "themis_kernel_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1854978043);
    }

    public static final Uri a(Uri addUtParamOnUri, com.taobao.themis.kernel.f instance) {
        JSONObject jSONObject;
        String str;
        String h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b7845c5b", new Object[]{addUtParamOnUri, instance});
        }
        kotlin.jvm.internal.q.d(addUtParamOnUri, "$this$addUtParamOnUri");
        kotlin.jvm.internal.q.d(instance, "instance");
        try {
            String queryParameter = addUtParamOnUri.getQueryParameter(aw.PARAM_UT_PARAMS);
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(queryParameter)) {
                jSONObject2 = JSON.parseObject(queryParameter);
                kotlin.jvm.internal.q.b(jSONObject2, "JSON.parseObject(utParam)");
            }
            String c = instance.c();
            kotlin.jvm.internal.q.b(c, "instance.spmOri");
            if (!TextUtils.isEmpty(c)) {
                jSONObject2.put((JSONObject) "spm_ori", c);
            }
            if (o.b(instance)) {
                jSONObject = jSONObject2;
                str = "widget_id";
                h = instance.h();
            } else {
                jSONObject = jSONObject2;
                str = "miniapp_id";
                h = instance.h();
            }
            jSONObject.put((JSONObject) str, h);
            return addUtParamOnUri.buildUpon().appendQueryParameter(aw.PARAM_UT_PARAMS, jSONObject2.toJSONString()).build();
        } catch (Throwable th) {
            TMSLogger.b("TMSUTUtils", "", th);
            return addUtParamOnUri;
        }
    }
}
