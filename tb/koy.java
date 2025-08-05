package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog;

/* loaded from: classes5.dex */
public class koy implements kpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f<kpb> f30210a = new f<>();

    static {
        kge.a(-280658088);
        kge.a(-461528367);
        kge.a(1377371330);
    }

    public void a(kpb kpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1834e1b", new Object[]{this, kpbVar});
        } else if (kpbVar == null) {
        } else {
            this.f30210a.a(kpbVar);
        }
    }

    @Override // tb.kpb
    public void a(FluidContext fluidContext, PopupDialog popupDialog, PopupDialog popupDialog2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bc7fa", new Object[]{this, fluidContext, popupDialog, popupDialog2});
            return;
        }
        for (kpb kpbVar : this.f30210a.a()) {
            try {
                kpbVar.a(fluidContext, popupDialog, popupDialog2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(fluidContext, kpbVar, "", e);
            }
        }
    }
}
