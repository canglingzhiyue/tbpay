package com.taobao.themis.inside.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import com.taobao.themis.kernel.utils.n;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qpt;
import tb.qpy;
import tb.riy;

/* loaded from: classes9.dex */
public class DefaultDBAdapter implements TMSDBAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f22424a = new a(((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext());

    static {
        kge.a(1862956941);
        kge.a(-583214100);
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized boolean isReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        return this.f22424a.getWritableDatabase() != null;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized boolean execSQL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8434252", new Object[]{this, str})).booleanValue();
        }
        if (this.f22424a.getWritableDatabase() != null) {
            try {
                this.f22424a.getWritableDatabase().execSQL(str);
                this.f22424a.close();
                return true;
            } catch (Exception e) {
                TMSLogger.b(":DefaultDBAdapter", "DefDBProxy execSQL error", e);
                this.f22424a.close();
            }
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppInfo(AppInfoDao appInfoDao) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("407e8ab9", new Object[]{this, appInfoDao})).booleanValue();
        }
        String jSONString = JSON.toJSONString(appInfoDao.appInfo);
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(((IEnvironmentService) qpt.b(IEnvironmentService.class)).getApplicationContext());
            if (securityGuardManager != null && (dynamicDataEncryptComp = securityGuardManager.getDynamicDataEncryptComp()) != null) {
                jSONString = dynamicDataEncryptComp.dynamicEncryptDDp(jSONString);
            }
        } catch (Exception e) {
            TMSLogger.b("CacheUtils", "put security cache exception", e);
        }
        String str = "";
        String str2 = appInfoDao.version == null ? str : appInfoDao.version;
        String str3 = appInfoDao.templateId == null ? str : appInfoDao.templateId;
        String str4 = appInfoDao.type == null ? str : appInfoDao.type;
        if (appInfoDao.extra != null) {
            str = appInfoDao.extra;
        }
        return execSQL("REPLACE INTO " + n.T() + "(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, templateId, appInfo, type, extra) VALUES('" + appInfoDao.appId + "', " + appInfoDao.lastUsedTimeStamp + ", " + appInfoDao.lastRequestTimeStamp + ", '" + str2 + "', '" + str3 + "', '" + jSONString + "', '" + str4 + "', '" + str + "')");
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized List<AppInfoDao> selectAppInfo(String str) {
        Cursor cursor;
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61b51a3", new Object[]{this, str});
        }
        if (this.f22424a.getReadableDatabase() != null) {
            try {
                cursor = this.f22424a.getReadableDatabase().rawQuery(str, null);
            } catch (Exception e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                this.f22424a.close();
                throw th;
            }
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        AppInfoDao appInfoDao = new AppInfoDao();
                        cursor.move(0);
                        appInfoDao.appId = cursor.getString(cursor.getColumnIndex("appId"));
                        appInfoDao.lastUsedTimeStamp = cursor.getLong(cursor.getColumnIndex("lastUsedTimeStamp"));
                        appInfoDao.lastRequestTimeStamp = cursor.getLong(cursor.getColumnIndex("lastRequestTimeStamp"));
                        appInfoDao.version = cursor.getString(cursor.getColumnIndex("version"));
                        appInfoDao.templateId = cursor.getString(cursor.getColumnIndex("templateId"));
                        String string = cursor.getString(cursor.getColumnIndex(RVConstants.EXTRA_APPINFO));
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(((IEnvironmentService) qpt.b(IEnvironmentService.class)).getApplicationContext());
                                if (securityGuardManager != null && (dynamicDataEncryptComp = securityGuardManager.getDynamicDataEncryptComp()) != null) {
                                    string = dynamicDataEncryptComp.dynamicDecryptDDp(string);
                                }
                            } catch (Exception e2) {
                                TMSLogger.b(":DefaultDBAdapter", "put security cache exception", e2);
                            }
                            appInfoDao.appInfo = (AppModel) JSONObject.parseObject(string, AppModel.class);
                        }
                        appInfoDao.type = cursor.getString(cursor.getColumnIndex("type"));
                        appInfoDao.extra = cursor.getString(cursor.getColumnIndex("extra"));
                        arrayList.add(appInfoDao);
                    }
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    this.f22424a.close();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    this.f22424a.close();
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                TMSLogger.b(":DefaultDBAdapter", "DefDBProxy querySQL error", e);
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                this.f22424a.close();
                return null;
            }
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppManifest(AppManifestDao appManifestDao) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7682f1", new Object[]{this, appManifestDao})).booleanValue();
        }
        String jSONString = JSON.toJSONString(appManifestDao.getAppManifest());
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(((IEnvironmentService) qpt.b(IEnvironmentService.class)).getApplicationContext());
            if (securityGuardManager != null && (dynamicDataEncryptComp = securityGuardManager.getDynamicDataEncryptComp()) != null) {
                jSONString = dynamicDataEncryptComp.dynamicEncryptDDp(jSONString);
            }
        } catch (Exception e) {
            TMSLogger.b("CacheUtils", "put security cache exception", e);
        }
        String version = appManifestDao.getVersion() == null ? "" : appManifestDao.getVersion();
        return execSQL("REPLACE INTO cached_app_manifest2(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, appManifest) VALUES('" + appManifestDao.getAppId() + "', " + appManifestDao.getLastUsedTimeStamp() + ", " + appManifestDao.getLastRequestTimeStamp() + ", '" + version + "', " + jSONString + riy.BRACKET_END_STR);
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<AppManifestDao> selectAppManifest(String str) {
        Cursor cursor;
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1289f42", new Object[]{this, str});
        }
        if (this.f22424a.getReadableDatabase() != null) {
            try {
                cursor = this.f22424a.getReadableDatabase().rawQuery(str, null);
            } catch (Exception e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                this.f22424a.close();
                throw th;
            }
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        AppManifestDao appManifestDao = new AppManifestDao();
                        cursor.move(0);
                        appManifestDao.setAppId(cursor.getString(cursor.getColumnIndex("appId")));
                        appManifestDao.setLastUsedTimeStamp(cursor.getLong(cursor.getColumnIndex("lastUsedTimeStamp")));
                        appManifestDao.setLastRequestTimeStamp(cursor.getLong(cursor.getColumnIndex("lastRequestTimeStamp")));
                        appManifestDao.setVersion(cursor.getString(cursor.getColumnIndex("version")));
                        String string = cursor.getString(cursor.getColumnIndex("appManifest"));
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(((IEnvironmentService) qpt.b(IEnvironmentService.class)).getApplicationContext());
                                if (securityGuardManager != null && (dynamicDataEncryptComp = securityGuardManager.getDynamicDataEncryptComp()) != null) {
                                    string = dynamicDataEncryptComp.dynamicDecryptDDp(string);
                                }
                            } catch (Exception e2) {
                                TMSLogger.b(":DefaultDBAdapter", "put security cache exception", e2);
                            }
                            appManifestDao.setAppManifest((AppManifest) JSONObject.parseObject(string, AppManifest.class));
                        }
                        arrayList.add(appManifestDao);
                    }
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    this.f22424a.close();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    this.f22424a.close();
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                TMSLogger.b(":DefaultDBAdapter", "DefDBProxy querySQL error", e);
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                this.f22424a.close();
                return null;
            }
        }
        return null;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<PluginInfoDao> selectPluginInfo(String str) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bcec1519", new Object[]{this, str});
        }
        try {
            if (this.f22424a.getReadableDatabase() != null) {
                try {
                    cursor = this.f22424a.getReadableDatabase().rawQuery(str, null);
                } catch (Exception e) {
                    e = e;
                    cursor = null;
                } catch (Throwable th) {
                    th = th;
                    str = 0;
                    if (str != 0 && !str.isClosed()) {
                        str.close();
                    }
                    this.f22424a.close();
                    throw th;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        PluginInfoDao pluginInfoDao = new PluginInfoDao();
                        cursor.move(0);
                        pluginInfoDao.id = cursor.getLong(cursor.getColumnIndex("id"));
                        pluginInfoDao.pluginId = cursor.getString(cursor.getColumnIndex(qpy.PLUGIN_ID));
                        pluginInfoDao.lastUsedTimeStamp = cursor.getLong(cursor.getColumnIndex("lastUsedTimeStamp"));
                        pluginInfoDao.lastRequestTimeStamp = cursor.getLong(cursor.getColumnIndex("lastRequestTimeStamp"));
                        pluginInfoDao.version = cursor.getString(cursor.getColumnIndex("version"));
                        String string = cursor.getString(cursor.getColumnIndex("pluginInfo"));
                        if (!TextUtils.isEmpty(string)) {
                            pluginInfoDao.pluginInfo = (PluginModel) JSONObject.parseObject(string, PluginModel.class);
                        }
                        pluginInfoDao.type = cursor.getString(cursor.getColumnIndex("type"));
                        pluginInfoDao.extra = cursor.getString(cursor.getColumnIndex("extra"));
                        arrayList.add(pluginInfoDao);
                    }
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    this.f22424a.close();
                    return arrayList;
                } catch (Exception e2) {
                    e = e2;
                    TMSLogger.b(":DefaultDBAdapter", "DefDBProxy querySQL error", e);
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    this.f22424a.close();
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* loaded from: classes9.dex */
    public static class a extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1190768124);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            }
        }

        public a(Context context) {
            super(context, "tms_cache_center", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            if (n.aH()) {
                sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL);
            } else {
                sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL_OLD);
            }
            sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_PLUGIN_INFO_TABLE_SQL);
            sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_APP_MANIFEST_TABLE_SQL);
        }
    }
}
