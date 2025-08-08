package com.taobao.search.sf.realtimetag.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.u;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taolive.room.utils.aw;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.nog;
import tb.nps;

/* loaded from: classes8.dex */
public class b extends nps {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_ID_VALUE = "8940";
    public JSONObject b;
    private boolean c;
    private int d;

    static {
        kge.a(689952701);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public b(String str, String str2, Map<String, String> map, int i) {
        super(str, nog.CLICK_TRACE);
        this.c = false;
        b("vm", "nw");
        b("m", noa.VALUE_MODULE_DYNAMIC_CARD);
        b("ttid", TaoHelper.getTTID());
        if (!StringUtils.isEmpty(str2)) {
            b("traceInfo", str2);
        }
        a(map);
        if (i >= 0) {
            this.d = i;
            b(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i));
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public b(String str, Map<String, String> map, int i) {
        this(u.o(), str, map, i);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                    b(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                    a(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            k.e("DynamicCardRequest", "jarvis status: " + str);
            b(noa.KEY_JARVIS_STATUS, str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            b("insertItems", str);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            k.e("DynamicCardRequest", "jarvis feature: " + str);
            b(noa.KEY_JARVIS_FEATURE, str);
        }
    }
}
