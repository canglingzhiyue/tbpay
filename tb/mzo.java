package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.opentracing.impl.exception.UnsupportedFormatException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.myt;
import tb.myx;

/* loaded from: classes.dex */
public class mzo implements myt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private myo f31335a;
    private Map<myx<?>, mzs<?>> b = new HashMap();
    private myq c;

    static {
        kge.a(1954460599);
        kge.a(-239145300);
    }

    public mzo(myq myqVar) {
        this.b.put(myx.a.TEXT_MAP, new mzt(false));
        this.b.put(myx.a.HTTP_HEADERS, new mzt(true));
        this.b.put(myx.a.BINARY, new mzr());
        this.c = myqVar;
    }

    public myq g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myq) ipChange.ipc$dispatch("3d31e5b3", new Object[]{this}) : this.c;
    }

    @Override // tb.myt
    public <T> void a(mys mysVar, myx<T> myxVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320cdf71", new Object[]{this, mysVar, myxVar, t});
            return;
        }
        mzs<?> mzsVar = this.b.get(myxVar);
        if (mzsVar == null) {
            throw new UnsupportedFormatException(myxVar);
        }
        mzsVar.a((mzn) mysVar, t);
    }

    public <C> mys a(myx<C> myxVar, C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mys) ipChange.ipc$dispatch("d92cea37", new Object[]{this, myxVar, c});
        }
        mzs<?> mzsVar = this.b.get(myxVar);
        if (mzsVar == null) {
            throw new UnsupportedFormatException(myxVar);
        }
        return mzsVar.a(c);
    }

    public void a(myo myoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571bbb5", new Object[]{this, myoVar});
        } else if (myoVar == null) {
        } else {
            this.f31335a = myoVar;
        }
    }

    public myo dt_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myo) ipChange.ipc$dispatch("4da66f0d", new Object[]{this});
        }
        if (this.f31335a == null) {
            this.f31335a = new mzj();
        }
        return this.f31335a;
    }

    /* loaded from: classes.dex */
    public class a implements myt.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f31336a;
        private long b;
        private List<mzp> c = Collections.emptyList();
        private final Map<String, Object> e = new HashMap();
        private boolean f = false;

        static {
            kge.a(-1291888737);
            kge.a(-775889191);
        }

        public a(String str) {
            this.f31336a = str;
        }

        public myt.a b(mys mysVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myt.a) ipChange.ipc$dispatch("174a09ef", new Object[]{this, mysVar}) : b("child_of", mysVar);
        }

        public myt.a b(myr myrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (myt.a) ipChange.ipc$dispatch("28c7036e", new Object[]{this, myrVar});
            }
            return b("child_of", myrVar != null ? myrVar.h() : null);
        }

        public myt.a b(String str, mys mysVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (myt.a) ipChange.ipc$dispatch("41deada5", new Object[]{this, str, mysVar});
            }
            if (this.c == null) {
                return this;
            }
            mzn mznVar = (mzn) mysVar;
            if (!"child_of".equals(str) && !"follows_from".equals(str)) {
                return this;
            }
            if (this.c.isEmpty()) {
                this.c = Collections.singletonList(new mzp(mznVar, str));
            } else {
                if (this.c.size() == 1) {
                    this.c = new ArrayList(this.c);
                }
                this.c.add(new mzp(mznVar, str));
            }
            return this;
        }

        public myt.a b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (myt.a) ipChange.ipc$dispatch("4272efc6", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public List<mzp> f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.c;
        }

        public Map<String, Object> g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.e;
        }

        public long h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.b;
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.f;
        }
    }
}
