package com.taobao.android.live.plugin.proxy.gift;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.taolive.room.adapter.alphavideo.VideoGiftView;
import tb.bxg;
import tb.bxh;
import tb.jbv;
import tb.jby;
import tb.jca;
import tb.jcb;
import tb.kge;

/* loaded from: classes6.dex */
public class GiftProxy extends g<IGiftProxy> implements IGiftProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GiftProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final GiftProxy f14109a;

        static {
            kge.a(-1557538492);
            f14109a = new GiftProxy();
        }

        public static /* synthetic */ GiftProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GiftProxy) ipChange.ipc$dispatch("8ae4b2ed", new Object[0]) : f14109a;
        }
    }

    static {
        kge.a(-343643092);
        kge.a(1260525927);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IGiftProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.GiftProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "礼物库";
    }

    public static GiftProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GiftProxy) ipChange.ipc$dispatch("677c7e97", new Object[0]) : a.a();
    }

    private GiftProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[GiftProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public Class<? extends BaseFrame> getGiftFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("585e1705", new Object[]{this});
        }
        IGiftProxy real = getReal();
        Class<? extends BaseFrame> giftFrameClass = real != null ? real.getGiftFrameClass() : null;
        e.c("[GiftProxy#getGiftFrameClass]  clazz: " + giftFrameClass);
        return giftFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void adjustGiftBottomHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47237cb", new Object[]{this, new Integer(i)});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.adjustGiftBottomHeight(i);
        }
        e.c("[GiftProxy#adjustGiftBottomHeight]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public bxg createResourceDownloaderManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxg) ipChange.ipc$dispatch("d96bd400", new Object[]{this});
        }
        IGiftProxy real = getReal();
        bxg createResourceDownloaderManager = real != null ? real.createResourceDownloaderManager() : null;
        e.c("[GiftProxy#createResourceDownloaderManager]  value: " + createResourceDownloaderManager);
        return createResourceDownloaderManager;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public boolean enableBigGift() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e1fb958", new Object[]{this})).booleanValue();
        }
        IGiftProxy real = getReal();
        if (real != null) {
            z = real.enableBigGift();
        }
        e.c("[GiftProxy#enableBigGift]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void setGuestSendGiftEffectStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42583c", new Object[]{this, new Boolean(z)});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.setGuestSendGiftEffectStatus(z);
        }
        e.c("[GiftProxy#setGuestSendGiftEffectStatus]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void clearGiftQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3987b", new Object[]{this});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.clearGiftQueue();
        }
        e.c("[GiftProxy#clearGiftQueue]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public boolean enableMD5FileCheck() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f1de1c", new Object[]{this})).booleanValue();
        }
        IGiftProxy real = getReal();
        if (real != null) {
            z = real.enableMD5FileCheck();
        }
        e.c("[GiftProxy#enableMD5FileCheck]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public boolean enablePresaleScreenGift() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbbd0c8e", new Object[]{this})).booleanValue();
        }
        IGiftProxy real = getReal();
        if (real != null) {
            z = real.enablePresaleScreenGift();
        }
        e.c("[GiftProxy#enablePresaleScreenGift]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void adjustSmallHeightInAliveScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3cced9", new Object[]{this, new Integer(i)});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.adjustSmallHeightInAliveScene(i);
        }
        e.c("[GiftProxy#adjustSmallHeightInAliveScene]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void init(Context context, ViewStub viewStub, bxh bxhVar, jcb jcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb754f8", new Object[]{this, context, viewStub, bxhVar, jcbVar});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.init(context, viewStub, bxhVar, jcbVar);
        }
        e.c("[GiftProxy#init]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void setLogImpl(jby jbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb0d7d8", new Object[]{this, jbyVar});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.setLogImpl(jbyVar);
        }
        e.c("[GiftProxy#setLogImpl]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void enableVideoGift(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4c4fe0", new Object[]{this, videoGiftView});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.enableVideoGift(videoGiftView);
        }
        e.c("[GiftProxy#enableVideoGift]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void sendGift(TBLiveGiftEntity tBLiveGiftEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c2c7b2", new Object[]{this, tBLiveGiftEntity});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.sendGift(tBLiveGiftEntity);
        }
        e.c("[GiftProxy#sendGift]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IGiftProxy real = getReal();
        if (real != null) {
            real.destroy();
        }
        e.c("[GiftProxy#destroy]");
    }

    @Override // com.taobao.android.live.plugin.proxy.gift.IGiftProxy
    public bxh createTBLiveGiftConfig(jca jcaVar, jbv jbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxh) ipChange.ipc$dispatch("b5f7e70b", new Object[]{this, jcaVar, jbvVar});
        }
        IGiftProxy real = getReal();
        bxh createTBLiveGiftConfig = real != null ? real.createTBLiveGiftConfig(jcaVar, jbvVar) : null;
        e.c("[GiftProxy#createTBLiveGiftConfig]  value: " + createTBLiveGiftConfig);
        return createTBLiveGiftConfig;
    }
}
