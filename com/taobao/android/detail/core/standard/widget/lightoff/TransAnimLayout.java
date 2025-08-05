package com.taobao.android.detail.core.standard.widget.lightoff;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout;
import java.util.ArrayList;
import tb.ecr;
import tb.kge;

/* loaded from: classes4.dex */
public class TransAnimLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final AccelerateDecelerateInterpolator DEFAULT_INTERPOLATOR;
    public static final int DURATION = 200;
    private static final String SCALE_HEIGHT = "SCALE_HEIGHT";
    private static final String SCALE_WIDTH = "SCALE_WIDTH";
    private static final String TAG;
    private static final String TRANSITION_X = "TRANSITION_X";
    private static final String TRANSITION_Y = "TRANSITION_Y";
    private View mBackgroundView;
    private boolean mDismissing;
    private Animator.AnimatorListener mEnterListener;
    private Animator.AnimatorListener mExitListener;
    private ImageView mImageView;
    private FrameLayout mInnerLayout;
    private int mOriginHeight;
    private int mOriginWidth;
    private FrameLayout mPullContainer;
    private PullDismissLayout mPullDismissLayout;
    private int mPullInnerBottomMargin;
    private PullDismissLayout.a mPullListener;
    private Rect mRect;
    private Bundle mScaleBundle;
    private int mScreenHeight;
    private int mScreenWidth;
    private Rect mTransEndRect;
    private a mTransListener;
    private Bundle mTransitionBundle;

    /* loaded from: classes4.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1568935197);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            }
        }

        public void a(FrameLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b016271", new Object[]{this, layoutParams});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            }
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    public static /* synthetic */ Object ipc$super(TransAnimLayout transAnimLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a access$000(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c0090568", new Object[]{transAnimLayout}) : transAnimLayout.mTransListener;
    }

    public static /* synthetic */ Rect access$100(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("bf953d87", new Object[]{transAnimLayout}) : transAnimLayout.mTransEndRect;
    }

    public static /* synthetic */ Bundle access$1000(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("6a909154", new Object[]{transAnimLayout}) : transAnimLayout.mTransitionBundle;
    }

    public static /* synthetic */ Rect access$102(TransAnimLayout transAnimLayout, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("398852a6", new Object[]{transAnimLayout, rect});
        }
        transAnimLayout.mTransEndRect = rect;
        return rect;
    }

    public static /* synthetic */ String access$1100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2afaf99", new Object[0]) : TAG;
    }

    public static /* synthetic */ AccelerateDecelerateInterpolator access$1200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccelerateDecelerateInterpolator) ipChange.ipc$dispatch("10708644", new Object[0]) : DEFAULT_INTERPOLATOR;
    }

    public static /* synthetic */ View access$1300(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7dab12f", new Object[]{transAnimLayout}) : transAnimLayout.mBackgroundView;
    }

    public static /* synthetic */ FrameLayout access$200(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("80fc7a1c", new Object[]{transAnimLayout}) : transAnimLayout.mInnerLayout;
    }

    public static /* synthetic */ PullDismissLayout access$300(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullDismissLayout) ipChange.ipc$dispatch("5c694df6", new Object[]{transAnimLayout}) : transAnimLayout.mPullDismissLayout;
    }

    public static /* synthetic */ void access$400(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d7605b", new Object[]{transAnimLayout});
        } else {
            transAnimLayout.resetPullLayout();
        }
    }

    public static /* synthetic */ FrameLayout.LayoutParams access$500(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("40a04783", new Object[]{transAnimLayout}) : transAnimLayout.getTransEndPositon();
    }

    public static /* synthetic */ boolean access$600(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34be2c1d", new Object[]{transAnimLayout})).booleanValue() : transAnimLayout.mDismissing;
    }

    public static /* synthetic */ boolean access$602(TransAnimLayout transAnimLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7159ce61", new Object[]{transAnimLayout, new Boolean(z)})).booleanValue();
        }
        transAnimLayout.mDismissing = z;
        return z;
    }

    public static /* synthetic */ Rect access$700(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("71ca1941", new Object[]{transAnimLayout}) : transAnimLayout.mRect;
    }

    public static /* synthetic */ int access$800(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f0a4f7ca", new Object[]{transAnimLayout})).intValue() : transAnimLayout.mScreenHeight;
    }

    public static /* synthetic */ int access$900(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce985da9", new Object[]{transAnimLayout})).intValue() : transAnimLayout.mScreenWidth;
    }

    static {
        kge.a(-319419285);
        TAG = i.a("TransAni", BTags.XLightOff);
        DEFAULT_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    }

    public TransAnimLayout(Context context) {
        super(context);
        this.mScaleBundle = new Bundle();
        this.mTransitionBundle = new Bundle();
        this.mExitListener = new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).b();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).c();
                }
            }
        };
        this.mEnterListener = new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).a();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                TransAnimLayout.access$102(TransAnimLayout.this, new Rect());
                TransAnimLayout.access$200(TransAnimLayout.this).getGlobalVisibleRect(TransAnimLayout.access$100(TransAnimLayout.this));
                if (TransAnimLayout.access$300(TransAnimLayout.this) != null) {
                    TransAnimLayout.access$400(TransAnimLayout.this);
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                    return;
                }
                TransAnimLayout.access$000(TransAnimLayout.this).a(TransAnimLayout.access$500(TransAnimLayout.this));
            }
        };
        this.mPullListener = new PullDismissLayout.a() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a(float f, View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("249dcb5a", new Object[]{this, new Float(f), view, new Integer(i), new Integer(i2)});
                } else if (TransAnimLayout.access$600(TransAnimLayout.this)) {
                } else {
                    TransAnimLayout.access$602(TransAnimLayout.this, true);
                    if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                        TransAnimLayout.access$000(TransAnimLayout.this);
                    }
                    view.getGlobalVisibleRect(new Rect());
                    float width = TransAnimLayout.access$700(TransAnimLayout.this).width() * (TransAnimLayout.access$800(TransAnimLayout.this) / TransAnimLayout.access$900(TransAnimLayout.this));
                    float width2 = TransAnimLayout.access$700(TransAnimLayout.this).width() / view.getWidth();
                    float height = width / view.getHeight();
                    float f2 = (i + TransAnimLayout.access$1000(TransAnimLayout.this).getFloat(TransAnimLayout.TRANSITION_X)) * (-1.0f);
                    float centerY = (float) (TransAnimLayout.access$700(TransAnimLayout.this).centerY() - (Math.ceil((view.getHeight() + ecr.a()) / 2.0f) + i2));
                    if (Float.isNaN(width2) || Float.isNaN(height) || Float.isNaN(f2) || Float.isNaN(centerY)) {
                        String access$1100 = TransAnimLayout.access$1100();
                        com.taobao.android.detail.core.utils.i.a(access$1100, "PullListener onDismissed isNaN:scaleX" + width2 + ",scaleY" + height + ",transX" + f2 + ",transY" + centerY);
                        if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                            TransAnimLayout.access$000(TransAnimLayout.this).c();
                        }
                        TransAnimLayout.this.hideTransView();
                        return;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(200L).setInterpolator(TransAnimLayout.access$1200());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(view, "translationX", f2));
                    arrayList.add(ObjectAnimator.ofFloat(view, "translationY", centerY));
                    arrayList.add(ObjectAnimator.ofFloat(view, "scaleX", width2));
                    arrayList.add(ObjectAnimator.ofFloat(view, "scaleY", height));
                    if (TransAnimLayout.access$1300(TransAnimLayout.this) != null) {
                        arrayList.add(ObjectAnimator.ofFloat(TransAnimLayout.access$1300(TransAnimLayout.this), View.ALPHA, 0.0f));
                    }
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.3.1
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
                            } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                            } else {
                                TransAnimLayout.access$000(TransAnimLayout.this).b();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                                TransAnimLayout.access$000(TransAnimLayout.this).c();
                            }
                            TransAnimLayout.access$602(TransAnimLayout.this, false);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            } else {
                                TransAnimLayout.access$602(TransAnimLayout.this, false);
                            }
                        }
                    });
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).d();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).e();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a(float f, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).a(f);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                    return false;
                }
                return TransAnimLayout.access$000(TransAnimLayout.this).f();
            }
        };
    }

    public TransAnimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScaleBundle = new Bundle();
        this.mTransitionBundle = new Bundle();
        this.mExitListener = new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).b();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).c();
                }
            }
        };
        this.mEnterListener = new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).a();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                TransAnimLayout.access$102(TransAnimLayout.this, new Rect());
                TransAnimLayout.access$200(TransAnimLayout.this).getGlobalVisibleRect(TransAnimLayout.access$100(TransAnimLayout.this));
                if (TransAnimLayout.access$300(TransAnimLayout.this) != null) {
                    TransAnimLayout.access$400(TransAnimLayout.this);
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                    return;
                }
                TransAnimLayout.access$000(TransAnimLayout.this).a(TransAnimLayout.access$500(TransAnimLayout.this));
            }
        };
        this.mPullListener = new PullDismissLayout.a() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a(float f, View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("249dcb5a", new Object[]{this, new Float(f), view, new Integer(i), new Integer(i2)});
                } else if (TransAnimLayout.access$600(TransAnimLayout.this)) {
                } else {
                    TransAnimLayout.access$602(TransAnimLayout.this, true);
                    if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                        TransAnimLayout.access$000(TransAnimLayout.this);
                    }
                    view.getGlobalVisibleRect(new Rect());
                    float width = TransAnimLayout.access$700(TransAnimLayout.this).width() * (TransAnimLayout.access$800(TransAnimLayout.this) / TransAnimLayout.access$900(TransAnimLayout.this));
                    float width2 = TransAnimLayout.access$700(TransAnimLayout.this).width() / view.getWidth();
                    float height = width / view.getHeight();
                    float f2 = (i + TransAnimLayout.access$1000(TransAnimLayout.this).getFloat(TransAnimLayout.TRANSITION_X)) * (-1.0f);
                    float centerY = (float) (TransAnimLayout.access$700(TransAnimLayout.this).centerY() - (Math.ceil((view.getHeight() + ecr.a()) / 2.0f) + i2));
                    if (Float.isNaN(width2) || Float.isNaN(height) || Float.isNaN(f2) || Float.isNaN(centerY)) {
                        String access$1100 = TransAnimLayout.access$1100();
                        com.taobao.android.detail.core.utils.i.a(access$1100, "PullListener onDismissed isNaN:scaleX" + width2 + ",scaleY" + height + ",transX" + f2 + ",transY" + centerY);
                        if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                            TransAnimLayout.access$000(TransAnimLayout.this).c();
                        }
                        TransAnimLayout.this.hideTransView();
                        return;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(200L).setInterpolator(TransAnimLayout.access$1200());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(view, "translationX", f2));
                    arrayList.add(ObjectAnimator.ofFloat(view, "translationY", centerY));
                    arrayList.add(ObjectAnimator.ofFloat(view, "scaleX", width2));
                    arrayList.add(ObjectAnimator.ofFloat(view, "scaleY", height));
                    if (TransAnimLayout.access$1300(TransAnimLayout.this) != null) {
                        arrayList.add(ObjectAnimator.ofFloat(TransAnimLayout.access$1300(TransAnimLayout.this), View.ALPHA, 0.0f));
                    }
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.3.1
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
                            } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                            } else {
                                TransAnimLayout.access$000(TransAnimLayout.this).b();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                                TransAnimLayout.access$000(TransAnimLayout.this).c();
                            }
                            TransAnimLayout.access$602(TransAnimLayout.this, false);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            } else {
                                TransAnimLayout.access$602(TransAnimLayout.this, false);
                            }
                        }
                    });
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).d();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).e();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a(float f, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).a(f);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                    return false;
                }
                return TransAnimLayout.access$000(TransAnimLayout.this).f();
            }
        };
    }

    public TransAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScaleBundle = new Bundle();
        this.mTransitionBundle = new Bundle();
        this.mExitListener = new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).b();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).c();
                }
            }
        };
        this.mEnterListener = new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).a();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                TransAnimLayout.access$102(TransAnimLayout.this, new Rect());
                TransAnimLayout.access$200(TransAnimLayout.this).getGlobalVisibleRect(TransAnimLayout.access$100(TransAnimLayout.this));
                if (TransAnimLayout.access$300(TransAnimLayout.this) != null) {
                    TransAnimLayout.access$400(TransAnimLayout.this);
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                    return;
                }
                TransAnimLayout.access$000(TransAnimLayout.this).a(TransAnimLayout.access$500(TransAnimLayout.this));
            }
        };
        this.mPullListener = new PullDismissLayout.a() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a(float f, View view, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("249dcb5a", new Object[]{this, new Float(f), view, new Integer(i2), new Integer(i22)});
                } else if (TransAnimLayout.access$600(TransAnimLayout.this)) {
                } else {
                    TransAnimLayout.access$602(TransAnimLayout.this, true);
                    if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                        TransAnimLayout.access$000(TransAnimLayout.this);
                    }
                    view.getGlobalVisibleRect(new Rect());
                    float width = TransAnimLayout.access$700(TransAnimLayout.this).width() * (TransAnimLayout.access$800(TransAnimLayout.this) / TransAnimLayout.access$900(TransAnimLayout.this));
                    float width2 = TransAnimLayout.access$700(TransAnimLayout.this).width() / view.getWidth();
                    float height = width / view.getHeight();
                    float f2 = (i2 + TransAnimLayout.access$1000(TransAnimLayout.this).getFloat(TransAnimLayout.TRANSITION_X)) * (-1.0f);
                    float centerY = (float) (TransAnimLayout.access$700(TransAnimLayout.this).centerY() - (Math.ceil((view.getHeight() + ecr.a()) / 2.0f) + i22));
                    if (Float.isNaN(width2) || Float.isNaN(height) || Float.isNaN(f2) || Float.isNaN(centerY)) {
                        String access$1100 = TransAnimLayout.access$1100();
                        com.taobao.android.detail.core.utils.i.a(access$1100, "PullListener onDismissed isNaN:scaleX" + width2 + ",scaleY" + height + ",transX" + f2 + ",transY" + centerY);
                        if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                            TransAnimLayout.access$000(TransAnimLayout.this).c();
                        }
                        TransAnimLayout.this.hideTransView();
                        return;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(200L).setInterpolator(TransAnimLayout.access$1200());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(view, "translationX", f2));
                    arrayList.add(ObjectAnimator.ofFloat(view, "translationY", centerY));
                    arrayList.add(ObjectAnimator.ofFloat(view, "scaleX", width2));
                    arrayList.add(ObjectAnimator.ofFloat(view, "scaleY", height));
                    if (TransAnimLayout.access$1300(TransAnimLayout.this) != null) {
                        arrayList.add(ObjectAnimator.ofFloat(TransAnimLayout.access$1300(TransAnimLayout.this), View.ALPHA, 0.0f));
                    }
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.TransAnimLayout.3.1
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
                            } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                            } else {
                                TransAnimLayout.access$000(TransAnimLayout.this).b();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                                TransAnimLayout.access$000(TransAnimLayout.this).c();
                            }
                            TransAnimLayout.access$602(TransAnimLayout.this, false);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            } else {
                                TransAnimLayout.access$602(TransAnimLayout.this, false);
                            }
                        }
                    });
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).d();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).e();
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public void a(float f, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i2), new Integer(i22)});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                } else {
                    TransAnimLayout.access$000(TransAnimLayout.this).a(f);
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.a
            public boolean c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) == null) {
                    return false;
                }
                return TransAnimLayout.access$000(TransAnimLayout.this).f();
            }
        };
    }

    public void init(Rect rect, Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3965aa4e", new Object[]{this, rect, drawable, new Boolean(z)});
            return;
        }
        getScreenSize();
        this.mRect = rect;
        setTransViewRect(drawable);
        this.mOriginWidth = this.mRect.right - this.mRect.left;
        this.mOriginHeight = this.mRect.bottom - this.mRect.top;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mOriginWidth, this.mOriginHeight);
        layoutParams.setMargins(this.mRect.left, this.mRect.top - ecr.a(), this.mRect.right, this.mRect.bottom);
        this.mInnerLayout = new FrameLayout(getContext());
        this.mImageView = new ImageView(getContext());
        this.mInnerLayout.addView(this.mImageView, new FrameLayout.LayoutParams(-1, -1));
        if (z) {
            this.mPullDismissLayout = new PullDismissLayout(getContext());
            this.mPullContainer = new FrameLayout(getContext());
            this.mPullDismissLayout.addView(this.mPullContainer, new FrameLayout.LayoutParams(-1, -1));
            addView(this.mPullDismissLayout, new FrameLayout.LayoutParams(-1, -1));
            this.mPullContainer.addView(this.mInnerLayout, layoutParams);
        } else {
            addView(this.mInnerLayout, layoutParams);
        }
        this.mImageView.setImageDrawable(drawable);
        this.mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mImageView.setClickable(true);
        getBundleInfo(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.mDismissing = false;
    }

    private void setTransViewRect(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeb14da", new Object[]{this, drawable});
            return;
        }
        Rect rect = new Rect(this.mRect);
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return;
        }
        if (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight()) {
            int width = (this.mRect.width() * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
            rect.left = this.mRect.left;
            rect.right = this.mRect.right;
            rect.top = this.mRect.top + ((this.mRect.height() - width) / 2);
            rect.bottom = rect.top + width;
            this.mRect = rect;
            return;
        }
        int height = (this.mRect.height() * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight();
        rect.top = this.mRect.top;
        rect.bottom = this.mRect.bottom;
        rect.left = this.mRect.left + ((this.mRect.width() - height) / 2);
        rect.right = rect.left + height;
        this.mRect = rect;
    }

    private void initPullDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f3f5c", new Object[]{this});
            return;
        }
        this.mPullDismissLayout.setAnimateAlpha(false);
        this.mPullDismissLayout.setAnimateScale(true);
        this.mPullDismissLayout.setMinFlingVelocity(100.0f);
        this.mPullDismissLayout.setListener(this.mPullListener);
    }

    private void getScreenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e0418a", new Object[]{this});
            return;
        }
        Display defaultDisplay = ((Activity) getContext()).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.mScreenWidth = point.x;
        this.mScreenHeight = point.y;
    }

    private void getBundleInfo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57c2ed", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mScaleBundle.putFloat(SCALE_WIDTH, this.mScreenWidth / this.mOriginWidth);
        this.mScaleBundle.putFloat(SCALE_HEIGHT, (this.mScreenWidth / (i / i2)) / this.mOriginHeight);
        this.mTransitionBundle.putFloat(TRANSITION_X, (this.mScreenWidth / 2) - (this.mRect.left + ((this.mRect.right - this.mRect.left) / 2)));
        this.mTransitionBundle.putFloat(TRANSITION_Y, (((this.mScreenHeight / 2) - (this.mRect.top + ((this.mRect.bottom - this.mRect.top) / 2))) + ecr.a()) - (this.mPullInnerBottomMargin / 2));
    }

    public void runEnterAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d77686d", new Object[]{this, view});
            return;
        }
        float f = this.mScaleBundle.getFloat(SCALE_WIDTH);
        float f2 = this.mScaleBundle.getFloat(SCALE_HEIGHT);
        float f3 = this.mTransitionBundle.getFloat(TRANSITION_X);
        float f4 = this.mTransitionBundle.getFloat(TRANSITION_Y);
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4) || Float.isInfinite(f) || Float.isInfinite(f2) || Float.isInfinite(f3) || Float.isInfinite(f4)) {
            String str = TAG;
            com.taobao.android.detail.core.utils.i.a(str, "runEnterAnim isNaN or isInfinite scaleX: " + f + ",scaleY: " + f2 + ",transX: " + f3 + ",transY: " + f4);
            a aVar = this.mTransListener;
            if (aVar != null) {
                aVar.a(getTransEndPositon());
            }
            hideTransView();
            if (view == null) {
                return;
            }
            view.setAlpha(1.0f);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L).setInterpolator(DEFAULT_INTERPOLATOR);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationX", f3));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationY", f4));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleX", f));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleY", f2));
        if (view != null) {
            this.mBackgroundView = view;
            arrayList.add(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f));
        }
        animatorSet.addListener(this.mEnterListener);
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.mInnerLayout.setVisibility(0);
    }

    private void resetPullLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47700605", new Object[]{this});
            return;
        }
        this.mInnerLayout.removeView(this.mImageView);
        this.mPullContainer.removeView(this.mInnerLayout);
        FrameLayout.LayoutParams transEndPositon = getTransEndPositon();
        this.mInnerLayout = new FrameLayout(getContext());
        this.mInnerLayout.addView(this.mImageView, new FrameLayout.LayoutParams(-1, -1));
        this.mPullContainer.addView(this.mInnerLayout, transEndPositon);
        initPullDismiss();
    }

    private FrameLayout.LayoutParams getTransEndPositon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("1f440f25", new Object[]{this});
        }
        Rect rect = this.mTransEndRect;
        if (rect == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), this.mTransEndRect.height());
        layoutParams.setMargins(this.mTransEndRect.left, this.mTransEndRect.top - ecr.a(), this.mTransEndRect.right, this.mTransEndRect.bottom);
        return layoutParams;
    }

    public void runExitAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f53b1", new Object[]{this, view});
            return;
        }
        this.mInnerLayout.getGlobalVisibleRect(new Rect());
        float f = this.mTransitionBundle.getFloat(TRANSITION_X) * (-1.0f);
        float f2 = this.mTransitionBundle.getFloat(TRANSITION_Y) * (-1.0f);
        float f3 = 1.0f / this.mScaleBundle.getFloat(SCALE_WIDTH);
        float f4 = 1.0f / this.mScaleBundle.getFloat(SCALE_HEIGHT);
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f) || Float.isNaN(f2) || Float.isInfinite(f3) || Float.isInfinite(f4) || Float.isInfinite(f) || Float.isInfinite(f2)) {
            String str = TAG;
            com.taobao.android.detail.core.utils.i.a(str, "runExitAnim isNaN or isInfinite scaleX: " + f3 + ",scaleY: " + f4 + ",transX: " + f + ",transY: " + f2);
            a aVar = this.mTransListener;
            if (aVar != null) {
                aVar.c();
            }
            hideTransView();
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L).setInterpolator(DEFAULT_INTERPOLATOR);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationX", 0.0f, f));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationY", 0.0f, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleX", 1.0f, f3));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleY", 1.0f, f4));
        if (view != null) {
            this.mBackgroundView = view;
            arrayList.add(ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f));
        }
        animatorSet.addListener(this.mExitListener);
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public void setTransListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21357cb8", new Object[]{this, aVar});
        } else {
            this.mTransListener = aVar;
        }
    }

    public void showTransImage(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26390e9b", new Object[]{this, drawable});
            return;
        }
        if (drawable != null) {
            updataTransImage(drawable);
        }
        this.mImageView.setVisibility(0);
    }

    public void updataTransImage(Drawable drawable) {
        ImageView imageView;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c016a63", new Object[]{this, drawable});
        } else if (drawable == null || (imageView = this.mImageView) == null) {
        } else {
            imageView.setImageDrawable(drawable);
            if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || this.mInnerLayout == null) {
                return;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ViewGroup.LayoutParams layoutParams = this.mInnerLayout.getLayoutParams();
            int i = this.mScreenWidth;
            layoutParams.width = i;
            layoutParams.height = (i * height) / width;
            setTransViewRect(drawable);
        }
    }

    public void hideTransView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78298152", new Object[]{this});
        } else {
            this.mImageView.setVisibility(8);
        }
    }

    public boolean isTransViewHiden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ae229d4", new Object[]{this})).booleanValue() : this.mImageView.getVisibility() != 0;
    }

    public void addPullInnerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d927f16", new Object[]{this, view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = this.mPullInnerBottomMargin;
        this.mPullContainer.addView(view, 0, layoutParams);
    }

    public void setPullInnerBottomMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17167e34", new Object[]{this, new Integer(i)});
        } else {
            this.mPullInnerBottomMargin = i;
        }
    }
}
