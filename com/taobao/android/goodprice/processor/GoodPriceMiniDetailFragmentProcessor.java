package com.taobao.android.goodprice.processor;

import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.tao.tbmainfragment.i;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodPriceMiniDetailFragmentProcessor implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1431583135);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "GoodPriceMiniDetailFragmentProcessor";
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
        if (dVar.a() != null && intent != null) {
            Bundle bundle = new Bundle();
            bundle.putString(i.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(i.KEY_FRAGMENT_NAME, "com.taobao.android.goodprice.minidetail.GoodPriceMiniDetailWeexFragment");
            bundle.putString(i.SUB_KEY_FRAGMENT_JUMP, "goodPriceMiniDetail");
            intent.putExtra(i.KEY_FRAGMENT_BUNDLE, bundle);
        }
        return true;
    }
}
