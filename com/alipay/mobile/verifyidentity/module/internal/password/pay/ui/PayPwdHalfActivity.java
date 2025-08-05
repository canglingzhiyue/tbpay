package com.alipay.mobile.verifyidentity.module.internal.password.pay.ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.APImageView;
import com.alipay.mobile.verifyidentity.ui.APScrollView;
import com.alipay.mobile.verifyidentity.ui.APTextView;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class PayPwdHalfActivity extends PayPwdCommonActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5912a = "PayPwdHalfActivity";
    private int b;
    private int c;
    private LinearLayout d;

    public static /* synthetic */ Object ipc$super(PayPwdHalfActivity payPwdHalfActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2012646654) {
            super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f5912a;
    }

    public static /* synthetic */ LinearLayout access$300(PayPwdHalfActivity payPwdHalfActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("c34b3516", new Object[]{payPwdHalfActivity}) : payPwdHalfActivity.d;
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity, com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        VerifyLogCat.i(f5912a, i.b.MEASURE_ONCREATE);
        if (this.mIsLogicInterrupted || getIntent() == null || getIntent().getExtras() == null) {
            return;
        }
        setContentView(R.layout.activity_paypwd_internal_half);
        this.pageStyle = BottomSheetComponentInterface.State.HALF;
        this.mRoot = findViewById(R.id.paypwd_bg);
        this.mWrapper = (APScrollView) findViewById(R.id.pwd_wrapper);
        if (this.mWrapper != null) {
            this.mWrapper.setVisibility(8);
        }
        this.d = (LinearLayout) findViewById(R.id.keyboard_layout);
        initViewHeight();
        initTitleBar();
        initSubtitle(false);
        initKeyBoard(this.d);
        initInput();
        initProgress();
        if (!this.isIpay) {
            initContent();
        }
        initGoOther();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (this.mWrapper == null || this.mWrapper.getVisibility() == 0) {
            VerifyLogCat.d(f5912a, "already visible");
        } else if (!z) {
        } else {
            getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PayPwdHalfActivity.access$000(PayPwdHalfActivity.this);
                    }
                }
            }, 100L);
        }
    }

    public void initViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484d0be3", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.b = displayMetrics.heightPixels;
        this.c = (this.b << 1) / 3;
        int dip2px = DensityUtil.dip2px(this, 400.0f);
        if (this.mWrapper == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mWrapper.getLayoutParams();
        int i = this.c;
        if (i <= dip2px) {
            i = dip2px;
        }
        this.mViewHeight = i;
        String str = f5912a;
        VerifyLogCat.d(str, "mScreenHeight: " + this.b + ", mViewReckonedHeight: " + this.c + ", minHeight: " + dip2px + ", mViewHeight: " + this.mViewHeight);
        layoutParams.height = this.mViewHeight;
        this.mWrapper.setLayoutParams(layoutParams);
    }

    public void initTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c402d2", new Object[]{this});
            return;
        }
        this.mTitle = (APTextView) findViewById(R.id.paypwd_title);
        this.mBack = (APImageView) findViewById(R.id.paypwd_back);
        this.mBack.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                PayPwdHalfActivity payPwdHalfActivity = PayPwdHalfActivity.this;
                payPwdHalfActivity.alert("", payPwdHalfActivity.getLocaleStringResource(R.string.sg_pwd_alert_tip), PayPwdHalfActivity.this.getLocaleStringResource(R.string.sg_pwd_alert_ok), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        PayPwdHalfActivity.this.notifyCancel("102");
                        PayPwdHalfActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-2", "USER_CLICK_BACK", "wallet_macao");
                    }
                }, PayPwdHalfActivity.this.getLocaleStringResource(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.5.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        }
                    }
                });
            }
        });
        if (getIntent() == null || getIntent().getExtras() == null) {
            return;
        }
        String string = getIntent().getExtras().getString("title");
        if (!TextUtils.isEmpty(string)) {
            this.mTitle.setText(string);
        } else {
            this.mTitle.setText(getLocaleStringResource(R.string.sg_pwd_default_title));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5912a, "animation down");
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_pwd_down);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    PayPwdHalfActivity.this.mBack.performClick();
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setFillAfter(true);
        if (this.mRoot != null) {
            this.mRoot.setVisibility(0);
            this.mRoot.startAnimation(alphaAnimation);
        }
        if (this.mWrapper == null) {
            return;
        }
        this.mWrapper.startAnimation(loadAnimation);
    }

    public static /* synthetic */ void access$000(PayPwdHalfActivity payPwdHalfActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54e5a22", new Object[]{payPwdHalfActivity});
            return;
        }
        VerifyLogCat.d(f5912a, "animation up");
        payPwdHalfActivity.mWrapper.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(payPwdHalfActivity, R.anim.anim_pwd_up);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                PayPwdHalfActivity.access$300(PayPwdHalfActivity.this).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("df7e7eb3", new Object[]{this});
                            return;
                        }
                        VerifyLogCat.d(PayPwdHalfActivity.access$100(), "mKeyBoardLayout onGlobalLayout");
                        PayPwdHalfActivity.access$200(PayPwdHalfActivity.this);
                    }
                });
                PayPwdHalfActivity.this.showKeyBoardDelay(200L);
            }
        });
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, 2130706432);
        ofObject.setDuration(200L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (PayPwdHalfActivity.this.mRoot == null) {
                } else {
                    PayPwdHalfActivity.this.mRoot.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        payPwdHalfActivity.mRoot.setVisibility(0);
        ofObject.start();
        payPwdHalfActivity.mWrapper.startAnimation(loadAnimation);
    }

    public static /* synthetic */ void access$200(PayPwdHalfActivity payPwdHalfActivity) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39b78e0", new Object[]{payPwdHalfActivity});
            return;
        }
        int[] iArr = new int[2];
        payPwdHalfActivity.d.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        VerifyLogCat.d(f5912a, "getReferenceViewHeight");
        if (payPwdHalfActivity.mOther.getVisibility() == 0) {
            payPwdHalfActivity.mOther.getLocationInWindow(iArr2);
            height = payPwdHalfActivity.mOther.getHeight();
        } else {
            payPwdHalfActivity.mPwdInputLayout.getLocationInWindow(iArr2);
            height = payPwdHalfActivity.mPwdInputLayout.getHeight();
        }
        int i = ((height + 10) + iArr2[1]) - iArr[1];
        String str = f5912a;
        VerifyLogCat.d(str, "keyBoardPosition[0]:" + iArr[0] + ", keyBoardPosition[1]: " + iArr[1] + "position[0]:" + iArr2[0] + "position[1]:" + iArr2[1] + ", referenceViewHeigh: " + height + ", coverHeight: " + i);
        ViewGroup.LayoutParams layoutParams = payPwdHalfActivity.mWrapper.getLayoutParams();
        if (i > 0) {
            layoutParams.height = payPwdHalfActivity.mWrapper.getHeight() + i;
            payPwdHalfActivity.mWrapper.setLayoutParams(layoutParams);
        } else if (i >= 0 || layoutParams.height == payPwdHalfActivity.mViewHeight) {
        } else {
            String str2 = f5912a;
            VerifyLogCat.d(str2, "lp.height + coverHeight: " + layoutParams.height + i + ", mViewHeight: " + payPwdHalfActivity.mViewHeight);
            layoutParams.height = payPwdHalfActivity.mViewHeight;
            payPwdHalfActivity.mWrapper.setLayoutParams(layoutParams);
        }
    }
}
