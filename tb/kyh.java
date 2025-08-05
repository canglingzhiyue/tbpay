package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class kyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<kyn> f30396a;
    private final kyo b;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final kyh f30397a;

        static {
            kge.a(-2060477275);
            f30397a = new kyh();
        }

        public static /* synthetic */ kyh a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kyh) ipChange.ipc$dispatch("f071ba4", new Object[0]) : f30397a;
        }
    }

    static {
        kge.a(1651986579);
    }

    public static kyh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kyh) ipChange.ipc$dispatch("f071ba4", new Object[0]) : a.a();
    }

    private kyh() {
        this.f30396a = new CopyOnWriteArrayList();
        this.b = new kyo();
        a(this.b);
    }

    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            a(str, str2, "investigate", map);
        }
    }

    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
        } else {
            a(str, str2, "monitor", map);
        }
    }

    private void a(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
            return;
        }
        String b = b();
        if (map == null) {
            map = new HashMap<>();
        }
        a(str3, str, str2, new TbHRLogModel(str3, str2, b, str, map));
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            return String.valueOf(System.currentTimeMillis());
        } catch (Exception e) {
            ldf.d("Messiah", "commit log occur exception: " + e);
            return null;
        }
    }

    private void a(kyn kynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2079618", new Object[]{this, kynVar});
        } else {
            this.f30396a.add(kynVar);
        }
    }

    private void a(String str, String str2, String str3, TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df74fa8d", new Object[]{this, str, str2, str3, tbHRLogModel});
        } else if (this.f30396a.isEmpty()) {
            ldf.d("Messiah", "notifyCommit mCommitListenerList == null");
        } else {
            for (kyn kynVar : this.f30396a) {
                kynVar.a(str2, str, str3, tbHRLogModel);
                ldf.d("Messiah", "通知提交数据了");
            }
        }
    }
}
