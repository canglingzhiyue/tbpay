package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class lnj implements IContainerDataService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f30743a;
    private long b;
    private final ljs c;

    static {
        kge.a(875595649);
        kge.a(616420927);
    }

    public lnj(a aVar, ljs ljsVar) {
        this.f30743a = aVar;
        this.c = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
    public void a(lli lliVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
        } else {
            this.b = SystemClock.uptimeMillis();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
    public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
        } else if (this.b <= 0) {
            ldf.d("RequestListener", "mRequestStartTime <= 0");
        } else {
            this.f30743a.a(GatewayPhaseEnum.networkTime.name(), SystemClock.uptimeMillis() - this.b);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
    public void a(lli lliVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
            return;
        }
        String c = this.c.a().c();
        HashMap hashMap = new HashMap();
        hashMap.put("extKey1", "HomePageErrorCount");
        hashMap.put("extKey2", str);
        hashMap.put("extKey3", str3);
        ldg.b("QPS", c, hashMap);
    }
}
