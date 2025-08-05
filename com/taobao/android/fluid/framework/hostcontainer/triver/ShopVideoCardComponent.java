package com.taobao.android.fluid.framework.hostcontainer.triver;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.h;
import com.taobao.android.fluid.framework.DefaultFluidInitialize;
import com.taobao.android.fluid.framework.adapter.ShareAdapter;
import com.taobao.android.fluid.framework.c;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.ut.share.business.ShareContent;
import java.net.URLEncoder;
import java.util.Map;
import tb.kge;
import tb.ocb;
import tb.odz;
import tb.snf;
import tb.sni;
import tb.spz;

/* loaded from: classes5.dex */
public class ShopVideoCardComponent implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShopVideoCardComponent";
    private VideoCardData data;
    private Context mContext;
    private FluidInstance mFluidInstance;
    private boolean mHasInit = false;
    private boolean mIsAppear;
    private Map mPageProperties;
    private b.c mShopLoftViewActionCallback;

    static {
        kge.a(1836111648);
        kge.a(-563039837);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "Page_videointeract";
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    public static /* synthetic */ Map access$002(ShopVideoCardComponent shopVideoCardComponent, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8237cbf2", new Object[]{shopVideoCardComponent, map});
        }
        shopVideoCardComponent.mPageProperties = map;
        return map;
    }

    public static /* synthetic */ b.c access$100(ShopVideoCardComponent shopVideoCardComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.c) ipChange.ipc$dispatch("b1a3a2a9", new Object[]{shopVideoCardComponent}) : shopVideoCardComponent.mShopLoftViewActionCallback;
    }

    public static /* synthetic */ boolean access$200(ShopVideoCardComponent shopVideoCardComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df7ef98c", new Object[]{shopVideoCardComponent})).booleanValue() : shopVideoCardComponent.mIsAppear;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.data = (VideoCardData) JSON.toJavaObject(jSONObject, VideoCardData.class);
        this.mShopLoftViewActionCallback = cVar;
        if (this.data == null) {
            spz.c(TAG, "data==null");
            return;
        }
        spz.c(TAG, "initWithData " + this.data.description + " - " + this);
        initVideoController(context);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        spz.c(TAG, "willAppear - " + this);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        spz.c(TAG, "didAppear - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return;
        }
        fluidInstance.onCreate();
        this.mFluidInstance.onResume();
        this.mIsAppear = true;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        spz.c(TAG, "willDisappear - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return;
        }
        fluidInstance.onPause();
        this.mFluidInstance.onStop();
        this.mIsAppear = false;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        spz.c(TAG, "didDisappear - " + this);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IMediaService iMediaService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        spz.c(TAG, "play - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null || !(this.mContext instanceof Activity) || (iMediaService = (IMediaService) fluidInstance.getService(IMediaService.class)) == null) {
            return;
        }
        iMediaService.resumeCurrentVideo();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IMediaService iMediaService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        spz.c(TAG, "pause - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null || (iMediaService = (IMediaService) fluidInstance.getService(IMediaService.class)) == null) {
            return;
        }
        iMediaService.pauseCurrentVideo();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c(TAG, "mute - " + this);
        if (this.mFluidInstance == null) {
            return;
        }
        try {
            if (z) {
                f.a().h(this.mFluidInstance);
            } else {
                f.a().g(this.mFluidInstance);
            }
        } catch (Exception e) {
            spz.a(TAG, "MuteHelper 异常", e);
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        spz.c(TAG, "startAnimation - " + this);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
            return;
        }
        spz.c(TAG, "endAnimation - " + this);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        spz.c(TAG, "onDestroyed - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return;
        }
        fluidInstance.cI_();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null || !this.mIsAppear) {
            return;
        }
        fluidInstance.onResume();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null || !this.mIsAppear) {
            return;
        }
        fluidInstance.onPause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
            return;
        }
        spz.c(TAG, "onPageStable - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return;
        }
        ((IContainerService) fluidInstance.getService(IContainerService.class)).preRender();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16970404", new Object[]{this}) : this.mPageProperties;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        spz.c(TAG, "getView - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            return ((IContainerService) fluidInstance.getService(IContainerService.class)).getContentView();
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        spz.c(TAG, "getShareContent - " + this);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return null;
        }
        a currentMediaSetData = ((IDataService) fluidInstance.getService(IDataService.class)).getCurrentMediaSetData();
        return ShareAdapter.getShareContent(this.mFluidInstance, null, currentMediaSetData != null ? currentMediaSetData.a() : null, null);
    }

    private void checkInit(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d32de9", new Object[]{this, context});
        } else if (this.mHasInit) {
        } else {
            DefaultFluidInitialize.init(context.getApplicationContext());
            this.mHasInit = true;
        }
    }

    private void initVideoController(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85b8f3a", new Object[]{this, context});
            return;
        }
        checkInit(context);
        if (this.mFluidInstance != null) {
            return;
        }
        this.mContext = context;
        odz odzVar = new odz();
        odzVar.b(this.data.coverPicUrl);
        odzVar.a(ocb.a(this.data.coverPicWidth));
        odzVar.b(ocb.a(this.data.coverPicHeight));
        String str = this.data.url;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(this.data.shareUrl)) {
            try {
                str = str + "&shareUrl=" + URLEncoder.encode(this.data.shareUrl, "UTF-8");
            } catch (Exception e) {
                spz.a(TAG, "", e);
            }
        }
        try {
            FluidInstanceConfig.a a2 = FluidInstanceConfig.a.a().a(context).a(new FrameLayout(context)).a(new h() { // from class: com.taobao.android.fluid.framework.hostcontainer.triver.ShopVideoCardComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.core.h
                public void a(Map map, Map map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
                    } else if (map == null) {
                    } else {
                        ShopVideoCardComponent.access$002(ShopVideoCardComponent.this, map);
                    }
                }
            }).a("shortvideo").e("videoFullScreen").e((Boolean) true).c("shopLoft").b(FluidInstanceConfig.appendBizName("shopLoft")).a(str, Uri.parse(str)).a(odzVar);
            if (!snf.b()) {
                z = true;
            }
            this.mFluidInstance = FluidSDK.createFluidInstance(a2.g(Boolean.valueOf(z)).a(new c()).b());
            this.mFluidInstance.onCreate();
            ((ISceneConfigService) this.mFluidInstance.getService(ISceneConfigService.class)).setLockListListener(new sni() { // from class: com.taobao.android.fluid.framework.hostcontainer.triver.ShopVideoCardComponent.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public boolean f12581a;

                @Override // tb.sni
                public void a(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                    } else if (ShopVideoCardComponent.access$100(ShopVideoCardComponent.this) == null || this.f12581a || !ShopVideoCardComponent.access$200(ShopVideoCardComponent.this)) {
                    } else {
                        ShopVideoCardComponent.access$100(ShopVideoCardComponent.this).a(z2 ? b.c.EVENT_ON_SCROLL_DISABLE : b.c.EVENT_ON_SCROLL_ENABLE, null);
                        spz.c(ShopVideoCardComponent.TAG, "onLockList - " + z2);
                    }
                }

                @Override // tb.sni
                public void b(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z2)});
                        return;
                    }
                    if (ShopVideoCardComponent.access$100(ShopVideoCardComponent.this) != null) {
                        ShopVideoCardComponent.access$100(ShopVideoCardComponent.this).a(z2 ? b.c.EVENT_ON_SCROLL_DISABLE : b.c.EVENT_ON_SCROLL_ENABLE, null);
                        spz.c(ShopVideoCardComponent.TAG, "onGoodsListShowHide - " + z2);
                    }
                    this.f12581a = z2;
                }
            });
            ((IContainerService) this.mFluidInstance.getService(IContainerService.class)).renderContainer(context);
        } catch (Throwable th) {
            FluidException.throwException((FluidContext) null, FluidInstance.INSTANCE_CREATE_INSTANCE_ERROR, th);
        }
    }
}
