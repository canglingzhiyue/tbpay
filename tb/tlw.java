package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/taobao/domain/TMSABSwitchChecker;", "Lcom/taobao/themis/taobao/domain/ITMSSwitchChecker;", "()V", "mHasInitialized", "", "mSp", "Landroid/content/SharedPreferences;", "mSwitchConfigs", "Lcom/alibaba/fastjson/JSONArray;", "namespace", "", "spName", "getABName", "config", "uri", "Landroid/net/Uri;", "initIfNecessary", "", "shouldSwitchToTMS", "navigationInfo", "Lcom/taobao/themis/taobao/domain/NavigationInfo;", "updateConfig", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlw implements tlu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private JSONArray c;
    private SharedPreferences d;

    /* renamed from: a  reason: collision with root package name */
    private final String f34201a = "themis_url_white_list";
    private final String e = "tms_local_TMSABSwitchChecker_orange";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032F\u0010\u0005\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "p0", "", "kotlin.jvm.PlatformType", p1.d, "", "", "onConfigUpdate", "com/taobao/themis/taobao/domain/TMSABSwitchChecker$initIfNecessary$1$2"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Application b;

        public a(Application application) {
            this.b = application;
        }

        @Override // com.taobao.orange.d
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!StringUtils.equals(tlw.a(tlw.this), str)) {
            } else {
                tlw.b(tlw.this);
            }
        }
    }

    static {
        kge.a(-2010510426);
        kge.a(848488624);
    }

    public static final /* synthetic */ String a(tlw tlwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e692dc47", new Object[]{tlwVar}) : tlwVar.f34201a;
    }

    public static final /* synthetic */ void b(tlw tlwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef331ffa", new Object[]{tlwVar});
        } else {
            tlwVar.b();
        }
    }

    @Override // tb.tlu
    public boolean a(tlv navigationInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afa51e", new Object[]{this, navigationInfo})).booleanValue();
        }
        q.d(navigationInfo, "navigationInfo");
        a();
        Uri b = navigationInfo.b();
        JSONArray jSONArray = this.c;
        String a2 = jSONArray != null ? a(jSONArray, b) : null;
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        Context applicationContext = navigationInfo.c().getApplicationContext();
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(applicationContext, "TMS_H5_SWITCH_" + a2);
        TMSLogger.a("TMSSwitchChecker", "TMSABSwitchChecker shouldSwitchToTMS: " + a2 + ", " + isFeatureOpened);
        return isFeatureOpened;
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Application application = android.taobao.windvane.config.a.f;
        if (application == null) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.d = application.getSharedPreferences(this.e, 0);
            String str = null;
            String customConfig = OrangeConfig.getInstance().getCustomConfig(this.f34201a, null);
            if (customConfig == null) {
                SharedPreferences sharedPreferences = this.d;
                if (sharedPreferences != null) {
                    str = sharedPreferences.getString(this.f34201a, null);
                }
                customConfig = str;
            }
            if (customConfig != null) {
                Result.a aVar = Result.Companion;
                this.c = JSONArray.parseArray(customConfig);
                Result.m2371constructorimpl(t.INSTANCE);
            }
            TMSLogger.a("TMSSwitchChecker", "TMSABSwitchChecker registerListener");
            OrangeConfig.getInstance().registerListener(new String[]{this.f34201a}, new a(application), true);
            t tVar = t.INSTANCE;
        }
    }

    private final void b() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig(this.f34201a, null);
        if (customConfig == null) {
            return;
        }
        synchronized (this) {
            try {
                Result.a aVar = Result.Companion;
                SharedPreferences sharedPreferences = this.d;
                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(this.f34201a, customConfig)) != null) {
                    putString.apply();
                }
                this.c = JSONArray.parseArray(customConfig);
                TMSLogger.a("TMSSwitchChecker", "TMSABSwitchChecker updateConfig: " + customConfig);
                Result.m2371constructorimpl(t.INSTANCE);
            } finally {
            }
        }
    }

    private final String a(JSONArray jSONArray, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45a7f7c9", new Object[]{this, jSONArray, uri});
        }
        String host = uri.getHost();
        String path = uri.getPath();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
                q.b(jSONObject2, "jsonObj.getJSONObject(\"condition\")");
                String string = jSONObject2.getString("host");
                q.b(string, "condition.getString(\"host\")");
                String string2 = jSONObject2.getString("path");
                q.b(string2, "condition.getString(\"path\")");
                if (StringUtils.equals(host, string) && StringUtils.equals(path, string2)) {
                    return jSONObject.getString("name");
                }
            }
        }
        return null;
    }
}
