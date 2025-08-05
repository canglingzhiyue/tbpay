package com.taobao.tab2interact.core.component.browser.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class BrowserBadgeRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnVisibilityChangedListener;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(1323215884);
    }

    public static /* synthetic */ Object ipc$super(BrowserBadgeRootView browserBadgeRootView, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BrowserBadgeRootView(Context context) {
        this(context, null);
    }

    public BrowserBadgeRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowserBadgeRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        a aVar = this.mOnVisibilityChangedListener;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    public void setOnVisibilityChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616ff502", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mOnVisibilityChangedListener = aVar;
        }
    }
}
