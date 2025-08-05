package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;

/* loaded from: classes7.dex */
public class cvd implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f26543a;
    private a b;

    /* loaded from: classes7.dex */
    public interface a {
        void a();
    }

    public cvd(ljs ljsVar) {
        this.f26543a = ljsVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e82d94a", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f26543a.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            return iRocketSubService.isOnRocketState();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.j
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }
}
