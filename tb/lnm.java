package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HGifViewConstructor;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget.HImageViewConstructor;
import com.taobao.infoflow.taobao.render.dinamicx.dx2.constructor.HVideoViewConstructor;

/* loaded from: classes7.dex */
public class lnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1110277487);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b();
        c();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ldf.d("InfoFlowDx2Register", "registerWidget");
        lnl.a("HImageView", new HImageViewConstructor());
        lnl.a("HVideoView", new HVideoViewConstructor());
        lnl.a("HGifView", new HGifViewConstructor());
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        ldf.d("InfoFlowDx2Register", "registerEventHandler");
        lnl.a("rTap", new lnp());
        lnl.a("rOverlay", new lno());
        lnl.a(kvg.TAG, new lnn());
    }
}
