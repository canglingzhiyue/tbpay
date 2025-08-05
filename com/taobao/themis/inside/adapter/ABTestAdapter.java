package com.taobao.themis.inside.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.themis.kernel.adapter.IABTestAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/taobao/themis/inside/adapter/ABTestAdapter;", "Lcom/taobao/themis/kernel/adapter/IABTestAdapter;", "()V", "isFeatureOpened", "", "context", "Landroid/content/Context;", com.taobao.android.behavix.feature.a.FEATURE_NAME, "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class ABTestAdapter implements IABTestAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(527115519);
        kge.a(512316239);
    }

    @Override // com.taobao.themis.kernel.adapter.IABTestAdapter
    public boolean isFeatureOpened(Context context, String featureName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d63361a", new Object[]{this, context, featureName})).booleanValue();
        }
        q.d(context, "context");
        q.d(featureName, "featureName");
        return ABGlobal.isFeatureOpened(context, featureName);
    }
}
