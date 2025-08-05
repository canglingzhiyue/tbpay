package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import tb.xnl;

/* loaded from: classes7.dex */
public class xnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final IContainerService<?> f34404a;
    private IContainerService.a b;
    private final String c;
    private final xpe d = new xpe();

    static {
        kge.a(-1063950724);
    }

    public static /* synthetic */ String a(xnl xnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91d229fe", new Object[]{xnlVar}) : xnlVar.c;
    }

    public static /* synthetic */ xpe b(xnl xnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xpe) ipChange.ipc$dispatch("ceee1cf6", new Object[]{xnlVar}) : xnlVar.d;
    }

    public xnl(ljs ljsVar) {
        this.f34404a = (IContainerService) ljsVar.a(IContainerService.class);
        this.c = ljsVar.a().a();
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        this.d.a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = d();
        this.f34404a.addUiRefreshListener(this.b);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        this.f34404a.removeUiRefreshListener(aVar);
    }

    /* renamed from: tb.xnl$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$QEbCyxhLBqdzNspRCOzkgTIHquA(AnonymousClass1 anonymousClass1, IUiRefreshActionModel iUiRefreshActionModel) {
            anonymousClass1.c(iUiRefreshActionModel);
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
            }
        }

        public AnonymousClass1() {
            xnl.this = r1;
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(final IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            if (TextUtils.isEmpty(requestType)) {
                ldf.d("InfoFlowCacheDataValidator", "requestType is null");
                return;
            }
            char c = 65535;
            int hashCode = requestType.hashCode();
            if (hashCode != 1363155516) {
                if (hashCode == 1638323166 && requestType.equals("coldStart")) {
                    c = 1;
                }
            } else if (requestType.equals("loadCache")) {
                c = 0;
            }
            if (c == 0) {
                ldf.d("InfoFlowCacheDataValidator", "loadCache");
                xnl.b(xnl.this).a(xnl.a(xnl.this), iUiRefreshActionModel.getContainerModel());
            } else if (c != 1) {
            } else {
                ljd.a().a(new Runnable() { // from class: tb.-$$Lambda$xnl$1$QEbCyxhLBqdzNspRCOzkgTIHquA
                    @Override // java.lang.Runnable
                    public final void run() {
                        xnl.AnonymousClass1.lambda$QEbCyxhLBqdzNspRCOzkgTIHquA(xnl.AnonymousClass1.this, iUiRefreshActionModel);
                    }
                });
            }
        }

        public /* synthetic */ void c(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51ca6ee", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            ldf.d("InfoFlowCacheDataValidator", "coldStart");
            xnl.b(xnl.this).a(xnl.a(xnl.this), iUiRefreshActionModel.getContainerModel(), 2);
        }
    }

    private IContainerService.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerService.a) ipChange.ipc$dispatch("65669c56", new Object[]{this}) : new AnonymousClass1();
    }
}
