package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class xkb implements jeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f34346a;

    public xkb(jdy jdyVar) {
        this.f34346a = jdyVar;
    }

    @Override // tb.jeo
    public boolean a(Thread thread, Throwable th) {
        String message;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85272e00", new Object[]{this, thread, th})).booleanValue() : this.f34346a.d().a("IgnoreRxException", true) && "io.reactivex.internal.util.ExceptionHelper$1".equals(th.getClass().getName()) && (message = th.getMessage()) != null && message.contains("No further exceptions");
    }
}
