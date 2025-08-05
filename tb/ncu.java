package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.OutLinkServiceImpl;
import com.taobao.infoflow.core.subservice.biz.rocketservice.RocketServiceImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.loginservice.TbLoginServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.hostservice.HomePageHostService;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class ncu implements ljv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lud f31361a;

    public ncu(lud ludVar) {
        this.f31361a = ludVar;
    }

    public List<ISubService> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<ISubService> a2 = lrc.a();
        a2.add(new HomePageHostService(this.f31361a));
        a2.add(new RocketServiceImpl());
        a2.add(new TbLoginServiceImpl());
        a2.add(new OutLinkServiceImpl());
        a2.add(new TbPopViewServiceImpl());
        return a2;
    }
}
