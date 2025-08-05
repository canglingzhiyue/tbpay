package com.taobao.mytaobao.ultron;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.bgp;
import tb.bnn;
import tb.bnv;
import tb.bny;
import tb.hii;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016H\u0016J\b\u0010\u0007\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taobao/mytaobao/ultron/MyTBLayoutExtendV2;", "Lcom/alibaba/android/ultron/vfw/layout/AbsLayoutExtend;", "rv", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", bgp.FRAGMENT, "Landroid/support/v4/app/Fragment;", "(Lcom/taobao/mytaobao/view/MTPtrRecyclerView;Landroid/support/v4/app/Fragment;)V", "interceptRebuildBody", "", "mAdapter", "Lcom/alibaba/android/ultron/vfw/adapter/RecyclerViewAdapter;", "getMAdapter", "()Lcom/alibaba/android/ultron/vfw/adapter/RecyclerViewAdapter;", "setMAdapter", "(Lcom/alibaba/android/ultron/vfw/adapter/RecyclerViewAdapter;)V", "mLayoutManager", "Lcom/taobao/mytaobao/ultron/MTBLayoutManagerV2;", "getMLayoutManager", "()Lcom/taobao/mytaobao/ultron/MTBLayoutManagerV2;", "setMLayoutManager", "(Lcom/taobao/mytaobao/ultron/MTBLayoutManagerV2;)V", "mViewEngine", "Lcom/alibaba/android/ultron/vfw/core/ViewEngine;", "getMViewEngine", "()Lcom/alibaba/android/ultron/vfw/core/ViewEngine;", "setMViewEngine", "(Lcom/alibaba/android/ultron/vfw/core/ViewEngine;)V", "newDataCount", "getLayoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "context", "Landroid/content/Context;", "getRecyclerViewAdapter", "init", "", "viewEngine", "", "rebuildBody", com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, "Lcom/alibaba/android/ultron/vfw/core/DataSource;", "useCustomLayout", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class l extends hii {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private j f18528a;
    private bnn b;
    private bny c;
    private int d;
    private int e;
    private final MTPtrRecyclerView f;
    private final Fragment g;

    static {
        kge.a(1395023827);
    }

    @Override // tb.boz
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public l(MTPtrRecyclerView rv, Fragment fragment) {
        q.c(rv, "rv");
        q.c(fragment, "fragment");
        this.f = rv;
        this.g = fragment;
    }

    @Override // tb.boz
    public void a(bny viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215f60b", new Object[]{this, viewEngine});
            return;
        }
        q.c(viewEngine, "viewEngine");
        this.c = viewEngine;
        if (this.f18528a == null) {
            Context k = viewEngine.k();
            q.a((Object) k, "viewEngine.context");
            this.f18528a = new j(k, 1, false);
        }
        if (this.b != null) {
            return;
        }
        this.b = new bnn(this.c);
    }

    @Override // tb.hii
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = this.f.getAdapter();
        if (adapter == null || this.f.getFlEndViewContainer() == null || this.d != 1 || adapter.getItemCount() - 1 != this.e) {
            return false;
        }
        this.d = 2;
        adapter.notifyItemRangeChanged(0, adapter.getItemCount() - 1);
        TLog.loge("mtbMainLink", "notifyItemRangeChanged， newDataCount=" + this.e);
        return true;
    }

    @Override // tb.boz
    public RecyclerView.LayoutManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("9b5f6525", new Object[]{this, context});
        }
        j jVar = this.f18528a;
        if (jVar == null) {
            q.a();
        }
        return jVar;
    }

    @Override // tb.boz
    public void a(bnv dataSource) {
        IDMComponent iDMComponent;
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, dataSource});
            return;
        }
        q.c(dataSource, "dataSource");
        bnn bnnVar = this.b;
        int size = (bnnVar == null || (a2 = bnnVar.a()) == null) ? 0 : a2.size();
        List<IDMComponent> f = dataSource.f();
        this.e = f != null ? f.size() : 0;
        List<IDMComponent> f2 = dataSource.f();
        String tag = (f2 == null || (iDMComponent = (IDMComponent) p.a((List<? extends Object>) f2, this.e - 1)) == null) ? null : iDMComponent.getTag();
        Lifecycle lifecycle = this.g.getLifecycle();
        q.a((Object) lifecycle, "fragment.lifecycle");
        boolean isAtLeast = lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
        int i = this.e;
        if (i > 0 && size > 0 && size == i && this.d == 0 && q.a((Object) tag, (Object) "basementTip") && isAtLeast) {
            this.d = 1;
        } else if (this.d == 1) {
            this.d = 0;
        }
        bnn bnnVar2 = this.b;
        if (bnnVar2 == null) {
            q.a();
        }
        bnnVar2.b(dataSource.f());
    }

    @Override // tb.boz
    public bnn b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnn) ipChange.ipc$dispatch("16b4811b", new Object[]{this});
        }
        bnn bnnVar = this.b;
        if (bnnVar == null) {
            q.a();
        }
        return bnnVar;
    }
}
