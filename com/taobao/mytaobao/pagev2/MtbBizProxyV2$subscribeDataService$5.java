package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.nwv;
import tb.ruw;
import tb.xnq;
import tb.xol;
import tb.xop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "changeMap", "", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$5 extends Lambda implements ruw<xnq, Map<String, ? extends xol>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$5(a aVar) {
        super(2);
        this.this$0 = aVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(xnq xnqVar, Map<String, ? extends xol> map) {
        invoke2(xnqVar, (Map<String, xol>) map);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(xnq reason, Map<String, xol> changeMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f29eb1", new Object[]{this, reason, changeMap});
            return;
        }
        q.c(reason, "reason");
        q.c(changeMap, "changeMap");
        nwv.f("listenPageDataChange callback");
        List<xol> a2 = a.c(this.this$0).a();
        a aVar = this.this$0;
        List<xol> a3 = a.$ipChange.a(changeMap, a.c(this.this$0).a());
        a.a(this.this$0, a3, new xop(a2, a3));
    }
}
