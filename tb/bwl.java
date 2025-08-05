package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class bwl extends ctc<Object, com.etao.feimagesearch.model.b, CaptureManager> implements bym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "AutoSize__Bottom_NavBarViewV1";

    /* renamed from: a  reason: collision with root package name */
    private View f26130a;
    private TextView f;
    private View g;
    private TextView h;
    private TUrlImageView i;
    private View j;
    private TUrlImageView k;
    private TextView l;
    private int m;
    private final bxk n;
    private TextView o;
    private final ViewGroup p;

    /* loaded from: classes3.dex */
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
            coy.a(cpk.ALBUM_PAGE_NAME, "ClickTab", "tab", ChatInputConstant.PANEL_ID_ALBUM);
            bwl.a(bwl.this, 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            coy.a(cpk.ALBUM_PAGE_NAME, "ClickTab", "tab", "history");
            bwl.a(bwl.this, 1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            coy.a(cpk.ALBUM_PAGE_NAME, "ClickTab", "tab", "browsed");
            bwl.a(bwl.this, 2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                bwl.a(bwl.this, !bwl.a(bwl.this).i());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public f(int i) {
            this.b = i;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            bwl bwlVar;
            TextView f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            int c = bwl.c(bwl.this);
            int i = this.b;
            if (c == i) {
                return;
            }
            bwl.b(bwl.this, i);
            int c2 = bwl.c(bwl.this);
            if (c2 == 1) {
                bwl bwlVar2 = bwl.this;
                bwl.a(bwlVar2, bwl.d(bwlVar2), false);
                bwl bwlVar3 = bwl.this;
                bwl.a(bwlVar3, bwl.e(bwlVar3), false);
                bwlVar = bwl.this;
                f = bwl.f(bwlVar);
            } else if (c2 != 2) {
                bwl bwlVar4 = bwl.this;
                bwl.a(bwlVar4, bwl.f(bwlVar4), false);
                bwl bwlVar5 = bwl.this;
                bwl.a(bwlVar5, bwl.d(bwlVar5), false);
                bwlVar = bwl.this;
                f = bwl.e(bwlVar);
            } else {
                bwl bwlVar6 = bwl.this;
                bwl.a(bwlVar6, bwl.e(bwlVar6), false);
                bwl bwlVar7 = bwl.this;
                bwl.a(bwlVar7, bwl.f(bwlVar7), false);
                bwlVar = bwl.this;
                f = bwl.d(bwlVar);
            }
            bwl.a(bwlVar, f, true);
            bwl.a(bwl.this).c(bwl.c(bwl.this));
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26137a;
        public final /* synthetic */ TextView b;

        public g(boolean z, TextView textView) {
            this.f26137a = z;
            this.b = textView;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!this.f26137a) {
                this.b.setTextColor(Color.parseColor("#99FFFFFF"));
                this.b.setTypeface(Typeface.DEFAULT);
                TextView textView = this.b;
                textView.setContentDescription(this.b.getText() + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
            } else {
                this.b.setTextColor(Color.parseColor("#FFFFFF"));
                this.b.setTypeface(Typeface.DEFAULT_BOLD);
                TextView textView2 = this.b;
                textView2.setContentDescription(this.b.getText() + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_selected) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
            }
        }
    }

    static {
        kge.a(21029778);
        kge.a(-1226764053);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(bwl bwlVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bym
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        }
    }

    public static final /* synthetic */ bxk a(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bxk) ipChange.ipc$dispatch("ad3ea670", new Object[]{bwlVar}) : bwlVar.n;
    }

    public static final /* synthetic */ void a(bwl bwlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4daa62", new Object[]{bwlVar, new Integer(i)});
        } else {
            bwlVar.c(i);
        }
    }

    public static final /* synthetic */ void a(bwl bwlVar, TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe39691", new Object[]{bwlVar, textView, new Boolean(z)});
        } else {
            bwlVar.a(textView, z);
        }
    }

    public static final /* synthetic */ void a(bwl bwlVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4dea33", new Object[]{bwlVar, new Boolean(z)});
        } else {
            bwlVar.c(z);
        }
    }

    public static final /* synthetic */ View b(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7b71f304", new Object[]{bwlVar});
        }
        View view = bwlVar.f26130a;
        if (view == null) {
            q.b("rootView");
        }
        return view;
    }

    public static final /* synthetic */ void b(bwl bwlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512b7401", new Object[]{bwlVar, new Integer(i)});
        } else {
            bwlVar.m = i;
        }
    }

    public static final /* synthetic */ int c(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf94edb6", new Object[]{bwlVar})).intValue() : bwlVar.m;
    }

    public static final /* synthetic */ TextView d(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("f85910b8", new Object[]{bwlVar});
        }
        TextView textView = bwlVar.o;
        if (textView == null) {
            q.b("tabBrowsed");
        }
        return textView;
    }

    public static final /* synthetic */ TextView e(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c00e439", new Object[]{bwlVar});
        }
        TextView textView = bwlVar.f;
        if (textView == null) {
            q.b("tabAlbum");
        }
        return textView;
    }

    public static final /* synthetic */ TextView f(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1fa8b7ba", new Object[]{bwlVar});
        }
        TextView textView = bwlVar.h;
        if (textView == null) {
            q.b("tabHistoryTv");
        }
        return textView;
    }

    public final ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwl(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> cteVar, ViewGroup container, bxk navStateChangeListener) {
        super(activity, cteVar, false);
        q.c(activity, "activity");
        q.c(container, "container");
        q.c(navStateChangeListener, "navStateChangeListener");
        this.p = container;
        this.n = navStateChangeListener;
        this.m = -1;
        this.m = -1;
        ad.c("CaptureBottomAreaNavBarViewV1_addView", new ac() { // from class: tb.bwl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                ViewGroup a2 = bwl.this.a();
                CaptureManager manager = bwl.this.j();
                q.a((Object) manager, "manager");
                a2.setLayoutParams(new LinearLayout.LayoutParams(-1, j.a(manager.W() ? 55.0f : 45.0f)));
                bwl.this.a().addView(bwl.b(bwl.this));
                bwl.a(bwl.this, 0);
                bwl.a(bwl.this, false);
            }
        });
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1547763622);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_bottom_area_nav_v1, (ViewGroup) null, false);
        q.a((Object) inflate, "LayoutInflater.from(acti…area_nav_v1, null, false)");
        this.f26130a = inflate;
        View view = this.f26130a;
        if (view == null) {
            q.b("rootView");
        }
        View findViewById = view.findViewById(R.id.tab_album);
        TextView textView = (TextView) findViewById;
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        float f2 = 21.0f;
        textView.setTextSize(1, manager.W() ? 21.0f : 16.0f);
        textView.setOnClickListener(new b());
        q.a((Object) findViewById, "rootView.findViewById<Te…TYPE_ALBUM)\n      }\n    }");
        this.f = textView;
        View view2 = this.f26130a;
        if (view2 == null) {
            q.b("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.fl_tab_history);
        findViewById2.setOnClickListener(new c());
        q.a((Object) findViewById2, "rootView.findViewById<Vi…PE_HISTORY)\n      }\n    }");
        this.g = findViewById2;
        View view3 = this.f26130a;
        if (view3 == null) {
            q.b("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.tab_history);
        TextView textView2 = (TextView) findViewById3;
        CaptureManager manager2 = j();
        q.a((Object) manager2, "manager");
        textView2.setTextSize(1, manager2.W() ? 21.0f : 16.0f);
        q.a((Object) findViewById3, "rootView.findViewById<Te…Mode) 21f else 16f)\n    }");
        this.h = textView2;
        View view4 = this.f26130a;
        if (view4 == null) {
            q.b("rootView");
        }
        View findViewById4 = view4.findViewById(R.id.iv_history_tab_hint);
        q.a((Object) findViewById4, "rootView.findViewById(R.id.iv_history_tab_hint)");
        this.i = (TUrlImageView) findViewById4;
        View view5 = this.f26130a;
        if (view5 == null) {
            q.b("rootView");
        }
        View findViewById5 = view5.findViewById(R.id.tab_browsed);
        TextView textView3 = (TextView) findViewById5;
        CaptureManager manager3 = j();
        q.a((Object) manager3, "manager");
        textView3.setTextSize(1, manager3.W() ? 21.0f : 16.0f);
        textView3.setOnClickListener(new d());
        q.a((Object) findViewById5, "rootView.findViewById<Te…PE_BROWSED)\n      }\n    }");
        this.o = textView3;
        TextView textView4 = this.o;
        if (textView4 == null) {
            q.b("tabBrowsed");
        }
        if (!com.etao.feimagesearch.config.b.bP()) {
            i = 8;
        }
        textView4.setVisibility(i);
        View view6 = this.f26130a;
        if (view6 == null) {
            q.b("rootView");
        }
        View findViewById6 = view6.findViewById(R.id.btn_fold);
        findViewById6.setOnClickListener(new e());
        q.a((Object) findViewById6, "rootView.findViewById<Vi…(nextState)\n      }\n    }");
        this.j = findViewById6;
        View view7 = this.f26130a;
        if (view7 == null) {
            q.b("rootView");
        }
        View findViewById7 = view7.findViewById(R.id.iv_fold_hint);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById7;
        q.a((Object) tUrlImageView, "this");
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01wKSLBK1IJsdRBWdJ0_!!6000000000873-2-tps-46-28.png");
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        CaptureManager manager4 = j();
        q.a((Object) manager4, "manager");
        int a2 = j.a(manager4.W() ? 15.0f : 10.0f);
        layoutParams.height = a2;
        layoutParams.width = a2;
        tUrlImageView.setLayoutParams(layoutParams);
        q.a((Object) findViewById7, "rootView.findViewById<TU…idth = size\n      }\n    }");
        this.k = tUrlImageView;
        View view8 = this.f26130a;
        if (view8 == null) {
            q.b("rootView");
        }
        View findViewById8 = view8.findViewById(R.id.tv_fold_hint);
        TextView textView5 = (TextView) findViewById8;
        q.a((Object) textView5, "this");
        textView5.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_expand));
        CaptureManager manager5 = j();
        q.a((Object) manager5, "manager");
        if (!manager5.W()) {
            f2 = 16.0f;
        }
        textView5.setTextSize(1, f2);
        q.a((Object) findViewById8, "rootView.findViewById<Te…Mode) 21f else 16f)\n    }");
        this.l = textView5;
    }

    private final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            ad.c("switchShowType", new f(i));
        }
    }

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        cot.c(TAG, "switchPageFoldState: " + z);
        b(z);
        this.n.b(z);
    }

    private final void a(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b4f78", new Object[]{this, textView, new Boolean(z)});
        } else {
            ad.c("updateTabBtnState", new g(z, textView));
        }
    }

    @Override // tb.bym
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            TUrlImageView tUrlImageView = this.i;
            if (tUrlImageView == null) {
                q.b("tabHistoryIv");
            }
            tUrlImageView.setVisibility(0);
            TUrlImageView tUrlImageView2 = this.i;
            if (tUrlImageView2 == null) {
                q.b("tabHistoryIv");
            }
            tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01LzZS071FUvNUt2fHT_!!6000000000491-2-tps-128-68.png");
        } else {
            TUrlImageView tUrlImageView3 = this.i;
            if (tUrlImageView3 == null) {
                q.b("tabHistoryIv");
            }
            tUrlImageView3.setVisibility(8);
        }
    }

    @Override // tb.bym
    public void b(boolean z) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        cot.c(TAG, "updateFoldBtnState isFoldUp=" + z);
        if (z) {
            coy.b(cpk.ALBUM_PAGE_NAME, "ExpandOuterAlbum", new String[0]);
        }
        TUrlImageView tUrlImageView = this.k;
        if (tUrlImageView == null) {
            q.b("foldBtnIv");
        }
        tUrlImageView.setImageUrl(z ? "https://gw.alicdn.com/imgextra/i3/O1CN01j4Rh841OPjO5oE3e9_!!6000000001698-2-tps-44-28.png" : "https://gw.alicdn.com/imgextra/i2/O1CN01wKSLBK1IJsdRBWdJ0_!!6000000000873-2-tps-46-28.png");
        TextView textView = this.l;
        if (textView == null) {
            q.b("foldBtnHint");
        }
        if (z) {
            a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_fold);
        } else {
            a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_expand);
        }
        textView.setText(a2);
        View view = this.j;
        if (view == null) {
            q.b("foldBtn");
        }
        StringBuilder sb = new StringBuilder();
        TextView textView2 = this.l;
        if (textView2 == null) {
            q.b("foldBtnHint");
        }
        sb.append(textView2.getText());
        sb.append((char) 65292);
        sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        view.setContentDescription(sb.toString());
    }
}
