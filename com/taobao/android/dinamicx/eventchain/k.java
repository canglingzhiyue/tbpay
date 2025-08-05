package com.taobao.android.dinamicx.eventchain;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.fqp;
import tb.kge;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, b> f11860a = new HashMap();
    private Map<String, fqp> b = new HashMap();

    static {
        kge.a(-986975485);
    }

    public boolean a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea151078", new Object[]{this, str, bVar})).booleanValue();
        }
        this.f11860a.put(str, bVar);
        return true;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8650a6a6", new Object[]{this, str}) : this.f11860a.get(str);
    }

    public fqp b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fqp) ipChange.ipc$dispatch("7d1c0d4e", new Object[]{this, str}) : this.b.get(str);
    }

    public void a(Map<String, fqp> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.b.putAll(map);
        }
    }
}
