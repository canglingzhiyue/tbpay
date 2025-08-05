package com.taobao.tao.topmultitab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.topmultitab.c;
import tb.kge;

/* loaded from: classes8.dex */
public class WrapFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WrapFrameLayout";
    public View targetView;
    public String type;

    static {
        kge.a(-2067967615);
    }

    public WrapFrameLayout(Context context) {
        super(context);
    }

    public WrapFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WrapFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public void addTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bcd400", new Object[]{this});
        } else if (this.targetView != null) {
        } else {
            e.e(TAG, "开始创建视图");
            this.targetView = c.a().b(this.type).createView(getContext());
            View view = this.targetView;
            if (view != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.targetView.getParent()).removeView(this.targetView);
            }
            addView(this.targetView, -1, -1);
        }
    }
}
