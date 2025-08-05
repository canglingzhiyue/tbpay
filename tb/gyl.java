package tb;

import com.alibaba.ability.e;
import com.alibaba.ability.result.InternalResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public final class gyl extends aln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final alo f28558a;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            alo a2 = gyl.a(gyl.this);
            if (a2 == null) {
                return;
            }
            a2.onCallback(new InternalResult(99, null, null, 6, null));
        }
    }

    static {
        kge.a(1598639881);
    }

    public static /* synthetic */ Object ipc$super(gyl gylVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyl(alo listener) {
        super(listener);
        q.d(listener, "listener");
        this.f28558a = listener;
    }

    public static final /* synthetic */ alo a(gyl gylVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alo) ipChange.ipc$dispatch("653070c4", new Object[]{gylVar}) : gylVar.f28558a;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        e.a(new a(), -1L);
        super.finalize();
    }
}
