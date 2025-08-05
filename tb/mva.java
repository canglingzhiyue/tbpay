package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taobao/infoflow/webview/WebViewContext;", "", "mBusinessId", "", "(Ljava/lang/String;)V", "mContainerMonitorService", "Lcom/taobao/infoflow/monitor/ContainerMonitorService;", "mJsBridgeService", "Lcom/taobao/infoflow/jsbridge/JsBridgeServiceImpl;", "mPerformancePointService", "Lcom/taobao/infoflow/monitor/PerformancePointService;", "mUserTrackerService", "Lcom/taobao/infoflow/usertrack/UserTrackerService;", "destroy", "", "getJsBridgeService", "getPerformancePointService", "getUserTrackerService", "init", "context", "Landroid/content/Context;", "containerType", "businessId", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class mva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljj f31274a;
    private final ljk b;
    private mut c;
    private ljl d;

    static {
        kge.a(-2116914100);
    }

    public mva(String mBusinessId) {
        q.d(mBusinessId, "mBusinessId");
        this.f31274a = new ljj(mBusinessId);
        this.b = new ljk(this.f31274a, mBusinessId);
    }

    public final void a(Context context, String containerType, String businessId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, containerType, businessId});
            return;
        }
        q.d(context, "context");
        q.d(containerType, "containerType");
        q.d(businessId, "businessId");
        this.c = new mut(this.f31274a, context);
        this.d = new ljl(this.f31274a, containerType, businessId);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f31274a.a();
        this.b.a();
        mut mutVar = this.c;
        if (mutVar != null) {
            mutVar.a();
        }
        ljl ljlVar = this.d;
        if (ljlVar == null) {
            return;
        }
        ljlVar.a();
    }

    public final ljj b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljj) ipChange.ipc$dispatch("16b8fd51", new Object[]{this}) : this.f31274a;
    }

    public final mut c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mut) ipChange.ipc$dispatch("1e6b4190", new Object[]{this}) : this.c;
    }

    public final ljl d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljl) ipChange.ipc$dispatch("261c484d", new Object[]{this}) : this.d;
    }
}
