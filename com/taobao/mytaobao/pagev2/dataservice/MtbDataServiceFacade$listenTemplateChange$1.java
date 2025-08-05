package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.mtz;
import tb.ruw;
import tb.xnq;
import tb.xnr;
import tb.xol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", g.KEY_TEMPLATE_LIST, "Lcom/alibaba/fastjson/JSONArray;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbDataServiceFacade$listenTemplateChange$1 extends Lambda implements ruw<xnq, JSONArray, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruw $templateChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDataServiceFacade$listenTemplateChange$1(ruw ruwVar) {
        super(2);
        this.$templateChangeListener = ruwVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(xnq xnqVar, JSONArray jSONArray) {
        invoke2(xnqVar, jSONArray);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final xnq reason, JSONArray templateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ee537c", new Object[]{this, reason, templateList});
            return;
        }
        q.c(reason, "reason");
        q.c(templateList, "templateList");
        a aVar = a.INSTANCE;
        final List<xol> a2 = a.$ipChange.a(xnr.a(reason), templateList, null);
        mtz.a(new Runnable() { // from class: com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade$listenTemplateChange$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MtbDataServiceFacade$listenTemplateChange$1.this.$templateChangeListener.mo2423invoke(reason, a2);
                }
            }
        });
    }
}
