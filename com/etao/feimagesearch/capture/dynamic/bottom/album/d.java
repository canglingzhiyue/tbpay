package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.k;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.com;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.cpk;
import tb.cpr;
import tb.cps;
import tb.ctb;
import tb.ctc;
import tb.cte;
import tb.kge;

/* loaded from: classes3.dex */
public final class d extends ctc<com.etao.feimagesearch.capture.dynamic.bottom.album.c, com.etao.feimagesearch.model.b, CaptureManager> implements cpr.b, cps {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int J;
    public static final int TAB_TYPE_ALL = 0;
    public static final int TAB_TYPE_SCREEN_SHOT = 2;
    public static final int TAB_TYPE_VIDEO = 1;
    public static final String TAG = "AutoSize__Bottom_CaptureAlbumView";
    public static final String TAG_PREFIX = "AutoSize__Bottom_Album_";
    private List<TextView> A;
    private boolean B;
    private final int C;
    private com.etao.feimagesearch.album.thumbnail.a D;
    private final com.etao.feimagesearch.capture.dynamic.bottom.album.a E;
    private com.etao.feimagesearch.capture.dynamic.bottom.album.b F;
    private boolean G;
    private int H;
    private int I;
    private View K;
    private boolean N;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f6525a;
    private boolean f;
    private int g;
    private View h;
    private View i;
    private TextView j;
    private TUrlImageView k;
    private View l;
    private TextView m;
    private TextView n;
    private TextView o;
    private FrameLayout p;
    private RecyclerView q;
    private RecyclerView r;
    private View s;
    private View t;
    private TUrlImageView u;
    private View v;
    private View w;
    private View x;
    private View y;
    private int z;

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
            d dVar = d.this;
            d.a(dVar, !d.a(dVar));
            if (d.a(d.this)) {
                coy.a(cpk.ALBUM_PAGE_NAME, "ClickAlbum");
            }
            d dVar2 = d.this;
            d.b(dVar2, d.a(dVar2));
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
            d.a(d.this, 0);
            coy.a(cpk.ALBUM_PAGE_NAME, "ClickAlbumFilter", new String[0]);
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.album.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC0212d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0212d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d.a(d.this, 1);
            coy.a(cpk.ALBUM_PAGE_NAME, "ClickAlbumFilter", new String[0]);
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
                return;
            }
            d.a(d.this, 2);
            coy.a(cpk.ALBUM_PAGE_NAME, "ClickAlbumFilter", new String[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            coy.a(cpk.ALBUM_PAGE_NAME, "GoSettingClick", new String[0]);
            com.etao.feimagesearch.capture.dynamic.bottom.album.c b = d.b(d.this);
            if (b == null) {
                return;
            }
            b.f();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            coy.a(cpk.ALBUM_PAGE_NAME, "GoSettingClick", new String[0]);
            com.etao.feimagesearch.capture.dynamic.bottom.album.c b = d.b(d.this);
            if (b == null) {
                return;
            }
            b.f();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (recyclerView == null || rect == null) {
            } else {
                int childAdapterPosition = (recyclerView.getChildAdapterPosition(view) + 1) % d.c(d.this);
                if (childAdapterPosition == 0) {
                    rect.left = d.Companion.a() / 2;
                    rect.bottom = d.Companion.a();
                } else if (childAdapterPosition == 1) {
                    rect.right = d.Companion.a() / 2;
                    rect.bottom = d.Companion.a();
                } else {
                    rect.left = d.Companion.a() / 2;
                    rect.right = d.Companion.a() / 2;
                    rect.bottom = d.Companion.a();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            coy.a(cpk.ALBUM_PAGE_NAME, "GoSettingClick", new String[0]);
            com.etao.feimagesearch.capture.dynamic.bottom.album.c b = d.b(d.this);
            if (b == null) {
                return;
            }
            b.d();
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public j(boolean z, ViewGroup viewGroup, boolean z2, int i, int i2) {
            this.b = z;
            this.c = viewGroup;
            this.d = z2;
            this.e = i;
            this.f = i2;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (this.b) {
                this.c.removeAllViews();
                this.c.addView(d.this.m(), -1, -1);
                d.d(d.this, this.d);
            }
            d.this.b(this.e, this.f);
        }
    }

    @JvmStatic
    public static final int a(Context context, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i2)})).intValue() : Companion.a(context, i2);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    public static final /* synthetic */ void a(d dVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c3792", new Object[]{dVar, new Integer(i2)});
        } else {
            dVar.b(i2);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c7763", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.B = z;
        }
    }

    public static final /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42b1ed95", new Object[]{dVar})).booleanValue() : dVar.B;
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.album.c b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.album.c) ipChange.ipc$dispatch("8de1d67a", new Object[]{dVar}) : (com.etao.feimagesearch.capture.dynamic.bottom.album.c) dVar.b;
    }

    public static final /* synthetic */ void b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce0217e4", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.e(z);
        }
    }

    public static final /* synthetic */ int c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4eb98442", new Object[]{dVar})).intValue() : dVar.g;
    }

    public static final /* synthetic */ void c(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8877b865", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.d(z);
        }
    }

    public static final /* synthetic */ TextView d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("275d4e22", new Object[]{dVar});
        }
        TextView textView = dVar.j;
        if (textView == null) {
            q.b("folderLabel");
        }
        return textView;
    }

    public static final /* synthetic */ void d(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed58e6", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.f(z);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.album.a e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.album.a) ipChange.ipc$dispatch("c0dd6099", new Object[]{dVar}) : dVar.E;
    }

    public static final /* synthetic */ RecyclerView h(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e688205a", new Object[]{dVar});
        }
        RecyclerView recyclerView = dVar.q;
        if (recyclerView == null) {
            q.b("rvImage");
        }
        return recyclerView;
    }

    public static final /* synthetic */ int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[0])).intValue() : J;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.ctb, com.etao.feimagesearch.capture.dynamic.bottom.album.c] */
    @Override // tb.ctc
    public /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.album.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> cteVar, int i2) {
        super(activity, cteVar);
        q.c(activity, "activity");
        this.C = i2;
        this.g = com.etao.feimagesearch.config.b.a(activity);
        this.z = -1;
        this.D = com.etao.feimagesearch.config.b.dw() ? new com.etao.feimagesearch.album.thumbnail.c(ChatInputConstant.PANEL_ID_ALBUM) : new com.etao.feimagesearch.album.thumbnail.b();
        com.etao.feimagesearch.album.thumbnail.a aVar = this.D;
        int i3 = this.g;
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        this.E = new com.etao.feimagesearch.capture.dynamic.bottom.album.a(null, aVar, i3, manager.W(), new CaptureAlbumView$albumAdapter$1(this), new CaptureAlbumView$albumAdapter$2(this));
        CaptureManager manager2 = j();
        q.a((Object) manager2, "manager");
        this.F = new com.etao.feimagesearch.capture.dynamic.bottom.album.b(activity, manager2.W(), this.D, new CaptureAlbumView$folderAdapter$1(this));
        b(0);
        CaptureManager manager3 = j();
        q.a((Object) manager3, "manager");
        if (manager3.K()) {
            j().a(new com.etao.feimagesearch.structure.capture.c() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.album.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.structure.capture.c
                public final void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.h(d.this).setAdapter(d.e(d.this));
                    }
                }
            });
        } else {
            RecyclerView recyclerView = this.q;
            if (recyclerView == null) {
                q.b("rvImage");
            }
            recyclerView.setAdapter(this.E);
        }
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == null) {
            q.b("rvFolder");
        }
        recyclerView2.setAdapter(this.F);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(408172754);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : d.l();
        }

        @JvmStatic
        public final int a(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{this, context, new Integer(i)})).intValue();
            }
            q.c(context, "context");
            return (com.b(context) - ((i - 1) * a())) / i;
        }
    }

    static {
        kge.a(49533450);
        kge.a(605119092);
        kge.a(469456750);
        Companion = new a(null);
        J = com.taobao.android.searchbaseframe.util.j.a(1.0f);
    }

    public final LinearLayout m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("4c2001cb", new Object[]{this});
        }
        LinearLayout linearLayout = this.f6525a;
        if (linearLayout == null) {
            q.b("rootView");
        }
        return linearLayout;
    }

    @Override // tb.ctc
    public void c() {
        GridLayoutManager gridLayoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_album, (ViewGroup) null, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f6525a = (LinearLayout) inflate;
        LinearLayout linearLayout = this.f6525a;
        if (linearLayout == null) {
            q.b("rootView");
        }
        View findViewById = linearLayout.findViewById(R.id.fl_btn_container);
        q.a((Object) findViewById, "this");
        findViewById.setVisibility(8);
        t tVar = t.INSTANCE;
        q.a((Object) findViewById, "rootView.findViewById<Vi…ibility = View.GONE\n    }");
        this.h = findViewById;
        LinearLayout linearLayout2 = this.f6525a;
        if (linearLayout2 == null) {
            q.b("rootView");
        }
        View findViewById2 = linearLayout2.findViewById(R.id.ll_folder);
        findViewById2.setOnClickListener(new b());
        q.a((Object) findViewById2, "this");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f2 = 18.0f;
        gradientDrawable.setCornerRadius(com.taobao.android.searchbaseframe.util.j.b(18.0f));
        gradientDrawable.setStroke(com.taobao.android.searchbaseframe.util.j.a(1.0f), Color.parseColor("#33FFFFFF"));
        t tVar2 = t.INSTANCE;
        findViewById2.setBackground(gradientDrawable);
        findViewById2.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18952) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_expand) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        t tVar3 = t.INSTANCE;
        q.a((Object) findViewById2, "rootView.findViewById<Vi…_app_1007_button)}\"\n    }");
        this.i = findViewById2;
        LinearLayout linearLayout3 = this.f6525a;
        if (linearLayout3 == null) {
            q.b("rootView");
        }
        View findViewById3 = linearLayout3.findViewById(R.id.folder_label);
        TextView textView = (TextView) findViewById3;
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        textView.setTextSize(1, manager.W() ? 18.0f : 15.0f);
        t tVar4 = t.INSTANCE;
        q.a((Object) findViewById3, "rootView.findViewById<Te…Mode) 18f else 15f)\n    }");
        this.j = textView;
        LinearLayout linearLayout4 = this.f6525a;
        if (linearLayout4 == null) {
            q.b("rootView");
        }
        View findViewById4 = linearLayout4.findViewById(R.id.iv_fold_state);
        q.a((Object) findViewById4, "rootView.findViewById(R.id.iv_fold_state)");
        this.k = (TUrlImageView) findViewById4;
        TUrlImageView tUrlImageView = this.k;
        if (tUrlImageView == null) {
            q.b("folderStateIv");
        }
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01j4Rh841OPjO5oE3e9_!!6000000001698-2-tps-44-28.png");
        LinearLayout linearLayout5 = this.f6525a;
        if (linearLayout5 == null) {
            q.b("rootView");
        }
        View findViewById5 = linearLayout5.findViewById(R.id.fl_tab_container);
        q.a((Object) findViewById5, "rootView.findViewById(R.id.fl_tab_container)");
        this.l = findViewById5;
        this.A = new ArrayList();
        LinearLayout linearLayout6 = this.f6525a;
        if (linearLayout6 == null) {
            q.b("rootView");
        }
        View findViewById6 = linearLayout6.findViewById(R.id.tv_tab_all);
        TextView textView2 = (TextView) findViewById6;
        CaptureManager manager2 = j();
        q.a((Object) manager2, "manager");
        textView2.setTextSize(1, manager2.W() ? 18.0f : 15.0f);
        textView2.setOnClickListener(new c());
        q.a((Object) textView2, "this");
        textView2.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_all) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        List<TextView> list = this.A;
        if (list == null) {
            q.b("tabViewHolders");
        }
        list.add(textView2);
        t tVar5 = t.INSTANCE;
        q.a((Object) findViewById6, "rootView.findViewById<Te…ewHolders.add(this)\n    }");
        this.m = textView2;
        LinearLayout linearLayout7 = this.f6525a;
        if (linearLayout7 == null) {
            q.b("rootView");
        }
        View findViewById7 = linearLayout7.findViewById(R.id.tv_tab_video);
        TextView textView3 = (TextView) findViewById7;
        CaptureManager manager3 = j();
        q.a((Object) manager3, "manager");
        textView3.setTextSize(1, manager3.W() ? 18.0f : 15.0f);
        textView3.setOnClickListener(new View$OnClickListenerC0212d());
        q.a((Object) textView3, "this");
        textView3.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_item_video) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        List<TextView> list2 = this.A;
        if (list2 == null) {
            q.b("tabViewHolders");
        }
        list2.add(textView3);
        t tVar6 = t.INSTANCE;
        q.a((Object) findViewById7, "rootView.findViewById<Te…ewHolders.add(this)\n    }");
        this.n = textView3;
        LinearLayout linearLayout8 = this.f6525a;
        if (linearLayout8 == null) {
            q.b("rootView");
        }
        View findViewById8 = linearLayout8.findViewById(R.id.tv_tab_screenshot);
        TextView textView4 = (TextView) findViewById8;
        CaptureManager manager4 = j();
        q.a((Object) manager4, "manager");
        if (!manager4.W()) {
            f2 = 15.0f;
        }
        textView4.setTextSize(1, f2);
        textView4.setOnClickListener(new e());
        q.a((Object) textView4, "this");
        textView4.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18944) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        List<TextView> list3 = this.A;
        if (list3 == null) {
            q.b("tabViewHolders");
        }
        list3.add(textView4);
        t tVar7 = t.INSTANCE;
        q.a((Object) findViewById8, "rootView.findViewById<Te…ewHolders.add(this)\n    }");
        this.o = textView4;
        LinearLayout linearLayout9 = this.f6525a;
        if (linearLayout9 == null) {
            q.b("rootView");
        }
        View findViewById9 = linearLayout9.findViewById(R.id.ll_auth_all_container);
        q.a((Object) findViewById9, "rootView.findViewById(R.id.ll_auth_all_container)");
        this.K = findViewById9;
        View view = this.K;
        if (view == null) {
            q.b("authAllHintContainer");
        }
        view.setOnClickListener(new i());
        View view2 = this.K;
        if (view2 == null) {
            q.b("authAllHintContainer");
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        float f3 = 12.0f;
        float b2 = com.taobao.android.searchbaseframe.util.j.b(12.0f);
        gradientDrawable2.setCornerRadii(new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable2.setColor(Color.parseColor("#1F1F1F"));
        t tVar8 = t.INSTANCE;
        view2.setBackground(gradientDrawable2);
        LinearLayout linearLayout10 = this.f6525a;
        if (linearLayout10 == null) {
            q.b("rootView");
        }
        TextView textView5 = (TextView) linearLayout10.findViewById(R.id.tv_auth_hint);
        CaptureManager manager5 = j();
        q.a((Object) manager5, "manager");
        textView5.setTextSize(1, manager5.W() ? 15.0f : 12.0f);
        t tVar9 = t.INSTANCE;
        LinearLayout linearLayout11 = this.f6525a;
        if (linearLayout11 == null) {
            q.b("rootView");
        }
        TextView textView6 = (TextView) linearLayout11.findViewById(R.id.btn_auth_all);
        q.a((Object) textView6, "this");
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(com.taobao.android.searchbaseframe.util.j.b(12.0f));
        gradientDrawable3.setColor(Color.parseColor("#99888888"));
        t tVar10 = t.INSTANCE;
        textView6.setBackground(gradientDrawable3);
        CaptureManager manager6 = j();
        q.a((Object) manager6, "manager");
        if (manager6.W()) {
            f3 = 15.0f;
        }
        textView6.setTextSize(1, f3);
        t tVar11 = t.INSTANCE;
        LinearLayout linearLayout12 = this.f6525a;
        if (linearLayout12 == null) {
            q.b("rootView");
        }
        View findViewById10 = linearLayout12.findViewById(R.id.fl_album_container);
        q.a((Object) findViewById10, "rootView.findViewById(R.id.fl_album_container)");
        this.p = (FrameLayout) findViewById10;
        LinearLayout linearLayout13 = this.f6525a;
        if (linearLayout13 == null) {
            q.b("rootView");
        }
        View findViewById11 = linearLayout13.findViewById(R.id.fl_progress);
        q.a((Object) findViewById11, "rootView.findViewById(R.id.fl_progress)");
        this.s = findViewById11;
        LinearLayout linearLayout14 = this.f6525a;
        if (linearLayout14 == null) {
            q.b("rootView");
        }
        View findViewById12 = linearLayout14.findViewById(R.id.fl_hint_container);
        q.a((Object) findViewById12, "rootView.findViewById(R.id.fl_hint_container)");
        this.t = findViewById12;
        LinearLayout linearLayout15 = this.f6525a;
        if (linearLayout15 == null) {
            q.b("rootView");
        }
        View findViewById13 = linearLayout15.findViewById(R.id.iv_permission_hint_bg);
        q.a((Object) findViewById13, "rootView.findViewById(R.id.iv_permission_hint_bg)");
        this.u = (TUrlImageView) findViewById13;
        TUrlImageView tUrlImageView2 = this.u;
        if (tUrlImageView2 == null) {
            q.b("permissionHintBg");
        }
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01qikYpk1N6Ct7qHaaE_!!6000000001520-2-tps-1500-372.png");
        LinearLayout linearLayout16 = this.f6525a;
        if (linearLayout16 == null) {
            q.b("rootView");
        }
        View findViewById14 = linearLayout16.findViewById(R.id.fl_permission_hint_container);
        q.a((Object) findViewById14, "rootView.findViewById(R.…ermission_hint_container)");
        this.v = findViewById14;
        LinearLayout linearLayout17 = this.f6525a;
        if (linearLayout17 == null) {
            q.b("rootView");
        }
        View findViewById15 = linearLayout17.findViewById(R.id.fl_permission_hint);
        q.a((Object) findViewById15, "rootView.findViewById(R.id.fl_permission_hint)");
        this.w = findViewById15;
        LinearLayout linearLayout18 = this.f6525a;
        if (linearLayout18 == null) {
            q.b("rootView");
        }
        View findViewById16 = linearLayout18.findViewById(R.id.iv_permission_hint);
        q.a((Object) findViewById16, "rootView.findViewById<TU…(R.id.iv_permission_hint)");
        ((TUrlImageView) findViewById16).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01fH5ATq1BsVGSvI8fC_!!6000000000001-2-tps-108-92.png");
        LinearLayout linearLayout19 = this.f6525a;
        if (linearLayout19 == null) {
            q.b("rootView");
        }
        TextView textView7 = (TextView) linearLayout19.findViewById(R.id.tv_permission_hint);
        CaptureManager manager7 = j();
        q.a((Object) manager7, "manager");
        float f4 = 17.0f;
        textView7.setTextSize(1, manager7.W() ? 17.0f : 15.0f);
        t tVar12 = t.INSTANCE;
        LinearLayout linearLayout20 = this.f6525a;
        if (linearLayout20 == null) {
            q.b("rootView");
        }
        TextView textView8 = (TextView) linearLayout20.findViewById(R.id.btn_permission);
        q.a((Object) textView8, "this");
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius(com.taobao.android.searchbaseframe.util.j.b(17.0f));
        gradientDrawable4.setColor(Color.parseColor("#FFFFFF"));
        t tVar13 = t.INSTANCE;
        textView8.setBackground(gradientDrawable4);
        textView8.setOnClickListener(new f());
        CaptureManager manager8 = j();
        q.a((Object) manager8, "manager");
        textView8.setTextSize(1, manager8.W() ? 17.0f : 15.0f);
        t tVar14 = t.INSTANCE;
        LinearLayout linearLayout21 = this.f6525a;
        if (linearLayout21 == null) {
            q.b("rootView");
        }
        View findViewById17 = linearLayout21.findViewById(R.id.fl_permission_hint_full);
        q.a((Object) findViewById17, "rootView.findViewById(R.….fl_permission_hint_full)");
        this.x = findViewById17;
        LinearLayout linearLayout22 = this.f6525a;
        if (linearLayout22 == null) {
            q.b("rootView");
        }
        TextView textView9 = (TextView) linearLayout22.findViewById(R.id.tv_permission_hint_top);
        CaptureManager manager9 = j();
        q.a((Object) manager9, "manager");
        textView9.setTextSize(1, manager9.W() ? 21.0f : 17.0f);
        t tVar15 = t.INSTANCE;
        LinearLayout linearLayout23 = this.f6525a;
        if (linearLayout23 == null) {
            q.b("rootView");
        }
        TextView textView10 = (TextView) linearLayout23.findViewById(R.id.tv_permission_hint_bottom);
        CaptureManager manager10 = j();
        q.a((Object) manager10, "manager");
        textView10.setTextSize(1, manager10.W() ? 17.0f : 15.0f);
        t tVar16 = t.INSTANCE;
        LinearLayout linearLayout24 = this.f6525a;
        if (linearLayout24 == null) {
            q.b("rootView");
        }
        View findViewById18 = linearLayout24.findViewById(R.id.iv_permission_hint_full);
        q.a((Object) findViewById18, "rootView.findViewById<TU….iv_permission_hint_full)");
        ((TUrlImageView) findViewById18).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN019KpKir1rMdZRTCbiZ_!!6000000005617-2-tps-180-164.png");
        LinearLayout linearLayout25 = this.f6525a;
        if (linearLayout25 == null) {
            q.b("rootView");
        }
        TextView textView11 = (TextView) linearLayout25.findViewById(R.id.btn_permission_full);
        q.a((Object) textView11, "this");
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(0);
        gradientDrawable5.setCornerRadius(com.taobao.android.searchbaseframe.util.j.b(17.0f));
        gradientDrawable5.setColor(Color.parseColor("#FFFFFF"));
        t tVar17 = t.INSTANCE;
        textView11.setBackground(gradientDrawable5);
        CaptureManager manager11 = j();
        q.a((Object) manager11, "manager");
        textView11.setTextSize(1, manager11.W() ? 17.0f : 15.0f);
        textView11.setOnClickListener(new g());
        ViewGroup.LayoutParams layoutParams = textView11.getLayoutParams();
        CaptureManager manager12 = j();
        q.a((Object) manager12, "manager");
        layoutParams.height = com.taobao.android.searchbaseframe.util.j.a(manager12.W() ? 35.0f : 28.0f);
        t tVar18 = t.INSTANCE;
        textView11.setLayoutParams(layoutParams);
        t tVar19 = t.INSTANCE;
        LinearLayout linearLayout26 = this.f6525a;
        if (linearLayout26 == null) {
            q.b("rootView");
        }
        View findViewById19 = linearLayout26.findViewById(R.id.tv_empty_hint);
        TextView textView12 = (TextView) findViewById19;
        CaptureManager manager13 = j();
        q.a((Object) manager13, "manager");
        if (!manager13.W()) {
            f4 = 15.0f;
        }
        textView12.setTextSize(1, f4);
        t tVar20 = t.INSTANCE;
        q.a((Object) findViewById19, "rootView.findViewById<Te…Mode) 17f else 15f)\n    }");
        this.y = findViewById19;
        LinearLayout linearLayout27 = this.f6525a;
        if (linearLayout27 == null) {
            q.b("rootView");
        }
        View findViewById20 = linearLayout27.findViewById(R.id.rv_image);
        q.a((Object) findViewById20, "rootView.findViewById(R.id.rv_image)");
        this.q = (RecyclerView) findViewById20;
        this.g = com.etao.feimagesearch.config.b.a(this.d);
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            q.b("rvImage");
        }
        if (com.etao.feimagesearch.config.b.dJ()) {
            gridLayoutManager = new com.etao.feimagesearch.ui.a(this.d, this.g);
        } else {
            gridLayoutManager = new GridLayoutManager(this.d, this.g);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == null) {
            q.b("rvImage");
        }
        recyclerView2.addItemDecoration(new h());
        if (com.etao.feimagesearch.config.b.al()) {
            RecyclerView recyclerView3 = this.q;
            if (recyclerView3 == null) {
                q.b("rvImage");
            }
            recyclerView3.setItemAnimator(null);
        }
        if (j().N()) {
            cot.c(TAG, "enableVisibleAreaOpt " + this.C);
            a aVar = Companion;
            Activity activity = this.d;
            q.a((Object) activity, "activity");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, aVar.a(activity, this.g));
            RecyclerView recyclerView4 = this.q;
            if (recyclerView4 == null) {
                q.b("rvImage");
            }
            recyclerView4.setLayoutParams(layoutParams2);
        }
        LinearLayout linearLayout28 = this.f6525a;
        if (linearLayout28 == null) {
            q.b("rootView");
        }
        View findViewById21 = linearLayout28.findViewById(R.id.rv_folder);
        q.a((Object) findViewById21, "rootView.findViewById(R.id.rv_folder)");
        this.r = (RecyclerView) findViewById21;
        RecyclerView recyclerView5 = this.r;
        if (recyclerView5 == null) {
            q.b("rvFolder");
        }
        recyclerView5.setLayoutManager(new LinearLayoutManager(this.d, 1, false));
    }

    public com.etao.feimagesearch.capture.dynamic.bottom.album.c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.album.c) ipChange.ipc$dispatch("a17f0c78", new Object[]{this}) : new com.etao.feimagesearch.capture.dynamic.bottom.album.c();
    }

    @Override // tb.ctc
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.D.a();
        cot.a("PltCameraPai", TAG, "hitCache " + this.E.e());
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "hitAlbumViewCache", 19999, "count", String.valueOf(this.E.e()));
    }

    public void b(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.H == i2) {
        } else {
            this.I = i3;
            this.H = i2;
            c(i2, i3);
            if (i2 <= this.C || !j().N() || this.N) {
                return;
            }
            this.N = true;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            RecyclerView recyclerView = this.q;
            if (recyclerView == null) {
                q.b("rvImage");
            }
            recyclerView.setLayoutParams(layoutParams);
        }
    }

    public void a(ViewGroup container, boolean z, boolean z2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7411d007", new Object[]{this, container, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        q.c(container, "container");
        if (this.f == z) {
            return;
        }
        this.f = z;
        this.G = z2;
        ad.c("CaptureAlbumView_addView", new j(z, container, z2, i2, i3));
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.K;
        if (view == null) {
            q.b("authAllHintContainer");
        }
        view.setVisibility(z ? 0 : 8);
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            q.b("rvImage");
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            i2 = com.taobao.android.searchbaseframe.util.j.a(70.0f);
        }
        layoutParams2.bottomMargin = i2;
        RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == null) {
            q.b("rvImage");
        }
        recyclerView2.setLayoutParams(layoutParams2);
    }

    public final k i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("a73e6e59", new Object[]{this}) : this.E.a();
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.z;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.v;
            if (view == null) {
                q.b("permissionHintContainer");
            }
            if (view.getVisibility() == 0) {
                coy.c(cpk.ALBUM_PAGE_NAME, "GoSettingExpose", new String[0]);
            }
            View view2 = this.t;
            if (view2 == null) {
                q.b("hintContainer");
            }
            view2.setVisibility(0);
            View view3 = this.v;
            if (view3 == null) {
                q.b("permissionHintContainer");
            }
            view3.setVisibility(0);
            View view4 = this.y;
            if (view4 == null) {
                q.b("emptyHintView");
            }
            view4.setVisibility(8);
            TUrlImageView tUrlImageView = this.u;
            if (tUrlImageView == null) {
                q.b("permissionHintBg");
            }
            tUrlImageView.setVisibility(0);
            c(this.H, this.I);
        } else {
            View view5 = this.t;
            if (view5 == null) {
                q.b("hintContainer");
            }
            view5.setVisibility(8);
            TUrlImageView tUrlImageView2 = this.u;
            if (tUrlImageView2 == null) {
                q.b("permissionHintBg");
            }
            tUrlImageView2.setVisibility(8);
            View view6 = this.v;
            if (view6 == null) {
                q.b("permissionHintContainer");
            }
            view6.setVisibility(8);
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.s;
        if (view == null) {
            q.b("progressView");
        }
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void a(k folderItem, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f99291b", new Object[]{this, folderItem, new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(folderItem, "folderItem");
        b(false);
        c(false);
        f(this.G);
        this.E.a(z);
        this.E.a(folderItem, null, true);
        TextView textView = this.j;
        if (textView == null) {
            q.b("folderLabel");
        }
        textView.setText(folderItem.a());
        TextView textView2 = this.j;
        if (textView2 == null) {
            q.b("folderLabel");
        }
        textView2.setVisibility(0);
        if (this.E.getItemCount() != 0) {
            z3 = false;
        }
        d(z3);
        if (!z2) {
            return;
        }
        Toast.makeText(this.d, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18980), 0).show();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.E.c();
        this.F.a();
        this.z = -1;
        b(0);
    }

    public final void b(k folderItem) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37338cdc", new Object[]{this, folderItem});
            return;
        }
        q.c(folderItem, "folderItem");
        boolean a2 = this.E.a(folderItem, null, false);
        com.etao.feimagesearch.result.f.a("AlbumUpdate", "onAlbumFolderItemsUpdate: " + a2);
        if (!a2) {
            return;
        }
        if (this.E.getItemCount() == 0) {
            z = true;
        }
        d(z);
        int n = n() + (this.E.f() ? 1 : 0);
        this.E.notifyItemRangeChanged(n, ((o() + (this.E.f() ? 1 : 0)) - n) + 1);
    }

    public final void a(List<com.etao.feimagesearch.album.o> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        List<com.etao.feimagesearch.album.o> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        boolean a2 = this.E.a(list);
        com.etao.feimagesearch.result.f.a("AlbumUpdate", "onScreenShotsFullUpdate: " + a2);
        if (!a2) {
            return;
        }
        if (this.E.getItemCount() == 0) {
            z = true;
        }
        d(z);
        int n = n();
        this.E.notifyItemRangeChanged(n, (o() - n) + 1);
    }

    public final void h_(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223ff4c5", new Object[]{this, new Integer(i2)});
        } else if (i2 <= 0) {
        } else {
            this.E.notifyItemRangeInserted(0, i2);
            if (n() > 4) {
                return;
            }
            RecyclerView recyclerView = this.q;
            if (recyclerView == null) {
                q.b("rvImage");
            }
            recyclerView.scrollToPosition(0);
        }
    }

    private final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
            return;
        }
        int i3 = this.z;
        if (i3 == i2) {
            return;
        }
        a(i3, false);
        this.z = i2;
        a(this.z, true);
    }

    private final void a(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (i2 < 0) {
        } else {
            List<TextView> list = this.A;
            if (list == null) {
                q.b("tabViewHolders");
            }
            if (i2 >= list.size()) {
                return;
            }
            List<TextView> list2 = this.A;
            if (list2 == null) {
                q.b("tabViewHolders");
            }
            TextView textView = list2.get(i2);
            if (z) {
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                this.E.b(i2);
                if (this.E.a(i2) != 0) {
                    z2 = false;
                }
                d(z2);
                textView.setContentDescription(textView.getText() + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_selected) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
                return;
            }
            textView.setTextColor(Color.parseColor("#80FFFFFF"));
            textView.setContentDescription(textView.getText() + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        }
    }

    private final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.t;
        if (view == null) {
            q.b("hintContainer");
        }
        int i2 = 8;
        view.setVisibility(z ? 0 : 8);
        View view2 = this.y;
        if (view2 == null) {
            q.b("emptyHintView");
        }
        if (z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        if (!z) {
            return;
        }
        c(this.H, this.I);
    }

    private final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            q.b("rvImage");
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        }
        return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    private final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            q.b("rvImage");
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        }
        return ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
    }

    private final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.B = z;
        com.etao.feimagesearch.capture.dynamic.bottom.album.c cVar = (com.etao.feimagesearch.capture.dynamic.bottom.album.c) this.b;
        if (cVar == null) {
            return;
        }
        if (this.B) {
            TUrlImageView tUrlImageView = this.k;
            if (tUrlImageView == null) {
                q.b("folderStateIv");
            }
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01wKSLBK1IJsdRBWdJ0_!!6000000000873-2-tps-46-28.png");
            cox.b("Page_PhotoSearchTake", "ClickAlbumFolder", new String[0]);
            this.F.a(cVar.e().a());
            View view = this.l;
            if (view == null) {
                q.b("tabContainer");
            }
            view.setVisibility(8);
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                q.b("rvFolder");
            }
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = this.q;
            if (recyclerView2 == null) {
                q.b("rvImage");
            }
            recyclerView2.setVisibility(4);
            View view2 = this.i;
            if (view2 == null) {
                q.b("foldContainer");
            }
            StringBuilder sb = new StringBuilder();
            TextView textView = this.j;
            if (textView == null) {
                q.b("folderLabel");
            }
            sb.append(textView.getText());
            sb.append((char) 65292);
            sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_fold));
            sb.append((char) 65292);
            sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
            view2.setContentDescription(sb.toString());
            return;
        }
        TUrlImageView tUrlImageView2 = this.k;
        if (tUrlImageView2 == null) {
            q.b("folderStateIv");
        }
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01j4Rh841OPjO5oE3e9_!!6000000001698-2-tps-44-28.png");
        View view3 = this.l;
        if (view3 == null) {
            q.b("tabContainer");
        }
        view3.setVisibility(0);
        RecyclerView recyclerView3 = this.q;
        if (recyclerView3 == null) {
            q.b("rvImage");
        }
        recyclerView3.setVisibility(0);
        RecyclerView recyclerView4 = this.r;
        if (recyclerView4 == null) {
            q.b("rvFolder");
        }
        recyclerView4.setVisibility(8);
        View view4 = this.i;
        if (view4 == null) {
            q.b("foldContainer");
        }
        StringBuilder sb2 = new StringBuilder();
        TextView textView2 = this.j;
        if (textView2 == null) {
            q.b("folderLabel");
        }
        sb2.append(textView2.getText());
        sb2.append((char) 65292);
        sb2.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_expand));
        sb2.append((char) 65292);
        sb2.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        view4.setContentDescription(sb2.toString());
    }

    private final void c(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        View view = this.t;
        if (view == null) {
            q.b("hintContainer");
        }
        if (view.getVisibility() != 0) {
            return;
        }
        if (i2 > i3 / 3) {
            View view2 = this.w;
            if (view2 == null) {
                q.b("permissionHintView");
            }
            if (view2.getVisibility() != 8) {
                View view3 = this.w;
                if (view3 == null) {
                    q.b("permissionHintView");
                }
                view3.setVisibility(8);
                TUrlImageView tUrlImageView = this.u;
                if (tUrlImageView == null) {
                    q.b("permissionHintBg");
                }
                tUrlImageView.setVisibility(8);
            }
            View view4 = this.x;
            if (view4 == null) {
                q.b("permissionHintFullView");
            }
            if (view4.getVisibility() != 0) {
                View view5 = this.x;
                if (view5 == null) {
                    q.b("permissionHintFullView");
                }
                view5.setVisibility(0);
            }
        } else {
            View view6 = this.w;
            if (view6 == null) {
                q.b("permissionHintView");
            }
            if (view6.getVisibility() != 0) {
                View view7 = this.w;
                if (view7 == null) {
                    q.b("permissionHintView");
                }
                view7.setVisibility(0);
                TUrlImageView tUrlImageView2 = this.u;
                if (tUrlImageView2 == null) {
                    q.b("permissionHintBg");
                }
                tUrlImageView2.setVisibility(0);
            }
            View view8 = this.x;
            if (view8 == null) {
                q.b("permissionHintFullView");
            }
            if (view8.getVisibility() != 8) {
                View view9 = this.x;
                if (view9 == null) {
                    q.b("permissionHintFullView");
                }
                view9.setVisibility(8);
            }
        }
        View view10 = this.w;
        if (view10 == null) {
            q.b("permissionHintView");
        }
        if (view10.getVisibility() == 0) {
            View view11 = this.w;
            if (view11 == null) {
                q.b("permissionHintView");
            }
            ViewGroup.LayoutParams layoutParams = view11.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ((i2 - com.taobao.android.searchbaseframe.util.j.a(30.0f)) - cpr.Companion.a()) / 2;
            View view12 = this.w;
            if (view12 == null) {
                q.b("permissionHintView");
            }
            view12.setLayoutParams(layoutParams2);
            float f2 = (300 - (i2 - this.C)) / 100.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1) {
                f2 = 1.0f;
            }
            View view13 = this.w;
            if (view13 == null) {
                q.b("permissionHintView");
            }
            view13.setAlpha(f2);
        }
        TUrlImageView tUrlImageView3 = this.u;
        if (tUrlImageView3 == null) {
            q.b("permissionHintBg");
        }
        if (tUrlImageView3.getVisibility() == 0) {
            float f3 = (100 - (i2 - this.C)) / 100.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            } else if (f3 > 1) {
                f3 = 1.0f;
            }
            TUrlImageView tUrlImageView4 = this.u;
            if (tUrlImageView4 == null) {
                q.b("permissionHintBg");
            }
            tUrlImageView4.setAlpha(f3);
        }
        View view14 = this.x;
        if (view14 == null) {
            q.b("permissionHintFullView");
        }
        if (view14.getVisibility() == 0) {
            View view15 = this.x;
            if (view15 == null) {
                q.b("permissionHintFullView");
            }
            ViewGroup.LayoutParams layoutParams3 = view15.getLayoutParams();
            if (layoutParams3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = ((i2 - cpr.Companion.a()) / 2) - com.taobao.android.searchbaseframe.util.j.a(170.0f);
            View view16 = this.x;
            if (view16 == null) {
                q.b("permissionHintFullView");
            }
            view16.setLayoutParams(layoutParams4);
        }
        View view17 = this.y;
        if (view17 == null) {
            q.b("emptyHintView");
        }
        if (view17.getVisibility() != 0) {
            return;
        }
        View view18 = this.y;
        if (view18 == null) {
            q.b("emptyHintView");
        }
        ViewGroup.LayoutParams layoutParams5 = view18.getLayoutParams();
        if (layoutParams5 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = ((i2 - com.taobao.android.searchbaseframe.util.j.a(48.0f)) - cpr.Companion.a()) / 2;
        View view19 = this.y;
        if (view19 == null) {
            q.b("emptyHintView");
        }
        view19.setLayoutParams(layoutParams6);
    }

    private final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.v;
            if (view == null) {
                q.b("permissionHintContainer");
            }
            if (view.getVisibility() == 0) {
                View view2 = this.h;
                if (view2 == null) {
                    q.b("btnContainer");
                }
                if (view2.getVisibility() == 8) {
                    return;
                }
                View view3 = this.h;
                if (view3 == null) {
                    q.b("btnContainer");
                }
                view3.setVisibility(8);
                return;
            }
            View view4 = this.h;
            if (view4 == null) {
                q.b("btnContainer");
            }
            if (view4.getVisibility() == 0) {
                return;
            }
            View view5 = this.h;
            if (view5 == null) {
                q.b("btnContainer");
            }
            view5.setVisibility(0);
        } else {
            View view6 = this.h;
            if (view6 == null) {
                q.b("btnContainer");
            }
            if (view6.getVisibility() == 8) {
                return;
            }
            View view7 = this.h;
            if (view7 == null) {
                q.b("btnContainer");
            }
            view7.setVisibility(8);
        }
    }

    @Override // tb.cpr.b
    public void a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 <= i3 / 2) {
            z = false;
        }
        f(z);
        b(i2, i3);
        if (i2 < 0 || !this.B) {
            return;
        }
        e(false);
    }

    @Override // tb.cpr.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    @Override // tb.cpr.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            q.b("rvImage");
        }
        if (recyclerView.getVisibility() == 0) {
            RecyclerView recyclerView2 = this.q;
            if (recyclerView2 == null) {
                q.b("rvImage");
            }
            return !recyclerView2.canScrollVertically(-1);
        }
        RecyclerView recyclerView3 = this.r;
        if (recyclerView3 == null) {
            q.b("rvFolder");
        }
        if (recyclerView3.getVisibility() != 0) {
            return true;
        }
        RecyclerView recyclerView4 = this.r;
        if (recyclerView4 == null) {
            q.b("rvFolder");
        }
        return !recyclerView4.canScrollVertically(-1);
    }
}
