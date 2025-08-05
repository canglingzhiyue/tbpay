package com.taobao.themis.kernel.metaInfo.appinfo.storage;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.utils.n;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.qpt;
import tb.riy;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, AppInfoDao> f22552a;
    private static a b;

    static {
        kge.a(1593259264);
        f22552a = new LruCache<>(10);
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7b12772c", new Object[0]);
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public synchronized AppInfoDao a(String str, String str2, String str3) {
        AppInfoDao appInfoDao;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoDao) ipChange.ipc$dispatch("3140ebc8", new Object[]{this, str, str2, str3});
        }
        try {
            TMSLogger.b("AppInfoStorage", "enter selectInfo [" + str + riy.ARRAY_END_STR);
            appInfoDao = f22552a.get(str);
        } catch (Exception e) {
            TMSLogger.b("AppInfoStorage", "selectInfoById error", e);
        }
        if (a(str2, str3, appInfoDao)) {
            AppInfoDao appInfoDao2 = (AppInfoDao) JSON.parseObject(JSONObject.toJSONString(appInfoDao), AppInfoDao.class);
            TMSLogger.b("AppInfoStorage", "get ram cache[" + str + riy.ARRAY_END_STR);
            return appInfoDao2;
        }
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.a(TMSDBAdapter.class);
        if (!tMSDBAdapter.isReady()) {
            return null;
        }
        String str4 = "SELECT * FROM " + n.T() + " WHERE appId='" + str + "'";
        if (!TextUtils.isEmpty(str2) && !"*".equals(str2)) {
            str4 = str4 + " AND version='" + str2 + "'";
        }
        if (!TextUtils.isEmpty(str3)) {
            str4 = str4 + " AND templateId='" + str3 + "'";
        }
        List<AppInfoDao> selectAppInfo = tMSDBAdapter.selectAppInfo(str4 + " ORDER BY lastRequestTimeStamp DESC");
        if (selectAppInfo != null && !selectAppInfo.isEmpty()) {
            appInfoDao = selectAppInfo.get(0);
            TMSLogger.b("AppInfoStorage", "get appInfo [" + str + riy.ARRAY_END_STR);
        }
        if (appInfoDao != null) {
            f22552a.put(str, appInfoDao);
            if (a(str2, str3, appInfoDao)) {
                return appInfoDao;
            }
            TMSLogger.b("AppInfoStorage", str + " don't hit DBCache, version or templateid is different!");
            return null;
        }
        return null;
    }

    private static boolean a(String str, String str2, AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee0cfcf8", new Object[]{str, str2, appInfoDao})).booleanValue();
        }
        if (appInfoDao == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && !"*".equals(str) && !TextUtils.equals(str, appInfoDao.version)) {
            return false;
        }
        return TextUtils.isEmpty(str2) || TextUtils.equals(str2, appInfoDao.templateId);
    }

    public synchronized void a(AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43f46e0", new Object[]{this, appInfoDao});
            return;
        }
        f22552a.put(appInfoDao.appId, appInfoDao);
        try {
            TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.a(TMSDBAdapter.class);
            if (tMSDBAdapter.isReady()) {
                tMSDBAdapter.insertAppInfo(appInfoDao);
            }
        } catch (Exception e) {
            TMSLogger.b("AppInfoStorage", "deleteById error", e);
        }
    }

    public synchronized void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        try {
            if (f22552a != null) {
                f22552a.evictAll();
            }
            TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.a(TMSDBAdapter.class);
            if (!tMSDBAdapter.isReady()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb.append("'");
                    sb.append(it.next());
                    sb.append("'");
                    if (it.hasNext()) {
                        sb.append(",");
                    }
                }
            }
            tMSDBAdapter.execSQL("DELETE FROM " + n.T() + " WHERE appId NOT IN (" + ((Object) sb) + riy.BRACKET_END_STR);
        } catch (Exception e) {
            TMSLogger.b("AppInfoStorage", "clearUnusedExcept error", e);
        }
    }
}
