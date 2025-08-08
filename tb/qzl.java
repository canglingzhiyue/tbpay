package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class qzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f33074a = new CopyOnWriteArrayList();
    private final List<a> b = new CopyOnWriteArrayList();

    /* loaded from: classes8.dex */
    public interface a {
        void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str);
    }

    static {
        kge.a(1283568741);
    }

    public static /* synthetic */ List a(qzl qzlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("552f1d12", new Object[]{qzlVar}) : qzlVar.f33074a;
    }

    public static /* synthetic */ void a(qzl qzlVar, JSONObject jSONObject, IContainerDataModel iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6694b32a", new Object[]{qzlVar, jSONObject, iContainerDataModel, str});
        } else {
            qzlVar.a(jSONObject, iContainerDataModel, str);
        }
    }

    public void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        Iterator<a> it = this.f33074a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            return;
        }
        b(jSONObject, str);
    }

    public void b(final JSONObject jSONObject, final IContainerDataModel<?> iContainerDataModel, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867ee37e", new Object[]{this, jSONObject, iContainerDataModel, str});
        } else {
            com.taobao.gateway.dispatch.a.b().c(new Runnable() { // from class: tb.qzl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (a aVar : qzl.a(qzl.this)) {
                        aVar.a(jSONObject, iContainerDataModel, str);
                    }
                    if (!StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
                        return;
                    }
                    qzl.a(qzl.this, jSONObject, iContainerDataModel, str);
                }
            });
        }
    }

    public void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f943b42", new Object[]{this, aVar, str});
        } else if (StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            this.b.add(aVar);
        } else {
            this.f33074a.add(aVar);
        }
    }

    public void b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6bf743", new Object[]{this, aVar, str});
        } else if (StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            this.b.remove(aVar);
        } else {
            this.f33074a.remove(aVar);
        }
    }

    private void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493da631", new Object[]{this, jSONObject, str});
        } else if (this.b.isEmpty()) {
        } else {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bbefbd", new Object[]{this, jSONObject, iContainerDataModel, str});
        } else if (!this.b.isEmpty()) {
            for (a aVar : this.b) {
                aVar.a(jSONObject, iContainerDataModel, str);
            }
        }
    }
}
