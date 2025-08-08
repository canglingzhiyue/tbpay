package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.b;
import com.taobao.android.tbuprofen.h;
import com.taobao.android.tbuprofen.mock.RuntimeMockUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class gtz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f28456a = new int[2];
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicInteger c = new AtomicInteger(0);

    public void a(Context context, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d07c9c5", new Object[]{this, context, gtxVar});
        } else if (this.b.get() || !StringUtils.equals(gtxVar.b, gtxVar.f28453a) || !guc.a(context, "boostrap_adjust_heap_size_v3") || !this.b.compareAndSet(false, true)) {
        } else {
            h.a(new b());
            RuntimeMockUtils.a(context);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b.get() || this.c.get() > 1) {
        } else {
            this.f28456a[this.c.getAndIncrement()] = RuntimeMockUtils.a(134217728L);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b.get() && this.c.get() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.c.get(); i++) {
                sb.append(i);
                sb.append("=");
                sb.append(this.f28456a[i]);
                sb.append(",");
            }
            AppMonitor.Counter.commit(gve.MODULE, "boostrap", sb.toString(), 1.0d);
        }
    }
}
