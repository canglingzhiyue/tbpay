package com.taobao.oversea.baobao.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Typeface;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HGifView;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public class BaobaoProgress extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView addTx;
    private TextView badgeTx;
    private TextView contentTx;
    private int curCount;
    private float curProgress;
    private String currency;
    private HGifView finishGif;
    private String freeShipFormat;
    private String fullPic;
    private String fullPicGif;
    private TUrlImageView icon;
    private boolean isGrey;
    private float mAp;
    private float mApScale;
    private float maxValue;
    private String muchMoreFormat;
    private int preCount;
    private float preProgress;
    private CircleProgressBar progressBar;
    private FrameLayout rootView;

    public static /* synthetic */ Object ipc$super(BaobaoProgress baobaoProgress, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ TUrlImageView access$000(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("5383f661", new Object[]{baobaoProgress}) : baobaoProgress.icon;
    }

    public static /* synthetic */ TextView access$100(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("14d92ace", new Object[]{baobaoProgress}) : baobaoProgress.contentTx;
    }

    public static /* synthetic */ boolean access$200(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a40eefd", new Object[]{baobaoProgress})).booleanValue() : baobaoProgress.isGrey;
    }

    public static /* synthetic */ String access$300(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8c436a08", new Object[]{baobaoProgress}) : baobaoProgress.fullPicGif;
    }

    public static /* synthetic */ HGifView access$400(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HGifView) ipChange.ipc$dispatch("c3f2248f", new Object[]{baobaoProgress}) : baobaoProgress.finishGif;
    }

    public static /* synthetic */ String access$500(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("529ad08a", new Object[]{baobaoProgress}) : baobaoProgress.fullPic;
    }

    public static /* synthetic */ float access$600(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2aee965", new Object[]{baobaoProgress})).floatValue() : baobaoProgress.preProgress;
    }

    public static /* synthetic */ float access$602(BaobaoProgress baobaoProgress, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cda40fdd", new Object[]{baobaoProgress, new Float(f)})).floatValue();
        }
        baobaoProgress.preProgress = f;
        return f;
    }

    public static /* synthetic */ float access$700(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcca6804", new Object[]{baobaoProgress})).floatValue() : baobaoProgress.curProgress;
    }

    public static /* synthetic */ int access$800(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6e5e6a6", new Object[]{baobaoProgress})).intValue() : baobaoProgress.preCount;
    }

    public static /* synthetic */ int access$802(BaobaoProgress baobaoProgress, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("204cc5a5", new Object[]{baobaoProgress, new Integer(i)})).intValue();
        }
        baobaoProgress.preCount = i;
        return i;
    }

    public static /* synthetic */ int access$900(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1016545", new Object[]{baobaoProgress})).intValue() : baobaoProgress.curCount;
    }

    private int ap(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccf6ad3d", new Object[]{this, new Float(f)})).intValue() : (int) ((this.mAp * f * this.mApScale) + 0.5f);
    }

    private String roundFloat(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73e07895", new Object[]{this, new Float(f)});
        }
        if (f < 0.1f && f > 0.0f) {
            return "0.1";
        }
        if (Build.VERSION.SDK_INT < 24) {
            DecimalFormat decimalFormat = new DecimalFormat("0.#");
            decimalFormat.setRoundingMode(RoundingMode.UP);
            return decimalFormat.format(f);
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        return numberInstance.format(f);
    }

    public BaobaoProgress(Context context) {
        super(context);
        this.maxValue = 0.0f;
        this.preProgress = 0.0f;
        this.preCount = 0;
        this.curProgress = 0.0f;
        this.curCount = 0;
        this.mAp = 0.0f;
        this.mApScale = 1.0f;
        this.currency = "￥";
        this.mAp = Resources.getSystem().getDisplayMetrics().widthPixels / 375.0f;
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.rootView = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ap(72.0f), ap(72.0f));
        layoutParams.setMargins(ap(8.0f), ap(20.0f), ap(8.0f), ap(8.0f));
        addView(this.rootView, layoutParams);
        this.progressBar = new CircleProgressBar(context, this.mAp * this.mApScale);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.progressBar.setPadding(ap(4.0f), ap(4.0f), ap(4.0f), ap(4.0f));
        this.rootView.addView(this.progressBar, 0, layoutParams2);
        this.icon = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(ap(34.0f), ap(34.0f));
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = ap(10.0f);
        this.rootView.addView(this.icon, layoutParams3);
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = ap(43.0f);
        this.contentTx = new TextView(context);
        this.contentTx.setTextSize(1, 8.0f);
        this.contentTx.setTextColor(-8761088);
        this.contentTx.setGravity(17);
        try {
            this.contentTx.setTypeface(Typeface.createFromAsset(context.getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Md.ttf"));
        } catch (Exception unused) {
        }
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 1;
        layoutParams5.topMargin = ap(2.0f);
        frameLayout2.addView(this.contentTx, layoutParams5);
        this.finishGif = new HGifView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(ap(39.0f), ap(12.0f));
        layoutParams6.gravity = 1;
        frameLayout2.addView(this.finishGif, layoutParams6);
        this.rootView.addView(frameLayout2, layoutParams4);
        this.badgeTx = new TextView(context);
        this.badgeTx.setTextSize(1, 9.0f);
        this.badgeTx.setTextColor(-1);
        this.badgeTx.getPaint().setFakeBoldText(true);
        this.badgeTx.setGravity(17);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(ap(17.5f), ap(17.5f));
        layoutParams7.gravity = 53;
        layoutParams7.rightMargin = ap(4.0f);
        layoutParams7.topMargin = ap(4.0f);
        this.rootView.addView(this.badgeTx, layoutParams7);
        this.addTx = new TextView(context);
        this.addTx.setTextSize(1, 16.8f);
        this.addTx.setTextColor(-1);
        this.addTx.setGravity(17);
        this.addTx.setText("+1");
        this.addTx.setAlpha(0.0f);
        this.addTx.setTranslationY(ap(10.0f));
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams8.gravity = 53;
        layoutParams8.rightMargin = ap(10.0f);
        layoutParams8.topMargin = ap(10.0f);
        addView(this.addTx, 0, layoutParams8);
    }

    public void init(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cfb90e", new Object[]{this, map});
            return;
        }
        int parseColor = Color.parseColor(map.get("processBaseColor"));
        int parseColor2 = Color.parseColor(map.get("processColor"));
        this.currency = map.get("currency");
        this.preProgress = Float.parseFloat(String.valueOf(map.get("totalPrice"))) / 100.0f;
        this.preCount = Integer.parseInt(String.valueOf(map.get("totalQuantity")));
        this.maxValue = Float.parseFloat(String.valueOf(map.get("amount")));
        this.freeShipFormat = map.get("freeShipFormat");
        String str = this.freeShipFormat;
        this.freeShipFormat = str.replace("%@", this.currency + Math.round(this.maxValue));
        this.muchMoreFormat = map.get("muchMoreFormat");
        this.fullPic = map.get("fullPic");
        this.fullPicGif = map.get("fullPicGif");
        this.isGrey = "true".equals(map.get("isGrey"));
        this.progressBar.setProgressColor(parseColor2);
        this.progressBar.setProgressBackgroundColor(parseColor);
        this.progressBar.setMax(this.maxValue);
        this.progressBar.setProgress(this.preProgress);
        this.icon.setImageUrl(map.get("freePic"));
        if (BaobaoManager.b) {
            this.icon.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.1
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
                    BaobaoProgress.access$000(BaobaoProgress.this).post(new Runnable() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                BaobaoProgress.this.invalidate();
                            }
                        }
                    });
                    return false;
                }
            });
        }
        this.addTx.setTextColor(parseColor2);
        if (this.isGrey) {
            this.finishGif.setGifUrl(this.fullPic);
        } else {
            this.finishGif.setGifUrl(this.fullPicGif);
        }
        setState(this.preProgress, true);
        setBadge(this.preCount);
        this.finishGif.setBottomImage(this.fullPic);
        setGrey(this.isGrey);
        invalidate();
    }

    public void setState(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73decfea", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        float max = Math.max(this.maxValue - f, 0.0f);
        if (floatEqual(max, this.maxValue)) {
            this.contentTx.setText(this.freeShipFormat);
            this.finishGif.setVisibility(8);
        } else if (!z) {
            TextView textView = this.contentTx;
            String str = this.muchMoreFormat;
            textView.setText(str.replace("%@", this.currency + roundFloat(max)));
            this.contentTx.setVisibility(0);
            this.finishGif.setVisibility(8);
        } else if (max > 0.0f) {
            TextView textView2 = this.contentTx;
            String str2 = this.muchMoreFormat;
            textView2.setText(str2.replace("%@", this.currency + roundFloat(max)));
            this.contentTx.setVisibility(0);
            this.finishGif.setVisibility(8);
        } else {
            this.contentTx.setVisibility(8);
            this.finishGif.setGifUrl(this.fullPic);
            this.finishGif.setVisibility(0);
        }
        if (!BaobaoManager.b) {
            return;
        }
        invalidate();
    }

    public void setState(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfee82a", new Object[]{this, new Float(f)});
        } else {
            setState(f, false);
        }
    }

    public void setBadge(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fcb79b", new Object[]{this, new Integer(i)});
            return;
        }
        CircleProgressBar circleProgressBar = this.progressBar;
        if (i <= 0) {
            z = false;
        }
        circleProgressBar.setShowBadge(z);
        if (i <= 0) {
            this.badgeTx.setVisibility(4);
        } else if (i <= 9) {
            this.badgeTx.setVisibility(0);
            this.badgeTx.setText(String.valueOf(i));
        } else {
            this.badgeTx.setVisibility(0);
            this.badgeTx.setText("9+");
        }
    }

    public void update(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
            return;
        }
        this.curProgress = Float.parseFloat(String.valueOf(map.get("totalPrice"))) / 100.0f;
        this.curCount = Integer.parseInt(String.valueOf(map.get("totalQuantity")));
        if (floatEqual(this.curProgress, this.preProgress) && this.curCount == this.preCount) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a.a(this, 400, PropertyValuesHolder.ofFloat("ScaleX", 1.0f, 1.2f, 1.0f), PropertyValuesHolder.ofFloat("ScaleY", 1.0f, 1.2f, 1.0f)));
        CircleProgressBar circleProgressBar = this.progressBar;
        Animator a2 = a.a(circleProgressBar, 600, PropertyValuesHolder.ofFloat("Progress", circleProgressBar.getProgress(), this.curProgress));
        arrayList.add(a2);
        final Animator a3 = a.a(this, 200, PropertyValuesHolder.ofInt("Badge", this.preCount, this.curCount));
        a2.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                } else {
                    a3.start();
                }
            }
        });
        if (this.curCount > this.preCount) {
            final Animator a4 = a.a(this.addTx, 600, PropertyValuesHolder.ofFloat("Alpha", 0.4f, 0.9f, 1.0f, 1.0f, 0.5f, 0.0f), PropertyValuesHolder.ofFloat("TranslationY", ap(10.0f), ap(5.0f), ap(0.0f), ap(-8.0f), ap(-12.0f), ap(-15.0f)));
            ((ObjectAnimator) a4).setRepeatCount(Math.min((this.curCount - this.preCount) - 1, 1));
            a2.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    a4.setStartDelay(50L);
                    a4.start();
                }
            });
        }
        final Animator a5 = a.a(this, 1000, PropertyValuesHolder.ofFloat("State", this.preProgress, this.curProgress));
        if (!floatEqual(this.preProgress, this.curProgress)) {
            float f = this.preProgress;
            float f2 = this.maxValue;
            if (f < f2 || this.curProgress < f2) {
                a2.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                        } else {
                            a5.start();
                        }
                    }
                });
            }
        }
        float f3 = this.curProgress;
        float f4 = this.maxValue;
        if (f3 >= f4 && this.preProgress < f4) {
            final Animator a6 = a.a(this.contentTx, 200, PropertyValuesHolder.ofFloat("TranslationY", 0.0f, 0.0f, 0.0f, ap(-5.0f), -this.contentTx.getHeight()));
            a6.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    BaobaoProgress.access$100(BaobaoProgress.this).setVisibility(8);
                    BaobaoProgress.access$100(BaobaoProgress.this).setTranslationY(0.0f);
                    if (BaobaoProgress.access$200(BaobaoProgress.this)) {
                        BaobaoProgress.access$400(BaobaoProgress.this).setGifUrl(BaobaoProgress.access$500(BaobaoProgress.this));
                        BaobaoProgress.access$400(BaobaoProgress.this).setVisibility(0);
                        return;
                    }
                    BaobaoProgress.access$400(BaobaoProgress.this).setGifUrl(BaobaoProgress.access$300(BaobaoProgress.this));
                    BaobaoProgress.access$400(BaobaoProgress.this).setAlpha(0.0f);
                    BaobaoProgress.access$400(BaobaoProgress.this).setVisibility(0);
                }
            });
            final Animator a7 = a.a(this.finishGif, 2080, PropertyValuesHolder.ofFloat("Alpha", 0.0f, 0.6f, 0.8f, 0.9f, 1.0f, 1.0f, 1.0f, 1.0f));
            a7.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        BaobaoProgress.access$400(BaobaoProgress.this).setGifUrl(BaobaoProgress.access$500(BaobaoProgress.this));
                    }
                }
            });
            a5.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
                    } else {
                        a6.start();
                    }
                }
            });
            if (!this.isGrey) {
                a6.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
                        } else {
                            a7.start();
                        }
                    }
                });
            }
        }
        a.a(String.valueOf(hashCode()), arrayList, new Runnable() { // from class: com.taobao.oversea.baobao.view.BaobaoProgress.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BaobaoProgress baobaoProgress = BaobaoProgress.this;
                BaobaoProgress.access$602(baobaoProgress, BaobaoProgress.access$700(baobaoProgress));
                BaobaoProgress baobaoProgress2 = BaobaoProgress.this;
                BaobaoProgress.access$802(baobaoProgress2, BaobaoProgress.access$900(baobaoProgress2));
                BaobaoProgress baobaoProgress3 = BaobaoProgress.this;
                baobaoProgress3.setBadge(BaobaoProgress.access$800(baobaoProgress3));
                BaobaoProgress baobaoProgress4 = BaobaoProgress.this;
                baobaoProgress4.setState(BaobaoProgress.access$600(baobaoProgress4), true);
            }
        });
    }

    public static BaobaoProgress build(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaobaoProgress) ipChange.ipc$dispatch("3c116035", new Object[]{context});
        }
        BaobaoProgress baobaoProgress = new BaobaoProgress(context);
        baobaoProgress.initView(context);
        return baobaoProgress;
    }

    public void setGrey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57b596c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isGrey = z;
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            this.icon.setColorFilter(colorMatrixColorFilter);
            this.finishGif.getGifImageView().setColorFilter(colorMatrixColorFilter);
            this.finishGif.getBottomImageView().setColorFilter(colorMatrixColorFilter);
            this.progressBar.setGray(true);
            this.addTx.getPaint().setColorFilter(colorMatrixColorFilter);
        } else {
            this.icon.clearColorFilter();
            this.finishGif.getBottomImageView().clearColorFilter();
            this.finishGif.getGifImageView().clearColorFilter();
            this.progressBar.setGray(false);
            this.addTx.getPaint().setColorFilter(null);
        }
        this.addTx.invalidate();
    }

    private boolean floatEqual(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b9a5b03", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : Math.abs(f - f2) < 1.0E-6f;
    }
}
