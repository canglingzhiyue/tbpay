package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class ons {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f32218a;
    private final IVideoPlayControllerService b;
    private IVideoPlayControllerService.c c;
    private ont d;
    private final String e;

    static {
        kge.a(-1005836122);
    }

    public static /* synthetic */ List a(ons onsVar, IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b4694a33", new Object[]{onsVar, iMainFeedsViewService}) : onsVar.a(iMainFeedsViewService);
    }

    public static /* synthetic */ boolean a(ons onsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8423be8", new Object[]{onsVar})).booleanValue() : onsVar.c();
    }

    public static /* synthetic */ IMainFeedsViewService b(ons onsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("c88c9f8d", new Object[]{onsVar}) : onsVar.f32218a;
    }

    public static /* synthetic */ ont c(ons onsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ont) ipChange.ipc$dispatch("66317f0b", new Object[]{onsVar}) : onsVar.d;
    }

    public static /* synthetic */ String d(ons onsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50488019", new Object[]{onsVar}) : onsVar.e;
    }

    public ons(ljs ljsVar) {
        this.f32218a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.b = (IVideoPlayControllerService) ljsVar.a(IVideoPlayControllerService.class);
        this.e = ljsVar.a().c();
        if (this.f32218a == null || this.b == null) {
            ldf.d("CardTitleDisplayCollector", "不满足检查标题条件，如低端机不做检查");
            return;
        }
        this.d = new ont();
        this.c = b();
        this.b.addCheckExecutePlayListener(this.c);
    }

    public void a() {
        IVideoPlayControllerService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IVideoPlayControllerService iVideoPlayControllerService = this.b;
        if (iVideoPlayControllerService == null || (cVar = this.c) == null) {
            return;
        }
        iVideoPlayControllerService.removeCheckExecutePlayListener(cVar);
    }

    private IVideoPlayControllerService.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVideoPlayControllerService.c) ipChange.ipc$dispatch("cd318ca7", new Object[]{this}) : new IVideoPlayControllerService.c() { // from class: tb.ons.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (ons.a(ons.this)) {
                    ons onsVar = ons.this;
                    List<poo> a2 = ons.a(onsVar, ons.b(onsVar));
                    if (a2 == null || a2.isEmpty()) {
                        ldf.d("CardTitleDisplayCollector", "屏上未找到视图");
                        return;
                    }
                    for (poo pooVar : a2) {
                        RRichTextView a3 = ons.c(ons.this).a(pooVar.b());
                        if (a3 != null) {
                            pnx.a(ons.d(ons.this), pooVar, a3);
                        }
                    }
                }
            }
        };
    }

    private List<poo> a(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b0850eb7", new Object[]{this, iMainFeedsViewService});
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            ldf.d("CardTitleDisplayCollector", "findOnScreenViews visiblePositionRange error");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i2);
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (findItemViewByPosition != null && findItemViewByPosition.getVisibility() == 0 && findItemDataByPosition != null) {
                arrayList.add(new poo(findItemDataByPosition, findItemViewByPosition));
            }
        }
        return arrayList;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        boolean a2 = ldj.a("enableCollectorTitleInfo", true);
        ldf.d("CardTitleDisplayCollector", "enableCollectorTitleInfo: " + a2);
        return a2;
    }
}
