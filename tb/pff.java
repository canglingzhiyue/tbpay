package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;

/* loaded from: classes8.dex */
public class pff implements pfe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AVATAR_CARD_SHOW = "com.taobao.taolive.room.avatar_card_show";
    public static final String EVENT_DISABLE_UPDOWN_SWITCH = "com.taobao.taolive.room.disable_updown_switch";
    public static final String EVENT_ENABLE_UPDOWN_SWITCH = "com.taobao.taolive.room.enable_updown_switch";

    /* renamed from: a  reason: collision with root package name */
    private long f32584a = 0;

    static {
        kge.a(175053035);
        kge.a(1457455360);
    }

    @Override // tb.pfe
    public void a(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eafa7f9", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.killself", null, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void b(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1da458", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.live_type", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void c(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78ba0b7", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.update_params", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void d(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f99d16", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.replay_backToLive", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void h(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b18e92", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.addcart_for_showcase", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void i(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521f8af1", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.mediaplatform_switch_room", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void j(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8d8750", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a(FullScreenFrame.EVENT_BACK_TO_LIVE, obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else {
            ddw.a().a("com.taobao.taolive.room.enter_ut_track", null, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31b7c", new Object[]{this, aVar});
        } else {
            ddw.a().a("com.taobao.taolive.room.enter", null, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6cc19b", new Object[]{this, aVar});
        } else {
            ddw.a().a("com.taobao.taolive.room.enable_updown_switch", null, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void l(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2769800e", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.disable_updown_switch", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void m(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d77c6d", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.mediaplatform_start_video", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void n(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604578cc", new Object[]{this, aVar, obj});
        } else {
            ddw.a().a("com.taobao.taolive.room.goods_list_showing", obj, aVar == null ? null : aVar.G());
        }
    }

    @Override // tb.pfe
    public void o(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb3752b", new Object[]{this, aVar, obj});
        } else if (System.currentTimeMillis() - this.f32584a < 500) {
        } else {
            this.f32584a = System.currentTimeMillis();
            ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, obj, aVar == null ? null : aVar.G());
        }
    }
}
