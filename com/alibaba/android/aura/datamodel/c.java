package com.alibaba.android.aura.datamodel;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class c<DATA extends Serializable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final DATA f2124a;
    private Map<String, Object> b;
    private Map<String, Object> c;
    private boolean d;
    private AURAFlowData e;
    private AURAGlobalData f;

    static {
        kge.a(1456392041);
    }

    private c(DATA data, AURAInputData aURAInputData) {
        this.f2124a = data;
        if (aURAInputData != null) {
            this.e = aURAInputData.getFlowData();
            this.f = aURAInputData.getGlobalData();
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public static <DATA extends Serializable> c<DATA> a(DATA data, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("625910d8", new Object[]{data, aURAInputData}) : new c<>(data, aURAInputData);
    }

    public DATA b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DATA) ipChange.ipc$dispatch("13b15ba1", new Object[]{this}) : this.f2124a;
    }

    public AURAGlobalData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("3d599e80", new Object[]{this}) : this.f;
    }

    public AURAFlowData d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAFlowData) ipChange.ipc$dispatch("f0be4b16", new Object[]{this}) : this.e;
    }

    public Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.b;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.c;
    }
}
