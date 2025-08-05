package com.taobao.tao.backflow.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.nyq;

/* loaded from: classes8.dex */
public class TpwdLoadingView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int round;

    static {
        kge.a(-1176534965);
    }

    public static /* synthetic */ Object ipc$super(TpwdLoadingView tpwdLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TpwdLoadingView(Context context) {
        super(context);
        this.round = 0;
        init(context);
    }

    public TpwdLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.round = 0;
        init(context);
    }

    public TpwdLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.round = 0;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        addView(LayoutInflater.from(context).inflate(R.layout.clip_taopassword_ui_loading, (ViewGroup) null));
        addView(new LoadingView(context));
        this.round = nyq.a(context, 6.0f);
    }

    public void setInnerViewsVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbfd1c41", new Object[]{this, new Boolean(z)});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setVisibility(z ? 0 : 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            Path path = new Path();
            path.addRoundRect(rectF, this.round, this.round, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes8.dex */
    public class LoadingView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mAnimating;
        private Matrix mGradientMatrix;
        private LinearGradient mLinearGradient;
        private Paint mPaint;
        private int mTranslate;
        private int mViewWidth;

        static {
            kge.a(-1315577080);
        }

        public static /* synthetic */ Object ipc$super(LoadingView loadingView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 1389530587) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
        }

        public LoadingView(Context context) {
            super(context);
            this.mViewWidth = 0;
            this.mTranslate = 0;
            this.mAnimating = true;
            this.mPaint = new Paint();
            this.mPaint.setColor(-1);
            this.mPaint.setDither(true);
            this.mPaint.setAntiAlias(true);
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            if (this.mViewWidth != 0) {
                return;
            }
            this.mViewWidth = getMeasuredWidth();
            int i5 = this.mViewWidth;
            if (i5 <= 0) {
                return;
            }
            this.mLinearGradient = new LinearGradient(-i5, 0.0f, 0.0f, 0.0f, new int[]{872415231, -1, 872415231}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            this.mGradientMatrix = new Matrix();
            this.mPaint.setShader(this.mLinearGradient);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.mPaint);
            if (!this.mAnimating || this.mGradientMatrix == null) {
                return;
            }
            int i = this.mTranslate;
            int i2 = this.mViewWidth;
            this.mTranslate = i + (i2 / 10);
            if (this.mTranslate > i2 * 2) {
                this.mTranslate = -i2;
            }
            this.mGradientMatrix.setTranslate(this.mTranslate, 0.0f);
            this.mLinearGradient.setLocalMatrix(this.mGradientMatrix);
            postInvalidateDelayed(30L);
        }
    }
}
