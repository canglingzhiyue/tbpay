package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;

/* loaded from: classes.dex */
public class lne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30736a;
    private final lnf b;
    private int c;
    private int d;
    private boolean e;
    private final lnd f;

    static {
        kge.a(2026869233);
    }

    public static /* synthetic */ int a(lne lneVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f31d54c8", new Object[]{lneVar})).intValue() : lneVar.c;
    }

    public static /* synthetic */ void a(lne lneVar, IMainFeedsViewService iMainFeedsViewService, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77221763", new Object[]{lneVar, iMainFeedsViewService, new Integer(i), new Integer(i2)});
        } else {
            lneVar.a(iMainFeedsViewService, i, i2);
        }
    }

    public static /* synthetic */ lnf b(lne lneVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lnf) ipChange.ipc$dispatch("8e836fcc", new Object[]{lneVar}) : lneVar.b;
    }

    public lne(ljs ljsVar, lnf lnfVar) {
        this.f30736a = ljsVar;
        this.b = lnfVar;
        this.f = new lnd(ljsVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) this.f30736a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("ExitRemainController", "triggerClickBack", "error mainFeedsViewService is null");
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.f30736a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ExitRemainController", "triggerClickBack", "error containerDataService is null");
        } else if (this.f.b()) {
            ldf.d("ExitRemainController", "指定时间范围内不允许点击回退");
        } else {
            a(iContainerDataService);
            if (this.c == -1 && this.d == -1) {
                ldf.d("ExitRemainController", "triggerClickBack", "mAnchorPosition & mAnchorOffset = -1");
            } else if (!this.e) {
                ldf.d("ExitRemainController", "triggerClickBack", "is not support clickBack refresh");
            } else {
                a(iMainFeedsViewService, this.c, this.d);
                a(iContainerDataService, iMainFeedsViewService);
            }
        }
    }

    private void a(final IContainerDataService<?> iContainerDataService, final IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da827e", new Object[]{this, iContainerDataService, iMainFeedsViewService});
            return;
        }
        final lje c = c();
        iContainerDataService.addDataProcessListener(new IContainerDataService.a() { // from class: tb.lne.1
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
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                    return;
                }
                if (lliVar == null || !TextUtils.equals(c.a(), lliVar.a())) {
                    z = false;
                }
                if (!z) {
                    return;
                }
                ljd.a().b(new Runnable() { // from class: tb.lne.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            lne.a(lne.this, iMainFeedsViewService, lne.a(lne.this), 0);
                        }
                    }
                });
                if (lne.b(lne.this) != null) {
                    lne.b(lne.this).a(lne.a(lne.this));
                }
                iContainerDataService.removeDataProcessListener(this);
            }
        });
        iContainerDataService.triggerEvent("ClickBack", null, c);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private void a(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248587ba", new Object[]{this, iContainerDataService});
            return;
        }
        this.c = -1;
        this.d = -1;
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0 || containerData.getBase() == null || containerData.getBase().getExt() == null) {
            ldf.d("ExitRemainController", "base ext is null");
            return;
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.f30736a.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService == null) {
            ldf.d("ExitRemainController", "firstScreenDataService == null");
            return;
        }
        JSONObject firstScreenExt = iFirstScreenDataService.getFirstScreenExt();
        if (firstScreenExt == null) {
            ldf.d("ExitRemainController", "firstScreenExt == null");
            return;
        }
        String string = firstScreenExt.getString("feedsStartSectionBizCode");
        List totalData = containerData.getTotalData();
        this.e = containerData.getBase().getExt().getBooleanValue("clickBack");
        int a2 = lix.a(string, totalData);
        if (a2 >= 0) {
            this.c = a2;
        }
        if (this.c < 0 || !this.e) {
            return;
        }
        String string2 = containerData.getBase().getExt().getString("clickBackOffset");
        this.d = 2;
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        try {
            this.d = Integer.parseInt(string2);
        } catch (Throwable unused) {
            this.d = 2;
            ldf.d("ExitRemainController", "parseAnchorPosition 异常 clickBackOffset的值不是数字 ：" + string2);
        }
    }

    private void a(IMainFeedsViewService<?> iMainFeedsViewService, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd5adf0", new Object[]{this, iMainFeedsViewService, new Integer(i), new Integer(i2)});
            return;
        }
        iMainFeedsViewService.stopScroll();
        iMainFeedsViewService.scrollToPositionWithOffset(i + i2, 0);
    }

    private lje c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lje) ipChange.ipc$dispatch("1e6aa215", new Object[]{this});
        }
        return new lje("ExitRemainController_" + SystemClock.uptimeMillis());
    }
}
