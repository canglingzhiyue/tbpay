package com.taobao.bootimage.interact.pop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.j;
import com.airbnb.lottie.l;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import tb.kej;
import tb.kel;
import tb.ken;
import tb.keo;
import tb.kge;
import tb.tiq;

/* loaded from: classes6.dex */
public class BootImageBigPopView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, View.OnClickListener, j<Throwable>, l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOTTIE_END_ANIM_DURATION = 300;
    private static final String TAG = "BootImageBigPopView";
    public static final int TYPE_CLICK_SKIP = 3;
    public static final int TYPE_LOAD_FAIL = 12;
    public static final int TYPE_ORANGE_DISABLE = 13;
    private JSONObject mBizData;
    private BootImageInfo mBootImageInfo;
    private ObjectAnimator mEndAnimator;
    private Handler mExitHandler;
    private boolean mHasClose;
    private boolean mHasLoadLottie;
    private boolean mHasPlayEndAnim;
    private boolean mIsShowing;
    private int mLottieDuration;
    private int mLottieHeight;
    private FileInputStream mLottieInputStream;
    private int mLottieMaxDuration;
    private LottieAnimationView mLottiePop;
    private int mLottieWidth;
    private e mPopPlayEndListener;
    private LinkedSplashData mSplashData;
    private View mTopLayer;
    private TextView mTvSkip;

    static {
        kge.a(2030252609);
        kge.a(-1201612728);
        kge.a(2033362794);
        kge.a(1499308443);
        kge.a(875978254);
        kge.a(1420754541);
    }

    public static /* synthetic */ Object ipc$super(BootImageBigPopView bootImageBigPopView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
        }
    }

    public static BootImageBigPopView preBuildBigLottie(Context context, BootImageInfo bootImageInfo, LinkedSplashData linkedSplashData, String str, JSONObject jSONObject) {
        BootImageBigPopView bootImageBigPopView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageBigPopView) ipChange.ipc$dispatch("e2040ca5", new Object[]{context, bootImageInfo, linkedSplashData, str, jSONObject});
        }
        if (bootImageInfo != null && context != null && ((linkedSplashData == null || "popView".equals(linkedSplashData.getLinkedDataType()) || StringUtils.equals(str, "popView")) && "1".equals(bootImageInfo.animationType) && !StringUtils.isEmpty(bootImageInfo.animationLottie))) {
            File a2 = keo.a(tiq.BIZ_CODE, bootImageInfo.animationLottie);
            if (a2 == null || !a2.exists()) {
                recordLoadFail(linkedSplashData, bootImageInfo, "lottie_file_not_exists", 12, jSONObject);
            } else if (!kel.j) {
                recordLoadFail(linkedSplashData, bootImageInfo, "enableBigPop:" + kel.j, 13, jSONObject);
                return null;
            } else {
                kej.a(TAG, "lottie_start_preload");
                try {
                    bootImageBigPopView = new BootImageBigPopView(context, bootImageInfo, linkedSplashData, jSONObject);
                } catch (Throwable th) {
                    th = th;
                    bootImageBigPopView = null;
                }
                try {
                    bootImageBigPopView.setVisibility(8);
                    bootImageBigPopView.preload(a2);
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    return bootImageBigPopView;
                }
                return bootImageBigPopView;
            }
        }
        return null;
    }

    private static void recordLoadFail(LinkedSplashData linkedSplashData, BootImageInfo bootImageInfo, String str, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2e1229", new Object[]{linkedSplashData, bootImageInfo, str, new Integer(i), jSONObject});
        } else if (bootImageInfo == null) {
        } else {
            kej.a(TAG, "recordLoadFail:" + str);
            h.b("").b(i, bootImageInfo.isColdStart);
            ken.a(linkedSplashData, bootImageInfo, str, jSONObject);
        }
    }

    public BootImageBigPopView(Context context, BootImageInfo bootImageInfo, LinkedSplashData linkedSplashData, JSONObject jSONObject) {
        super(context);
        try {
            this.mBizData = jSONObject;
            this.mBootImageInfo = bootImageInfo;
            this.mSplashData = linkedSplashData;
            LayoutInflater.from(context).inflate(R.layout.bootimage_big_pop, this);
            this.mTopLayer = findViewById(R.id.bootimage_ad_top_layer);
            this.mTvSkip = (TextView) findViewById(R.id.bootimage_ad_pop_skip);
            this.mLottiePop = (LottieAnimationView) findViewById(R.id.bootimage_pop_lottie);
            this.mLottieMaxDuration = kel.k;
            setOnClickListener(this);
            this.mTvSkip.setOnClickListener(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void preload(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420af387", new Object[]{this, file});
            return;
        }
        try {
            this.mLottieInputStream = new FileInputStream(file);
            this.mLottiePop.setAnimation(this.mLottieInputStream, file.getName());
            this.mLottiePop.addLottieOnCompositionLoadedListener(this);
            this.mLottiePop.setFailureListener(this);
        } catch (Throwable th) {
            th.printStackTrace();
            kej.a(TAG, "lottie_preload_fail:" + th.getMessage());
        }
    }

    private void playEndAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2194844", new Object[]{this});
            return;
        }
        try {
            if (this.mLottieDuration <= 300) {
                kej.a(TAG, "lottie_duration_less_than_endDuration:" + this.mLottieDuration);
                close();
            } else if (this.mHasPlayEndAnim) {
            } else {
                kej.a(TAG, "play_end_anim");
                this.mHasPlayEndAnim = true;
                this.mTvSkip.setVisibility(8);
                this.mTopLayer.setVisibility(8);
                this.mEndAnimator = ObjectAnimator.ofFloat(this.mLottiePop, "alpha", 1.0f, 0.0f);
                this.mEndAnimator.setDuration(300L);
                this.mEndAnimator.addListener(this);
                this.mEndAnimator.start();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.airbnb.lottie.l
    public void onCompositionLoaded(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
            return;
        }
        kej.a(TAG, "lottie_preload_success");
        closeLottieStream();
        this.mHasLoadLottie = true;
        if (gVar == null) {
            return;
        }
        this.mLottieDuration = (int) gVar.e();
        Rect d = gVar.d();
        if (d == null) {
            return;
        }
        this.mLottieWidth = d.width();
        this.mLottieHeight = d.height();
    }

    @Override // com.airbnb.lottie.j
    public void onResult(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
            return;
        }
        kej.a(TAG, "playFail:" + th.getMessage());
        ken.b(this.mSplashData, this.mBootImageInfo, th.getMessage(), this.mBizData);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = this.mLottieDuration;
        if (i - (animatedFraction * i) > 300.0f) {
            return;
        }
        playEndAnimation();
    }

    private void closeLottieStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ca771e", new Object[]{this});
            return;
        }
        try {
            if (this.mLottieInputStream != null) {
                this.mLottieInputStream.close();
            }
        } catch (IOException e) {
            kej.a(TAG, "load_lottie_error:" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.mLottieInputStream = null;
        }
    }

    public boolean show(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("272dedfa", new Object[]{this, eVar})).booleanValue();
        }
        try {
            this.mPopPlayEndListener = eVar;
            if (this.mBootImageInfo == null) {
                return false;
            }
            kej.a(TAG, "duration=" + this.mLottieDuration + ";w=" + this.mLottieWidth + ";h=" + this.mLottieHeight + ";maxDuration=" + this.mLottieMaxDuration);
            if (!this.mHasLoadLottie) {
                recordLoadFail(this.mSplashData, this.mBootImageInfo, "lottie_has_not_load", 12, this.mBizData);
                return false;
            }
            if (this.mLottieDuration > 0 && this.mLottieDuration < this.mLottieMaxDuration) {
                if (this.mLottieWidth > 0 && this.mLottieHeight > 0) {
                    if (this.mIsShowing) {
                        kej.a(TAG, "isShowing");
                        return false;
                    }
                    kej.a(TAG, "startShow_lottie_url:" + this.mBootImageInfo.animationLottie);
                    this.mIsShowing = true;
                    setVisibility(0);
                    if (this.mLottiePop == null) {
                        return false;
                    }
                    this.mLottiePop.playAnimation();
                    this.mLottiePop.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.taobao.bootimage.interact.pop.BootImageBigPopView.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            kej.a(BootImageBigPopView.TAG, "auto_close");
                            BootImageBigPopView.this.close();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                                return;
                            }
                            kej.a(BootImageBigPopView.TAG, "cancel");
                            BootImageBigPopView.this.close();
                        }
                    });
                    this.mLottiePop.addAnimatorUpdateListener(this);
                    h.b("").c(this.mBootImageInfo.isColdStart);
                    ken.a(this.mSplashData, this.mBootImageInfo, this.mLottieDuration, this.mLottieWidth, this.mLottieHeight, this.mBizData);
                    if (this.mExitHandler == null) {
                        this.mExitHandler = new Handler(Looper.getMainLooper());
                        this.mExitHandler.postDelayed(new Runnable() { // from class: com.taobao.bootimage.interact.pop.BootImageBigPopView.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                kej.a(BootImageBigPopView.TAG, "force_close");
                                BootImageBigPopView.this.close();
                            }
                        }, this.mLottieDuration + 100);
                    }
                    return true;
                }
                LinkedSplashData linkedSplashData = this.mSplashData;
                BootImageInfo bootImageInfo = this.mBootImageInfo;
                recordLoadFail(linkedSplashData, bootImageInfo, "lottie_size_check_fail:width=" + this.mLottieWidth + ";height=" + this.mLottieHeight, 12, this.mBizData);
                return false;
            }
            recordLoadFail(this.mSplashData, this.mBootImageInfo, "lottie_duration_error", 12, this.mBizData);
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.mHasClose) {
            kej.a(TAG, "close filter");
        } else {
            this.mHasClose = true;
            this.mIsShowing = false;
            try {
                kej.a(TAG, "close");
                closeLottieStream();
                if (this.mExitHandler != null) {
                    this.mExitHandler.removeCallbacksAndMessages(null);
                    this.mExitHandler = null;
                }
                if (this.mLottiePop != null && this.mLottiePop.isAnimating()) {
                    this.mLottiePop.cancelAnimation();
                }
                if (this.mEndAnimator != null && this.mEndAnimator.isRunning()) {
                    this.mEndAnimator.cancel();
                }
                if (this.mLottiePop != null) {
                    this.mLottiePop.setVisibility(8);
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    kej.a(TAG, "close:" + th.getMessage());
                    e eVar = this.mPopPlayEndListener;
                    if (eVar == null) {
                        return;
                    }
                    eVar.a();
                    this.mPopPlayEndListener = null;
                } finally {
                    e eVar2 = this.mPopPlayEndListener;
                    if (eVar2 != null) {
                        eVar2.a();
                        this.mPopPlayEndListener = null;
                    }
                }
            }
        }
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : this.mIsShowing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        close();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        kej.a(TAG, "EndAnimation onAnimationEnd");
        close();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            return;
        }
        kej.a(TAG, "EndAnimation onAnimationCancel");
        close();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        try {
            if (view.getId() != R.id.bootimage_ad_pop_skip) {
                return;
            }
            kej.a(TAG, "click_play_end_anim");
            h.b("").b(3, this.mBootImageInfo.isColdStart);
            ken.a(this.mSplashData, this.mBootImageInfo, this.mBizData);
            playEndAnimation();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
