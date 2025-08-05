package com.taobao.android.pissarro.pad;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.tao.log.TLog;
import tb.icd;
import tb.ios;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-417875632);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TpPadFullscreenNavProcessor";
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (!icd.b()) {
            return true;
        }
        if (!l.d(dVar.a()) && !l.b(dVar.a())) {
            TLog.loge("TpLog", "TpPadFullscreenNavProcessor normal phone return");
            return true;
        } else if (intent == null || intent.getData() == null) {
            TLog.loge("TpLog", "TpPadFullscreenNavProcessor data empty return");
            return true;
        } else {
            Uri data = intent.getData();
            if (!icd.a(data.getQueryParameter(ios.KEY_BIZ_LINE))) {
                intent.setData(data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
                TLog.loge("TpLog", "TpPadFullscreenNavProcessor set full");
            }
            return true;
        }
    }
}
