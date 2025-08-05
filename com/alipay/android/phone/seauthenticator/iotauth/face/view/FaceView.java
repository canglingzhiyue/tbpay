package com.alipay.android.phone.seauthenticator.iotauth.face.view;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.security.realidentity.x2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FaceView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FaceView";
    private Animation aniCapturing;
    private Animation aniNoCapture;
    private View bgView;
    private CancellationSignal captureCancel;
    private CheckEndAnimation checkEndAnimation;
    private CancellationSignal checkingCancel;
    private ImageView faceView;
    private View frameLayout;
    private ImageView frameView;
    private boolean isColorfulUI;

    /* renamed from: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements CheckEndAnimation {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimationEndCallback f5171a;

        public AnonymousClass3(AnimationEndCallback animationEndCallback) {
            this.f5171a = animationEndCallback;
        }

        @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.CheckEndAnimation
        public void anim() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d081d618", new Object[]{this});
                return;
            }
            final int i = FaceView.access$100(FaceView.this).getRotation() < 180.0f ? 360 : x2.o;
            ValueAnimator ofInt = ValueAnimator.ofInt((int) FaceView.access$100(FaceView.this).getRotation(), i);
            ofInt.setDuration(100L);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public boolean f5172a = false;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ImageView access$100;
                    Resources resources;
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    FaceView.access$100(FaceView.this).setRotation(num.intValue());
                    String str = FaceView.TAG;
                    String str2 = "checking to checkingend animation value : " + num;
                    int i3 = i + AConstants.ArtcErrorAudioDeviceError;
                    if (num.intValue() > i3 + 180 && num.intValue() < i3 + 270) {
                        float intValue = ((num.intValue() - 180.0f) - i3) / 90.0f;
                        String str3 = FaceView.TAG;
                        String str4 = "checking to checkingend alpha " + intValue;
                        FaceView.access$100(FaceView.this).setAlpha(1.0f - intValue);
                    } else if (num.intValue() < i3 + 270 || num.intValue() >= i) {
                    } else {
                        if (!this.f5172a) {
                            if (FaceView.access$300(FaceView.this)) {
                                access$100 = FaceView.access$100(FaceView.this);
                                resources = FaceView.this.getResources();
                                i2 = R.drawable.face_frame_2;
                            } else {
                                access$100 = FaceView.access$100(FaceView.this);
                                resources = FaceView.this.getResources();
                                i2 = R.drawable.face_frame;
                            }
                            access$100.setBackground(resources.getDrawable(i2));
                            this.f5172a = true;
                        }
                        float intValue2 = ((num.intValue() - 270.0f) - i3) / 90.0f;
                        String str5 = FaceView.TAG;
                        String str6 = "checking to checkingend alpha2 " + intValue2;
                        FaceView.access$100(FaceView.this).setAlpha(intValue2);
                    }
                }
            });
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.3.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

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
                    FaceView.access$100(FaceView.this).setAlpha(1.0f);
                    FaceView.access$400(FaceView.this).cancel();
                    FaceView.access$500(FaceView.this).clearAnimation();
                    int i2 = (int) (FaceView.this.getResources().getDisplayMetrics().density * 30.0f);
                    float f = i2;
                    float f2 = -i2;
                    ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(FaceView.access$500(FaceView.this), PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f), Keyframe.ofFloat(0.26f, 0.5f * f2), Keyframe.ofFloat(0.42f, 0.4f * f), Keyframe.ofFloat(0.58f, 0.3f * f2), Keyframe.ofFloat(0.74f, f * 0.2f), Keyframe.ofFloat(0.9f, f2 * 0.1f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(400L);
                    duration.setInterpolator(new LinearInterpolator());
                    duration.setStartDelay(200L);
                    duration.addListener(new Animator.AnimatorListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.3.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator2});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator2});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator2});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                            } else if (AnonymousClass3.this.f5171a == null) {
                            } else {
                                AnonymousClass3.this.f5171a.onCheckFailEnd();
                            }
                        }
                    });
                    duration.start();
                }
            });
            ofInt.start();
        }
    }

    /* loaded from: classes3.dex */
    public interface AnimationEndCallback {
        void onCheckEnd();

        void onCheckFailEnd();

        void onCheckSuccessEnd();

        void onNoCaptureEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface CheckEndAnimation {
        void anim();
    }

    public static /* synthetic */ Object ipc$super(FaceView faceView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ImageView access$000(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("70f228bf", new Object[]{faceView}) : faceView.faceView;
    }

    public static /* synthetic */ ImageView access$100(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("c9fd7440", new Object[]{faceView}) : faceView.frameView;
    }

    public static /* synthetic */ CancellationSignal access$200(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CancellationSignal) ipChange.ipc$dispatch("e096b6ca", new Object[]{faceView}) : faceView.captureCancel;
    }

    public static /* synthetic */ boolean access$300(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa990012", new Object[]{faceView})).booleanValue() : faceView.isColorfulUI;
    }

    public static /* synthetic */ Animation access$400(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation) ipChange.ipc$dispatch("a80d3549", new Object[]{faceView}) : faceView.aniCapturing;
    }

    public static /* synthetic */ View access$500(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1da9580e", new Object[]{faceView}) : faceView.frameLayout;
    }

    public static /* synthetic */ CheckEndAnimation access$600(FaceView faceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CheckEndAnimation) ipChange.ipc$dispatch("d07770b6", new Object[]{faceView}) : faceView.checkEndAnimation;
    }

    public FaceView(Context context) {
        super(context);
        this.isColorfulUI = false;
        init(context);
    }

    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isColorfulUI = false;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.face_check, (ViewGroup) this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        this.faceView = (ImageView) inflate.findViewById(R.id.ivFace);
        this.frameView = (ImageView) inflate.findViewById(R.id.ivFrame);
        this.frameLayout = inflate.findViewById(R.id.layoutFrame);
        this.bgView = inflate.findViewById(R.id.view_bg);
        this.aniCapturing = AnimationUtils.loadAnimation(context, R.anim.ani_scale_apha);
        this.aniNoCapture = AnimationUtils.loadAnimation(context, R.anim.ani_shake);
        reset();
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        if (this.isColorfulUI) {
            this.faceView.setBackground(getResources().getDrawable(R.drawable.face_2));
            this.frameView.setBackground(getResources().getDrawable(R.drawable.face_frame_2));
            this.bgView.setBackground(null);
        } else {
            this.faceView.setBackground(getResources().getDrawable(R.drawable.face));
            this.frameView.setBackground(getResources().getDrawable(R.drawable.face_frame));
            this.bgView.setBackground(getResources().getDrawable(R.drawable.face_bg));
        }
        this.faceView.setVisibility(0);
        CancellationSignal cancellationSignal = this.checkingCancel;
        if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
            this.checkingCancel.cancel();
        }
        CancellationSignal cancellationSignal2 = this.captureCancel;
        if (cancellationSignal2 != null && !cancellationSignal2.isCanceled()) {
            this.captureCancel.cancel();
        }
        this.aniCapturing.cancel();
        this.aniNoCapture.cancel();
        this.frameView.clearAnimation();
        this.faceView.clearAnimation();
        this.frameLayout.clearAnimation();
        this.checkEndAnimation = null;
    }

    public void setFaceViewTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458c828", new Object[]{this, str});
            return;
        }
        String str2 = "face view tip : " + str;
    }

    public void startCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e1eb0b", new Object[]{this});
            return;
        }
        reset();
        this.captureCancel = new CancellationSignal();
        final ValueAnimator ofInt = ValueAnimator.ofInt(100, 0, 100);
        ofInt.setDuration(1000L);
        ofInt.setRepeatCount(-1);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f = ((0.6f * intValue) / 100.0f) + 0.4f;
                FaceView.access$000(FaceView.this).setAlpha(f);
                FaceView.access$100(FaceView.this).setAlpha(f);
                float f2 = ((0.100000024f * intValue) / 100.0f) + 0.9f;
                FaceView.access$100(FaceView.this).setScaleX(f2);
                FaceView.access$100(FaceView.this).setScaleY(f2);
                String str = FaceView.TAG;
                String str2 = "capture value: " + intValue;
                if (FaceView.access$200(FaceView.this) == null || !FaceView.access$200(FaceView.this).isCanceled()) {
                    return;
                }
                String str3 = FaceView.TAG;
                String str4 = "capture cancel : " + FaceView.access$200(FaceView.this);
                ofInt.cancel();
                FaceView.access$000(FaceView.this).setAlpha(1.0f);
                FaceView.access$100(FaceView.this).setAlpha(1.0f);
                FaceView.access$100(FaceView.this).setScaleX(1.0f);
                FaceView.access$100(FaceView.this).setScaleY(1.0f);
            }
        });
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    public void captureFail(final AnimationEndCallback animationEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a83073", new Object[]{this, animationEndCallback});
            return;
        }
        this.frameView.clearAnimation();
        this.captureCancel.cancel();
        int i = (int) (getResources().getDisplayMetrics().density * 25.0f);
        float f = i;
        float f2 = -i;
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.faceView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f), Keyframe.ofFloat(0.26f, 0.5f * f2), Keyframe.ofFloat(0.42f, 0.4f * f), Keyframe.ofFloat(0.58f, 0.3f * f2), Keyframe.ofFloat(0.74f, f * 0.2f), Keyframe.ofFloat(0.9f, f2 * 0.1f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(400L);
        duration.setInterpolator(new LinearInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

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
                AnimationEndCallback animationEndCallback2 = animationEndCallback;
                if (animationEndCallback2 == null) {
                    return;
                }
                animationEndCallback2.onNoCaptureEnd();
            }
        });
        duration.start();
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            reset();
        }
    }

    public void startCheck(AnimationEndCallback animationEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d27df35", new Object[]{this, animationEndCallback});
            return;
        }
        this.captureCancel.cancel();
        this.frameView.clearAnimation();
        this.checkingCancel = new CancellationSignal();
        checkAnimation(this.checkingCancel, animationEndCallback);
    }

    public void checkFail(AnimationEndCallback animationEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cb4db5", new Object[]{this, animationEndCallback});
            return;
        }
        this.checkEndAnimation = new AnonymousClass3(animationEndCallback);
        this.checkingCancel.cancel();
    }

    public void checkSuccess(final AnimationEndCallback animationEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715e408a", new Object[]{this, animationEndCallback});
            return;
        }
        this.checkEndAnimation = new CheckEndAnimation() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.CheckEndAnimation
            public void anim() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d081d618", new Object[]{this});
                    return;
                }
                FaceView.access$100(FaceView.this).setBackground(FaceView.this.getResources().getDrawable(R.drawable.face_checked));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(FaceView.access$100(FaceView.this), "alpha", 1.0f, 0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public float f5176a = 1.0f;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        String str = FaceView.TAG;
                        String str2 = "check success animation value : " + floatValue;
                        FaceView.access$100(FaceView.this).setAlpha(floatValue);
                        FaceView.access$000(FaceView.this).setAlpha(floatValue);
                        if (this.f5176a < floatValue) {
                            FaceView.access$000(FaceView.this).setBackground(FaceView.this.getResources().getDrawable(R.drawable.face_success));
                            FaceView.access$100(FaceView.this).setBackground(FaceView.this.getResources().getDrawable(R.drawable.face_check_success));
                        }
                        this.f5176a = floatValue;
                    }
                });
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.4.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else if (animationEndCallback == null) {
                        } else {
                            animationEndCallback.onCheckSuccessEnd();
                        }
                    }
                });
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
        };
        this.checkingCancel.cancel();
    }

    private void checkAnimation(final CancellationSignal cancellationSignal, final AnimationEndCallback animationEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d285c10", new Object[]{this, cancellationSignal, animationEndCallback});
            return;
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.setDuration(600L);
        ofInt.setRepeatCount(-1);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f5178a = true;
            public int b = 0;

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onAnimationUpdate(android.animation.ValueAnimator r7) {
                /*
                    Method dump skipped, instructions count: 295
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnonymousClass5.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        });
        ofInt.start();
    }

    public void setColorfulUI(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889e7dd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isColorfulUI = z;
        if (this.isColorfulUI) {
            this.faceView.setBackground(getResources().getDrawable(R.drawable.face_2));
            this.frameView.setBackground(getResources().getDrawable(R.drawable.face_frame_2));
            this.bgView.setBackground(null);
            return;
        }
        this.faceView.setBackground(getResources().getDrawable(R.drawable.face));
        this.frameView.setBackground(getResources().getDrawable(R.drawable.face_frame));
        this.bgView.setBackground(getResources().getDrawable(R.drawable.face_bg));
    }
}
