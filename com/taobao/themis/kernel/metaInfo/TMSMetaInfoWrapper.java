package com.taobao.themis.kernel.metaInfo;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;
import tb.kge;

/* loaded from: classes9.dex */
public final class TMSMetaInfoWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AppModel f22542a;
    private AppManifest b;
    private Type c;

    /* loaded from: classes9.dex */
    public enum Type {
        AppInfo,
        Manifest
    }

    static {
        kge.a(-2043745690);
    }

    public TMSMetaInfoWrapper(AppModel appInfo) {
        q.d(appInfo, "appInfo");
        this.c = Type.AppInfo;
        this.f22542a = appInfo;
    }

    public TMSMetaInfoWrapper(AppManifest appManifest, i.a aVar) {
        q.d(appManifest, "appManifest");
        this.c = Type.Manifest;
        this.b = a(appManifest, aVar);
    }

    private final AppManifest a(AppManifest appManifest, i.a aVar) {
        String str;
        List list;
        int i;
        JSON json;
        String str2 = "path";
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (AppManifest) ipChange.ipc$dispatch("a9f2524b", new Object[]{this, appManifest, aVar});
        }
        if (aVar == null || !n.bg()) {
            return appManifest;
        }
        List b = p.b("${navigationUrl}", "${appId}");
        TMSMetaInfoWrapper$transformManifest$valueParser$1 tMSMetaInfoWrapper$transformManifest$valueParser$1 = new TMSMetaInfoWrapper$transformManifest$valueParser$1(aVar);
        Object variables = appManifest.getVariables();
        if (!(variables instanceof JSONArray)) {
            variables = null;
        }
        JSONArray jSONArray = (JSONArray) variables;
        if (jSONArray != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                Object json2 = JSONObject.toJSON(appManifest);
                if (json2 instanceof JSONObject) {
                    for (Object obj : jSONArray) {
                        try {
                        } catch (Exception e) {
                            e = e;
                            str = str2;
                            list = b;
                        }
                        if (obj instanceof JSONObject) {
                            String string = ((JSONObject) obj).getString(str2);
                            String value = ((JSONObject) obj).getString("value");
                            if (!b.contains(value)) {
                                TMSLogger.d("TMSMetaInfoWrapper", "transform manifest failed, value is not allowed: " + value);
                            } else {
                                JSON json3 = (JSON) json2;
                                try {
                                    Regex regex = new Regex("\\[|\\]|\\.|\\$");
                                    q.b(string, str2);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : regex.split(string, i2)) {
                                        if (((String) obj2).length() > 0) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    int size = arrayList2.size() - 1;
                                    int i3 = 0;
                                    while (i3 < size) {
                                        try {
                                            String str3 = (String) arrayList2.get(i3);
                                            str = str2;
                                            try {
                                                list = b;
                                                if (json3 instanceof JSONArray) {
                                                    i = size;
                                                    try {
                                                        Integer d = kotlin.text.n.d(kotlin.text.n.a(str3, '[', ']'));
                                                        if (d != null && d.intValue() >= 0 && d.intValue() < ((JSONArray) json3).size()) {
                                                            Object obj3 = ((JSONArray) json3).get(d.intValue());
                                                            if (obj3 == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSON");
                                                            }
                                                            json = (JSON) obj3;
                                                        }
                                                        str2 = str;
                                                        b = list;
                                                        i2 = 0;
                                                        break;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        i2 = 0;
                                                        TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed", e);
                                                        str2 = str;
                                                        b = list;
                                                    }
                                                } else {
                                                    i = size;
                                                    if (!(json3 instanceof JSONObject)) {
                                                        continue;
                                                        i3++;
                                                        size = i;
                                                        str2 = str;
                                                        b = list;
                                                    } else {
                                                        Object obj4 = ((JSONObject) json3).get(str3);
                                                        if (obj4 == null) {
                                                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSON");
                                                        }
                                                        json = (JSON) obj4;
                                                    }
                                                }
                                                json3 = json;
                                                i3++;
                                                size = i;
                                                str2 = str;
                                                b = list;
                                            } catch (Exception e3) {
                                                e = e3;
                                                list = b;
                                                i2 = 0;
                                                TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed", e);
                                                str2 = str;
                                                b = list;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            str = str2;
                                        }
                                    }
                                    str = str2;
                                    list = b;
                                    if (!arrayList2.isEmpty()) {
                                        String str4 = (String) arrayList2.get(arrayList2.size() - 1);
                                        if (json3 instanceof JSONArray) {
                                            try {
                                                char[] cArr = new char[2];
                                                i2 = 0;
                                                try {
                                                    cArr[0] = '[';
                                                    try {
                                                        cArr[1] = ']';
                                                        Integer d2 = kotlin.text.n.d(kotlin.text.n.a(str4, cArr));
                                                        if (d2 != null && d2.intValue() >= 0 && d2.intValue() < ((JSONArray) json3).size() && (((JSONArray) json3).get(d2.intValue()) instanceof String)) {
                                                            int intValue = d2.intValue();
                                                            q.b(value, "value");
                                                            ((JSONArray) json3).set(intValue, tMSMetaInfoWrapper$transformManifest$valueParser$1.mo2421invoke((TMSMetaInfoWrapper$transformManifest$valueParser$1) value));
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed", e);
                                                        str2 = str;
                                                        b = list;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed", e);
                                                    str2 = str;
                                                    b = list;
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                i2 = 0;
                                                TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed", e);
                                                str2 = str;
                                                b = list;
                                            }
                                        } else {
                                            i2 = 0;
                                            if (json3 instanceof JSONObject) {
                                                if (((JSONObject) json3).get(str4) instanceof String) {
                                                    q.b(value, "value");
                                                    ((Map) json3).put(str4, tMSMetaInfoWrapper$transformManifest$valueParser$1.mo2421invoke((TMSMetaInfoWrapper$transformManifest$valueParser$1) value));
                                                }
                                            } else {
                                                TMSLogger.d("TMSMetaInfoWrapper", "transform manifest failed, currentValue is not JSONObject or JSONArray");
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    str = str2;
                                    list = b;
                                }
                            }
                        } else {
                            str = str2;
                            list = b;
                        }
                        str2 = str;
                        b = list;
                    }
                    TMSLogger.a("TMSMetaInfoWrapper", "transform manifest cost " + (SystemClock.uptimeMillis() - uptimeMillis));
                    Object parseObject = JSONObject.parseObject(json2.toString(), AppManifest.class);
                    q.b(parseObject, "JSONObject.parseObject(j… AppManifest::class.java)");
                    return (AppManifest) parseObject;
                }
            } catch (Exception e9) {
                TMSLogger.b("TMSMetaInfoWrapper", "transform manifest failed", e9);
            }
        }
        return appManifest;
    }

    public final String a() {
        JSONObject bizInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            return appModel.getAppId();
        }
        AppManifest appManifest = this.b;
        q.a(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo != null && (bizInfo = appInfo.getBizInfo()) != null) {
            return bizInfo.getString("id");
        }
        return null;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                return null;
            }
            return appInfoModel.getDeveloperVersion();
        }
        AppManifest appManifest = this.b;
        q.a(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null) {
            return null;
        }
        return appInfo.getVersion();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String str = null;
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            String alias = appInfoModel != null ? appInfoModel.getAlias() : null;
            if (!StringUtils.isEmpty(alias)) {
                return alias;
            }
            AppModel appModel2 = this.f22542a;
            q.a(appModel2);
            AppInfoModel appInfoModel2 = appModel2.getAppInfoModel();
            if (appInfoModel2 != null) {
                str = appInfoModel2.getName();
            }
            return str;
        }
        AppManifest appManifest = this.b;
        q.a(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null) {
            return null;
        }
        return appInfo.getName();
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                return null;
            }
            return appInfoModel.getLogo();
        }
        AppManifest appManifest = this.b;
        q.a(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo == null) {
            return null;
        }
        return appInfo.getLogo();
    }

    public final String e() {
        JSONObject bizInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel == null) {
                return null;
            }
            return appInfoModel.getDesc();
        }
        AppManifest appManifest = this.b;
        q.a(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        if (appInfo != null && (bizInfo = appInfo.getBizInfo()) != null) {
            return bizInfo.getString("appDesc");
        }
        return null;
    }

    public final String h() {
        AppManifest.AppInfo appInfo;
        JSONObject bizInfo;
        AppInfoModel appInfoModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            if (appModel != null && (appInfoModel = appModel.getAppInfoModel()) != null) {
                return appInfoModel.getAppKey();
            }
            return null;
        }
        AppManifest appManifest = this.b;
        if (appManifest != null && (appInfo = appManifest.getAppInfo()) != null && (bizInfo = appInfo.getBizInfo()) != null) {
            return bizInfo.getString("appKey");
        }
        return null;
    }

    public final boolean f() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            JSONObject permissionControl = appModel.getPermissionControl();
            if (permissionControl != null && (bool = permissionControl.getBoolean("needAuth")) != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public final boolean g() {
        Boolean bool;
        Boolean bool2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.c != Type.AppInfo) {
            return false;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        JSONObject permissionControl = appModel.getPermissionControl();
        if (permissionControl != null && (bool2 = permissionControl.getBoolean("needCheck")) != null) {
            return bool2.booleanValue();
        }
        AppModel appModel2 = this.f22542a;
        q.a(appModel2);
        JSONObject extendInfos = appModel2.getExtendInfos();
        if (extendInfos != null && (bool = extendInfos.getBoolean("needCheck")) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            JSONObject extendInfos = appModel.getExtendInfos();
            if (extendInfos != null) {
                return extendInfos.getString("belongBiz");
            }
        }
        return null;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            JSONObject extendInfos = appModel.getExtendInfos();
            if (extendInfos != null) {
                return extendInfos.getString("ascriptionType");
            }
        }
        return null;
    }

    public final PermissionModel k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionModel) ipChange.ipc$dispatch("2916cbab", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        return appModel.getPermissionModel();
    }

    public final JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        return appModel.getPermissionControl();
    }

    public final JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        return appModel.getExtendInfos();
    }

    public final TemplateConfigModel n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateConfigModel) ipChange.ipc$dispatch("5ccf3715", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            q.a(appModel);
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel != null) {
                return appInfoModel.getTemplateConfig();
            }
        }
        return null;
    }

    public final JSONObject o() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        String str = null;
        if (this.c == Type.AppInfo) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            AppModel appModel = this.f22542a;
            q.a(appModel);
            jSONObject3.put((JSONObject) "appId", appModel.getAppId());
            AppModel appModel2 = this.f22542a;
            q.a(appModel2);
            AppInfoModel appInfoModel = appModel2.getAppInfoModel();
            jSONObject3.put((JSONObject) "appName", appInfoModel != null ? appInfoModel.getName() : null);
            AppModel appModel3 = this.f22542a;
            q.a(appModel3);
            AppInfoModel appInfoModel2 = appModel3.getAppInfoModel();
            jSONObject3.put((JSONObject) "appVersion", appInfoModel2 != null ? appInfoModel2.getDeveloperVersion() : null);
            AppModel appModel4 = this.f22542a;
            q.a(appModel4);
            JSONObject extendInfos = appModel4.getExtendInfos();
            jSONObject3.put((JSONObject) "engineType", extendInfos != null ? extendInfos.getString("engineType") : null);
            AppModel appModel5 = this.f22542a;
            q.a(appModel5);
            AppInfoModel appInfoModel3 = appModel5.getAppInfoModel();
            jSONObject3.put((JSONObject) "packageSize", appInfoModel3 != null ? appInfoModel3.getPackageSize() : null);
            AppModel appModel6 = this.f22542a;
            q.a(appModel6);
            AppInfoModel appInfoModel4 = appModel6.getAppInfoModel();
            if (appInfoModel4 != null) {
                str = appInfoModel4.getPackageUrl();
            }
            jSONObject3.put((JSONObject) "packageUrl", str);
            AppModel appModel7 = this.f22542a;
            q.a(appModel7);
            if (appModel7.getExtendInfos() != null) {
                AppModel appModel8 = this.f22542a;
                q.a(appModel8);
                Object clone = appModel8.getExtendInfos().clone();
                if (clone == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                jSONObject = (JSONObject) clone;
                jSONObject.remove("chargeInfo");
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject3.put((JSONObject) MspGlobalDefine.EXTENDINFO, (String) jSONObject);
            return jSONObject2;
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        AppManifest appManifest = this.b;
        q.a(appManifest);
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        jSONObject5.put((JSONObject) "appId", appInfo != null ? appInfo.getAppId() : null);
        AppManifest appManifest2 = this.b;
        q.a(appManifest2);
        AppManifest.AppInfo appInfo2 = appManifest2.getAppInfo();
        jSONObject5.put((JSONObject) "appName", appInfo2 != null ? appInfo2.getName() : null);
        AppManifest appManifest3 = this.b;
        q.a(appManifest3);
        AppManifest.AppInfo appInfo3 = appManifest3.getAppInfo();
        if (appInfo3 != null) {
            str = appInfo3.getVersion();
        }
        jSONObject5.put((JSONObject) "appVersion", str);
        return jSONObject4;
    }

    public final List<PluginModel> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4f19870", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        AppInfoModel appInfoModel = appModel.getAppInfoModel();
        q.b(appInfoModel, "mAppInfo!!.appInfoModel");
        return appInfoModel.getPlugins();
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        AppInfoModel appInfoModel = appModel.getAppInfoModel();
        q.b(appInfoModel, "mAppInfo!!.appInfoModel");
        return appInfoModel.getPackageUrl();
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        AppInfoModel appInfoModel = appModel.getAppInfoModel();
        q.b(appInfoModel, "mAppInfo!!.appInfoModel");
        return appInfoModel.getBytePackageUrl();
    }

    public final JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this});
        }
        if (this.c != Type.AppInfo) {
            return null;
        }
        AppModel appModel = this.f22542a;
        q.a(appModel);
        AppInfoModel appInfoModel = appModel.getAppInfoModel();
        q.b(appInfoModel, "mAppInfo!!.appInfoModel");
        return appInfoModel.getByteSubPackages();
    }

    public final List<AppManifest.Page> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9378f1ec", new Object[]{this});
        }
        if (this.c == Type.Manifest) {
            AppManifest appManifest = this.b;
            q.a(appManifest);
            AppManifest.Container container = appManifest.getContainer();
            if (container != null) {
                return container.getPages();
            }
        }
        return null;
    }

    public final AppManifest v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppManifest) ipChange.ipc$dispatch("d6c61978", new Object[]{this}) : this.b;
    }

    public final AppModel z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppModel) ipChange.ipc$dispatch("36fb82b8", new Object[]{this}) : this.f22542a;
    }

    public final String w() {
        JSONObject extendInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        AppModel appModel = this.f22542a;
        if (appModel != null && (extendInfos = appModel.getExtendInfos()) != null) {
            return extendInfos.getString("deviceOrientation");
        }
        return null;
    }

    public final String x() {
        AppManifest.AppInfo appInfo;
        JSONObject extendInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        if (this.c == Type.AppInfo) {
            AppModel appModel = this.f22542a;
            String string = (appModel == null || (extendInfos = appModel.getExtendInfos()) == null) ? null : extendInfos.getString("frameTempType");
            if (string == null || string.hashCode() != -236637910 || !string.equals("pubArea")) {
                return null;
            }
            return "TinyApp";
        }
        AppManifest appManifest = this.b;
        if (appManifest != null && (appInfo = appManifest.getAppInfo()) != null) {
            return appInfo.getBizType();
        }
        return null;
    }
}
