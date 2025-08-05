package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class jxq extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<jxs> f29853a;

    static {
        kge.a(-643462169);
    }

    public jxq(jxs jxsVar) {
        this.f29853a = new WeakReference<>(jxsVar);
    }

    @Override // com.taobao.android.searchbaseframe.util.i
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        jxs jxsVar = this.f29853a.get();
        if (jxsVar == null) {
            return;
        }
        jxsVar.a();
    }
}
