package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.d;
import com.taobao.android.dinamicx.template.download.e;
import com.taobao.android.dinamicx.template.download.k;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class kyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator f30395a;
    private static d b;
    private static d c;
    private static d d;

    static {
        kge.a(-583639960);
        f30395a = new Comparator() { // from class: tb.kyc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
                }
                if (!(obj instanceof e) || !(obj2 instanceof e)) {
                    return 0;
                }
                e eVar = (e) obj;
                e eVar2 = (e) obj2;
                int i = eVar.f11933a - eVar2.f11933a;
                return i == 0 ? (int) (eVar.b - eVar2.b) : i;
            }
        };
        b = new d(1, 1, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(20480, f30395a), new k("DXLanguagePatch", true));
        c = new d(1, 1, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(20480, f30395a), new k("DXLanguageNewN", true));
        d = new d(1, 1, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(20480, f30395a), new k("DXLanguageOptN", true));
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            if (fqi.bh()) {
                fuw.f(" DXLanguageUtil runForLanguage bugfix new");
                c.execute(runnable);
            } else if (fqi.bi()) {
                fuw.f(" DXLanguageUtil runForLanguage perf opt new");
                d.execute(runnable);
            } else {
                fuw.f(" DXLanguageUtil runForLanguage new");
                b.execute(runnable);
            }
        }
    }
}
