package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.taobao.themis.kernel.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J@\u0010\r\u001a\u00020\u000e26\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000e0\u0010H&JF\u0010\u0016\u001a\u00020\u000e2<\u0010\u0017\u001a8\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e0\u0010H&JU\u0010\u001a\u001a\u00020\u000e2K\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000e0\u001cH&J-\u0010\u001f\u001a\u00020\u000e2#\u0010 \u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u000e0!H&J@\u0010#\u001a\u00020\u000e26\u0010$\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000e0\u0010H&J@\u0010'\u001a\u00020\u000e26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000e0\u0010H&J\b\u0010*\u001a\u00020\u000eH&J\b\u0010+\u001a\u00020\u000eH&J\b\u0010,\u001a\u00020\u000eH&J\b\u0010-\u001a\u00020\u000eH&J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u000200H&¨\u00061"}, d2 = {"Lcom/taobao/mytaobao/dataservice/service/IMainPageDataService;", "", "getCustomerServiceTxt", "", "getCustomerServiceUrl", "getLocalData", "Lcom/alibaba/fastjson/JSONObject;", "getPageData", "getSettingButtonTxt", "getSettingButtonUrl", "getUserNick", "is88Vip", "", "listenGlobalDataChange", "", "globalChangeListener", "Lkotlin/Function2;", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "Lkotlin/ParameterName;", "name", "reason", "global", "listenLayoutChange", "layoutChangeListener", "", "moduleNameList", "listenPageDataChange", "dataChangeListener", "Lkotlin/Function3;", "hierarchyData", "hierarchyMap", "listenRefreshFailed", "refreshFailedListener", "Lkotlin/Function1;", "errorMsg", "listenTemplateChange", "templateChangeListener", "Lcom/alibaba/fastjson/JSONArray;", "hierarchyList", "listenerFullDataChange", "fullDataChangeListener", "fullData", "loadPageData", "markNeedRefresh", Constant.KEY_PAGEBACK, "pageOut", "refreshPageData", i.CDN_REQUEST_TYPE, "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface xns {
    void a(int i);

    void a(rul<? super String, t> rulVar);

    void a(ruw<? super xnq, ? super JSONObject, t> ruwVar);

    void a(rva<? super xnq, ? super JSONObject, ? super JSONObject, t> rvaVar);

    boolean a();

    String b();

    void b(ruw<? super xnq, ? super JSONArray, t> ruwVar);

    String c();

    void c(ruw<? super xnq, ? super List<String>, t> ruwVar);

    String d();

    void d(ruw<? super xnq, ? super JSONObject, t> ruwVar);

    String e();

    String f();

    JSONObject g();

    void h();

    void i();
}
