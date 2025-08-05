package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class oph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Long f32261a;
    private static boolean b;
    private static final List<String> c;

    static {
        kge.a(772405885);
        c = new CopyOnWriteArrayList();
    }

    public static void a(JSONObject jSONObject, ksk kskVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d028ba8e", new Object[]{jSONObject, kskVar, new Integer(i)});
        } else if (!a(i, kskVar)) {
            lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "当前不要预请求");
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            osd.a(kskVar).b(null, jSONObject);
            lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "创建容器耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
            c.add(kskVar.a());
            f32261a = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if ("TYPE_MISS".equals(str)) {
            b = true;
            lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "发现预请求miss掉了");
        } else {
            c.clear();
            a();
            lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "预请求回调回来了，一切重置");
        }
    }

    private static boolean a(int i, ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f1f02c", new Object[]{new Integer(i), kskVar})).booleanValue();
        }
        boolean a2 = a(i);
        if (a2) {
            lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "距离上次请求是否间隔大于15s：" + a2);
            return true;
        }
        String a3 = kskVar.a();
        if (a3 != null) {
            boolean z = !c.contains(a3);
            lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "当前是否被消费掉了：" + z);
            return z;
        }
        lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "当前预请求是否被miss掉了：" + b);
        return !b;
    }

    private static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (f32261a == null) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long longValue = uptimeMillis - f32261a.longValue();
        lap.a("recmdPrefetch", "RecommendPrefetchScheduler", "当前的时间是：" + uptimeMillis + "上次预请求的时间是：" + f32261a);
        return longValue > ((long) i);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f32261a = null;
        b = false;
    }
}
