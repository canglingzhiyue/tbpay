package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;
import tb.ruw;
import tb.xnq;
import tb.xnr;
import tb.xon;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "fullData", "Lcom/alibaba/fastjson/JSONObject;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbDataServiceFacade$login$1 extends Lambda implements ruw<xnq, JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbDataServiceFacade$login$1 INSTANCE = new MtbDataServiceFacade$login$1();

    public MtbDataServiceFacade$login$1() {
        super(2);
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(xnq xnqVar, JSONObject jSONObject) {
        invoke2(xnqVar, jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(xnq reason, JSONObject fullData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160d0b1c", new Object[]{this, reason, fullData});
            return;
        }
        q.c(reason, "reason");
        q.c(fullData, "fullData");
        a aVar = a.INSTANCE;
        xon a2 = a.$ipChange.a(xnr.a(reason), fullData);
        if (a2 == null) {
            return;
        }
        a.a(aVar, a2);
        if (reason.b() == 1 || reason.b() == 2) {
            a.b(a.INSTANCE, a.$ipChange);
        }
        a aVar2 = a.INSTANCE;
        rul rulVar = a.$ipChange;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke(reason);
    }
}
