package com.taobao.android.detail.core.detail.popup;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<T> f9637a = new ArrayList();
    private List<T> b = new ArrayList();
    private List<T> c = new ArrayList();

    static {
        kge.a(1864051387);
    }

    public a() {
        emu.a("com.taobao.android.detail.core.detail.popup.AbsDataSource");
    }

    public void a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.f9637a.clear();
            this.f9637a.addAll(list);
        }
    }

    public void b(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.b.clear();
            this.b.addAll(list);
        }
    }

    public void c(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.c.clear();
            this.c.addAll(list);
        }
    }

    public List<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f9637a;
    }

    public List<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }

    public List<T> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
    }
}
