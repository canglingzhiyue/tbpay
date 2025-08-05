package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class lmz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IContainerDataService<?> f30729a;
    private IContainerDataService.b b;
    private IContainerDataService.c c;
    private final Map<String, lna> d = new ConcurrentHashMap(2);

    static {
        kge.a(13370640);
    }

    public static /* synthetic */ Map a(lmz lmzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("46c8f914", new Object[]{lmzVar}) : lmzVar.d;
    }

    public lmz(ljs ljsVar) {
        this.f30729a = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        IContainerDataService<?> iContainerDataService = this.f30729a;
        if (iContainerDataService == null) {
            ldf.d("BizParamCache", "IContainerDataService is null");
            return;
        }
        a(iContainerDataService);
        a(ljsVar.a().a());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f30729a;
        if (iContainerDataService == null) {
            return;
        }
        b(iContainerDataService);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        lna lnaVar = this.d.get(str3);
        if (lnaVar != null) {
            lnaVar.a(str, str2);
            return;
        }
        ldf.d("BizParamCache", "未找到处理者： " + str3);
    }

    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{this, str, str2, str3});
        }
        lna lnaVar = this.d.get(str3);
        if (lnaVar != null) {
            return lnaVar.b(str, str2);
        }
        ldf.d("BizParamCache", "未找到处理者： " + str3);
        return str2;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.d.put(ICacheReqBizParamsService.SaveMode.DISK_NOT_ERASED, new lnc(str));
        this.d.put(ICacheReqBizParamsService.SaveMode.DISK_AUTO_ERASED, new lnb(str));
    }

    private void a(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248587ba", new Object[]{this, iContainerDataService});
            return;
        }
        this.b = c();
        iContainerDataService.addRequestListener(this.b);
        this.c = b();
        iContainerDataService.addRequestBizParamsCreator(this.c);
    }

    private void b(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d86d959", new Object[]{this, iContainerDataService});
            return;
        }
        iContainerDataService.removeRequestListener(this.b);
        iContainerDataService.removeRequestBizParamsCreator(this.c);
    }

    private IContainerDataService.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("2428c8dc", new Object[]{this}) : new IContainerDataService.c() { // from class: tb.lmz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                HashMap hashMap = new HashMap(2);
                for (lna lnaVar : lmz.a(lmz.this).values()) {
                    Map<String, String> b = lnaVar.b();
                    if (b != null) {
                        hashMap.putAll(b);
                    }
                }
                return hashMap;
            }
        };
    }

    private IContainerDataService.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("2b51aafe", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lmz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                    return;
                }
                for (lna lnaVar : lmz.a(lmz.this).values()) {
                    lnaVar.c();
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                    return;
                }
                for (lna lnaVar : lmz.a(lmz.this).values()) {
                    lnaVar.d();
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                    return;
                }
                Iterator it = lmz.a(lmz.this).values().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        };
    }
}
