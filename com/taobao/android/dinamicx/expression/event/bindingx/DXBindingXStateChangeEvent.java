package com.taobao.android.dinamicx.expression.event.bindingx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class DXBindingXStateChangeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIEWWIDGETNODE_ONBINDINGXFINISH = -5192979070104500639L;
    public static final long DXVIEWWIDGETNODE_ONBINDINGXSTART = -1026451533627932147L;
    public static final long DXVIEWWIDGETNODE_ONBINDINGXSTOP = 6689515913358780580L;
    public String specName;

    static {
        kge.a(-801540509);
    }

    public static /* synthetic */ Object ipc$super(DXBindingXStateChangeEvent dXBindingXStateChangeEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXBindingXStateChangeEvent(long j, String str) {
        super(j);
        this.specName = str;
        HashMap hashMap = new HashMap();
        hashMap.put("specName", f.a(str));
        setArgs(hashMap);
    }

    public String getSpecName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("925a321d", new Object[]{this}) : this.specName;
    }

    public void setSpecName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c96bf9", new Object[]{this, str});
            return;
        }
        getNonNullArgs().put("specName", f.a(str));
        this.specName = str;
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
