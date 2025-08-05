package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class npe extends iuf<FrameLayout, hto> implements htp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f31620a;
    private ProgressBar b;
    private TextView c;
    private boolean d;
    private TextView e;
    private View g;
    private View h;

    /* loaded from: classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!npe.a(npe.this)) {
            } else {
                npe.this.q().b();
            }
        }
    }

    static {
        kge.a(1722047083);
        kge.a(2007911709);
    }

    public static /* synthetic */ Object ipc$super(npe npeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ boolean a(npe npeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6a33519", new Object[]{npeVar})).booleanValue() : npeVar.d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    @Override // tb.htp
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        hte k_ = q().k_();
        String str = null;
        if (!(k_ instanceof com.taobao.android.meta.srp.a)) {
            k_ = null;
        }
        com.taobao.android.meta.srp.a aVar = (com.taobao.android.meta.srp.a) k_;
        if (aVar != null) {
            str = aVar.aq();
        }
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                q.a();
            }
            b(str);
        } else {
            String a2 = b.a(R.string.taobao_app_1005_1_16670);
            q.a((Object) a2, "Localization.localizedSt….taobao_app_1005_1_16670)");
            a(a2);
        }
        this.d = false;
        MetaResult metaResult = (MetaResult) q().as_().getTotalSearchResult();
        if (metaResult == null) {
            return;
        }
        if (metaResult == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) metaResult;
        if (commonSearchResult.newSearch && q().as_().getIndex() == 0) {
            FrameLayout frameLayout = this.f31620a;
            if (frameLayout == null) {
                q.b("rootView");
            }
            frameLayout.setVisibility(8);
        } else if (!commonSearchResult.guideSearch) {
        } else {
            FrameLayout frameLayout2 = this.f31620a;
            if (frameLayout2 == null) {
                q.b("rootView");
            }
            frameLayout2.setVisibility(8);
        }
    }

    @Override // tb.htp
    public void cY_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123876d0", new Object[]{this});
            return;
        }
        String a2 = b.a(R.string.taobao_app_1005_1_16677);
        q.a((Object) a2, "Localization.localizedSt….taobao_app_1005_1_16677)");
        a(a2);
        this.d = true;
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        View view = this.g;
        if (view == null) {
            q.b("dividerLeft");
        }
        view.setVisibility(8);
        View view2 = this.h;
        if (view2 == null) {
            q.b("dividerRight");
        }
        view2.setVisibility(8);
        TextView textView = this.e;
        if (textView == null) {
            q.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME);
        }
        textView.setVisibility(8);
        ProgressBar progressBar = this.b;
        if (progressBar == null) {
            q.b("progressBar");
        }
        progressBar.setVisibility(8);
        TextView textView2 = this.c;
        if (textView2 == null) {
            q.b("textView");
        }
        textView2.setVisibility(0);
        TextView textView3 = this.c;
        if (textView3 == null) {
            q.b("textView");
        }
        textView3.setText(str);
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ProgressBar progressBar = this.b;
        if (progressBar == null) {
            q.b("progressBar");
        }
        progressBar.setVisibility(8);
        View view = this.g;
        if (view == null) {
            q.b("dividerLeft");
        }
        view.setVisibility(0);
        View view2 = this.h;
        if (view2 == null) {
            q.b("dividerRight");
        }
        view2.setVisibility(0);
        TextView textView = this.c;
        if (textView == null) {
            q.b("textView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME);
        }
        textView2.setVisibility(0);
        TextView textView3 = this.c;
        if (textView3 == null) {
            q.b("textView");
        }
        textView3.setText("继续上滑逛逛 ");
        TextView textView4 = this.e;
        if (textView4 == null) {
            q.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME);
        }
        textView4.setText(str);
    }

    @Override // tb.htp
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null) {
            q.b("dividerLeft");
        }
        view.setVisibility(8);
        View view2 = this.h;
        if (view2 == null) {
            q.b("dividerRight");
        }
        view2.setVisibility(8);
        TextView textView = this.e;
        if (textView == null) {
            q.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME);
        }
        textView.setVisibility(8);
        ProgressBar progressBar = this.b;
        if (progressBar == null) {
            q.b("progressBar");
        }
        progressBar.setVisibility(0);
        TextView textView2 = this.c;
        if (textView2 == null) {
            q.b("textView");
        }
        textView2.setVisibility(4);
        this.d = false;
    }

    @Override // tb.htp
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            FrameLayout frameLayout = this.f31620a;
            if (frameLayout == null) {
                q.b("rootView");
            }
            frameLayout.setVisibility(0);
        } else {
            i = 4;
        }
        ProgressBar progressBar = this.b;
        if (progressBar == null) {
            q.b("progressBar");
        }
        progressBar.setVisibility(i);
        TextView textView = this.c;
        if (textView == null) {
            q.b("textView");
        }
        textView.setVisibility(i);
        if (z) {
            return;
        }
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME);
        }
        textView2.setVisibility(i);
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.sf_tbsearch_ms_footer, viewGroup, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f31620a = (FrameLayout) inflate;
        FrameLayout frameLayout = this.f31620a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        View findViewById = frameLayout.findViewById(R.id.loading_progress_bar);
        q.a((Object) findViewById, "rootView.findViewById(R.id.loading_progress_bar)");
        this.b = (ProgressBar) findViewById;
        FrameLayout frameLayout2 = this.f31620a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        View findViewById2 = frameLayout2.findViewById(R.id.tv_content);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.tv_content)");
        this.c = (TextView) findViewById2;
        FrameLayout frameLayout3 = this.f31620a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        View findViewById3 = frameLayout3.findViewById(R.id.divider_left);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.divider_left)");
        this.g = findViewById3;
        FrameLayout frameLayout4 = this.f31620a;
        if (frameLayout4 == null) {
            q.b("rootView");
        }
        View findViewById4 = frameLayout4.findViewById(R.id.divider_right);
        q.a((Object) findViewById4, "rootView.findViewById(R.id.divider_right)");
        this.h = findViewById4;
        FrameLayout frameLayout5 = this.f31620a;
        if (frameLayout5 == null) {
            q.b("rootView");
        }
        View findViewById5 = frameLayout5.findViewById(R.id.tv_section_name);
        q.a((Object) findViewById5, "rootView.findViewById(R.id.tv_section_name)");
        this.e = (TextView) findViewById5;
        boolean z = context instanceof f;
        f fVar = (f) (!z ? null : context);
        if (fVar != null && fVar.g()) {
            TextView textView = this.c;
            if (textView == null) {
                q.b("textView");
            }
            textView.setTextColor(-1);
        }
        FrameLayout frameLayout6 = this.f31620a;
        if (frameLayout6 == null) {
            q.b("rootView");
        }
        frameLayout6.setOnClickListener(new a());
        MetaResult metaResult = (MetaResult) q().as_().getTotalSearchResult();
        if (metaResult != null) {
            if (metaResult != null) {
                if (((CommonSearchResult) metaResult).newSearch) {
                    if (!z) {
                        context = null;
                    }
                    f fVar2 = (f) context;
                    if (fVar2 != null && fVar2.g()) {
                        FrameLayout frameLayout7 = this.f31620a;
                        if (frameLayout7 == null) {
                            q.b("rootView");
                        }
                        frameLayout7.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
                    } else {
                        FrameLayout frameLayout8 = this.f31620a;
                        if (frameLayout8 == null) {
                            q.b("rootView");
                        }
                        frameLayout8.setBackgroundColor(-1);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
        }
        FrameLayout frameLayout9 = this.f31620a;
        if (frameLayout9 == null) {
            q.b("rootView");
        }
        return frameLayout9;
    }

    public FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("67541aed", new Object[]{this});
        }
        FrameLayout frameLayout = this.f31620a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }
}
