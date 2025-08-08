package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.phenix.animate.b;
import com.taobao.phenix.cache.memory.f;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.v;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ddv;
import tb.ddw;
import tb.hfn;
import tb.hir;
import tb.hki;
import tb.hkj;
import tb.hkk;
import tb.jzn;
import tb.kge;
import tb.krb;
import tb.krc;
import tb.phg;
import tb.ply;
import tb.pqj;
import tb.tfu;
import tb.xkw;

/* loaded from: classes5.dex */
public class GoodsIconFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_MEDIAPLATFORM_SHOW_GOODSPACKAGE = "com.taolive.taolive.room.mediaplatform_show_goodspackage";
    private static final String STATIC_IMAGE_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01jWg6dq1QVLYwECvsP_!!6000000001981-49-tps-159-150.webp";
    public static final String TAG;
    private boolean enableNewUIRenderCalibre;
    private TUrlImageView fakeGoodImage;
    private TimerTask imageAnimTask;
    private Timer imageAnimTimer;
    private boolean isAnimating;
    private boolean isFirstShowcaseShow;
    private b lastAnimDrawable;
    private String lastAnimType;
    private TUrlImageView mAuctionImg;
    private FrameLayout mAuctionLayout;
    private TextView mAuctionNum;
    private krc mGoodsBtnGuide;
    private FrameLayout mGuideRoot;
    private AtomicBoolean mIsDispatchOnDraw;
    private d.a mMessageListener;
    private ViewTreeObserver.OnDrawListener mOnDrawListener;

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame$10  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass10 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f13552a;

        public AnonymousClass10(long j) {
            this.f13552a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            GoodsIconFrame.access$1300(GoodsIconFrame.this).setVisibility(4);
            GoodsIconFrame.access$1300(GoodsIconFrame.this).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.10.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    GoodsIconFrame.access$1300(GoodsIconFrame.this).setVisibility(0);
                    GoodsIconFrame.access$1300(GoodsIconFrame.this).animate().alpha(1.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.10.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            } else {
                                GoodsIconFrame.access$1202(GoodsIconFrame.this, false);
                            }
                        }
                    }).start();
                }
            }, this.f13552a);
        }
    }

    public static /* synthetic */ Object ipc$super(GoodsIconFrame goodsIconFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "goods";
    }

    public static /* synthetic */ void access$000(GoodsIconFrame goodsIconFrame, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549cec96", new Object[]{goodsIconFrame, new Integer(i)});
        } else {
            goodsIconFrame.onUpdateProductNum(i);
        }
    }

    public static /* synthetic */ AtomicBoolean access$100(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4273ad2c", new Object[]{goodsIconFrame}) : goodsIconFrame.mIsDispatchOnDraw;
    }

    public static /* synthetic */ TUrlImageView access$1000(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("1951e07e", new Object[]{goodsIconFrame}) : goodsIconFrame.fakeGoodImage;
    }

    public static /* synthetic */ void access$1100(GoodsIconFrame goodsIconFrame, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460bb18e", new Object[]{goodsIconFrame, view, new Integer(i)});
        } else {
            goodsIconFrame.setVisibilityOnUiThread(view, i);
        }
    }

    public static /* synthetic */ boolean access$1202(GoodsIconFrame goodsIconFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b823805e", new Object[]{goodsIconFrame, new Boolean(z)})).booleanValue();
        }
        goodsIconFrame.isAnimating = z;
        return z;
    }

    public static /* synthetic */ TextView access$1300(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("2ff602cf", new Object[]{goodsIconFrame}) : goodsIconFrame.mAuctionNum;
    }

    public static /* synthetic */ void access$200(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab5cb", new Object[]{goodsIconFrame});
        } else {
            goodsIconFrame.removeOnDrawListener();
        }
    }

    public static /* synthetic */ boolean access$300(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1105ccae", new Object[]{goodsIconFrame})).booleanValue() : goodsIconFrame.isImageAnimABEnabled();
    }

    public static /* synthetic */ void access$400(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7360e389", new Object[]{goodsIconFrame});
        } else {
            goodsIconFrame.cancelImageAnimTask();
        }
    }

    public static /* synthetic */ void access$500(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5bbfa68", new Object[]{goodsIconFrame});
        } else {
            goodsIconFrame.showProductList();
        }
    }

    public static /* synthetic */ krc access$600(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (krc) ipChange.ipc$dispatch("2701f303", new Object[]{goodsIconFrame}) : goodsIconFrame.mGoodsBtnGuide;
    }

    public static /* synthetic */ void access$700(GoodsIconFrame goodsIconFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b47d470", new Object[]{goodsIconFrame, str});
        } else {
            goodsIconFrame.startImageAnim(str);
        }
    }

    public static /* synthetic */ b access$800(GoodsIconFrame goodsIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9d87268e", new Object[]{goodsIconFrame}) : goodsIconFrame.lastAnimDrawable;
    }

    public static /* synthetic */ b access$802(GoodsIconFrame goodsIconFrame, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("98706ebf", new Object[]{goodsIconFrame, bVar});
        }
        goodsIconFrame.lastAnimDrawable = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$900(GoodsIconFrame goodsIconFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26214eae", new Object[]{goodsIconFrame, str});
        } else {
            goodsIconFrame.startNumAnim(str);
        }
    }

    static {
        kge.a(-988476931);
        kge.a(191318335);
        TAG = GoodsIconFrame.class.getSimpleName();
    }

    public GoodsIconFrame(Context context, a aVar) {
        super(context, aVar);
        this.isFirstShowcaseShow = true;
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                VideoInfo videoInfo;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i == 1009) {
                    ShareGoodsListMessage shareGoodsListMessage = (ShareGoodsListMessage) obj;
                    if (shareGoodsListMessage == null) {
                        return;
                    }
                    GoodsIconFrame.access$000(GoodsIconFrame.this, shareGoodsListMessage.totalCount);
                } else if (i != 1039 || (videoInfo = GoodsIconFrame.this.mLiveDataModel.mVideoInfo) == null || videoInfo.roomType != 13) {
                } else {
                    GoodsIconFrame.access$000(GoodsIconFrame.this, 0);
                }
            }
        };
        this.mIsDispatchOnDraw = new AtomicBoolean(false);
        this.enableNewUIRenderCalibre = ply.T();
        this.mOnDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73be92ca", new Object[]{this});
                } else if (!GoodsIconFrame.access$100(GoodsIconFrame.this).compareAndSet(false, true)) {
                } else {
                    ddw.a().a(xkw.EVENT_LIVE_UI_RENDER_FINISH, GoodsIconFrame.this.getComponentName(), GoodsIconFrame.this.observeUniqueIdentification());
                    GoodsIconFrame.this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                GoodsIconFrame.access$200(GoodsIconFrame.this);
                            }
                        }
                    });
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_goods_icon_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mAuctionLayout = (FrameLayout) view;
        this.mAuctionNum = (TextView) view.findViewById(R.id.taolive_product_switch_btn_text);
        this.fakeGoodImage = (TUrlImageView) view.findViewById(R.id.taolive_fake_good_img);
        if (isImageAnimABEnabled()) {
            this.fakeGoodImage.setVisibility(0);
        }
        this.mAuctionImg = (TUrlImageView) view.findViewById(R.id.taolive_product_switch_btn_img);
        this.mGuideRoot = (FrameLayout) view.findViewById(R.id.taolive_goods_icon_guide);
        if (v.b.a("goodlist", "hongbaoUrgeV2", true)) {
            this.mGoodsBtnGuide = new krb(this.mContext, this.mAuctionLayout);
        } else {
            this.mGoodsBtnGuide = new hfn(this.mContext, this.mAuctionLayout);
        }
        view.setContentDescription("宝贝口袋");
        hki.a(view);
        this.mAuctionLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (GoodsIconFrame.this.mFrameContext != null && GoodsIconFrame.this.mFrameContext.z() != null && GoodsIconFrame.this.mFrameContext.z().M()) {
                    GoodsIconFrame.this.mFrameContext.e().a(xkw.e, "assembly", GoodsIconFrame.this.observeUniqueIdentification());
                }
                if (phg.a() != null) {
                    phg.a().a(GoodsIconFrame.this.mFrameContext, "Click_Goodslist", new String[0]);
                }
                if (GoodsIconFrame.access$300(GoodsIconFrame.this)) {
                    ad.a("last_click_goods_icon_time", System.currentTimeMillis());
                    GoodsIconFrame.access$400(GoodsIconFrame.this);
                }
                jzn.a(GoodsIconFrame.this.mFrameContext, tfu.GOODS_IN, 0L);
                GoodsIconFrame.access$500(GoodsIconFrame.this);
                GoodsIconFrame.access$600(GoodsIconFrame.this).a();
                GoodsIconFrame.this.mFrameContext.e().a("com.taobao.taolive.bootom.goods.icon.click", null, GoodsIconFrame.this.observeUniqueIdentification());
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        addOnDrawListener();
        this.mFrameContext.e().a(this);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1009 || i == 1039;
            }
        });
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null) {
            onUpdateProductNum(videoInfo.curItemNum);
            if (isBlackListRoomType((int) videoInfo.newRoomType)) {
                this.mAuctionLayout.setVisibility(4);
            }
        }
        if (isImageAnimABEnabled()) {
            if (!hasClickGoodsIconIn7Days()) {
                scheduleImageAnimTask();
            }
            this.fakeGoodImage.setImageUrl(STATIC_IMAGE_URL);
            this.mAuctionImg.setSkipAutoSize(false);
        }
        this.mAuctionImg.setImageUrl(STATIC_IMAGE_URL);
        if (!hkk.a()) {
            return;
        }
        krc krcVar = this.mGoodsBtnGuide;
        if (krcVar instanceof hfn) {
            krcVar.a((ViewGroup) ((Activity) this.mContext).findViewById(R.id.taolive_goods_guide_container), this.mLiveDataModel);
        } else {
            krcVar.a(this.mGuideRoot, this.mLiveDataModel);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        removeOnDrawListener();
        this.mFrameContext.e().b(this);
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        this.mGoodsBtnGuide.b();
        if (!isImageAnimABEnabled()) {
            return;
        }
        this.isAnimating = false;
        this.isFirstShowcaseShow = true;
        this.lastAnimType = null;
        this.lastAnimDrawable = null;
        this.mAuctionImg.succListener(null);
        this.fakeGoodImage.setVisibility(8);
        cancelImageAnimTask();
    }

    private void showProductList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b86b77", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("glopenfrom", "goodslisticon");
        this.mFrameContext.e().a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap, observeUniqueIdentification());
    }

    private void onUpdateProductNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d190fd", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.mAuctionNum.setText("宝贝");
            this.mAuctionNum.setTextSize(10.0f);
        } else {
            this.mAuctionNum.setText(String.valueOf(i));
            this.mAuctionNum.setTextSize(12.0f);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        if ("com.taobao.taolive.room.showcase_show".equals(str)) {
            if (obj instanceof HashMap) {
                HashMap hashMap = (HashMap) obj;
                if (hashMap.get("View") instanceof View) {
                    onShowCaseAnim((View) hashMap.get("View"));
                }
            }
        } else if ("com.taobao.taolive.room.showcase_close".equals(str) && (obj instanceof View)) {
            onHideCaseAnim((View) obj);
        }
        if (isImageAnimABEnabled() && "good.showcase.appear".equals(str)) {
            if (!this.isFirstShowcaseShow) {
                return;
            }
            startImageAnim("show");
            this.isFirstShowcaseShow = false;
        } else if (isImageAnimABEnabled() && "good.showcase.disappear".equals(str)) {
            startImageAnim("hide");
        } else if (EVENT_MEDIAPLATFORM_SHOW_GOODSPACKAGE.equals(str)) {
            showProductList();
        } else if (!"com.taobao.taolive.room.goods_list_showing".equals(str) || !(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
        } else {
            this.mGoodsBtnGuide.a();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.showcase_show", "com.taobao.taolive.room.showcase_close", "good.showcase.appear", "good.showcase.disappear", EVENT_MEDIAPLATFORM_SHOW_GOODSPACKAGE, "com.taobao.taolive.room.goods_list_showing"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    private String getImageAnimUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("888d15d6", new Object[]{this, str});
        }
        try {
            JSONObject b = pqj.b(hir.ad());
            return (b == null || StringUtils.isEmpty(b.getString(str))) ? STATIC_IMAGE_URL : b.getString(str);
        } catch (JSONException e) {
            q.b(TAG, e.getMessage());
            return STATIC_IMAGE_URL;
        }
    }

    private void scheduleImageAnimTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f10fe1", new Object[]{this});
            return;
        }
        this.imageAnimTimer = new Timer();
        this.imageAnimTask = new TimerTask() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    GoodsIconFrame.access$700(GoodsIconFrame.this, "normal");
                }
            }
        };
        this.imageAnimTimer.schedule(this.imageAnimTask, 12000L, hir.ae() * 1000);
    }

    private void cancelImageAnimTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f782565e", new Object[]{this});
            return;
        }
        TimerTask timerTask = this.imageAnimTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.imageAnimTask = null;
        }
        Timer timer = this.imageAnimTimer;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.imageAnimTimer = null;
    }

    private void startImageAnim(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3362cadb", new Object[]{this, str});
        } else if (this.isAnimating) {
        } else {
            krc krcVar = this.mGoodsBtnGuide;
            if (krcVar != null && krcVar.c()) {
                return;
            }
            if (StringUtils.equals(this.lastAnimType, str)) {
                this.mAuctionImg.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (GoodsIconFrame.access$800(GoodsIconFrame.this) == null) {
                        } else {
                            String str2 = GoodsIconFrame.TAG;
                            q.b(str2, "startImageAnim | same drawable, type=" + str + "lastAnimDrawable=" + GoodsIconFrame.access$800(GoodsIconFrame.this));
                            GoodsIconFrame.access$800(GoodsIconFrame.this).b();
                            GoodsIconFrame.access$900(GoodsIconFrame.this, "normal");
                        }
                    }
                });
                return;
            }
            setVisibilityOnUiThread(this.fakeGoodImage, 0);
            this.lastAnimType = str;
            String imageAnimUrl = getImageAnimUrl(str);
            this.mAuctionImg.setSkipAutoSize(true);
            this.mAuctionImg.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.8
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
                    String str2 = GoodsIconFrame.TAG;
                    q.b(str2, "startImageAnim | different drawable, type=" + str + "lastAnimDrawable=" + GoodsIconFrame.access$800(GoodsIconFrame.this));
                    GoodsIconFrame goodsIconFrame = GoodsIconFrame.this;
                    GoodsIconFrame.access$1100(goodsIconFrame, GoodsIconFrame.access$1000(goodsIconFrame), 8);
                    if (succPhenixEvent.getDrawable() instanceof f) {
                        ((f) succPhenixEvent.getDrawable()).a();
                    }
                    if (succPhenixEvent.getDrawable() instanceof b) {
                        GoodsIconFrame.access$802(GoodsIconFrame.this, (b) succPhenixEvent.getDrawable());
                    }
                    GoodsIconFrame.access$900(GoodsIconFrame.this, str);
                    return false;
                }
            });
            this.mAuctionImg.setImageUrl(imageAnimUrl, STATIC_IMAGE_URL);
        }
    }

    private void startNumAnim(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d025d4c6", new Object[]{this, str});
        } else {
            this.mAuctionNum.animate().alpha(0.0f).setDuration(200L).withEndAction(new AnonymousClass10(StringUtils.equals(str, "normal") ? 2200L : 1200L)).setListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    } else {
                        GoodsIconFrame.access$1202(GoodsIconFrame.this, true);
                    }
                }
            }).start();
        }
    }

    private void setVisibilityOnUiThread(final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a423569", new Object[]{this, view, new Integer(i)});
        } else if (view == null || view.getVisibility() == i) {
        } else {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                view.setVisibility(i);
            } else {
                view.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setVisibility(i);
                        }
                    }
                });
            }
        }
    }

    private boolean hasClickGoodsIconIn7Days() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0576ef3", new Object[]{this})).booleanValue() : System.currentTimeMillis() - ad.b("last_click_goods_icon_time") < ((long) (((hir.af() * 24) * 60) * 60)) * 1000;
    }

    private boolean isImageAnimABEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("834e8fa9", new Object[]{this})).booleanValue() : (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.itemConfigInfo == null || this.mLiveDataModel.mVideoInfo.itemConfigInfo.getIntValue("itemDynamic") != 1) ? false : true;
    }

    private void onShowCaseAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a51d4e", new Object[]{this, view});
        } else {
            hkj.b(this.mAuctionLayout, view);
        }
    }

    private void onHideCaseAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccb1269", new Object[]{this, view});
        } else {
            hkj.a(view, this.mAuctionLayout);
        }
    }

    public static boolean isBlackListRoomType(int i) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("356da558", new Object[]{new Integer(i)})).booleanValue();
        }
        String V = u.V();
        if (StringUtils.isEmpty(V) || (c = pqj.c(V)) == null) {
            return false;
        }
        return c.contains(Integer.valueOf(i));
    }

    private void addOnDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc26ed1f", new Object[]{this});
        } else if (!this.enableNewUIRenderCalibre || getComponentView() == null) {
        } else {
            this.mIsDispatchOnDraw.set(false);
            getComponentView().getViewTreeObserver().addOnDrawListener(this.mOnDrawListener);
        }
    }

    private void removeOnDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c35a42", new Object[]{this});
        } else if (!this.enableNewUIRenderCalibre || getComponentView() == null) {
        } else {
            getComponentView().getViewTreeObserver().removeOnDrawListener(this.mOnDrawListener);
        }
    }
}
