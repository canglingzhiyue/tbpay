package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.c;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;

/* loaded from: classes.dex */
public class lgv implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30589a;

    static {
        kge.a(-2129991920);
        kge.a(-798630912);
    }

    public lgv(ljs ljsVar) {
        this.f30589a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IThemeService iThemeService = (IThemeService) this.f30589a.a(IThemeService.class);
        if (iThemeService == null) {
            ldf.d("GlobalThemeInvokerImpl", "onFestivalRefresh themeService is null");
        } else {
            iThemeService.onFestivalRefresh();
        }
    }
}
