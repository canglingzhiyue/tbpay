package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;
import tb.suc;

/* loaded from: classes9.dex */
public final class xla implements suc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f34363a;
    private final AtomicBoolean b;
    private final f c;

    static {
        kge.a(690234663);
        kge.a(-1125199877);
    }

    public xla(f instance) {
        q.d(instance, "instance");
        this.c = instance;
        this.f34363a = new ArrayList();
        this.b = new AtomicBoolean(false);
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        suc.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            suc.a.b(this);
        }
    }

    @Override // tb.suc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.b.get()) {
            this.f34363a.add("onStart");
        } else {
            ITMSPage c = c();
            if (c == null) {
                return;
            }
            c.p();
        }
    }

    @Override // tb.suc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b.get()) {
            this.f34363a.add("onResume");
        } else {
            ITMSPage c = c();
            if (c == null) {
                return;
            }
            c.i();
        }
    }

    @Override // tb.suc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.b.get()) {
            this.f34363a.add("onPause");
        } else {
            ITMSPage c = c();
            if (c == null) {
                return;
            }
            c.j();
        }
    }

    @Override // tb.suc
    public void dJ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8600c0", new Object[]{this});
        } else if (!this.b.get()) {
            this.f34363a.add(MessageID.onStop);
        } else {
            ITMSPage c = c();
            if (c == null) {
                return;
            }
            c.q();
        }
    }

    public final void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        for (String str : this.f34363a) {
            switch (str.hashCode()) {
                case -1340212393:
                    if (str.equals("onPause")) {
                        page.j();
                        break;
                    } else {
                        break;
                    }
                case -1336895037:
                    if (str.equals("onStart")) {
                        page.p();
                        break;
                    } else {
                        break;
                    }
                case -1012956543:
                    if (str.equals(MessageID.onStop)) {
                        page.q();
                        break;
                    } else {
                        break;
                    }
                case 1463983852:
                    if (str.equals("onResume")) {
                        page.i();
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.b.set(true);
    }

    private final ITMSPage c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("bc21a1d7", new Object[]{this});
        }
        if (n.bU()) {
            if (this.c.b().d() != 1) {
                return null;
            }
            return this.c.b().b(0);
        }
        return this.c.b().c();
    }
}
