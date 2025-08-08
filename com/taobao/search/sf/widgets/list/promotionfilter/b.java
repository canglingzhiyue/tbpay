package com.taobao.search.sf.widgets.list.promotionfilter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.util.m;
import com.taobao.search.common.util.p;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.datasource.c;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.noa;
import tb.nti;
import tb.ntx;

/* loaded from: classes8.dex */
public class b extends ius<SFPromotionFilterBean, LinearLayout, com.taobao.search.sf.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f19545a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private PromotionFilterBean f;
    private LayoutInflater g;
    private final boolean h;

    static {
        kge.a(-497614833);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFPromotionFilterWidget";
    }

    public static /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed57beef", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.a(i);
        }
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((SFPromotionFilterBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public b(Activity activity, ium iumVar, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, aVar, viewGroup, iurVar);
        this.f19545a = 10;
        this.b = 13;
        this.c = 12;
        this.d = 22;
        this.e = 1;
        this.h = getModel().f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        this.g = LayoutInflater.from(activity);
    }

    public LinearLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("660331bf", new Object[]{this});
        }
        Activity activity = getActivity();
        LinearLayout linearLayout = new LinearLayout(activity);
        if (!getModel().d().z()) {
            linearLayout.setBackgroundResource(R.color.tbsearch_main_card_bg);
        }
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, 0, DensityUtil.dip2px(activity, 10.0f), 0);
        return linearLayout;
    }

    public void a(SFPromotionFilterBean sFPromotionFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5499753e", new Object[]{this, sFPromotionFilterBean});
            return;
        }
        nti.a(l.getInstance().getCurrentPageName(), b.class.getSimpleName());
        if (sFPromotionFilterBean == null || sFPromotionFilterBean.oldPromotionFilterBean == null) {
            return;
        }
        a(sFPromotionFilterBean.oldPromotionFilterBean);
    }

    private void a(PromotionFilterBean promotionFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91aa22", new Object[]{this, promotionFilterBean});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) getView();
        if (linearLayout == null) {
            logError("root view not created");
        } else if (promotionFilterBean == null) {
            linearLayout.setVisibility(8);
        } else {
            this.f = promotionFilterBean;
            a(promotionFilterBean, linearLayout);
        }
    }

    public void a(PromotionFilterBean promotionFilterBean, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc63ea05", new Object[]{this, promotionFilterBean, linearLayout});
        } else if (!PromotionFilterBean.SINGLE.equals(promotionFilterBean.type)) {
            logError("not single mode");
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            for (int i = 0; i < promotionFilterBean.buttons.size() && i < 3; i++) {
                View childAt = linearLayout.getChildAt(i);
                View a2 = a(promotionFilterBean.buttons.get(i), linearLayout, childAt, i);
                if (childAt == null) {
                    linearLayout.addView(a2);
                }
            }
            for (int size = promotionFilterBean.buttons.size(); size < linearLayout.getChildCount(); size++) {
                linearLayout.removeViewAt(size);
            }
        }
    }

    private View a(PromotionFilterBean.a aVar, ViewGroup viewGroup, View view, int i) {
        int i2;
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8cedbe77", new Object[]{this, aVar, viewGroup, view, new Integer(i)});
        }
        Activity activity = getActivity();
        if (view == null) {
            view = this.g.inflate(R.layout.mmd_tbsearch_promotion_filter_button, viewGroup, false);
        }
        View findViewById = view.findViewById(R.id.button);
        TextView textView = (TextView) view.findViewById(R.id.preText);
        TextView textView2 = (TextView) view.findViewById(R.id.replaceText);
        TextView textView3 = (TextView) view.findViewById(R.id.postText);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.img);
        a(findViewById, i);
        if (this.h) {
            m mVar = m.INSTANCE;
            i2 = m.a(m.a.INSTANCE.d(), true);
        } else {
            i2 = j.c((float) ntx.a()) <= 360 ? 12 : 13;
        }
        float f = i2;
        textView.setTextSize(1, f);
        textView2.setTextSize(1, f);
        textView3.setTextSize(1, f);
        int dip2px = DensityUtil.dip2px(activity, 13.0f);
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(0);
        int i3 = 8;
        tUrlImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        Drawable background = findViewById.getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setCornerRadius(DensityUtil.dip2px(activity, 22.0f));
        PromotionFilterBean.b bVar = aVar.f19158a ? aVar.f : aVar.e;
        gradientDrawable.setStroke(DensityUtil.dip2px(activity, 1.0f), bVar.e);
        gradientDrawable.mutate();
        gradientDrawable.setGradientType(0);
        if (bVar.h != 0 && bVar.i != 0) {
            a(gradientDrawable, bVar.h, bVar.i);
        } else {
            a(gradientDrawable, bVar.d, bVar.d);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            findViewById.setBackground(gradientDrawable);
        } else {
            findViewById.setBackgroundDrawable(gradientDrawable);
        }
        textView.setTextColor(bVar.f);
        textView3.setTextColor(bVar.f);
        textView2.setTextColor(bVar.g);
        if (StringUtils.isEmpty(bVar.f19159a)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            a(dip2px, tUrlImageView, bVar, (View) null);
            return view;
        }
        boolean z = !StringUtils.isEmpty(bVar.b);
        int indexOf = z ? bVar.f19159a.indexOf(bVar.b) : -1;
        if (indexOf == -1) {
            z = false;
        }
        if (z) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
        textView3.setVisibility(i3);
        if (z) {
            String substring = bVar.f19159a.substring(0, indexOf);
            String substring2 = bVar.f19159a.substring(indexOf + bVar.b.length(), bVar.f19159a.length());
            textView.setText(substring);
            textView3.setText(substring2);
            textView2.setText(bVar.b);
            a(dip2px, tUrlImageView, bVar, textView2);
        } else {
            textView.setText(bVar.f19159a);
        }
        if (!StringUtils.isEmpty(bVar.f19159a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f19159a);
            sb.append(aVar.f19158a ? "，已选中" : com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16660));
            findViewById.setContentDescription(sb.toString());
        }
        b(aVar);
        a(aVar);
        return view;
    }

    private void a(PromotionFilterBean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca4a1c5", new Object[]{this, aVar});
        } else if (!r.bE() || !aVar.f19158a || StringUtils.isEmpty(aVar.b) || StringUtils.isEmpty(aVar.c)) {
        } else {
            getModel().d().setParam(aVar.b, aVar.c);
        }
    }

    private void b(PromotionFilterBean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d429e4", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            String currentPageName = l.getInstance().getCurrentPageName();
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, currentPageName + "-SrpPromotionFilter-" + aVar.c, "", "", null).build());
        }
    }

    private void c(PromotionFilterBean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4103b203", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("SrpPromotionFilter");
            sb.append(aVar.f19158a ? "Select" : "Unselect");
            sb.append("-");
            sb.append(aVar.c);
            e.a(sb.toString());
        }
    }

    private void a(GradientDrawable gradientDrawable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2820cd9c", new Object[]{this, gradientDrawable, new Integer(i), new Integer(i2)});
        } else if (Build.VERSION.SDK_INT >= 16) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setColors(new int[]{i, i2});
        } else {
            gradientDrawable.setColor(i);
        }
    }

    private void a(View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.list.promotionfilter.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        b.a(b.this, i);
                    }
                }
            });
        }
    }

    private void a(int i) {
        PromotionFilterBean.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        PromotionFilterBean promotionFilterBean = this.f;
        if (promotionFilterBean == null || i >= promotionFilterBean.buttons.size() || i < 0 || (aVar = this.f.buttons.get(i)) == null) {
            return;
        }
        c d = getModel().d();
        boolean z = aVar.f19158a;
        for (int i2 = 0; i2 < this.f.buttons.size(); i2++) {
            PromotionFilterBean.a aVar2 = this.f.buttons.get(i2);
            if (aVar2 != null) {
                aVar2.f19158a = false;
                d.c(aVar2.b, aVar2.c);
            }
        }
        if (z) {
            d.c(aVar.b, aVar.c);
        } else {
            d.setParam(aVar.b, aVar.c);
        }
        aVar.f19158a = !z;
        c(aVar);
        if (StringUtils.equals(aVar.g, "research")) {
            HashMap hashMap = new HashMap();
            hashMap.put(aVar.b, aVar.c);
            hashMap.put("q", d.getKeyword());
            p.a(hashMap, this.mActivity, d);
            return;
        }
        d.doNewSearch();
    }

    private void a(int i, final TUrlImageView tUrlImageView, PromotionFilterBean.b bVar, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0e8c7", new Object[]{this, new Integer(i), tUrlImageView, bVar, view});
        } else if (StringUtils.isEmpty(bVar.c) || bVar.k == 0 || bVar.j == 0) {
        } else {
            ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = (int) ((i * bVar.j) / bVar.k);
            tUrlImageView.setVisibility(0);
            tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.search.sf.widgets.list.promotionfilter.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    View view2 = view;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    tUrlImageView.setTag(true);
                    return true;
                }
            });
            tUrlImageView.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.search.sf.widgets.list.promotionfilter.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    tUrlImageView.setVisibility(8);
                    tUrlImageView.setTag(false);
                    return true;
                }
            });
            String imageUrl = tUrlImageView.getImageUrl();
            if (!StringUtils.isEmpty(imageUrl) && StringUtils.equals(imageUrl, bVar.c) && tUrlImageView.getTag() != null && ((Boolean) tUrlImageView.getTag()).booleanValue() && view != null) {
                view.setVisibility(8);
            }
            tUrlImageView.setImageUrl(bVar.c);
            if (view == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = layoutParams.height;
            layoutParams2.width = layoutParams.width;
        }
    }
}
