package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.b;
import com.taobao.android.cachecleaner.monitor.info.c;
import com.taobao.android.cachecleaner.monitor.info.node.a;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class dvf implements b.a, b.InterfaceC0360b, c.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1605936563);
        kge.a(-664033728);
        kge.a(2055347703);
        kge.a(-593682234);
    }

    public abstract void a(CacheOverviewInfo cacheOverviewInfo);

    public boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc6edf03", new Object[]{this, aVar})).booleanValue();
        }
        if (!aVar.isDirectory()) {
            return false;
        }
        return f(aVar.parent());
    }

    public boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16490d41", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar.isDirectory()) {
            return false;
        }
        return f(aVar.parent());
    }

    public boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3362460", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        return StringUtils.equals(aVar.getName(), dvq.a()) || StringUtils.equals(aVar.path(), dvq.b()) || StringUtils.equals(aVar.path(), dvq.c());
    }

    public void a(Map<String, Long> map, a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46aa0a18", new Object[]{this, map, aVar, new Long(j)});
            return;
        }
        String path = aVar.path();
        if (map.size() > com.taobao.android.cachecleaner.monitor.config.a.a().b().getMaxFilesSize()) {
            TLog.logd(CacheCleaner.MODULE, "BaseTracker", "put2Map: map is too full, drop node " + aVar + ", differ size " + j);
            return;
        }
        if (path == null) {
            path = "UNKNOWN";
        }
        map.put(path, Long.valueOf(j));
    }
}
