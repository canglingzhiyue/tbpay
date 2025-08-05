package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.themis.kernel.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class ltk implements lxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30914a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private List<IContainerDataService.b> c;
    private List<IContainerDataService.c> d;
    private List<IContainerDataService.a> e;
    private ltn f;

    static {
        kge.a(-689658752);
        kge.a(-226153310);
    }

    public ltk(ljs ljsVar) {
        this.f30914a = ljsVar;
    }

    @Override // tb.lxg
    public AwesomeGetContainerParams a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("33639ade", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        ldf.b("ProcessProviderImpl", "getRequestParams");
        if (this.f == null) {
            this.f = new ltn(this.f30914a);
        }
        AwesomeGetContainerParams a2 = this.f.a(awesomeGetContainerData, jSONObject);
        if (a2 == null) {
            return null;
        }
        if (lwv.a(jSONObject) == null) {
            lwv.a(jSONObject, new lje(a2.getRequestType() + SystemClock.uptimeMillis()));
        }
        List<IContainerDataService.c> list = this.d;
        if (list != null) {
            for (IContainerDataService.c cVar : list) {
                Map<String, String> a3 = cVar.a(null, a2.getRequestType());
                if (a3 != null) {
                    a2.getBizParams().putAll(a3);
                }
            }
        }
        return a2;
    }

    @Override // tb.lxg
    public void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556e6c5e", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        lli a2 = lwv.a(jSONObject);
        if (this.c == null) {
            return;
        }
        String string = jSONObject == null ? "unknown" : jSONObject.getString(i.CDN_REQUEST_TYPE);
        for (IContainerDataService.b bVar : this.c) {
            bVar.a(a2, awesomeGetContainerData, string);
        }
    }

    @Override // tb.lxg
    public void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        lli a2 = lwv.a(jSONObject);
        if (this.c == null) {
            return;
        }
        String string = jSONObject == null ? "unknown" : jSONObject.getString(i.CDN_REQUEST_TYPE);
        for (IContainerDataService.b bVar : this.c) {
            bVar.a(a2, str, str2, string);
        }
    }

    @Override // tb.lxg
    public void b(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcf8351", new Object[]{this, awesomeGetContainerData, jSONObject});
            return;
        }
        ldf.b("ProcessProviderImpl", "customDataProcess");
        lli a2 = lwv.a(jSONObject);
        a(a2);
        a(a2, awesomeGetContainerData);
    }

    @Override // tb.lxg
    public void c(final AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e47130", new Object[]{this, awesomeGetContainerData, jSONObject});
            return;
        }
        ldf.b("ProcessProviderImpl", "uIRefresh, action:" + jSONObject.toJSONString());
        lli a2 = lwv.a(jSONObject);
        final UiRefreshActionModel uiRefreshActionModel = (UiRefreshActionModel) JSON.toJavaObject(jSONObject, UiRefreshActionModel.class);
        b(a2, awesomeGetContainerData);
        final IContainerService iContainerService = (IContainerService) this.f30914a.a(IContainerService.class);
        if (iContainerService == null) {
            return;
        }
        this.b.post(new Runnable() { // from class: tb.ltk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    iContainerService.uiRefresh(awesomeGetContainerData, uiRefreshActionModel);
                }
            }
        });
    }

    @Override // tb.lxg
    public void a(List<SectionModel> list, final lwh lwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7326c16c", new Object[]{this, list, lwhVar});
            return;
        }
        ldf.b("ProcessProviderImpl", "downloadTemplate");
        ((IDxItemRenderService) this.f30914a.a(IDxItemRenderService.class)).downloadTemplate(list, new IDxItemRenderService.b() { // from class: tb.ltk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    lwhVar.a();
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<IContainerDataService.b> list = this.c;
        if (list != null) {
            list.clear();
        }
        this.c = null;
        List<IContainerDataService.c> list2 = this.d;
        if (list2 != null) {
            list2.clear();
        }
        this.d = null;
        List<IContainerDataService.a> list3 = this.e;
        if (list3 != null) {
            list3.clear();
        }
        this.e = null;
    }

    public void a(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1817edbc", new Object[]{this, bVar});
            return;
        }
        if (this.c == null) {
            this.c = new CopyOnWriteArrayList();
        }
        this.c.add(bVar);
    }

    public void b(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60b539b", new Object[]{this, bVar});
            return;
        }
        List<IContainerDataService.b> list = this.c;
        if (list == null) {
            return;
        }
        list.remove(bVar);
    }

    public void a(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1817795d", new Object[]{this, aVar});
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArrayList();
        }
        this.e.add(aVar);
    }

    public void b(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60adf3c", new Object[]{this, aVar});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    public void a(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1818621b", new Object[]{this, cVar});
            return;
        }
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(cVar);
    }

    public void b(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60bc7fa", new Object[]{this, cVar});
            return;
        }
        List<IContainerDataService.c> list = this.d;
        if (list == null) {
            return;
        }
        list.remove(cVar);
    }

    private void a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list == null) {
            return;
        }
        for (IContainerDataService.a aVar : list) {
            aVar.a(lliVar);
        }
    }

    private void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list == null) {
            return;
        }
        for (IContainerDataService.a aVar : list) {
            aVar.a(lliVar, iContainerDataModel);
        }
    }

    private void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list == null) {
            return;
        }
        for (IContainerDataService.a aVar : list) {
            aVar.b(lliVar, iContainerDataModel);
        }
    }
}
