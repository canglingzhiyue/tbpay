package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* loaded from: classes7.dex */
public class lpr extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DISMISS = 4766907290255913603L;

    static {
        kge.a(-565696729);
    }

    public static /* synthetic */ Object ipc$super(lpr lprVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        ljs a2 = lfq.a(lVar.h());
        if (a2 == null) {
            return null;
        }
        a(a2);
        return new dla();
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) ljsVar.a(ICardOverlayService.class);
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.hideOverlay();
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(642049790);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lpr a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lpr) ipChange.ipc$dispatch("16bdba14", new Object[]{this, obj}) : new lpr();
        }
    }
}
