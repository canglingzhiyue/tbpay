package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class VideoShopView extends ShopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String KEY_MUTE_BUTTON_IMAGE_URL;
    private final String KEY_NOT_MUTE_BUTTON_IMAGE_URL;
    private final String KEY_PAUSE_BUTTON_IMAGE_URL;
    private final String KEY_PLAY_BUTTON_IMAGE_URL;
    private final String KEY_SWIPE_DOWN_IMAGE_URL;
    private com.alibaba.triver.triver_shop.container.shopLoft.a embedSecondFloorView;
    private boolean mute;
    private boolean play;
    private String playerViewToken;
    private View secondFloorView;
    private int totalY;
    private FrameLayout videoShopBGLayout;
    private TUrlImageView videoShopBigCardMuteButton;
    private TUrlImageView videoShopBigCardPlayButton;
    private TUrlImageView videoShopBigCardPullDownImage;
    private FrameLayout videoShopCommonBGBlackShadow;
    private FrameLayout videoShopHeaderBGBlackShadow;
    private boolean videoShopMode;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TUrlImageView access$getVideoShopBigCardPlayButton$p;
            String access$getKEY_PAUSE_BUTTON_IMAGE_URL$p;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (VideoShopView.access$getPlay$p(VideoShopView.this)) {
                com.alibaba.triver.triver_shop.container.shopLoft.a access$getEmbedSecondFloorView$p = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p != null) {
                    access$getEmbedSecondFloorView$p.onWebViewPause();
                }
                access$getVideoShopBigCardPlayButton$p = VideoShopView.access$getVideoShopBigCardPlayButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardPlayButton$p == null) {
                    kotlin.jvm.internal.q.b("videoShopBigCardPlayButton");
                    throw null;
                }
                access$getKEY_PAUSE_BUTTON_IMAGE_URL$p = VideoShopView.access$getKEY_PLAY_BUTTON_IMAGE_URL$p(VideoShopView.this);
            } else {
                com.alibaba.triver.triver_shop.container.shopLoft.a access$getEmbedSecondFloorView$p2 = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p2 != null) {
                    access$getEmbedSecondFloorView$p2.onWebViewResume();
                }
                access$getVideoShopBigCardPlayButton$p = VideoShopView.access$getVideoShopBigCardPlayButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardPlayButton$p == null) {
                    kotlin.jvm.internal.q.b("videoShopBigCardPlayButton");
                    throw null;
                }
                access$getKEY_PAUSE_BUTTON_IMAGE_URL$p = VideoShopView.access$getKEY_PAUSE_BUTTON_IMAGE_URL$p(VideoShopView.this);
            }
            access$getVideoShopBigCardPlayButton$p.setImageUrl(access$getKEY_PAUSE_BUTTON_IMAGE_URL$p);
            VideoShopView videoShopView = VideoShopView.this;
            VideoShopView.access$setPlay$p(videoShopView, !VideoShopView.access$getPlay$p(videoShopView));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TUrlImageView access$getVideoShopBigCardMuteButton$p;
            String access$getKEY_MUTE_BUTTON_IMAGE_URL$p;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (VideoShopView.access$getMute$p(VideoShopView.this)) {
                com.alibaba.triver.triver_shop.container.shopLoft.a access$getEmbedSecondFloorView$p = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p != null) {
                    access$getEmbedSecondFloorView$p.b(false);
                }
                access$getVideoShopBigCardMuteButton$p = VideoShopView.access$getVideoShopBigCardMuteButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardMuteButton$p == null) {
                    kotlin.jvm.internal.q.b("videoShopBigCardMuteButton");
                    throw null;
                }
                access$getKEY_MUTE_BUTTON_IMAGE_URL$p = VideoShopView.access$getKEY_NOT_MUTE_BUTTON_IMAGE_URL$p(VideoShopView.this);
            } else {
                com.alibaba.triver.triver_shop.container.shopLoft.a access$getEmbedSecondFloorView$p2 = VideoShopView.access$getEmbedSecondFloorView$p(VideoShopView.this);
                if (access$getEmbedSecondFloorView$p2 != null) {
                    access$getEmbedSecondFloorView$p2.b(true);
                }
                access$getVideoShopBigCardMuteButton$p = VideoShopView.access$getVideoShopBigCardMuteButton$p(VideoShopView.this);
                if (access$getVideoShopBigCardMuteButton$p == null) {
                    kotlin.jvm.internal.q.b("videoShopBigCardMuteButton");
                    throw null;
                }
                access$getKEY_MUTE_BUTTON_IMAGE_URL$p = VideoShopView.access$getKEY_MUTE_BUTTON_IMAGE_URL$p(VideoShopView.this);
            }
            access$getVideoShopBigCardMuteButton$p.setImageUrl(access$getKEY_MUTE_BUTTON_IMAGE_URL$p);
            VideoShopView videoShopView = VideoShopView.this;
            VideoShopView.access$setMute$p(videoShopView, !VideoShopView.access$getMute$p(videoShopView));
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(VideoShopView.this.getContext()).toUri(VideoShopView.access$getJumpUrl(VideoShopView.this));
            }
        }
    }

    static {
        kge.a(-316630739);
    }

    public static /* synthetic */ Object ipc$super(VideoShopView videoShopView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1795598259:
                super.swipeDownStart();
                return null;
            case -1307154377:
                super.setTabViewInVideoShop((View) objArr[0]);
                return null;
            case -322372968:
                super.notifyAllTemplateReady();
                return null;
            case -37299409:
                super.changeToBigCardMode();
                return null;
            case 32895674:
                super.onContainerSwipeUp();
                return null;
            case 267248023:
                super.init();
                return null;
            case 711459142:
                super.swipeDownEnd();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setShopLoftEntrance(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497e740c", new Object[]{this, view});
        } else {
            kotlin.jvm.internal.q.d(view, "view");
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeUpStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686c17f4", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShopView(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.KEY_SWIPE_DOWN_IMAGE_URL = "https://img.alicdn.com/imgextra/i1/O1CN01FgfnlT1jp12NW7WKj_!!6000000004596-1-tps-216-216.gif";
        this.KEY_PLAY_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01lH9Tut1nGtxfZ004N_!!6000000005063-54-tps-72-72.apng";
        this.KEY_PAUSE_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01E4EwcN1YAkSpyXsPj_!!6000000003019-2-tps-120-120.png";
        this.KEY_MUTE_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i4/O1CN01brBYlS1lApTgM2Kc0_!!6000000004779-2-tps-120-120.png";
        this.KEY_NOT_MUTE_BUTTON_IMAGE_URL = "https://gw.alicdn.com/imgextra/i3/O1CN01jGwfUO1Zi0meoCcsg_!!6000000003227-2-tps-120-120.png";
        this.videoShopMode = true;
        this.play = true;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.container.shopLoft.a access$getEmbedSecondFloorView$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.a) ipChange.ipc$dispatch("5a36b8c9", new Object[]{videoShopView}) : videoShopView.embedSecondFloorView;
    }

    public static final /* synthetic */ Uri access$getJumpUrl(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("454d97b9", new Object[]{videoShopView}) : videoShopView.getJumpUrl();
    }

    public static final /* synthetic */ String access$getKEY_MUTE_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59d8e3cd", new Object[]{videoShopView}) : videoShopView.KEY_MUTE_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ String access$getKEY_NOT_MUTE_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("592cc141", new Object[]{videoShopView}) : videoShopView.KEY_NOT_MUTE_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ String access$getKEY_PAUSE_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("778a1bdc", new Object[]{videoShopView}) : videoShopView.KEY_PAUSE_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ String access$getKEY_PLAY_BUTTON_IMAGE_URL$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e7e554d2", new Object[]{videoShopView}) : videoShopView.KEY_PLAY_BUTTON_IMAGE_URL;
    }

    public static final /* synthetic */ boolean access$getMute$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f32d196", new Object[]{videoShopView})).booleanValue() : videoShopView.mute;
    }

    public static final /* synthetic */ boolean access$getPlay$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfa413db", new Object[]{videoShopView})).booleanValue() : videoShopView.play;
    }

    public static final /* synthetic */ TUrlImageView access$getVideoShopBigCardMuteButton$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("b61610fb", new Object[]{videoShopView}) : videoShopView.videoShopBigCardMuteButton;
    }

    public static final /* synthetic */ TUrlImageView access$getVideoShopBigCardPlayButton$p(VideoShopView videoShopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("b6a24a56", new Object[]{videoShopView}) : videoShopView.videoShopBigCardPlayButton;
    }

    public static final /* synthetic */ void access$processEvent(VideoShopView videoShopView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deef7e4", new Object[]{videoShopView, str, jSONObject});
        } else {
            videoShopView.processEvent(str, jSONObject);
        }
    }

    public static final /* synthetic */ void access$setMute$p(VideoShopView videoShopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb6e78e", new Object[]{videoShopView, new Boolean(z)});
        } else {
            videoShopView.mute = z;
        }
    }

    public static final /* synthetic */ void access$setPlay$p(VideoShopView videoShopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796dede9", new Object[]{videoShopView, new Boolean(z)});
        } else {
            videoShopView.play = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean getVideoShopMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b7c2d29", new Object[]{this})).booleanValue() : this.videoShopMode;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setVideoShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb35ac5b", new Object[]{this, new Boolean(z)});
        } else {
            this.videoShopMode = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        setScrollThreshold(5);
        ceg.Companion.b("videoShop init");
        View findViewById = findViewById(R.id.shopView_videoShop_bg);
        kotlin.jvm.internal.q.b(findViewById, "findViewById(R.id.shopView_videoShop_bg)");
        this.videoShopBGLayout = (FrameLayout) findViewById;
        com.alibaba.triver.triver_shop.newShop.ext.o.e(getBottomContainer());
        updateBottomGuidLineEnd(0);
        initVideoShopHeaderBG();
        initVideoShopCommonBG();
    }

    private final void initBigCardIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151b73d9", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_video_shop_big_card, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.view_video_shop_big_card_play_button);
        kotlin.jvm.internal.q.b(findViewById, "bigCardBg.findViewById(R.id.view_video_shop_big_card_play_button)");
        this.videoShopBigCardPlayButton = (TUrlImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.view_video_shop_big_card_mute_button);
        kotlin.jvm.internal.q.b(findViewById2, "bigCardBg.findViewById(R.id.view_video_shop_big_card_mute_button)");
        this.videoShopBigCardMuteButton = (TUrlImageView) findViewById2;
        ViewGroup contentView = (ViewGroup) inflate.findViewById(R.id.view_video_shop_big_card_content);
        View findViewById3 = inflate.findViewById(R.id.view_video_shop_big_card_pull_down_img);
        kotlin.jvm.internal.q.b(findViewById3, "bigCardBg.findViewById(R.id.view_video_shop_big_card_pull_down_img)");
        this.videoShopBigCardPullDownImage = (TUrlImageView) findViewById3;
        TUrlImageView tUrlImageView = this.videoShopBigCardPullDownImage;
        if (tUrlImageView == null) {
            kotlin.jvm.internal.q.b("videoShopBigCardPullDownImage");
            throw null;
        }
        tUrlImageView.setImageUrl(this.KEY_SWIPE_DOWN_IMAGE_URL);
        this.secondFloorView = inflate;
        JSONObject ax = getShopData().ax();
        String U = getShopData().U();
        String str = "";
        if (U == null) {
            U = str;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = kotlin.j.a("sellerId", U);
        pairArr[1] = kotlin.j.a("contentId", com.alibaba.triver.triver_shop.newShop.ext.d.c(ax, "id"));
        pairArr[2] = kotlin.j.a("contentType", com.alibaba.triver.triver_shop.newShop.ext.d.c(ax, "sceneId"));
        if (ax != null) {
            str = ax.toJSONString();
        }
        pairArr[3] = kotlin.j.a("contentData", str);
        Map<String, String> a2 = ai.a(pairArr);
        this.embedSecondFloorView = new com.alibaba.triver.triver_shop.container.shopLoft.a();
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar = this.embedSecondFloorView;
        kotlin.jvm.internal.q.a(aVar);
        aVar.a(new VideoShopView$initBigCardIfNeeded$1(this));
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar2 = this.embedSecondFloorView;
        kotlin.jvm.internal.q.a(aVar2);
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        aVar2.a((Activity) context);
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar3 = this.embedSecondFloorView;
        kotlin.jvm.internal.q.a(aVar3);
        aVar3.onCreate(new HashMap());
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar4 = this.embedSecondFloorView;
        kotlin.jvm.internal.q.a(aVar4);
        View view = aVar4.getView(-1, -1, "", "", a2);
        FrameLayout frameLayout = this.videoShopBGLayout;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("videoShopBGLayout");
            throw null;
        }
        frameLayout.addView(this.secondFloorView);
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar5 = this.embedSecondFloorView;
        kotlin.jvm.internal.q.a(aVar5);
        aVar5.onAttachedToWebView();
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar6 = this.embedSecondFloorView;
        kotlin.jvm.internal.q.a(aVar6);
        aVar6.onWebViewResume();
        if (view != null) {
            kotlin.jvm.internal.q.b(contentView, "contentView");
            com.alibaba.triver.triver_shop.newShop.ext.o.a(contentView, view);
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(this, new VideoShopView$initBigCardIfNeeded$3(this));
        Context context2 = getContext();
        kotlin.jvm.internal.q.b(context2, "context");
        if (com.alibaba.triver.triver_shop.newShop.ext.b.b(context2)) {
            TUrlImageView tUrlImageView2 = this.videoShopBigCardPlayButton;
            if (tUrlImageView2 == null) {
                kotlin.jvm.internal.q.b("videoShopBigCardPlayButton");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.d(tUrlImageView2);
        }
        TUrlImageView tUrlImageView3 = this.videoShopBigCardPlayButton;
        if (tUrlImageView3 == null) {
            kotlin.jvm.internal.q.b("videoShopBigCardPlayButton");
            throw null;
        }
        tUrlImageView3.setImageUrl(this.KEY_PAUSE_BUTTON_IMAGE_URL);
        TUrlImageView tUrlImageView4 = this.videoShopBigCardPlayButton;
        if (tUrlImageView4 == null) {
            kotlin.jvm.internal.q.b("videoShopBigCardPlayButton");
            throw null;
        }
        tUrlImageView4.setOnClickListener(new a());
        TUrlImageView tUrlImageView5 = this.videoShopBigCardMuteButton;
        if (tUrlImageView5 == null) {
            kotlin.jvm.internal.q.b("videoShopBigCardMuteButton");
            throw null;
        }
        tUrlImageView5.setImageUrl(this.KEY_MUTE_BUTTON_IMAGE_URL);
        TUrlImageView tUrlImageView6 = this.videoShopBigCardMuteButton;
        if (tUrlImageView6 == null) {
            kotlin.jvm.internal.q.b("videoShopBigCardMuteButton");
            throw null;
        }
        tUrlImageView6.setOnClickListener(new b());
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar7 = this.embedSecondFloorView;
        if (aVar7 != null) {
            aVar7.b(true);
        }
        contentView.setOnClickListener(new c());
    }

    private final void processEvent(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512c8b4", new Object[]{this, str, jSONObject});
        } else if (!kotlin.jvm.internal.q.a((Object) "message", (Object) str)) {
        } else {
            String str2 = null;
            if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null) {
                str2 = jSONObject2.getString("playerViewToken");
            }
            this.playerViewToken = str2;
        }
    }

    private final Uri getJumpUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("8aa69a69", new Object[]{this}) : com.alibaba.triver.triver_shop.newShop.ext.h.a(getShopData(), this.playerViewToken, (JSONObject) null, 4, (Object) null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        try {
            Result.a aVar = Result.Companion;
            com.alibaba.triver.triver_shop.container.shopLoft.a aVar2 = this.embedSecondFloorView;
            if (aVar2 == null) {
                tVar = null;
            } else {
                aVar2.onDestroy();
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void changeToBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6db2f", new Object[]{this});
            return;
        }
        super.changeToBigCardMode();
        initBigCardIfNeeded();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        super.onActivityResumed();
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar = this.embedSecondFloorView;
        if (aVar == null) {
            return;
        }
        aVar.onWebViewResume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.onActivityPaused();
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar = this.embedSecondFloorView;
        if (aVar == null) {
            return;
        }
        aVar.onWebViewPause();
    }

    private final void initVideoShopCommonBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1bd578", new Object[]{this});
            return;
        }
        this.videoShopCommonBGBlackShadow = new FrameLayout(getContext());
        int parseColor = Color.parseColor("#4c000000");
        int parseColor2 = Color.parseColor("#66000000");
        int parseColor3 = Color.parseColor("#7f000000");
        int parseColor4 = Color.parseColor("#99000000");
        int parseColor5 = Color.parseColor("#b2000000");
        int parseColor6 = Color.parseColor("#cc000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, kotlin.collections.g.a(new Integer[]{0, 0, 0, Integer.valueOf(parseColor), Integer.valueOf(parseColor2), Integer.valueOf(parseColor3), Integer.valueOf(parseColor4), Integer.valueOf(parseColor5), Integer.valueOf(parseColor6), Integer.valueOf(parseColor6)}));
        gradientDrawable.setGradientType(0);
        FrameLayout frameLayout = this.videoShopCommonBGBlackShadow;
        if (frameLayout != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout, gradientDrawable);
        } else {
            kotlin.jvm.internal.q.b("videoShopCommonBGBlackShadow");
            throw null;
        }
    }

    private final void initVideoShopHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b990c9a", new Object[]{this});
            return;
        }
        this.videoShopHeaderBGBlackShadow = new FrameLayout(getContext());
        int parseColor = Color.parseColor("#b2000000");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, kotlin.collections.g.a(new Integer[]{Integer.valueOf(parseColor), Integer.valueOf(parseColor)}));
        gradientDrawable.setGradientType(0);
        FrameLayout frameLayout = this.videoShopHeaderBGBlackShadow;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("videoShopHeaderBGBlackShadow");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout, gradientDrawable);
        FrameLayout frameLayout2 = this.videoShopHeaderBGBlackShadow;
        if (frameLayout2 != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.d(frameLayout2);
        } else {
            kotlin.jvm.internal.q.b("videoShopHeaderBGBlackShadow");
            throw null;
        }
    }

    public final void setVideoShopBackgroundPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbb4153", new Object[]{this, str});
            return;
        }
        if (str == null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, kotlin.collections.g.a(new Integer[]{Integer.valueOf(Color.parseColor("#CCC8CB")), Integer.valueOf(Color.parseColor("#9BB8CE"))}));
            gradientDrawable.setGradientType(0);
            FrameLayout frameLayout = this.videoShopBGLayout;
            if (frameLayout == null) {
                kotlin.jvm.internal.q.b("videoShopBGLayout");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout, gradientDrawable);
            FrameLayout frameLayout2 = this.videoShopBGLayout;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.q.b("videoShopBGLayout");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.b(frameLayout2);
        } else {
            TUrlImageView tUrlImageView = new TUrlImageView(getContext());
            tUrlImageView.setImageUrl(str);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            FrameLayout frameLayout3 = this.videoShopBGLayout;
            if (frameLayout3 == null) {
                kotlin.jvm.internal.q.b("videoShopBGLayout");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout3, tUrlImageView);
            FrameLayout frameLayout4 = this.videoShopBGLayout;
            if (frameLayout4 == null) {
                kotlin.jvm.internal.q.b("videoShopBGLayout");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.b(frameLayout4);
            FrameLayout frameLayout5 = this.videoShopBGLayout;
            if (frameLayout5 == null) {
                kotlin.jvm.internal.q.b("videoShopBGLayout");
                throw null;
            }
            FrameLayout frameLayout6 = frameLayout5;
            FrameLayout frameLayout7 = this.videoShopCommonBGBlackShadow;
            if (frameLayout7 == null) {
                kotlin.jvm.internal.q.b("videoShopCommonBGBlackShadow");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout6, frameLayout7);
        }
        FrameLayout frameLayout8 = this.videoShopBGLayout;
        if (frameLayout8 == null) {
            kotlin.jvm.internal.q.b("videoShopBGLayout");
            throw null;
        }
        FrameLayout frameLayout9 = frameLayout8;
        FrameLayout frameLayout10 = this.videoShopHeaderBGBlackShadow;
        if (frameLayout10 != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(frameLayout9, frameLayout10);
        } else {
            kotlin.jvm.internal.q.b("videoShopHeaderBGBlackShadow");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeUpEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3047ead", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getSecondHeadContainer());
        for (int i = 0; i < getSecondHeadContainer().getChildCount(); i++) {
            View child = getSecondHeadContainer().getChildAt(i);
            if (!kotlin.jvm.internal.q.a(getSecondHeadContainer().getChildAt(i), getVideoShopTabView()) && child.getVisibility() == 0) {
                kotlin.jvm.internal.q.b(child, "child");
                com.alibaba.triver.triver_shop.newShop.ext.o.d(child);
            }
        }
        FrameLayout frameLayout = this.videoShopHeaderBGBlackShadow;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("videoShopHeaderBGBlackShadow");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(frameLayout);
        if (!getBigCardMode()) {
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar = this.embedSecondFloorView;
        if (aVar != null) {
            aVar.onWebViewPause();
        }
        View view = this.secondFloorView;
        if (view == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(view);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f9584d", new Object[]{this});
            return;
        }
        super.swipeDownStart();
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getSecondHeadContainer());
        for (int i = 0; i < getSecondHeadContainer().getChildCount(); i++) {
            View child = getSecondHeadContainer().getChildAt(i);
            if (!kotlin.jvm.internal.q.a(getSecondHeadContainer().getChildAt(i), getVideoShopTabView()) && child.getVisibility() == 4) {
                kotlin.jvm.internal.q.b(child, "child");
                com.alibaba.triver.triver_shop.newShop.ext.o.b(child);
            }
        }
        FrameLayout frameLayout = this.videoShopHeaderBGBlackShadow;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("videoShopHeaderBGBlackShadow");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(frameLayout);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a680146", new Object[]{this});
            return;
        }
        super.swipeDownEnd();
        if (!getBigCardMode()) {
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.a aVar = this.embedSecondFloorView;
        if (aVar != null) {
            aVar.onWebViewResume();
        }
        View view = this.secondFloorView;
        if (view == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(view);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onContainerSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f2ba", new Object[]{this});
            return;
        }
        setAnimationUpReservedHeight(getVideoShopTabView().getHeight());
        super.onContainerSwipeUp();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        if (getFirstHeadContainer().getHeight() == 0 || getSecondHeadContainer().getHeight() == 0 || getVideoShopTabView().getHeight() == 0) {
            return 0;
        }
        setAnimationUpReservedHeight(getVideoShopTabView().getHeight());
        return ((getHeight() - getStatusBarSize()) - getFirstHeadContainer().getHeight()) - getAnimationUpReservedHeight();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setTabViewInVideoShop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2166837", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        super.setTabViewInVideoShop(view);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void notifyAllTemplateReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc8fa98", new Object[]{this});
        } else {
            super.notifyAllTemplateReady();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.b(this, new VideoShopView$updateContentTopMargin$1(this, z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateSubPageChanged(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f7009", new Object[]{this, new Boolean(z), str});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.b(this, new VideoShopView$updateSubPageChanged$1(this, z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getSwipeDownDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue() : getSecondHeadContainer().getHeight() - getVideoShopTabView().getHeight();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.d(fromTargetView, "fromTargetView");
        kotlin.jvm.internal.q.d(event, "event");
        if (!getBigCardMode() || getHeaderHide()) {
            return;
        }
        if (!kotlin.jvm.internal.q.a(fromTargetView, getCenterContainer()) && com.alibaba.triver.triver_shop.newShop.ext.o.a(getCenterContainer(), (int) event.getRawX(), (int) event.getRawY())) {
            return;
        }
        int c2 = ((com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 1000) - getCommonSecondView().getHeight()) - getFirstHeadContainer().getHeight()) - getStatusBarSize();
        int h = com.alibaba.triver.triver_shop.newShop.ext.o.h(getVideoShopTabView());
        if (h - c2 < 600) {
            int i2 = h + i;
            if (i2 - c2 < 600) {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(getVideoShopTabView(), i2);
                updateContentTopMargin(getInHomePage());
            }
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.c(getVideoShopTabView(), c2);
        Nav.from(getContext()).toUri(getJumpUrl());
        updateContentTopMargin(getInHomePage());
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View fromTargetView, MotionEvent event, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.d(fromTargetView, "fromTargetView");
        kotlin.jvm.internal.q.d(event, "event");
        if (!getBigCardMode() || getHeaderHide()) {
            return;
        }
        if (!kotlin.jvm.internal.q.a(fromTargetView, getCenterContainer()) && com.alibaba.triver.triver_shop.newShop.ext.o.a(getCenterContainer(), (int) event.getRawX(), (int) event.getRawY())) {
            return;
        }
        int c2 = ((com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 1000) - getCommonSecondView().getHeight()) - getFirstHeadContainer().getHeight()) - getStatusBarSize();
        int h = com.alibaba.triver.triver_shop.newShop.ext.o.h(getVideoShopTabView());
        if (h <= c2 || (i2 = h - i) <= c2) {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(getVideoShopTabView(), c2);
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(getVideoShopTabView(), i2);
        }
        updateContentTopMargin(getInHomePage());
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.d(event, "event");
        if (!getBigCardMode() || getHeaderHide()) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.c(getVideoShopTabView(), ((com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 1000) - getCommonSecondView().getHeight()) - getFirstHeadContainer().getHeight()) - getStatusBarSize());
        updateContentTopMargin(getInHomePage());
    }
}
