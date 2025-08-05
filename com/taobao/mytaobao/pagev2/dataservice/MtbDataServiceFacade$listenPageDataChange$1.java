package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.mtz;
import tb.ruw;
import tb.rva;
import tb.xnq;
import tb.xnr;
import tb.xoo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "hierarchyData", "Lcom/alibaba/fastjson/JSONObject;", "hierarchyMap", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbDataServiceFacade$listenPageDataChange$1 extends Lambda implements rva<xnq, JSONObject, JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruw $dataChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDataServiceFacade$listenPageDataChange$1(ruw ruwVar) {
        super(3);
        this.$dataChangeListener = ruwVar;
    }

    @Override // tb.rva
    public /* bridge */ /* synthetic */ t invoke(xnq xnqVar, JSONObject jSONObject, JSONObject jSONObject2) {
        invoke2(xnqVar, jSONObject, jSONObject2);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final xnq reason, JSONObject hierarchyData, JSONObject hierarchyMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b280354", new Object[]{this, reason, hierarchyData, hierarchyMap});
            return;
        }
        q.c(reason, "reason");
        q.c(hierarchyData, "hierarchyData");
        q.c(hierarchyMap, "hierarchyMap");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = hierarchyData.keySet();
        q.a((Object) keySet, "hierarchyData.keys");
        for (String moduleName : keySet) {
            JSONObject jSONObject = hierarchyData.getJSONObject(moduleName);
            if (jSONObject != null) {
                JSONObject jSONObject2 = hierarchyMap.getJSONObject(moduleName);
                if (jSONObject2 == null) {
                    q.a();
                }
                a aVar = a.INSTANCE;
                xoo xooVar = a.$ipChange;
                int a2 = xnr.a(reason);
                q.a((Object) moduleName, "moduleName");
                linkedHashMap.put(moduleName, xooVar.a(a2, moduleName, jSONObject2, jSONObject));
            }
        }
        mtz.a(new Runnable() { // from class: com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade$listenPageDataChange$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MtbDataServiceFacade$listenPageDataChange$1.this.$dataChangeListener.mo2423invoke(reason, linkedHashMap);
                }
            }
        });
    }
}
