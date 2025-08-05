package com.taobao.search.sf.widgets.searchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.p;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.k;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.iru;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class a extends ius<Void, FrameLayout, iru<c>> implements View.OnClickListener, com.taobao.android.xsearchplugin.muise.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f19580a;
    private LinearLayout b;
    private TUrlImageView c;
    private ImageView d;
    private TUrlImageView e;
    private TextView f;
    private LinearLayout g;
    private View h;

    static {
        kge.a(1133361035);
        kge.a(1351750140);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -506257491) {
            super.findAllViews();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SearchCloseWidget";
    }

    @Override // com.taobao.android.xsearchplugin.muise.e
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        }
    }

    public static /* synthetic */ TUrlImageView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("fd80c31a", new Object[]{aVar}) : aVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public a(Activity activity, ium iumVar, iru<c> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        this.f19580a = (FrameLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_popup_srp_searchbar_with_close, (ViewGroup) new FrameLayout(getActivity()), false);
        return this.f19580a;
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        this.b = (LinearLayout) this.f19580a.findViewById(R.id.ll_close_bar_container);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = SystemBarDecorator.getStatusBarHeight(getActivity()) - k.Companion.a();
        this.c = (TUrlImageView) this.f19580a.findViewById(R.id.imv_close_popup);
        this.d = (ImageView) this.f19580a.findViewById(R.id.btn_go_back);
        this.e = (TUrlImageView) this.f19580a.findViewById(R.id.imv_expand);
        this.f = (TextView) this.f19580a.findViewById(R.id.searchEdit);
        this.g = (LinearLayout) this.f19580a.findViewById(R.id.searchbar_inner);
        this.c.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN014MKXkw1bH6wJIYVF2_!!6000000003439-2-tps-72-72.png");
        this.c.setOnClickListener(this);
        this.e.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01063fWf1fYkeusYyzX_!!6000000004019-2-tps-72-72.png");
        this.e.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.f.setText(getModel().d().getKeyword());
        if (com.taobao.android.searchbaseframe.util.g.a(getModel().f().getParam(noa.KEY_POP_UP_HEIGHT), 0.0f) < 1.0f) {
            return;
        }
        this.e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.e) {
            ((BaseResultActivity) getActivity()).a(new AnimatorListenerAdapter() { // from class: com.taobao.search.sf.widgets.searchbar.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        a.a(a.this).setVisibility(8);
                    }
                }
            });
        } else if (view == this.c) {
            k.h();
        } else if (view == this.d) {
            getActivity().finish();
        } else if (view == this.g) {
            ((BaseResultActivity) getActivity()).a(new AnimatorListenerAdapter() { // from class: com.taobao.search.sf.widgets.searchbar.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    a.a(a.this).setVisibility(8);
                    c d = a.this.getModel().d();
                    p.a(d.getKeyword(), d.getTab(), d.D(), a.this.getActivity(), "srp", false);
                }
            });
        } else if (view != this.h) {
        } else {
            String str = "ssk";
            String paramValueIncludingGlobal = getModel().d().getParamValueIncludingGlobal("channelSrp");
            if (!TextUtils.isEmpty(paramValueIncludingGlobal)) {
                str = str + "-" + paramValueIncludingGlobal;
            }
            Nav.from(getActivity()).toUri("http://h5.m.taobao.com/tusou/index.html?pssource=" + str);
            com.taobao.search.mmd.util.e.a("PhotoSearch_Enter", "a2141.7631709.1999021211.4922322");
        }
    }
}
