package com.taobao.themis.kernel.db;

import com.taobao.themis.kernel.basic.a;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import java.util.List;

/* loaded from: classes9.dex */
public interface TMSDBAdapter extends a {
    public static final String APPINFO_TABLE = "cached_app_info3";
    public static final String APPINFO_TABLE_OLD = "cached_app_info2";
    public static final String APP_MANIFEST_TABLE = "cached_app_manifest2";
    public static final String CREATE_APP_INFO_TABLE_SQL = "CREATE TABLE IF NOT EXISTS cached_app_info3(appId TEXT, templateId TEXT, appInfo TEXT,lastUsedTimeStamp INTEGER,lastRequestTimeStamp INTEGER,version TEXT, type TEXT, extra TEXT, PRIMARY KEY (appId, version, templateId)); DROP TABLE IF EXISTS cached_app_info2";
    public static final String CREATE_APP_INFO_TABLE_SQL_OLD = "CREATE TABLE IF NOT EXISTS cached_app_info2(id INTEGER PRIMARY KEY AUTOINCREMENT,appId TEXT, templateId TEXT, appInfo TEXT,lastUsedTimeStamp INTEGER,lastRequestTimeStamp INTEGER,version TEXT, type TEXT, extra TEXT)";
    public static final String CREATE_APP_MANIFEST_TABLE_SQL = "CREATE TABLE IF NOT EXISTS cached_app_manifest2(appId TEXT PRIMARY KEY,version TEXT,appManifest TEXT,lastUsedTimeStamp INTEGER,lastRequestTimeStamp INTEGER)";
    public static final String CREATE_PLUGIN_INFO_TABLE_SQL = "CREATE TABLE IF NOT EXISTS cached_plugin_info(id INTEGER PRIMARY KEY AUTOINCREMENT,pluginId TEXT,pluginInfo TEXT,lastUsedTimeStamp INTEGER,lastRequestTimeStamp INTEGER,version TEXT, type TEXT, extra TEXT)";
    public static final String DELETE_OLD_TABLE_SQL = "DROP TABLE IF EXISTS cached_app_manifest";

    boolean execSQL(String str);

    boolean insertAppInfo(AppInfoDao appInfoDao);

    boolean insertAppManifest(AppManifestDao appManifestDao);

    boolean insertPluginInfo(PluginInfoDao pluginInfoDao);

    boolean isReady();

    List<AppInfoDao> selectAppInfo(String str);

    List<AppManifestDao> selectAppManifest(String str);

    List<PluginInfoDao> selectPluginInfo(String str);
}
