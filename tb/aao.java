package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.dynamicFeature.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class aao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<a, AtomicInteger> f25190a = new HashMap();
    private ReentrantReadWriteLock b = new ReentrantReadWriteLock(true);

    static {
        kge.a(-18618793);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aac472b", new Object[]{this, aVar});
        } else if (aVar == null) {
            arc.a().b("AURADynamicFeatureInstallerQueue.add:bundleInfo is null");
        } else {
            try {
                this.b.writeLock().lock();
                for (a aVar2 : this.f25190a.keySet()) {
                    if (aVar2 != null && a.a(aVar2, aVar)) {
                        return;
                    }
                }
                this.f25190a.put(aVar, new AtomicInteger(2));
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c7c5ca", new Object[]{this, aVar});
        } else if (aVar == null) {
            arc.a().b("AURADynamicFeatureInstallerQueue.remove:bundleInfo is null");
        } else {
            try {
                this.b.writeLock().lock();
                for (a aVar2 : this.f25190a.keySet()) {
                    if (aVar2 != null && a.a(aVar2, aVar)) {
                        this.f25190a.remove(aVar2);
                        return;
                    }
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            arc.a().b("AURADynamicFeatureInstallerQueue.remove:artifactId is null");
        } else {
            try {
                this.b.writeLock().lock();
                for (a aVar : this.f25190a.keySet()) {
                    if (aVar != null && StringUtils.equals(aVar.f2138a, str)) {
                        this.f25190a.remove(aVar);
                        return;
                    }
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadd1138", new Object[]{this, aVar, new Integer(i)});
        } else if (aVar == null) {
            arc.a().b("AURADynamicFeatureInstallerQueue.updateStatus:bundleInfo is null");
        } else if (i != 2 && i != 3 && i != 4) {
            arc.a().b("AURADynamicFeatureInstallerQueue.updateStatus:not right status");
        } else {
            try {
                this.b.writeLock().lock();
                for (Map.Entry<a, AtomicInteger> entry : this.f25190a.entrySet()) {
                    if (entry != null && entry.getKey() != null && a.a(entry.getKey(), aVar)) {
                        (entry.getValue() == null ? new AtomicInteger() : entry.getValue()).set(i);
                        return;
                    }
                }
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public int c(a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ee3445c", new Object[]{this, aVar})).intValue();
        }
        if (aVar == null) {
            arc.a().b("AURADynamicFeatureInstallerQueue.queryStatus:bundleInfo is null");
            return 0;
        }
        try {
            this.b.readLock().lock();
            for (Map.Entry<a, AtomicInteger> entry : this.f25190a.entrySet()) {
                if (entry != null && entry.getKey() != null && a.a(entry.getKey(), aVar)) {
                    AtomicInteger value = entry.getValue();
                    if (value != null) {
                        i = value.get();
                    }
                    return i;
                }
            }
            return 0;
        } finally {
            this.b.readLock().unlock();
        }
    }
}
