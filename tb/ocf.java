package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public final class ocf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1567333598);
    }

    public static void a(final Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{drawable});
        } else if (drawable == null) {
        } else {
            drawable.setAlpha(0);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.ocf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }
            });
            ofInt.addListener(new Animator.AnimatorListener() { // from class: tb.ocf.2
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
                    } else {
                        drawable.setAlpha(255);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        drawable.setAlpha(255);
                    }
                }
            });
            ofInt.setDuration(300L);
            ofInt.start();
        }
    }

    public static void a(final Drawable drawable, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440e30a8", new Object[]{drawable, animatorListener});
        } else if (drawable == null) {
        } else {
            drawable.setAlpha(255);
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.ocf.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }
            });
            if (animatorListener != null) {
                ofInt.addListener(animatorListener);
            }
            ofInt.setDuration(300L);
            ofInt.start();
        }
    }

    public static int a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3afccc", new Object[]{view, new Integer(i)})).intValue();
        }
        if (view == null) {
            return -1;
        }
        int visibility = view.getVisibility();
        view.setVisibility(i);
        return visibility;
    }

    public static int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{view, new Integer(i), new Integer(i2)})).intValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-i, -i2);
        canvas.setMatrix(matrix);
        view.draw(canvas);
        return Color.alpha(createBitmap.getPixel(0, 0));
    }

    public static RectF a(View view, ViewGroup viewGroup) {
        PointF a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("3ffa199e", new Object[]{view, viewGroup});
        }
        if (view != null && (a2 = a(view, (View) viewGroup)) != null) {
            return new RectF(a2.x, a2.y, a2.x + view.getWidth(), a2.y + view.getHeight());
        }
        return null;
    }

    public static PointF a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("578e155f", new Object[]{view, view2});
        }
        if (view == null || view2 == null) {
            return null;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            View view3 = (View) parent;
            f += view.getX() - view3.getScrollX();
            f2 += view.getY() - view3.getScrollY();
            if (view3 == view2) {
                break;
            }
            view = view3;
        }
        return new PointF(f, f2);
    }
}
