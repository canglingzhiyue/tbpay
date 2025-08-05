package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;

/* loaded from: classes7.dex */
public class lno extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ool f30748a;
    private lpu b;

    static {
        kge.a(1340657625);
    }

    public static /* synthetic */ Object ipc$super(lno lnoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        } else if (a(obj3)) {
            c(view, str, obj, obj2, obj3);
        } else {
            b(view, str, obj, obj2, obj3);
        }
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : obj instanceof InfoFlowDxUserContext;
    }

    private void b(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42665227", new Object[]{this, view, str, obj, obj2, obj3});
            return;
        }
        ldf.d("ROverlayEventHandler", "分给老架构处理");
        if (this.f30748a == null) {
            this.f30748a = new ool();
        }
        this.f30748a.a(view, str, obj, obj2, obj3);
    }

    private void c(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e81a06", new Object[]{this, view, str, obj, obj2, obj3});
            return;
        }
        ldf.d("ROverlayEventHandler", "分给新架构处理");
        if (this.b == null) {
            this.b = new lpu();
        }
        this.b.a(view, str, obj, obj2, obj3);
    }
}
