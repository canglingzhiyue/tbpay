package com.taobao.android.live.plugin.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.alphavideo.AlphaVideoProxy;
import com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy;
import com.taobao.android.live.plugin.proxy.bclink.BCLinkProxy;
import com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy;
import com.taobao.android.live.plugin.proxy.bottom.BottomProxy;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.comments.CommentsProxy;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import com.taobao.android.live.plugin.proxy.debugPanel.DebugPanelProxy;
import com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy;
import com.taobao.android.live.plugin.proxy.evocation.EvocationProxy;
import com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy;
import com.taobao.android.live.plugin.proxy.fullscreen.FullScreenProxy;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.android.live.plugin.proxy.gift.GiftProxy;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;
import com.taobao.android.live.plugin.proxy.good.GoodProxy;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.android.live.plugin.proxy.input.InputProxy;
import com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy;
import com.taobao.android.live.plugin.proxy.jump302.Jump302Proxy;
import com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy;
import com.taobao.android.live.plugin.proxy.livehome.TaoLiveHomePageProxy;
import com.taobao.android.live.plugin.proxy.multiLink.MultiLinkProxy;
import com.taobao.android.live.plugin.proxy.notice.INotice4Proxy;
import com.taobao.android.live.plugin.proxy.notice.INoticeProxy;
import com.taobao.android.live.plugin.proxy.notice.Notice4Proxy;
import com.taobao.android.live.plugin.proxy.notice.NoticeProxy;
import com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy;
import com.taobao.android.live.plugin.proxy.officialLive.OfficialLiveEntryProxy;
import com.taobao.android.live.plugin.proxy.panel.IPanelProxy;
import com.taobao.android.live.plugin.proxy.panel.PanelProxy;
import com.taobao.android.live.plugin.proxy.pklink.IPkLinkProxy;
import com.taobao.android.live.plugin.proxy.pklink.PkLinkProxy;
import com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy;
import com.taobao.android.live.plugin.proxy.projectscreen.ProjectScreenProxy;
import com.taobao.android.live.plugin.proxy.rank.IRankProxy;
import com.taobao.android.live.plugin.proxy.rank.RankProxy;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.android.live.plugin.proxy.recommendpop.RecommendPopProxy;
import com.taobao.android.live.plugin.proxy.reward.IRewardProxy;
import com.taobao.android.live.plugin.proxy.reward.RewardProxy;
import com.taobao.android.live.plugin.proxy.room.BTypeRoomProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.SmartLandingProxy;
import com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy;
import com.taobao.android.live.plugin.proxy.topbar.TopBarProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.android.live.plugin.proxy.universal.UniversalProxy;
import com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy;
import com.taobao.android.live.plugin.proxy.usertask.UserTaskProxy;
import com.taobao.android.live.plugin.proxy.voiceroom.IVoiceRoomProxy;
import com.taobao.android.live.plugin.proxy.voiceroom.VoiceRoomProxy;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(954395935);
        try {
            if (!e.a().g().contains(e.TAOLIVE_HOMEPAGE)) {
                e.a().a(e.TAOLIVE_HOMEPAGE, false, null);
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", "TAOLIVE_HOMEPAGE has not been loaded once, load");
            } else {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", "TAOLIVE_HOMEPAGE has been loaded once");
            }
            if (!e.a().g().contains(e.ATYPE)) {
                e.a().a(e.ATYPE, false, null);
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", "AType has not been loaded once, load");
            } else {
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", "AType has been loaded once");
            }
            if (!e.a().g().contains(e.BTYPE)) {
                e.a().a(e.BTYPE, false, null);
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", "BType has not been loaded once, load");
                return;
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", "BType has been loaded once");
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "PluginProxyManager", th);
        }
    }

    public static ITopBarProxy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITopBarProxy) ipChange.ipc$dispatch("fe8bb3d2", new Object[0]) : TopBarProxy.getInstance();
    }

    public static INoticeProxy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INoticeProxy) ipChange.ipc$dispatch("f8653305", new Object[0]) : NoticeProxy.getInstance();
    }

    public static INotice4Proxy c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INotice4Proxy) ipChange.ipc$dispatch("4c3a4ca", new Object[0]) : Notice4Proxy.getInstance();
    }

    public static IRankProxy d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRankProxy) ipChange.ipc$dispatch("4431ea6b", new Object[0]) : RankProxy.getInstance();
    }

    public static ICommentsProxy e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ICommentsProxy) ipChange.ipc$dispatch("5b1db11a", new Object[0]) : CommentsProxy.getInstance();
    }

    public static IInputProxy f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IInputProxy) ipChange.ipc$dispatch("ad6a19d", new Object[0]) : InputProxy.getInstance();
    }

    public static IPanelProxy g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPanelProxy) ipChange.ipc$dispatch("452747bc", new Object[0]) : PanelProxy.getInstance();
    }

    public static IPkLinkProxy h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPkLinkProxy) ipChange.ipc$dispatch("f6b90f99", new Object[0]) : PkLinkProxy.getInstance();
    }

    public static IVoiceRoomProxy y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVoiceRoomProxy) ipChange.ipc$dispatch("44d1b0ea", new Object[0]) : VoiceRoomProxy.getInstance();
    }

    public static MultiLinkProxy i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiLinkProxy) ipChange.ipc$dispatch("98bca95d", new Object[0]) : MultiLinkProxy.getInstance();
    }

    public static IBCLinkProxy j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBCLinkProxy) ipChange.ipc$dispatch("57962e43", new Object[0]) : BCLinkProxy.getInstance();
    }

    public static IBottomProxy k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBottomProxy) ipChange.ipc$dispatch("b45c4ec2", new Object[0]) : BottomProxy.getInstance();
    }

    public static IRewardProxy l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRewardProxy) ipChange.ipc$dispatch("68a83e69", new Object[0]) : RewardProxy.getInstance();
    }

    public static IGoodProxy m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IGoodProxy) ipChange.ipc$dispatch("5fb76164", new Object[0]) : GoodProxy.getInstance();
    }

    public static IAlphaVideoProxy n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAlphaVideoProxy) ipChange.ipc$dispatch("3315aa63", new Object[0]) : AlphaVideoProxy.getInstance();
    }

    public static IUniversalProxy o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUniversalProxy) ipChange.ipc$dispatch("c4df654", new Object[0]) : UniversalProxy.getInstance();
    }

    public static IBTypeRoomProxy p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBTypeRoomProxy) ipChange.ipc$dispatch("29b8420f", new Object[0]) : BTypeRoomProxy.getInstance();
    }

    public static IJump302Proxy q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IJump302Proxy) ipChange.ipc$dispatch("cd9facd2", new Object[0]) : Jump302Proxy.getInstance();
    }

    public static IRecommendPopProxy r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRecommendPopProxy) ipChange.ipc$dispatch("36baa28f", new Object[0]) : RecommendPopProxy.getInstance();
    }

    public static ISmartLandingProxy B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISmartLandingProxy) ipChange.ipc$dispatch("5bc30fb1", new Object[0]) : SmartLandingProxy.getInstance();
    }

    public static IOfficialLiveEntryProxy s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IOfficialLiveEntryProxy) ipChange.ipc$dispatch("7c038f3a", new Object[0]) : OfficialLiveEntryProxy.getInstance();
    }

    public static IEvocationProxy t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IEvocationProxy) ipChange.ipc$dispatch("9885070f", new Object[0]) : EvocationProxy.getInstance();
    }

    public static IFullScreenProxy u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFullScreenProxy) ipChange.ipc$dispatch("8f90fcb8", new Object[0]) : FullScreenProxy.getInstance();
    }

    public static IProjectScreenProxy v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IProjectScreenProxy) ipChange.ipc$dispatch("2dcd2e4d", new Object[0]) : ProjectScreenProxy.getInstance();
    }

    public static IUserTaskProxy w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUserTaskProxy) ipChange.ipc$dispatch("c3bde20", new Object[0]) : UserTaskProxy.getInstance();
    }

    public static IGiftProxy x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IGiftProxy) ipChange.ipc$dispatch("7805b9df", new Object[0]) : GiftProxy.getInstance();
    }

    public static ITaoLiveHomePageProxy z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITaoLiveHomePageProxy) ipChange.ipc$dispatch("84f9a34e", new Object[0]) : TaoLiveHomePageProxy.getInstance();
    }

    public static IDebugPanelProxy C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDebugPanelProxy) ipChange.ipc$dispatch("75636ef6", new Object[0]) : DebugPanelProxy.getInstance();
    }
}
