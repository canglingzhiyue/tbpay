package com.taobao.themis.container.title.titleView;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTitleView$clearLeftActions$1 extends Lambda implements rul<com.taobao.themis.kernel.container.ui.titlebar.a, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSTitleView$clearLeftActions$1 INSTANCE = new TMSTitleView$clearLeftActions$1();

    public TMSTitleView$clearLeftActions$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2421invoke(com.taobao.themis.kernel.container.ui.titlebar.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9923577", new Object[]{this, aVar}) : Boolean.valueOf(invoke2(aVar));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(com.taobao.themis.kernel.container.ui.titlebar.a it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24d04154", new Object[]{this, it})).booleanValue();
        }
        q.d(it, "it");
        return it.c() == 0;
    }
}
