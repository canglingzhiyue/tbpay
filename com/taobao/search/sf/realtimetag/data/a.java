package com.taobao.search.sf.realtimetag.data;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.Map;
import tb.kge;
import tb.nog;
import tb.nps;

/* loaded from: classes8.dex */
public class a extends nps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1696417653);
    }

    public a(String str, Map<String, String> map, int i) {
        super(b.APP_ID_VALUE, nog.CLICK_TRACE);
        b("vm", "nw");
        b("m", "clicktrace");
        b("rainbow", com.taobao.search.rainbow.a.c());
        if (!StringUtils.isEmpty(str)) {
            b("traceInfo", str);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                    b(entry.getKey(), entry.getValue());
                }
            }
        }
        if (i >= 0) {
            b(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i));
        }
    }

    public static a a(String str, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4cfbbc3d", new Object[]{str, map, new Integer(i)});
        }
        a aVar = new a(str, map, i);
        aVar.a("29790");
        aVar.b("isCard", "true");
        return aVar;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            b("insertItems", str);
        }
    }
}
