package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.h;
import com.taobao.phenix.animate.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.phenix.request.d;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kej;
import tb.kek;
import tb.ken;
import tb.kge;
import tb.stu;

/* loaded from: classes7.dex */
public abstract class BootImageInteractNaitveSlideView extends BootImageInteractSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BootImageInteractNaitveSlideView";
    private TUrlImageView mCardImageView;
    private TUrlImageView mGuideImageView;
    public FrameLayout mInteractCardContainer;
    public RelativeLayout mInteractCardDefaultContainer;
    private TextView mSlideActionView;
    private View mSlideAnimContainer;
    private TUrlImageView mSlideAnimView;
    private View mSlideDefaultContainer;

    static {
        kge.a(-459317782);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2023236405:
                return new Boolean(super.showWithAnim((Animation.AnimationListener) objArr[0]));
            case -1383171873:
                super.stopInteract();
                return null;
            case -483678593:
                super.close();
                return null;
            case -340027128:
                return new Boolean(super.show());
            case 2144052543:
                super.startInteract();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract int getInteractCartLayoutId();

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public abstract void renderDefaultCard();

    public static /* synthetic */ TUrlImageView access$000(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("c0e7480", new Object[]{bootImageInteractNaitveSlideView}) : bootImageInteractNaitveSlideView.mGuideImageView;
    }

    public static /* synthetic */ boolean access$100(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87206641", new Object[]{bootImageInteractNaitveSlideView})).booleanValue() : bootImageInteractNaitveSlideView.loadAndShowDefaultSlideView();
    }

    public static /* synthetic */ TUrlImageView access$200(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("bd3058be", new Object[]{bootImageInteractNaitveSlideView}) : bootImageInteractNaitveSlideView.mCardImageView;
    }

    public static /* synthetic */ void access$300(BootImageInteractNaitveSlideView bootImageInteractNaitveSlideView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65569e9", new Object[]{bootImageInteractNaitveSlideView, context});
        } else {
            bootImageInteractNaitveSlideView.loadAndShowDefaultCardView(context);
        }
    }

    public BootImageInteractNaitveSlideView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        try {
            LayoutInflater.from(context).inflate(R.layout.bootimage_interact, this);
            this.mInteractClickContainer = (LinearLayout) findViewById(R.id.bootimage_interact_click_container);
            initGuideLayout(bootImageInfo);
            initCardLayout(context, bootImageInfo);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initGuideLayout(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f241f9", new Object[]{this, bootImageInfo});
            return;
        }
        if (bootImageInfo != null) {
            try {
                if (!bootImageInfo.isGestureViewHide()) {
                    kej.a(TAG, "initGuideLayout");
                    this.mSlideAnimContainer = findViewById(R.id.bootimage_interact_slide_container);
                    this.mSlideDefaultContainer = findViewById(R.id.bootimage_interact_default_slide_container);
                    this.mSlideAnimView = (TUrlImageView) findViewById(R.id.bootimage_slide_anim_view);
                    this.mSlideActionView = (TextView) findViewById(R.id.bootimage_slide_tips);
                    this.mSlideActionView.setText(getSlideActionText());
                    if (!StringUtils.isEmpty(bootImageInfo.gestureImage)) {
                        this.mGuideImageView = (TUrlImageView) findViewById(R.id.bootimage_interact_guide_img);
                        String a2 = stu.a(bootImageInfo.gestureImage);
                        if (!StringUtils.isEmpty(a2)) {
                            kej.a(TAG, "initGuideLayout guidePath = " + a2);
                            setShowInteractGuideImage("1");
                            loadApngImage(a2, this.mGuideImageView, new a<SuccPhenixEvent>() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView.1
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
                                    kej.a(BootImageInteractNaitveSlideView.TAG, "initGuideLayout loadApngImage succPhenixEvent");
                                    if (BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this) != null) {
                                        BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this).setVisibility(0);
                                    }
                                    return false;
                                }
                            }, new a<FailPhenixEvent>() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView.2
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
                                    kej.a(BootImageInteractNaitveSlideView.TAG, "initGuideLayout loadApngImage failPhenixEvent");
                                    if (BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this) != null) {
                                        BootImageInteractNaitveSlideView.access$000(BootImageInteractNaitveSlideView.this).setVisibility(8);
                                    }
                                    BootImageInteractNaitveSlideView.access$100(BootImageInteractNaitveSlideView.this);
                                    return false;
                                }
                            });
                            return;
                        }
                        kej.a(TAG, "initGuideLayout guidePath == null");
                        if (this.mGuideImageView != null) {
                            this.mGuideImageView.setVisibility(8);
                        }
                        loadAndShowDefaultSlideView();
                        return;
                    }
                    kej.a(TAG, "initGuideLayout bootImageInfo.gestureImage == null");
                    loadAndShowDefaultSlideView();
                    return;
                }
            } catch (Throwable th) {
                kej.a(TAG, "initGuideLayout", th);
                return;
            }
        }
        kej.a(TAG, "initGuideLayout 无数据或者不展示引导层");
        setShowInteractGuideImage("");
    }

    private void initCardLayout(final Context context, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1444ff", new Object[]{this, context, bootImageInfo});
        } else if (bootImageInfo == null) {
        } else {
            try {
                kej.a(TAG, "initCardLayout");
                this.mInteractCardContainer = (FrameLayout) findViewById(R.id.bootimage_interact_card_container);
                this.mInteractCardContainer.setVisibility(0);
                if (!StringUtils.isEmpty(bootImageInfo.interactImage)) {
                    this.mCardImageView = (TUrlImageView) findViewById(R.id.bootimage_interact_card_img);
                    String a2 = stu.a(bootImageInfo.interactImage);
                    kej.a(TAG, "initCardLayout cardPath = " + a2);
                    if (!StringUtils.isEmpty(a2)) {
                        setShowInteractCardImage("1");
                        loadApngImage(a2, this.mCardImageView, new a<SuccPhenixEvent>() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView.3
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
                                kej.a(BootImageInteractNaitveSlideView.TAG, "initCardLayout succPhenixEvent");
                                if (BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this) != null) {
                                    BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this).setVisibility(0);
                                }
                                if (succPhenixEvent != null) {
                                    try {
                                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                                        if (drawable != null && (drawable instanceof b)) {
                                            ((b) drawable).a(1);
                                        }
                                    } catch (Throwable th) {
                                        kej.a(BootImageInteractNaitveSlideView.TAG, "initCardLayout succPhenixEvent error ", th);
                                    }
                                }
                                return false;
                            }
                        }, new a<FailPhenixEvent>() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView.4
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
                                kej.a(BootImageInteractNaitveSlideView.TAG, "initCardLayout failPhenixEvent");
                                if (BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this) != null) {
                                    BootImageInteractNaitveSlideView.access$200(BootImageInteractNaitveSlideView.this).setVisibility(8);
                                }
                                BootImageInteractNaitveSlideView.access$300(BootImageInteractNaitveSlideView.this, context);
                                return false;
                            }
                        });
                        return;
                    }
                    if (this.mCardImageView != null) {
                        this.mCardImageView.setVisibility(8);
                    }
                    loadAndShowDefaultCardView(context);
                    return;
                }
                loadAndShowDefaultCardView(context);
            } catch (Throwable th) {
                kej.a(TAG, "initGuideLayout", th);
            }
        }
    }

    private void loadAndShowDefaultCardView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6381679", new Object[]{this, context});
        } else if (context == null) {
        } else {
            try {
                this.mInteractCardDefaultContainer = (RelativeLayout) findViewById(R.id.interact_card_default_container);
                LayoutInflater.from(context).inflate(getInteractCartLayoutId(), this.mInteractCardDefaultContainer);
                renderDefaultCard();
                this.mInteractCardDefaultContainer.setVisibility(0);
                setShowInteractCardImage("0");
            } catch (Throwable th) {
                kej.a(TAG, "loadAndShowDefaultCardView", th);
            }
        }
    }

    private void loadApngImage(String str, TUrlImageView tUrlImageView, a<SuccPhenixEvent> aVar, a<FailPhenixEvent> aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9319ae2", new Object[]{this, str, tUrlImageView, aVar, aVar2});
            return;
        }
        try {
            if (StringUtils.isEmpty(str) || tUrlImageView == null) {
                return;
            }
            tUrlImageView.setSkipAutoSize(true);
            tUrlImageView.setImageUrl(d.a(str));
            if (aVar != null) {
                tUrlImageView.succListener(aVar);
            }
            if (aVar2 == null) {
                return;
            }
            tUrlImageView.failListener(aVar2);
        } catch (Throwable th) {
            kej.a(TAG, "loadApngImage Error", th);
        }
    }

    public String getSlideActionText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b4056db", new Object[]{this}) : (this.mBootImageInfo == null || StringUtils.isEmpty(this.mBootImageInfo.actionText)) ? "" : this.mBootImageInfo.actionText;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
            return;
        }
        super.startInteract();
        try {
            this.mDisableInteract = false;
            this.mSlideAnimContainer.setVisibility(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
            return;
        }
        super.stopInteract();
        try {
            this.mDisableInteract = true;
            this.mSlideAnimContainer.setVisibility(4);
            this.mSlideDefaultContainer.setVisibility(8);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        boolean show = super.show();
        if (!show) {
            return false;
        }
        if (this.mSlideAnimContainer != null) {
            kej.a(TAG, "show mSlideAnimContainer");
            this.mSlideAnimContainer.setVisibility(0);
        }
        return show;
    }

    private boolean loadAndShowDefaultSlideView() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bf8cb8e", new Object[]{this})).booleanValue();
        }
        try {
            a2 = stu.a(kek.DEFAULT_SLIDE_URL);
        } catch (Throwable th) {
            kej.a(TAG, "loadAndShowDefaultSlideView", th);
            if (this.mInteractClickContainer != null) {
                this.mInteractClickContainer.setVisibility(8);
            }
        }
        if (StringUtils.isEmpty(a2)) {
            kej.a(TAG, "loadAndShowDefaultSlideView path is null");
            setShowInteractGuideImage("");
            if (this.mInteractClickContainer != null) {
                this.mInteractClickContainer.setVisibility(8);
            }
            return false;
        }
        setShowInteractGuideImage("0");
        kej.a(TAG, "loadAndShowDefaultSlideView show");
        this.mSlideDefaultContainer.setVisibility(0);
        this.mSlideAnimView.setSkipAutoSize(true);
        this.mSlideAnimView.setImageUrl(d.a(a2));
        this.mSlideAnimView.failListener(new a<FailPhenixEvent>() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView.5
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
                if (BootImageInteractNaitveSlideView.this.mInteractClickContainer != null) {
                    BootImageInteractNaitveSlideView.this.mInteractClickContainer.setVisibility(8);
                }
                return false;
            }
        });
        return true;
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public boolean showWithAnim(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8767dccb", new Object[]{this, animationListener})).booleanValue();
        }
        boolean showWithAnim = super.showWithAnim(animationListener);
        if (showWithAnim) {
            setVisibility(0);
            if (this.mInteractCardContainer != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(600L);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatCount(0);
                alphaAnimation.setAnimationListener(animationListener);
                this.mInteractCardContainer.clearAnimation();
                this.mInteractCardContainer.startAnimation(alphaAnimation);
            }
        }
        return showWithAnim;
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        stopInteract();
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
            return;
        }
        kej.a(TAG, "onSlide");
        processClick(this.mContext);
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
            return;
        }
        kej.a(TAG, "onAdClick");
        try {
            h.b("").a(7, this.mBootImageInfo.isColdStart);
            ken.a(this.mBootImageInfo);
            processClick(this.mContext);
        } catch (Throwable th) {
            kej.a(TAG, "onAdClick", th);
        }
    }
}
