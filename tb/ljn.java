package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class ljn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30687a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;

    static {
        kge.a(-474931303);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6a92aa91", new Object[]{this}) : new a(this);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ljn f30688a;
        public final Map<String, String> b = new HashMap();

        static {
            kge.a(-1143120002);
        }

        public a(ljn ljnVar) {
            this.f30688a = ljnVar;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a92aa91", new Object[]{this});
            }
            this.b.put("tabid", this.f30688a.f30687a);
            this.b.put("sessionid", this.f30688a.b);
            this.b.put(Constants.Weex.INSTANCEID, this.f30688a.c);
            this.b.put("index", this.f30688a.d);
            this.b.put("id", this.f30688a.e);
            this.b.put("url", this.f30688a.f);
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6126e80d", new Object[]{this, new Boolean(z)});
            }
            ljn ljnVar = this.f30688a;
            ljnVar.j = z;
            if (z) {
                ljnVar.m++;
            }
            this.b.put("pageappear", String.valueOf(z));
            this.b.put("pageappearnum", String.valueOf(this.f30688a.m));
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bb02524e", new Object[]{this, new Boolean(z)});
            }
            ljn ljnVar = this.f30688a;
            ljnVar.h = z;
            if (z) {
                ljnVar.k++;
            }
            this.b.put("appear", String.valueOf(z));
            this.b.put("appearnum", String.valueOf(this.f30688a.k));
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("14ddbc8f", new Object[]{this, new Boolean(z)});
            }
            ljn ljnVar = this.f30688a;
            ljnVar.i = z;
            if (z) {
                ljnVar.l++;
            }
            this.b.put("active", String.valueOf(z));
            this.b.put("activenum", String.valueOf(this.f30688a.l));
            return this;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c707430", new Object[]{this});
            }
            String str = this.f30688a.g;
            if (!StringUtils.isEmpty(str)) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -2113389068:
                        if (str.equals("pagedisappear")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1422950650:
                        if (str.equals("active")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1411068523:
                        if (str.equals("appear")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -947487158:
                        if (str.equals("webloadinit")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -189603564:
                        if (str.equals("disactive")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -177721437:
                        if (str.equals("disappear")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -99989769:
                        if (str.equals("webloadfailed")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 3015911:
                        if (str.equals("back")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 3443508:
                        if (str.equals("play")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 310351011:
                        if (str.equals("loadfailed")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 545472344:
                        if (str.equals("loadfinished")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 1344973996:
                        if (str.equals("webloadfinished")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 1684195556:
                        if (str.equals("pageappear")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1789472487:
                        if (str.equals("databind")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                long j = 0;
                switch (c) {
                    case 0:
                        this.f30688a.r = 0L;
                        break;
                    case 1:
                        a(true);
                        break;
                    case 2:
                        a(false);
                        break;
                    case 3:
                        b(true);
                        this.f30688a.s = SystemClock.elapsedRealtime();
                        this.b.put("duration", String.valueOf(d()));
                        break;
                    case 4:
                        if (this.f30688a.s > 0) {
                            j = SystemClock.elapsedRealtime() - this.f30688a.s;
                        }
                        this.b.put("duration", String.valueOf(j));
                        b(false);
                        break;
                    case 5:
                        c(true);
                        this.f30688a.t = SystemClock.elapsedRealtime();
                        this.b.put("duration", String.valueOf(d()));
                        break;
                    case 6:
                        this.b.put("duration", String.valueOf(f()));
                        c(false);
                        break;
                    case 7:
                        this.f30688a.q = SystemClock.elapsedRealtime();
                        this.f30688a.n++;
                        this.b.put("playgamenum", String.valueOf(this.f30688a.n));
                        this.b.put("duration", String.valueOf(f()));
                        break;
                    case '\b':
                        ljn ljnVar = this.f30688a;
                        ljnVar.r = ljnVar.q > 0 ? SystemClock.elapsedRealtime() - this.f30688a.q : 0L;
                        this.b.put("duration", String.valueOf(this.f30688a.r));
                        this.f30688a.q = 0L;
                        break;
                    case '\t':
                        this.f30688a.p = SystemClock.elapsedRealtime();
                        this.b.put("duration", String.valueOf(d()));
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        this.b.put("duration", String.valueOf(e()));
                        break;
                }
                this.b.put("name", str);
            }
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("27f6ee07", new Object[]{this, str});
            }
            this.b.put("webState", str);
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b0272de6", new Object[]{this, str});
            }
            this.b.put("gamestate", str);
            return this;
        }

        public a a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c333a07c", new Object[]{this, map});
            }
            if (!ogv.a(map)) {
                this.b.putAll(map);
            }
            return this;
        }

        public Map<String, String> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.b;
        }

        private long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
            }
            if (this.f30688a.o <= 0) {
                return 0L;
            }
            return SystemClock.elapsedRealtime() - this.f30688a.o;
        }

        private long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
            }
            if (this.f30688a.p <= 0) {
                return 0L;
            }
            return SystemClock.elapsedRealtime() - this.f30688a.p;
        }

        private long f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
            }
            if (this.f30688a.t <= 0) {
                return 0L;
            }
            return SystemClock.elapsedRealtime() - this.f30688a.t;
        }
    }
}
