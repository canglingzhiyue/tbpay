package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.goodprice.homepage.service.impl.bizservice.GoodPriceBizServiceImpl;
import com.taobao.android.goodprice.homepage.service.impl.floatlayerservice.GoodPriceFloatLayerServiceImpl;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.core.subservice.biz.dxitemclickservice.DxItemClickServiceImpl;
import com.taobao.infoflow.core.subservice.biz.experiencecheck.UserExperienceCheckServiceImpl;
import com.taobao.infoflow.core.subservice.biz.firstscreendataservice.FirstScreenDataServiceImpl;
import com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice.GlobalSceneUtPassServiceImpl;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.OutLinkServiceImpl;
import com.taobao.infoflow.core.subservice.biz.rocketservice.RocketServiceImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.a;
import com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice.AiCardDebugMaskServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.clickairefresh.ClickAiRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.clickbackservice.ClickBackRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.ClientToServerMonitorServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.dx2replaceservice.Dx2ReplaceServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.entryutservice.EntryUtServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.expofilterservice.ExposeItemFilterServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.FaceDetectorServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.floatviewmonitorservice.FloatViewDetectServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.IconBackGuideAnimeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.IconServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.iconoverlayservice.IconOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.jump2banner.JumpToBannerServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.liveservice.TbLiveCardServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.MulticlassTabServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.NextPageOptimizeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.CardOverlayServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pagebackItemClickService.PageBackItemClickServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice.PerformanceOptimizationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.prefetchservice.PrefetchServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pullrefreshservice.PullRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.resetpagingnumber.ResetPagingNumberServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.SmartLoadingServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.unexpoparamservice.UnexposedItemFiltrationServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.VideoCardAnimationServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.hostservice.HomePageHostService;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.commonsubservice.itemclick.DxItemClickNavServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.pullsecondfloor.PullSecondFloorServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.tabappearservice.TabAppearServiceImpl;
import com.taobao.tao.infoflow.commonsubservice.windvaneservice.HomeWindVaneServiceImpl;
import com.taobao.tao.infoflow.scene.homemainland.subservice.HomeMainLandInfoFlowSceneService;
import java.util.List;

/* loaded from: classes.dex */
public class ojo implements ljv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lud f32120a;
    private final ljr b;
    private final String c;

    static {
        kge.a(227126707);
        kge.a(1297692975);
    }

    public static /* synthetic */ lud a(ojo ojoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lud) ipChange.ipc$dispatch("24932d07", new Object[]{ojoVar}) : ojoVar.f32120a;
    }

    public static /* synthetic */ String b(ojo ojoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("274685b", new Object[]{ojoVar}) : ojoVar.c;
    }

    public ojo(String str, ljr ljrVar, lud ludVar) {
        this.b = ljrVar;
        this.f32120a = ludVar;
        this.c = str;
    }

    @Override // tb.ljv
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8db01f7b", new Object[]{this}) : new a() { // from class: tb.ojo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.a
            public List<ISubService> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("627608df", new Object[]{this});
                }
                List<ISubService> a2 = lrc.a();
                a2.add(new HomePageHostService(ojo.a(ojo.this)));
                a2.add(new RocketServiceImpl());
                a2.add(new HomeWindVaneServiceImpl());
                a2.add(new HomeInfoFlowDataService(ojo.b(ojo.this)));
                a2.add(new Dx2ReplaceServiceImpl());
                a2.add(new ThemeServiceImpl());
                a2.add(new TabAppearServiceImpl());
                a2.add(new PerformanceOptimizationServiceImpl());
                a2.add(new MulticlassTabServiceImpl());
                a2.add(new OutLinkServiceImpl());
                a2.add(new FirstScreenDataServiceImpl());
                a2.add(new CardOverlayServiceImpl());
                a2.add(new HomeMainLandInfoFlowSceneService());
                a2.add(new ClickBackRefreshServiceImpl());
                a2.add(new TopViewServiceImpl());
                a2.add(new GlobalSceneUtPassServiceImpl());
                a2.add(new TbPopViewServiceImpl());
                a2.add(new TbLiveCardServiceImpl());
                a2.add(new PullSecondFloorServiceImpl());
                a2.add(new PullRefreshServiceImpl());
                a2.add(new NextPageOptimizeServiceImpl());
                a2.add(new DxItemClickServiceImpl());
                a2.add(new DxItemClickNavServiceImpl());
                a2.add(new ClientToServerMonitorServiceImpl());
                a2.add(new SmartBackRefreshServiceImpl());
                a2.add(new UnexposedItemFiltrationServiceImpl());
                a2.add(new IconBackGuideAnimeServiceImpl());
                a2.add(new IconServiceImpl());
                a2.add(new PageBackItemClickServiceImpl());
                a2.add(new FeedbackServiceImpl());
                a2.add(new IconOverlayServiceImpl());
                a2.add(new ResetPagingNumberServiceImpl());
                try {
                    a2.add(new GoodPriceBizServiceImpl());
                    a2.add(new GoodPriceFloatLayerServiceImpl());
                } catch (Throwable th) {
                    ldf.a("HomeMainLandInfoFlowRegistry", "好价版服务注册异常", th);
                }
                a2.add(new FoldDeviceAndPadServiceImpl());
                if (!n.c()) {
                    a2.add(new TbLiveCardServiceImpl());
                    a2.add(new FaceDetectorServiceImpl());
                    a2.add(new SmartLoadingServiceImpl());
                }
                if (lcz.b()) {
                    a2.add(new AiCardDebugMaskServiceImpl());
                }
                a2.add(new EntryUtServiceImpl());
                a2.add(new PrefetchServiceImpl());
                a2.add(new JumpToBannerServiceImpl());
                a2.add(new ExposeItemFilterServiceImpl());
                a2.add(new SmartNextPageRequestServiceImpl());
                a2.add(new UserExperienceCheckServiceImpl());
                a2.add(new ClickAiRefreshServiceImpl());
                a2.add(new FloatViewDetectServiceImpl());
                a2.add(new VideoCardAnimationServiceImpl());
                return a2;
            }
        };
    }
}
