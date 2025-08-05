package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public class jrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1300705115);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        }
    }

    public static String a(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0c20151", new Object[]{threadFactory});
        }
        Thread newThread = threadFactory.newThread($$Lambda$jrs$QWLBp_RZxWlgtMPaMMXbmUXthTo.INSTANCE);
        if (!(newThread instanceof VirtualThread)) {
            jrk.a(new IllegalStateException("Must use VirtualThread insteadof Thread"));
        }
        return a(newThread.getName());
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : a(StubExecutors.defaultThreadFactory());
    }

    private static String a(String str) {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') {
                sb.append(c);
                z = false;
            } else {
                if (!z) {
                    sb.append("x");
                }
                z = true;
            }
        }
        return sb.toString();
    }
}
