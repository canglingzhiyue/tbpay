package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.g;
import com.taobao.analysis.v3.r;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class nnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String MODULE_NAME = "MainSearch";
    public static final String SCENE_LOAD_MORE = "MainSearch_LoadMore";
    public static final String SCENE_NEW_SEARCH = "MainSearch_FirstScreen";

    /* renamed from: a  reason: collision with root package name */
    private boolean f31586a;
    private g b;
    private boolean c;

    static {
        kge.a(-1933215118);
        Companion = new a(null);
    }

    public nnf() {
        this(false, 1, null);
    }

    public nnf(boolean z) {
        g gVar;
        this.c = z;
        r rVar = FalcoGlobalTracer.get();
        if (rVar != null) {
            r.a a2 = rVar.a(MODULE_NAME, this.c ? SCENE_NEW_SEARCH : SCENE_LOAD_MORE);
            if (a2 != null) {
                gVar = a2.c();
                this.b = gVar;
            }
        }
        gVar = null;
        this.b = gVar;
    }

    public /* synthetic */ nnf(boolean z, int i, o oVar) {
        this((i & 1) != 0 ? true : z);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-484671686);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f31586a;
    }

    public final Map<String, String> b() {
        mys h;
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        g gVar = this.b;
        if (gVar != null && (h = gVar.h()) != null && (rVar = FalcoGlobalTracer.get()) != null) {
            return rVar.a(h);
        }
        return null;
    }

    public final void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.a(l);
    }

    public final void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.b(l);
    }

    public final void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808bfa9", new Object[]{this, l});
            return;
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.c(l);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.b("unfinished");
        }
        this.f31586a = true;
        this.b = null;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.c();
        }
        this.f31586a = true;
        this.b = null;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.b("failed");
        }
        this.f31586a = true;
        this.b = null;
    }
}
