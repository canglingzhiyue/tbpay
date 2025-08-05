package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.a;
import com.taobao.infoflow.taobao.subservice.biz.editionservice.TbEditionServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;
import com.taobao.oversea.homepage.litetao.service.biz.sceneservice.LiteTaoSceneService;
import com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class nda extends ncu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(nda ndaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List a(nda ndaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("71299d1a", new Object[]{ndaVar}) : ndaVar.b();
    }

    public static /* synthetic */ DosaContainerDataService b(nda ndaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DosaContainerDataService) ipChange.ipc$dispatch("abd6fc26", new Object[]{ndaVar}) : ndaVar.c();
    }

    public nda(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.ljv
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8db01f7b", new Object[]{this}) : new a() { // from class: tb.nda.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.a
            public List<ISubService> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("627608df", new Object[]{this});
                }
                List<ISubService> a2 = nda.a(nda.this);
                a2.add(new LiteTaoSceneService());
                a2.add(nda.b(nda.this));
                a2.add(new TaoTeSearchServiceImpl());
                a2.add(new TbEditionServiceImpl());
                return a2;
            }
        };
    }

    private DosaContainerDataService c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DosaContainerDataService) ipChange.ipc$dispatch("d162824a", new Object[]{this}) : new DosaContainerDataService.a(new ncy()).a().c();
    }
}
