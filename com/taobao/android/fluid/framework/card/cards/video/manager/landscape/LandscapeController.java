package com.taobao.android.fluid.framework.card.cards.video.manager.landscape;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.cards.video.manager.landscape.b;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.taobao.R;
import tb.hni;
import tb.kge;
import tb.obx;
import tb.ple;
import tb.plm;
import tb.psw;
import tb.sje;
import tb.sjq;
import tb.slm;
import tb.snv;
import tb.sod;
import tb.spz;

/* loaded from: classes5.dex */
public class LandscapeController implements SeekBar.OnSeekBarChangeListener, b.a, hni, plm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LandscapeController";
    private final snv b;
    private final sjq c;
    private final FluidContext d;
    private final Context e;
    private final String f;
    private final sod g;
    private final sje h;
    private boolean i;
    private FrameLayout j;
    private View k;
    private b m;
    private boolean n;
    private ImageView o;
    private ImageView p;
    private TextView q;
    private TextView r;
    private SeekBar s;

    /* renamed from: a */
    private final a$a f12500a = new a$a();
    private final Handler l = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (LandscapeController.a(LandscapeController.this) == null) {
            } else {
                LandscapeController.a(LandscapeController.this).setVisibility(8);
            }
        }
    };

    static {
        kge.a(-2009403573);
        kge.a(-896969833);
        kge.a(436183921);
        kge.a(-1967544404);
        kge.a(1120919262);
    }

    @Override // tb.plm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // tb.hni
    public void onLoopCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onPreCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoClose(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoComplete(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.hni
    public void onVideoPrepared(psw pswVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
        }
    }

    @Override // tb.hni
    public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
        }
    }

    @Override // tb.hni
    public void onVideoSeekTo(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    @Override // tb.hni
    public void onVideoStateChanged(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    public static /* synthetic */ View a(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bbdab2b0", new Object[]{landscapeController}) : landscapeController.k;
    }

    public static /* synthetic */ FrameLayout access$200(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("1b4c5cfc", new Object[]{landscapeController}) : landscapeController.j;
    }

    public static /* synthetic */ void access$300(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9749dc", new Object[]{landscapeController});
        } else {
            landscapeController.f();
        }
    }

    public static /* synthetic */ void access$500(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf5e21a", new Object[]{landscapeController});
        } else {
            landscapeController.c();
        }
    }

    public static /* synthetic */ b access$902(LandscapeController landscapeController, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f32054f2", new Object[]{landscapeController, bVar});
        }
        landscapeController.m = bVar;
        return bVar;
    }

    public LandscapeController(FluidContext fluidContext, Context context, sod sodVar, sje sjeVar, snv snvVar, sjq sjqVar, String str) {
        this.d = fluidContext;
        this.e = context;
        this.b = snvVar;
        this.c = sjqVar;
        this.f = str;
        this.g = sodVar;
        this.h = sjeVar;
    }

    @Override // tb.hni
    public void onVideoStart(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
        } else {
            g();
        }
    }

    @Override // tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
        } else {
            g();
        }
    }

    @Override // tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
        } else {
            g();
        }
    }

    @Override // tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.n) {
        } else {
            this.s.setMax(Math.max(i3, 0));
            this.s.setProgress(i);
            TextView textView = this.q;
            if (textView == null) {
                return;
            }
            textView.setText(slm.a(i));
            this.r.setText(slm.a(i3));
        }
    }

    @Override // com.taobao.android.fluid.framework.card.cards.video.manager.landscape.b.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        f();
        return true;
    }

    @Override // tb.plm
    public boolean onHandleBackKeyEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
        }
        f();
        return true;
    }

    public void b() {
        snv snvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.i || (snvVar = this.b) == null) {
        } else {
            this.f12500a.c(snvVar);
            final ViewGroup f = this.b.f();
            if (f == null) {
                return;
            }
            Context context = this.e;
            if (!(context instanceof Activity)) {
                return;
            }
            ViewGroup a2 = a((Activity) context);
            int a3 = obx.a(this.e);
            int width = a2.getWidth();
            int height = a2.getHeight() - a3;
            int width2 = f.getWidth();
            int height2 = f.getHeight();
            int[] iArr = new int[2];
            f.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            a2.getLocationOnScreen(iArr2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width2, height2, 17);
            layoutParams.leftMargin = iArr[0] - iArr2[0];
            spz.c(TAG, "mWidth:" + width2 + ",mHeight:" + height2 + ",topMargin:" + layoutParams.topMargin + ",normalLocation[1]:" + iArr[1] + ",decorViewLocation[1]:" + iArr2[1] + ",statusBarHeight:" + a3 + ",normalLocation[0]:" + iArr[0] + ",decorViewLocation[0]:" + iArr2[0]);
            ViewParent parent = f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(f);
            }
            FrameLayout frameLayout = this.j;
            if (frameLayout == null) {
                this.j = new FrameLayout(this.e);
                this.j.setClickable(true);
                this.j.setBackgroundResource(R.drawable.fluid_sdk_landscape_bg);
            } else {
                frameLayout.removeAllViews();
            }
            this.j.addView(f, layoutParams);
            ViewParent parent2 = this.j.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.j);
            }
            if (this.m == null) {
                this.m = new b(this.e);
                this.m.a(this);
            }
            this.m.setContentView(this.j, new ViewGroup.LayoutParams(-1, -1));
            this.m.show();
            final float f2 = height / this.c.h;
            float f3 = width / this.c.i;
            if (f2 > f3) {
                f2 = f3;
            }
            a(this.e);
            e();
            this.j.addView(this.k, new FrameLayout.LayoutParams(height, width, 17));
            this.k.setAlpha(1.0f);
            this.k.setVisibility(8);
            final Drawable background = this.j.getBackground();
            background.setAlpha(0);
            spz.c(TAG, "translationY= 0 statusBarHeight=" + a3 + " ; mFullHeight=" + width + " " + height);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f, "scaleX", 1.0f, f2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f, "scaleY", 1.0f, f2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f, "rotation", 0.0f, 90.0f);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(background, "alpha", 0, 255);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.k, "rotation", 0.0f, 90.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ofFloat3);
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2);
            animatorSet.play(ofInt);
            animatorSet.play(ofFloat4);
            animatorSet.start();
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$3
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
                    LandscapeController.access$200(LandscapeController.this).setTranslationY(0.0f);
                    f.setScaleX(f2);
                    f.setScaleY(f2);
                    f.setRotation(90.0f);
                    background.setAlpha(255);
                }
            });
            ple backKeyEventDetector = ((IBackEventService) this.d.getService(IBackEventService.class)).getBackKeyEventDetector();
            if (backKeyEventDetector != null) {
                backKeyEventDetector.b(this);
            }
            this.i = true;
            this.h.cM_();
        }
    }

    public void toggleScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
        } else if (this.i) {
            f();
        } else {
            b();
        }
    }

    private ViewGroup a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7373231b", new Object[]{this, activity}) : (ViewGroup) activity.getWindow().getDecorView();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.l.removeMessages(0);
        View view = this.k;
        if (view != null) {
            view.setVisibility(0);
        }
        this.l.sendEmptyMessageDelayed(0, 3000L);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.k != null) {
        } else {
            this.k = LayoutInflater.from(context).inflate(R.layout.fluid_sdk_landscape_video, (ViewGroup) null);
            this.k.findViewById(R.id.landscape_back).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    LandscapeController.access$300(LandscapeController.this);
                    LandscapeController landscapeController = LandscapeController.this;
                    com.taobao.android.fluid.business.usertrack.track.b.g(LandscapeController.$ipChange, true);
                }
            });
            this.p = (ImageView) this.k.findViewById(R.id.img_to_normal);
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    LandscapeController.access$300(LandscapeController.this);
                    LandscapeController landscapeController = LandscapeController.this;
                    com.taobao.android.fluid.business.usertrack.track.b.g(LandscapeController.$ipChange, false);
                }
            });
            this.o = (ImageView) this.k.findViewById(R.id.imv_play_pause);
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    LandscapeController.access$500(LandscapeController.this);
                    LandscapeController landscapeController = LandscapeController.this;
                    if (LandscapeController.$ipChange == null) {
                        return;
                    }
                    LandscapeController landscapeController2 = LandscapeController.this;
                    if (LandscapeController.$ipChange.e() == 1) {
                        LandscapeController landscapeController3 = LandscapeController.this;
                        LandscapeController.$ipChange.c();
                        LandscapeController landscapeController4 = LandscapeController.this;
                        FluidContext fluidContext = LandscapeController.$ipChange;
                        LandscapeController landscapeController5 = LandscapeController.this;
                        com.taobao.android.fluid.business.usertrack.track.b.c(fluidContext, LandscapeController.$ipChange);
                        return;
                    }
                    LandscapeController landscapeController6 = LandscapeController.this;
                    if (LandscapeController.$ipChange.e() == 2) {
                        LandscapeController landscapeController7 = LandscapeController.this;
                        LandscapeController.$ipChange.b();
                    } else {
                        LandscapeController landscapeController8 = LandscapeController.this;
                        LandscapeController.$ipChange.a();
                    }
                    LandscapeController landscapeController9 = LandscapeController.this;
                    com.taobao.android.fluid.business.usertrack.track.b.h(LandscapeController.$ipChange);
                }
            });
            this.q = (TextView) this.k.findViewById(R.id.current_time);
            this.r = (TextView) this.k.findViewById(R.id.total_time);
            this.s = (SeekBar) this.k.findViewById(R.id.seek_bar);
            this.s.setOnSeekBarChangeListener(this);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    LandscapeController landscapeController = LandscapeController.this;
                    if (LandscapeController.$ipChange.getVisibility() == 0) {
                        LandscapeController landscapeController2 = LandscapeController.this;
                        LandscapeController.$ipChange.setVisibility(8);
                        return;
                    }
                    LandscapeController.access$500(LandscapeController.this);
                    LandscapeController landscapeController3 = LandscapeController.this;
                    com.taobao.android.fluid.business.usertrack.track.b.i(LandscapeController.$ipChange);
                }
            });
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
        } else if (!this.n) {
        } else {
            this.q.setText(slm.a(i));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.n = true;
        this.l.removeMessages(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.n = false;
        if (this.b != null && seekBar != null) {
            this.b.a(seekBar.getProgress());
            this.b.b();
        }
        this.l.sendEmptyMessageDelayed(0, 3000L);
        FluidContext fluidContext = this.d;
        if (seekBar == null || !seekBar.isPressed()) {
            z = false;
        }
        com.taobao.android.fluid.business.usertrack.track.b.h(fluidContext, z);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        g();
        this.g.a(this);
    }

    private void f() {
        snv snvVar;
        final ViewGroup f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.i || (snvVar = this.b) == null || (f = snvVar.f()) == null) {
        } else {
            Context context = this.e;
            if (!(context instanceof Activity)) {
                return;
            }
            final ViewGroup a2 = a((Activity) context);
            Drawable background = this.j.getBackground();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f, "scaleX", f.getScaleX(), 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f, "scaleY", f.getScaleY(), 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f, "rotation", 90.0f, 0.0f);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, -((((IContainerService) this.d.getService(IContainerService.class)).getActionBarHeight() - obx.a(this.e)) / 2.0f));
            ObjectAnimator ofInt = Build.VERSION.SDK_INT >= 19 ? ObjectAnimator.ofInt(background, "alpha", background.getAlpha(), 0) : ObjectAnimator.ofInt(background, "alpha", 255, 0);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.k, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.k, "rotation", 90.0f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.LandscapeController.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    LandscapeController.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        LandscapeController.access$200(LandscapeController.this).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ofFloat4, ofFloat3, ofFloat, ofFloat2, ofInt, ofFloat5, ofFloat6);
            animatorSet.start();
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$8
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
                    f.setTranslationY(0.0f);
                    f.setScaleX(1.0f);
                    f.setScaleY(1.0f);
                    f.setRotation(0.0f);
                    LandscapeController landscapeController = LandscapeController.this;
                    a$a a_a = LandscapeController.$ipChange;
                    LandscapeController landscapeController2 = LandscapeController.this;
                    a_a.a(LandscapeController.$ipChange);
                    if (LandscapeController.access$200(LandscapeController.this) != null) {
                        LandscapeController.access$200(LandscapeController.this).setTranslationY(0.0f);
                        a2.removeView(LandscapeController.access$200(LandscapeController.this));
                    }
                    LandscapeController landscapeController3 = LandscapeController.this;
                    if (LandscapeController.$ipChange == null) {
                        return;
                    }
                    LandscapeController landscapeController4 = LandscapeController.this;
                    LandscapeController.$ipChange.dismiss();
                    LandscapeController.access$902(LandscapeController.this, null);
                }
            });
            ple backKeyEventDetector = ((IBackEventService) this.d.getService(IBackEventService.class)).getBackKeyEventDetector();
            if (backKeyEventDetector != null) {
                backKeyEventDetector.a(this);
            }
            this.f12500a.b(this.b);
            this.g.b(this);
            this.i = false;
            this.h.b();
        }
    }

    private void g() {
        snv snvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.o == null || (snvVar = this.b) == null) {
        } else {
            if (snvVar.e() == 1) {
                this.o.getDrawable().setLevel(1);
            } else {
                this.o.getDrawable().setLevel(2);
            }
        }
    }
}
