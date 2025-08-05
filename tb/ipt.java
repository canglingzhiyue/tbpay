package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class ipt extends idl<bnm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bnm f29221a;

    static {
        kge.a(-1056161204);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.bnm] */
    @Override // tb.idl
    public /* synthetic */ bnm a(boolean z) {
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
            this.f29221a = new bnm(context.getApplicationContext());
        }
    }

    public bnm b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnm) ipChange.ipc$dispatch("dc34e9a", new Object[]{this, new Boolean(z)});
        }
        bnm bnmVar = this.f29221a;
        if (z) {
            this.f29221a = null;
        }
        return bnmVar;
    }
}
