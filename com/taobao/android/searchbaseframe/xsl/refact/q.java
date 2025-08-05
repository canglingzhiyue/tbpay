package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import kotlin.TypeCastException;
import tb.iru;
import tb.itl;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes6.dex */
public final class q extends ius<Void, FrameLayout, iru<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>>> implements itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f15048a;
    private TBOldRefreshHeader b;
    private p c;
    private boolean d;
    private boolean e;

    static {
        kge.a(-1472799278);
        kge.a(733709958);
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "";
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Activity activity, ium parent, iru<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, iruVar, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
        } else if (this.d) {
        } else {
            if (((int) f) <= 0) {
                TBOldRefreshHeader tBOldRefreshHeader = this.b;
                if (tBOldRefreshHeader == null) {
                    kotlin.jvm.internal.q.b("refreshHeader");
                }
                tBOldRefreshHeader.changeToState(TBRefreshHeader.RefreshState.PULL_TO_REFRESH);
                TBOldRefreshHeader tBOldRefreshHeader2 = this.b;
                if (tBOldRefreshHeader2 == null) {
                    kotlin.jvm.internal.q.b("refreshHeader");
                }
                tBOldRefreshHeader2.setProgress(f);
                return;
            }
            TBOldRefreshHeader tBOldRefreshHeader3 = this.b;
            if (tBOldRefreshHeader3 == null) {
                kotlin.jvm.internal.q.b("refreshHeader");
            }
            tBOldRefreshHeader3.setProgress(f);
            TBOldRefreshHeader tBOldRefreshHeader4 = this.b;
            if (tBOldRefreshHeader4 == null) {
                kotlin.jvm.internal.q.b("refreshHeader");
            }
            tBOldRefreshHeader4.changeToState(TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.e == z) {
        } else {
            this.e = z;
            p pVar = this.c;
            if (pVar != null) {
                pVar.a(z);
            }
            p pVar2 = this.c;
            if (pVar2 != null) {
                pVar2.k();
            }
            if (getView() == 0) {
                return;
            }
            if (z) {
                FrameLayout frameLayout = this.f15048a;
                if (frameLayout == null) {
                    kotlin.jvm.internal.q.b("rootView");
                }
                TBOldRefreshHeader tBOldRefreshHeader = this.b;
                if (tBOldRefreshHeader == null) {
                    kotlin.jvm.internal.q.b("refreshHeader");
                }
                frameLayout.addView(tBOldRefreshHeader, new ViewGroup.LayoutParams(-1, -2));
                return;
            }
            FrameLayout frameLayout2 = this.f15048a;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.q.b("rootView");
            }
            frameLayout2.removeAllViews();
        }
    }

    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this}) : this.c;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = false;
        TBOldRefreshHeader tBOldRefreshHeader = this.b;
        if (tBOldRefreshHeader == null) {
            kotlin.jvm.internal.q.b("refreshHeader");
        }
        tBOldRefreshHeader.changeToState(TBRefreshHeader.RefreshState.NONE);
        p pVar = this.c;
        if (pVar != null) {
            pVar.j();
        }
        p pVar2 = this.c;
        if (pVar2 == null || !pVar2.i()) {
            return;
        }
        TBOldRefreshHeader tBOldRefreshHeader2 = this.b;
        if (tBOldRefreshHeader2 == null) {
            kotlin.jvm.internal.q.b("refreshHeader");
        }
        tBOldRefreshHeader2.changeToState(TBRefreshHeader.RefreshState.PULL_TO_REFRESH);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d) {
        } else {
            this.d = true;
            TBOldRefreshHeader tBOldRefreshHeader = this.b;
            if (tBOldRefreshHeader == null) {
                kotlin.jvm.internal.q.b("refreshHeader");
            }
            tBOldRefreshHeader.changeToState(TBRefreshHeader.RefreshState.REFRESHING);
            a aG = getModel().a().aG();
            if (aG == null) {
                return;
            }
            iru<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model = getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            aG.onPullRefreshTrigger(model.d().getIndex());
        }
    }

    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this});
        }
        this.f15048a = new PullRefreshContainer(getActivity());
        FrameLayout frameLayout = this.f15048a;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("rootView");
        }
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, com.taobao.android.searchbaseframe.util.j.a(300.0f)));
        this.b = new TBOldRefreshHeader(getActivity());
        TBOldRefreshHeader tBOldRefreshHeader = this.b;
        if (tBOldRefreshHeader == null) {
            kotlin.jvm.internal.q.b("refreshHeader");
        }
        View refreshView = tBOldRefreshHeader.getRefreshView();
        if (refreshView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView");
        }
        TextView refreshStateText = ((RefreshHeadView) refreshView).getRefreshStateText();
        kotlin.jvm.internal.q.a((Object) refreshStateText, "(refreshHeader.refreshVi…eadView).refreshStateText");
        refreshStateText.getLayoutParams().width = -2;
        TBOldRefreshHeader tBOldRefreshHeader2 = this.b;
        if (tBOldRefreshHeader2 == null) {
            kotlin.jvm.internal.q.b("refreshHeader");
        }
        FrameLayout frameLayout2 = this.f15048a;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.q.b("rootView");
        }
        if (frameLayout2 != null) {
            this.c = new p(this, tBOldRefreshHeader2, (PullRefreshContainer) frameLayout2, false, new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d(999, 3001, 1000));
            p pVar = this.c;
            if (pVar == null) {
                kotlin.jvm.internal.q.a();
            }
            pVar.a(this.e);
            if (this.e) {
                FrameLayout frameLayout3 = this.f15048a;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.q.b("rootView");
                }
                TBOldRefreshHeader tBOldRefreshHeader3 = this.b;
                if (tBOldRefreshHeader3 == null) {
                    kotlin.jvm.internal.q.b("refreshHeader");
                }
                frameLayout3.addView(tBOldRefreshHeader3, new ViewGroup.LayoutParams(-1, -2));
            }
            FrameLayout frameLayout4 = this.f15048a;
            if (frameLayout4 == null) {
                kotlin.jvm.internal.q.b("rootView");
            }
            return frameLayout4;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.PullRefreshContainer");
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        TBOldRefreshHeader tBOldRefreshHeader = this.b;
        if (tBOldRefreshHeader == null) {
            kotlin.jvm.internal.q.b("refreshHeader");
        }
        tBOldRefreshHeader.setBackgroundColor(i);
    }
}
