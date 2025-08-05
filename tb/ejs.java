package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.lightoff.a;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import java.util.Map;

@AURAExtensionImpl(code = "picGallery.impl.event.openLightOff")
/* loaded from: classes4.dex */
public final class ejs extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openLightOff";

    /* renamed from: a  reason: collision with root package name */
    private final String f27351a = "PicGalleryOpenLightOffEvent";

    static {
        kge.a(-1038055836);
    }

    public static /* synthetic */ Object ipc$super(ejs ejsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openLightOff";
    }

    public ejs() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.events.PicGalleryOpenLightOffEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        elq a2 = elr.a((String) b().a("token", String.class));
        if (a2 == null) {
            arc.a().c("PicGalleryOpenLightOffEvent", "innerHandleEvent", "picGalleryAuraPresenter is null");
            return;
        }
        a(a2, aURAEventIO.getEventModel().f());
        a(a2);
        b(a2);
    }

    private void a(elq elqVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49d3d7", new Object[]{this, elqVar, map});
            return;
        }
        a i = elqVar.i();
        if (i == null) {
            arc.a().c("PicGalleryOpenLightOffEvent", "showLightOff", "picGalleryLightOffManager is null");
        } else {
            i.a(map);
        }
    }

    private void a(elq elqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e714adee", new Object[]{this, elqVar});
            return;
        }
        d h = elqVar.h();
        if (h == null) {
            arc.a().c("PicGalleryOpenLightOffEvent", "pauseSelectVideo", "picGalleryVideoManager is null");
            return;
        }
        AbsPicGalleryVideoPlayer g = h.g();
        if (g == null) {
            arc.a().a("PicGalleryOpenLightOffEvent", "pauseSelectVideo", "no select video");
        } else {
            g.b();
        }
    }

    private void b(elq elqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d597b46f", new Object[]{this, elqVar});
            return;
        }
        d h = elqVar.h();
        if (h == null) {
            arc.a().c("PicGalleryOpenLightOffEvent", "closeVideoMiniWindow", "picGalleryVideoManager is null");
            return;
        }
        AbsPicGalleryVideoPlayer g = h.g();
        if (g != null && h.e()) {
            g.a(PicGalleryLightOffVideoComponent.KEY_LAST_VIDEO_FROM_MINI_WINDOW, (Object) true);
        } else if (g != null) {
            g.a(PicGalleryLightOffVideoComponent.KEY_LAST_VIDEO_FROM_MINI_WINDOW, (Object) false);
        }
        h.d();
    }
}
