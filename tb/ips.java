package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class ips extends idl<jog> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jog f29220a;

    static {
        kge.a(1984143778);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.jog] */
    @Override // tb.idl
    public /* synthetic */ jog a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)}) : b(z);
    }

    @Override // tb.idl
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            this.f29220a = new jog(context, bbx.sStreamNextRpcServiceName);
        }
    }

    public jog b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jog) ipChange.ipc$dispatch("dc6f499", new Object[]{this, new Boolean(z)});
        }
        jog jogVar = this.f29220a;
        if (z) {
            this.f29220a = null;
        }
        return jogVar;
    }

    @Override // tb.idl
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29220a = null;
        }
    }
}
