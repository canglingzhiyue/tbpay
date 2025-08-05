package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public class nrw {

    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f31703a;

        static {
            kge.a(-2108294059);
        }
    }

    static {
        kge.a(-813627411);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31702a;

        static {
            kge.a(-1597403145);
        }

        private a(String str) {
            this.f31702a = str;
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2bd572a4", new Object[]{str}) : new a(str);
        }
    }

    /* loaded from: classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31704a;
        public String b;
        public Map<String, String> c;
        public String d;

        static {
            kge.a(1677621537);
        }

        private d(String str, String str2, String str3, Map<String, String> map) {
            this.f31704a = str;
            this.b = str2;
            this.c = map;
            this.d = str3;
        }

        public static d a(String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("79ea4f54", new Object[]{str, str2, str3, map}) : new d(str, str2, str3, map);
        }
    }

    /* loaded from: classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b f31705a;

        static {
            kge.a(-454205043);
        }

        private e(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
            this.f31705a = bVar;
        }

        public static e a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("6d75581e", new Object[]{bVar}) : new e(bVar);
        }
    }
}
