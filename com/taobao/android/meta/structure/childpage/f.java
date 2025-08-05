package com.taobao.android.meta.structure.childpage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.itk;
import tb.iuf;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends iuf<FrameLayout, b> implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f14285a;
    private MetaLayout b;
    private final hte c;
    private LinearLayout d;
    private FrameLayout e;

    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.a(f.this).requestLayout();
            }
        }
    }

    static {
        kge.a(818141556);
        kge.a(174924889);
    }

    public f(hte metaConfig) {
        q.c(metaConfig, "metaConfig");
        this.c = metaConfig;
    }

    public static final /* synthetic */ MetaLayout a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("9a05f43", new Object[]{fVar});
        }
        MetaLayout metaLayout = fVar.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        return metaLayout;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : d();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    @Override // com.taobao.android.meta.structure.childpage.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.setListStart(i);
        new Handler().post(new a());
    }

    @Override // com.taobao.android.meta.structure.childpage.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.setHeaderOffset(i);
        MetaLayout metaLayout2 = this.b;
        if (metaLayout2 == null) {
            q.b("metaLayout");
        }
        metaLayout2.requestLayout();
    }

    @Override // com.taobao.android.meta.structure.childpage.c
    public void a(itk header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee561238", new Object[]{this, header});
            return;
        }
        q.c(header, "header");
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.addHeader(header);
    }

    @Override // com.taobao.android.meta.structure.childpage.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.clearHeaders();
    }

    @Override // com.taobao.android.meta.structure.childpage.c
    public MetaLayout bJ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("34de58cf", new Object[]{this});
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        return metaLayout;
    }

    @Override // com.taobao.android.meta.structure.childpage.c
    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this});
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            q.b("listContainer");
        }
        return linearLayout;
    }

    @Override // com.taobao.android.meta.structure.childpage.c
    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this});
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            q.b("leftBarContainer");
        }
        return frameLayout;
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        this.f14285a = new FrameLayout(context);
        this.b = new MetaLayout(context);
        if (this.c.at()) {
            MetaLayout metaLayout = this.b;
            if (metaLayout == null) {
                q.b("metaLayout");
            }
            metaLayout.layoutListFirst();
        }
        FrameLayout frameLayout = this.f14285a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        MetaLayout metaLayout2 = this.b;
        if (metaLayout2 == null) {
            q.b("metaLayout");
        }
        frameLayout.addView(metaLayout2, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.f14285a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout3 = this.f14285a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        frameLayout3.setFocusableInTouchMode(false);
        this.d = new LinearLayout(context);
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            q.b("listContainer");
        }
        linearLayout.setOrientation(0);
        MetaLayout metaLayout3 = this.b;
        if (metaLayout3 == null) {
            q.b("metaLayout");
        }
        LinearLayout linearLayout2 = this.d;
        if (linearLayout2 == null) {
            q.b("listContainer");
        }
        metaLayout3.addListContainer(linearLayout2);
        this.e = new FrameLayout(context);
        LinearLayout linearLayout3 = this.d;
        if (linearLayout3 == null) {
            q.b("listContainer");
        }
        FrameLayout frameLayout4 = this.e;
        if (frameLayout4 == null) {
            q.b("leftBarContainer");
        }
        linearLayout3.addView(frameLayout4, -2, -1);
        MetaLayout metaLayout4 = this.b;
        if (metaLayout4 == null) {
            q.b("metaLayout");
        }
        metaLayout4.setHeaderChangeListener(q());
        this.c.U().a(new MetaChildPageView$createView$1(this));
        FrameLayout frameLayout5 = this.f14285a;
        if (frameLayout5 == null) {
            q.b("rootView");
        }
        return frameLayout5;
    }

    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this});
        }
        FrameLayout frameLayout = this.f14285a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }
}
