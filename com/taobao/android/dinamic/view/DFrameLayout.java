package com.taobao.android.dinamic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.l;
import java.util.Map;
import tb.fpn;
import tb.kge;

/* loaded from: classes5.dex */
public class DFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(773884938);
    }

    private int calculateSize(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6182c394", new Object[]{this, str, str2, new Integer(i)})).intValue() : i;
    }

    public static /* synthetic */ Object ipc$super(DFrameLayout dFrameLayout, String str, Object... objArr) {
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

    public DFrameLayout(Context context) {
        super(context);
    }

    public DFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet});
        }
        Map<String, Object> map = e.b("DFrameLayout").handleAttributeSet(attributeSet).b;
        int a2 = fpn.a(map);
        String str = (String) map.get("dWidth");
        String str2 = (String) map.get("dHeight");
        int[] a3 = fpn.a(getContext(), map);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a3[0], a3[1]);
        layoutParams.gravity = a2;
        layoutParams.setMargins(a3[2], a3[3], a3[4], a3[5]);
        if (a2 == -1) {
            a2 = 51;
        }
        if ((a2 & 3) != 0 && a3[0] > 0) {
            String str3 = (String) map.get("dMarginLeft");
            if (!TextUtils.isEmpty(str3) && !str.toLowerCase().contains("np") && !str3.toLowerCase().contains("np")) {
                layoutParams.width = calculateSize(str, str3, a3[0]);
            }
        }
        if ((a2 & 5) != 0 && a3[0] > 0) {
            String str4 = (String) map.get("dMarginRight");
            if (!TextUtils.isEmpty(str4) && !str.toLowerCase().contains("np") && !str4.toLowerCase().contains("np")) {
                layoutParams.width = calculateSize(str, str4, a3[0]);
            }
        }
        if ((a2 & 48) != 0 && a3[1] > 0) {
            String str5 = (String) map.get("dMarginTop");
            if (!TextUtils.isEmpty(str5) && !str2.toLowerCase().contains("np") && !str5.toLowerCase().contains("np")) {
                layoutParams.height = calculateSize(str2, str5, a3[1]);
            }
        }
        if ((a2 & 80) != 0 && a3[1] > 0) {
            String str6 = (String) map.get("dMarginBottom");
            if (!TextUtils.isEmpty(str6) && !str2.toLowerCase().contains("np") && !str6.toLowerCase().contains("np")) {
                layoutParams.height = calculateSize(str2, str6, a3[1]);
            }
        }
        return layoutParams;
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
}
