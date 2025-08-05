package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class MRZMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float[] BOTTOM_RADII;
    public static final float ROUND_CORNER = 30.0f;

    public static /* synthetic */ Object ipc$super(MRZMaskView mRZMaskView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1620609088);
        BOTTOM_RADII = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 30.0f, 30.0f, 30.0f};
    }

    public MRZMaskView(Context context) {
        super(context);
    }

    public MRZMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MRZMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)}) : toList(new BaseMaskView.b(createPath()), new a(createWriteCoverPath()));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)}) : toList(new BaseMaskView.c(createFramePath()));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public RectF calcCaptureRect(int i, int i2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b9d05dcb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        float f3 = i * 0.95f;
        return new RectF((int) (0.05f * f), (int) (i2 * 0.2f), (int) f3, (int) (((f3 * 500.0f) / 712.0f) + f2));
    }

    private Path createWriteCoverPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("f0523ea8", new Object[]{this});
        }
        RectF rectF = new RectF(this.mCaptureRect);
        rectF.top = this.mCaptureRect.top + (this.mCaptureRect.height() * 0.75f);
        Path path = new Path();
        path.addRoundRect(rectF, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    private Path createFramePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("dec0d285", new Object[]{this});
        }
        Path path = new Path();
        float height = this.mCaptureRect.top + (this.mCaptureRect.height() * 0.75f);
        path.moveTo(this.mCaptureRect.left, height);
        path.lineTo(this.mCaptureRect.right, height);
        path.addRoundRect(this.mCaptureRect, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    private Path createPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("ff378070", new Object[]{this});
        }
        Path path = new Path();
        path.addRoundRect(this.mCaptureRect, BOTTOM_RADII, Path.Direction.CCW);
        return path;
    }

    /* loaded from: classes9.dex */
    public class a extends BaseMaskView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1392886127);
        }

        public a(Path path) {
            super(path);
        }

        @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView.a
        public void a(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80533312", new Object[]{this, canvas, paint});
                return;
            }
            canvas.save();
            canvas.clipPath(this.f24758a, Region.Op.INTERSECT);
            canvas.drawColor(ContextCompat.getColor(MRZMaskView.this.getContext(), R.color.z_white_50));
            canvas.restore();
        }
    }
}
