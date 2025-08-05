package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;

/* loaded from: classes7.dex */
public class nqw {
    static {
        kge.a(-1761024435);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ActivateBean f31670a;
        public int b;
        public String c;

        static {
            kge.a(600966686);
        }

        private a(ActivateBean activateBean, int i, String str) {
            this.f31670a = activateBean;
            this.b = i;
            this.c = str;
        }

        public static a a(ActivateBean activateBean, int i, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7fd5a8f0", new Object[]{activateBean, new Integer(i), str}) : new a(activateBean, i, str);
        }
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ActivateBean f31671a;

        static {
            kge.a(-1134378494);
        }

        private b(ActivateBean activateBean) {
            this.f31671a = activateBean;
        }

        public static b a(ActivateBean activateBean) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4e2e26ec", new Object[]{activateBean}) : new b(activateBean);
        }
    }

    /* loaded from: classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2066676239);
        }

        private c() {
        }

        public static c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6e6317eb", new Object[0]) : new c();
        }
    }

    /* loaded from: classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(316621470);
        }

        private e() {
        }

        public static e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("6e631829", new Object[0]) : new e();
        }
    }

    /* loaded from: classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public HistoryCellBean f31673a;

        static {
            kge.a(318253116);
        }

        private f(HistoryCellBean historyCellBean) {
            this.f31673a = historyCellBean;
        }

        public static f a(HistoryCellBean historyCellBean) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4fa017a0", new Object[]{historyCellBean}) : new f(historyCellBean);
        }
    }

    /* loaded from: classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b f31672a;

        static {
            kge.a(265137648);
        }

        private d(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
            this.f31672a = bVar;
        }

        public static d a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6d67407e", new Object[]{bVar}) : new d(bVar);
        }
    }
}
