package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.XTabLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.mfj;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21981a = true;
    private XTabLayout b;
    private Context c;
    private TIconFontTextView d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    public d(View view, XTabLayout xTabLayout) {
        this.c = view.getContext();
        this.b = xTabLayout;
        this.e = this.c.getResources().getColor(R.color.taolive_morelive_tab_indicator_color_b);
        this.f = this.c.getResources().getColor(R.color.taolive_morelive_tab_selected_text_color_b);
        this.g = this.c.getResources().getColor(R.color.taolive_morelive_tab_text_color_b);
        this.h = this.c.getResources().getColor(R.color.taolive_morelive_tab_indicator_color);
        this.i = this.c.getResources().getColor(R.color.taolive_morelive_tab_selected_text_color);
        this.j = this.c.getResources().getColor(R.color.taolive_morelive_tab_text_color);
        this.k = this.c.getResources().getColor(R.color.taolive_morelive_back_color_b);
        this.l = this.c.getResources().getColor(R.color.taolive_morelive_back_color);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f21981a = z;
        b(z);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            c(z);
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                a();
            } else {
                b();
            }
        } catch (Throwable th) {
            mfj.a("SelectedTopColorCtrl", "switch color exp.", th);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        XTabLayout xTabLayout = this.b;
        if (xTabLayout != null) {
            xTabLayout.setSelectedTabIndicatorColor(this.e);
            this.b.setTabTextColors(this.g, this.f);
        }
        TIconFontTextView tIconFontTextView = this.d;
        if (tIconFontTextView == null) {
            return;
        }
        tIconFontTextView.setTextColor(this.k);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        XTabLayout xTabLayout = this.b;
        if (xTabLayout != null) {
            xTabLayout.setSelectedTabIndicatorColor(this.h);
            this.b.setTabTextColors(this.j, this.i);
        }
        TIconFontTextView tIconFontTextView = this.d;
        if (tIconFontTextView == null) {
            return;
        }
        tIconFontTextView.setTextColor(this.l);
    }
}
