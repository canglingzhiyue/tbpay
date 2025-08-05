package com.taobao.detail.rate.vivid.dinamicX.eve;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class DXExpandButtonExposedEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isExpanded;

    public static /* synthetic */ Object ipc$super(DXExpandButtonExposedEvent dXExpandButtonExposedEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXExpandButtonExposedEvent(long j, boolean z) {
        super(j);
        this.isExpanded = z;
        HashMap hashMap = new HashMap();
        hashMap.put("isExpanded", f.a(z));
        setArgs(hashMap);
    }

    public boolean getIsExpanded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a230ec04", new Object[]{this})).booleanValue() : this.isExpanded;
    }

    public void setIsExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac3e048", new Object[]{this, new Boolean(z)});
            return;
        }
        getNonNullArgs().put("isExpanded", f.a(z));
        this.isExpanded = z;
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
