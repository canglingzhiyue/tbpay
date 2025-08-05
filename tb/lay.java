package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.manager.lifecycle.listener.b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class lay implements lbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f30443a = new CopyOnWriteArrayList();

    static {
        kge.a(-533372417);
        kge.a(885416587);
    }

    @Override // tb.lbd
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a8b2ef", new Object[]{this, bVar});
        } else {
            this.f30443a.add(bVar);
        }
    }

    @Override // tb.lbd
    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dac7e4e", new Object[]{this, bVar});
        } else {
            this.f30443a.remove(bVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30443a.clear();
        }
    }

    public void a(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a609f9", new Object[]{this, str, intent, str2});
            return;
        }
        for (b bVar : this.f30443a) {
            bVar.a(str, intent, str2);
        }
    }
}
