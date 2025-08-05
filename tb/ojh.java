package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* loaded from: classes8.dex */
public class ojh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-954803706);
    }

    public static boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{str, jSONObject})).booleanValue();
        }
        ldf.d("TriggerAdapter", "triggerEvent event: " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1969169858:
                if (str.equals("UserLogin")) {
                    c = 5;
                    break;
                }
                break;
            case -1443537093:
                if (str.equals("OnlyUiRefresh")) {
                    c = 0;
                    break;
                }
                break;
            case -1431300759:
                if (str.equals("PageEnter")) {
                    c = '\n';
                    break;
                }
                break;
            case -1332280360:
                if (str.equals("MultiTabSelect")) {
                    c = JSONLexer.EOI;
                    break;
                }
                break;
            case -927843812:
                if (str.equals("LoadCache")) {
                    c = 3;
                    break;
                }
                break;
            case -717816089:
                if (str.equals("DragEnd")) {
                    c = 17;
                    break;
                }
                break;
            case -652676162:
                if (str.equals("ColdStart")) {
                    c = 2;
                    break;
                }
                break;
            case -390402785:
                if (str.equals("LocationChanged")) {
                    c = 7;
                    break;
                }
                break;
            case -387743558:
                if (str.equals("ViewAppear")) {
                    c = '\r';
                    break;
                }
                break;
            case -378725557:
                if (str.equals("HomeTabAppear")) {
                    c = 18;
                    break;
                }
                break;
            case -236827595:
                if (str.equals("HotStart")) {
                    c = 4;
                    break;
                }
                break;
            case -197436197:
                if (str.equals("ErrorViewClick")) {
                    c = 15;
                    break;
                }
                break;
            case -63439497:
                if (str.equals("IconOverlay")) {
                    c = 14;
                    break;
                }
                break;
            case 38361711:
                if (str.equals("ClickBack")) {
                    c = 19;
                    break;
                }
                break;
            case 829988903:
                if (str.equals("LoadingViewClick")) {
                    c = 16;
                    break;
                }
                break;
            case 869863114:
                if (str.equals("ColdStartOutLink")) {
                    c = 11;
                    break;
                }
                break;
            case 888559907:
                if (str.equals("OnlyRequest")) {
                    c = 21;
                    break;
                }
                break;
            case 923557942:
                if (str.equals("PageBack")) {
                    c = '\t';
                    break;
                }
                break;
            case 929429746:
                if (str.equals("popDataDeltaRequest")) {
                    c = 23;
                    break;
                }
                break;
            case 936116850:
                if (str.equals("EditionSwitch")) {
                    c = 6;
                    break;
                }
                break;
            case 965651817:
                if (str.equals("insertCard")) {
                    c = 25;
                    break;
                }
                break;
            case 1100729083:
                if (str.equals("PullToRefresh")) {
                    c = 1;
                    break;
                }
                break;
            case 1211206115:
                if (str.equals("popDataBaseRequest")) {
                    c = 22;
                    break;
                }
                break;
            case 1345148226:
                if (str.equals("NewInteractive")) {
                    c = 20;
                    break;
                }
                break;
            case 1346468776:
                if (str.equals("Preview")) {
                    c = '\b';
                    break;
                }
                break;
            case 1447909340:
                if (str.equals("DeleteOperation")) {
                    c = '\f';
                    break;
                }
                break;
            case 1777711753:
                if (str.equals("GridDeltaRefresh")) {
                    c = 27;
                    break;
                }
                break;
            case 1932619354:
                if (str.equals("FeedsRequest")) {
                    c = 24;
                    break;
                }
                break;
            case 2012840203:
                if (str.equals("ClickAiRefresh")) {
                    c = 28;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                oqc.a().a(true, false, "unknown", new String[]{oqc.a().m()});
                break;
            case 1:
                oqc.a().a(jSONObject);
                break;
            case 2:
                oqc.a().e();
                break;
            case 3:
                a();
                break;
            case 4:
                oqc.a().f();
                break;
            case 5:
                oqc.a().i();
                break;
            case 6:
                oqc.a().h();
                break;
            case 7:
                oqc.a().c(jSONObject);
                break;
            case '\b':
                oqc.a().d(jSONObject);
                break;
            case '\t':
                oqc.a().a(new String[]{oqc.a().l(), oqc.a().m()}, jSONObject);
                break;
            case '\n':
            case 11:
            case '\f':
            case 17:
                break;
            case '\r':
                opb.a("RequestNextPage", oqc.b, new String[]{oqc.a().m()}, jSONObject);
                break;
            case 14:
                opb.a("iconOverlay", oqc.f32275a, new String[]{oqc.a().m()}, jSONObject);
                break;
            case 15:
                opb.a("ViewClick", oqc.c, new String[]{oqc.a().m()}, jSONObject);
                break;
            case 16:
                opb.a("ViewClick", oqc.d, new String[]{oqc.a().m()}, jSONObject);
                break;
            case 18:
                oqc.a().g();
                break;
            case 19:
                oqc.a().g(jSONObject);
                break;
            case 20:
                oqc.a().a(str, jSONObject);
                break;
            case 21:
                oqc.a().h(jSONObject);
                break;
            case 22:
            case 23:
            case 24:
                oqc.a().b(str, jSONObject);
                break;
            case 25:
                oqc.a().k(jSONObject);
                break;
            case 26:
                opb.a("MultiTabSelect", oqc.f32275a, new String[]{oqc.a().l(), oqc.a().m()}, jSONObject);
                break;
            case 27:
                opb.a("GridDeltaRefresh", oqc.f32275a, new String[]{oqc.a().l(), oqc.a().m()}, jSONObject);
                break;
            case 28:
                oqc.a().b(new String[]{oqc.a().l(), oqc.a().m()}, jSONObject);
                break;
            default:
                return false;
        }
        return true;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String m = oqc.a().m();
        ope b = oqc.a().b();
        AwesomeGetContainerData b2 = b == null ? null : b.b(m);
        if (b2 != null && !b2.isEmpty()) {
            lar.e("infoFlow_loadCache_triggerUiRefresh");
            boolean z = !HomePageUtility.a(b2);
            oqc.a().a(z, true, z ? "coldStart" : "loadCache", new String[]{m});
            lar.f("infoFlow_loadCache_triggerUiRefresh");
            ldf.d("TriggerAdapter", "loadCacheAdapterProcess 触发刷新");
            return;
        }
        lar.e("infoFlow_loadCache_triggerLoadCache");
        oqc.a().d();
        lar.f("infoFlow_loadCache_triggerLoadCache");
        ldf.d("TriggerAdapter", "loadCacheAdapterProcess 触发缓存加载");
    }
}
