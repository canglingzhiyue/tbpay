package com.taobao.android.dinamicx.subscribe.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import tb.kge;

/* loaded from: classes5.dex */
public class l implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1672555851);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TBSubscribeNavProcessor";
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
    public boolean process(Intent intent, d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && intent.getData() != null && !a(dVar.a()) && (data = intent.getData()) != null && StringUtils.isEmpty(data.getQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY))) {
            Uri.Builder buildUpon = Uri.parse(data.toString()).buildUpon();
            buildUpon.appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
        return true;
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        boolean b = com.taobao.android.autosize.l.b(context);
        return Build.VERSION.SDK_INT >= 19 ? !com.taobao.android.autosize.l.d(context) && !b : !b;
    }
}
