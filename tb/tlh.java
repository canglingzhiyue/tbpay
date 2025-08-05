package tb;

import android.content.SharedPreferences;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.utils.n;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class tlh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tlh INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final SharedPreferences f34188a;

    static {
        kge.a(77905142);
        INSTANCE = new tlh();
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…ice::class.java\n        )");
        SharedPreferences sharedPreferences = ((IEnvironmentService) a2).getApplicationContext().getSharedPreferences("tms_local_force_update_app_info_config", 0);
        q.b(sharedPreferences, "TMSAdapterManager.getNot…xt.MODE_PRIVATE\n        )");
        f34188a = sharedPreferences;
    }

    private tlh() {
    }

    @JvmStatic
    public static final boolean a(AppInfoDao appInfo) {
        JSONObject extendInfos;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43f46e4", new Object[]{appInfo})).booleanValue();
        }
        q.d(appInfo, "appInfo");
        if (!n.bp()) {
            return false;
        }
        String appId = appInfo.appId;
        AppModel appModel = appInfo.appInfo;
        if (appModel == null || (extendInfos = appModel.getExtendInfos()) == null || (string = extendInfos.getString("categoryCode")) == null) {
            return false;
        }
        IConfigAdapter iConfigAdapter = (IConfigAdapter) qpt.b(IConfigAdapter.class);
        String str = null;
        Map<String, String> configs = iConfigAdapter != null ? iConfigAdapter.getConfigs("miniapp_cache_update_config_new") : null;
        if (configs == null || configs.isEmpty()) {
            return false;
        }
        tlh tlhVar = INSTANCE;
        q.b(appId, "appId");
        a a2 = tlhVar.a(appId, string, configs);
        TMSLogger.a("AppInfoForceUpdateManager", "orangeConfig: " + a2);
        if (a2 == null) {
            INSTANCE.a(appId, null);
            return false;
        }
        a a3 = INSTANCE.a(appId);
        if (q.a((Object) (a3 != null ? a3.a() : null), (Object) a2.a())) {
            if (a3 != null) {
                str = a3.b();
            }
            if (q.a((Object) str, (Object) a2.b())) {
                return false;
            }
        }
        TMSLogger.a("AppInfoForceUpdateManager", "needForceUpdateAppInfo: appId:" + appId + ", categoryId:" + string);
        return true;
    }

    @JvmStatic
    public static final void a(AppModel appModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6e15f", new Object[]{appModel});
            return;
        }
        q.d(appModel, "appModel");
        if (!n.bp()) {
            return;
        }
        String appId = appModel.getAppId();
        JSONObject extendInfos = appModel.getExtendInfos();
        Map<String, String> map = null;
        String string = extendInfos != null ? extendInfos.getString("categoryCode") : null;
        String str = appId;
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = string;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        IConfigAdapter iConfigAdapter = (IConfigAdapter) qpt.b(IConfigAdapter.class);
        if (iConfigAdapter != null) {
            map = iConfigAdapter.getConfigs("miniapp_cache_update_config_new");
        }
        if (map == null || map.isEmpty()) {
            z = true;
        }
        if (z) {
            return;
        }
        a a2 = INSTANCE.a(appId, string, map);
        TMSLogger.a("AppInfoForceUpdateManager", "updateLocalForceUpdateConfig: " + a2);
        INSTANCE.a(appId, a2);
    }

    private final a a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4171ff50", new Object[]{this, str, str2, map});
        }
        String str3 = map.get("appId_" + str);
        String str4 = map.get("categoryCode_" + str2);
        if (str3 != null || str4 != null) {
            return new a(str3, str4);
        }
        return null;
    }

    private final a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("35b727c7", new Object[]{this, str});
        }
        String string = f34188a.getString(str, null);
        if (string == null) {
            return null;
        }
        q.b(string, "mSp.getString(appId, null) ?: return null");
        try {
            JSONObject parseObject = JSON.parseObject(string);
            return new a(parseObject.getString("appIdVersion"), parseObject.getString("categoryVersion"));
        } catch (Exception e) {
            TMSLogger.b("AppInfoForceUpdateManager", "parse local config error", e);
            return null;
        }
    }

    private final void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69701155", new Object[]{this, str, aVar});
        } else if (aVar == null) {
            if (!f34188a.contains(str)) {
                return;
            }
            f34188a.edit().remove(str).commit();
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "appIdVersion", aVar.a());
            jSONObject2.put((JSONObject) "categoryVersion", aVar.b());
            f34188a.edit().putString(str, jSONObject.toJSONString()).commit();
        }
    }

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f34189a;
        private final String b;

        static {
            kge.a(1417007445);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!q.a((Object) this.f34189a, (Object) aVar.f34189a) || !q.a((Object) this.b, (Object) aVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f34189a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AppInfoForceUpdateConfig(appIdVersion=" + this.f34189a + ", categoryVersion=" + this.b + riy.BRACKET_END_STR;
        }

        public a(String str, String str2) {
            this.f34189a = str;
            this.b = str2;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f34189a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }
}
