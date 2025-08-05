package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.c;
import com.taobao.android.opencart.view.FrameLayoutWrapper;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.ImageLoadFeature;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes6.dex */
public class hve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f28802a;
    private FrameLayoutWrapper b;
    private ViewGroup c;
    private PointF d;
    private PointF e;
    private PointF f;
    private long g;
    private AnimatorSet h;
    private Handler i = new Handler(Looper.getMainLooper());
    private c j;

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        return 550L;
    }

    public static /* synthetic */ AnimatorSet a(hve hveVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("16b74022", new Object[]{hveVar}) : hveVar.h;
    }

    public static /* synthetic */ void a(hve hveVar, Animator.AnimatorListener animatorListener, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340c0d90", new Object[]{hveVar, animatorListener, animator});
        } else {
            hveVar.a(animatorListener, animator);
        }
    }

    public static /* synthetic */ void a(hve hveVar, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13a4ac7", new Object[]{hveVar, tUrlImageView});
        } else {
            hveVar.a(tUrlImageView);
        }
    }

    public static /* synthetic */ void b(hve hveVar, Animator.AnimatorListener animatorListener, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ad502f", new Object[]{hveVar, animatorListener, animator});
        } else {
            hveVar.b(animatorListener, animator);
        }
    }

    public hve(Activity activity, c cVar) {
        this.f28802a = activity;
        this.c = (ViewGroup) activity.getWindow().getDecorView();
        this.j = cVar;
        this.b = new FrameLayoutWrapper(activity);
        this.b.setDetachListener(new FrameLayoutWrapper.a() { // from class: tb.hve.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.opencart.view.FrameLayoutWrapper.a
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else if (hve.a(hve.this) == null) {
                } else {
                    hve.a(hve.this).cancel();
                }
            }
        });
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public boolean a(AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b949e48d", new Object[]{this, addBagModel})).booleanValue() : addBagModel.getStartRect() == null || addBagModel.getEndRect() == null || addBagModel.getStartRect().d() == 0.0f || addBagModel.getStartRect().e() == 0.0f || addBagModel.getEndRect().d() == 0.0f || addBagModel.getEndRect().e() == 0.0f;
    }

    public void a(AddBagModel addBagModel, final AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0702eef", new Object[]{this, addBagModel, animatorListenerAdapter});
        } else if (a(addBagModel)) {
        } else {
            AddBagModel.b a2 = addBagModel.getStartRect().a();
            AddBagModel.b a3 = addBagModel.getEndRect().a();
            hvf.c("AddBagAnimation", "startRect=" + a2);
            hvf.c("AddBagAnimation", "endRect=" + a3);
            a2.a((float) hvl.a(a2.b()));
            a2.b((float) hvl.a(a2.c()));
            a2.c((float) hvl.a(a2.d()));
            a2.d(hvl.a(a2.e()));
            a3.a(hvl.a(a3.b()));
            a3.b(hvl.a(a3.c()));
            a3.c(hvl.a(a3.d()));
            a3.d(hvl.a(a3.e()));
            this.b.removeAllViews();
            this.c.removeView(this.b);
            TUrlImageView b = b(addBagModel);
            this.d = new PointF(a2.b(), a2.c());
            this.e = new PointF(a3.b() - ((a2.d() / 2.0f) - (a3.d() / 2.0f)), a3.c() - ((a2.e() / 2.0f) - (a3.e() / 2.0f)));
            this.f = new PointF(a2.b() + (a2.d() / 2.0f), a3.c() + (a3.e() / 2.0f));
            final float[] fArr = new float[2];
            final LinearLayout linearLayout = new LinearLayout(this.f28802a);
            linearLayout.setGravity(17);
            linearLayout.setX(this.d.x);
            linearLayout.setY(this.d.y);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams((int) a2.d(), (int) a2.e()));
            linearLayout.addView(b);
            Path path = new Path();
            path.moveTo(this.d.x, this.d.y);
            path.quadTo(this.f.x, this.f.y, this.e.x, this.e.y);
            final PathMeasure pathMeasure = new PathMeasure();
            pathMeasure.setPath(path, false);
            linearLayout.setPivotX(a2.b() / 2.0f);
            linearLayout.setPivotY(a2.c() / 2.0f);
            this.h = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.5f);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(400L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, "alpha", 0.5f, 0.0f);
            ofFloat2.setDuration(50L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b, "scaleX", 1.0f, 0.3f);
            ofFloat3.setDuration(400L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b, "scaleY", 1.0f, 0.3f);
            ofFloat4.setDuration(400L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
            ofFloat5.setInterpolator(new LinearInterpolator());
            ofFloat5.setDuration(400L);
            ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.hve.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    pathMeasure.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr, null);
                    linearLayout.setX(fArr[0]);
                    linearLayout.setY(fArr[1]);
                }
            });
            this.g = System.currentTimeMillis();
            ofFloat5.addListener(new Animator.AnimatorListener() { // from class: tb.hve.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
                    if (animatorListenerAdapter2 == null) {
                        return;
                    }
                    animatorListenerAdapter2.onAnimationStart(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    hve.a(hve.this, animatorListenerAdapter, animator);
                    hve.this.a();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
                    if (animatorListenerAdapter2 == null) {
                        return;
                    }
                    animatorListenerAdapter2.onAnimationCancel(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        return;
                    }
                    AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
                    if (animatorListenerAdapter2 == null) {
                        return;
                    }
                    animatorListenerAdapter2.onAnimationRepeat(animator);
                }
            });
            this.h.playSequentially(ofFloat, ofFloat2);
            this.h.playTogether(ofFloat3, ofFloat4, ofFloat5);
            this.h.setStartDelay(150L);
            this.h.start();
            this.b.addView(linearLayout);
            this.c.addView(this.b);
        }
    }

    private void a(final Animator.AnimatorListener animatorListener, final Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec76df69", new Object[]{this, animatorListener, animator});
        } else if (animatorListener == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.g;
            if (currentTimeMillis < 275) {
                this.i.postDelayed(new Runnable() { // from class: tb.hve.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            hve.b(hve.this, animatorListener, animator);
                        }
                    }
                }, 550 - currentTimeMillis);
            } else {
                b(animatorListener, animator);
            }
        }
    }

    private void b(final Animator.AnimatorListener animatorListener, final Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5783108", new Object[]{this, animatorListener, animator});
        } else if (animatorListener == null) {
        } else {
            boolean a2 = this.j.a();
            hvf.c("AddBagAnimation", "isWeexLoadSuccess=" + a2);
            if (a2) {
                animatorListener.onAnimationEnd(animator);
                return;
            }
            int a3 = (int) (hvi.a() * 1000.0f);
            hvf.c("AddBagAnimation", "loadWeexError and waitTime=" + a3);
            if (a3 == 0) {
                animatorListener.onAnimationEnd(animator);
            } else {
                this.i.postDelayed(new Runnable() { // from class: tb.hve.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            animatorListener.onAnimationEnd(animator);
                        }
                    }
                }, a3);
            }
        }
    }

    private TUrlImageView b(AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("93d630d4", new Object[]{this, addBagModel});
        }
        final TUrlImageView tUrlImageView = new TUrlImageView(this.f28802a);
        tUrlImageView.setImageUrl(addBagModel.getPic());
        if (TextUtils.isEmpty(addBagModel.getPic())) {
            tUrlImageView.setBackgroundResource(R.drawable.animation_pic_error);
            a(tUrlImageView);
            return tUrlImageView;
        }
        tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ImageLoadFeature imageLoadFeature = tUrlImageView.getmImageLoad();
        if (imageLoadFeature != null) {
            tUrlImageView.setAlpha(0.0f);
            imageLoadFeature.succListener(new a<SuccPhenixEvent>() { // from class: tb.hve.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    tUrlImageView.setAlpha(1.0f);
                    return false;
                }
            });
            imageLoadFeature.failListener(new a<FailPhenixEvent>() { // from class: tb.hve.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    hve.a(hve.this, tUrlImageView);
                    return false;
                }
            });
        }
        tUrlImageView.setErrorImageResId(R.drawable.animation_pic_error);
        return tUrlImageView;
    }

    private void a(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
            return;
        }
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        int a2 = hvl.a(15.5f);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(a2, a2);
        } else {
            layoutParams.width = a2;
            layoutParams.height = a2;
        }
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setAlpha(1.0f);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b.getParent() == null) {
        } else {
            ((ViewGroup) this.b.getParent()).removeView(this.b);
        }
    }
}
