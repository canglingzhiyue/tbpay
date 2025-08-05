package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* loaded from: classes.dex */
public class lqs extends kyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ICONHORIZONTALSCROLL = 1938314154274694230L;

    /* renamed from: a  reason: collision with root package name */
    private int f30839a;

    static {
        kge.a(-599503061);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int offsetX;
        IPopViewService iPopViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!(dXEvent instanceof DXScrollEvent) || (offsetX = ((DXScrollEvent) dXEvent).getOffsetX()) == this.f30839a) {
        } else {
            this.f30839a = offsetX;
            ljs a2 = lfq.a(dXRuntimeContext);
            if (a2 == null || (iPopViewService = (IPopViewService) a2.a(IPopViewService.class)) == null) {
                return;
            }
            iPopViewService.onIconScroll(this.f30839a);
            kyv.a("default", PopConst.STATIC_KEY_ICON_SCROLL_OFFSET, String.valueOf(this.f30839a));
        }
    }
}
