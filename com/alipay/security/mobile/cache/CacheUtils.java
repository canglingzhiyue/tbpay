package com.alipay.security.mobile.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CacheUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_SHARED_PREFERENCE_DK = "iotauth_digital_key_cache";
    public static final String APP_SHARED_PREFERENCE_NAME = "iotauth_common_cache";
    public static Map<String, CacheUtils> allInstance = new HashMap();
    public static Context appContext;
    private SharedPreferences appSharePref;
    private Object localDatalock = new Object();
    private HashMap<String, Object> mLocalDatas;

    public static CacheUtils getInstance(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CacheUtils) ipChange.ipc$dispatch("d1da5796", new Object[]{context}) : getInstance(context, APP_SHARED_PREFERENCE_NAME);
    }

    public static synchronized CacheUtils getInstance(Context context, String str) {
        synchronized (CacheUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CacheUtils) ipChange.ipc$dispatch("cf5728e0", new Object[]{context, str});
            }
            if (!allInstance.containsKey(str)) {
                allInstance.put(str, new CacheUtils());
            }
            if (appContext == null) {
                appContext = context.getApplicationContext();
            }
            return allInstance.get(str);
        }
    }

    public CacheUtils() {
        synchronized (this.localDatalock) {
            if (this.mLocalDatas == null) {
                this.mLocalDatas = new HashMap<>();
            }
        }
    }

    public <T> void addToLocalData(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e469fc", new Object[]{this, t});
        } else if (t == null) {
        } else {
            this.mLocalDatas.put(t.getClass().getCanonicalName(), t);
        }
    }

    public <T> T getLocalData(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("abc8f41b", new Object[]{this, cls});
        }
        T t = null;
        if (cls != null && (t = (T) this.mLocalDatas.get(cls.getCanonicalName())) == null && (t = (T) pullFromPref(cls)) != null) {
            addToLocalData(t);
        }
        return t;
    }

    public <T> void pushToPref(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68c59b", new Object[]{this, t});
            return;
        }
        this.appSharePref = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        SharedPreferences.Editor edit = this.appSharePref.edit();
        edit.putString(t.getClass().getCanonicalName(), JSONObject.toJSONString(t));
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public <T> T pullFromPref(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6f631d2e", new Object[]{this, cls});
        }
        this.appSharePref = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        String string = this.appSharePref.getString(cls.getCanonicalName(), "");
        if (!StringUtils.isEmpty(string)) {
            return (T) JSONObject.parseObject(string, cls);
        }
        return null;
    }

    public void addToLocalData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de56734", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.mLocalDatas.put(str, str2);
        }
    }

    public void pushToPref(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efbb913", new Object[]{this, str, str2});
            return;
        }
        this.appSharePref = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        SharedPreferences.Editor edit = this.appSharePref.edit();
        edit.putString(str, str2);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public String getLocalData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68833650", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (String) this.mLocalDatas.get(str);
        if (!StringUtils.isEmpty(str2)) {
            return str2;
        }
        String pullFromPref = pullFromPref(str);
        if (pullFromPref == null) {
            return pullFromPref;
        }
        addToLocalData(str, pullFromPref);
        return pullFromPref;
    }

    public String pullFromPref(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("182e2f9d", new Object[]{this, str});
        }
        this.appSharePref = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        return this.appSharePref.getString(str, "");
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.mLocalDatas.clear();
        this.appSharePref = appContext.getSharedPreferences(APP_SHARED_PREFERENCE_NAME, 0);
        SharedPreferences.Editor edit = this.appSharePref.edit();
        edit.clear();
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }
}
