package com.taobao.detail.rate.view.adapter;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.FlowLayout;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<T> f17038a;
    private InterfaceC0653a b;
    private HashSet<Integer> c = new HashSet<>();
    private b d;

    /* renamed from: com.taobao.detail.rate.view.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0653a {
        void onChanged();
    }

    /* loaded from: classes7.dex */
    public interface b {
        void onViewChanged();
    }

    public abstract View a(FlowLayout flowLayout, int i, T t);

    public boolean a(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d36ff2bb", new Object[]{this, new Integer(i), t})).booleanValue();
        }
        return false;
    }

    public a(List<T> list) {
        this.f17038a = list;
    }

    public void a(InterfaceC0653a interfaceC0653a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bdf88e1", new Object[]{this, interfaceC0653a});
        } else {
            this.b = interfaceC0653a;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bdffd40", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public void a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f17038a = list;
        }
    }

    public HashSet<Integer> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("be7f2185", new Object[]{this}) : this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        List<T> list = this.f17038a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.onChanged();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.onViewChanged();
        }
    }

    public T a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        List<T> list = this.f17038a;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }
}
