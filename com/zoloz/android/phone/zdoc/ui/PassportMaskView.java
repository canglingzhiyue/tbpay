package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class PassportMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1663687511);
    }

    public static /* synthetic */ Object ipc$super(PassportMaskView passportMaskView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PassportMaskView(Context context) {
        super(context);
    }

    public PassportMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PassportMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)}) : toList(new BaseMaskView.b(createCoverPath()));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)}) : toList(new BaseMaskView.c(createFramePath()));
    }

    private Path createCoverPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("13d9df4f", new Object[]{this});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 30.0f, 30.0f, Path.Direction.CCW);
        return path;
    }

    private Path createFramePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("dec0d285", new Object[]{this});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, 30.0f, 30.0f, Path.Direction.CCW);
        float height = this.mCaptureRect.top + (this.mCaptureRect.height() / 2.0f);
        path.moveTo(this.mCaptureRect.left, height);
        path.lineTo(this.mCaptureRect.right, height);
        float height2 = this.mCaptureRect.top + ((this.mCaptureRect.height() * 388.0f) / 448.0f);
        path.moveTo(this.mCaptureRect.left, height2);
        path.lineTo(this.mCaptureRect.right, height2);
        return path;
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public RectF calcCaptureRect(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b9d05dcb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        double d = i;
        int i4 = (int) (0.1d * d);
        int i5 = (int) (0.9d * d);
        double d2 = i2;
        int i6 = (int) (0.15d * d2);
        int i7 = (int) (i6 + (((d * 0.8d) * 448.0d) / 315.0d));
        if (getInvisibleHeight() + i7 > getHeight()) {
            i7 = (int) ((getHeight() - getInvisibleHeight()) - (d2 * 0.05d));
            int width = (int) ((getWidth() - i3) / 2.0f);
            i5 = ((int) (((i7 - i6) * 315) / 448.0f)) + width;
            i4 = width;
        }
        return new RectF(i4, i6, i5, i7);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public int getTipsBottomMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b656381", new Object[]{this})).intValue() : (int) (getHeight() * 0.85d);
    }
}
