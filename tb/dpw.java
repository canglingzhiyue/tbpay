package tb;

import android.os.ConditionVariable;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.b;
import com.flybird.deploy.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import tb.bxm;

/* loaded from: classes4.dex */
public final class dpw implements Callable<Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bxm.a f26900a;
    public final /* synthetic */ ConcurrentHashMap b;

    public dpw(bxm.a aVar, ConcurrentHashMap concurrentHashMap) {
        this.f26900a = aVar;
        this.b = concurrentHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Void, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        try {
            String str = this.f26900a.c;
            HashMap<String, HashSet<cum<b.a, Void, Throwable>>> hashMap = b.f7207a;
            ConditionVariable conditionVariable = new ConditionVariable();
            b.a[] aVarArr = new b.a[1];
            Throwable[] thArr = new Throwable[1];
            b.a(str, new c(aVarArr, conditionVariable, thArr));
            conditionVariable.block();
            if (thArr[0] != null) {
                throw thArr[0];
            }
            this.b.put(this.f26900a, aVarArr[0]);
            return null;
        } catch (Throwable th) {
            cun.a("joinDownloadCheckedTemplates error", th);
            return null;
        }
    }
}
