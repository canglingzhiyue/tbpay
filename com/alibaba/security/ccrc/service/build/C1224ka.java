package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@InterfaceC1206ea(name = {"bhDetect"})
/* renamed from: com.alibaba.security.ccrc.service.build.ka  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1224ka extends AbstractC1200ca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1200ca
    public boolean a(Context context, String str, String str2, InterfaceC1203da interfaceC1203da) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3ab13f", new Object[]{this, context, str, str2, interfaceC1203da})).booleanValue();
        }
        Map<String, Object> map = JsonUtils.toMap(str2);
        String str3 = (String) map.get(Ta.h);
        if (StringUtils.isEmpty(str3)) {
            AbstractC1200ca.a(interfaceC1203da, "参数异常", null);
            return true;
        }
        CcrcBHService bHService = CcrcBHService.getBHService(str3);
        Map map2 = (Map) map.get("inputDict");
        if (map2 == null || map2.isEmpty() || bHService == null) {
            AbstractC1200ca.a(interfaceC1203da, "参数异常", null);
            return true;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            hashMap.put(entry.getKey(), JsonUtils.toJSONString(entry.getValue()));
        }
        bHService.detect(hashMap);
        AbstractC1200ca.a(interfaceC1203da, null);
        return true;
    }
}
