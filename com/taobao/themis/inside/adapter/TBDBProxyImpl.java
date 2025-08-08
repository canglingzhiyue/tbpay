package com.taobao.themis.inside.adapter;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.ali.alidatabasees.CallableStatement;
import com.ali.alidatabasees.DBConfig;
import com.ali.alidatabasees.Database;
import com.ali.alidatabasees.PreparedStatement;
import com.ali.alidatabasees.Property;
import com.ali.alidatabasees.ResultSet;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qpt;
import tb.qpv;
import tb.qpy;
import tb.riy;

/* loaded from: classes9.dex */
public class TBDBProxyImpl implements TMSDBAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBDBProxyImpl";
    private static TBDBProxyImpl d;

    /* renamed from: a  reason: collision with root package name */
    private DBConfig f22428a;
    private Database b;
    private TMSDBAdapter c;

    static {
        kge.a(-1368299227);
        kge.a(-583214100);
        d = new TBDBProxyImpl();
    }

    public TBDBProxyImpl() {
        init();
    }

    public static TBDBProxyImpl getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBDBProxyImpl) ipChange.ipc$dispatch("5e6f51ae", new Object[0]) : d;
    }

    public synchronized void init() {
        Database database;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        TMSLogger.d(TAG, "start init");
        Application applicationContext = ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext();
        File file = new File(applicationContext.getFilesDir() + File.separator + TMSCalendarBridge.namespace);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f22428a = new DBConfig(file.getAbsolutePath() + File.separator + "appinfodatabase.db");
        this.f22428a.setProperty(Property.Key, "themis666");
        this.b = Database.a(this.f22428a);
        if (this.b == null) {
            return;
        }
        if (n.aH()) {
            database = this.b;
            str = TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL;
        } else {
            database = this.b;
            str = TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL_OLD;
        }
        CallableStatement b = database.b(str);
        if (b != null) {
            b.a();
        }
        CallableStatement b2 = this.b.b(TMSDBAdapter.CREATE_PLUGIN_INFO_TABLE_SQL);
        if (b2 != null) {
            b2.a();
        }
        CallableStatement b3 = this.b.b(TMSDBAdapter.CREATE_APP_MANIFEST_TABLE_SQL);
        if (b3 != null) {
            b3.a();
        }
        TMSLogger.d(TAG, "finish init");
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized boolean isReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        } else if (this.c != null) {
            return this.c.isReady();
        } else if (this.b != null) {
            return true;
        } else {
            TMSLogger.d(TAG, "init when check is Ready");
            this.b = Database.a(this.f22428a);
            if (this.b == null) {
                qpv.a("ThemisDbError", "isReady check fail", (JSONObject) null);
            }
            return this.b != null;
        }
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean execSQL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8434252", new Object[]{this, str})).booleanValue();
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.execSQL(str);
        }
        Database database = this.b;
        if (database == null) {
            qpv.a("ThemisDbError", "execSQL when init fail", (JSONObject) null);
            TMSLogger.d(TAG, "execSQL but Db is null");
            return false;
        }
        CallableStatement b = database.b(str);
        return (b == null || b.a() == null) ? false : true;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppInfo(AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("407e8ab9", new Object[]{this, appInfoDao})).booleanValue();
        }
        TMSLogger.b(TAG, "before insertAppInfo");
        String str = "'" + JSON.toJSONString(appInfoDao.appInfo) + "'";
        String str2 = "";
        String str3 = appInfoDao.templateId == null ? str2 : appInfoDao.templateId;
        String str4 = appInfoDao.version == null ? str2 : appInfoDao.version;
        String str5 = appInfoDao.type == null ? str2 : appInfoDao.type;
        if (appInfoDao.extra != null) {
            str2 = appInfoDao.extra;
        }
        return execSQL("REPLACE INTO " + n.T() + "(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, templateId, appInfo, type, extra) VALUES('" + appInfoDao.appId + "', " + appInfoDao.lastUsedTimeStamp + ", " + appInfoDao.lastRequestTimeStamp + ", '" + str4 + "', '" + str3 + "', " + str + ", '" + str5 + "', '" + str2 + "')");
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<AppInfoDao> selectAppInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61b51a3", new Object[]{this, str});
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.selectAppInfo(str);
        }
        Database database = this.b;
        if (database == null) {
            TMSLogger.d(TAG, "selectAppInfo but Db is null");
            qpv.a("ThemisDbError", "selectAppInfo when init fail", (JSONObject) null);
            return null;
        }
        PreparedStatement a2 = database.a(str);
        TMSLogger.b(TAG, "before selectAppInfo");
        if (a2 == null) {
            return null;
        }
        ResultSet b = a2.b();
        TMSLogger.b(TAG, "finish selectAppInfo");
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (b.b()) {
            AppInfoDao appInfoDao = new AppInfoDao();
            String a3 = b.a("appId");
            long b2 = b.b("lastUsedTimeStamp");
            long b3 = b.b("lastRequestTimeStamp");
            String a4 = b.a("version");
            String a5 = b.a(RVConstants.EXTRA_APPINFO);
            String a6 = b.a("templateId");
            String a7 = b.a("type");
            String a8 = b.a("extra");
            appInfoDao.appId = a3;
            appInfoDao.templateId = a6;
            appInfoDao.version = a4;
            appInfoDao.lastRequestTimeStamp = b3;
            appInfoDao.lastUsedTimeStamp = b2;
            appInfoDao.extra = a8;
            appInfoDao.type = a7;
            if (!StringUtils.isEmpty(a5)) {
                appInfoDao.appInfo = (AppModel) JSONObject.parseObject(a5, AppModel.class);
            }
            arrayList.add(appInfoDao);
        }
        return arrayList;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppManifest(AppManifestDao appManifestDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7682f1", new Object[]{this, appManifestDao})).booleanValue();
        }
        TMSLogger.b(TAG, "insertAppManifest");
        String str = "'" + JSON.toJSONString(appManifestDao.getAppManifest()) + "'";
        return execSQL("REPLACE INTO cached_app_manifest2(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, appManifest) VALUES('" + appManifestDao.getAppId() + "', " + appManifestDao.getLastUsedTimeStamp() + ", " + appManifestDao.getLastRequestTimeStamp() + ", '" + (appManifestDao.getVersion() == null ? "" : appManifestDao.getVersion()) + "'," + str + riy.BRACKET_END_STR);
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<AppManifestDao> selectAppManifest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1289f42", new Object[]{this, str});
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.selectAppManifest(str);
        }
        if (this.b == null) {
            TMSLogger.d(TAG, "selectAppManifest but Db is null");
            qpv.a("ThemisDbError", "selectAppManifest when init fail", (JSONObject) null);
            return null;
        }
        TMSLogger.b(TAG, "before selectAppManifest");
        PreparedStatement a2 = this.b.a(str);
        if (a2 == null) {
            return null;
        }
        ResultSet b = a2.b();
        TMSLogger.b(TAG, "after selectAppManifest");
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (b.b()) {
            AppManifestDao appManifestDao = new AppManifestDao();
            String a3 = b.a("appId");
            long b2 = b.b("lastUsedTimeStamp");
            long b3 = b.b("lastRequestTimeStamp");
            String a4 = b.a("version");
            String a5 = b.a("appManifest");
            appManifestDao.setAppId(a3);
            appManifestDao.setVersion(a4);
            appManifestDao.setLastRequestTimeStamp(b3);
            appManifestDao.setLastUsedTimeStamp(b2);
            if (!StringUtils.isEmpty(a5)) {
                appManifestDao.setAppManifest((AppManifest) JSONObject.parseObject(a5, AppManifest.class));
            }
            arrayList.add(appManifestDao);
        }
        return arrayList;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertPluginInfo(PluginInfoDao pluginInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df4b5539", new Object[]{this, pluginInfoDao})).booleanValue();
        }
        String str = "'" + JSON.toJSONString(pluginInfoDao.pluginInfo) + "'";
        String str2 = "";
        String str3 = pluginInfoDao.version == null ? str2 : pluginInfoDao.version;
        String str4 = pluginInfoDao.type == null ? str2 : pluginInfoDao.type;
        if (pluginInfoDao.extra != null) {
            str2 = pluginInfoDao.extra;
        }
        return execSQL("REPLACE INTO cached_plugin_info(pluginId, lastUsedTimeStamp, lastRequestTimeStamp, version, pluginInfo, type, extra) VALUES('" + pluginInfoDao.pluginId + "', " + pluginInfoDao.lastUsedTimeStamp + ", " + pluginInfoDao.lastRequestTimeStamp + ", '" + str3 + "', " + str + ", '" + str4 + "', '" + str2 + "')");
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<PluginInfoDao> selectPluginInfo(String str) {
        PreparedStatement a2;
        ResultSet b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bcec1519", new Object[]{this, str});
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.selectPluginInfo(str);
        }
        Database database = this.b;
        if (database == null || (a2 = database.a(str)) == null || (b = a2.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (b.b()) {
            PluginInfoDao pluginInfoDao = new PluginInfoDao();
            long b2 = b.b("id");
            String a3 = b.a(qpy.PLUGIN_ID);
            long b3 = b.b("lastUsedTimeStamp");
            long b4 = b.b("lastRequestTimeStamp");
            String a4 = b.a("version");
            String a5 = b.a("pluginInfo");
            String a6 = b.a("type");
            String a7 = b.a("extra");
            pluginInfoDao.id = b2;
            pluginInfoDao.pluginId = a3;
            pluginInfoDao.version = a4;
            pluginInfoDao.lastRequestTimeStamp = b4;
            pluginInfoDao.lastUsedTimeStamp = b3;
            pluginInfoDao.extra = a7;
            pluginInfoDao.type = a6;
            if (!StringUtils.isEmpty(a5)) {
                pluginInfoDao.pluginInfo = (PluginModel) JSONObject.parseObject(a5, PluginModel.class);
            }
            arrayList.add(pluginInfoDao);
        }
        return arrayList;
    }
}
