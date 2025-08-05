package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.history.HistoryResult;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.s;
import com.taobao.search.mmd.recommendtip.FlowLayout;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.CombineHistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.nqw;

/* loaded from: classes7.dex */
public final class nqk extends nqj<CombineHistoryCellBean, com.taobao.search.searchdoor.sf.widgets.e> implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f31663a;
    private TextView e;
    private View f;
    private FrameLayout g;
    private LinearLayout i;
    private TextView j;
    private TextView k;
    private View l;
    private FlowLayout m;
    private FlowLayout n;
    private List<? extends ActivateBean> o;
    private HistoryResult p;
    private boolean q;
    private boolean r;
    private final int s;
    private final String t;
    private View u;
    private SearchUrlImageView v;
    private float w;
    private final boolean x;

    /* loaded from: classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ActivateBean b;
        public final /* synthetic */ FlowLayout c;
        public final /* synthetic */ ViewGroup d;

        public a(ActivateBean activateBean, FlowLayout flowLayout, ViewGroup viewGroup) {
            this.b = activateBean;
            this.c = flowLayout;
            this.d = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) nqk.this.j();
            q.a((Object) model, "model");
            nqh c = model.c();
            if (c != null) {
                c.a(this.b);
            }
            this.c.removeView(this.d);
            if (this.c.getChildCount() != 1) {
                return;
            }
            nqk.this.a(0, (CombineHistoryCellBean) null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AuctionItemVO b;
        public final /* synthetic */ FlowLayout c;
        public final /* synthetic */ View d;

        public b(AuctionItemVO auctionItemVO, FlowLayout flowLayout, View view) {
            this.b = auctionItemVO;
            this.c = flowLayout;
            this.d = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            com.etao.feimagesearch.history.b.a(nqk.this.getActivity(), this.b);
            this.c.removeView(this.d);
            if (this.c.getChildCount() != 0) {
                return;
            }
            nqk.this.a(0, (CombineHistoryCellBean) null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            nqk nqkVar;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (nqk.a(nqk.this) == null) {
                if (nqk.b(nqk.this) != null) {
                    FlowLayout b = nqk.b(nqk.this);
                    if (b != null) {
                        b.removeAllViews();
                    }
                    com.etao.feimagesearch.history.b.b(nqk.this.getActivity());
                    nqk.a(nqk.this, (HistoryResult) null);
                    nqkVar = nqk.this;
                    str = "tab2";
                }
                nqk.this.a(0, (CombineHistoryCellBean) null);
            }
            FlowLayout a2 = nqk.a(nqk.this);
            if (a2 != null) {
                a2.removeAllViews();
            }
            com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) nqk.this.j();
            q.a((Object) model, "model");
            nqh c = model.c();
            if (c != null) {
                c.a();
            }
            nqk.a(nqk.this, (List) null);
            nqkVar = nqk.this;
            str = "tab1";
            com.taobao.search.mmd.util.e.a("ClearHistorySuccess", nqk.a(nqkVar, str));
            nqk.this.a(0, (CombineHistoryCellBean) null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Object b;

        public d(Object obj) {
            this.b = obj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            nqk nqkVar;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Object obj = this.b;
            if (!(obj instanceof ActivateBean)) {
                if (obj instanceof AuctionItemVO) {
                    com.etao.feimagesearch.history.b.a(nqk.this.getActivity(), (AuctionItemVO) this.b);
                    nqkVar = nqk.this;
                    str = "tab2";
                }
                nqk.this.a(0, (CombineHistoryCellBean) null);
            }
            com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) nqk.this.j();
            q.a((Object) model, "model");
            nqh c = model.c();
            if (c != null) {
                c.a((ActivateBean) this.b);
            }
            nqkVar = nqk.this;
            str = "tab1";
            com.taobao.search.mmd.util.e.a("History_DeleteOnebyOne", nqk.a(nqkVar, str));
            nqk.this.a(0, (CombineHistoryCellBean) null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f31668a;
        public final /* synthetic */ AuctionItemVO b;
        public final /* synthetic */ int c;
        public final /* synthetic */ HistoryResult d;
        public final /* synthetic */ FlowLayout e;
        public final /* synthetic */ nqk f;

        public e(View view, nqk nqkVar, AuctionItemVO auctionItemVO, int i, HistoryResult historyResult, FlowLayout flowLayout) {
            this.f31668a = view;
            this.f = nqkVar;
            this.b = auctionItemVO;
            this.c = i;
            this.d = historyResult;
            this.e = flowLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View expandButton = this.f31668a;
            q.a((Object) expandButton, "expandButton");
            expandButton.setVisibility(8);
            this.e.setMaxLines(2);
            com.taobao.search.mmd.util.e.a("History_Expand", nqk.a(this.f, "tab2"));
        }
    }

    /* loaded from: classes7.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TUrlImageView b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View e;
        public final /* synthetic */ int f;
        public final /* synthetic */ HistoryResult g;
        public final /* synthetic */ AuctionItemVO h;
        public final /* synthetic */ FlowLayout i;

        public f(TUrlImageView tUrlImageView, View view, View view2, AuctionItemVO auctionItemVO, int i, HistoryResult historyResult, FlowLayout flowLayout) {
            this.b = tUrlImageView;
            this.c = view;
            this.e = view2;
            this.h = auctionItemVO;
            this.f = i;
            this.g = historyResult;
            this.i = flowLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TUrlImageView imvImgHistory = this.b;
            q.a((Object) imvImgHistory, "imvImgHistory");
            imvImgHistory.setImageUrl(this.h.picPath.toString());
            View expandButton = this.c;
            q.a((Object) expandButton, "expandButton");
            expandButton.setVisibility(8);
            this.i.setMaxLines(2);
            com.taobao.search.mmd.util.e.a("History_Expand", ai.a(j.a("tabname", "tab2")));
        }
    }

    static {
        kge.a(-1755614613);
        kge.a(-1201612728);
        kge.a(1426707756);
    }

    public static /* synthetic */ Object ipc$super(nqk nqkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ FlowLayout a(nqk nqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlowLayout) ipChange.ipc$dispatch("e4b5fa98", new Object[]{nqkVar}) : nqkVar.m;
    }

    public static final /* synthetic */ Map a(nqk nqkVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bb42194f", new Object[]{nqkVar, str}) : nqkVar.b(str);
    }

    public static final /* synthetic */ void a(nqk nqkVar, HistoryResult historyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44df9ab8", new Object[]{nqkVar, historyResult});
        } else {
            nqkVar.p = historyResult;
        }
    }

    public static final /* synthetic */ void a(nqk nqkVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edaf3c1", new Object[]{nqkVar, list});
        } else {
            nqkVar.o = list;
        }
    }

    public static final /* synthetic */ FlowLayout b(nqk nqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlowLayout) ipChange.ipc$dispatch("f56bc759", new Object[]{nqkVar}) : nqkVar.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqk(View view, Activity activity, ium parent, com.taobao.search.searchdoor.sf.widgets.e eVar) {
        super(view, activity, parent, eVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        this.t = "ImgHistoryClicked";
        this.s = 20;
        this.w = 13.5f;
        Activity activity2 = activity;
        this.u = LayoutInflater.from(activity2).inflate(R.layout.tbsearch_history_expand_btn, (ViewGroup) new FrameLayout(activity2), false);
        this.x = poq.a(activity);
        if (view != null) {
            View findViewById = view.findViewById(R.id.text_history_title);
            q.a((Object) findViewById, "findViewById(R.id.text_history_title)");
            this.f31663a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.img_history_title);
            q.a((Object) findViewById2, "findViewById(R.id.img_history_title)");
            this.e = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.delete_btn);
            q.a((Object) findViewById3, "findViewById(R.id.delete_btn)");
            this.f = findViewById3;
            View findViewById4 = view.findViewById(R.id.fl_history_container);
            q.a((Object) findViewById4, "findViewById(R.id.fl_history_container)");
            this.g = (FrameLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.ll_delete_combo);
            q.a((Object) findViewById5, "findViewById(R.id.ll_delete_combo)");
            this.i = (LinearLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.tv_delete_all);
            q.a((Object) findViewById6, "findViewById(R.id.tv_delete_all)");
            this.j = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tv_delete_finish);
            q.a((Object) findViewById7, "findViewById(R.id.tv_delete_finish)");
            this.k = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.divider);
            q.a((Object) findViewById8, "findViewById(R.id.divider)");
            this.l = findViewById8;
            View findViewById9 = view.findViewById(R.id.imv_img_history_guide);
            q.a((Object) findViewById9, "findViewById(R.id.imv_img_history_guide)");
            this.v = (SearchUrlImageView) findViewById9;
            TextView textView = this.f31663a;
            if (textView == null) {
                q.b("textHistoryBtn");
            }
            nqk nqkVar = this;
            textView.setOnClickListener(nqkVar);
            TextView textView2 = this.e;
            if (textView2 == null) {
                q.b("imgHistoryBtn");
            }
            textView2.setOnClickListener(nqkVar);
            View view2 = this.f;
            if (view2 == null) {
                q.b("deleteBtn");
            }
            view2.setOnClickListener(nqkVar);
            this.u.setOnClickListener(nqkVar);
            TextView textView3 = this.j;
            if (textView3 == null) {
                q.b("deleteAllBtn");
            }
            textView3.setOnClickListener(nqkVar);
            TextView textView4 = this.k;
            if (textView4 == null) {
                q.b("deleteFinishBtn");
            }
            textView4.setOnClickListener(nqkVar);
            TUrlImageView tUrlImageView = (TUrlImageView) this.u.findViewById(R.id.imv_expand);
            if (tUrlImageView == null) {
                return;
            }
            tUrlImageView.setImageUrl(H() ? "https://gw.alicdn.com/imgextra/i4/O1CN01pcxybo1Uw9AMPDGT3_!!6000000002581-2-tps-72-72.png" : "https://gw.alicdn.com/imgextra/i3/O1CN01OtDDNy1hFB0lmCbK1_!!6000000004247-2-tps-72-72.png");
        }
    }

    private final boolean a(CombineHistoryCellBean combineHistoryCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56042e17", new Object[]{this, combineHistoryCellBean})).booleanValue() : combineHistoryCellBean != null && combineHistoryCellBean.isShowGuide() && !TextUtils.isEmpty(combineHistoryCellBean.getGuideUrl()) && !s.a().getBoolean(this.t, false);
    }

    @Override // tb.nqj
    public void a(int i, CombineHistoryCellBean combineHistoryCellBean) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6f7400", new Object[]{this, new Integer(i), combineHistoryCellBean});
            return;
        }
        e();
        String str = null;
        if ((combineHistoryCellBean != null ? combineHistoryCellBean.getTitleTextSize() : null) != null) {
            String titleTextSize = combineHistoryCellBean.getTitleTextSize();
            q.a((Object) titleTextSize, "bean.titleTextSize");
            this.w = Float.parseFloat(titleTextSize);
        }
        M();
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        String picModName = combineHistoryCellBean != null ? combineHistoryCellBean.getPicModName() : null;
        if (!TextUtils.isEmpty(picModName)) {
            TextView textView = this.e;
            if (textView == null) {
                q.b("imgHistoryBtn");
            }
            textView.setText(picModName);
        }
        if (combineHistoryCellBean != null) {
            str = combineHistoryCellBean.name;
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            TextView textView2 = this.f31663a;
            if (textView2 == null) {
                q.b("textHistoryBtn");
            }
            textView2.setText(str2);
        }
        if (b()) {
            J();
            return;
        }
        boolean c2 = c();
        boolean d2 = d();
        if (c2) {
            if (!this.q) {
                this.q = true;
                com.taobao.search.mmd.util.e.b("Page_SearchDoor_Button-HistoryTab_Exp", b("tab1"));
            }
            TextView textView3 = this.f31663a;
            if (textView3 == null) {
                q.b("textHistoryBtn");
            }
            textView3.setVisibility(0);
        } else {
            TextView textView4 = this.f31663a;
            if (textView4 == null) {
                q.b("textHistoryBtn");
            }
            textView4.setVisibility(8);
        }
        if (d2) {
            if (a(combineHistoryCellBean)) {
                SearchUrlImageView searchUrlImageView = this.v;
                if (searchUrlImageView == null) {
                    q.b("imgHistoryGuide");
                }
                searchUrlImageView.setVisibility(0);
                SearchUrlImageView searchUrlImageView2 = this.v;
                if (searchUrlImageView2 == null) {
                    q.b("imgHistoryGuide");
                }
                if (combineHistoryCellBean == null) {
                    q.a();
                }
                searchUrlImageView2.setImageUrl(combineHistoryCellBean.getGuideUrl());
            }
            if (!this.r) {
                this.r = true;
                com.taobao.search.mmd.util.e.b("Page_SearchDoor_Button-HistoryTab_Exp", b("tab2"));
            }
            TextView textView5 = this.e;
            if (textView5 == null) {
                q.b("imgHistoryBtn");
            }
            textView5.setVisibility(0);
        } else {
            TextView textView6 = this.e;
            if (textView6 == null) {
                q.b("imgHistoryBtn");
            }
            textView6.setVisibility(8);
        }
        View view = this.l;
        if (view == null) {
            q.b("divider");
        }
        if (!c2 || !d2) {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (this.x) {
            View view2 = this.l;
            if (view2 == null) {
                q.b("divider");
            }
            view2.setVisibility(8);
        }
        K();
        if (!d2) {
            com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) j();
            q.a((Object) model, "model");
            model.a(true);
        }
        layoutParams.height = -2;
        this.itemView.requestLayout();
        com.taobao.search.searchdoor.sf.widgets.e model2 = (com.taobao.search.searchdoor.sf.widgets.e) j();
        q.a((Object) model2, "model");
        if (model2.d() && c2) {
            E();
        } else if (!d2) {
        } else {
            G();
        }
    }

    private final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (!((CombineHistoryCellBean) this.h).newStyle) {
        } else {
            TextView textView = this.f31663a;
            if (textView == null) {
                q.b("textHistoryBtn");
            }
            textView.setTextSize(1, this.w);
            TextView textView2 = this.e;
            if (textView2 == null) {
                q.b("imgHistoryBtn");
            }
            textView2.setTextSize(1, this.w);
            TextView textView3 = this.j;
            if (textView3 == null) {
                q.b("deleteAllBtn");
            }
            textView3.setTextColor(Color.parseColor("#999999"));
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                q.b("historyContainer");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = com.taobao.android.searchbaseframe.util.j.a(6.0f);
            }
            this.u.setBackgroundResource(H() ? R.drawable.tbsearch_history_tag_background_night_new_style : R.drawable.tbsearch_history_tag_background_new_style);
            if (!this.x) {
                return;
            }
            CombineHistoryCellBean combineHistoryCellBean = (CombineHistoryCellBean) this.h;
            if ((combineHistoryCellBean != null ? combineHistoryCellBean.getTitleTextSize() : null) == null) {
                TextView textView4 = this.f31663a;
                if (textView4 == null) {
                    q.b("textHistoryBtn");
                }
                textView4.setTextSize(1, 15.0f);
                TextView textView5 = this.e;
                if (textView5 == null) {
                    q.b("imgHistoryBtn");
                }
                textView5.setTextSize(1, 15.0f);
                TextView textView6 = this.j;
                if (textView6 == null) {
                    q.b("deleteAllBtn");
                }
                textView6.setTextSize(1, 13.0f);
                TextView textView7 = this.j;
                if (textView7 == null) {
                    q.b("deleteAllBtn");
                }
                textView7.setTextColor(Color.parseColor("#50607A"));
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = com.taobao.android.searchbaseframe.util.j.a(9.0f);
            }
            this.u.setPadding(com.taobao.android.searchbaseframe.util.j.a(6.0f), com.taobao.android.searchbaseframe.util.j.a(6.0f), com.taobao.android.searchbaseframe.util.j.a(6.0f), com.taobao.android.searchbaseframe.util.j.a(6.0f));
            this.u.setBackgroundResource(H() ? R.drawable.tbsearch_history_tag_background_night_new_style : R.drawable.tbsearch_history_tag_background_new_style_new);
            View tailView = this.u;
            q.a((Object) tailView, "tailView");
            ViewGroup.LayoutParams layoutParams2 = tailView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMargins(0, com.taobao.android.searchbaseframe.util.j.a(4.0f), 0, 0);
            marginLayoutParams2.width = com.taobao.android.searchbaseframe.util.j.a(27.0f);
            marginLayoutParams2.height = com.taobao.android.searchbaseframe.util.j.a(27.0f);
            View tailView2 = this.u;
            q.a((Object) tailView2, "tailView");
            tailView2.setLayoutParams(marginLayoutParams2);
            TUrlImageView expandImg = (TUrlImageView) this.u.findViewById(R.id.imv_expand);
            q.a((Object) expandImg, "expandImg");
            ViewGroup.LayoutParams layoutParams3 = expandImg.getLayoutParams();
            if (layoutParams3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.height = com.taobao.android.searchbaseframe.util.j.a(5.85f);
            marginLayoutParams3.width = com.taobao.android.searchbaseframe.util.j.a(9.75f);
            expandImg.setLayoutParams(marginLayoutParams3);
            expandImg.setImageUrl(null);
            H();
            expandImg.setBackgroundResource(R.drawable.tbsearch_icon_history_expand);
        }
    }

    private final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !c() && !d();
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        List<? extends ActivateBean> list = this.o;
        return !(list == null || list.isEmpty());
    }

    private final boolean d() {
        Map<Long, AuctionItemVO> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        BEAN mBean = this.h;
        q.a((Object) mBean, "mBean");
        if (!((CombineHistoryCellBean) mBean).isShowPicMod()) {
            return false;
        }
        HistoryResult historyResult = this.p;
        return ((historyResult == null || (map = historyResult.resultData) == null) ? 0 : map.size()) > 0;
    }

    private final void e() {
        HistoryCellBean b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) j();
        q.a((Object) model, "model");
        nqh c2 = model.c();
        this.o = (c2 == null || (b2 = c2.b()) == null) ? null : b2.activateItems;
        try {
            this.p = com.etao.feimagesearch.history.b.a((Context) getActivity(), "image", false, 10);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        TextView textView = this.f31663a;
        if (textView == null) {
            q.b("textHistoryBtn");
        }
        String str = "tab1";
        if (q.a(view, textView)) {
            com.taobao.search.mmd.util.e.a("HistoryTab_Clk", b(str));
            com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) j();
            q.a((Object) model, "model");
            model.a(true);
            K();
            e();
            E();
            return;
        }
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b("imgHistoryBtn");
        }
        if (q.a(view, textView2)) {
            com.taobao.search.mmd.util.e.a("HistoryTab_Clk", b("tab2"));
            com.taobao.search.searchdoor.sf.widgets.e model2 = (com.taobao.search.searchdoor.sf.widgets.e) j();
            q.a((Object) model2, "model");
            model2.a(false);
            K();
            e();
            G();
            return;
        }
        View view2 = this.f;
        if (view2 == null) {
            q.b("deleteBtn");
        }
        if (q.a(view, view2)) {
            if (this.m == null) {
                str = "tab2";
            }
            com.taobao.search.mmd.util.e.a("ClearHistory", b(str));
            I();
            return;
        }
        TextView textView3 = this.k;
        if (textView3 == null) {
            q.b("deleteFinishBtn");
        }
        if (q.a(view, textView3)) {
            L();
            e();
            return;
        }
        TextView textView4 = this.j;
        if (textView4 == null) {
            q.b("deleteAllBtn");
        }
        if (q.a(view, textView4)) {
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(getActivity()).setPositiveButton(com.alibaba.ability.localization.b.a(R.string.app_sure), new c());
            Activity activity = getActivity();
            q.a((Object) activity, "activity");
            positiveButton.setTitle(activity.getResources().getString(R.string.taobao_app_1005_1_22843)).setNegativeButton(com.alibaba.ability.localization.b.a(R.string.app_cancel), (DialogInterface.OnClickListener) null).show();
        } else if (q.a(view, this.u)) {
            FlowLayout flowLayout = this.m;
            if (flowLayout == null) {
                q.a();
            }
            if (!flowLayout.isExpanded()) {
                FlowLayout flowLayout2 = this.m;
                if (flowLayout2 != null) {
                    flowLayout2.setMaxLines(this.s);
                }
                FlowLayout flowLayout3 = this.m;
                if (flowLayout3 != null) {
                    flowLayout3.setExpanded(true);
                }
                FlowLayout flowLayout4 = this.m;
                if (flowLayout4 != null) {
                    flowLayout4.requestLayout();
                }
                com.taobao.search.mmd.util.e.a("History_Expand", b(str));
                return;
            }
            FlowLayout flowLayout5 = this.m;
            if (flowLayout5 != null) {
                flowLayout5.setMaxLines(2);
            }
            FlowLayout flowLayout6 = this.m;
            if (flowLayout6 != null) {
                flowLayout6.setExpanded(false);
            }
            FlowLayout flowLayout7 = this.m;
            if (flowLayout7 == null) {
                return;
            }
            flowLayout7.requestLayout();
        } else {
            if (view == null) {
                q.a();
            }
            Object tag = view.getTag();
            if (tag instanceof ActivateBean) {
                com.taobao.search.mmd.util.e.a("History_Clk", b(str));
                ViewParent parent = view.getParent();
                if (parent == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                postEvent(nqw.a.a((ActivateBean) tag, ((ViewGroup) parent).indexOfChild(view), ((CombineHistoryCellBean) this.h).suggestRn));
            } else if (!(tag instanceof AuctionItemVO)) {
            } else {
                com.taobao.search.mmd.util.e.a("History_Clk", b("tab2"));
                com.etao.feimagesearch.history.b.a(getActivity(), (AuctionItemVO) tag, "ssk", PhotoFrom.Values.SSK_HISTORY);
            }
        }
    }

    private final Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) j();
        q.a((Object) model, "model");
        SearchDoorContext a2 = model.a();
        q.a((Object) a2, "model.searchDoorContext");
        String str2 = TextUtils.equals(a2.a(noa.KEY_GOOD_PRICE), "true") ? "1" : "0";
        Pair[] pairArr = new Pair[4];
        pairArr[0] = j.a("tabname", str);
        pairArr[1] = j.a(k.KEY_SUGGEST_RN, ((CombineHistoryCellBean) this.h).suggestRn);
        pairArr[2] = j.a("digou_flag", str2);
        String a3 = a2.a("channelSrp");
        if (a3 == null) {
            a3 = "";
        }
        pairArr[3] = j.a("channelSrp", a3);
        return ai.a(pairArr);
    }

    private final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        this.n = null;
        TextView textView = this.f31663a;
        if (textView == null) {
            q.b("textHistoryBtn");
        }
        a(textView, true);
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b("imgHistoryBtn");
        }
        a(textView2, false);
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("historyContainer");
        }
        frameLayout.removeAllViews();
        if (this.x) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                q.b("historyContainer");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = com.taobao.android.searchbaseframe.util.j.a(9.0f);
            marginLayoutParams.rightMargin = com.taobao.android.searchbaseframe.util.j.a(12.0f);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                q.b("historyContainer");
            }
            frameLayout3.setLayoutParams(marginLayoutParams);
        }
        if (!c()) {
            return;
        }
        a(this.o);
    }

    private final void a(List<? extends ActivateBean> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            FlowLayout flowLayout = new FlowLayout(getActivity());
            BEAN mBean = this.h;
            q.a((Object) mBean, "mBean");
            flowLayout.setShowFoldButton(((CombineHistoryCellBean) mBean).isShowFoldButton());
            flowLayout.setMaxLines(2);
            com.taobao.search.searchdoor.sf.widgets.e model = (com.taobao.search.searchdoor.sf.widgets.e) j();
            q.a((Object) model, "model");
            SearchDoorContext a2 = model.a();
            q.a((Object) a2, "model.searchDoorContext");
            Map<String, String> c2 = a2.c();
            q.a((Object) c2, "model.searchDoorContext.snapshotParams");
            for (ActivateBean activateBean : list) {
                if (activateBean != null) {
                    i++;
                    if (i > this.s) {
                        return;
                    }
                    View a3 = nql.a(this.x, activateBean, getActivity(), H(), false, ((CombineHistoryCellBean) this.h).newStyle, c2);
                    q.a((Object) a3, "HistoryCellViewHolder.cr… snapshotParams\n        )");
                    a3.setOnClickListener(this);
                    a3.setOnLongClickListener(this);
                    flowLayout.addView(a3);
                }
            }
            flowLayout.setTailView(this.u);
            this.m = flowLayout;
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                q.b("historyContainer");
            }
            frameLayout.addView(flowLayout);
        }
    }

    private final void F() {
        int i;
        int i2;
        float f2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.p;
        if (historyResult == null) {
            return;
        }
        FlowLayout flowLayout = new FlowLayout(getActivity());
        flowLayout.setMaxLines(1);
        LayoutInflater from = LayoutInflater.from(getActivity());
        float a2 = ntx.a();
        float f3 = 2;
        float f4 = 9.0f;
        float f5 = 4;
        int min = (int) Math.min(((a2 - (com.taobao.android.searchbaseframe.util.j.b(9.0f) * f3)) - (com.taobao.android.searchbaseframe.util.j.b(5.5f) * f5)) / 5, com.taobao.android.searchbaseframe.util.j.b(65.0f));
        HistoryResult historyResult2 = this.p;
        if (historyResult2 == null) {
            q.a();
        }
        Iterator<T> it = historyResult2.resultData.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AuctionItemVO auctionItemVO = (AuctionItemVO) ((Map.Entry) it.next()).getValue();
            View itemView = from.inflate(R.layout.tbsearch_image_history_item, flowLayout, z);
            q.a((Object) itemView, "itemView");
            itemView.setTag(auctionItemVO);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(min, min);
            if (i3 % 5 != 4) {
                marginLayoutParams.rightMargin = (int) (((a2 - (com.taobao.android.searchbaseframe.util.j.b(f4) * f3)) - (min * 5)) / f5);
            }
            marginLayoutParams.bottomMargin = com.taobao.android.searchbaseframe.util.j.a(7.0f);
            flowLayout.addView(itemView, marginLayoutParams);
            View findViewById = itemView.findViewById(R.id.imv_img_history);
            q.a((Object) findViewById, "findViewById<TUrlImageView>(R.id.imv_img_history)");
            ((TUrlImageView) findViewById).setImageUrl(auctionItemVO.picPath.toString());
            View findViewById2 = itemView.findViewById(R.id.imv_img_history);
            q.a((Object) findViewById2, "findViewById<TUrlImageView>(R.id.imv_img_history)");
            ((TUrlImageView) findViewById2).setContentDescription("图片，按钮");
            View findViewById3 = itemView.findViewById(R.id.imv_img_search);
            q.a((Object) findViewById3, "findViewById<TUrlImageView>(R.id.imv_img_search)");
            ((TUrlImageView) findViewById3).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01tM1ebM1rtc6OyMMYD_!!6000000005689-2-tps-48-48.png");
            View findViewById4 = itemView.findViewById(R.id.imv_img_expand);
            q.a((Object) findViewById4, "findViewById<TUrlImageView>(R.id.imv_img_expand)");
            ((TUrlImageView) findViewById4).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01Woj2Au1bM9JRug4AP_!!6000000003450-2-tps-90-90.png");
            if (i3 != 4 || historyResult.resultData.size() <= 5) {
                i = i3;
                i2 = min;
                f2 = f5;
            } else {
                View expandButton = itemView.findViewById(R.id.fl_expand);
                q.a((Object) expandButton, "expandButton");
                expandButton.setVisibility(0);
                expandButton.setContentDescription("展开，按钮");
                i = i3;
                i2 = min;
                f2 = f5;
                expandButton.setOnClickListener(new e(expandButton, this, auctionItemVO, i, historyResult, flowLayout));
            }
            i3 = i + 1;
            min = i2;
            f5 = f2;
            z = false;
            f4 = 9.0f;
        }
        this.n = flowLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.topMargin = com.taobao.android.searchbaseframe.util.j.a(7.0f);
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("historyContainer");
        }
        frameLayout.addView(flowLayout, marginLayoutParams2);
    }

    private final void N() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        HistoryResult historyResult = this.p;
        if (historyResult == null) {
            return;
        }
        FlowLayout flowLayout = new FlowLayout(getActivity());
        flowLayout.setMaxLines(1);
        LayoutInflater from = LayoutInflater.from(getActivity());
        int min = (int) Math.min(((ntx.a() - (2 * com.taobao.android.searchbaseframe.util.j.b(16.0f))) - (4 * com.taobao.android.searchbaseframe.util.j.b(8.0f))) / 5, com.taobao.android.searchbaseframe.util.j.b(58.0f));
        HistoryResult historyResult2 = this.p;
        if (historyResult2 == null) {
            q.a();
        }
        Iterator<T> it = historyResult2.resultData.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AuctionItemVO auctionItemVO = (AuctionItemVO) ((Map.Entry) it.next()).getValue();
            View itemView = from.inflate(R.layout.tbsearch_image_history_item_new, flowLayout, z);
            q.a((Object) itemView, "itemView");
            itemView.setTag(auctionItemVO);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(min, min);
            marginLayoutParams.rightMargin = com.taobao.android.searchbaseframe.util.j.a(8.0f);
            marginLayoutParams.topMargin = com.taobao.android.searchbaseframe.util.j.a(8.0f);
            flowLayout.addView(itemView, marginLayoutParams);
            TUrlImageView imvImgHistory = (TUrlImageView) itemView.findViewById(R.id.imv_img_history);
            q.a((Object) imvImgHistory, "imvImgHistory");
            imvImgHistory.setImageUrl(auctionItemVO.picPath.toString());
            imvImgHistory.setContentDescription("图片，按钮");
            TUrlImageView imvImgSearch = (TUrlImageView) itemView.findViewById(R.id.imv_img_search);
            q.a((Object) imvImgSearch, "imvImgSearch");
            imvImgSearch.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01tM1ebM1rtc6OyMMYD_!!6000000005689-2-tps-48-48.png");
            if (i3 != 4 || historyResult.resultData.size() <= 5) {
                i = i3;
                i2 = min;
            } else {
                View expandButton = itemView.findViewById(R.id.fl_expand);
                q.a((Object) expandButton, "expandButton");
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                expandButton.setVisibility(i4);
                expandButton.setContentDescription("展开，按钮");
                i = i3;
                i2 = min;
                expandButton.setOnClickListener(new f(imvImgHistory, expandButton, itemView, auctionItemVO, i3, historyResult, flowLayout));
            }
            i3 = i + 1;
            min = i2;
            z = false;
        }
        this.n = flowLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("historyContainer");
        }
        frameLayout.addView(flowLayout, marginLayoutParams2);
    }

    private final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        SearchUrlImageView searchUrlImageView = this.v;
        if (searchUrlImageView == null) {
            q.b("imgHistoryGuide");
        }
        searchUrlImageView.setVisibility(8);
        this.m = null;
        TextView textView = this.f31663a;
        if (textView == null) {
            q.b("textHistoryBtn");
        }
        a(textView, false);
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b("imgHistoryBtn");
        }
        a(textView2, true);
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("historyContainer");
        }
        frameLayout.removeAllViews();
        if (this.x) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                q.b("historyContainer");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = com.taobao.android.searchbaseframe.util.j.a(5.0f);
            marginLayoutParams.rightMargin = com.taobao.android.searchbaseframe.util.j.a(8.0f);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                q.b("historyContainer");
            }
            frameLayout3.setLayoutParams(marginLayoutParams);
        }
        if (!d()) {
            return;
        }
        s.a().edit().putBoolean(this.t, true).apply();
        SearchUrlImageView searchUrlImageView2 = this.v;
        if (searchUrlImageView2 == null) {
            q.b("imgHistoryGuide");
        }
        searchUrlImageView2.setVisibility(8);
        if (this.x) {
            N();
        } else {
            F();
        }
    }

    private final void a(TextView textView) {
        Typeface defaultFromStyle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
            return;
        }
        Typeface create = Typeface.create("PingFangSC-Medium", 1);
        if (create != null) {
            defaultFromStyle = Typeface.create(create, 1);
        } else {
            defaultFromStyle = Typeface.defaultFromStyle(1);
        }
        textView.setTypeface(defaultFromStyle);
    }

    private final void a(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b4f78", new Object[]{this, textView, new Boolean(z)});
            return;
        }
        boolean z2 = ((CombineHistoryCellBean) this.h).newStyle;
        String str = "#111111";
        String str2 = "#888888";
        if (z) {
            textView.setTextColor(Color.parseColor(z2 ? "#333333" : str));
            textView.setContentDescription(textView.getText() + "，已选中，按钮");
        } else {
            textView.setTextColor(Color.parseColor(z2 ? "#bbbbbb" : str2));
            textView.setContentDescription(textView.getText() + "，按钮");
        }
        if (!this.x) {
            if (z) {
                a(textView);
            } else {
                textView.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            }
        } else if (z) {
            a(textView);
            if (z2) {
                str = "#11192D";
            }
            textView.setTextColor(Color.parseColor(str));
            textView.setContentDescription(textView.getText() + "，已选中，按钮");
        } else {
            textView.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            if (z2) {
                str2 = "#50607A";
            }
            textView.setTextColor(Color.parseColor(str2));
            textView.setContentDescription(textView.getText() + "，按钮");
        }
    }

    private final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        if (getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) {
            Activity activity = getActivity();
            if (activity == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IDarkModeHolder");
            }
            if (((com.taobao.android.xsearchplugin.muise.f) activity).g()) {
                return true;
            }
        }
        return false;
    }

    private final void I() {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            q.b("deleteBtn");
        }
        view.setVisibility(8);
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            q.b("deleteCombo");
        }
        linearLayout.setVisibility(0);
        FlowLayout flowLayout = this.m;
        FlowLayout flowLayout2 = this.n;
        LayoutInflater from = LayoutInflater.from(getActivity());
        boolean H = H();
        if (flowLayout == null) {
            if (flowLayout2 == null) {
                return;
            }
            flowLayout2.setMaxLines(2);
            flowLayout2.requestLayout();
            int childCount = flowLayout2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View itemView = flowLayout2.getChildAt(i);
                q.a((Object) itemView, "itemView");
                Object tag = itemView.getTag();
                if (!(tag instanceof AuctionItemVO)) {
                    tag = null;
                }
                AuctionItemVO auctionItemVO = (AuctionItemVO) tag;
                if (auctionItemVO != null) {
                    FrameLayout deleteBtn = (FrameLayout) itemView.findViewById(R.id.fl_delete_btn);
                    q.a((Object) deleteBtn, "deleteBtn");
                    deleteBtn.setVisibility(0);
                    deleteBtn.setOnClickListener(new b(auctionItemVO, flowLayout2, itemView));
                    View findViewById = itemView.findViewById(R.id.imv_delete);
                    q.a((Object) findViewById, "itemView.findViewById<TU…ageView>(R.id.imv_delete)");
                    ((TUrlImageView) findViewById).setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01D1o9Lo1t2bUSt2Kbu_!!6000000005844-2-tps-27-27.png");
                    View findViewById2 = itemView.findViewById(R.id.fl_expand);
                    q.a((Object) findViewById2, "itemView.findViewById<View>(R.id.fl_expand)");
                    findViewById2.setVisibility(8);
                }
            }
            return;
        }
        flowLayout.setMaxLines(this.s);
        if (!this.x) {
            View tailView = this.u;
            q.a((Object) tailView, "tailView");
            tailView.setVisibility(8);
            flowLayout.requestLayout();
        } else {
            flowLayout.setExpanded(true);
            flowLayout.requestLayout();
        }
        int childCount2 = flowLayout.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = flowLayout.getChildAt(i2);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup != null) {
                if (q.a(viewGroup, this.u)) {
                    return;
                }
                Object tag2 = viewGroup.getTag();
                if (!(tag2 instanceof ActivateBean)) {
                    tag2 = null;
                }
                ActivateBean activateBean = (ActivateBean) tag2;
                if (activateBean != null) {
                    if (this.x) {
                        inflate = from.inflate(H ? R.layout.tbsearch_delete_text_history_item_dark : R.layout.tbsearch_delete_text_history_item_new, viewGroup, false);
                    } else {
                        inflate = from.inflate(H ? R.layout.tbsearch_delete_text_history_item_dark : R.layout.tbsearch_delete_text_history_item, viewGroup, false);
                    }
                    TUrlImageView deleteImg = (TUrlImageView) inflate.findViewById(R.id.imv_delete);
                    q.a((Object) deleteImg, "deleteImg");
                    deleteImg.setImageUrl(H ? "https://gw.alicdn.com/imgextra/i3/O1CN018VD3Id1eABqmJ8MBG_!!6000000003830-2-tps-36-36.png" : "https://img.alicdn.com/imgextra/i2/O1CN01D1o9Lo1t2bUSt2Kbu_!!6000000005844-2-tps-27-27.png");
                    inflate.setOnClickListener(new a(activateBean, flowLayout, viewGroup));
                    viewGroup.addView(inflate, viewGroup.getMeasuredWidth(), -1);
                }
            }
        }
    }

    private final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        itemView.getLayoutParams().height = 0;
        this.itemView.requestLayout();
    }

    private final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            q.b("deleteBtn");
        }
        view.setVisibility(0);
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            q.b("deleteCombo");
        }
        linearLayout.setVisibility(8);
    }

    private final void L() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        K();
        FlowLayout flowLayout = this.m;
        FlowLayout flowLayout2 = this.n;
        if (flowLayout == null) {
            if (flowLayout2 == null) {
                return;
            }
            int childCount = flowLayout2.getChildCount();
            while (i < childCount) {
                FrameLayout deleteBtn = (FrameLayout) flowLayout2.getChildAt(i).findViewById(R.id.fl_delete_btn);
                q.a((Object) deleteBtn, "deleteBtn");
                deleteBtn.setVisibility(8);
                i++;
            }
            return;
        }
        int childCount2 = flowLayout.getChildCount();
        while (i < childCount2) {
            View childAt = flowLayout.getChildAt(i);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup != null) {
                if (q.a(viewGroup, this.u)) {
                    return;
                }
                View lastView = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                q.a((Object) lastView, "lastView");
                if (lastView.getId() == R.id.fl_delete_btn) {
                    viewGroup.removeView(lastView);
                }
            }
            i++;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, v})).booleanValue();
        }
        q.c(v, "v");
        Object tag = v.getTag();
        if (!(tag instanceof ActivateBean) && !(tag instanceof AuctionItemVO)) {
            return true;
        }
        new AlertDialog.Builder(getActivity()).setPositiveButton(com.alibaba.ability.localization.b.a(R.string.app_sure), new d(tag)).setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16653)).setNegativeButton(com.alibaba.ability.localization.b.a(R.string.app_cancel), (DialogInterface.OnClickListener) null).show();
        return true;
    }
}
