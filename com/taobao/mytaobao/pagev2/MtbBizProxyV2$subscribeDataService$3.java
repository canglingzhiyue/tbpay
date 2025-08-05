package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;
import tb.xnq;
import tb.xol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "list", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$3 extends Lambda implements ruw<xnq, List<? extends xol>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$3(a aVar) {
        super(2);
        this.this$0 = aVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(xnq xnqVar, List<? extends xol> list) {
        invoke2(xnqVar, (List<xol>) list);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(xnq reason, List<xol> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1662f45", new Object[]{this, reason, list});
            return;
        }
        q.c(reason, "reason");
        q.c(list, "list");
        ArrayList arrayList = new ArrayList();
        for (xol xolVar : list) {
            DXTemplateItem e = xolVar.e();
            if (e != null && q.a((Object) xolVar.c(), (Object) "dinamicx")) {
                arrayList.add(e);
            }
        }
        this.this$0.g().c().a(arrayList);
    }
}
