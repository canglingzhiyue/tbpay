package com.taobao.bootimage.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.BootImageInfoManager;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.bootimage.d;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.interact.pop.BootImageBigPopView;
import com.taobao.bootimage.interact.pop.e;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.h;
import com.taobao.bootimage.view.FilletLinearLayout;
import com.taobao.bootimage.view.c;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import tb.alj;
import tb.kdx;
import tb.kej;
import tb.kek;
import tb.kem;
import tb.keo;
import tb.keq;
import tb.kes;
import tb.kge;
import tb.kpx;

/* loaded from: classes6.dex */
public class BootImageActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_FILL_CONTENT = "action.fill.splash.content";
    public static final String PARAM_BOOT_IMAGE_INFO = "bootImageInfo";

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f16652a;
    private ViewGroup b;
    private ViewGroup c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private View i;
    private View j;
    private SystemBarDecorator k;
    private c l;
    private BootImageInfo m;
    private SplashInteractData n;
    private Handler o;
    private String p;
    private boolean q = false;
    private boolean r = false;
    private BootImageBigPopView s;
    private keq t;
    private h u;

    static {
        kge.a(595543409);
    }

    public static /* synthetic */ Object ipc$super(BootImageActivity bootImageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -801135301:
                super.onUserLeaveHint();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public static /* synthetic */ long a(BootImageActivity bootImageActivity, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd9ee6a2", new Object[]{bootImageActivity, bootImageInfo})).longValue() : bootImageActivity.a(bootImageInfo);
    }

    public static /* synthetic */ ViewGroup a(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("1801b9cd", new Object[]{bootImageActivity}) : bootImageActivity.b;
    }

    public static /* synthetic */ BootImageBigPopView a(BootImageActivity bootImageActivity, BootImageBigPopView bootImageBigPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageBigPopView) ipChange.ipc$dispatch("a3fad068", new Object[]{bootImageActivity, bootImageBigPopView});
        }
        bootImageActivity.s = bootImageBigPopView;
        return bootImageBigPopView;
    }

    public static /* synthetic */ void a(BootImageActivity bootImageActivity, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e15453a", new Object[]{bootImageActivity, str, str2, str3, str4, str5});
        } else {
            bootImageActivity.a(str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ boolean a(BootImageActivity bootImageActivity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd19716", new Object[]{bootImageActivity, str})).booleanValue() : bootImageActivity.a(str);
    }

    public static /* synthetic */ ImageView b(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("2ab6f389", new Object[]{bootImageActivity}) : bootImageActivity.d;
    }

    public static /* synthetic */ String c(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("141e24da", new Object[]{bootImageActivity}) : bootImageActivity.p;
    }

    public static /* synthetic */ h d(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("e5fb5c6b", new Object[]{bootImageActivity}) : bootImageActivity.u;
    }

    public static /* synthetic */ boolean e(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc3ca9c8", new Object[]{bootImageActivity})).booleanValue() : bootImageActivity.a();
    }

    public static /* synthetic */ boolean f(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6582867", new Object[]{bootImageActivity})).booleanValue() : bootImageActivity.r;
    }

    public static /* synthetic */ BootImageBigPopView g(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageBigPopView) ipChange.ipc$dispatch("9c90d312", new Object[]{bootImageActivity}) : bootImageActivity.s;
    }

    public static /* synthetic */ Handler h(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8aa83b85", new Object[]{bootImageActivity}) : bootImageActivity.o;
    }

    public static /* synthetic */ void j(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec622df", new Object[]{bootImageActivity});
        } else {
            bootImageActivity.e();
        }
    }

    public static /* synthetic */ ViewGroup k(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2012aad7", new Object[]{bootImageActivity}) : bootImageActivity.c;
    }

    public static /* synthetic */ ImageView l(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("724fca13", new Object[]{bootImageActivity}) : bootImageActivity.e;
    }

    public static /* synthetic */ ImageView m(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("7978ac54", new Object[]{bootImageActivity}) : bootImageActivity.h;
    }

    public static /* synthetic */ SplashInteractData n(BootImageActivity bootImageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SplashInteractData) ipChange.ipc$dispatch("71bd7577", new Object[]{bootImageActivity}) : bootImageActivity.n;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_BootImage);
        try {
            super.onCreate(bundle);
            Intent intent = getIntent();
            if (intent.getStringExtra(PARAM_BOOT_IMAGE_INFO) == null) {
                return;
            }
            this.k = new SystemBarDecorator(this);
            this.k.enableImmersiveStatusBar();
            final BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(intent.getStringExtra(PARAM_BOOT_IMAGE_INFO), BootImageInfo.class);
            this.n = BootImageInfoManager.c;
            if (bootImageInfo != null) {
                bootImageInfo.isColdStart = false;
            }
            this.m = bootImageInfo;
            this.p = intent.getStringExtra("pageName");
            this.u = h.a(this.p);
            this.t = this.u.h();
            this.f16652a = new FrameLayout(this);
            this.b = new FrameLayout(this);
            this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.b.setVisibility(4);
            this.f16652a.addView(this.b);
            this.d = new ImageView(this);
            this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.d.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f16652a.addView(this.d);
            setContentView(this.f16652a);
            this.o = new Handler();
            this.l = kek.a(bootImageInfo, this.f16652a.getContext(), this.b);
            String str = "";
            final String str2 = (bootImageInfo == null || TextUtils.isEmpty(bootImageInfo.bizType)) ? str : bootImageInfo.bizType;
            if (bootImageInfo != null && !TextUtils.isEmpty(bootImageInfo.sceneType)) {
                str = bootImageInfo.sceneType;
            }
            final String str3 = str;
            if (this.l == null) {
                a(str3, str2, keq.EXPOSE_ERROR, keq.CODE_VIEW_CREATE_FAIL, "BootImageContent null");
                return;
            }
            if (!kek.a(bootImageInfo, false) && (imageView = this.d) != null) {
                imageView.setVisibility(8);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    this.d.setImageResource(R.drawable.splash);
                }
            }
            this.l.d = new c.a() { // from class: com.taobao.bootimage.activity.BootImageActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.bootimage.view.c.a
                public void b(String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str4});
                    }
                }

                @Override // com.taobao.bootimage.view.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    kej.a("BootImageActivity", "BootImageContentListener onSuccess");
                    BootImageActivity.a(BootImageActivity.this, str3, str2, keq.EXPOSE_SUCCESS, (String) null, "create view success");
                    BootImageActivity.a(BootImageActivity.this).setVisibility(0);
                    if (bootImageInfo == null) {
                        return;
                    }
                    BootImageDataMgr.a().a(bootImageInfo.itemId, true, null);
                    if (BootImageActivity.b(BootImageActivity.this) != null) {
                        BootImageActivity.b(BootImageActivity.this).setVisibility(8);
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("page", BootImageActivity.c(BootImageActivity.this));
                    alj.a().a(PopStrategy.IDENTIFIER_SPLASH, hashMap);
                    BootImageDataMgr.a().a(false);
                    BootImageActivity.d(BootImageActivity.this).f().a(bootImageInfo);
                    kej.a("BootImageActivity", "getFromType:" + bootImageInfo.getFromType());
                    kdx e = BootImageActivity.d(BootImageActivity.this).e();
                    if (bootImageInfo.getFromType() == BootImageInfo.FromType.COMMERCIALAD) {
                        e.d();
                    } else {
                        e.c();
                    }
                    BootImageActivity bootImageActivity = BootImageActivity.this;
                    BootImageActivity.a(bootImageActivity, BootImageBigPopView.preBuildBigLottie(bootImageActivity, bootImageInfo, h.b(BootImageActivity.c(bootImageActivity)).b(), "", null));
                }

                @Override // com.taobao.bootimage.view.c.a
                public void a(String str4) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                        return;
                    }
                    kej.a("BootImageActivity", "BootImageContentListener onClose:" + str4);
                    if (BootImageActivity.f(BootImageActivity.this)) {
                        BootImageActivity.this.finish();
                        return;
                    }
                    boolean e = BootImageActivity.e(BootImageActivity.this);
                    boolean a2 = BootImageActivity.a(BootImageActivity.this, str4);
                    if (BootImageActivity.g(BootImageActivity.this) == null || !BootImageActivity.g(BootImageActivity.this).isShowing()) {
                        z = false;
                    }
                    if (!e && !a2) {
                        BootImageActivity.this.finish();
                    }
                    if (z || BootImageActivity.h(BootImageActivity.this) == null) {
                        return;
                    }
                    BootImageActivity.h(BootImageActivity.this).postDelayed(new Runnable() { // from class: com.taobao.bootimage.activity.BootImageActivity.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                BootImageActivity.this.finish();
                            }
                        }
                    }, BootImageActivity.a(BootImageActivity.this, bootImageInfo));
                }

                @Override // com.taobao.bootimage.view.c.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    BootImageActivity.a(BootImageActivity.this, str3, str2, keq.EXPOSE_ERROR, String.valueOf(i), "");
                    BootImageActivity.j(BootImageActivity.this);
                    kej.a("BootImageActivity", "BootImageContentListener onError:" + i);
                    BootImageActivity.this.finish();
                }
            };
            if (!this.l.b()) {
                a(str3, str2, keq.EXPOSE_ERROR, keq.CODE_VIEW_CREATE_FAIL, "BootImageContent show fail");
                return;
            }
            ViewGroup viewGroup = this.l.g;
            if (viewGroup == null) {
                a(str3, str2, keq.EXPOSE_ERROR, keq.CODE_VIEW_CREATE_FAIL, "BootImageContent RootView null");
                return;
            }
            kej.a(kem.TAG, "bootImageMgr showContent success");
            this.b.addView(viewGroup);
            this.e = (ImageView) this.b.findViewById(R.id.boot_image_logo);
            this.f = (ImageView) this.b.findViewById(R.id.iv_taobao_logo);
            this.g = (ImageView) this.b.findViewById(R.id.icon_ipv6_logo);
            this.h = (ImageView) this.b.findViewById(R.id.show_image);
            this.i = this.b.findViewById(R.id.close);
            this.c = (ViewGroup) this.b.findViewById(R.id.animation_view_container);
            this.j = this.b.findViewById(R.id.boot_bg_view);
            if (keo.e() && this.n != null && bootImageInfo != null && bootImageInfo.animation && this.c != null) {
                kes.a().b(this.p);
            }
            h.b(this.p).a(false);
        } catch (Throwable unused) {
            finish();
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        kej.a("BootImageActivity", str5);
        this.t.a(str, "HotStart", str3, str2, str4, str5);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        kej.a("BootImageActivity", "finish()");
        overridePendingTransition(0, 0);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        kej.a("BootImageActivity", MessageID.onStop);
        this.r = true;
        e();
        finish();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03fa53b", new Object[]{this});
        } else {
            super.onUserLeaveHint();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        e();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (h.b(this.p).b() == null) {
        } else {
            getSupportFragmentManager().popBackStackImmediate();
        }
    }

    private boolean a() {
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!keo.e() || this.n == null || this.b.getVisibility() != 0 || (bootImageInfo = this.m) == null || !bootImageInfo.animation || this.c == null) {
            return false;
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.g;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        final InteractLocationData e = kes.a().e(this.p);
        if (e == null) {
            kej.a("BootImageActivity", "startScaleAnimator position is null");
            finish();
            return false;
        }
        final float d = kes.a().d(this.p);
        final int width = this.c.getWidth();
        final int i = e.width;
        final int height = this.c.getHeight();
        final int i2 = e.height;
        final float a2 = keo.a(this, 100.0f);
        ImageView imageView3 = this.e;
        final int height2 = imageView3 != null ? imageView3.getHeight() : 0;
        kej.a("BootImageActivity ", "startScaleAnimator  translationX: " + e.positionX + " translationY: " + e.positionY + " toX: " + e.width + " toY: " + e.height);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, "alpha", 1.0f, 0.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setDuration(500L);
        ofFloat.setDuration(100L);
        ofFloat.setStartDelay(400L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.bootimage.activity.BootImageActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3;
                int i4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BootImageActivity.k(BootImageActivity.this).getLayoutParams();
                int i5 = layoutParams.width;
                float floatValue = Float.valueOf(valueAnimator.getAnimatedValue().toString()).floatValue();
                layoutParams.width = i + ((int) ((width - i3) * floatValue));
                layoutParams.height = i2 + ((int) ((height - i4) * floatValue));
                BootImageActivity.k(BootImageActivity.this).setLayoutParams(layoutParams);
                int i6 = i5 - layoutParams.width;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                BootImageActivity.k(BootImageActivity.this).setX((e.positionX * animatedFraction) - (i6 / 2));
                BootImageActivity.k(BootImageActivity.this).setTranslationY(e.positionY * animatedFraction);
                int i7 = (height - layoutParams.height) / 2;
                if (BootImageActivity.l(BootImageActivity.this) != null && height2 > 0) {
                    ViewGroup.LayoutParams layoutParams2 = BootImageActivity.l(BootImageActivity.this).getLayoutParams();
                    int i8 = height2;
                    layoutParams2.height = i8 - i7 > 0 ? i8 - i7 : 0;
                    BootImageActivity.l(BootImageActivity.this).setLayoutParams(layoutParams2);
                }
                double d2 = floatValue;
                if (d2 < 0.5d && BootImageActivity.m(BootImageActivity.this) != null && (BootImageActivity.m(BootImageActivity.this).getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) BootImageActivity.m(BootImageActivity.this).getLayoutParams();
                    layoutParams3.setMargins(0, 0, 0, (int) ((d2 - 0.5d) * 2.0d * a2));
                    BootImageActivity.m(BootImageActivity.this).setLayoutParams(layoutParams3);
                }
                if (!(BootImageActivity.k(BootImageActivity.this) instanceof FilletLinearLayout)) {
                    return;
                }
                float f = d;
                float f2 = 0.0f;
                if (f <= 0.0f) {
                    return;
                }
                int i9 = (int) (f * (1.0f - floatValue));
                FilletLinearLayout filletLinearLayout = (FilletLinearLayout) BootImageActivity.k(BootImageActivity.this);
                if (i9 > 0) {
                    f2 = i9;
                }
                filletLinearLayout.setCornerSize(f2);
            }
        });
        kes.a().a(this.p, this.n);
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.taobao.bootimage.activity.BootImageActivity.3
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
                } else {
                    kej.a("BootImageActivity", "AnimatorListener:onAnimationStart");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                kej.a("BootImageActivity", "AnimatorListener:onAnimationEnd");
                kes.a().b(BootImageActivity.c(BootImageActivity.this), BootImageActivity.n(BootImageActivity.this));
                BootImageActivity.this.finish();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                kej.a("BootImageActivity", "AnimatorListener:onAnimationCancel");
                kes.a().b(BootImageActivity.c(BootImageActivity.this), BootImageActivity.n(BootImageActivity.this));
                BootImageActivity.this.finish();
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        return true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        BootImageBigPopView bootImageBigPopView = this.s;
        if (bootImageBigPopView != null && !bootImageBigPopView.isShowing()) {
            this.s.show(new e() { // from class: com.taobao.bootimage.activity.BootImageActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.bootimage.interact.pop.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    kej.a("BootImageActivity", "bigPopShow:onEnd");
                    BootImageActivity.j(BootImageActivity.this);
                    BootImageActivity.this.finish();
                }
            });
            if (this.s.isShowing()) {
                this.b.addView(this.s);
            }
        }
        BootImageBigPopView bootImageBigPopView2 = this.s;
        return bootImageBigPopView2 != null && bootImageBigPopView2.isShowing();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.l;
        if (cVar == null || cVar.g == null) {
            return;
        }
        this.l.g.setVisibility(8);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.u.a()) {
            kej.a("BootImageActivity", "startLinkedSplashAnimator, orangeSwitch = false");
            return false;
        }
        LinkedSplashData b = h.b(this.p).b();
        boolean z = this.b.getVisibility() == 0;
        BootImageInfo bootImageInfo = this.m;
        boolean z2 = bootImageInfo != null && bootImageInfo.animation;
        boolean z3 = this.c != null;
        String b2 = b(str);
        if (TextUtils.isEmpty(b2)) {
            kej.a("BootImageActivity", "startLinkedSplashAnimator, return, convertFromAction failed, closeType = " + str);
            return false;
        }
        b.a aVar = new b.a();
        aVar.f16704a = b2;
        boolean a2 = h.b(this.p).a(aVar);
        if (a2 && b()) {
            c();
            return true;
        } else if (z && z2 && z3 && a2) {
            kej.a("BootImageActivity", "startLinkedSplashAnimator");
            d();
            Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.taobao.bootimage.activity.BootImageActivity.5
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
                        return;
                    }
                    kej.a("BootImageActivity", "AnimatorListener:onAnimationStart");
                    h.b(BootImageActivity.c(BootImageActivity.this)).e();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    kej.a("BootImageActivity", "AnimatorListener:onAnimationEnd");
                    h.b(BootImageActivity.c(BootImageActivity.this)).f();
                    BootImageActivity.j(BootImageActivity.this);
                    BootImageActivity.this.finish();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    kej.a("BootImageActivity", "AnimatorListener:onAnimationCancel");
                    h.b(BootImageActivity.c(BootImageActivity.this)).f();
                    BootImageActivity.j(BootImageActivity.this);
                    BootImageActivity.this.finish();
                }
            };
            ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.video_container);
            if (viewGroup != null) {
                ImageView imageView = new ImageView(this);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageDrawable(kpx.a(viewGroup));
                viewGroup.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
            a(this.c, this.j, aVar, this.m, animatorListener, b);
            return true;
        } else {
            kej.a("BootImageActivity", "Cannot animation.  isBootImgVisible: " + z + " shouldDoAnimation: " + z2 + " isAnimationContainerUsable: " + z3 + " shouldAnimate: " + a2);
            e();
            return false;
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (d.CLOSE_TYPE_SKIP.equals(str)) {
            return b.a.FROM_CLOSE;
        }
        if (!"other".equals(str)) {
            return null;
        }
        return b.a.FROM_FINISH;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(8);
    }

    private void a(final View view, View view2, final b.a aVar, BootImageInfo bootImageInfo, Animator.AnimatorListener animatorListener, LinkedSplashData linkedSplashData) {
        long j;
        long j2;
        int i;
        int i2;
        ObjectAnimator objectAnimator;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac0ad9d", new Object[]{this, view, view2, aVar, bootImageInfo, animatorListener, linkedSplashData});
            return;
        }
        final float f = aVar.f;
        final int width = view.getWidth();
        final int i4 = aVar.b;
        int height = view.getHeight();
        int i5 = aVar.c;
        final float a2 = keo.a(this, 100.0f);
        if (bootImageInfo.alphaAnimationDuration <= 0 || bootImageInfo.scaleAnimationDuration < bootImageInfo.alphaAnimationDuration) {
            j = 100;
            j2 = 500;
        } else {
            j2 = bootImageInfo.scaleAnimationDuration;
            j = bootImageInfo.alphaAnimationDuration;
        }
        if (linkedSplashData == null || !TextUtils.equals(linkedSplashData.getLinkedDataType(), "feeds")) {
            i = i5;
            i2 = height;
        } else {
            i = i5;
            i2 = height;
            j = 100;
            j2 = 500;
        }
        long j3 = j2 - j;
        kej.a("BootImageActivity", "startScaleAnimator: cornerRadius:" + f + "translationX:" + aVar.d + "translationY:" + aVar.e + "toX:" + aVar.b + "toY:" + aVar.c);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j3);
        ObjectAnimator objectAnimator2 = null;
        if (view2 != null) {
            objectAnimator = ofFloat;
            i3 = 2;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 0.6f, 0.0f);
            ofFloat2.setDuration(j);
            ofFloat2.setStartDelay(j3);
            objectAnimator2 = ofFloat2;
        } else {
            objectAnimator = ofFloat;
            i3 = 2;
        }
        float[] fArr = new float[i3];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
        ofFloat3.setDuration(j2);
        ofFloat3.setInterpolator(new DecelerateInterpolator());
        final int i6 = i;
        final int i7 = i2;
        ObjectAnimator objectAnimator3 = objectAnimator;
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.bootimage.activity.BootImageActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i8;
                int i9;
                float f2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                layoutParams.width = i4 + ((int) ((width - i8) * parseFloat));
                layoutParams.height = i6 + ((int) ((i7 - i9) * parseFloat));
                view.setLayoutParams(layoutParams);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                view.setX(aVar.d * animatedFraction);
                view.setTranslationY(aVar.e * animatedFraction);
                double d = parseFloat;
                if (d < 0.5d && BootImageActivity.m(BootImageActivity.this) != null && (BootImageActivity.m(BootImageActivity.this).getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) BootImageActivity.m(BootImageActivity.this).getLayoutParams();
                    layoutParams2.setMargins(0, 0, 0, (int) ((d - 0.5d) * 2.0d * a2));
                    BootImageActivity.m(BootImageActivity.this).setLayoutParams(layoutParams2);
                }
                View view3 = view;
                if (!(view3 instanceof FilletLinearLayout)) {
                    return;
                }
                if (f <= 0.0f) {
                    return;
                }
                ((FilletLinearLayout) view3).setCornerSize(Math.max((int) (f2 * (1.0f - parseFloat)), 0));
            }
        });
        ofFloat3.addListener(animatorListener);
        if (objectAnimator2 != null) {
            animatorSet.playTogether(objectAnimator3, ofFloat3, objectAnimator2);
        } else {
            animatorSet.playTogether(objectAnimator3, ofFloat3);
        }
        animatorSet.start();
    }

    private long a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75806d82", new Object[]{this, bootImageInfo})).longValue();
        }
        if (bootImageInfo != null && bootImageInfo.scaleAnimationDuration > 0) {
            return bootImageInfo.scaleAnimationDuration + 100;
        }
        return 510L;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.q) {
        } else {
            this.q = true;
            h.b(this.p).g();
        }
    }
}
