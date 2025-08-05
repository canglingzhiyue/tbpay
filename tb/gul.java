package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.TaskDeffer;
import com.taobao.android.job.core.task.e;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public class gul<T, R> implements TaskDeffer<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<e<T, R>> f28462a = new LinkedBlockingDeque(1);
    private final Queue<e<T, R>> b = new LinkedBlockingDeque(1);
    private final Queue<e<T, R>> c = new LinkedBlockingDeque(1);

    @Override // com.taobao.android.job.core.TaskDeffer
    public boolean a(e<T, R> eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1f3796", new Object[]{this, eVar, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return this.f28462a.offer(eVar);
        }
        if (i == 1) {
            return this.b.offer(eVar);
        }
        if (i != 2) {
            return false;
        }
        return this.c.offer(eVar);
    }
}
