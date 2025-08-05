package com.taobao.android.dinamic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.l;
import java.util.Map;
import tb.fpn;
import tb.kge;

/* loaded from: classes5.dex */
public class DLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1663854588);
    }

    public static /* synthetic */ Object ipc$super(DLinearLayout dLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 623593120) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
    }

    public DLinearLayout(Context context) {
        super(context);
    }

    public DLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("9893bea9", new Object[]{this, attributeSet});
        }
        Map<String, Object> map = e.b("DLinearLayout").handleAttributeSet(attributeSet).b;
        int[] a2 = fpn.a(getContext(), map);
        if (map.containsKey("dWeight")) {
            try {
                float parseFloat = Float.parseFloat((String) map.get("dWeight"));
                if (parseFloat <= 0.0f) {
                    parseFloat = 0.0f;
                }
                if (getOrientation() == 0) {
                    layoutParams = new LinearLayout.LayoutParams(0, a2[1], parseFloat);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(a2[0], 0, parseFloat);
                }
            } catch (NumberFormatException unused) {
                layoutParams = new LinearLayout.LayoutParams(a2[0], a2[1]);
            }
        } else {
            layoutParams = new LinearLayout.LayoutParams(a2[0], a2[1]);
        }
        layoutParams.setMargins(a2[2], a2[3], a2[4], a2[5]);
        layoutParams.gravity = fpn.a(map);
        return layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        l.a(this, canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        l.a(this, canvas);
        super.draw(canvas);
    }
}
