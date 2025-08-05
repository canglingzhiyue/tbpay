package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.lb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1228lb extends BaseWorkConfHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler
    public Map<String, Object> b(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list) {
        List<String> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3d8fb2f", new Object[]{this, map, map2, list});
        }
        for (BxData.OpConfItemValue opConfItemValue : list) {
            Object obj = map2.get(opConfItemValue.name);
            if (obj != null) {
                Map map3 = (Map) JsonUtils.parseObject(opConfItemValue.input, (Class<Object>) Map.class);
                if (map3 == null || (list2 = (List) map3.get("targets")) == null) {
                    return map2;
                }
                for (String str : list2) {
                    map2.put(str, obj);
                }
            }
        }
        return map2;
    }
}
