package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.ui.growth.GrowthFrame;
import com.taobao.taolive.room.utils.am;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes8.dex */
public class pii implements ddy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32682a;
    private a b;

    static {
        kge.a(194290998);
        kge.a(1284369743);
        pkv.a();
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3) != null) {
            ddx.a("tl-bottom-bar", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3));
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME) != null) {
            ddx.a("tl-bottom-input", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME));
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME) != null) {
            ddx.a("tl-bottom-goods-icon", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME));
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_MORE_FRAME) != null) {
            ddx.a("tl-bottom-more", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_MORE_FRAME));
        }
        if (f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME) != null) {
            ddx.a("tl-bottom-share", f.k().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME));
        }
        ddx.a("tl_7days_subscribe", GrowthFrame.class);
        if (am.a() && f.x().getGiftFrameClass() != null) {
            ddx.a("tl-room-gift", f.x().getGiftFrameClass());
        }
        if (f.d().getRankEntranceFrameClass() != null) {
            ddx.a("tl_rank_live_entrance", f.d().getRankEntranceFrameClass());
        }
        f.m().registShowcaseFrame();
        if (f.s().getOfficialLiveEntryFrameClass() != null) {
            ddx.a("tl-official-live-entry", f.s().getOfficialLiveEntryFrameClass());
        }
        if (f.v().getProjectScreenIconFrameClass() != null) {
            ddx.a("tl-project-screen-icon", f.v().getProjectScreenIconFrameClass());
        }
        if (f.v().getProjectScreenSearchFrameClass() != null) {
            ddx.a("tl-project-screen-search", f.v().getProjectScreenSearchFrameClass());
        }
        if (f.v().getProjectScreenOptFrameClass() != null) {
            ddx.a("tl-project-screen-opt", f.v().getProjectScreenOptFrameClass());
        }
    }

    public pii(Context context, a aVar) {
        this.f32682a = context;
        this.b = aVar;
    }

    @Override // tb.ddy
    public BaseFrame a(String str) {
        Class<? extends BaseFrame> a2 = ddx.a(str);
        if (a2 != null) {
            try {
                return a2.getConstructor(Context.class, a.class).newInstance(this.f32682a, this.b);
            } catch (Exception e) {
                q.b("BaseFrameFactory", "create error : " + e.getMessage());
                return null;
            }
        }
        q.b("BaseFrameFactory", "请使用BaseFrameRegistry.registerFrame注册组件");
        return null;
    }
}
