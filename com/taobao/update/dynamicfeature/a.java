package com.taobao.update.dynamicfeature;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.FeatureUpdateData2;
import com.taobao.update.framework.d;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.req;
import tb.rfx;
import tb.rfy;
import tb.rfz;
import tb.rge;
import tb.rgf;
import tb.rgg;
import tb.rgq;
import tb.rgr;
import tb.rgs;

/* loaded from: classes9.dex */
public class a extends d implements rfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean c;

    /* renamed from: a  reason: collision with root package name */
    private rfz.a f23398a;
    private SharedPreferences b;
    private rgs d;
    private rge e;

    /* renamed from: com.taobao.update.dynamicfeature.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1008a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f23400a;

        static {
            kge.a(-1840458717);
            f23400a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("306d9f81", new Object[0]) : f23400a;
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1621086737) {
            super.init((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92b6805", new Object[]{aVar, str});
        } else {
            aVar.b(str);
        }
    }

    static {
        kge.a(-1265738195);
        kge.a(-108454860);
        c = false;
    }

    private a() {
        this.d = new rgr();
        this.e = rgf.getLog(a.class, (rge) null);
        rfy.getInstance().registerListener(rfx.DYNAMICUPDATE, this);
    }

    public static a instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a3ed78cd", new Object[0]) : C1008a.a();
    }

    @Override // com.taobao.update.framework.d
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.k) {
        } else {
            super.init(context);
            this.b = context.getSharedPreferences(rfx.DYNAMICUPDATE, 0);
            this.k = true;
        }
    }

    @Override // tb.rfz
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
            return;
        }
        if (!this.k) {
            init(rfy.getInstance().getApplication());
        }
        String versionName = rgq.getVersionName();
        try {
            final String string = this.b.getString("currentversion", "");
            if (!string.equals(versionName)) {
                this.b.edit().putString("currentversion", versionName).commit();
                if (!TextUtils.isEmpty(string)) {
                    ((req) com.taobao.update.framework.a.getInstance(req.class)).execute(new Runnable() { // from class: com.taobao.update.dynamicfeature.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.a(a.this, string);
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rge rgeVar = this.e;
        rgeVar.w(str + ":" + jSONObject.toJSONString());
        if (c) {
            this.e.w("dynamic update has finished  please reboot and retry");
            return;
        }
        SharedPreferences sharedPreferences = rfy.sContext.getSharedPreferences("dynamic_features_config", 0);
        if (sharedPreferences.getBoolean("disable_featureupdate_" + rgq.getVersionName(), false)) {
            this.e.w("DynamicFeatureUpdater is disabled");
        } else if (jSONObject != null && jSONObject.containsKey("baseVersion") && !versionName.equals(jSONObject.getString("baseVersion"))) {
            this.e.w("DynamicFeatureUpdater is mismatch");
        } else if (a(jSONObject)) {
            FeatureUpdateData2 b = b(jSONObject);
            if (a(b)) {
                if (!TextUtils.equals(rfx.SCAN, str)) {
                    return;
                }
                c.getInstance().showToast("所有的版本已经部署过!");
                return;
            }
            a(b, str);
        } else if (jSONObject.containsKey("rollback") && Boolean.parseBoolean(jSONObject.getString("rollback"))) {
            rollBack();
            c = true;
        } else {
            this.e.w("doFeatureUpdate");
            b(jSONObject, str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Application application = rfy.getInstance().getApplication();
            SharedPreferences sharedPreferences = application.getSharedPreferences("dynamicdeploy_features_" + str, 0);
            Application application2 = rfy.getInstance().getApplication();
            SharedPreferences sharedPreferences2 = application2.getSharedPreferences("dynamicdeploy_features_bak-" + str, 0);
            sharedPreferences.edit().clear().commit();
            sharedPreferences2.edit().clear().commit();
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : !jSONObject.containsKey("featureUpdateVersion") && !jSONObject.containsKey("rollback") && jSONObject.containsKey("features");
    }

    private FeatureUpdateData2 b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureUpdateData2) ipChange.ipc$dispatch("88d5592a", new Object[]{this, jSONObject});
        }
        FeatureUpdateData2 featureUpdateData2 = new FeatureUpdateData2();
        if (jSONObject.containsKey("features")) {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            for (int i = 0; i < jSONArray.size(); i++) {
                FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo = new FeatureUpdateData2.UpdateFeatureInfo();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                updateFeatureInfo.featureUpdateVersion = jSONObject2.containsKey("featureUpdateVersion") ? jSONObject2.getString("featureUpdateVersion") : "";
                updateFeatureInfo.httpsUrl = jSONObject2.containsKey("httpsUrl") ? jSONObject2.getString("httpsUrl") : "";
                updateFeatureInfo.url = jSONObject2.containsKey("url") ? jSONObject2.getString("url") : "";
                updateFeatureInfo.md5 = jSONObject2.containsKey("md5") ? jSONObject2.getString("md5") : "";
                updateFeatureInfo.rollback = jSONObject2.containsKey("rollback") ? jSONObject2.getBoolean("rollback").booleanValue() : false;
                updateFeatureInfo.size = jSONObject2.containsKey("fileSize") ? jSONObject2.getLong("fileSize").longValue() : 0L;
                updateFeatureInfo.beta = jSONObject2.containsKey("beta") ? jSONObject2.getBoolean("beta").booleanValue() : false;
                updateFeatureInfo.updateStrategy = jSONObject2.containsKey("updateStrategy") ? jSONObject2.getInteger("updateStrategy").intValue() : 0;
                if (jSONObject2.containsKey("updateFeatures")) {
                    this.e.w("containsKey updateFeatures");
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("updateFeatures");
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        rge rgeVar = this.e;
                        rgeVar.w("jsonObject:" + jSONObject3);
                        FeatureUpdateData.FeatureInfo featureInfo = new FeatureUpdateData.FeatureInfo();
                        featureInfo.featureName = jSONObject3.containsKey(com.taobao.android.behavix.feature.a.FEATURE_NAME) ? jSONObject3.getString(com.taobao.android.behavix.feature.a.FEATURE_NAME) : "";
                        featureInfo.version = jSONObject3.containsKey("version") ? jSONObject3.getString("version") : "";
                        updateFeatureInfo.features.add(featureInfo);
                    }
                }
                featureUpdateData2.updateFeatures.add(updateFeatureInfo);
            }
        }
        return featureUpdateData2;
    }

    private FeatureUpdateData c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureUpdateData) ipChange.ipc$dispatch("16bc123b", new Object[]{this, jSONObject});
        }
        FeatureUpdateData featureUpdateData = new FeatureUpdateData();
        if (jSONObject.containsKey("updateFeatures")) {
            JSONArray jSONArray = jSONObject.getJSONArray("updateFeatures");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                FeatureUpdateData.FeatureInfo featureInfo = new FeatureUpdateData.FeatureInfo();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String str = "";
                featureInfo.featureName = jSONObject2.containsKey(com.taobao.android.behavix.feature.a.FEATURE_NAME) ? jSONObject2.getString(com.taobao.android.behavix.feature.a.FEATURE_NAME) : str;
                if (jSONObject2.containsKey("version")) {
                    str = jSONObject2.getString("version");
                }
                featureInfo.version = str;
                featureInfo.appVersion = jSONObject2.containsKey("appVersion") ? jSONObject2.getString("appVersion") : rgq.getVersionName();
                arrayList.add(featureInfo);
            }
            featureUpdateData.updateFeatures = arrayList;
        }
        if (jSONObject.containsKey("appDeployVersion")) {
            featureUpdateData.appDeployVersion = jSONObject.getString("appDeployVersion");
        }
        if (jSONObject.containsKey("featureUpdateVersion")) {
            featureUpdateData.featureUpdateVersion = jSONObject.getString("featureUpdateVersion");
        }
        if (jSONObject.containsKey("md5")) {
            featureUpdateData.md5 = jSONObject.getString("md5");
        }
        if (jSONObject.containsKey("beta")) {
            featureUpdateData.beta = jSONObject.getString("beta");
        }
        if (jSONObject.containsKey("fileSize")) {
            featureUpdateData.size = Long.parseLong(jSONObject.getString("fileSize"));
        }
        if (jSONObject.containsKey("url")) {
            featureUpdateData.url = jSONObject.getString("url");
        }
        if (jSONObject.containsKey("httpsUrl")) {
            featureUpdateData.httpsUrl = jSONObject.getString("httpsUrl");
        }
        if (jSONObject.containsKey("baseVersion")) {
            featureUpdateData.baseVersion = jSONObject.getString("baseVersion");
        }
        return featureUpdateData;
    }

    private void a(FeatureUpdateData2 featureUpdateData2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abd13b5", new Object[]{this, featureUpdateData2, str});
            return;
        }
        for (FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo : featureUpdateData2.updateFeatures) {
            if (updateFeatureInfo.deployed) {
                rge rgeVar = this.e;
                rgeVar.w("featureVersion :" + updateFeatureInfo.featureUpdateVersion + " has deployed");
                if (str.equals(rfx.SCAN)) {
                    c.getInstance().showToast("该版本已经扫码部署过，清除数据重新扫码!");
                }
            } else if (b(updateFeatureInfo.features) && new rgr().compare(a(updateFeatureInfo.features), updateFeatureInfo.featureUpdateVersion) > 0) {
                rge rgeVar2 = this.e;
                rgeVar2.w("has featureVersion :" + a(updateFeatureInfo.features) + " is higher than " + updateFeatureInfo.featureUpdateVersion);
            } else {
                rge rgeVar3 = this.e;
                rgeVar3.w("installupdatefeature:" + updateFeatureInfo);
                rgg.stat(true, "revupdate", 0L, 0, "", String.valueOf(updateFeatureInfo.featureUpdateVersion));
                a(updateFeatureInfo, str);
            }
        }
    }

    private String a(List<FeatureUpdateData.FeatureInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        for (FeatureUpdateData.FeatureInfo featureInfo : list) {
            if (!TextUtils.isEmpty(com.android.tools.bundleInfo.d.a().a(featureInfo.featureName))) {
                return com.android.tools.bundleInfo.d.a().a(featureInfo.featureName);
            }
        }
        return "";
    }

    private boolean b(List<FeatureUpdateData.FeatureInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        for (FeatureUpdateData.FeatureInfo featureInfo : list) {
            if (com.android.tools.bundleInfo.d.a().c(featureInfo.featureName)) {
                return true;
            }
        }
        return false;
    }

    private void a(FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97b34de", new Object[]{this, updateFeatureInfo, str});
            return;
        }
        b bVar = new b();
        bVar.newUpdate = true;
        bVar.context = rfy.sContext;
        FeatureUpdateData featureUpdateData = new FeatureUpdateData();
        featureUpdateData.featureUpdateVersion = updateFeatureInfo.featureUpdateVersion;
        featureUpdateData.beta = String.valueOf(updateFeatureInfo.beta);
        featureUpdateData.httpsUrl = updateFeatureInfo.httpsUrl;
        featureUpdateData.size = updateFeatureInfo.size;
        featureUpdateData.url = updateFeatureInfo.url;
        featureUpdateData.md5 = updateFeatureInfo.md5;
        featureUpdateData.updateFeatures = updateFeatureInfo.features;
        bVar.featureUpdateData = featureUpdateData;
        c.getInstance().execute(bVar, str);
    }

    private boolean a(FeatureUpdateData2 featureUpdateData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4b41eaf", new Object[]{this, featureUpdateData2})).booleanValue();
        }
        boolean z = true;
        for (FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo : featureUpdateData2.updateFeatures) {
            if (a(updateFeatureInfo)) {
                rollBack(updateFeatureInfo.featureUpdateVersion);
                updateFeatureInfo.deployed = true;
            } else if (a(updateFeatureInfo.featureUpdateVersion) && !updateFeatureInfo.rollback) {
                updateFeatureInfo.deployed = true;
            } else {
                updateFeatureInfo.deployed = false;
                z = false;
            }
        }
        return z;
    }

    private boolean a(FeatureUpdateData2.UpdateFeatureInfo updateFeatureInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29b06818", new Object[]{this, updateFeatureInfo})).booleanValue() : updateFeatureInfo.rollback;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : com.android.tools.bundleInfo.d.a().d(str);
    }

    private void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493da631", new Object[]{this, jSONObject, str});
            return;
        }
        FeatureUpdateData c2 = c(jSONObject);
        if (a(c2)) {
            if (str.equals(rfx.SCAN)) {
                c.getInstance().showToast("该版本已经部署过!");
            }
            rge rgeVar = this.e;
            rgeVar.w(c2.featureUpdateVersion + " has deployed!");
            return;
        }
        String string = this.b.getString("currentversion", "");
        if (!string.equals(rgq.getVersionName())) {
            this.b.edit().clear().commit();
        }
        boolean parseBoolean = Boolean.parseBoolean(this.b.getString("beta", ""));
        String string2 = this.b.getString("featureupdateversion", "");
        String string3 = this.b.getString("from", "");
        if (!str.equals(rfx.SCAN) && string.equals(rgq.getVersionName()) && parseBoolean && this.d.compare(string2, c2.featureUpdateVersion) > 0) {
            return;
        }
        if (string.equals(rgq.getVersionName()) && string3.equals(rfx.SCAN)) {
            return;
        }
        rgg.stat(true, "revupdate", 0L, 0, "", String.valueOf(c2.featureUpdateVersion));
        b bVar = new b();
        bVar.context = rfy.sContext;
        bVar.featureUpdateData = c2;
        c.getInstance().execute(bVar, str);
        if (bVar.success) {
            this.f23398a.patchSuccess();
            this.b.edit().putString("currentversion", rgq.getVersionName()).putString("featureupdateversion", c2.featureUpdateVersion).putString("beta", c2.beta).putString("from", str).commit();
            c = true;
            return;
        }
        this.f23398a.patchFailed(bVar.errorMsg);
    }

    private boolean a(FeatureUpdateData featureUpdateData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5d462d7", new Object[]{this, featureUpdateData})).booleanValue() : com.android.tools.bundleInfo.c.a().b(rgq.getVersionName()) != null && com.android.tools.bundleInfo.c.a().b(rgq.getVersionName()).equals(featureUpdateData.featureUpdateVersion);
    }

    public void rollBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6fd295", new Object[]{this, str});
            return;
        }
        com.android.tools.bundleInfo.d.a().b(str);
        c.getInstance().rollBack(str);
    }

    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
        } else {
            com.android.tools.bundleInfo.c.a().b();
        }
    }

    @Override // tb.rfz
    public void patchProcessListener(rfz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0ecef", new Object[]{this, aVar});
        } else {
            this.f23398a = aVar;
        }
    }
}
