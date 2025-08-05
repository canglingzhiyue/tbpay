package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class lnk implements IContainerService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f30744a;
    private final ljs b;
    private long c;

    static {
        kge.a(845151001);
        kge.a(504102497);
    }

    public lnk(a aVar, ljs ljsVar) {
        this.f30744a = aVar;
        this.b = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        a();
        c(iUiRefreshActionModel);
        b();
    }

    private boolean a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : map != null && map.size() >= GatewayPhaseEnum.values().length;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c <= 0) {
            ldf.d("UiRefreshListener", "mUiRefreshStartTime <= 0");
        } else {
            this.f30744a.a(GatewayPhaseEnum.uiRenderTime.name(), SystemClock.uptimeMillis() - this.c);
        }
    }

    private void c(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ca6ee", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        Map<String, Object> a2 = this.f30744a.a("network");
        if (!a(a2)) {
            ldf.d("UiRefreshListener", "参数非法");
            return;
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put(PopConst.POP_CLIENT_PARAMS_KEY, a2);
        String requestType = iUiRefreshActionModel.getRequestType();
        ldg.b(requestType, this.b.a().c(), hashMap);
        ldf.d("UiRefreshListener", "commitMonitorData actionType:" + requestType + "当前的信息是：" + a2);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f30744a.b("network");
        ldf.d("UiRefreshListener", "clearCommitMonitorData");
    }
}
