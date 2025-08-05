package com.taobao.tao.infoflow.commonsubservice.dataservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ksk;
import tb.ksp;
import tb.lcz;
import tb.ovr;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, HomeInfoFlowDataService> f20628a;
    private static final Set<String> b;

    static {
        kge.a(692644725);
        f20628a = new ConcurrentHashMap(2);
        HashSet hashSet = new HashSet(4);
        b = hashSet;
        hashSet.add(ksk.NEW_FACE_CHILD.f30287a);
        b.add(ksk.NEW_FACE_CHILD_INTL.f30287a);
    }

    public static HomeInfoFlowDataService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeInfoFlowDataService) ipChange.ipc$dispatch("40701be3", new Object[]{str});
        }
        if (!b.contains(str)) {
            ksp.c("InfoFlowDataServiceDetector", "findInfoFlowDataService 容器ID未开放新架构信息流 : " + str);
            if (!lcz.b()) {
                return null;
            }
            if (!ksk.NEW_FACE_CHILD.f30287a.equals(str) && !ksk.NEW_FACE_CHILD_INTL.f30287a.equals(str)) {
                return null;
            }
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.infoflow.commonsubservice.dataservice.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    throw new InfoFlowRuntimeException("新架构已经全量，这里有个拖后腿的case，赶紧查看一下~~~");
                }
            });
            return null;
        }
        return f20628a.get(ovr.e());
    }

    public static void a(String str, HomeInfoFlowDataService homeInfoFlowDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd0fdf1", new Object[]{str, homeInfoFlowDataService});
        } else {
            f20628a.put(str, homeInfoFlowDataService);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            f20628a.remove(str);
        }
    }
}
