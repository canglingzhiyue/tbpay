package com.taobao.bootimage.interact.pop;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.utils.f;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.view.PopCustomNativeBaseView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImagePopMamaCommercialView extends PopCustomNativeBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME = "com.taobao.tao.TBMainActivity";
    public static final String BOOTIMAGE_POP_CLOSE_IMAGE = "https://gw.alicdn.com/imgextra/i3/O1CN01bPtybb1lD7fv7y0wG_!!6000000004784-2-tps-108-108.png";
    private static final String TAG = "BootImagePopMamaCommercialView.PopLayer";
    public static final String VIEW_TYPE = "mamaCommercial";
    private final String HIDE_AD_LOGO;
    private final String KEY_ADD_CART_NAME;
    public String actionResponse;
    private String adSwitch;
    private String advClickTracking;
    private String advEventTracking;
    private String advImpTracking;
    private b bootImagePopInteractAddCartPresenter;
    private c bootImagePopInteractCouponPresenter;
    private boolean canInteract;
    private JSONObject clickParam;
    private JSONObject closeParam;
    private JSONObject exposureParam;
    private Float height;
    private String icon;
    private String imageUrl;
    private JSONObject interactClickParam;
    private boolean isColdStart;
    private boolean isIconImgChanged;
    private BootImageInfo mBootImageInfo;
    private Context mContext;
    private Handler mHandler;
    private ImageView mImageView;
    private boolean mIsAddingCart;
    private boolean mIsReceivingCoupon;
    private final AtomicBoolean mReadyToDisplayed;
    private RelativeLayout mRootView;
    private ThreadPoolExecutor mThreadPool;
    private Map<String, String> monitorArgs;
    private Float right;
    private Float tabBarBottom;
    private String targetUrl;
    private Map<String, String> utArgs;
    private Float width;

    static {
        kge.a(731576797);
    }

    public static /* synthetic */ Object ipc$super(BootImagePopMamaCommercialView bootImagePopMamaCommercialView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(BootImagePopMamaCommercialView bootImagePopMamaCommercialView, Context context, LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891f2647", new Object[]{bootImagePopMamaCommercialView, context, linkedSplashData});
        } else {
            bootImagePopMamaCommercialView.parseDataAndRender(context, linkedSplashData);
        }
    }

    public static /* synthetic */ void access$100(BootImagePopMamaCommercialView bootImagePopMamaCommercialView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c979c5e", new Object[]{bootImagePopMamaCommercialView, context});
        } else {
            bootImagePopMamaCommercialView.render(context);
        }
    }

    public static /* synthetic */ AtomicBoolean access$1000(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("440a7858", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.mReadyToDisplayed;
    }

    public static /* synthetic */ String access$1100(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c71c41a7", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.advImpTracking;
    }

    public static /* synthetic */ JSONObject access$1200(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c85d723a", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.exposureParam;
    }

    public static /* synthetic */ void access$1300(BootImagePopMamaCommercialView bootImagePopMamaCommercialView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84119af", new Object[]{bootImagePopMamaCommercialView, str, str2});
        } else {
            bootImagePopMamaCommercialView.closePop(str, str2);
        }
    }

    public static /* synthetic */ ImageView access$1400(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("935cb9f4", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.mImageView;
    }

    public static /* synthetic */ boolean access$1502(BootImagePopMamaCommercialView bootImagePopMamaCommercialView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176d3c19", new Object[]{bootImagePopMamaCommercialView, new Boolean(z)})).booleanValue();
        }
        bootImagePopMamaCommercialView.isIconImgChanged = z;
        return z;
    }

    public static /* synthetic */ void access$1600(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee14b1e", new Object[]{bootImagePopMamaCommercialView});
        } else {
            bootImagePopMamaCommercialView.onImageLoaded();
        }
    }

    public static /* synthetic */ String access$200(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2660d655", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.advClickTracking;
    }

    public static /* synthetic */ Map access$300(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf1ba5e1", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.utArgs;
    }

    public static /* synthetic */ Map access$400(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2da2b722", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.monitorArgs;
    }

    public static /* synthetic */ void access$500(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba9feae", new Object[]{bootImagePopMamaCommercialView});
        } else {
            bootImagePopMamaCommercialView.onPopIcon2Click();
        }
    }

    public static /* synthetic */ String access$600(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62442d1", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.targetUrl;
    }

    public static /* synthetic */ JSONObject access$700(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2c21b7d0", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.clickParam;
    }

    public static /* synthetic */ String access$800(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7605f90f", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.advEventTracking;
    }

    public static /* synthetic */ JSONObject access$900(BootImagePopMamaCommercialView bootImagePopMamaCommercialView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3330fdd2", new Object[]{bootImagePopMamaCommercialView}) : bootImagePopMamaCommercialView.closeParam;
    }

    public BootImagePopMamaCommercialView(Context context) {
        super(context);
        this.mReadyToDisplayed = new AtomicBoolean(false);
        this.KEY_ADD_CART_NAME = "splashInteract";
        this.canInteract = true;
        this.isIconImgChanged = false;
        this.HIDE_AD_LOGO = "1";
        try {
            this.mThreadPool = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new f.a("PopMamaCommercialViewSingleThreadPool"));
            if (this.mThreadPool != null) {
                this.mThreadPool.allowCoreThreadTimeOut(true);
            }
            this.mHandler = new Handler(Looper.getMainLooper());
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.init.error", th);
        }
    }

    public void init(final Context context, final LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87904899", new Object[]{this, context, linkedSplashData});
            return;
        }
        try {
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.init.error", th);
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, String.format("initCatchError.e=%s", th.getMessage()), "", "");
        }
        if (this.mPopRequest == 0) {
            kej.a(TAG, "mPopRequest is NULL!");
            return;
        }
        this.mContext = context;
        this.canInteract = true;
        this.isIconImgChanged = false;
        this.mIsAddingCart = false;
        this.mIsReceivingCoupon = false;
        setPenetrateAlpha((int) (((com.alibaba.poplayer.trigger.d) this.mPopRequest).x().modalThreshold * 255.0d));
        String b = com.alibaba.poplayer.trigger.d.b(this.mPopRequest);
        kej.a(TAG, "BootImagePopMamaCommercialView.startInit, indexId=" + b);
        this.mBootImageInfo = new BootImageInfo();
        this.mThreadPool.execute(new Runnable() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BootImagePopMamaCommercialView.access$000(BootImagePopMamaCommercialView.this, context, linkedSplashData);
                }
            }
        });
        if (context == null) {
            return;
        }
        this.mRootView = new RelativeLayout(context);
    }

    @Override // com.taobao.tbpoplayer.view.PopCustomNativeBaseView
    public View initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe1492ae", new Object[]{this, context});
        }
        init(context, h.b("com.taobao.tao.TBMainActivity").b());
        return this.mRootView;
    }

    private void parseDataAndRender(final Context context, LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f80bd9", new Object[]{this, context, linkedSplashData});
            return;
        }
        kej.a(TAG, "parseDataAndRender");
        try {
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.parseData.error", th);
        }
        if (linkedSplashData == null) {
            kej.a(TAG, "currentSplashData == null");
            closePop("WindvaneResultEmpty", "currentSplashData == null");
        } else if (linkedSplashData.getLinkedData("popView") == null) {
            kej.a(TAG, "currentSplashData.getLinkedData(popView) == null");
            closePop("WindvaneResultEmpty", "currentSplashData.getLinkedData(popView) == null");
        } else {
            kej.a(TAG, "parseDataAndRender jsonObject");
            JSONObject parseObject = JSON.parseObject(linkedSplashData.getLinkedData("popView").toString());
            if (parseObject != null && !parseObject.isEmpty()) {
                this.advImpTracking = com.taobao.tbpoplayer.util.c.a(parseObject, "exposureParam.args.advImpTracking");
                this.advClickTracking = com.taobao.tbpoplayer.util.c.a(parseObject, "item.click.clickParam.args.advClickTracking");
                this.advEventTracking = com.taobao.tbpoplayer.util.c.a(parseObject, "item.close.clickParam.args.advEventTracking");
                this.targetUrl = com.taobao.tbpoplayer.util.c.a(parseObject, "item.click.targetUrl");
                this.imageUrl = com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.icon2");
                this.icon = com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.icon");
                this.width = Float.valueOf(Float.parseFloat(com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.position.width")));
                this.height = Float.valueOf(Float.parseFloat(com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.position.height")));
                this.right = Float.valueOf(Float.parseFloat(com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.position.right")));
                this.tabBarBottom = Float.valueOf(Float.parseFloat(com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.position.tabBarBottom")));
                this.exposureParam = com.taobao.tbpoplayer.util.c.b(parseObject, com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
                this.clickParam = com.taobao.tbpoplayer.util.c.b(parseObject, "item.click.clickParam");
                this.closeParam = com.taobao.tbpoplayer.util.c.b(parseObject, "item.close.clickParam");
                JSONObject b = com.taobao.tbpoplayer.util.c.b(parseObject, "ext.advClientParam.monitorArgs");
                JSONObject b2 = com.taobao.tbpoplayer.util.c.b(parseObject, "ext.advClientParam.utArgs");
                this.monitorArgs = jsonToMap(b);
                this.utArgs = jsonToMap(b2);
                if (!this.canInteract || !parseInteractParams(parseObject)) {
                    z = false;
                }
                this.canInteract = z;
                if (TextUtils.isEmpty(this.imageUrl) || !this.canInteract) {
                    this.canInteract = false;
                    this.imageUrl = com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.icon");
                    if (TextUtils.isEmpty(this.imageUrl)) {
                        this.imageUrl = com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.imgUrl");
                    }
                }
                this.adSwitch = com.taobao.tbpoplayer.util.c.a(parseObject, "item.render.smartContent.adSwitch");
                try {
                    kej.a(TAG, "BootImagePopMamaCommercialView.parseData.success");
                    if (!TextUtils.isEmpty(this.imageUrl) && this.width != null && this.height != null && this.right != null && this.tabBarBottom != null) {
                        if (this.mHandler == null) {
                            return;
                        }
                        this.mHandler.post(new Runnable() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    BootImagePopMamaCommercialView.access$100(BootImagePopMamaCommercialView.this, context);
                                }
                            }
                        });
                        return;
                    }
                    closePop("WindvaneResultRenderInvalid", "");
                    return;
                } catch (Throwable th2) {
                    kej.a(TAG, "BootImagePopMamaCommercialView.parseData.error", th2);
                    return;
                }
            }
            kej.a(TAG, "popViewJsonObj is empty");
            closePop("WindvaneResultEmpty", "popViewJsonObj is empty");
        }
    }

    private void render(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19054b4b", new Object[]{this, context});
            return;
        }
        try {
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.render.error", th);
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, String.format("renderCatchError.e=%s", th.getMessage()), "", "");
        }
        if (this.mRootView == null) {
            kej.a(TAG, "BootImagePopMamaCommercialView.startRender mRootView == null");
            return;
        }
        kej.a(TAG, "BootImagePopMamaCommercialView.startRender");
        int a2 = (int) g.a(context, this.width.floatValue());
        int a3 = (int) g.a(context, this.right.floatValue());
        int a4 = (int) g.a(context, this.tabBarBottom.floatValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, (int) g.a(context, this.height.floatValue()));
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        layoutParams.rightMargin = a3;
        layoutParams.bottomMargin = g.a(context, 48) + a4;
        this.mImageView = new ImageView(context);
        this.mImageView.setId(R.id.poplayer_mama_state_id);
        this.mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mRootView.addView(this.mImageView, layoutParams);
        ImageView imageView = new ImageView(context);
        com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, BOOTIMAGE_POP_CLOSE_IMAGE).into(imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int a5 = (int) g.a(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a5, a5);
        layoutParams2.addRule(7, R.id.poplayer_mama_state_id);
        layoutParams2.addRule(6, R.id.poplayer_mama_state_id);
        layoutParams2.rightMargin = (int) g.a(context, -10.0f);
        layoutParams2.topMargin = (int) g.a(context, -30.0f);
        this.mRootView.addView(imageView, layoutParams2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.mama_commercial_tag);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int a6 = (int) g.a(context, 60.0f);
        int a7 = (int) g.a(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a6, a7);
        layoutParams3.rightMargin = a3 + ((a2 - a6) / 2);
        layoutParams3.bottomMargin = ((a4 + g.a(context, 48)) - a7) - ((int) g.a(context, 6.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(12);
        this.mRootView.addView(imageView2, layoutParams3);
        this.mImageView.setContentDescription("广告浮层图片");
        imageView.setContentDescription("浮层关闭按钮");
        imageView2.setContentDescription("广告浮层标签");
        imageView2.setVisibility(TextUtils.equals("1", this.adSwitch) ? 8 : 0);
        loadImg(this.imageUrl, false);
        this.mImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(BootImagePopMamaCommercialView.access$200(BootImagePopMamaCommercialView.this))) {
                        AlimamaAdvertising.instance().buildTanxClickTracking(PopLayer.getReference().getApp(), BootImagePopMamaCommercialView.access$200(BootImagePopMamaCommercialView.this)).a("tb_splash").b(BootImagePopMamaCommercialView.access$400(BootImagePopMamaCommercialView.this)).a(BootImagePopMamaCommercialView.access$300(BootImagePopMamaCommercialView.this)).a();
                    }
                } catch (Throwable th2) {
                    kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.render.imageOnClickTrack.error", th2);
                }
                try {
                    BootImagePopMamaCommercialView.access$500(BootImagePopMamaCommercialView.this);
                    Nav.from(context).toUri(BootImagePopMamaCommercialView.access$600(BootImagePopMamaCommercialView.this));
                } catch (Throwable th3) {
                    kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.render.imageOnClick.error", th3);
                }
                BootImagePopMamaCommercialView bootImagePopMamaCommercialView = BootImagePopMamaCommercialView.this;
                bootImagePopMamaCommercialView.trackUT(BootImagePopMamaCommercialView.access$700(bootImagePopMamaCommercialView));
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                BootImagePopMamaCommercialView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "clickCloseBtn", "", "");
                try {
                    if (!TextUtils.isEmpty(BootImagePopMamaCommercialView.access$800(BootImagePopMamaCommercialView.this))) {
                        AlimamaAdvertising.instance().buildTanxEventTracking(PopLayer.getReference().getApp(), BootImagePopMamaCommercialView.access$800(BootImagePopMamaCommercialView.this)).a("tb_splash").b(BootImagePopMamaCommercialView.access$400(BootImagePopMamaCommercialView.this)).a(BootImagePopMamaCommercialView.access$300(BootImagePopMamaCommercialView.this)).a();
                    }
                } catch (Throwable th2) {
                    kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.render.closeBtnOnClickTrack.error", th2);
                }
                BootImagePopMamaCommercialView bootImagePopMamaCommercialView = BootImagePopMamaCommercialView.this;
                bootImagePopMamaCommercialView.trackUT(BootImagePopMamaCommercialView.access$900(bootImagePopMamaCommercialView));
            }
        });
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BootImagePopMamaCommercialView.this.isDisplaying()) {
                } else {
                    if (!BootImagePopMamaCommercialView.this.isPopReadyToDisplay()) {
                        kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.ImageLoadOutOfTime.");
                        BootImagePopMamaCommercialView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "ImageLoadOutOfTime", "", "");
                    } else if (d.b() && BootImagePopMamaCommercialView.access$1000(BootImagePopMamaCommercialView.this).get()) {
                    } else {
                        kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.NotifyOutOfTime.");
                        BootImagePopMamaCommercialView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "NotifyOutOfTime", "", "");
                    }
                }
            }
        }, 10000L);
    }

    private void onImageLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
            return;
        }
        kej.a(TAG, "onImageLoaded");
        if (this.mReadyToDisplayed.getAndSet(true) || !d.b()) {
            return;
        }
        kej.a(TAG, "onImageLoaded expose");
        expose();
    }

    public boolean notifyDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47524544", new Object[]{this})).booleanValue();
        }
        kej.a(TAG, "notifyDisplay");
        if (!this.mReadyToDisplayed.get()) {
            return false;
        }
        kej.a(TAG, "notifyDisplay expose");
        expose();
        return true;
    }

    private void expose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47164b", new Object[]{this});
        } else {
            runInMainThread(new Runnable() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (BootImagePopMamaCommercialView.this.isDisplaying()) {
                            return;
                        }
                        BootImagePopMamaCommercialView.this.displayMe();
                        if (!TextUtils.isEmpty(BootImagePopMamaCommercialView.access$1100(BootImagePopMamaCommercialView.this))) {
                            AlimamaAdvertising.instance().buildTanxImpTracking(PopLayer.getReference().getApp(), BootImagePopMamaCommercialView.access$1100(BootImagePopMamaCommercialView.this)).a("tb_splash").b(BootImagePopMamaCommercialView.access$400(BootImagePopMamaCommercialView.this)).a(BootImagePopMamaCommercialView.access$300(BootImagePopMamaCommercialView.this)).a();
                        }
                        BootImagePopMamaCommercialView.this.trackUT(BootImagePopMamaCommercialView.access$1200(BootImagePopMamaCommercialView.this));
                    } catch (Throwable th) {
                        kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.expose.error", th);
                    }
                }
            });
        }
    }

    public boolean isPopReadyToDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b606ef16", new Object[]{this})).booleanValue();
        }
        try {
            return this.mReadyToDisplayed.get();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void trackUT(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d197a05f", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject == null) {
                kej.a(TAG, "BootImagePopMamaCommercialView.trackUT.JsonIsNull");
                return;
            }
            String string = jSONObject.getString("page");
            int intValue = jSONObject.getIntValue("eventId");
            String string2 = jSONObject.getString("arg1");
            String string3 = jSONObject.getString("arg2");
            String string4 = jSONObject.getString("arg3");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            HashMap hashMap = new HashMap();
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, intValue, string2, string3, string4, hashMap).build());
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.trackUT.error", th);
        }
    }

    private Map<String, String> jsonToMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c993e045", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }

    private void runInMainThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{this, runnable});
            return;
        }
        try {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.mHandler.post(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.runInMainThread.error", th);
        }
    }

    private boolean parseInteractParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42b92fbe", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            JSONObject b = com.taobao.tbpoplayer.util.c.b(jSONObject, "item.render.smartContent.content");
            if (b != null && !b.isEmpty()) {
                this.actionResponse = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.actionResponse");
                if (!TextUtils.isEmpty(this.actionResponse) && !this.actionResponse.equals("0")) {
                    if (this.mBootImageInfo == null) {
                        this.mBootImageInfo = new BootImageInfo();
                    }
                    this.mBootImageInfo.actionResponse = this.actionResponse;
                    this.mBootImageInfo.actionResult = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.actionResult");
                    this.mBootImageInfo.cardItemId = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.cardItemId");
                    this.mBootImageInfo.cardSkuId = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.cardSkuId");
                    this.mBootImageInfo.benefitSupplier = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitSupplier");
                    this.mBootImageInfo.benefitId = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitId");
                    this.mBootImageInfo.benefitQuerySource = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitQuerySource");
                    this.mBootImageInfo.benefitSource = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitSource");
                    this.mBootImageInfo.benefitType = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitType");
                    this.mBootImageInfo.benefitStrategyCode = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitStrategyCode");
                    this.mBootImageInfo.benefitSafeCode = com.taobao.tbpoplayer.util.c.a(jSONObject, "item.render.smartContent.content.benefitSafeCode");
                    if (this.utArgs != null) {
                        this.isColdStart = Boolean.parseBoolean(this.utArgs.get("is_cold"));
                        this.mBootImageInfo.isColdStart = this.isColdStart;
                    }
                    this.interactClickParam = com.taobao.tbpoplayer.util.c.b(jSONObject, "item.interactClick.clickParam");
                    return true;
                }
                kej.a(TAG, "parseInteractParams actionResponse= null");
                return false;
            }
            kej.a(TAG, "parseInteractParams interactContentObj= null");
            return false;
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.parseInteractParams.error", th);
            return false;
        }
    }

    public boolean changeImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d480fe", new Object[]{this})).booleanValue();
        }
        try {
            kej.a(TAG, "BootImagePopMamaCommercialView.changeImg. icon2 = " + this.icon);
            if (!this.canInteract) {
                kej.a(TAG, "BootImagePopMamaCommercialView.changeImg.failed canInteract = false");
                return false;
            } else if (TextUtils.isEmpty(this.icon)) {
                kej.a(TAG, "BootImagePopMamaCommercialView.changeImg.failed icon2 = null");
                return false;
            } else {
                loadImg(this.icon, true);
                return true;
            }
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.changeImg.error", th);
            return false;
        }
    }

    private void loadImg(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1194c6", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                kej.a(TAG, "BootImagePopMamaCommercialView.loadImg.failed url = null");
            } else {
                com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.8
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
                        if (succPhenixEvent != null) {
                            try {
                            } catch (Throwable th) {
                                kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.loadImg.error", th);
                            }
                            if (succPhenixEvent.getDrawable() != null) {
                                BootImagePopMamaCommercialView.access$1400(BootImagePopMamaCommercialView.this).setImageDrawable(succPhenixEvent.getDrawable());
                                kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.onImageLoaded.url=" + str);
                                if (z) {
                                    BootImagePopMamaCommercialView.access$1502(BootImagePopMamaCommercialView.this, true);
                                }
                                BootImagePopMamaCommercialView.access$1600(BootImagePopMamaCommercialView.this);
                                return false;
                            }
                        }
                        if (!z) {
                            BootImagePopMamaCommercialView bootImagePopMamaCommercialView = BootImagePopMamaCommercialView.this;
                            BootImagePopMamaCommercialView.access$1300(bootImagePopMamaCommercialView, "IMAGE_LOAD_DRAWABLE_ERROR.url=" + str, str);
                        }
                        kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.loadBgImageNoDrawable.url=" + str);
                        return false;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.7
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
                        if (!z) {
                            BootImagePopMamaCommercialView bootImagePopMamaCommercialView = BootImagePopMamaCommercialView.this;
                            BootImagePopMamaCommercialView.access$1300(bootImagePopMamaCommercialView, "IMAGE_LOAD_ERROR.url=" + str, str);
                        }
                        kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView.loadBgImageError.url=" + str);
                        return false;
                    }
                }).fetch();
            }
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView. handleReceiveResult.error", th);
        }
    }

    private void onPopIcon2Click() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4af9fc8", new Object[]{this});
            return;
        }
        try {
            kej.a(TAG, "onPopIcon2Click isIconImgChanged = " + this.isIconImgChanged + ", canInteract = " + this.canInteract);
            if (this.isIconImgChanged || !this.canInteract) {
                return;
            }
            if ("1".equals(this.actionResponse)) {
                this.bootImagePopInteractAddCartPresenter = new b(this.mContext, this.mBootImageInfo, this.interactClickParam);
                this.bootImagePopInteractAddCartPresenter.b();
            } else if (!"2".equals(this.actionResponse)) {
            } else {
                this.bootImagePopInteractCouponPresenter = new c(this.mContext, this.mBootImageInfo, this.interactClickParam);
                this.bootImagePopInteractCouponPresenter.b();
            }
        } catch (Throwable th) {
            kej.a(TAG, "BootImagePopMamaCommercialView.onPopIcon2Click.error", th);
        }
    }

    private void closePop(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a126ce54", new Object[]{this, str, str2});
        } else {
            runInMainThread(new Runnable() { // from class: com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        kej.a(BootImagePopMamaCommercialView.TAG, "closePop reason = " + str);
                        BootImagePopMamaCommercialView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str, str2, "");
                    } catch (Throwable th) {
                        kej.a(BootImagePopMamaCommercialView.TAG, "BootImagePopMamaCommercialView. closePop .error", th);
                    }
                }
            });
        }
    }
}
