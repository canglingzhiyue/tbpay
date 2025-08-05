package com.taobao.search.refactor.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.h;
import kotlin.jvm.internal.Lambda;
import tb.nvv;
import tb.ruk;

/* loaded from: classes7.dex */
public final class InshopListPlugin$inShopSearchLongPressLayerWidget$2 extends Lambda implements ruk<nvv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InshopListPlugin$inShopSearchLongPressLayerWidget$2(h hVar) {
        super(0);
        this.$widget = hVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final nvv mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nvv) ipChange.ipc$dispatch("3b3986b9", new Object[]{this}) : nvv.CREATOR.a(this.$widget.I());
    }
}
