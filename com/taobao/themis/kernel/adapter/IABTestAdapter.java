package com.taobao.themis.kernel.adapter;

import android.content.Context;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;

@DefaultAdapterImpl("com.taobao.themis.inside.adapter.ABTestAdapter")
/* loaded from: classes9.dex */
public interface IABTestAdapter extends com.taobao.themis.kernel.basic.a {
    boolean isFeatureOpened(Context context, String str);
}
