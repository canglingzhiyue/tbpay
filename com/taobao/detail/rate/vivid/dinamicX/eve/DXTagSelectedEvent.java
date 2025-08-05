package com.taobao.detail.rate.vivid.dinamicX.eve;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class DXTagSelectedEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject tag;

    public static /* synthetic */ Object ipc$super(DXTagSelectedEvent dXTagSelectedEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXTagSelectedEvent(long j, JSONObject jSONObject) {
        super(j);
        this.tag = jSONObject;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", f.a(jSONObject));
        setArgs(hashMap);
    }

    public JSONObject getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a9a7620b", new Object[]{this}) : this.tag;
    }

    public void setTag(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96d9271", new Object[]{this, jSONObject});
            return;
        }
        getNonNullArgs().put("tag", f.a(jSONObject));
        this.tag = jSONObject;
    }

    private Map<String, f> getNonNullArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f6b6d77", new Object[]{this});
        }
        if (getArgs() == null) {
            setArgs(new HashMap());
        }
        return getArgs();
    }
}
