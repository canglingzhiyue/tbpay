package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.a;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.lkq;

/* loaded from: classes.dex */
public class lhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1520788630);
    }

    public static /* synthetic */ void a(lhg lhgVar, ljs ljsVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae845a0", new Object[]{lhgVar, ljsVar, context});
        } else {
            lhgVar.a(ljsVar, context);
        }
    }

    public static /* synthetic */ void b(lhg lhgVar, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4198a9", new Object[]{lhgVar, ljsVar});
        } else {
            lhgVar.c(ljsVar);
        }
    }

    public lhg(ljs ljsVar, a aVar) {
        aVar.a(a(ljsVar));
    }

    private lkq.a a(final ljs ljsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkq.a) ipChange.ipc$dispatch("f86e95f4", new Object[]{this, ljsVar}) : new lkq.a() { // from class: tb.lhg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkq.a
            public void a(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context});
                    return;
                }
                ldf.d("LifecycleHandler", "createContainerBegin");
                lhg.a(lhg.this, ljsVar, context);
            }

            @Override // tb.lkq.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                ldf.b("LifecycleHandler", "createContainerFinish");
                nuw.a("notifyCreateContainerEnd", "triggerCache");
                lhg.b(lhg.this, ljsVar);
                nuw.b("notifyCreateContainerEnd", "triggerCache");
            }
        };
    }

    private void a(ljs ljsVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f5b125", new Object[]{this, ljsVar, context});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) ljsVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null) {
            ldf.d("LifecycleHandler", "initDx dxService == null");
            throw new IllegalArgumentException("triggerCache dataService 必须注册");
        }
        iDxItemRenderService.initDx();
        if (!(context instanceof Activity)) {
            return;
        }
        iDxItemRenderService.setDxCurrentActivity((Activity) context);
    }

    private void c(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff16105", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("LifecycleHandler", "createContainerFinish");
            throw new IllegalArgumentException("triggerCache dataService 必须注册");
        } else {
            iContainerDataService.triggerEvent("LoadCache", null);
        }
    }
}
