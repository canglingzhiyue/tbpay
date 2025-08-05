package com.taobao.android.dinamicx.expression.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class DXScrollLayoutBaseExposeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLLAYOUTBASE_ONEXPOSURE = 6278152710403332930L;

    static {
        kge.a(523715841);
    }

    public DXScrollLayoutBaseExposeEvent(int i, Object obj) {
        super(DXSCROLLLAYOUTBASE_ONEXPOSURE);
        setData(i, obj);
    }

    private void setData(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f015f8c", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (this.args == null) {
            this.args = new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", f.a(i));
        if (obj instanceof JSONObject) {
            hashMap.put("data", f.a((JSONObject) obj));
        } else if (obj != null) {
            hashMap.put("data", f.a(obj));
        }
        setArgs(hashMap);
    }
}
