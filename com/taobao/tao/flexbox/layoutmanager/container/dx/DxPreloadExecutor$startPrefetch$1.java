package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/taobao/tao/flexbox/layoutmanager/container/dx/ItemData;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DxPreloadExecutor$startPrefetch$1 extends Lambda implements rul<f, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ List $preloadList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxPreloadExecutor$startPrefetch$1(List list) {
        super(1);
        this.$preloadList = list;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(f fVar) {
        invoke2(fVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(f it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca597260", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        if (it.d() >= 1) {
            return;
        }
        List list = this.$preloadList;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = it.a();
        dXTemplateItem.b = it.b();
        dXTemplateItem.c = it.c();
        t tVar = t.INSTANCE;
        list.add(dXTemplateItem);
    }
}
