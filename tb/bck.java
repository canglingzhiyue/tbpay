package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<bcj> f25800a = new ArrayList();
    private bcb b;

    static {
        kge.a(746210022);
    }

    public bck(bcb bcbVar) {
        this.b = bcbVar;
    }

    public void a(bcj bcjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17421ef", new Object[]{this, bcjVar});
        } else {
            this.f25800a.add(bcjVar);
        }
    }

    public void a(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e40d2", new Object[]{this, jnyVar, requestConfig});
            return;
        }
        for (bcj bcjVar : this.f25800a) {
            bcjVar.a(jnyVar, requestConfig);
        }
        b bVar = (b) this.b.w();
        if (bVar == null) {
            return;
        }
        List<IDMComponent> m = bVar.m();
        if (m != null) {
            for (int i = 0; i < m.size(); i++) {
                IDMComponent iDMComponent = m.get(i);
                for (bcj bcjVar2 : this.f25800a) {
                    bcjVar2.b(iDMComponent, i, m.size());
                }
            }
        }
        List<IDMComponent> b = bVar.b();
        for (int i2 = 0; i2 < b.size(); i2++) {
            IDMComponent iDMComponent2 = b.get(i2);
            for (bcj bcjVar3 : this.f25800a) {
                bcjVar3.a(iDMComponent2, i2, b.size());
            }
        }
    }

    public void b(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f413", new Object[]{this, jnyVar, requestConfig});
            return;
        }
        for (bcj bcjVar : this.f25800a) {
            bcjVar.b(jnyVar, requestConfig);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (bcj bcjVar : this.f25800a) {
            bcjVar.a();
        }
    }
}
