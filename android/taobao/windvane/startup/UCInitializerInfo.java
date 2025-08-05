package android.taobao.windvane.startup;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class UCInitializerInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final UCInitializerInfo b;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Long> f1697a = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public @interface UCInitializerStages {
        public static final int DEX_READY = 5;
        public static final int DOWNLOAD_FINISH = 2;
        public static final int DOWNLOAD_START = 1;
        public static final int EXTRACT_FINISH = 4;
        public static final int EXTRACT_START = 3;
        public static final int GPU_PROCESS_READY = 10;
        public static final int INIT_FAIL = 8;
        public static final int INIT_START = 0;
        public static final int INIT_SUCCESS = 7;
        public static final int NATIVE_READY = 6;
        public static final int RENDER_PROCESS_READY = 9;
    }

    private UCInitializerInfo() {
    }

    static {
        kge.a(-1047356436);
        b = new UCInitializerInfo();
    }

    public static UCInitializerInfo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UCInitializerInfo) ipChange.ipc$dispatch("40cf3aad", new Object[0]) : b;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f1697a.containsKey(Integer.valueOf(i))) {
        } else {
            this.f1697a.put(Integer.valueOf(i), Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public long b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2e", new Object[]{this, new Integer(i)})).longValue();
        }
        Long l = this.f1697a.get(Integer.valueOf(i));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : this.f1697a.containsKey(Integer.valueOf(i));
    }
}
