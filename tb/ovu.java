package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.m;
import com.taobao.homepage.utils.n;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.performance.i;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.commonsubservice.dataservice.a;
import com.taobao.tao.recommend3.tracelog.b;
import java.util.List;

/* loaded from: classes.dex */
public class ovu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2070513685);
    }

    public static /* synthetic */ boolean a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ba04289", new Object[]{sectionModel})).booleanValue() : c(sectionModel);
    }

    public static /* synthetic */ boolean b(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c220a68", new Object[]{sectionModel})).booleanValue() : d(sectionModel);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            DTemplateManager.a(lfq.DINAMIC_MODULE).a(i);
        }
    }

    public void a(String str, List<SectionModel> list, final Context context, final boolean z, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48818174", new Object[]{this, str, list, context, new Boolean(z), new Integer(i)});
            return;
        }
        b.a().e(b.HOME_SUB_PRERENDER);
        b.a().a(b.HOME_SUB_PRERENDER, 2);
        final HomeInfoFlowDataService a2 = a.a(str);
        if (a2 == null) {
            ldf.d("MicroservicesInfoFlowPerformance", "preloadCards dataService is null");
        } else {
            m.a(str, list, new i() { // from class: tb.ovu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.performance.i
                public void a(SectionModel sectionModel, DXTemplateItem dXTemplateItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8c7776e", new Object[]{this, sectionModel, dXTemplateItem});
                    } else if (ovu.a(sectionModel)) {
                        ldf.d("MicroservicesInfoFlowPerformance", "isBannerCard : 首焦不做预渲染");
                    } else if (ovu.b(sectionModel)) {
                        ldf.d("MicroservicesInfoFlowPerformance", "isVideoCard : 视频卡不做预渲染");
                    } else {
                        String sectionBizCode = sectionModel.getSectionBizCode();
                        if (sectionBizCode == null) {
                            e.e("MicroservicesInfoFlowPerformance", "sectionBizCode == null");
                        } else if (sectionBizCode.contains("icon_and_miniapp") && n.n().q()) {
                            e.e("MicroservicesInfoFlowPerformance", "关闭icon预渲染");
                        } else if (sectionBizCode.contains("recommend_gongge") && n.n().r()) {
                            e.e("MicroservicesInfoFlowPerformance", "关闭宫格预渲染");
                        } else if (!xnh.a() && !sectionBizCode.contains("icon_and_miniapp") && !sectionBizCode.contains("recommend_gongge") && !sectionBizCode.contains("recommend_banner") && n.n().t()) {
                            e.e("MicroservicesInfoFlowPerformance", "关闭信息流预渲染");
                        } else {
                            m.a(Integer.valueOf(System.identityHashCode(sectionModel)));
                            lar.i("dxPreRender_" + dXTemplateItem.f());
                            e.e("MicroservicesInfoFlowPerformance", "preRenderCards dxPreRender_" + dXTemplateItem.f());
                            a2.preRenderItem(context, sectionModel, z, i);
                            lar.j("dxPreRender_" + dXTemplateItem.f());
                            b.a().f(b.HOME_SUB_PRERENDER);
                            b.a().b(b.HOME_SUB_PRERENDER);
                        }
                    }
                }
            });
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HomeInfoFlowDataService a2 = a.a(str);
        if (a2 == null) {
            ldf.d("MicroservicesInfoFlowPerformance", "preLoadTheme dataService is null");
        } else {
            a2.preLoadTheme();
        }
    }

    private static boolean c(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca3d247", new Object[]{sectionModel})).booleanValue();
        }
        JSONObject ext = sectionModel.getExt();
        if (ext != null) {
            return ext.getBooleanValue("isBannerCard");
        }
        return false;
    }

    private static boolean d(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed259a26", new Object[]{sectionModel})).booleanValue();
        }
        try {
            JSONObject ext = sectionModel.getExt();
            if (ext != null) {
                return ext.getBooleanValue("isVideoCard");
            }
            return false;
        } catch (Throwable th) {
            e.a("MicroservicesInfoFlowPerformance", "parse isVideoCard error ", th);
            return false;
        }
    }
}
