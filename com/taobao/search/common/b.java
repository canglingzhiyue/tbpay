package com.taobao.search.common;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.nav.e;
import com.taobao.tao.Globals;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class b implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(378605869);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "SearchPadFullscreenNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        q.c(intent, "intent");
        Uri data = intent.getData();
        if (data == null) {
            return true;
        }
        intent.setData(data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
        return true;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : !l.d(Globals.getApplication()) && !l.b(Globals.getApplication());
    }
}
