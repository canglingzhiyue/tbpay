package com.taobao.search.sf.widgets.searchbar;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.k;
import com.taobao.tao.util.SystemBarDecorator;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends ius<Void, FrameLayout, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f19583a;

    static {
        kge.a(-750069906);
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "DragHandlerWidget";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public b(Activity activity, ium iumVar, Void r3, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, r3, viewGroup, iurVar);
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        if (((BaseResultActivity) getActivity()).isImmersiveStatus() && Build.VERSION.SDK_INT >= 19) {
            i = SystemBarDecorator.getStatusBarHeight(getActivity());
        }
        this.f19583a = new FrameLayout(getActivity());
        this.f19583a.setLayoutParams(new ViewGroup.LayoutParams(-1, (l.a(24) + i) - k.Companion.a()));
        View view = new View(getActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l.a(36.0f), l.a(4.0f));
        layoutParams.bottomMargin = l.a(6.0f);
        layoutParams.gravity = 81;
        view.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(l.a(l.a(3.5f)));
        gradientDrawable.setColor(Color.parseColor("#D8D8D8"));
        ViewCompat.setBackground(view, gradientDrawable);
        this.f19583a.addView(view);
        this.f19583a.setBackgroundColor(-1);
        return this.f19583a;
    }
}
