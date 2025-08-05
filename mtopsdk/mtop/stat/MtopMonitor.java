package mtopsdk.mtop.stat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class MtopMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IMtopMonitor headerMonitor;
    private static volatile IMtopMonitor monitor;
    private static volatile ConcurrentHashMap<String, IMtopMonitor> responseHeaderMonitors;

    static {
        kge.a(906517409);
        monitor = null;
        headerMonitor = null;
        responseHeaderMonitors = new ConcurrentHashMap<>();
    }

    public static void addMtopMonitor(IMtopMonitor iMtopMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334e188d", new Object[]{iMtopMonitor});
        } else {
            monitor = new Proxy(iMtopMonitor);
        }
    }

    public static void addHeaderMonitor(IMtopMonitor iMtopMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22164ee8", new Object[]{iMtopMonitor});
        } else {
            headerMonitor = new Proxy(iMtopMonitor);
        }
    }

    public static void addResponseHeaderMonitor(String str, IMtopMonitor iMtopMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e172f1", new Object[]{str, iMtopMonitor});
        } else if (responseHeaderMonitors == null) {
        } else {
            responseHeaderMonitors.put(str, new Proxy(iMtopMonitor));
        }
    }

    public static void removeResponseHeaderMonitor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4194b5b9", new Object[]{str});
        } else if (responseHeaderMonitors == null) {
        } else {
            responseHeaderMonitors.remove(str);
        }
    }

    public static IMtopMonitor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMtopMonitor) ipChange.ipc$dispatch("cf893279", new Object[0]) : monitor;
    }

    public static IMtopMonitor getHeaderMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMtopMonitor) ipChange.ipc$dispatch("42f69aad", new Object[0]) : headerMonitor;
    }

    public static ConcurrentHashMap<String, IMtopMonitor> getResponseHeaderMonitors() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("263e47c2", new Object[0]) : responseHeaderMonitors;
    }

    /* loaded from: classes.dex */
    public static class Proxy implements IMtopMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IMtopMonitor mtopMonitor;

        static {
            kge.a(-303124597);
            kge.a(498840314);
        }

        public Proxy(IMtopMonitor iMtopMonitor) {
            this.mtopMonitor = null;
            this.mtopMonitor = iMtopMonitor;
        }

        @Override // mtopsdk.mtop.stat.IMtopMonitor
        public void onCommit(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6701704c", new Object[]{this, str, hashMap});
                return;
            }
            IMtopMonitor iMtopMonitor = this.mtopMonitor;
            if (iMtopMonitor == null) {
                return;
            }
            iMtopMonitor.onCommit(str, hashMap);
        }
    }
}
