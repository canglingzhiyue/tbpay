package com.taobao.search.sf.widgets.searchbar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.p;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.k;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.iru;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes8.dex */
public class e extends ius<Void, FrameLayout, iru<c>> implements com.taobao.android.xsearchplugin.muise.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f19584a;
    private TUrlImageView b;
    private TUrlImageView c;

    static {
        kge.a(174288850);
        kge.a(1351750140);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SearchIconWidget";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public e(Activity activity, ium iumVar, iru<c> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        if (((BaseResultActivity) getActivity()).isImmersiveStatus()) {
            i = SystemBarDecorator.getStatusBarHeight(getActivity());
        }
        this.f19584a = new FrameLayout(getActivity());
        this.f19584a.setLayoutParams(new ViewGroup.LayoutParams(-1, (l.a(36) + i) - k.Companion.a()));
        this.b = new TUrlImageView(getActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l.a(24.0f), l.a(24.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = l.a(12.0f);
        this.f19584a.addView(this.b, layoutParams);
        this.b.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01DrE0sX26A0tCXcVvv_!!6000000007620-2-tps-72-72.png");
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    e.this.getActivity().finish();
                }
            }
        });
        this.c = new TUrlImageView(getActivity());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(l.a(24.0f), l.a(24.0f));
        layoutParams2.gravity = 85;
        layoutParams2.rightMargin = l.a(12.0f);
        this.c.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01mlKaOJ1Pq7pVhV4zd_!!6000000001891-2-tps-72-72.png");
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                c d = e.this.getModel().d();
                p.a("", d.getTab(), d.D(), e.this.getActivity(), "srp", false);
            }
        });
        this.f19584a.addView(this.c, layoutParams2);
        if (b()) {
            onHitDarkMode();
        }
        if (getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) {
            ((com.taobao.android.xsearchplugin.muise.f) getActivity()).a(this);
        }
        return this.f19584a;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof com.taobao.android.xsearchplugin.muise.f)) {
            return false;
        }
        return ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g();
    }

    @Override // com.taobao.android.xsearchplugin.muise.e
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        this.c.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01n2T7JF1hduLXXzJY6_!!6000000004301-2-tps-72-72.png");
        this.b.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01mutH501M3AeAWbOhg_!!6000000001378-2-tps-72-72.png");
    }
}
