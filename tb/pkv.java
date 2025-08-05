package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;

/* loaded from: classes8.dex */
public class pkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1162359924);
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            d();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        if (f.g().getWatermarkFrame3Class() != null) {
            ddx.a("tl-watermark", f.g().getWatermarkFrame3Class());
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3) != null) {
            ddx.a("tl-double-click", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3));
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3) != null) {
            ddx.a("tl-favor-anim", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3));
        }
        if (f.e().getChatFrame3Class() != null) {
            ddx.a("tl-chat", f.e().getChatFrame3Class());
        }
        if (f.g().getVirtualAnchorSignFrameClass() != null) {
            ddx.a("tl-virtual-anchor", f.g().getVirtualAnchorSignFrameClass());
        }
        if (f.e().getMessageCardFrame3Class() != null) {
            ddx.a("tl-message-card", f.e().getMessageCardFrame3Class());
        }
        if (f.f().getInputFrame3Class() != null) {
            ddx.a("tl-input", f.f().getInputFrame3Class());
        }
        if (f.f().getInputFrame3Class() != null) {
            ddx.a("tl-input", f.f().getInputFrame3Class());
        }
        if (f.e().getImportantEventFrameClass() != null) {
            ddx.a("tl-important-event", f.e().getImportantEventFrameClass());
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3) != null) {
            ddx.a("tl-bottom-favor", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3));
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_QA_FRAME) != null) {
            ddx.a("tl-bottom-qa", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_QA_FRAME));
        }
        if (f.j().getLiveLinkFrame3Class() != null) {
            ddx.a("tl-link", f.j().getLiveLinkFrame3Class());
        }
        if (f.j().getLiveLinkEntranceFrame() != null) {
            ddx.a("tl-link-entrance", f.j().getLiveLinkEntranceFrame());
        }
        if (f.a().getTopBarFrame3Class() != null) {
            ddx.a("tl-top-bar", f.a().getTopBarFrame3Class());
        }
        if (f.a().getAnchorInfoFrameClass() != null) {
            ddx.a("tl-anchor-info", f.a().getAnchorInfoFrameClass());
        }
        if (f.g().getBlankFrame2Class() != null) {
            ddx.a("tl-clear-screen", f.g().getBlankFrame2Class());
        }
        if (f.b().getNoticeFrame3Class() != null) {
            ddx.a("tl-notice", f.b().getNoticeFrame3Class());
        }
        if (f.c().getNoticeFrame4Class() != null) {
            ddx.a("tl-notice-4", f.c().getNoticeFrame4Class());
        }
        if (f.d().getRankFrameClass() != null) {
            ddx.a("tl-rank", f.d().getRankFrameClass());
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_REWARD_FRAME) != null) {
            ddx.a("tl-bottom-reward", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_REWARD_FRAME));
        }
        if (f.g().getTopSelectCommentFrameClass() != null) {
            ddx.a("tl-top-select_comment", f.g().getTopSelectCommentFrameClass());
        }
        if (f.f().getUserRecExpFrameClass() != null) {
            ddx.a("tl-user-recommend-experience", f.f().getUserRecExpFrameClass());
        }
        if (f.g().getLiveEndFrameClass() != null) {
            ddx.a("tl-live-end-recommend", f.g().getLiveEndFrameClass());
        }
        if (f.g().getLiveReadyFrameClass() != null) {
            ddx.a("tl-live-ready-recommend", f.g().getLiveReadyFrameClass());
        }
        c();
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            if (c.a().d()) {
                d();
            } else {
                c.a().a(new c.b() { // from class: tb.pkv.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        try {
                            pkv.b();
                        } catch (Throwable th) {
                            e.c("[UniversalFrame#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            e.c("[UniversalFrame#registerRemoteFrame]  error: " + th.getMessage());
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (f.p() == null || f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_QA_EXPLAIN_FRAME) == null) {
        } else {
            ddx.a("tl-qa-explain", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_QA_EXPLAIN_FRAME));
            e.c("[UniversalFrame#registerRemoteFrame#onBTypePluginInstalled] QA_EXPLAIN_FRAME success: ");
        }
    }
}
