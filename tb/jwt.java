package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.aa;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class jwt extends jww implements jwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f29838a;
    private final int b;

    static {
        kge.a(931853381);
        kge.a(821496845);
    }

    public static /* synthetic */ Object ipc$super(jwt jwtVar, String str, Object... objArr) {
        if (str.hashCode() == -1120663606) {
            return super.a();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jwt(String str, int i, boolean z) {
        super(str, i, z);
        this.f29838a = new AtomicInteger(0);
        this.b = i;
    }

    @Override // tb.jww
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        throw new UnsupportedOperationException("please call acquire(Context,ComponentLifecycle)");
    }

    @Override // tb.jwv
    public Object a(Context context, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c2d20974", new Object[]{this, context, aaVar});
        }
        Object a2 = super.a();
        if (a2 != null) {
            return a2;
        }
        this.f29838a.incrementAndGet();
        return aaVar.createMountContent(context);
    }

    @Override // tb.jwv
    public void b(Context context, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f74f53f", new Object[]{this, context, aaVar});
        } else if (b() || this.f29838a.getAndIncrement() >= this.b) {
        } else {
            a(aaVar.createMountContent(context));
        }
    }
}
