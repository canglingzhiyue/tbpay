package com.taobao.android.cachecleaner.monitor.info;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f9289a = new ArrayList();

    /* loaded from: classes4.dex */
    public interface b {
        void a(com.taobao.android.cachecleaner.monitor.info.node.a aVar);

        void a(com.taobao.android.cachecleaner.monitor.info.node.a aVar, long j);

        void b(com.taobao.android.cachecleaner.monitor.info.node.a aVar);
    }

    static {
        kge.a(549189550);
    }

    public a a(com.taobao.android.cachecleaner.monitor.info.node.a aVar, com.taobao.android.cachecleaner.monitor.info.node.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("22412921", new Object[]{this, aVar, aVar2});
        }
        a aVar3 = new a();
        if (TextUtils.equals(aVar.getName(), aVar2.getName())) {
            a(aVar, aVar2, aVar3);
            b(aVar, aVar2, aVar3);
            return aVar3;
        }
        TLog.loge(CacheCleaner.MODULE, "CacheTreeDiffer", "differ: root directories are inconsistent!");
        return null;
    }

    private void a(com.taobao.android.cachecleaner.monitor.info.node.a aVar, com.taobao.android.cachecleaner.monitor.info.node.a aVar2, a aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d34d1b", new Object[]{this, aVar, aVar2, aVar3});
            return;
        }
        if (aVar.getSize() != aVar2.getSize() && !a.a(aVar3).containsKey(aVar2)) {
            a.a(aVar3).put(aVar2, Long.valueOf(aVar2.getSize() - aVar.getSize()));
            for (b bVar : this.f9289a) {
                bVar.a(aVar2, aVar2.getSize() - aVar.getSize());
            }
        }
        for (com.taobao.android.cachecleaner.monitor.info.node.a aVar4 : aVar.children()) {
            com.taobao.android.cachecleaner.monitor.info.node.a a2 = a(aVar4, aVar2.children());
            if (a2 == null) {
                a.b(aVar3).add(aVar4);
                for (b bVar2 : this.f9289a) {
                    bVar2.a(aVar4);
                }
            } else {
                a(aVar4, a2, aVar3);
            }
        }
    }

    private void b(com.taobao.android.cachecleaner.monitor.info.node.a aVar, com.taobao.android.cachecleaner.monitor.info.node.a aVar2, a aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da9f91c", new Object[]{this, aVar, aVar2, aVar3});
            return;
        }
        if (aVar.getSize() != aVar2.getSize() && !a.a(aVar3).containsKey(aVar2)) {
            a.a(aVar3).put(aVar2, Long.valueOf(aVar2.getSize() - aVar.getSize()));
            for (b bVar : this.f9289a) {
                bVar.a(aVar2, aVar2.getSize() - aVar.getSize());
            }
        }
        for (com.taobao.android.cachecleaner.monitor.info.node.a aVar4 : aVar2.children()) {
            com.taobao.android.cachecleaner.monitor.info.node.a a2 = a(aVar4, aVar.children());
            if (a2 == null) {
                a.c(aVar3).add(aVar4);
                for (b bVar2 : this.f9289a) {
                    bVar2.b(aVar4);
                }
            } else {
                b(a2, aVar4, aVar3);
            }
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7ae3da", new Object[]{this, bVar});
        } else {
            this.f9289a.add(bVar);
        }
    }

    private com.taobao.android.cachecleaner.monitor.info.node.a a(com.taobao.android.cachecleaner.monitor.info.node.a aVar, List<com.taobao.android.cachecleaner.monitor.info.node.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.cachecleaner.monitor.info.node.a) ipChange.ipc$dispatch("92c5ccb", new Object[]{this, aVar, list});
        }
        if (aVar.getName() == null) {
            return null;
        }
        for (com.taobao.android.cachecleaner.monitor.info.node.a aVar2 : list) {
            if (aVar.getName().equals(aVar2.getName())) {
                return aVar2;
            }
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List<com.taobao.android.cachecleaner.monitor.info.node.a> f9290a = new ArrayList();
        private final List<com.taobao.android.cachecleaner.monitor.info.node.a> b = new ArrayList();
        private final Map<com.taobao.android.cachecleaner.monitor.info.node.a, Long> c = new HashMap();

        static {
            kge.a(-714230907);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("222a4e70", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ List b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5bf57e0b", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ List c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("94d5deaa", new Object[]{aVar}) : aVar.f9290a;
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        this.f9289a.clear();
        super.finalize();
    }
}
