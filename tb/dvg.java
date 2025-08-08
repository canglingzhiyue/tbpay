package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dvg extends dvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f27015a = new HashMap();

    static {
        kge.a(-1183619350);
    }

    @Override // tb.dvf
    public void a(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f070e3b2", new Object[]{this, cacheOverviewInfo});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e294b0c1", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7001de23", new Object[]{this, aVar, new Long(j)});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.InterfaceC0360b
    public void a(File file, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4b39aa", new Object[]{this, file, aVar});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.c.b
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f81c7e0", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.b.a
    public void a(File file, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1c725a", new Object[]{this, file, aVar, new Long(j)});
            return;
        }
        a parent = aVar.parent();
        if (parent == null) {
            return;
        }
        if (!c(aVar) && !StringUtils.equals(parent.getName(), "/ExternalCache/cache") && !StringUtils.equals(parent.getName(), "/ExternalFiles/files")) {
            return;
        }
        this.f27015a.put(aVar.path(), Long.valueOf(j >> 10));
    }

    public Map<String, Long> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f27015a;
    }
}
