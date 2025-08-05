package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import tb.kge;
import tb.ohc;

/* loaded from: classes8.dex */
public class BrowserViewPager extends EdgePanViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean firstTimeAttach;

    static {
        kge.a(366306513);
    }

    public static /* synthetic */ Object ipc$super(BrowserViewPager browserViewPager, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BrowserViewPager(Context context) {
        super(context);
        this.firstTimeAttach = true;
    }

    public BrowserViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.firstTimeAttach = true;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.firstTimeAttach && getAdapter() != null) {
            ohc.a(ViewPager.class, "mFirstLayout", this, false);
        }
        this.firstTimeAttach = false;
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
        } else {
            com.taobao.tao.flexbox.layoutmanager.component.bouncy.a.a(this, false);
        }
    }
}
