package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.tml;

/* loaded from: classes9.dex */
public final class tmm implements tml {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ITMSPage f34220a;
    private final WeexInstance b;
    private final tmk c;

    /* loaded from: classes9.dex */
    public static final class c implements jvq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xpi f34222a;

        public c(xpi xpiVar) {
            this.f34222a = xpiVar;
        }

        @Override // tb.jvq
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f34222a.a(map);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class d implements jvs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xpj f34223a;

        public d(xpj xpjVar) {
            this.f34223a = xpjVar;
        }

        @Override // tb.jvs
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f34223a.a(map);
            }
        }
    }

    static {
        kge.a(1333897808);
        kge.a(-458594235);
        Companion = new a(null);
    }

    public tmm(ITMSPage page, WeexInstance instance, tmk weexRender) {
        q.d(page, "page");
        q.d(instance, "instance");
        q.d(weexRender, "weexRender");
        this.f34220a = page;
        this.b = instance;
        this.c = weexRender;
    }

    public final tmk b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tmk) ipChange.ipc$dispatch("16bcabab", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            tml.a.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            tml.a.a(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        tml.a.a(this, page);
        page.b().a(new b(page));
    }

    /* loaded from: classes9.dex */
    public static final class b implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        @Override // com.taobao.themis.kernel.f.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public b(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // com.taobao.themis.kernel.f.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.b.n() != ITMSPage.PageStatusEnum.ON_VIEW_DISAPPEAR) {
            } else {
                TMSLogger.a("WeexPageExtension", "WeexInstance onActivityStart");
                tmm.this.b().p();
            }
        }

        @Override // com.taobao.themis.kernel.f.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.b.n() != ITMSPage.PageStatusEnum.ON_VIEW_DISAPPEAR) {
            } else {
                TMSLogger.a("WeexPageExtension", "WeexInstance onActivityStop");
                tmm.this.b().q();
            }
        }
    }

    @Override // tb.iva
    public void a(xpj listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5f126", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        ((juh) this.b.getExtend(juh.class)).a(new d(listener));
    }

    @Override // tb.iva
    public void a(xpi listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b57cc7", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        ((juh) this.b.getExtend(juh.class)).a(new c(listener));
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-2047020648);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
