package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.a;
import com.taobao.infoflow.taobao.subservice.biz.clickbackservice.ClickBackRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.MulticlassTabServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.CardOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.PerformanceOptimizationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl;
import com.taobao.oversea.homepage.common.aiservice.d;
import com.taobao.oversea.homepage.recommend.service.scene.TmgRecSceneService;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.commonsubservice.tabappearservice.TabAppearServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.windvaneservice.HomeWindVaneServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class ndh extends ncu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ljr b;
    private final String c;

    public static /* synthetic */ List a(ndh ndhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("10d24961", new Object[]{ndhVar}) : ndhVar.b();
    }

    public static /* synthetic */ String b(ndh ndhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38f1b8d9", new Object[]{ndhVar}) : ndhVar.c;
    }

    public ndh(String str, ljr ljrVar, lud ludVar) {
        super(ludVar);
        this.b = ljrVar;
        this.c = str;
    }

    @Override // tb.ljv
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8db01f7b", new Object[]{this}) : new a() { // from class: tb.ndh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.a
            public List<ISubService> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("627608df", new Object[]{this});
                }
                List<ISubService> a2 = ndh.a(ndh.this);
                a2.add(d.a(lwc.NEW_FACE_CHILD_INTL.a()));
                a2.add(new HomeInfoFlowDataService(ndh.b(ndh.this)));
                a2.add(new TmgRecSceneService());
                a2.add(new ThemeServiceImpl());
                a2.add(new TabAppearServiceImpl());
                a2.add(new PerformanceOptimizationServiceImpl());
                a2.add(new MulticlassTabServiceImpl());
                a2.add(new ClickBackRefreshServiceImpl());
                a2.add(new TopViewServiceImpl());
                a2.add(new CardOverlayServiceImpl());
                a2.add(new FeedbackServiceImpl());
                a2.add(new HomeWindVaneServiceImpl());
                return a2;
            }
        };
    }
}
