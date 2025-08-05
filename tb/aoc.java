package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class aoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aoc f25466a;
    private static Map<String, String> b;

    static {
        kge.a(-1156116508);
        f25466a = null;
        b = Collections.synchronizedMap(new HashMap());
    }

    private aoc() {
    }

    public static synchronized aoc a() {
        synchronized (aoc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aoc) ipChange.ipc$dispatch("f0269c9", new Object[0]);
            }
            if (f25466a == null) {
                f25466a = new aoc();
            }
            return f25466a;
        }
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            b.put(str, str2);
        }
    }

    public synchronized String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = b.get(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        return str2;
    }

    public synchronized long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        String str2 = b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }
}
