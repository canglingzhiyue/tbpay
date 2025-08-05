package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<IContainerService.a> f30602a;

    static {
        kge.a(333739093);
    }

    public void a(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc98b13", new Object[]{this, aVar});
            return;
        }
        if (this.f30602a == null) {
            this.f30602a = new CopyOnWriteArrayList();
        }
        this.f30602a.add(aVar);
    }

    public void b(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde0b872", new Object[]{this, aVar});
            return;
        }
        List<IContainerService.a> list = this.f30602a;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        List<IContainerService.a> list = this.f30602a;
        if (list == null) {
            return;
        }
        for (IContainerService.a aVar : list) {
            aVar.a(iUiRefreshActionModel);
        }
    }

    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        List<IContainerService.a> list = this.f30602a;
        if (list == null) {
            return;
        }
        for (IContainerService.a aVar : list) {
            aVar.b(iUiRefreshActionModel);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<IContainerService.a> list = this.f30602a;
        if (list == null) {
            return;
        }
        list.clear();
        this.f30602a = null;
    }
}
