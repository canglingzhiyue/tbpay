package com.taobao.themis.kernel.solution;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<TMSSolutionType, Class<? extends TMSBaseSolution>> f22567a;

    static {
        kge.a(1569751057);
        f22567a = new ConcurrentHashMap();
    }

    public static TMSBaseSolution a(f fVar, TMSSolutionType tMSSolutionType) {
        if (tMSSolutionType == null) {
            tMSSolutionType = TMSSolutionType.getType(fVar);
        }
        try {
            return a(tMSSolutionType).getConstructor(f.class).newInstance(fVar);
        } catch (Throwable th) {
            TMSLogger.b("TMSSolutionFactory", th.getMessage(), th);
            return null;
        }
    }

    public static void a(TMSSolutionType tMSSolutionType, Class<? extends TMSBaseSolution> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f58457", new Object[]{tMSSolutionType, cls});
        } else {
            f22567a.put(tMSSolutionType, cls);
        }
    }

    private static Class<? extends TMSBaseSolution> a(TMSSolutionType tMSSolutionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("61ce5853", new Object[]{tMSSolutionType});
        }
        if (tMSSolutionType != null) {
            return f22567a.get(tMSSolutionType);
        }
        return null;
    }
}
