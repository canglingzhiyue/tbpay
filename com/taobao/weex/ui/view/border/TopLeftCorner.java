package com.taobao.weex.ui.view.border;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TopLeftCorner extends BorderCorner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1612013416);
    }

    public void set(float f, float f2, float f3, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a5a548", new Object[]{this, new Float(f), new Float(f2), new Float(f3), rectF});
        } else {
            set(f, f2, f3, rectF, 225.0f);
        }
    }

    @Override // com.taobao.weex.ui.view.border.BorderCorner
    public void prepareOval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab1c200", new Object[]{this});
        } else if (hasInnerCorner()) {
            setOvalLeft(getPreBorderWidth() / 2.0f);
            setOvalTop(getPostBorderWidth() / 2.0f);
            setOvalRight((getOuterCornerRadius() * 2.0f) - (getPreBorderWidth() / 2.0f));
            setOvalBottom((getOuterCornerRadius() * 2.0f) - (getPostBorderWidth() / 2.0f));
        } else {
            setOvalLeft(getOuterCornerRadius() / 2.0f);
            setOvalTop(getOuterCornerRadius() / 2.0f);
            setOvalRight(getOuterCornerRadius() * 1.5f);
            setOvalBottom(getOuterCornerRadius() * 1.5f);
        }
    }

    @Override // com.taobao.weex.ui.view.border.BorderCorner
    public void prepareRoundCorner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53485483", new Object[]{this});
        } else if (hasOuterCorner()) {
            setRoundCornerStartX(getPreBorderWidth() / 2.0f);
            setRoundCornerStartY(getOuterCornerRadius());
            setRoundCornerEndX(getOuterCornerRadius());
            setRoundCornerEndY(getPostBorderWidth() / 2.0f);
        } else {
            float preBorderWidth = getPreBorderWidth() / 2.0f;
            float postBorderWidth = getPostBorderWidth() / 2.0f;
            setRoundCornerStartX(preBorderWidth);
            setRoundCornerStartY(postBorderWidth);
            setRoundCornerEndX(preBorderWidth);
            setRoundCornerEndY(postBorderWidth);
        }
    }
}
