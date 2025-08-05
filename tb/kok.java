package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class kok {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AFC_PLUGIN_MODE_ASYNC = 0;
    public static final int AFC_PLUGIN_MODE_SYNC = 1;
    public static final int AFC_PLUGIN_TYPE_POST = 1;
    public static final int AFC_PLUGIN_TYPE_PRE = 0;

    /* renamed from: a  reason: collision with root package name */
    public List<koj> f30192a;
    public List<koj> b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static kok f30193a;

        static {
            kge.a(-856642068);
            f30193a = new kok();
        }

        public static /* synthetic */ kok a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kok) ipChange.ipc$dispatch("f06f677", new Object[0]) : f30193a;
        }
    }

    static {
        kge.a(391141145);
    }

    public static kok a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kok) ipChange.ipc$dispatch("f06f677", new Object[0]) : a.a();
    }

    private kok() {
        this.f30192a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
    }

    public void a(koj kojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f178d992", new Object[]{this, kojVar});
        } else if (kojVar.a() == 0) {
            this.f30192a.add(kojVar);
        } else {
            this.b.add(kojVar);
        }
    }
}
