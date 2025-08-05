package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model.OutLinkWithReqModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.taolive.room.utils.aw;
import java.util.Map;

/* loaded from: classes7.dex */
public class lgs implements lgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30582a;
    private Map<String, String> b;
    private lli c;
    private IContainerDataService.a d;
    private IContainerDataService.c e;
    public boolean f = false;
    public boolean g = true;

    static {
        kge.a(96008105);
        kge.a(-1054310725);
    }

    public static /* synthetic */ Map a(lgs lgsVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b12c37a", new Object[]{lgsVar, map});
        }
        lgsVar.b = map;
        return map;
    }

    public static /* synthetic */ lli a(lgs lgsVar, lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lli) ipChange.ipc$dispatch("d731e76", new Object[]{lgsVar, lliVar});
        }
        lgsVar.c = lliVar;
        return lliVar;
    }

    public static /* synthetic */ void a(lgs lgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c10d80", new Object[]{lgsVar});
        } else {
            lgsVar.g();
        }
    }

    public static /* synthetic */ void a(lgs lgsVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c034afbb", new Object[]{lgsVar, iContainerDataModel});
        } else {
            lgsVar.b(iContainerDataModel);
        }
    }

    public static /* synthetic */ Map b(lgs lgsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e1e9076", new Object[]{lgsVar}) : lgsVar.b;
    }

    public static /* synthetic */ boolean b(lgs lgsVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("228fc69e", new Object[]{lgsVar, iContainerDataModel})).booleanValue() : lgsVar.a(iContainerDataModel);
    }

    public static /* synthetic */ boolean b(lgs lgsVar, lli lliVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4929f5ec", new Object[]{lgsVar, lliVar})).booleanValue() : lgsVar.a(lliVar);
    }

    public static /* synthetic */ void c(lgs lgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc71a82", new Object[]{lgsVar});
        } else {
            lgsVar.e();
        }
    }

    public lgs(ljs ljsVar) {
        this.f30582a = ljsVar;
        c();
    }

    @Override // tb.lgp
    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
            return;
        }
        lgt.a(lgt.OUT_LINK_PROCESS_START, lgt.SCROLL_TO_RECOMMEND_WITH_REQUEST);
        if (!a(intent)) {
            ldl.a("Page_Home", 19999, "Page_HomePage_PageControl_perform_onRefresh_NewFace", null, null, str);
            ldf.d("ScrollToItemWithRequest", "非强制刷新");
            return;
        }
        this.b = b(str, intent);
        if (this.b == null) {
            ldf.d("ScrollToItemWithRequest", "BizParam为空");
            return;
        }
        if (this.e == null) {
            ldf.d("ScrollToItemWithRequest", "bizParamsCreator为空，创建RequestBizParamsCreator");
            this.e = h();
            a(this.e);
        }
        f();
        this.g = j.a("enableOutLinkBugfix", true);
        if (this.b != null && this.g) {
            if (qnl.f32961a) {
                qnl.f32961a = false;
                j();
            } else {
                e();
            }
        }
        ldl.a("Page_Home", 19999, "Page_HomePage_PageControl_perform_NewFace", null, null, str);
    }

    @Override // tb.lgp
    public lli a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lli) ipChange.ipc$dispatch("f075f55", new Object[]{this}) : this.c;
    }

    @Override // tb.lgp
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        i();
        if (this.e == null) {
            return;
        }
        g();
    }

    private Map<String, String> b(String str, Intent intent) {
        OutLinkWithReqModel outLinkWithReqModel;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e260265", new Object[]{this, str, intent});
        }
        try {
            outLinkWithReqModel = (OutLinkWithReqModel) JSONObject.parseObject(str, OutLinkWithReqModel.class);
        } catch (Exception e) {
            ldf.d("ScrollToItemWithRequest", "外链数据模型解析出错: " + e);
            outLinkWithReqModel = null;
        }
        if (outLinkWithReqModel == null) {
            return null;
        }
        Map<String, String> bizParams = outLinkWithReqModel.getBizParams();
        if (intent != null && intent.getData() != null && (queryParameter = intent.getData().getQueryParameter("mediafrom")) != null) {
            bizParams.put("mediafrom", queryParameter);
        }
        return bizParams;
    }

    private boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            ldf.d("ScrollToItemWithRequest", "intent为空");
            return false;
        }
        Uri data = intent.getData();
        if (data == null) {
            ldf.d("ScrollToItemWithRequest", "intent携带的参数为空");
            return false;
        }
        try {
            return Boolean.parseBoolean(data.getQueryParameter(aw.PARAM_FORCE_REFRESH));
        } catch (Exception unused) {
            ldf.d("ScrollToItemWithRequest", "解析 forceRefresh失败");
            return false;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ScrollToItemWithRequest", "数据服务为空");
            return;
        }
        this.d = d();
        iContainerDataService.addDataProcessListener(this.d);
    }

    private IContainerDataService.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("327a8d20", new Object[]{this}) : new a();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ScrollToItemWithRequest", "onPullRefresh dataService == null");
            return;
        }
        f();
        iContainerDataService.triggerEvent("PageBack", null, new lje("PageBack" + SystemClock.uptimeMillis()));
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ScrollToItemWithRequest", "onPullRefresh dataService == null");
            return;
        }
        iContainerDataService.triggerEvent("ColdStart", null, new lje("ColdStart" + SystemClock.uptimeMillis()));
    }

    private boolean a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f302f753", new Object[]{this, lliVar})).booleanValue();
        }
        lli lliVar2 = this.c;
        return (lliVar2 == null || lliVar == null || !lliVar2.a().equals(lliVar.a())) ? false : true;
    }

    private boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue() : (this.b == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().mo1280getPageParams() == null || iContainerDataModel.getBase().mo1280getPageParams().getPageNum() != 0) ? false : true;
    }

    private void b(IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24715b2", new Object[]{this, iContainerDataModel});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30582a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("ScrollToItemWithRequest", "feeds服务为空");
            return;
        }
        int a2 = a(iContainerDataModel, iMainFeedsViewService);
        ldf.d("ScrollToItemWithRequest", "anchorPosition：" + a2);
        iMainFeedsViewService.scrollToPositionWithOffset(a2, 0);
        lgt.a(lgt.OUT_LINK_PROCESS_END, lgt.SCROLL_TO_RECOMMEND_WITH_REQUEST);
    }

    private int a(IContainerDataModel iContainerDataModel, IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ac1ae78", new Object[]{this, iContainerDataModel, iMainFeedsViewService})).intValue();
        }
        if (iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getExt() == null) {
            ldf.d("ScrollToItemWithRequest", "base数据为空或者 ext数据为空");
            return 0;
        }
        JSONObject jSONObject = iContainerDataModel.getBase().getExt().getJSONObject("anchor");
        if (jSONObject == null) {
            ldf.d("ScrollToItemWithRequest", "锚点信息为空");
            return 0;
        }
        return iMainFeedsViewService.getPositionBySectionBizCode(jSONObject.getString("outputLink"));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ScrollToItemWithRequest", "abandonData dataService is null");
            return;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("ScrollToItemWithRequest", "containerData is null");
            return;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("ScrollToItemWithRequest", "baseData is null");
        } else {
            base.abandonData("outPushPlanId");
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ScrollToItemWithRequest", "removeRequestBizParamsCreator dataService is null");
            return;
        }
        iContainerDataService.removeRequestBizParamsCreator(this.e);
        this.e = null;
    }

    private void a(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1818621b", new Object[]{this, cVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ScrollToItemWithRequest", "addRequestBizParamsCreator dataService is null");
        } else {
            iContainerDataService.addRequestBizParamsCreator(cVar);
        }
    }

    private IContainerDataService.c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("4f1e1662", new Object[]{this}) : new IContainerDataService.c() { // from class: tb.lgs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                if (!TextUtils.equals(str, Constant.KEY_PAGEBACK) && !TextUtils.equals(str, "coldStart")) {
                    return null;
                }
                lgs.a(lgs.this, lliVar);
                Map<String, String> b = lgs.b(lgs.this);
                lgs.a(lgs.this, (Map) null);
                lgs.a(lgs.this);
                return b;
            }
        };
    }

    private void i() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30582a.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.d) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    /* loaded from: classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-294862796);
            kge.a(348066581);
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
            }
        }

        private a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void b(lli lliVar, final IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                return;
            }
            lgs.this.g = j.a("enableOutLinkBugfix", true);
            if (lgs.b(lgs.this, lliVar)) {
                ljd.a().b(new Runnable() { // from class: tb.lgs.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            lgs.a(lgs.this, iContainerDataModel);
                        }
                    }
                });
            } else if (!lgs.b(lgs.this, iContainerDataModel) || lgs.this.g) {
            } else {
                lgs.c(lgs.this);
            }
        }
    }
}
