package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class suf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f33904a = new CopyOnWriteArrayList();
    private final List<a> b = new CopyOnWriteArrayList();

    /* loaded from: classes8.dex */
    public interface a {
        void a(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str);
    }

    static {
        kge.a(770051623);
    }

    public void a(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fafb607", new Object[]{this, iContainerDataModel, jSONObject, str});
            return;
        }
        Iterator<a> it = this.f33904a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (!StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            return;
        }
        c(iContainerDataModel, jSONObject, str);
    }

    public void b(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f72a9c8", new Object[]{this, iContainerDataModel, jSONObject, str});
            return;
        }
        for (a aVar : this.f33904a) {
            aVar.a(iContainerDataModel, jSONObject, str);
        }
        if (!StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            return;
        }
        d(iContainerDataModel, jSONObject, str);
    }

    public void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64c0741", new Object[]{this, aVar, str});
        } else if (StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            this.b.add(aVar);
        } else {
            this.f33904a.add(aVar);
        }
    }

    public void b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3423c342", new Object[]{this, aVar, str});
        } else if (StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
            this.b.remove(aVar);
        } else {
            this.f33904a.remove(aVar);
        }
    }

    private void c(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f359d89", new Object[]{this, iContainerDataModel, jSONObject, str});
        } else if (this.b.isEmpty()) {
        } else {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private void d(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef8914a", new Object[]{this, iContainerDataModel, jSONObject, str});
        } else if (!this.b.isEmpty()) {
            for (a aVar : this.b) {
                aVar.a(iContainerDataModel, jSONObject, str);
            }
        }
    }
}
