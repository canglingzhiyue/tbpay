package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class mxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static mxi f31310a;
    private final Map<String, Boolean> b = new ConcurrentHashMap();

    static {
        kge.a(1537083547);
    }

    public static mxi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mxi) ipChange.ipc$dispatch("f0800c0", new Object[0]);
        }
        if (f31310a == null) {
            synchronized (mxi.class) {
                if (f31310a == null) {
                    f31310a = new mxi();
                }
            }
        }
        return f31310a;
    }

    private mxi() {
    }

    public synchronized boolean a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        return a(mxj.GROUP_NAME, str, j);
    }

    public synchronized boolean a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba98cc", new Object[]{this, str, str2, new Long(j)})).booleanValue();
        }
        String utdid = UTDevice.getUtdid(Globals.getApplication());
        if (this.b.containsKey(str2)) {
            return this.b.get(str2).booleanValue();
        }
        if (10000 - mxj.a(str, str2, j) > (a(utdid) % 5000) + 5000) {
            z = false;
        }
        this.b.put(str2, Boolean.valueOf(z));
        return z;
    }

    private static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        long j = 0;
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length > 0) {
            for (char c : charArray) {
                j = (j * 31) + c;
            }
        }
        return j;
    }
}
