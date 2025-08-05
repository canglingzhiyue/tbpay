package com.taobao.uikit.extend.component;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.AsyncTask;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class TBProgressBar extends ProgressBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mCurrentProgress;
    private ValueAnimator mDismissAlphaAnimator;
    private ValueAnimator mLightAnimator;
    private int mLightStartX;
    private ValueAnimator mProgressAnimator;
    private Bitmap mProgressLight;
    private int mScreenWidth;

    static {
        kge.a(-1175455119);
    }

    public static /* synthetic */ Object ipc$super(TBProgressBar tBProgressBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public static /* synthetic */ Bitmap access$002(TBProgressBar tBProgressBar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5b875b95", new Object[]{tBProgressBar, bitmap});
        }
        tBProgressBar.mProgressLight = bitmap;
        return bitmap;
    }

    public static /* synthetic */ int access$102(TBProgressBar tBProgressBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cea62e80", new Object[]{tBProgressBar, new Integer(i)})).intValue();
        }
        tBProgressBar.mLightStartX = i;
        return i;
    }

    public static /* synthetic */ int access$202(TBProgressBar tBProgressBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f43a3781", new Object[]{tBProgressBar, new Integer(i)})).intValue();
        }
        tBProgressBar.mCurrentProgress = i;
        return i;
    }

    public TBProgressBar(Context context) {
        this(context, null);
    }

    public TBProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.taobao.uikit.extend.component.TBProgressBar$1] */
    public TBProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentProgress = 0;
        this.mLightStartX = 0;
        setProgressDrawable(ContextCompat.getDrawable(context, R.drawable.uik_progress_drawable));
        new AsyncTask<Resources, Void, Bitmap>() { // from class: com.taobao.uikit.extend.component.TBProgressBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.onPostExecute((AnonymousClass1) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.AsyncTask
            public Bitmap doInBackground(Resources... resourcesArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bitmap) ipChange.ipc$dispatch("39d11def", new Object[]{this, resourcesArr});
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(resourcesArr[0], R.drawable.uik_progress_light);
                return decodeResource != null ? Bitmap.createScaledBitmap(decodeResource, (int) resourcesArr[0].getDimension(R.dimen.uik_progress_light_width), (int) resourcesArr[0].getDimension(R.dimen.uik_progress_light_height), false) : decodeResource;
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Bitmap bitmap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                    return;
                }
                super.onPostExecute((AnonymousClass1) bitmap);
                TBProgressBar.access$002(TBProgressBar.this, bitmap);
            }
        }.execute(getResources());
        if (this.mProgressLight != null && this.mLightAnimator == null) {
            Display defaultDisplay = ((WindowManager) getContext().getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.mScreenWidth = point.x;
            this.mLightAnimator = ValueAnimator.ofInt(0, this.mScreenWidth);
            this.mLightAnimator.setInterpolator(PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f));
            this.mLightAnimator.setDuration(1600L);
            this.mLightAnimator.setRepeatMode(1);
            this.mLightAnimator.setRepeatCount(Integer.MAX_VALUE);
        }
        ValueAnimator valueAnimator = this.mLightAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.TBProgressBar.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    TBProgressBar.access$102(TBProgressBar.this, ((Integer) valueAnimator2.getAnimatedValue()).intValue());
                    TBProgressBar.this.invalidate();
                }
            });
            this.mLightAnimator.start();
        }
        setCurrentProgress((int) (getMax() * 0.02d));
    }

    public synchronized void setCurrentProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddbdbd8", new Object[]{this, new Integer(i)});
        } else if (i < getProgress()) {
        } else {
            if (this.mProgressAnimator != null && this.mProgressAnimator.isRunning()) {
                this.mProgressAnimator.cancel();
            }
            this.mProgressAnimator = ValueAnimator.ofInt(this.mCurrentProgress, i);
            this.mProgressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.TBProgressBar.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    TBProgressBar.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    if (TBProgressBar.this.getProgress() != TBProgressBar.this.getMax()) {
                        return;
                    }
                    TBProgressBar.this.dismiss();
                }
            });
            this.mProgressAnimator.addListener(new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.TBProgressBar.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    TBProgressBar tBProgressBar = TBProgressBar.this;
                    TBProgressBar.access$202(tBProgressBar, tBProgressBar.getProgress());
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    TBProgressBar tBProgressBar = TBProgressBar.this;
                    TBProgressBar.access$202(tBProgressBar, tBProgressBar.getProgress());
                }
            });
            this.mProgressAnimator.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.2f, 1.0f));
            this.mProgressAnimator.setDuration(1000L);
            this.mProgressAnimator.start();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            ValueAnimator valueAnimator = this.mProgressAnimator;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
            ValueAnimator valueAnimator2 = this.mLightAnimator;
            if (valueAnimator2 == null) {
                return;
            }
            valueAnimator2.start();
            return;
        }
        ValueAnimator valueAnimator3 = this.mProgressAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.end();
        }
        ValueAnimator valueAnimator4 = this.mLightAnimator;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.end();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.mProgressAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.mLightAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.mLightAnimator.end();
        }
        ValueAnimator valueAnimator3 = this.mDismissAlphaAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
            this.mDismissAlphaAnimator.end();
        }
        super.onDetachedFromWindow();
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        if (this.mDismissAlphaAnimator == null) {
            this.mDismissAlphaAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.mDismissAlphaAnimator.setDuration(200L);
            this.mDismissAlphaAnimator.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.2f, 1.0f));
            this.mDismissAlphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.TBProgressBar.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    TBProgressBar.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    if (TBProgressBar.this.getAlpha() != 0.0f) {
                        return;
                    }
                    TBProgressBar.this.setVisibility(4);
                }
            });
        }
        if (this.mDismissAlphaAnimator.isRunning()) {
            return;
        }
        this.mDismissAlphaAnimator.start();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        float progress = getProgress() / getMax();
        if (progress > 0.0f && this.mProgressLight != null && this.mLightStartX < (this.mScreenWidth * progress) - (this.mProgressLight.getWidth() * 2)) {
            canvas.drawBitmap(this.mProgressLight, this.mLightStartX, 0.0f, (Paint) null);
        }
    }

    public void resetProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac205b23", new Object[]{this});
            return;
        }
        setVisibility(0);
        setAlpha(1.0f);
        invalidate();
        setProgress(0);
        this.mCurrentProgress = 0;
        ValueAnimator valueAnimator = this.mLightAnimator;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            this.mLightAnimator.start();
        }
        setCurrentProgress((int) (getMax() * 0.02d));
    }
}
