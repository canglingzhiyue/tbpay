package com.taobao.android.detail.core.standard.widget.overpull;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content.AURAOverPullContentViewBehavior;
import com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.AURAOverPullExtraViewBehavior;
import com.taobao.taobao.R;
import tb.arc;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View b;
    private View c;
    private FrameLayout d;
    private AURAOverPullExtraViewBehavior e;
    private AURAOverPullContentViewBehavior f;
    private b g;
    private final CoordinatorLayout l;

    /* renamed from: a  reason: collision with root package name */
    private final String f9912a = "AURAOverPullContainerLayoutDelegate";
    private int h = 0;
    private float i = 0.5f;
    private int j = 0;
    private int k = 1;

    static {
        kge.a(1683735036);
        kge.a(1332903710);
        kge.a(-1799532654);
    }

    public a(CoordinatorLayout coordinatorLayout) {
        this.l = coordinatorLayout;
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayoutDelegate");
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.l.addView(view);
        }
    }

    private Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.l.getContext();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        b().a(i);
        AURAOverPullContentViewBehavior aURAOverPullContentViewBehavior = this.f;
        if (aURAOverPullContentViewBehavior == null) {
            return;
        }
        aURAOverPullContentViewBehavior.a(i);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        b().b(i);
        AURAOverPullContentViewBehavior aURAOverPullContentViewBehavior = this.f;
        if (aURAOverPullContentViewBehavior == null) {
            return;
        }
        aURAOverPullContentViewBehavior.b(i);
    }

    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        this.i = f;
        this.h = i;
        b().a(f, i);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc152cf", new Object[]{this, bVar});
        } else {
            this.g = bVar;
        }
    }

    public void a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7536b928", new Object[]{this, view, view2});
            return;
        }
        this.b = view;
        this.c = view2;
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        view.setVisibility(4);
        view2.setVisibility(0);
        AURAOverPullExtraViewBehavior b = b();
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            this.d = new FrameLayout(a());
            this.d.setId(R.id.standard_detail_gallery_over_pull_end_extra_handler);
            CoordinatorLayout.b bVar = new CoordinatorLayout.b(-2, -1);
            bVar.a(b);
            this.d.setLayoutParams(bVar);
        } else {
            frameLayout.removeAllViews();
        }
        AURAOverPullContentViewBehavior aURAOverPullContentViewBehavior = this.f;
        if (aURAOverPullContentViewBehavior != null) {
            aURAOverPullContentViewBehavior.a(this.d.getId());
        }
        if (view2.getParent() == null) {
            this.d.addView(view2);
        }
        if (view.getParent() == null) {
            this.d.addView(view);
        }
        if (this.d.getParent() != null) {
            return;
        }
        a(this.d);
    }

    private AURAOverPullExtraViewBehavior b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAOverPullExtraViewBehavior) ipChange.ipc$dispatch("f1a43b18", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new AURAOverPullExtraViewBehavior(a());
        }
        this.e.a(this);
        this.e.a(this.i, this.h);
        this.e.a(this.j);
        this.e.b(this.k);
        return this.e;
    }

    public void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
            return;
        }
        CoordinatorLayout.b bVar = new CoordinatorLayout.b(-1, -2);
        this.f = new AURAOverPullContentViewBehavior(a());
        this.f.a(this.j);
        this.f.b(this.k);
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            this.f.a(frameLayout.getId());
        }
        bVar.a(this.f);
        recyclerView.setLayoutParams(bVar);
        recyclerView.setPadding(0, 0, 2 == this.k ? 0 : this.h, 0);
        recyclerView.setClipToPadding(false);
        a((View) recyclerView);
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.b
    public boolean a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b3cae", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        b bVar = this.g;
        if (bVar == null) {
            arc.a().c("AURAOverPullContainerLayoutDelegate", "onEnterLoadMore", "mCallback is null");
            return true;
        } else if (bVar.a(view, z)) {
            return true;
        } else {
            a(true);
            return true;
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.b
    public boolean b(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6b89af", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        b bVar = this.g;
        if (bVar == null) {
            arc.a().c("AURAOverPullContainerLayoutDelegate", "onExitLoadMore", "mCallback is null");
            return true;
        } else if (bVar.b(view, z)) {
            return true;
        } else {
            a(false);
            return true;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.c;
        if (view == null || this.b == null) {
            return;
        }
        int i = 4;
        view.setVisibility(z ? 4 : 0);
        View view2 = this.b;
        if (z) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.b
    public boolean a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4660659a", new Object[]{this, recyclerView})).booleanValue();
        }
        b bVar = this.g;
        return bVar != null && bVar.a(recyclerView);
    }
}
