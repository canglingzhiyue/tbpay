package com.taobao.detail.rate.vivid.dinamicX.eve;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class DXTagFlowStateChangedEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String expandType;
    private boolean isExpanded;
    private int showLines;
    private int totalLines;

    public static /* synthetic */ Object ipc$super(DXTagFlowStateChangedEvent dXTagFlowStateChangedEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXTagFlowStateChangedEvent(long j, boolean z, int i, int i2, String str) {
        super(j);
        this.isExpanded = z;
        this.showLines = i;
        this.totalLines = i2;
        this.expandType = str;
        HashMap hashMap = new HashMap();
        hashMap.put("isExpanded", f.a(z));
        hashMap.put("showLines", f.a(i));
        hashMap.put("totalLines", f.a(i2));
        hashMap.put("expandType", f.a(str));
        setArgs(hashMap);
    }

    public String getExpandType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4fa8884f", new Object[]{this}) : this.expandType;
    }

    public void setExpandType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c520907", new Object[]{this, str});
            return;
        }
        getNonNullArgs().put("expandType", f.a(str));
        this.expandType = str;
    }

    public int getTotalLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b566ba0b", new Object[]{this})).intValue() : this.totalLines;
    }

    public void setTotalLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e47955f", new Object[]{this, new Integer(i)});
            return;
        }
        getNonNullArgs().put("totalLines", f.a(i));
        this.totalLines = i;
    }

    public int getShowLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d1149c6", new Object[]{this})).intValue() : this.showLines;
    }

    public void setShowLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0ecb9c", new Object[]{this, new Integer(i)});
            return;
        }
        getNonNullArgs().put("showLines", f.a(i));
        this.showLines = i;
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
