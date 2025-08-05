package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface jvm {

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);

        void a(c cVar);
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f29817a;
        public String b;
        public String c;

        static {
            kge.a(-2141093442);
        }

        public b(String str, String str2, String str3) {
            this.f29817a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* loaded from: classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, c> f29819a = new HashMap();
        public int b;
        public int c;
        public long d;

        static {
            kge.a(-1860669504);
        }
    }

    c a(String str);

    d a(List<b> list, long j, r rVar);

    void a(String str, String str2, String str3, boolean z, r rVar, a aVar);

    d b(List<b> list, long j, r rVar);

    void b(String str, String str2, String str3, boolean z, r rVar, a aVar);

    void c(String str);

    boolean e(String str);

    /* loaded from: classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f29818a;
        private final String b;
        private final boolean c;
        private final boolean d;
        private final String e;
        private final String f;
        private final String g;

        static {
            kge.a(68418727);
        }

        public byte[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.f29818a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public static c a(byte[] bArr, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("56b9638d", new Object[]{bArr, str}) : a(bArr, str, "unknow");
        }

        public static c a(byte[] bArr, String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b2c8d143", new Object[]{bArr, str, str2}) : new c(bArr, str, false, true, null, str2, null);
        }

        public static c a(byte[] bArr, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8bd87d79", new Object[]{bArr, str, str2, str3}) : new c(bArr, str, false, true, null, str2, str3);
        }

        public static c b(byte[] bArr, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c4b8de18", new Object[]{bArr, str, str2, str3}) : new c(bArr, str, false, false, null, str2, str3);
        }

        private c(byte[] bArr, String str, boolean z, boolean z2, String str2, String str3, String str4) {
            this.f29818a = bArr;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.g = str2;
            this.e = str3;
            this.f = str4;
        }
    }
}
