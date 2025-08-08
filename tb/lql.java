package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class lql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f30833a;
    public boolean b = true;

    static {
        kge.a(1984983370);
    }

    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
        } else if (!StringUtils.equals(iUiRefreshActionModel.getRequestType(), "scrollNextPage")) {
        } else {
            this.b = !StringUtils.isEmpty(iUiRefreshActionModel.getDataChangeType());
            if (this.b || (aVar = this.f30833a) == null) {
                return;
            }
            d(aVar.c(), this.f30833a.d());
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.b) {
            c(i, i2);
        } else {
            d(i, i2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.f30833a;
        if (aVar == null) {
            return;
        }
        aVar.a();
        HashMap hashMap = new HashMap(16);
        hashMap.put("index", String.valueOf(this.f30833a.d()));
        hashMap.put(BioDetector.EXT_KEY_PAGENUM, String.valueOf(this.f30833a.c()));
        hashMap.put("stay_time", String.valueOf(this.f30833a.e()));
        hashMap.put("loadingType", this.f30833a.b());
        hashMap.put("frameworkType", "infoflow");
        a(hashMap);
        bpp.a().commitSuccess("Smart_Loading", "loadingView_stay_time", "1.0", "PageHomeCommitTracker_Loading", "PageHomeCommitTracker_Loading_Legacy", hashMap);
        this.f30833a = null;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ldk.a("smartLoading_request", "", "1.0", "InfoFlow", "PageHomeCommitTracker_Loading_Legacy", null);
        ldl.a("Page_Home", 19999, "SmartLoading", "smartLoading_request", "InfoFlow", null);
    }

    public static void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i2));
        hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_length, String.valueOf(i3));
        hashMap.put("page", String.valueOf(i));
        ldk.a("smartLoading_insert", "", "1.0", "InfoFlow", "PageHomeCommitTracker_Loading_Legacy", hashMap);
        ldl.a("Page_Home", 19999, "SmartLoading", "smartLoading_insert", "InfoFlow", hashMap.toString());
    }

    public static void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i));
        hashMap.put("page", String.valueOf(i2));
        ldk.a("smartLoading_expose", "", "1.0", "InfoFlow", "PageHomeCommitTracker_Loading_Legacy", hashMap);
        ldl.a("Page_Home", 19999, "SmartLoading", "smartLoading_expose", "InfoFlow", hashMap.toString());
    }

    private void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f30833a != null) {
        } else {
            this.f30833a = new a(i, i2, "loading");
        }
    }

    private void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac4048b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.f30833a;
        if (aVar != null) {
            if (StringUtils.equals(aVar.b(), "error")) {
                return;
            }
            a();
        }
        this.f30833a = new a(i, i2, "error");
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Map<String, Object> a2 = oog.a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (String str : a2.keySet()) {
            Object obj = a2.get(str);
            if (obj != null) {
                map.put(str, obj.toString());
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f30834a;
        private int b;
        private String e;
        private long d = 0;
        private long c = SystemClock.uptimeMillis();

        static {
            kge.a(-1854144954);
        }

        public a(int i, int i2, String str) {
            this.f30834a = i;
            this.b = i2;
            this.e = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.d = SystemClock.uptimeMillis();
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f30834a;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b;
        }

        public long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
            }
            long j = this.d - this.c;
            if (j >= 0) {
                return j;
            }
            return 0L;
        }
    }
}
