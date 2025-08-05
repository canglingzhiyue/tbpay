package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.a;
import com.taobao.themis.utils.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class suh implements sug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<ITMSPage> f33905a;
    private final f b;
    private final CopyOnWriteArrayList<ITMSPage> c;

    static {
        kge.a(-702622024);
        kge.a(-1732026715);
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
        } else {
            q.d(instance, "instance");
        }
    }

    public suh(f instance) {
        q.d(instance, "instance");
        this.b = instance;
        this.f33905a = new CopyOnWriteArrayList<>();
        this.c = new CopyOnWriteArrayList<>();
    }

    @Override // tb.sug
    public boolean a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        if (!a()) {
            return false;
        }
        this.f33905a.add(page);
        return true;
    }

    @Override // tb.sug
    public void b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        this.f33905a.remove(page);
        this.c.add(page);
    }

    @Override // tb.sug
    public ITMSPage a(String pageUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("fc62200f", new Object[]{this, pageUrl});
        }
        q.d(pageUrl, "pageUrl");
        Iterator<ITMSPage> it = this.f33905a.iterator();
        while (it.hasNext()) {
            ITMSPage next = it.next();
            if (o.b(pageUrl, next.e())) {
                this.f33905a.remove(next);
                if (next != null) {
                    next.k();
                }
            }
        }
        Iterator<ITMSPage> it2 = this.c.iterator();
        while (it2.hasNext()) {
            ITMSPage next2 = it2.next();
            if (o.b(pageUrl, next2.e())) {
                this.c.remove(next2);
                if (a.b()) {
                    Toast.makeText(this.b.o(), "子页命中预渲染", 0).show();
                }
                return next2;
            }
        }
        return null;
    }

    @Override // tb.sug
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f33905a.size() == 0 && this.c.size() == 0;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<ITMSPage> it = this.f33905a.iterator();
        while (it.hasNext()) {
            it.next().k();
        }
        this.f33905a.clear();
        Iterator<ITMSPage> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().k();
        }
        this.c.clear();
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            b();
        }
    }
}
