package com.taobao.alimama;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.click.interact.InteractBuilder;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import com.taobao.alimama.login.LoginManager;
import com.taobao.alimama.net.core.request.c;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.muniontaobaosdk.Munion;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import com.taobao.utils.ILoginInfoGetter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.ado;
import tb.ani;
import tb.dgd;
import tb.dhd;
import tb.dhe;
import tb.dhy;
import tb.dia;
import tb.dic;
import tb.fvp;
import tb.kge;
import tb.kuh;
import tb.rql;

/* loaded from: classes.dex */
public final class AlimamaAdvertising implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ConcurrentMap<String, com.taobao.alimama.tkcps.b> mTkCpsAdMap;
    private String mTkDefaultKey;
    private fvp mUDAdCommitter;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile AlimamaAdvertising f8397a;

        static {
            kge.a(-690591317);
            f8397a = new AlimamaAdvertising();
        }
    }

    static {
        kge.a(-2065921286);
        kge.a(1028243835);
    }

    private AlimamaAdvertising() {
        this.mTkCpsAdMap = new ConcurrentHashMap();
    }

    public static AlimamaAdvertising instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlimamaAdvertising) ipChange.ipc$dispatch("acb31d93", new Object[0]) : a.f8397a;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null) {
            throw new NullPointerException("application is can not be null");
        } else {
            Global.setApplication(application);
            if ("on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_param_switch", "on"))) {
                getDefaultTkCpsAd().a();
            }
            com.taobao.alimama.cpm.ifs.a.a().b();
            com.taobao.alimama.tanx.a.a().a(application);
            rql.registerAppStatusCallbacks(UTAppBackgroundTimeoutDetector.getInstance());
            UserTrackLogs.emptyCacheAndAllowDirectReport();
        }
    }

    public void setApplicationContext(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fef2997", new Object[]{this, application});
        } else {
            Global.setApplication(application);
        }
    }

    public void registerService(IBaseService iBaseService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5703f8", new Object[]{this, iBaseService});
        } else {
            com.taobao.alimama.services.a.d().a(iBaseService);
        }
    }

    public void registerMonitor(dhd dhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf1f64e", new Object[]{this, dhdVar});
        } else {
            dhe.b().a(dhdVar);
        }
    }

    public void injectMtopInstance(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba3376e", new Object[]{this, aVar});
        } else {
            com.taobao.alimama.net.core.request.c.a().a(aVar);
        }
    }

    public void removeMtopInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17bb128", new Object[]{this});
        } else {
            com.taobao.alimama.net.core.request.c.a().c();
        }
    }

    public boolean isRegisterMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e18d0b8", new Object[]{this})).booleanValue() : dhe.b().a();
    }

    public String fetchAdParameter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f65f3d03", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = getDefaultTkCpsAd().a(str);
        AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "Munion_fetch_param", String.format("%s=%s", str, a2));
        TaoLog.Logd("AlimamaSdk", String.format("fetched ad parameter: %s = %s", str, a2));
        return a2;
    }

    public void setLoginInfoGetter(ILoginInfoGetter iLoginInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cffcd0", new Object[]{this, iLoginInfoGetter});
        } else {
            LoginManager.a(iLoginInfoGetter);
        }
    }

    public String handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str}) : dgd.a().a(str);
    }

    public String handleAdUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1536da1", new Object[]{this, str, new Boolean(z)}) : handleAdUrl(str, z, true);
    }

    public String handleAdUrl(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc586b6b", new Object[]{this, str, new Boolean(z), new Boolean(z2)}) : c.a().a(str, z, z2);
    }

    public String handleAdUrl(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e541490", new Object[]{this, str, str2, list}) : handleAdUrl(handleInteractionClick(str, str2, list));
    }

    public String handleAdUrl(String str, String str2, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f6ca25c", new Object[]{this, str, str2, list, new Boolean(z)}) : handleAdUrl(str, str2, list, z, true);
    }

    public String handleAdUrl(String str, String str2, List<String> list, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4165ce10", new Object[]{this, str, str2, list, new Boolean(z), new Boolean(z2)}) : handleAdUrl(handleInteractionClick(str, str2, list), z, z2);
    }

    @Deprecated
    public Uri handleAdUrl(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("99b40653", new Object[]{this, uri}) : handleAdUrl(uri, true);
    }

    @Deprecated
    public Uri handleAdUrl(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("2a1fba6f", new Object[]{this, uri, new Boolean(z)}) : Uri.parse(handleAdUrl(uri.toString(), z, false));
    }

    public String handleAdUrlForClickid(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd0c1716", new Object[]{this, str, str2, list}) : handleAdUrlForClickid(str, str2, list, true);
    }

    public String handleAdUrlForClickid(String str, String str2, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b4f096", new Object[]{this, str, str2, list, new Boolean(z)}) : handleAdUrlForClickid(handleInteractionClick(str, str2, list), z);
    }

    public String handleAdUrlForClickid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5438d0b1", new Object[]{this, str}) : handleAdUrlForClickid(str, true);
    }

    public String handleAdUrlForClickid(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d61f6a5b", new Object[]{this, str, new Boolean(z)});
        }
        if (!EnvironmentUtils.isInTaobao()) {
            return c.a().a(str, z);
        }
        String a2 = b.a().a(str);
        Uri parse = Uri.parse(a2);
        if (!parse.isHierarchical() && a2.startsWith(ado.URL_SEPARATOR)) {
            parse = Uri.parse("http:" + a2);
        }
        return parse.getQueryParameter("clickid");
    }

    @Deprecated
    public String handleAdUrlForClickid(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7473e3e", new Object[]{this, uri}) : handleAdUrlForClickid(uri.toString(), true);
    }

    @Deprecated
    public String handleAdUrlForClickid(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4deae6e", new Object[]{this, uri, new Boolean(z)}) : handleAdUrlForClickid(uri.toString(), z);
    }

    public String handleAdClickForClickid(String str, String str2) {
        Munion munion;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ddca706e", new Object[]{this, str, str2}) : (EnvironmentUtils.getCurrentEnv() != EnvironmentUtils.Env.TMALL || (munion = Munion.getInstance(Global.getApplication(), null)) == null) ? "" : munion.commitCpmEvent(str);
    }

    public CpcClickBuilder buildCpcAdClick(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CpcClickBuilder) ipChange.ipc$dispatch("986267aa", new Object[]{this, str}) : new CpcClickBuilder(str);
    }

    public CpmClickBuilder buildCpmAdClick(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CpmClickBuilder) ipChange.ipc$dispatch("1d8cc8a0", new Object[]{this, str}) : new CpmClickBuilder(str);
    }

    public InteractBuilder buildInteractTracking(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InteractBuilder) ipChange.ipc$dispatch("3b88bfee", new Object[]{this, str}) : new InteractBuilder(str);
    }

    private String handleInteractionClick(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("514099f6", new Object[]{this, str, str2, list});
        }
        e.a("handle_interaction_click", "url = " + str + ", actionType = " + str2 + ", actionList=" + list);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && list != null && list.contains(str2)) {
            return str;
        }
        return null;
    }

    @Deprecated
    public void commitIfsExposure(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff195a6", new Object[]{this, application, str, str2});
            return;
        }
        if (application == null) {
            application = Global.getApplication();
        }
        if (TextUtils.isEmpty(str)) {
            str = Global.getPackageName();
        }
        buildIfsExposure(application, str2).withArgPid(str).commit();
    }

    public IfsBuilder buildIfsExposure(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IfsBuilder) ipChange.ipc$dispatch("8d94aa9b", new Object[]{this, application, str}) : new IfsBuilder(application, str);
    }

    public void commitIfsArrayExposure(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff0f85f", new Object[]{this, str, str2, str3, map});
            return;
        }
        Application application = Global.getApplication();
        if (TextUtils.isEmpty(str2)) {
            str2 = Global.getPackageName();
        }
        JSONArray parseArray = JSONArray.parseArray(str);
        if (parseArray == null || parseArray.size() <= 0) {
            return;
        }
        for (int i = 0; i < parseArray.size(); i++) {
            buildIfsExposure(application, parseArray.getString(i)).withArgPid(str2).withArgNamespace(str3).withArgs(map).commit();
        }
    }

    public dhy buildTanxClickTracking(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhy) ipChange.ipc$dispatch("705b46c9", new Object[]{this, application, str}) : new dhy(str);
    }

    public dia buildTanxImpTracking(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dia) ipChange.ipc$dispatch("9a9ecda6", new Object[]{this, application, str}) : new dia(application, str);
    }

    public dic buildTanxEventTracking(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dic) ipChange.ipc$dispatch("14f28172", new Object[]{this, application, str}) : new dic(application, str);
    }

    public ani buildTanxClickArrayTracking(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ani) ipChange.ipc$dispatch("1ffaaac", new Object[]{this, str}) : new ani(str);
    }

    private com.taobao.alimama.tkcps.b getDefaultTkCpsAd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alimama.tkcps.b) ipChange.ipc$dispatch("c1d39691", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mTkDefaultKey)) {
            this.mTkDefaultKey = Global.getPackageName();
            if (TextUtils.isEmpty(this.mTkDefaultKey)) {
                this.mTkDefaultKey = "default";
            }
        }
        com.taobao.alimama.tkcps.b bVar = this.mTkCpsAdMap.get(this.mTkDefaultKey);
        if (bVar != null) {
            return bVar;
        }
        com.taobao.alimama.tkcps.b a2 = com.taobao.alimama.a.a(this.mTkDefaultKey);
        this.mTkCpsAdMap.put(this.mTkDefaultKey, a2);
        return a2;
    }

    public void parseTkCpsAdParameters(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fa631a", new Object[]{this, str});
            return;
        }
        UserTrackLogs.trackAdLog("Munion_tk_cps_param_parse", "data=" + str);
        getDefaultTkCpsAd().b(str);
    }

    public void setParamsAndinitTaokeCps(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb93cf84", new Object[]{this, str, str2});
        } else {
            getDefaultTkCpsAd();
        }
    }

    public void initTaokeCps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4777cc41", new Object[]{this});
        } else {
            getDefaultTkCpsAd();
        }
    }

    public void filterAndHandleTaokeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740791cb", new Object[]{this, str});
        } else {
            getDefaultTkCpsAd().c(str);
        }
    }

    public void requestTkChannelECheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2fb47", new Object[]{this});
        } else {
            getDefaultTkCpsAd();
        }
    }

    public void commitTaokeInfo(String str, String str2, String str3, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed24909c", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        long j2 = 0;
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        try {
            j2 = Long.parseLong(str3);
        } catch (NumberFormatException unused2) {
        }
        commitTaokeInfo(str, j, j2, z);
    }

    public void commitTaokeInfo(String str, String str2, String str3, boolean z, Map<String, String> map) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605e7f69", new Object[]{this, str, str2, str3, new Boolean(z), map});
            return;
        }
        long j2 = 0;
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        try {
            j2 = Long.parseLong(str3);
        } catch (NumberFormatException unused2) {
        }
        commitTaokeInfo(str, j, j2, z, map);
    }

    public void commitTaokeInfo(String str, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a31b0", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z)});
        } else {
            getDefaultTkCpsAd().a(str, j, j2, z);
        }
    }

    public void commitTaokeInfo(String str, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb813d5", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z), map});
        } else {
            getDefaultTkCpsAd().a(str, j, j2, z, map);
        }
    }

    public void commitCpsInitiativeAction(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8285226f", new Object[]{this, str, str2, str3, map});
        } else {
            getDefaultTkCpsAd().a(str, str2, str3, map);
        }
    }

    public Map<String, String> getCrossTaokeEConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("dcbc0ed1", new Object[]{this}) : getDefaultTkCpsAd().b();
    }

    public void syncCrossTaokeE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398db395", new Object[]{this});
        } else {
            getDefaultTkCpsAd().c();
        }
    }

    public void uploadUDTrack(String str, String str2, String str3, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabea071", new Object[]{this, str, str2, str3, new Boolean(z), map});
            return;
        }
        String a2 = com.taobao.utils.a.a(str, kuh.ALI_TRACK_ID);
        if (TextUtils.isEmpty(a2) || !a2.matches("\\d+_[A-Za-z0-9]{32}")) {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        if (this.mUDAdCommitter == null) {
            this.mUDAdCommitter = new fvp();
        }
        this.mUDAdCommitter.a(str, str2, str3, z, a2, map);
    }
}
