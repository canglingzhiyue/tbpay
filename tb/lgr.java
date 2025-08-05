package tb;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model.OutLinkModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes7.dex */
public class lgr implements lgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30579a;
    private JSONObject d;
    private IContainerDataService.a e;
    private IMainFeedsViewService<?> h;
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean f = false;
    private OutLinkModel g = null;
    public boolean c = true;

    static {
        kge.a(984963159);
        kge.a(-1054310725);
    }

    @Override // tb.lgp
    public lli a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lli) ipChange.ipc$dispatch("f075f55", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ OutLinkModel a(lgr lgrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutLinkModel) ipChange.ipc$dispatch("d13cbf0a", new Object[]{lgrVar}) : lgrVar.g;
    }

    public static /* synthetic */ void a(lgr lgrVar, OutLinkModel outLinkModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf333760", new Object[]{lgrVar, outLinkModel, str});
        } else {
            lgrVar.a(outLinkModel, str);
        }
    }

    public static /* synthetic */ void a(lgr lgrVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90bcd7a", new Object[]{lgrVar, iContainerDataModel});
        } else {
            lgrVar.a(iContainerDataModel);
        }
    }

    public lgr(ljs ljsVar) {
        this.f30579a = ljsVar;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ljs ljsVar = this.f30579a;
        if (ljsVar == null) {
            return;
        }
        this.h = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30579a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.e = e();
        iContainerDataService.addDataProcessListener(this.e);
    }

    private void d() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30579a.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.e) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    @Override // tb.lgp
    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
            return;
        }
        lgt.a(lgt.OUT_LINK_PROCESS_START, lgt.SCROLL_TO_RECOMMEND);
        OutLinkModel a2 = a(str);
        if (a2 == null) {
            return;
        }
        String b = liy.b(this.f30579a);
        this.c = j.a("enableOutLinkBugfix", true);
        if (b == null && this.c) {
            b = f();
        }
        if (b == null) {
            this.f = true;
            this.g = a2;
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.h;
        if (iMainFeedsViewService != null && !iMainFeedsViewService.isRecyclerViewCreated()) {
            this.f = true;
            this.g = a2;
            return;
        }
        this.f = false;
        a(a2, b);
    }

    @Override // tb.lgp
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d();
        }
    }

    private IContainerDataService.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("39a36f61", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.lgr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                    return;
                }
                lgr.this.c = j.a("enableOutLinkBugfix", true);
                if (!lgr.this.c) {
                    return;
                }
                lgr.a(lgr.this, iContainerDataModel);
            }
        };
    }

    private OutLinkModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutLinkModel) ipChange.ipc$dispatch("df1c6fd9", new Object[]{this, str});
        }
        try {
            return (OutLinkModel) JSONObject.parseObject(str, OutLinkModel.class);
        } catch (Exception e) {
            ldf.d("ScrollToItemOperator", "解析成外链数据模型出错: " + e);
            return null;
        }
    }

    private void a(OutLinkModel outLinkModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b7c0e7", new Object[]{this, outLinkModel, str});
            return;
        }
        final String biz = outLinkModel.getBiz();
        final JSONObject args = outLinkModel.getArgs();
        int b = b(outLinkModel, str);
        if (b < 0) {
            lgt.b(lgt.SCROLL_TO_RECOMMEND, lgt.SCROLL_TO_RECOMMEND_ERROR_CODE);
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30579a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.scrollToPosition(b);
        lgt.a(lgt.OUT_LINK_PROCESS_END, lgt.SCROLL_TO_RECOMMEND);
        this.b.post(new Runnable() { // from class: tb.lgr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str2 = biz;
                JSONObject jSONObject = args;
                ldl.a("Page_Home", 19999, "RecmdScrollItem", str2, "", jSONObject == null ? "" : jSONObject.toString());
            }
        });
    }

    private int b(OutLinkModel outLinkModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e41e301b", new Object[]{this, outLinkModel, str})).intValue();
        }
        if (!TextUtils.equals("infoFlow", outLinkModel.getArea())) {
            ldf.d("!TextUtils.equals(INFOFLOW, area),area is :" + outLinkModel.getArea(), new String[0]);
            return -1;
        }
        int offset = outLinkModel.getOffset();
        int b = b(str);
        return str == null ? offset + 4 : b < 0 ? offset : b + offset;
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            ldf.d("ScrollToItemOperator", "infoFlowCardStartBizCode为空");
            return -1;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30579a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("ScrollToItemOperator", "feeds服务为空");
            return -1;
        }
        return iMainFeedsViewService.getPositionBySectionBizCode(str);
    }

    private void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getExt() == null) {
        } else {
            this.d = iContainerDataModel.getBase().getExt();
            final String f = f();
            if (!this.f || this.g == null) {
                return;
            }
            IMainFeedsViewService<?> iMainFeedsViewService = this.h;
            if (iMainFeedsViewService != null && !iMainFeedsViewService.isRecyclerViewCreated()) {
                return;
            }
            this.f = false;
            ljd.a().b(new Runnable() { // from class: tb.lgr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    lgr lgrVar = lgr.this;
                    lgr.a(lgrVar, lgr.a(lgrVar), f);
                }
            });
        }
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            return jSONObject.getString("feedsStartSectionBizCode");
        }
        return null;
    }
}
