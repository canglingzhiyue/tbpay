package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class sdi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UN_INIT = -1;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, Integer> f33492a;

    static {
        kge.a(1413054001);
        f33492a = new ConcurrentHashMap();
    }

    public static void a(DinamicXEngine dinamicXEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bb888a", new Object[]{dinamicXEngine, new Integer(i)});
        } else {
            f33492a.put(Integer.valueOf(dinamicXEngine.hashCode()), Integer.valueOf(i));
        }
    }

    public static int a(DinamicXEngine dinamicXEngine) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37589d8c", new Object[]{dinamicXEngine})).intValue();
        }
        int hashCode = dinamicXEngine.hashCode();
        if (!f33492a.containsKey(Integer.valueOf(hashCode)) || (num = f33492a.get(Integer.valueOf(hashCode))) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f33492a.clear();
        }
    }
}
