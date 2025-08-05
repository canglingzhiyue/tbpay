package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import java.util.List;

/* loaded from: classes5.dex */
public class fly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public flx f28043a;

    /* loaded from: classes5.dex */
    public interface a {
        DetailDataManager.LimitedQueue<String> a();

        void a(RecRequestParamsV2 recRequestParamsV2, DetailDataManager.a aVar);

        boolean a(String str, String str2);

        DetailDataManager.LimitedQueue<String> b();

        d c();

        List<d> d();
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, String str);

        void a(d dVar, List<d> list, String str);
    }

    static {
        kge.a(-697773037);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        flx flxVar = this.f28043a;
        if (flxVar == null) {
            return;
        }
        flxVar.a(str);
    }

    public void a(flx flxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ccb526", new Object[]{this, flxVar});
        } else {
            this.f28043a = flxVar;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fe48c7", new Object[]{this, bVar});
            return;
        }
        flx flxVar = this.f28043a;
        if (flxVar == null) {
            return;
        }
        flxVar.a(bVar);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fdd468", new Object[]{this, aVar});
            return;
        }
        flx flxVar = this.f28043a;
        if (flxVar == null) {
            return;
        }
        flxVar.a(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        flx flxVar = this.f28043a;
        if (flxVar == null) {
            return;
        }
        flxVar.a();
    }
}
