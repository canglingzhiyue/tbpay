package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.e;
import com.taobao.alimama.threads.BackgroundExecutor;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;

/* loaded from: classes4.dex */
public class dhx implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBLocationDTO f26768a;

    static {
        kge.a(83476184);
        kge.a(349547358);
    }

    public static /* synthetic */ TBLocationDTO a(dhx dhxVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("80f97cf2", new Object[]{dhxVar, tBLocationDTO});
        }
        dhxVar.f26768a = tBLocationDTO;
        return tBLocationDTO;
    }

    public dhx() {
        c();
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_TAOBAO_LOCATION.name();
    }

    @Override // com.taobao.alimama.services.e
    public TBLocationDTO b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("d17750dd", new Object[]{this});
        }
        if (this.f26768a == null) {
            c();
        }
        return this.f26768a;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: tb.dhx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dhx.a(dhx.this, TBLocationClient.b());
                    }
                }
            });
        }
    }
}
