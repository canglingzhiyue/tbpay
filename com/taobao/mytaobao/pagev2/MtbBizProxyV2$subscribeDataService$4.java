package com.taobao.mytaobao.pagev2;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.event.r;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.nwv;
import tb.rul;
import tb.xnq;
import tb.xor;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$4 extends Lambda implements rul<xnq, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$4(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(xnq xnqVar) {
        invoke2(xnqVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(xnq reason) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618eca54", new Object[]{this, reason});
            return;
        }
        q.c(reason, "reason");
        Map<String, Object> a2 = reason.a();
        if (q.a(a2 != null ? a2.get("refreshBasement") : null, (Object) true)) {
            b b = a.b(this.this$0);
            String str = com.taobao.mytaobao.basement.Bridge.a.b;
            q.a((Object) str, "BasementEventSender.EVENT_NOTIFY_MYTAOBAO_REFRESH");
            b.a(str, (JSONObject) null);
        }
        a.e(this.this$0);
        a aVar = this.this$0;
        xor.a(a.$ipChange, false, 1, null);
        if (reason.b() != 3) {
            return;
        }
        r.a();
        nwv.f("fullDataChange");
        MTPtrRecyclerView e = this.this$0.e();
        if (e == null || !e.hasPendingAdapterUpdates()) {
            return;
        }
        a.c(this.this$0).notifyDataSetChanged();
        TLog.loge("mtbMainLink", "mPendingUpdates任务堆积，补偿消费");
    }
}
