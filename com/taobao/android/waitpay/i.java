package com.taobao.android.waitpay;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class i implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-917345275);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TBWaitPayNavProcessor";
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null) {
            a(intent, dVar);
        }
        return true;
    }

    private void a(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d54a2f", new Object[]{this, intent, dVar});
        } else if (!com.taobao.android.purchase.aura.utils.i.a(dVar.a()) || (data = intent.getData()) == null || data.buildUpon() == null) {
        } else {
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
    }
}
