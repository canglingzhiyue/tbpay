package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class EmptyMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1567984408);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return null;
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return null;
    }

    public EmptyMaskView(Context context) {
        super(context);
    }

    public EmptyMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public RectF calcCaptureRect(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("b9d05dcb", new Object[]{this, new Integer(i), new Integer(i2)}) : new RectF(0, DisplayUtil.dip2px(getContext(), 48.0f), i, i2 - getInvisibleHeight());
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public int getTipsBottomMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b656381", new Object[]{this})).intValue() : (int) (getHeight() * 0.85f);
    }
}
