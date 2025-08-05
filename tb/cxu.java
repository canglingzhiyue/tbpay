package tb;

import com.huawei.hmf.tasks.a.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public class cxu {

    /* renamed from: a  reason: collision with root package name */
    private static f f26590a = new f();

    public static <TResult> TResult a(cxr<TResult> cxrVar) throws ExecutionException, InterruptedException {
        f.a("await must not be called on the UI thread");
        if (cxrVar.a()) {
            return (TResult) f.a(cxrVar);
        }
        f.a aVar = new f.a();
        cxrVar.a((cxq) aVar).a((cxp) aVar);
        aVar.f7310a.await();
        return (TResult) f.a(cxrVar);
    }

    public static <TResult> cxr<TResult> a(Callable<TResult> callable) {
        return f26590a.a(cxt.b(), callable);
    }
}
