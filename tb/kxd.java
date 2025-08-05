package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.request.SettingGetResult;
import com.taobao.homepage.request.SettingNewConfigClient;
import com.taobao.homepage.request.SettingNewConfigParams;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.tao.homepage.launcher.g;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes.dex */
public class kxd implements com.taobao.android.trade.boost.request.mtop.a<SettingGetResult>, j<kxc> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GET_CONFIG_PREFIX = "getConfig";

    /* renamed from: a  reason: collision with root package name */
    private SettingNewConfigClient f30370a;
    private String b;
    private String c = oqc.a().m();

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static kxd f30371a;

        static {
            kge.a(1080224591);
            f30371a = new kxd();
        }

        public static /* synthetic */ kxd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kxd) ipChange.ipc$dispatch("f071767", new Object[0]) : f30371a;
        }
    }

    static {
        kge.a(1458360561);
        kge.a(-1453870097);
        kge.a(1595456606);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kxc kxcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kxcVar}) : a(kxcVar);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((SettingGetResult) obj);
        }
    }

    public static kxd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kxd) ipChange.ipc$dispatch("f071767", new Object[0]) : a.a();
    }

    public void a(SettingGetResult settingGetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d8a9c6", new Object[]{this, settingGetResult});
            return;
        }
        e.e("FetchSettingNewConfigSubscriber", "SendRequest onSuccess getConfig");
        com.taobao.tao.recommend3.tracelog.a.a("getConfigMtopRequest", true, this.b, this.c);
        if (settingGetResult == null) {
            return;
        }
        b(settingGetResult);
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("onFailure: ");
        sb.append(mtopResponse == null ? "" : mtopResponse.toString());
        strArr[0] = sb.toString();
        e.e("FetchSettingNewConfigSubscriber", strArr);
        com.taobao.tao.recommend3.tracelog.a.a("getConfigMtopRequest", false, this.b, this.c);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("onSystemFailure: ");
        sb.append(mtopResponse == null ? "" : mtopResponse.toString());
        strArr[0] = sb.toString();
        e.e("FetchSettingNewConfigSubscriber", strArr);
        com.taobao.tao.recommend3.tracelog.a.a("getConfigMtopRequest", false, this.b, this.c);
    }

    public i a(kxc kxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("523d96ed", new Object[]{this, kxcVar});
        }
        SettingNewConfigClient settingNewConfigClient = this.f30370a;
        if (settingNewConfigClient != null && settingNewConfigClient.isRequesting()) {
            return i.FAILURE;
        }
        this.b = b(kxcVar);
        if (TextUtils.isEmpty(this.b)) {
            return i.FAILURE;
        }
        SettingNewConfigParams.a d = d();
        com.taobao.tao.recommend3.tracelog.a.a("getConfigMtopRequest", this.b, this.c);
        if (e()) {
            this.f30370a = new SettingNewConfigClient() { // from class: com.taobao.homepage.event.FetchSettingNewConfigSubscriber$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.request.SettingNewConfigClient, com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
                public String getApiName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.taobao.homepage.miniapp.secondfloor.getconfig";
                }
            };
            e.e("FetchSettingNewConfigSubscriber", "二楼配置使用新api");
        } else {
            this.f30370a = new SettingNewConfigClient();
            e.e("FetchSettingNewConfigSubscriber", "二楼配置使用旧api");
        }
        this.f30370a.execute(d.a(), this, null);
        return i.SUCCESS;
    }

    private void b(SettingGetResult settingGetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c963c787", new Object[]{this, settingGetResult});
            return;
        }
        com.taobao.tao.recommend3.tracelog.a.a("getConfigUiRefresh", this.b, this.c);
        com.taobao.homepage.speed.a.a().a(new kxn(settingGetResult, this.b));
        com.taobao.tao.recommend3.tracelog.a.a("getConfigUiRefresh", true, this.b, this.c);
    }

    private String b(kxc kxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dd2b5fd", new Object[]{this, kxcVar});
        }
        Object param = kxcVar.getParam();
        if (param instanceof String) {
            String str = (String) param;
            if (!TextUtils.isEmpty(str) && c().contains(str)) {
                return str;
            }
        }
        return null;
    }

    private List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String l = com.taobao.android.home.component.utils.j.l();
        if (!TextUtils.isEmpty(l)) {
            arrayList.addAll(Arrays.asList(l.split(",")));
        }
        return arrayList;
    }

    private SettingNewConfigParams.a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SettingNewConfigParams.a) ipChange.ipc$dispatch("61e7c17", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("home_pull_down");
        arrayList.add("refresh_config");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) this.b);
        jSONObject.put("deviceLevel", (Object) g.b());
        SettingNewConfigParams.a aVar = new SettingNewConfigParams.a();
        aVar.a(JSON.toJSONString(arrayList)).b(Login.getSid()).e(Login.getOldNick()).d(Login.getOldUserId()).c(UTDevice.getUtdid(g.a())).i(com.taobao.android.home.component.utils.i.a()).j(jSONObject.toString());
        TBLocationDTO b = com.taobao.tao.homepage.a.a() ? TBLocationClient.b() : null;
        if (b != null) {
            aVar.g(b.getLatitude()).f(b.getLongitude());
            HashMap hashMap = new HashMap();
            hashMap.put("provinceName", b.getProvinceName());
            hashMap.put(noa.KEY_CITY_NAME, b.getCityName());
            aVar.h(JSON.toJSONString(hashMap));
        }
        return aVar;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.AsyncThread;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : com.taobao.android.home.component.utils.j.a("enableNewMiniAppApi", false);
    }
}
