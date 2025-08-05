package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
final class SwipeProgressBar {
    private static final int ANIMATION_DURATION_MS = 2000;
    private static final int COLOR1 = -1291845632;
    private static final int COLOR2 = Integer.MIN_VALUE;
    private static final int COLOR3 = 1291845632;
    private static final int COLOR4 = 436207616;
    private static final int FINISH_ANIMATION_DURATION_MS = 1000;
    private static final Interpolator INTERPOLATOR = new FastOutSlowInInterpolator();
    private long mFinishTime;
    private View mParent;
    private boolean mRunning;
    private long mStartTime;
    private float mTriggerPercentage;
    private final Paint mPaint = new Paint();
    private final RectF mClipRect = new RectF();
    private Rect mBounds = new Rect();
    private int mColor1 = COLOR1;
    private int mColor2 = Integer.MIN_VALUE;
    private int mColor3 = COLOR3;
    private int mColor4 = COLOR4;

    SwipeProgressBar(View view) {
        this.mParent = view;
    }

    private void drawCircle(Canvas canvas, float f, float f2, int i, float f3) {
        this.mPaint.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = INTERPOLATOR.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.mPaint);
        canvas.restore();
    }

    private void drawTrigger(Canvas canvas, int i, int i2) {
        this.mPaint.setColor(this.mColor1);
        float f = i;
        canvas.drawCircle(f, i2, this.mTriggerPercentage * f, this.mPaint);
    }

    void draw(Canvas canvas) {
        long j;
        int i;
        int i2;
        int width = this.mBounds.width();
        int height = this.mBounds.height();
        int i3 = width / 2;
        int i4 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.mBounds);
        if (this.mRunning || this.mFinishTime > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j2 = this.mStartTime;
            long j3 = (currentAnimationTimeMillis - j2) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - j2) % 2000)) / 20.0f;
            boolean z = false;
            if (!this.mRunning) {
                j = j3;
                long j4 = this.mFinishTime;
                if (currentAnimationTimeMillis - j4 >= 1000) {
                    this.mFinishTime = 0L;
                    return;
                }
                float f2 = i3;
                float interpolation = INTERPOLATOR.getInterpolation((((float) ((currentAnimationTimeMillis - j4) % 1000)) / 10.0f) / 100.0f) * f2;
                this.mClipRect.set(f2 - interpolation, 0.0f, f2 + interpolation, height);
                canvas.saveLayerAlpha(this.mClipRect, 0, 0);
                z = true;
            } else {
                j = j3;
            }
            if (j != 0) {
                if (f >= 0.0f && f < 25.0f) {
                    i = this.mColor4;
                } else if (f < 25.0f || f >= 50.0f) {
                    i = (f < 50.0f || f >= 75.0f) ? this.mColor3 : this.mColor2;
                }
                canvas.drawColor(i);
                i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 >= 0 && f <= 25.0f) {
                    drawCircle(canvas, i3, i4, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
                }
                if (i2 >= 0 && f <= 50.0f) {
                    drawCircle(canvas, i3, i4, this.mColor2, (f * 2.0f) / 100.0f);
                }
                if (f >= 25.0f && f <= 75.0f) {
                    drawCircle(canvas, i3, i4, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
                }
                if (f >= 50.0f && f <= 100.0f) {
                    drawCircle(canvas, i3, i4, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
                }
                if (f >= 75.0f && f <= 100.0f) {
                    drawCircle(canvas, i3, i4, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
                }
                if (this.mTriggerPercentage > 0.0f && z) {
                    canvas.restoreToCount(save);
                    int save2 = canvas.save();
                    canvas.clipRect(this.mBounds);
                    drawTrigger(canvas, i3, i4);
                    save = save2;
                }
                ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
            }
            i = this.mColor1;
            canvas.drawColor(i);
            i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 >= 0) {
                drawCircle(canvas, i3, i4, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
            }
            if (i2 >= 0) {
                drawCircle(canvas, i3, i4, this.mColor2, (f * 2.0f) / 100.0f);
            }
            if (f >= 25.0f) {
                drawCircle(canvas, i3, i4, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f) {
                drawCircle(canvas, i3, i4, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f) {
                drawCircle(canvas, i3, i4, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.mTriggerPercentage > 0.0f) {
                canvas.restoreToCount(save);
                int save22 = canvas.save();
                canvas.clipRect(this.mBounds);
                drawTrigger(canvas, i3, i4);
                save = save22;
            }
            ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
        } else {
            float f3 = this.mTriggerPercentage;
            if (f3 > 0.0f && f3 <= 1.0d) {
                drawTrigger(canvas, i3, i4);
            }
        }
        canvas.restoreToCount(save);
    }

    boolean isRunning() {
        return this.mRunning || this.mFinishTime > 0;
    }

    void setBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.mBounds;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
    }

    void setColorScheme(int i, int i2, int i3, int i4) {
        this.mColor1 = i;
        this.mColor2 = i2;
        this.mColor3 = i3;
        this.mColor4 = i4;
    }

    void setTriggerPercentage(float f) {
        this.mTriggerPercentage = f;
        this.mStartTime = 0L;
        ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
    }

    void start() {
        if (!this.mRunning) {
            this.mTriggerPercentage = 0.0f;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mRunning = true;
            this.mParent.postInvalidate();
        }
    }

    void stop() {
        if (this.mRunning) {
            this.mTriggerPercentage = 0.0f;
            this.mFinishTime = AnimationUtils.currentAnimationTimeMillis();
            this.mRunning = false;
            this.mParent.postInvalidate();
        }
    }
}
