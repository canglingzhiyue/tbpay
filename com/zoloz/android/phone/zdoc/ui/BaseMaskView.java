package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class BaseMaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBackgroundColor;
    public float mBottomMargin;
    public RectF mCaptureRect;
    public Paint mCoverPaint;
    public Paint mFramePaint;
    private float mInvisibleHeight;
    public boolean mIsDrawn;
    public int mLineColor;

    static {
        kge.a(-1394556056);
    }

    public static /* synthetic */ Object ipc$super(BaseMaskView baseMaskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 1621401666) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.invalidate();
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    private boolean isCanRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be11dfc0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract RectF calcCaptureRect(int i, int i2);

    public abstract List<a> getCoverDrawer(int i, int i2);

    public abstract List<a> getFrameDrawer(int i, int i2);

    public int getStokeWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df7cdd0e", new Object[]{this})).intValue();
        }
        return 2;
    }

    public void initCustomAttributes(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ea9f25", new Object[]{this, context, attributeSet});
        }
    }

    public RectF getCaptureRect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("e556d76c", new Object[]{this}) : this.mCaptureRect;
    }

    public BaseMaskView(Context context) {
        super(context);
        this.mInvisibleHeight = 0.2f;
        this.mBottomMargin = 0.8f;
        this.mIsDrawn = false;
        init(context, null);
    }

    public BaseMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInvisibleHeight = 0.2f;
        this.mBottomMargin = 0.8f;
        this.mIsDrawn = false;
        init(context, attributeSet);
    }

    public BaseMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInvisibleHeight = 0.2f;
        this.mBottomMargin = 0.8f;
        this.mIsDrawn = false;
        init(context, attributeSet);
    }

    public void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DefaultMaskView);
        this.mBackgroundColor = obtainStyledAttributes.getColor(R.styleable.DefaultMaskView_z_mask_background, getColor(R.color.z_black_60));
        this.mLineColor = obtainStyledAttributes.getColor(R.styleable.DefaultMaskView_z_line_color, getColor(R.color.z_white));
        this.mInvisibleHeight = obtainStyledAttributes.getFloat(R.styleable.DefaultMaskView_z_mask_invisible_height, this.mInvisibleHeight);
        this.mBottomMargin = obtainStyledAttributes.getFloat(R.styleable.DefaultMaskView_z_mask_bottom_margin, this.mBottomMargin);
        initCustomAttributes(context, attributeSet);
        obtainStyledAttributes.recycle();
        this.mCoverPaint = new Paint();
        this.mCoverPaint.setStyle(Paint.Style.FILL);
        this.mCoverPaint.setColor(this.mBackgroundColor);
        this.mCoverPaint.setAntiAlias(true);
        this.mFramePaint = new Paint();
        this.mFramePaint.setStyle(Paint.Style.STROKE);
        this.mFramePaint.setColor(this.mLineColor);
        this.mFramePaint.setAntiAlias(true);
        this.mFramePaint.setStrokeWidth((int) (getStokeWidth() * getContext().getResources().getDisplayMetrics().density));
    }

    public void setLineColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a147d5ef", new Object[]{this, new Integer(i)});
            return;
        }
        this.mLineColor = i;
        this.mFramePaint.setColor(i);
    }

    public void setMaskColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e1d6e7", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBackgroundColor = i;
        this.mCoverPaint.setColor(i);
    }

    public void updateMaskAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f58ab0", new Object[]{this, new Float(f)});
            return;
        }
        BioLog.i("BaseMaskView", " anim " + f);
        this.mCoverPaint.setAlpha((int) (f * 255.0f));
    }

    private int getColor(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("384a2dc2", new Object[]{this, new Integer(i)})).intValue() : getResources().getColor(i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mIsDrawn && !isCanRefresh()) {
            return;
        }
        this.mCaptureRect = calcCaptureRect(canvas.getWidth(), canvas.getHeight());
        List<a> coverDrawer = getCoverDrawer(canvas.getWidth(), canvas.getHeight());
        if (coverDrawer != null) {
            for (a aVar : coverDrawer) {
                aVar.a(canvas, this.mCoverPaint);
            }
        }
        List<a> frameDrawer = getFrameDrawer(canvas.getWidth(), canvas.getHeight());
        if (frameDrawer == null) {
            return;
        }
        for (a aVar2 : frameDrawer) {
            aVar2.a(canvas, this.mFramePaint);
        }
    }

    public Rect getDocFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e09f335b", new Object[]{this});
        }
        RectF rectF = this.mCaptureRect;
        if (rectF != null) {
            return new Rect((int) rectF.left, (int) this.mCaptureRect.top, (int) this.mCaptureRect.right, (int) this.mCaptureRect.bottom);
        }
        return new Rect(0, 0, getWidth(), getHeight());
    }

    public int getInvisibleHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f953ae78", new Object[]{this})).intValue() : (int) (getHeight() * this.mInvisibleHeight);
    }

    public int getTipsBottomMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b656381", new Object[]{this})).intValue() : (int) (getHeight() * this.mBottomMargin);
    }

    public List<a> toList(a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2ea09928", new Object[]{this, aVarArr});
        }
        if (aVarArr == null) {
            return null;
        }
        return Arrays.asList(aVarArr);
    }

    @Override // android.view.View
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        this.mIsDrawn = false;
        super.invalidate();
    }

    public int getCenterPositionY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c31b3f", new Object[]{this})).intValue();
        }
        RectF rectF = this.mCaptureRect;
        if (rectF != null) {
            return (int) (rectF.top + (this.mCaptureRect.height() / 2.0f));
        }
        return 0;
    }

    /* loaded from: classes9.dex */
    public abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Path f24758a;

        static {
            kge.a(1477062835);
        }

        public abstract void a(Canvas canvas, Paint paint);

        public a(Path path) {
            this.f24758a = path;
        }
    }

    /* loaded from: classes9.dex */
    public class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1917788344);
        }

        public b(Path path) {
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
            canvas.clipPath(this.f24758a, Region.Op.DIFFERENCE);
            canvas.drawColor(paint.getColor());
            canvas.restore();
        }
    }

    /* loaded from: classes9.dex */
    public class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1118522094);
        }

        public c(Path path) {
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
            canvas.drawPath(this.f24758a, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCaptureRect == null) {
            return super.onTouchEvent(motionEvent);
        }
        return !this.mCaptureRect.contains(motionEvent.getX(), motionEvent.getY());
    }
}
