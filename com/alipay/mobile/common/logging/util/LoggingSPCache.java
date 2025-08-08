package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggingSPCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_FILE_NAME = "LoggingCache";
    public static final String KEY_CUR_UPLOAD_DAY = "curUploadDay";
    public static final String KEY_CUR_UPLOAD_TRAFIC = "curUploadTrafic";
    public static final String LOGGING_CACHE_KEY_INDEX = "behavorLoggingIndex";
    public static final String LOGGING_CACHE_KEY_LOG_DUMP_TAG = "LogDumpTag";
    public static final String STORAGE_BIRDNESTVERSION = "birdNestVersion";
    public static final String STORAGE_BUNDLEVERSION = "bundleVersion";
    public static final String STORAGE_CHANNELID = "channelId";
    public static final String STORAGE_CLIENTID = "clientID";
    public static final String STORAGE_CLIENTIMEI = "clientIMEI";
    public static final String STORAGE_DEVICEID = "utdid";
    public static final String STORAGE_HOTPATCHBUNDLEVERSION = "hotpatchBundleVersion";
    public static final String STORAGE_HOTPATCHDESC = "hotpatchDesc";
    public static final String STORAGE_HOTPATCHVERSION = "hotpatchVersion";
    public static final String STORAGE_LANGUAGE = "language";
    public static final String STORAGE_LOGHOST = "logHost";
    public static final String STORAGE_PACKAGEID = "packageId";
    public static final String STORAGE_PRODUCTID = "productID";
    public static final String STORAGE_PRODUCTVERSION = "productVersion";
    public static final String STORAGE_RELEASECODE = "releaseCode";
    public static final String STORAGE_RELEASETYPE = "releaseType";
    public static final String STORAGE_USERID = "userID";
    public static final String STORAGE_USERSESSIONID = "userSessionId";

    /* renamed from: a  reason: collision with root package name */
    private static LoggingSPCache f5460a;
    private Context b;
    private SharedPreferences c;

    public static synchronized LoggingSPCache createInstance(Context context) {
        synchronized (LoggingSPCache.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoggingSPCache) ipChange.ipc$dispatch("c8f4a7e0", new Object[]{context});
            }
            if (f5460a == null) {
                f5460a = new LoggingSPCache(context);
            }
            return f5460a;
        }
    }

    public static LoggingSPCache getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoggingSPCache) ipChange.ipc$dispatch("7535951e", new Object[0]);
        }
        LoggingSPCache loggingSPCache = f5460a;
        if (loggingSPCache == null) {
            throw new IllegalStateException("need createInstance befor use");
        }
        String processTag = LoggerFactory.getProcessInfo().getProcessTag();
        Context context = loggingSPCache.b;
        loggingSPCache.c = context.getSharedPreferences(processTag + '.' + CACHE_FILE_NAME, 0);
        return f5460a;
    }

    private LoggingSPCache(Context context) {
        this.b = context;
    }

    public SharedPreferences getEntity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("25456fb4", new Object[]{this}) : this.c;
    }

    public SharedPreferences.Editor getEditor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("4fdc14c7", new Object[]{this}) : this.c.edit();
    }

    public void removeCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc56f2c", new Object[]{this, str});
        } else {
            this.c.edit().remove(str).commit();
        }
    }

    public void removeApply(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f22145b", new Object[]{this, str});
        } else {
            this.c.edit().remove(str).apply();
        }
    }

    public void putStringCommit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a62c72", new Object[]{this, str, str2});
            return;
        }
        String string = this.c.getString(str, null);
        if (this.c.contains(str) && StringUtils.equals(string, str2)) {
            return;
        }
        this.c.edit().putString(str, str2).commit();
    }

    public void putStringApply(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc1b769", new Object[]{this, str, str2});
            return;
        }
        String string = this.c.getString(str, null);
        if (this.c.contains(str) && StringUtils.equals(string, str2)) {
            return;
        }
        this.c.edit().putString(str, str2).apply();
    }

    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2}) : this.c.getString(str, str2);
    }

    public void putIntCommit(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc820fb", new Object[]{this, str, new Integer(i)});
        } else {
            this.c.edit().putInt(str, i).commit();
        }
    }

    public void putIntApply(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6a2de4", new Object[]{this, str, new Integer(i)});
        } else {
            this.c.edit().putInt(str, i).apply();
        }
    }

    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue() : this.c.getInt(str, i);
    }

    public void putLongCommit(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123c2cd1", new Object[]{this, str, new Long(j)});
        } else {
            this.c.edit().putLong(str, j).commit();
        }
    }

    public void putLongApply(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49fa52f0", new Object[]{this, str, new Long(j)});
        } else {
            this.c.edit().putLong(str, j).apply();
        }
    }

    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue() : this.c.getLong(str, j);
    }

    public void putBooleanCommit(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456213b3", new Object[]{this, str, new Boolean(z)});
        } else {
            this.c.edit().putBoolean(str, z).commit();
        }
    }

    public void putBooleanApply(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eb41ee", new Object[]{this, str, new Boolean(z)});
        } else {
            this.c.edit().putBoolean(str, z).apply();
        }
    }

    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue() : this.c.getBoolean(str, z);
    }
}
