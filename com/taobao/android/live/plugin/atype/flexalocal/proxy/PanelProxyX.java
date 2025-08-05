package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.clean.BlankFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame;
import com.taobao.android.live.plugin.atype.flexalocal.liveready.TaoLiveReadyRecommendFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopFakeBarFrame;
import com.taobao.android.live.plugin.atype.flexalocal.virtual.VirtualAnchorSignFrame;
import com.taobao.android.live.plugin.atype.flexalocal.watermark.WatermarkFrame3;
import com.taobao.android.live.plugin.proxy.panel.IPanelProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class PanelProxyX implements IPanelProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1176745313);
        kge.a(-1184645637);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getBlankFrame2Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("9359d849", new Object[]{this}) : BlankFrame2.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Show(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a0d199", new Object[]{this, obj});
        } else if (!(obj instanceof BlankFrame2)) {
        } else {
            ((BlankFrame2) obj).show();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void blankFrame2Hide(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeca21e", new Object[]{this, obj});
        } else if (!(obj instanceof BlankFrame2)) {
        } else {
            ((BlankFrame2) obj).hide();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getWatermarkFrame3Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("12434758", new Object[]{this}) : WatermarkFrame3.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getVirtualAnchorSignFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("cf47866", new Object[]{this}) : VirtualAnchorSignFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getVirtualAnchorSignFrame(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("3f86a224", new Object[]{this, context, aVar}) : new VirtualAnchorSignFrame(context, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getTopSelectCommentFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("79842ac3", new Object[]{this}) : TopSelectCommentFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getLiveEndFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("c28d9e38", new Object[]{this}) : LiveEndRecommendFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("7291d1e6", new Object[]{this, context, aVar}) : new LiveAvatarNewFrame(context, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getLiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("900cfdae", new Object[]{this, context, new Boolean(z), tBLiveDataModel}) : new LiveAvatarNewFrame(context, z, tBLiveDataModel);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getTopFakeBarFrame(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("d495588c", new Object[]{this, context, aVar}) : new TopFakeBarFrame(context, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public BaseFrame getShowcaseFrame(Context context, a aVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("9461bc63", new Object[]{this, context, aVar, liveItem}) : new ShowcaseFrame(context, aVar, liveItem);
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Object iniChatPreProcessor3(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e7c644a0", new Object[]{this, aVar, context});
        }
        b bVar = new b(aVar, context);
        bVar.a();
        return bVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void preProcessChat(Object obj, String str, int i, final com.taobao.android.live.plugin.proxy.panel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9c1398", new Object[]{this, obj, str, new Integer(i), aVar});
        } else if (!(obj instanceof b)) {
        } else {
            ((b) obj).a(str, i, new b.c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.PanelProxyX.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.b.c
                public void a(List<ChatMessage> list, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19a0788b", new Object[]{this, list, new Long(j)});
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public void destoryChatPreProcessor3(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2434c5b", new Object[]{this, obj});
        } else if (!(obj instanceof b)) {
        } else {
            ((b) obj).b();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.panel.IPanelProxy
    public Class<? extends BaseFrame> getLiveReadyFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ef36a980", new Object[]{this}) : TaoLiveReadyRecommendFrame.class;
    }
}
