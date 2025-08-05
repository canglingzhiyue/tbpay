package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class lqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f30845a = new CopyOnWriteArrayList();
    private final IPopViewService b;
    private IPopViewService.c c;

    static {
        kge.a(-1779575005);
    }

    public static /* synthetic */ List a(lqz lqzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("30d320c4", new Object[]{lqzVar}) : lqzVar.f30845a;
    }

    public lqz(ljs ljsVar) {
        this.b = (IPopViewService) ljsVar.a(IPopViewService.class);
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.f30845a.isEmpty()) {
            return this.f30845a.contains(str);
        }
        return false;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.c = d();
            this.b.addPopViewUpdateListener(this.c);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IPopViewService iPopViewService = this.b;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.removePopViewUpdateListener(this.c);
    }

    private IPopViewService.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopViewService.c) ipChange.ipc$dispatch("502b7334", new Object[]{this}) : new IPopViewService.c() { // from class: tb.lqz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.c
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    lqz.a(lqz.this).add(str);
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.c
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                } else {
                    lqz.a(lqz.this).remove(str);
                }
            }
        };
    }
}
