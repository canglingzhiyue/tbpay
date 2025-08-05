package com.etao.feimagesearch.newresult.widget.titlebar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.newresult.widget.titlebar.c;
import com.etao.feimagesearch.newresult.widget.titlebar.searchbar.Irp2024SearchBarWidget;
import com.etao.feimagesearch.result.d;
import com.etao.feimagesearch.ui.GradientLayout;
import com.etao.feimagesearch.view.ContentOffsetView;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cox;
import tb.coy;
import tb.cpe;
import tb.fhq;
import tb.fhs;
import tb.hon;
import tb.igi;
import tb.kge;

/* loaded from: classes3.dex */
public final class i extends c implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private ContentOffsetView f6880a;
    private RelativeLayout c;
    private LinearLayout d;
    private TUrlImageView e;
    private TextView f;
    private TUrlImageView g;
    private Irp2024SearchBarWidget h;
    private GradientLayout i;
    private RecyclerView j;
    private h k;
    private Bitmap l;
    private int m;
    private final int n;
    private final int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a t;

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Integer b;

        public e(Integer num) {
            i.this = r1;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i.a(i.this, this.b);
            }
        }
    }

    static {
        kge.a(-1666582820);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == 1826538767) {
            super.a((Integer) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ int a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cfcdd14b", new Object[]{iVar})).intValue() : iVar.n;
    }

    public static final /* synthetic */ void a(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ecccab", new Object[]{iVar, new Integer(i)});
        } else {
            iVar.c(i);
        }
    }

    public static final /* synthetic */ void a(i iVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc53da1f", new Object[]{iVar, num});
        } else {
            iVar.b(num);
        }
    }

    public static final /* synthetic */ void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f561da59", new Object[]{iVar});
        } else {
            iVar.eU_();
        }
    }

    public static final /* synthetic */ ContentOffsetView c(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("cae7bb5", new Object[]{iVar});
        }
        ContentOffsetView contentOffsetView = iVar.f6880a;
        if (contentOffsetView == null) {
            q.b("mRootView");
        }
        return contentOffsetView;
    }

    public static final /* synthetic */ RelativeLayout d(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("8d87b82b", new Object[]{iVar});
        }
        RelativeLayout relativeLayout = iVar.c;
        if (relativeLayout == null) {
            q.b("mMainContainer");
        }
        return relativeLayout;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.etao.feimagesearch.view.ContentOffsetView] */
    @Override // tb.igj
    public /* synthetic */ ContentOffsetView k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    public final com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a) ipChange.ipc$dispatch("4efbcf42", new Object[]{this}) : this.t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, boolean z, com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a aVar) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.r = z;
        this.t = aVar;
        this.n = j.a(fhs.b());
        this.o = j.a(fhs.f(this.r));
        this.q = q();
    }

    public ContentOffsetView a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("e3cb5c43", new Object[]{this});
        }
        if (this.r) {
            i = R.layout.feis_irp_titlebar_2024_single;
        } else {
            i = R.layout.feis_irp_titlebar_2024;
        }
        View inflate = LayoutInflater.from(g()).inflate(i, P(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.view.ContentOffsetView");
        }
        this.f6880a = (ContentOffsetView) inflate;
        a(true);
        ContentOffsetView contentOffsetView = this.f6880a;
        if (contentOffsetView == null) {
            q.b("mRootView");
        }
        View findViewById = contentOffsetView.findViewById(R.id.rl_container);
        q.a((Object) findViewById, "mRootView.findViewById(R.id.rl_container)");
        this.c = (RelativeLayout) findViewById;
        ContentOffsetView contentOffsetView2 = this.f6880a;
        if (contentOffsetView2 == null) {
            q.b("mRootView");
        }
        View findViewById2 = contentOffsetView2.findViewById(R.id.ll_search_container);
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        q.a((Object) linearLayout, "this");
        linearLayout.setBackground(eV_());
        int a2 = j.a(13.0f);
        linearLayout.setPadding(a2, 0, a2, 0);
        linearLayout.setVisibility(8);
        i iVar = this;
        linearLayout.setOnClickListener(iVar);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, -j.a(fhs.e(this.r)), 0, 0);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_search) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        q.a((Object) findViewById2, "mRootView.findViewById<L…07_button)\n      }\"\n    }");
        this.d = linearLayout;
        ContentOffsetView contentOffsetView3 = this.f6880a;
        if (contentOffsetView3 == null) {
            q.b("mRootView");
        }
        View findViewById3 = contentOffsetView3.findViewById(R.id.ic_search);
        q.a((Object) findViewById3, "mRootView.findViewById(R.id.ic_search)");
        this.e = (TUrlImageView) findViewById3;
        TUrlImageView tUrlImageView = this.e;
        if (tUrlImageView == null) {
            q.b("mIvSearch");
        }
        tUrlImageView.setImageUrl(this.q ? "https://gw.alicdn.com/imgextra/i2/O1CN01SiHsHS1kgbcrG4PwW_!!6000000004713-2-tps-567-567.png" : "https://gw.alicdn.com/imgextra/i1/O1CN0162Tvji1KwTKm9tqYY_!!6000000001228-49-tps-567-567.webp");
        ContentOffsetView contentOffsetView4 = this.f6880a;
        if (contentOffsetView4 == null) {
            q.b("mRootView");
        }
        View findViewById4 = contentOffsetView4.findViewById(R.id.tv_hint);
        q.a((Object) findViewById4, "mRootView.findViewById(R.id.tv_hint)");
        this.f = (TextView) findViewById4;
        TextView textView = this.f;
        if (textView == null) {
            q.b("mTvQueryText");
        }
        textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_search));
        TextView textView2 = this.f;
        if (textView2 == null) {
            q.b("mTvQueryText");
        }
        textView2.setTextColor(Color.parseColor(this.q ? "#EEEEEE" : "#11192D"));
        TextView textView3 = this.f;
        if (textView3 == null) {
            q.b("mTvQueryText");
        }
        textView3.setTextSize(1, m().U() ? 18.0f : 16.0f);
        ContentOffsetView contentOffsetView5 = this.f6880a;
        if (contentOffsetView5 == null) {
            q.b("mRootView");
        }
        View findViewById5 = contentOffsetView5.findViewById(R.id.btn_back);
        q.a((Object) findViewById5, "mRootView.findViewById(R.id.btn_back)");
        this.g = (TUrlImageView) findViewById5;
        TUrlImageView tUrlImageView2 = this.g;
        if (tUrlImageView2 == null) {
            q.b("mViewBack");
        }
        tUrlImageView2.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_close) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        TUrlImageView tUrlImageView3 = this.g;
        if (tUrlImageView3 == null) {
            q.b("mViewBack");
        }
        tUrlImageView3.setOnClickListener(iVar);
        TUrlImageView tUrlImageView4 = this.g;
        if (tUrlImageView4 == null) {
            q.b("mViewBack");
        }
        tUrlImageView4.setImageUrl(this.q ? "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png" : "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp");
        ContentOffsetView contentOffsetView6 = this.f6880a;
        if (contentOffsetView6 == null) {
            q.b("mRootView");
        }
        View findViewById6 = contentOffsetView6.findViewById(R.id.gl_rv);
        q.a((Object) findViewById6, "mRootView.findViewById(R.id.gl_rv)");
        this.i = (GradientLayout) findViewById6;
        ContentOffsetView contentOffsetView7 = this.f6880a;
        if (contentOffsetView7 == null) {
            q.b("mRootView");
        }
        View findViewById7 = contentOffsetView7.findViewById(R.id.rv_thumbnails);
        q.a((Object) findViewById7, "mRootView.findViewById(R.id.rv_thumbnails)");
        this.j = (RecyclerView) findViewById7;
        this.k = new h(m(), this.r, new Irp2024TitleBarWidget$onCreateView$2(this));
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            q.b("mObjectsRv");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(g(), 0, false));
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == null) {
            q.b("mObjectsRv");
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        recyclerView2.setAdapter(hVar);
        RecyclerView recyclerView3 = this.j;
        if (recyclerView3 == null) {
            q.b("mObjectsRv");
        }
        Integer num = null;
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = this.j;
        if (recyclerView4 == null) {
            q.b("mObjectsRv");
        }
        recyclerView4.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.etao.feimagesearch.newresult.widget.titlebar.Irp2024TitleBarWidget$onCreateView$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView5, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                int i2 = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView5, state});
                    return;
                }
                int childAdapterPosition = recyclerView5 != null ? recyclerView5.getChildAdapterPosition(view) : 0;
                if (state != null) {
                    i2 = state.getItemCount();
                }
                if (childAdapterPosition == i2 - 1 || rect == null) {
                    return;
                }
                rect.right = i.a(i.this);
            }
        });
        RecyclerView recyclerView5 = this.j;
        if (recyclerView5 == null) {
            q.b("mObjectsRv");
        }
        recyclerView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.etao.feimagesearch.newresult.widget.titlebar.Irp2024TitleBarWidget$onCreateView$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)});
                } else {
                    i.b(i.this);
                }
            }
        });
        Activity g = g();
        ContentOffsetView contentOffsetView8 = this.f6880a;
        if (contentOffsetView8 == null) {
            q.b("mRootView");
        }
        this.h = new Irp2024SearchBarWidget(g, contentOffsetView8, this.q, m().U(), new b());
        ScreenType a3 = ScreenType.a(g());
        if (a3 != null) {
            num = Integer.valueOf(a3.a());
        }
        b(num);
        ContentOffsetView contentOffsetView9 = this.f6880a;
        if (contentOffsetView9 == null) {
            q.b("mRootView");
        }
        return contentOffsetView9;
    }

    /* loaded from: classes3.dex */
    public static final class b implements com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            i.this = r1;
        }

        @Override // com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a i = i.this.i();
            if (i != null) {
                i.a(z);
            }
            if (z) {
                i.this.a(false);
                i.c(i.this).setPadding(0, 0, 0, 0);
                i.d(i.this).setVisibility(8);
                i.this.b(0);
                return;
            }
            i.this.a(true);
            i.c(i.this).setPadding(0, j.a(10.0f), 0, 0);
            i.d(i.this).setVisibility(0);
            coy.c("Page_PhotoSearchResult", "showTextSearchNew", new String[0]);
        }

        @Override // com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
                return;
            }
            com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a i = i.this.i();
            if (i == null) {
                return;
            }
            i.b(z);
        }

        @Override // com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a
        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                return;
            }
            com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a i = i.this.i();
            if (i == null) {
                return;
            }
            i.a(jSONArray);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(List<a.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        hVar.d();
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = 0;
        for (a.b bVar : list) {
            h hVar2 = this.k;
            if (hVar2 == null) {
                q.b("mAdapter");
            }
            hVar2.a(bVar.c, i, bVar.f6858a);
            i++;
        }
        h hVar3 = this.k;
        if (hVar3 == null) {
            q.b("mAdapter");
        }
        d b2 = hVar3.b();
        if (b2 == null) {
            h hVar4 = this.k;
            if (hVar4 == null) {
                q.b("mAdapter");
            }
            RectF rectF = list.get(0).c;
            q.a((Object) rectF, "regionParts[0].region");
            hVar4.a(rectF, false);
        } else {
            h hVar5 = this.k;
            if (hVar5 == null) {
                q.b("mAdapter");
            }
            RectF rectF2 = b2.c;
            q.a((Object) rectF2, "selectedRegion.rectF");
            hVar5.a(rectF2, b2.h);
        }
        h hVar6 = this.k;
        if (hVar6 == null) {
            q.b("mAdapter");
        }
        d(hVar6.getItemCount());
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(List<a.b> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
        } else if (list != null && list.size() > 0 && i >= 0) {
            h hVar = this.k;
            if (hVar == null) {
                q.b("mAdapter");
            }
            if (i > hVar.getItemCount()) {
                return;
            }
            int i2 = i;
            for (a.b bVar : list) {
                h hVar2 = this.k;
                if (hVar2 == null) {
                    q.b("mAdapter");
                }
                hVar2.a(bVar.c, i2, bVar.f6858a);
                i2++;
            }
            h hVar3 = this.k;
            if (hVar3 == null) {
                q.b("mAdapter");
            }
            h hVar4 = this.k;
            if (hVar4 == null) {
                q.b("mAdapter");
            }
            hVar3.notifyItemRangeChanged(i, hVar4.getItemCount() - i);
            h hVar5 = this.k;
            if (hVar5 == null) {
                q.b("mAdapter");
            }
            d(hVar5.getItemCount());
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
            return;
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        hVar.b(rectF);
        h hVar2 = this.k;
        if (hVar2 == null) {
            q.b("mAdapter");
        }
        if (hVar2.getItemCount() > 0) {
            h hVar3 = this.k;
            if (hVar3 == null) {
                q.b("mAdapter");
            }
            c(hVar3.getItemCount() - 1);
        }
        h hVar4 = this.k;
        if (hVar4 == null) {
            q.b("mAdapter");
        }
        d(hVar4.getItemCount());
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void eC_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567a4fa8", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView == null) {
            q.b("mViewBack");
        }
        tUrlImageView.setVisibility(8);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void eD_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582f2847", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView == null) {
            q.b("mViewBack");
        }
        tUrlImageView.setVisibility(0);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        this.l = bitmap;
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout == null) {
            q.b("mMainContainer");
        }
        RelativeLayout relativeLayout2 = this.c;
        if (relativeLayout2 == null) {
            q.b("mMainContainer");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        layoutParams.height = j.a(fhs.h(this.r));
        relativeLayout.setLayoutParams(layoutParams);
        try {
            h hVar = this.k;
            if (hVar == null) {
                q.b("mAdapter");
            }
            hVar.a(bitmap);
        } catch (Exception unused) {
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8970e7b", new Object[]{this, rectF, new Boolean(z)});
        } else if (rectF == null) {
        } else {
            h hVar = this.k;
            if (hVar == null) {
                q.b("mAdapter");
            }
            hVar.a(rectF, z);
            h hVar2 = this.k;
            if (hVar2 == null) {
                q.b("mAdapter");
            }
            c(hVar2.c());
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        hVar.a(i);
        c(i);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public int eB_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54c576fc", new Object[]{this})).intValue() : this.o;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Irp2024SearchBarWidget irp2024SearchBarWidget = this.h;
        if (irp2024SearchBarWidget == null) {
            q.b("mSearchBar");
        }
        irp2024SearchBarWidget.setHintQuery(str);
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            TextView textView = this.f;
            if (textView == null) {
                q.b("mTvQueryText");
            }
            textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_search));
            return;
        }
        TextView textView2 = this.f;
        if (textView2 == null) {
            q.b("mTvQueryText");
        }
        textView2.setText(str2);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public Bitmap eF_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d8e22963", new Object[]{this});
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        return hVar.b(this.m);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        ContentOffsetView contentOffsetView = this.f6880a;
        if (contentOffsetView == null) {
            q.b("mRootView");
        }
        contentOffsetView.setOffset(i);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
        } else {
            Irp2024SearchBarWidget irp2024SearchBarWidget = this.h;
            if (irp2024SearchBarWidget == null) {
                q.b("mSearchBar");
            }
            irp2024SearchBarWidget.setQueryTag(str);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public boolean eE_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59e400ea", new Object[]{this})).booleanValue();
        }
        Irp2024SearchBarWidget irp2024SearchBarWidget = this.h;
        if (irp2024SearchBarWidget == null) {
            q.b("mSearchBar");
        }
        return irp2024SearchBarWidget.isVisible();
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            coy.c("Page_PhotoSearchResult", "showTextSearchNew", new String[0]);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        eT_();
        if (com.alibaba.ability.localization.b.c()) {
            LinearLayout linearLayout = this.d;
            if (linearLayout == null) {
                q.b("mBtnSearch");
            }
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = this.d;
            if (linearLayout2 == null) {
                q.b("mBtnSearch");
            }
            linearLayout2.setVisibility(z2 ? 0 : 8);
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            q.b("mObjectsRv");
        }
        if (!z) {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public int b(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee3bf7ed", new Object[]{this, rectF})).intValue();
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        return hVar.a(rectF);
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public LinkedList<d> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("60f0e959", new Object[]{this});
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        return hVar.a();
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.r;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            q.b("mObjectsRv");
        }
        return recyclerView.getWidth();
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        super.a(num);
        ContentOffsetView contentOffsetView = this.f6880a;
        if (contentOffsetView == null) {
            q.b("mRootView");
        }
        contentOffsetView.post(new e(num));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (eG_() == null) {
        } else {
            LinearLayout linearLayout = this.d;
            if (linearLayout == null) {
                q.b("mBtnSearch");
            }
            if (q.a(view, linearLayout)) {
                Irp2024SearchBarWidget irp2024SearchBarWidget = this.h;
                if (irp2024SearchBarWidget == null) {
                    q.b("mSearchBar");
                }
                irp2024SearchBarWidget.show();
                c.a eG_ = eG_();
                if (eG_ != null) {
                    eG_.u();
                }
                Irp2024SearchBarWidget irp2024SearchBarWidget2 = this.h;
                if (irp2024SearchBarWidget2 == null) {
                    q.b("mSearchBar");
                }
                irp2024SearchBarWidget2.setThumbContent(eF_());
                String[] strArr = new String[2];
                strArr[0] = "query";
                Irp2024SearchBarWidget irp2024SearchBarWidget3 = this.h;
                if (irp2024SearchBarWidget3 == null) {
                    q.b("mSearchBar");
                }
                strArr[1] = irp2024SearchBarWidget3.getHintQuery();
                coy.a("Page_PhotoSearchResult", "clickTextSearchNew", strArr);
                return;
            }
            TUrlImageView tUrlImageView = this.g;
            if (tUrlImageView == null) {
                q.b("mViewBack");
            }
            if (view != tUrlImageView) {
                return;
            }
            c.a eG_2 = eG_();
            if (eG_2 != null) {
                eG_2.t();
            }
            cox.a("Page_PhotoSearchResult", "clickBackBtn", "pssource", m().r());
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ContentOffsetView contentOffsetView = this.f6880a;
            if (contentOffsetView == null) {
                q.b("mRootView");
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float b2 = j.b(6.5f);
            gradientDrawable.setCornerRadii(new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f});
            contentOffsetView.setBackground(gradientDrawable);
        } else {
            ContentOffsetView contentOffsetView2 = this.f6880a;
            if (contentOffsetView2 == null) {
                q.b("mRootView");
            }
            contentOffsetView2.setBackground(null);
        }
    }

    private final void eT_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737cb237", new Object[]{this});
            return;
        }
        boolean q = q();
        if (this.q == q) {
            return;
        }
        this.q = q;
        TUrlImageView tUrlImageView = this.e;
        if (tUrlImageView == null) {
            q.b("mIvSearch");
        }
        tUrlImageView.setImageUrl(this.q ? "https://gw.alicdn.com/imgextra/i2/O1CN01SiHsHS1kgbcrG4PwW_!!6000000004713-2-tps-567-567.png" : "https://gw.alicdn.com/imgextra/i1/O1CN0162Tvji1KwTKm9tqYY_!!6000000001228-49-tps-567-567.webp");
        TextView textView = this.f;
        if (textView == null) {
            q.b("mTvQueryText");
        }
        textView.setTextColor(Color.parseColor(this.q ? "#EEEEEE" : "#11192D"));
        TUrlImageView tUrlImageView2 = this.g;
        if (tUrlImageView2 == null) {
            q.b("mViewBack");
        }
        tUrlImageView2.setImageUrl(this.q ? "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png" : "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp");
    }

    private final void eU_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75318ad6", new Object[]{this});
            return;
        }
        h hVar = this.k;
        if (hVar == null) {
            q.b("mAdapter");
        }
        if (hVar.getItemCount() == 0) {
            return;
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            q.b("mBtnSearch");
        }
        int right = linearLayout.getRight();
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            q.b("mObjectsRv");
        }
        int width = right - recyclerView.getWidth();
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == null) {
            q.b("mObjectsRv");
        }
        int left = (width - recyclerView2.getLeft()) - j.a(56.0f);
        TextView textView = this.f;
        if (textView == null) {
            q.b("mTvQueryText");
        }
        textView.setMaxWidth(left);
    }

    private final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            h hVar = this.k;
            if (hVar == null) {
                q.b("mAdapter");
            }
            if (i >= hVar.getItemCount()) {
                return;
            }
            this.m = i;
            RecyclerView recyclerView = this.j;
            if (recyclerView == null) {
                q.b("mObjectsRv");
            }
            recyclerView.scrollToPosition(this.m);
        }
    }

    private final GradientDrawable eV_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("f7dfa0d5", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(this.q ? "#222222" : "#FFFFFF"));
        gradientDrawable.setCornerRadius(j.b(6.5f));
        return gradientDrawable;
    }

    private final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        if (m().P()) {
            ContentOffsetView contentOffsetView = this.f6880a;
            if (contentOffsetView == null) {
                q.b("mRootView");
            }
            View findViewById = contentOffsetView.findViewById(R.id.btn_close_screen_search);
            q.a((Object) findViewById, "this");
            findViewById.setVisibility(0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
            gradientDrawable.setCornerRadius(j.b(6.5f));
            findViewById.setBackground(gradientDrawable);
            findViewById.setOnClickListener(a.INSTANCE);
            ContentOffsetView contentOffsetView2 = this.f6880a;
            if (contentOffsetView2 == null) {
                q.b("mRootView");
            }
            TUrlImageView tUrlImageView = (TUrlImageView) contentOffsetView2.findViewById(R.id.tiv_close);
            q.a((Object) tUrlImageView, "this");
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Dn6i5C284BAgfWjMM_!!6000000007878-49-tps-500-500.webp");
            if (!this.p) {
                TextView textView = this.f;
                if (textView == null) {
                    q.b("mTvQueryText");
                }
                textView.setVisibility(8);
                LinearLayout linearLayout = this.d;
                if (linearLayout == null) {
                    q.b("mBtnSearch");
                }
                linearLayout.setPadding(j.a(13.0f), 0, j.a(7.0f), 0);
                LinearLayout linearLayout2 = this.d;
                if (linearLayout2 == null) {
                    q.b("mBtnSearch");
                }
                linearLayout2.setBackground(null);
                this.p = true;
            }
        } else {
            ContentOffsetView contentOffsetView3 = this.f6880a;
            if (contentOffsetView3 == null) {
                q.b("mRootView");
            }
            View findViewById2 = contentOffsetView3.findViewById(R.id.btn_close_screen_search);
            q.a((Object) findViewById2, "this");
            findViewById2.setVisibility(8);
            if (i <= 4) {
                if (this.p) {
                    TextView textView2 = this.f;
                    if (textView2 == null) {
                        q.b("mTvQueryText");
                    }
                    textView2.setVisibility(0);
                    int a2 = j.a(13.0f);
                    LinearLayout linearLayout3 = this.d;
                    if (linearLayout3 == null) {
                        q.b("mBtnSearch");
                    }
                    linearLayout3.setPadding(a2, 0, a2, 0);
                    LinearLayout linearLayout4 = this.d;
                    if (linearLayout4 == null) {
                        q.b("mBtnSearch");
                    }
                    linearLayout4.setBackground(eV_());
                    this.p = false;
                }
            } else if (!this.p) {
                TextView textView3 = this.f;
                if (textView3 == null) {
                    q.b("mTvQueryText");
                }
                textView3.setVisibility(8);
                LinearLayout linearLayout5 = this.d;
                if (linearLayout5 == null) {
                    q.b("mBtnSearch");
                }
                linearLayout5.setPadding(j.a(13.0f), 0, j.a(7.0f), 0);
                LinearLayout linearLayout6 = this.d;
                if (linearLayout6 == null) {
                    q.b("mBtnSearch");
                }
                linearLayout6.setBackground(null);
                this.p = true;
            }
        }
        GradientLayout gradientLayout = this.i;
        if (gradientLayout == null) {
            q.b("mGradientContainer");
        }
        if (gradientLayout.hasOpenGradient()) {
            return;
        }
        int a3 = i * j.a(51.0f);
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            q.b("mObjectsRv");
        }
        if (a3 <= recyclerView.getWidth()) {
            return;
        }
        GradientLayout gradientLayout2 = this.i;
        if (gradientLayout2 == null) {
            q.b("mGradientContainer");
        }
        gradientLayout2.openGradient();
    }

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, it});
                return;
            }
            coy.a("Page_PhotoSearchResult", "floatbarTurnOff", new String[0]);
            fhq.INSTANCE.b();
            com.etao.feimagesearch.k.a(com.b(), cpe.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, "false");
            q.a((Object) it, "it");
            it.setVisibility(8);
        }
    }

    private final void b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e053ee", new Object[]{this, num});
        } else if (num == null) {
        } else {
            num.intValue();
            RecyclerView recyclerView = this.j;
            if (recyclerView == null) {
                q.b("mObjectsRv");
            }
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (num.intValue() == 2) {
                layoutParams2.leftMargin = j.a(21.0f);
            } else if (num.intValue() == 1) {
                layoutParams2.leftMargin = j.a(25.0f);
            } else if (num.intValue() == 3) {
                layoutParams2.leftMargin = j.a(17.0f);
            } else {
                layoutParams2.leftMargin = j.a(13.0f);
            }
            RecyclerView recyclerView2 = this.j;
            if (recyclerView2 == null) {
                q.b("mObjectsRv");
            }
            recyclerView2.setLayoutParams(layoutParams2);
        }
    }
}
