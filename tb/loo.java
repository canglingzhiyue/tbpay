package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;

/* loaded from: classes7.dex */
public class loo extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CLOSEH5 = 4730169291098101146L;

    static {
        kge.a(1663343720);
    }

    public static /* synthetic */ Object ipc$super(loo looVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return a("runtimeContext为空");
        }
        ljs a2 = lfq.a(h);
        if (a2 == null) {
            return a("infoFlowContext为空");
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) a2.a(IMulticlassTabService.class);
        if (iMulticlassTabService == null) {
            return a("tabH5ContainerService为空");
        }
        iMulticlassTabService.hideTabContent();
        return new dla();
    }

    private dkw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("7c6e6344", new Object[]{this, str}) : new dkw(new dkv(30000, str), true);
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-79918273);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public loo a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (loo) ipChange.ipc$dispatch("16bdb5f6", new Object[]{this, obj}) : new loo();
        }
    }
}
