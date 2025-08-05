package tb;

import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class itf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MetaLayout f29307a;
    private itf b;
    private boolean c;
    private final itk d;

    static {
        kge.a(1734140368);
    }

    public itf(itk element) {
        q.c(element, "element");
        this.d = element;
    }

    public final itk d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itk) ipChange.ipc$dispatch("261b109b", new Object[]{this}) : this.d;
    }

    public final itf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itf) ipChange.ipc$dispatch("f061fe3", new Object[]{this}) : this.b;
    }

    public final void a(itf itfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee53cc5d", new Object[]{this, itfVar});
        } else {
            this.b = itfVar;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public final void a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, metaLayout});
            return;
        }
        q.c(metaLayout, "<set-?>");
        this.f29307a = metaLayout;
    }

    public final MetaLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("bd386123", new Object[]{this});
        }
        MetaLayout metaLayout = this.f29307a;
        if (metaLayout == null) {
            q.b(c.MSG_SOURCE_PARENT);
        }
        return metaLayout;
    }
}
