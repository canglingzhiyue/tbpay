package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* loaded from: classes7.dex */
public class lpp extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long GATEWAYTRIGGEREVENT = -6988725130610969125L;

    static {
        kge.a(732808604);
    }

    public static /* synthetic */ Object ipc$super(lpp lppVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXRuntimeContext h;
        ljs a2;
        BaseSectionModel<?> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar == null || (a2 = lfq.a((h = lVar.h()))) == null || (b = lfq.b(h)) == null) {
            return null;
        }
        a(a2, b);
        return new dla();
    }

    private void a(ljs ljsVar, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff5f7cb", new Object[]{this, ljsVar, baseSectionModel});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) ljsVar.a(ICardOverlayService.class);
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.deleteOverlayHostCard(baseSectionModel);
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1047740531);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lpp a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lpp) ipChange.ipc$dispatch("16bdb9d6", new Object[]{this, obj}) : new lpp();
        }
    }
}
