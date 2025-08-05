package com.taobao.android.dinamicx.widget.recycler.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerLayoutExposeEventBase extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object data;
    public long duration;
    public int index;

    static {
        kge.a(656227677);
    }

    public DXRecyclerLayoutExposeEventBase(long j, int i, Object obj, long j2) {
        super(j);
        this.index = i;
        this.data = obj;
        this.duration = j2;
        HashMap hashMap = new HashMap();
        hashMap.put("index", f.a(i));
        if (obj instanceof JSONObject) {
            hashMap.put("data", f.a((JSONObject) obj));
        } else if (obj instanceof Object) {
            hashMap.put("data", f.a(obj));
        }
        hashMap.put("duration", f.a(j2));
        setArgs(hashMap);
    }

    public String toStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("193e1b03", new Object[]{this});
        }
        return "DXRecyclerLayoutExposeEventBase{index=" + this.index + ", duration=" + this.duration + '}';
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue() : this.duration;
    }
}
