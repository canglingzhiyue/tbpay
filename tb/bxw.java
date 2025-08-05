package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.a;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;
import com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService;
import java.util.List;

/* loaded from: classes7.dex */
public class bxw extends ncu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(bxw bxwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List a(bxw bxwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f474110", new Object[]{bxwVar}) : bxwVar.b();
    }

    public static /* synthetic */ DosaContainerDataService b(bxw bxwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DosaContainerDataService) ipChange.ipc$dispatch("c7549f9c", new Object[]{bxwVar}) : bxwVar.c();
    }

    public bxw(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.ljv
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8db01f7b", new Object[]{this}) : new a() { // from class: tb.bxw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.a
            public List<ISubService> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("627608df", new Object[]{this});
                }
                List<ISubService> a2 = bxw.a(bxw.this);
                a2.add(new DynamicSceneService());
                a2.add(bxw.b(bxw.this));
                return a2;
            }
        };
    }

    private DosaContainerDataService c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DosaContainerDataService) ipChange.ipc$dispatch("d162824a", new Object[]{this}) : new DosaContainerDataService.a(new dur()).c();
    }
}
