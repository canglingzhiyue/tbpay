package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alibuy.impl.event.handler.popupWindow.stream")
/* loaded from: classes4.dex */
public final class kqt extends hif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tcy f30240a;

    static {
        kge.a(449003016);
    }

    public static /* synthetic */ Object ipc$super(kqt kqtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hif
    public boolean a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d42ad8", new Object[]{this, aURAEventIO})).booleanValue();
        }
        tcy b = b();
        if (b == null || !b.e()) {
            arc.a().a("stream", "流式数据已经返回，不需要等待");
            return false;
        }
        ard a2 = arc.a();
        a2.a("stream", aURAEventIO.getEventType() + " 未执行，原因：流式数据未返回，需要等待");
        b.a(aURAEventIO);
        tcz.a("OPEN_POPUP_WINDOW_WITH_LOADING");
        return true;
    }

    private tcy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tcy) ipChange.ipc$dispatch("16bc87d3", new Object[]{this});
        }
        if (this.f30240a == null) {
            this.f30240a = (tcy) a().get("aliBuyGlobalDataStreamResponseProcessor", tcy.class);
        }
        return this.f30240a;
    }
}
