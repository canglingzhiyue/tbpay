package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.f;
import com.taobao.infoflow.protocol.subservice.biz.IOutLinkService;

/* loaded from: classes.dex */
public class lgx implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30592a;

    static {
        kge.a(-1205410994);
        kge.a(-1379483842);
    }

    public lgx(ljs ljsVar) {
        this.f30592a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.f
    public void a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289186af", new Object[]{this, intent, str});
            return;
        }
        IOutLinkService iOutLinkService = (IOutLinkService) this.f30592a.a(IOutLinkService.class);
        if (iOutLinkService == null) {
            return;
        }
        iOutLinkService.onOutLinkTrigger(str, intent);
    }
}
