package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public class skk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AB_POST_NO_NEED = -1;
    public static final int AB_POST_POST = 2;

    /* renamed from: a  reason: collision with root package name */
    public static int f33656a;
    public static int b;
    private final FluidContext c;
    private skl d;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        return 2;
    }

    static {
        kge.a(-1603741604);
        f33656a = 0;
        b = 1;
    }

    public skk(FluidContext fluidContext, sko skoVar) {
        this.c = fluidContext;
        this.d = new skl(skoVar);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(slp.a(fluidContext));
        spz.c("InteractionServiceConfig", "enableRecommendMtopNew resule=" + valueOf);
        return valueOf.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableRecommendCDNNew", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableFixSeekCommonError", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableLsbRequstParams", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableServerABR", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableFixDoubleDetailParse", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableSendAsac", true);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        skl sklVar = this.d;
        return (sklVar != null && (sklVar.f33657a > 0 || this.d.b > 0)) && this.d.ag && k() && q();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : !obx.g() && this.d.ae && l() && q();
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        a.c activeCardMediaDetail = ((ICardService) this.c.getService(ICardService.class)).getActiveCardMediaDetail();
        if (activeCardMediaDetail != null) {
            return activeCardMediaDetail.z();
        }
        return false;
    }

    public skl j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skl) ipChange.ipc$dispatch("54495ae1", new Object[]{this}) : this.d;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enablePlayFeedback", true);
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enablePlayRateChangeV4", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableClearListNextData", true);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableCancelResponseWithRecommendMtopId", true);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableHotTopic", true);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableMtopFlag", true);
    }
}
