package com.taobao.homepage.pop.mtop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.mtop.PopFatigueReportMtopParams;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
        } else if (!b(iPopData)) {
            c.a("PopFatigueReport", "pop fatigue report enable is close");
        } else {
            new PopFatigueReportClient().execute(c(iPopData).a(), a(), null);
        }
    }

    private boolean b(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539b55fb", new Object[]{this, iPopData})).booleanValue();
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null) {
            return popConfig.enablePopControl();
        }
        return false;
    }

    private com.taobao.android.trade.boost.request.mtop.a<PopFatigueReportResult> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.boost.request.mtop.a) ipChange.ipc$dispatch("b9fe3a75", new Object[]{this}) : new com.taobao.android.trade.boost.request.mtop.a<PopFatigueReportResult>() { // from class: com.taobao.homepage.pop.mtop.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                } else {
                    c.a("PopFatigueReport", "pop fatigue report onSystemFailure");
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else {
                    c.a("PopFatigueReport", "pop fatigue report failure");
                }
            }
        };
    }

    private PopFatigueReportMtopParams.a c(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopFatigueReportMtopParams.a) ipChange.ipc$dispatch("31e5ee17", new Object[]{this, iPopData});
        }
        PopFatigueReportMtopParams.a aVar = new PopFatigueReportMtopParams.a();
        aVar.a(iPopData.getBusinessID());
        JSONObject passParam = iPopData.getPassParam();
        if (passParam != null) {
            aVar.b(passParam.toJSONString());
        }
        return aVar;
    }
}
