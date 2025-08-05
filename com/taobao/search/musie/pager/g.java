package com.taobao.search.musie.pager;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.jwu;
import tb.kge;

/* loaded from: classes7.dex */
public final class g extends RecyclerView.Adapter<f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<i> f19268a;
    private final MUSDKInstance b;

    static {
        kge.a(351619508);
    }

    public g(MUSDKInstance instance) {
        q.c(instance, "instance");
        this.b = instance;
        this.f19268a = new ArrayList<>();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, fVar, new Integer(i)});
        } else {
            a(fVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.taobao.search.musie.pager.f, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ f mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public final void a(List<? extends i> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        q.c(list, "list");
        this.f19268a.clear();
        this.f19268a.addAll(list);
        notifyItemRangeChanged(0, getItemCount());
    }

    public f a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d55d136f", new Object[]{this, viewGroup, new Integer(i)});
        }
        MUSView a2 = jwu.a(this.b);
        q.a((Object) a2, "MUSViewPool.acquireMUSView(instance)");
        return new f(a2);
    }

    public void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d11ba88", new Object[]{this, fVar, new Integer(i)});
        } else if (fVar == null) {
        } else {
            i iVar = this.f19268a.get(i);
            q.a((Object) iVar, "childList[position]");
            fVar.a(iVar, this.b);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f19268a.size();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Iterator<i> it = this.f19268a.iterator();
        while (it.hasNext()) {
            i node = it.next();
            q.a((Object) node, "node");
            MUSView g = node.g();
            if (g != null) {
                g.release(true);
            }
            MUSView g2 = node.g();
            if (g2 != null) {
                g2.setInstance(null);
            }
        }
    }
}
