package tb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.context.a;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public class nph extends iuf<FrameLayout, com.taobao.android.meta.structure.state.b> implements com.taobao.android.meta.structure.state.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f31623a;
    private ViewGroup c;
    private View g;
    private MetaState b = MetaState.DEFAULT;
    private final npd d = new npd();
    private boolean e = true;

    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            nph.this.a(MetaState.UPDATING);
            com.taobao.android.meta.structure.state.b q = nph.this.q();
            if (q == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.structure.state.page.MetaPageStatePresenter");
            }
            htv widget = ((htu) q).getWidget();
            q.a((Object) widget, "(presenter as MetaPageStatePresenter).widget");
            iru iruVar = (iru) widget.getModel();
            q.a((Object) iruVar, "(presenter as MetaPageStatePresenter).widget.model");
            ((com.taobao.android.meta.data.b) iruVar.d()).doNewSearch();
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    static {
        kge.a(-738318592);
        kge.a(-1796828551);
    }

    public static /* synthetic */ Object ipc$super(nph nphVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : da_();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    public final FrameLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("77b49aab", new Object[]{this});
        }
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    @Override // com.taobao.android.meta.structure.state.c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = z;
        View view = this.g;
        if (view == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        if (viewGroup == null) {
            q.a();
        }
        this.c = viewGroup;
        this.f31623a = new FrameLayout(context);
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    public FrameLayout da_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c5597430", new Object[]{this});
        }
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    @Override // com.taobao.android.meta.structure.state.a
    public void a(MetaState state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56669f5e", new Object[]{this, state});
            return;
        }
        q.c(state, "state");
        if (this.b == state) {
            return;
        }
        this.b = state;
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        frameLayout.removeAllViews();
        int i = npi.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            e();
        } else if (i == 2) {
            f();
        } else {
            ViewGroup viewGroup = this.c;
            if (viewGroup == null) {
                q.b("container");
            }
            FrameLayout frameLayout2 = this.f31623a;
            if (frameLayout2 == null) {
                q.b("rootView");
            }
            viewGroup.removeView(frameLayout2);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        if (frameLayout.getParent() != null) {
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            q.b("container");
        }
        FrameLayout frameLayout2 = this.f31623a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        viewGroup.addView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
    }

    public void e() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        if (!q.a((Object) "degrade", (Object) (downgradeStrategy != null ? downgradeStrategy.getTacticsPerformance() : null)) || !r.e("loadngNoAnim") || !r.bw()) {
            z = false;
        }
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        LayoutInflater from = LayoutInflater.from(frameLayout.getContext());
        int i = !z ? R.layout.sf_tbsearch_ms_loading : R.layout.sf_tbsearch_ms_loading_low;
        FrameLayout frameLayout2 = this.f31623a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        View view = from.inflate(i, (ViewGroup) frameLayout2, false);
        view.setOnClickListener(c.INSTANCE);
        FrameLayout frameLayout3 = this.f31623a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        frameLayout3.addView(view);
        d();
        if (a()) {
            view.setBackgroundColor(0);
        } else {
            Activity mActivity = this.f;
            q.a((Object) mActivity, "mActivity");
            q.a((Object) view, "view");
            npg.a((Context) mActivity, view);
        }
        this.g = view;
        if (h()) {
            return;
        }
        q.a((Object) view, "view");
        view.setVisibility(4);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        com.taobao.android.meta.structure.state.b q = q();
        if (q == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.structure.state.page.MetaPageStatePresenter");
        }
        htv widget = ((htu) q).getWidget();
        q.a((Object) widget, "(presenter as MetaPageStatePresenter).widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "(presenter as MetaPageStatePresenter).widget.model");
        a f = iruVar.f();
        if (f == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.context.CommonSearchContext");
        }
        return ((CommonSearchContext) f).isGallerySrp();
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        npd npdVar = this.d;
        FrameLayout frameLayout = this.f31623a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        Context context = frameLayout.getContext();
        q.a((Object) context, "rootView.context");
        com.taobao.android.meta.structure.state.b q = q();
        if (q == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.structure.state.page.MetaPageStatePresenter");
        }
        htv widget = ((htu) q).getWidget();
        q.a((Object) widget, "(presenter as MetaPageStatePresenter).widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "(presenter as MetaPageStatePresenter).widget.model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) iruVar.d()).getLastSearchResult();
        View a2 = npdVar.a(context, metaResult != null ? metaResult.getError() : null, new b());
        FrameLayout frameLayout2 = this.f31623a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        frameLayout2.addView(a2);
        d();
    }
}
