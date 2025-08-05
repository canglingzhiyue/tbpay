package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class eue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<? extends eud>, eud<?>> f27576a = new HashMap();
    private static int b = 0;
    private static final List<Class<? extends eud<?>>> c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(eud<?> eudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78d98a4", new Object[]{eudVar});
        } else {
            f27576a.put(eudVar.getClass(), eudVar);
        }
    }

    public static <V extends eud<D>, D> D a(Class<V> cls, Class<D> cls2, D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (D) ipChange.ipc$dispatch("f3f389ce", new Object[]{cls, cls2, d});
        }
        eud<?> eudVar = f27576a.get(cls);
        if (eudVar == null) {
            return d;
        }
        try {
            return (D) eudVar.a();
        } catch (Exception e) {
            AdapterForTLog.loge("DetailWeexMainPicShareState", "getValue cast exception:" + e.getMessage());
            return d;
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f27576a.clear();
        c.clear();
        b = 0;
        AdapterForTLog.loge("DetailWeexMainPicShareState", "clearAutoScrollToFrameIndex");
    }

    public static void a(Class<? extends eud<?>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{cls});
        } else if (c.contains(cls)) {
        } else {
            if (f27576a.containsKey(cls)) {
                c.add(cls);
                b++;
            }
            if (b < f27576a.size()) {
                return;
            }
            a();
        }
    }
}
