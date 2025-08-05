package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.g;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* loaded from: classes.dex */
public class lgy implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IPopViewService f30593a;

    static {
        kge.a(-123879483);
        kge.a(674334517);
    }

    public lgy(ljs ljsVar) {
        if (ljsVar == null) {
            return;
        }
        this.f30593a = (IPopViewService) ljsVar.a(IPopViewService.class);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IPopViewService iPopViewService = this.f30593a;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.onPopTabSelected();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IPopViewService iPopViewService = this.f30593a;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.onPopTabUnSelected();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.g
    public void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        IPopViewService iPopViewService = this.f30593a;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.triggerPopShowByPopData(i, jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        IPopViewService iPopViewService = this.f30593a;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.triggerPopRemove(str);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.g
    public void a(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958129b3", new Object[]{this, aVar});
            return;
        }
        IPopViewService iPopViewService = this.f30593a;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.addPopMessageListener(aVar);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.g
    public void b(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ef2612", new Object[]{this, aVar});
            return;
        }
        IPopViewService iPopViewService = this.f30593a;
        if (iPopViewService == null) {
            return;
        }
        iPopViewService.removePopMessageListener(aVar);
    }
}
