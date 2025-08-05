package com.taobao.search.musie.tab;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String f;
    private TextView g;

    static {
        kge.a(-1596078286);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public e(String str) {
        this.f = str;
    }

    @Override // com.taobao.search.musie.tab.b
    public View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = new TextView(context);
        this.g.setText(this.f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(this.g, layoutParams);
        return frameLayout;
    }

    @Override // com.taobao.search.musie.tab.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            d(false);
        }
    }

    @Override // com.taobao.search.musie.tab.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d(true);
        }
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.e.booleanValue() ? this.d : this.c;
        this.g.setTextColor(dVar.b());
        float c = (dVar.c() * 1.0f) / this.c.c();
        this.g.getPaint().setFakeBoldText(dVar.a());
        if (z) {
            this.g.setTextSize(0, this.c.c());
            a(c, c, false);
            return;
        }
        a(c, c, true);
    }

    @Override // com.taobao.search.musie.tab.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            d(true);
        }
    }
}
