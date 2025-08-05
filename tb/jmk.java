package tb;

import android.content.Context;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class jmk extends idl<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29632a;

    static {
        kge.a(1574555151);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.idl
    public /* synthetic */ Boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)}) : b(z);
    }

    @Override // tb.idl
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        DataBizContext.ShareContext.enablePrefetchView();
        jnp.a().a(new bih());
        this.f29632a = true;
    }

    public Boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("5aeef0c8", new Object[]{this, new Boolean(z)}) : Boolean.valueOf(this.f29632a);
    }

    @Override // tb.idl
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29632a = false;
        }
    }
}
