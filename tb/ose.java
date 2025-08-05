package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes8.dex */
public class ose {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Set<WeakReference<osp>>> f32358a;

    static {
        kge.a(1608708696);
        f32358a = new HashMap();
    }

    public static void a(String str, osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3871ca16", new Object[]{str, ospVar});
            return;
        }
        Set<WeakReference<osp>> set = f32358a.get(str);
        if (set == null) {
            set = new CopyOnWriteArraySet<>();
            f32358a.put(str, set);
        }
        set.add(new WeakReference<>(ospVar));
        e.e("RecommendInstanceRecorder", "购后新增实例 containerId : " + str + ", mRecommendManagerImpl : " + ospVar + "， 当前实例个数：" + set.size());
    }

    public static void b(String str, osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5a9257", new Object[]{str, ospVar});
            return;
        }
        Set<WeakReference<osp>> set = f32358a.get(str);
        if (set == null || set.isEmpty()) {
            return;
        }
        for (WeakReference<osp> weakReference : set) {
            osp ospVar2 = weakReference.get();
            if (ospVar2 == null || ospVar2.equals(ospVar)) {
                set.remove(weakReference);
            }
        }
        e.e("RecommendInstanceRecorder", "购后移除实例 containerId : " + str + ", mRecommendManagerImpl : " + ospVar + "， 当前实例个数：" + set.size());
        if (!set.isEmpty()) {
            return;
        }
        f32358a.remove(str);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        Set<WeakReference<osp>> set = f32358a.get(str);
        return set == null || set.isEmpty();
    }
}
