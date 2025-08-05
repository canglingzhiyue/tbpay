package com.taobao.tao.newprocessor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class g implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1803608927);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "SubFragmentProcessor";
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
        Context a2 = dVar.a();
        if (a2 != null && intent != null && com.taobao.tao.tbmainfragment.d.b(a2) && com.taobao.tao.tbmainfragment.d.a(a2, "miniDetail")) {
            Bundle bundle = new Bundle();
            bundle.putString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_NAME, "com.taobao.weex.minidetail.MiniDetailWeexFragment");
            bundle.putString(com.taobao.tao.tbmainfragment.i.SUB_KEY_FRAGMENT_JUMP, "miniDetail");
            intent.putExtra(com.taobao.tao.tbmainfragment.i.KEY_FRAGMENT_BUNDLE, bundle);
        }
        return true;
    }
}
