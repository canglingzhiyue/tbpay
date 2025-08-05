package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.a;

/* loaded from: classes.dex */
public class lng implements IContainerDataService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f30740a;
    private long b;

    static {
        kge.a(-585936041);
        kge.a(348066581);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
        }
    }

    public lng(a aVar, ljs ljsVar) {
        this.f30740a = aVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
        } else {
            this.b = SystemClock.uptimeMillis();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
        } else if (this.b <= 0) {
            ldf.d("DataProcessListener", "mDataProcessStartTime <= 0");
        } else {
            this.f30740a.a(GatewayPhaseEnum.dataParserTime.name(), SystemClock.uptimeMillis() - this.b);
        }
    }
}
