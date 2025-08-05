package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.osz;

/* loaded from: classes8.dex */
public class osv implements osz, otd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<osz.a> f32383a = new CopyOnWriteArrayList();

    static {
        kge.a(-971803271);
        kge.a(-967575941);
        kge.a(1244317529);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f32383a.clear();
        }
    }

    @Override // tb.osz
    public void a(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8dfa5", new Object[]{this, aVar});
            return;
        }
        if (this.f32383a == null) {
            this.f32383a = new CopyOnWriteArrayList();
        }
        this.f32383a.add(aVar);
    }

    @Override // tb.osz
    public void b(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc449e6", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f32383a.remove(aVar);
        }
    }

    @Override // tb.otd
    public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            return;
        }
        List<osz.a> list = this.f32383a;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (osz.a aVar : this.f32383a) {
            aVar.a(str, str2, awesomeGetData, z);
        }
    }

    @Override // tb.otd
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        List<osz.a> list = this.f32383a;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (osz.a aVar : this.f32383a) {
            aVar.a(str, str2, str3);
        }
    }

    @Override // tb.otd
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            return;
        }
        List<osz.a> list = this.f32383a;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (osz.a aVar : this.f32383a) {
            aVar.a(str, awesomeGetRequestParams, str2, z);
        }
    }

    @Override // tb.otd
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1acb7ed", new Object[]{this, str, awesomeGetRequestParams, aVar});
            return;
        }
        for (osz.a aVar2 : this.f32383a) {
            if (aVar2 instanceof osz.b) {
                ((osz.b) aVar2).a(str, awesomeGetRequestParams, aVar);
            }
        }
    }
}
