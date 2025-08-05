package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.c;
import com.alibaba.android.ultron.event.base.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.ultron.common.model.b;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class fgj implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f27926a = new ArrayList();

    static {
        kge.a(1869170194);
        kge.a(-1389538028);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396016f7", new Object[]{this, bVar});
        }
    }

    public fgj() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.listener.BaseEventProcessor");
    }

    @Override // com.alibaba.android.ultron.event.base.c
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            Object i = eVar.i();
            if (!(i instanceof b)) {
                return;
            }
            b bVar = (b) i;
            if (!this.f27926a.contains(bVar.getType())) {
                return;
            }
            a(bVar);
        } catch (Throwable unused) {
            i.a("BaseEventProcessor", "执行onPreEventFire 失败，Processor为：" + getClass().getSimpleName());
        }
    }

    @Override // com.alibaba.android.ultron.event.base.c
    public void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
            return;
        }
        try {
            Object i = eVar.i();
            if (!(i instanceof b)) {
                return;
            }
            if (!this.f27926a.contains(((b) i).getType())) {
            }
        } catch (Throwable unused) {
            i.a("BaseEventProcessor", "执行onPostEventFire 失败，Processor为：" + getClass().getSimpleName());
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f27926a.add(str);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("android_detail", "closeProcessor", "false"), "true");
    }
}
