package com.taobao.search.sf.widgets.topbar;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.search.common.util.q;
import java.util.Map;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-135071966);
    }

    public static boolean a(Map<String, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5cd2702", new Object[]{map, aVar})).booleanValue();
        }
        if (map == null || map.size() == 0) {
            q.b("SFTopBarParamsUtil", "isParamsSelected:params为空");
            return false;
        } else if (aVar == null) {
            q.b("SFTopBarParamsUtil", "isParamsSelected:datasource为空");
            return false;
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (StringUtils.isEmpty(key)) {
                    q.b("SFTopBarParamsUtil", "isParamsSelected:参数key为空");
                    return false;
                } else if (noa.KEY_FILTER_TAG.equals(key)) {
                    q.b("SFTopBarParamsUtil", "isParamsSelected:非关键参数`filterTag`跳过");
                } else if (!aVar.containParam(key, value)) {
                    q.a("SFTopBarParamsUtil", "isParamsSelected:参数值不一致");
                    return false;
                }
            }
            return true;
        }
    }
}
