package com.taobao.search.musie.pager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.i;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class f extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MUSView f19267a;
    private i b;

    static {
        kge.a(1136154234);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView) {
        super(itemView);
        q.c(itemView, "itemView");
        this.f19267a = (MUSView) itemView;
    }

    public final void a(i nodeTree, MUSDKInstance instance) {
        MUSView g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf1a1e5", new Object[]{this, nodeTree, instance});
            return;
        }
        q.c(nodeTree, "nodeTree");
        q.c(instance, "instance");
        this.f19267a.setRoot(false);
        this.f19267a.setInstance(instance);
        this.f19267a.setScrollObserverEnabled(false);
        if ((!q.a(this.b, nodeTree)) && (g = nodeTree.g()) != null) {
            g.release(true);
        }
        this.b = nodeTree;
        this.f19267a.setUiNodeTree(nodeTree);
    }
}
