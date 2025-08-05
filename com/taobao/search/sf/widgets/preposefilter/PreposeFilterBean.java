package com.taobao.search.sf.widgets.preposefilter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class PreposeFilterBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<a> buttonList;
    public List<String> multiValueKeys;
    private boolean refreshAll;
    public Map<String, String> traceMap;

    static {
        kge.a(-1012708175);
    }

    public final ArrayList<a> getButtonList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2f9327c7", new Object[]{this});
        }
        ArrayList<a> arrayList = this.buttonList;
        if (arrayList == null) {
            q.b("buttonList");
        }
        return arrayList;
    }

    public final void setButtonList(ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcc2ad1", new Object[]{this, arrayList});
            return;
        }
        q.c(arrayList, "<set-?>");
        this.buttonList = arrayList;
    }

    public final List<String> getMultiValueKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e13d08de", new Object[]{this});
        }
        List<String> list = this.multiValueKeys;
        if (list == null) {
            q.b(noa.KEY_MULTI_VALUE_KEYS);
        }
        return list;
    }

    public final void setMultiValueKeys(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc1346", new Object[]{this, list});
            return;
        }
        q.c(list, "<set-?>");
        this.multiValueKeys = list;
    }

    public final Map<String, String> getTraceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8f167c89", new Object[]{this});
        }
        Map<String, String> map = this.traceMap;
        if (map == null) {
            q.b("traceMap");
        }
        return map;
    }

    public final void setTraceMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5392c725", new Object[]{this, map});
            return;
        }
        q.c(map, "<set-?>");
        this.traceMap = map;
    }

    public final boolean getRefreshAll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a63b47", new Object[]{this})).booleanValue() : this.refreshAll;
    }

    public final void setRefreshAll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f87965", new Object[]{this, new Boolean(z)});
        } else {
            this.refreshAll = z;
        }
    }
}
