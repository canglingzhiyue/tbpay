package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes.dex */
public class lnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IContainerDataService<?> f30734a;
    private IContainerDataService.b b;
    private long c;

    static {
        kge.a(-1618548770);
    }

    public static /* synthetic */ void a(lnd lndVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66773705", new Object[]{lndVar, iContainerDataModel});
        } else {
            lndVar.a(iContainerDataModel);
        }
    }

    public lnd(ljs ljsVar) {
        this.f30734a = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean z = this.c > SystemClock.uptimeMillis();
        if (z) {
            ldf.d("ClickBackDisableIntervalJudge", "距离：" + (this.c - SystemClock.uptimeMillis()) + " ms后可使用回退刷新");
        }
        return z;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f30734a == null || this.b != null) {
        } else {
            this.b = e();
            this.f30734a.addRequestListener(this.b);
        }
    }

    private void d() {
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f30734a;
        if (iContainerDataService == null || (bVar = this.b) == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
    }

    private IContainerDataService.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("39a36f80", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lnd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else {
                    lnd.a(lnd.this, iContainerDataModel);
                }
            }
        };
    }

    private void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null) {
            ldf.d("ClickBackDisableIntervalJudge", "containerDataModel is null");
        } else {
            IContainerInnerDataModel<?> delta = iContainerDataModel.getDelta();
            if (delta == null) {
                ldf.d("ClickBackDisableIntervalJudge", "dataModel is null");
                return;
            }
            JSONObject ext = delta.getExt();
            if (ext == null) {
                ldf.d("ClickBackDisableIntervalJudge", "ext is null");
                return;
            }
            long j = 0;
            try {
                j = ext.getLongValue("clickBackDisableInterval");
                ldf.d("ClickBackDisableIntervalJudge", "clickBackDisableInterval ： " + j);
            } catch (Throwable th) {
                ldf.a("ClickBackDisableIntervalJudge", "parse clickBackDisableInterval is error", th);
            }
            this.c = SystemClock.uptimeMillis() + j;
        }
    }
}
