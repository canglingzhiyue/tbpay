package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.a;
import com.taobao.android.publisher.service.export.ayscpublish.core.b;
import com.taobao.android.publisher.service.export.ayscpublish.core.c;
import com.taobao.android.publisher.service.export.ayscpublish.core.d;

/* loaded from: classes6.dex */
public class icp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile icp b;

    /* renamed from: a  reason: collision with root package name */
    private a f28907a;

    private icp() {
    }

    public static icp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icp) ipChange.ipc$dispatch("f05e148", new Object[0]);
        }
        if (b == null) {
            synchronized (icp.class) {
                if (b == null) {
                    b = new icp();
                }
            }
        }
        return b;
    }

    public void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea88f171", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        this.f28907a = aVar;
        if (!z) {
            return;
        }
        d.b().c();
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8a86d628", new Object[]{this}) : this.f28907a;
    }

    public b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("554e88ee", new Object[]{this, bVar}) : d.b().h(bVar);
    }

    public boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2057e285", new Object[]{this, cVar})).booleanValue() : d.b().a(cVar);
    }

    public <T extends b<?>> boolean a(Class<T> cls, c<T> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a13d5f2", new Object[]{this, cls, cVar})).booleanValue() : d.b().a(cls, cVar);
    }
}
