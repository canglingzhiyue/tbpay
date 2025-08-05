package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class iqt {
    static {
        kge.a(-860137451);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f29233a;

        static {
            kge.a(-916469454);
        }

        public a(int i) {
            this.f29233a = i;
        }

        public static a a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d9a1c1a2", new Object[]{new Integer(i)}) : new a(i);
        }
    }

    /* loaded from: classes6.dex */
    public static class p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29237a;
        public boolean b;
        public Map<String, String> c;
        public Map<String, String> d;

        static {
            kge.a(2043521126);
        }

        public p(String str, boolean z, Map<String, String> map, Map<String, String> map2) {
            this.b = false;
            this.f29237a = str;
            this.b = z;
            this.c = map;
            this.d = map2;
        }

        public static p a(String str, boolean z, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("8d34d82c", new Object[]{str, new Boolean(z), map, map2}) : new p(str, z, map, map2);
        }
    }

    /* loaded from: classes6.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29234a;
        public boolean b;

        static {
            kge.a(-515944466);
        }

        private g(String str, boolean z) {
            this.f29234a = str;
            this.b = z;
        }

        public static g a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("233dc3a5", new Object[]{str}) : new g(str, false);
        }

        public static g a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4b91e8f5", new Object[]{str, new Boolean(z)}) : new g(str, z);
        }
    }

    /* loaded from: classes6.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29235a;

        static {
            kge.a(-31800747);
        }

        private h(String str) {
            this.f29235a = str;
        }

        public static h a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("233dc3c4", new Object[]{str}) : new h(str);
        }
    }

    /* loaded from: classes6.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29236a;

        static {
            kge.a(-444264706);
        }

        private i(String str) {
            this.f29236a = str;
        }

        public static i a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("233dc3e3", new Object[]{str}) : new i(str);
        }
    }
}
