package com.taobao.android.live.plugin.proxy.panel;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.kge;

/* loaded from: classes6.dex */
public class PanelProxy extends g<IPanelProxy> implements IPanelProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PanelProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final PanelProxy f14121a;

        static {
            kge.a(-1342647090);
            f14121a = new PanelProxy();
        }

        public static /* synthetic */ PanelProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PanelProxy) ipChange.ipc$dispatch("26d0be77", new Object[0]) : f14121a;
        }
    }

    static {
        kge.a(1269364706);
        kge.a(-1184645637);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IPanelProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.PanelProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLivePanelPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "面板";
    }

    public static PanelProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PanelProxy) ipChange.ipc$dispatch("3ca447a1", new Object[0]) : a.a();
    }

    private PanelProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[PanelProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getBlankFrame2Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9359d849", new Object[]{this});
        }
        IPanelProxy real = getReal();
        Class<? extends BaseFrame> blankFrame2Class = real != null ? real.getBlankFrame2Class() : null;
        e.c("[PanelProxy#getBlankFrame2Class]  value: " + blankFrame2Class);
        return blankFrame2Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Show(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a0d199", new Object[]{this, obj});
            return;
        }
        IPanelProxy real = getReal();
        if (real == null) {
            return;
        }
        real.blankFrame2Show(obj);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Hide(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeca21e", new Object[]{this, obj});
            return;
        }
        IPanelProxy real = getReal();
        if (real == null) {
            return;
        }
        real.blankFrame2Hide(obj);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getWatermarkFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("12434758", new Object[]{this});
        }
        IPanelProxy real = getReal();
        Class<? extends BaseFrame> watermarkFrame3Class = real != null ? real.getWatermarkFrame3Class() : null;
        e.c("[PanelProxy#getWatermarkFrame3Class]  value: " + watermarkFrame3Class);
        return watermarkFrame3Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getVirtualAnchorSignFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("cf47866", new Object[]{this});
        }
        IPanelProxy real = getReal();
        Class<? extends BaseFrame> virtualAnchorSignFrameClass = real != null ? real.getVirtualAnchorSignFrameClass() : null;
        e.c("[PanelProxy#getVirtualAnchorSignFrameClass]  value: " + virtualAnchorSignFrameClass);
        return virtualAnchorSignFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getVirtualAnchorSignFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("3f86a224", new Object[]{this, context, aVar});
        }
        IPanelProxy real = getReal();
        BaseFrame virtualAnchorSignFrame = real != null ? real.getVirtualAnchorSignFrame(context, aVar) : null;
        e.c("[PanelProxy#getVirtualAnchorSignFrame]  value: " + virtualAnchorSignFrame);
        return virtualAnchorSignFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getTopSelectCommentFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("79842ac3", new Object[]{this});
        }
        IPanelProxy real = getReal();
        Class<? extends BaseFrame> topSelectCommentFrameClass = real != null ? real.getTopSelectCommentFrameClass() : null;
        e.c("[PanelProxy#getTopSelectCommentFrameClass]  value: " + topSelectCommentFrameClass);
        return topSelectCommentFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getLiveEndFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c28d9e38", new Object[]{this});
        }
        IPanelProxy real = getReal();
        Class<? extends BaseFrame> liveEndFrameClass = real != null ? real.getLiveEndFrameClass() : null;
        e.c("[PanelProxy#getLiveEndFrameClass]  value: " + liveEndFrameClass);
        return liveEndFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("7291d1e6", new Object[]{this, context, aVar});
        }
        IPanelProxy real = getReal();
        BaseFrame liveAvatarNewFrame = real != null ? real.getLiveAvatarNewFrame(context, aVar) : null;
        e.c("[PanelProxy#getLiveAvatarNewFrame]  value: " + liveAvatarNewFrame);
        return liveAvatarNewFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("900cfdae", new Object[]{this, context, new Boolean(z), tBLiveDataModel});
        }
        IPanelProxy real = getReal();
        BaseFrame liveAvatarNewFrame = real != null ? real.getLiveAvatarNewFrame(context, z, tBLiveDataModel) : null;
        e.c("[PanelProxy#getLiveAvatarNewFrame]  value: " + liveAvatarNewFrame);
        return liveAvatarNewFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getTopFakeBarFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("d495588c", new Object[]{this, context, aVar});
        }
        IPanelProxy real = getReal();
        BaseFrame topFakeBarFrame = real != null ? real.getTopFakeBarFrame(context, aVar) : null;
        e.c("[PanelProxy#getLiveAvatarNewFrame]  value: " + topFakeBarFrame);
        return topFakeBarFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getShowcaseFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("9461bc63", new Object[]{this, context, aVar, liveItem});
        }
        IPanelProxy real = getReal();
        BaseFrame showcaseFrame = real != null ? real.getShowcaseFrame(context, aVar, liveItem) : null;
        e.c("[PanelProxy#getShowcaseFrame]  value: " + showcaseFrame);
        return showcaseFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Object iniChatPreProcessor3(com.taobao.alilive.aliliveframework.frame.a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e7c644a0", new Object[]{this, aVar, context});
        }
        IPanelProxy real = getReal();
        Object iniChatPreProcessor3 = real != null ? real.iniChatPreProcessor3(aVar, context) : null;
        e.c("[PanelProxy#iniChatPreProcessor3]  value: " + iniChatPreProcessor3);
        return iniChatPreProcessor3;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void preProcessChat(Object obj, String str, int i, com.taobao.android.live.plugin.proxy.panel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9c1398", new Object[]{this, obj, str, new Integer(i), aVar});
            return;
        }
        IPanelProxy real = getReal();
        if (real != null) {
            real.preProcessChat(obj, str, i, aVar);
        }
        e.c("[PanelProxy#preProcessChat]  ");
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void destoryChatPreProcessor3(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2434c5b", new Object[]{this, obj});
            return;
        }
        IPanelProxy real = getReal();
        if (real != null) {
            real.destoryChatPreProcessor3(obj);
        }
        e.c("[PanelProxy#destoryChatPreProcessor3]  ");
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getLiveReadyFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ef36a980", new Object[]{this});
        }
        IPanelProxy real = getReal();
        Class<? extends BaseFrame> liveReadyFrameClass = real != null ? real.getLiveReadyFrameClass() : null;
        e.c("[PanelProxy#getLiveReadyFrameClass]  value: " + liveReadyFrameClass);
        return liveReadyFrameClass;
    }
}
