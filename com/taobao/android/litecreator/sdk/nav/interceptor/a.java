package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.android.litecreator.util.m;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.hnl;
import tb.kge;
import tb.sqi;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/litecreator/sdk/nav/interceptor/PageFilmAlbumInterceptor;", "Lcom/taobao/android/litecreator/sdk/nav/LCNavInterceptor;", "()V", "doNav", "", "publishConfig", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "interceptKeyword", "", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a extends LCNavInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-776908808);
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "litecreator/film_album";
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public void a(JSONObject publishConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0f2232", new Object[]{this, publishConfig, context});
            return;
        }
        q.d(publishConfig, "publishConfig");
        q.d(context, "context");
        ((sqi) com.taobao.android.litecreator.service.b.a(sqi.class, new Object[0])).open(context, m.a(publishConfig), new WVCallBackContext(null));
        hnl b = b();
        if (b == null) {
            return;
        }
        hnl.a.a(b, "short_chain_success", c(), null, 4, null);
    }
}
