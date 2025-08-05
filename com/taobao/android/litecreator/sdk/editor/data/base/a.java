package com.taobao.android.litecreator.sdk.editor.data.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a<T> implements b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private T f13432a;
    private List<d<T>> b = new ArrayList();

    static {
        kge.a(1282976342);
        kge.a(380264027);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.b
    public T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f13432a;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.b
    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        this.f13432a = t;
        for (d<T> dVar : this.b) {
            dVar.a(this);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.c
    public void a(d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d709d7", new Object[]{this, dVar});
        } else if (this.b.contains(dVar)) {
        } else {
            this.b.add(dVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.data.base.c
    public void b(d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdad536", new Object[]{this, dVar});
        } else if (!this.b.contains(dVar)) {
        } else {
            this.b.remove(dVar);
        }
    }
}
