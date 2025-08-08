package com.taobao.tao;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.virtual_thread.CarrierCachedPoolImpl;
import com.taobao.tao.util.AppUtils;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.TTIDChangeTrend;
import com.taobao.taobao.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.kge;
import tb.odn;

/* loaded from: classes.dex */
public class TaoPackageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CURRENT_TTID = "ttid";
    public static final String DEFAULT_PACKAGE_TAG = "0-0-0";
    public static final String PRELOAD_TTID = "preload_ttid";
    public static final String TAG = "TaoPackageInfo";
    public static boolean isInit;
    public static String mPackageTag;
    public static String mTTIDType;
    public static int mpatchversion;
    public static String mttid;
    public static Date sPackageDate;
    public static String sTTID;

    private static String getTTIDExternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ce1a19d", new Object[0]);
        }
        return null;
    }

    private static void saveTTIDExternal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a525219e", new Object[]{str, str2});
        }
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            asyncInit();
        }
    }

    public static /* synthetic */ void access$100(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79467bcc", new Object[]{str, str2});
        } else {
            saveTTID(str, str2);
        }
    }

    static {
        kge.a(-2088006990);
        sTTID = null;
        sPackageDate = null;
        mttid = null;
        mTTIDType = null;
        mPackageTag = null;
        isInit = false;
        mpatchversion = 0;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (isInit) {
        } else {
            mttid = getTTIDPackage();
            mTTIDType = "ttid";
            if (isTTIDInvalid(mttid)) {
                android.taobao.util.k.a(TAG, "can not get ttid from apk");
                mttid = "600000";
            }
            sTTID = mttid.split("@")[0];
            CarrierCachedPoolImpl.a().a(new Coordinator.TaggedRunnable("ttidAsyncInit") { // from class: com.taobao.tao.TaoPackageInfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoPackageInfo.access$000();
                    }
                }
            });
            String str = "orgin ttid1 is " + mttid;
        }
    }

    private static void asyncInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96590c33", new Object[0]);
            return;
        }
        String tTIDPreference = getTTIDPreference();
        mttid = tTIDPreference;
        if (isTTIDInvalid(tTIDPreference)) {
            String tTIDExternal = getTTIDExternal();
            mttid = tTIDExternal;
            if (isTTIDInvalid(tTIDExternal)) {
                mttid = getTTIDPackage();
                mTTIDType = "ttid";
                if (isTTIDInvalid(mttid)) {
                    android.taobao.util.k.a(TAG, "can not get ttid from apk");
                    mttid = "600000";
                }
                saveTTID(mTTIDType, mttid);
            } else {
                saveTTIDPreference(mTTIDType, mttid);
            }
        }
        String str = "orgin ttid2 is " + mttid;
        String str2 = mttid.split("@")[0];
        sTTID = str2;
        TTIDChangeTrend.setCurrentUseTTID(str2);
        isInit = true;
    }

    public static String getPackageTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0ce77cf", new Object[0]);
        }
        if (mPackageTag == null) {
            try {
                mPackageTag = Globals.getApplication().getString(R.string.packageTag);
            } catch (Exception unused) {
                mPackageTag = DEFAULT_PACKAGE_TAG;
            }
        }
        return mPackageTag;
    }

    public static int getPatchVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a58ce760", new Object[0])).intValue() : mpatchversion;
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]) : AppUtils.getVersionName();
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return sTTID + "@taobao_android_" + getVersion();
    }

    public static final String getTTIDNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8c591c44", new Object[0]) : getTTIDPackage();
    }

    public static String getPackageTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd25c2e", new Object[0]);
        }
        return getTTIDPackage() + "@taobao_android_" + getVersion();
    }

    public static Date getPackageDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("7c592d32", new Object[0]);
        }
        Date date = sPackageDate;
        if (date != null) {
            return date;
        }
        try {
            sPackageDate = new SimpleDateFormat("yyyyMMdd.HHmmss").parse(BuiltConfig.getString(R.string.packageTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sPackageDate;
    }

    private static void saveTTID(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd0f8b3", new Object[]{str, str2});
            return;
        }
        saveTTIDPreference(str, str2);
        saveTTIDExternal(str, str2);
    }

    private static void saveTTIDPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d05cae", new Object[]{str, str2});
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        if (defaultSharedPreferences == null) {
            android.taobao.util.k.a(TAG, "getSharedPreferences error");
            return;
        }
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        if (edit == null) {
            android.taobao.util.k.a(TAG, "getSharedPreferences error");
            return;
        }
        edit.putString(str, str2);
        edit.commit();
    }

    private static String getTTIDPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3236acd", new Object[0]);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        if (defaultSharedPreferences == null) {
            return null;
        }
        String string = defaultSharedPreferences.getString(PRELOAD_TTID, null);
        if (string == null) {
            String string2 = defaultSharedPreferences.getString("ttid", null);
            if (string2 == null) {
                return string2;
            }
            final String tTIDPackage = getTTIDPackage();
            if (string2.equals(tTIDPackage)) {
                return string2;
            }
            TTIDChangeTrend.setAndSaveOldUseTTID(string2);
            CarrierCachedPoolImpl.a().a(new Coordinator.TaggedRunnable("saveTTID") { // from class: com.taobao.tao.TaoPackageInfo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoPackageInfo.access$100("ttid", tTIDPackage);
                    }
                }
            });
            return tTIDPackage;
        }
        TTIDChangeTrend.setOldUseTTID(getTTIDPackage());
        return string;
    }

    private static String getTTIDFromSystem() {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("355e67ef", new Object[0]);
        }
        File file = new File("system/app");
        if (!file.isDirectory()) {
            return null;
        }
        for (String str : file.list()) {
            if (str.toLowerCase().indexOf("taobao") >= 0) {
                String[] split = str.split("_");
                if (split.length >= 3) {
                    String str2 = split[2];
                    String str3 = str + ", find taobao, ttid=" + str2;
                    try {
                        if (Integer.valueOf(str2).intValue() >= 600000) {
                            if (checkOKWithUpZip(file.getAbsolutePath() + "/" + str, str2)) {
                                return str2;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static boolean checkOKWithUpZip(String str, String str2) {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71b1bafb", new Object[]{str, str2})).booleanValue();
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                zipFile = null;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement.getName().contains("../")) {
                        break;
                    }
                    String str3 = "entry.getName()=" + nextElement.getName();
                    if (nextElement.getName().contains("assets/aconfig.xml")) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(nextElement)));
                        String readLine = bufferedReader.readLine();
                        bufferedReader.close();
                        if (readLine != null && readLine.contains("com.taobao.taobao")) {
                            if (readLine.contains(str2)) {
                                try {
                                    zipFile.close();
                                } catch (Exception unused2) {
                                }
                                return true;
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (Exception unused3) {
                        }
                        return false;
                    }
                }
                zipFile.close();
            } catch (Exception unused4) {
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    zipFile2.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
            return false;
        }
    }

    private static String getTTIDSaveFileName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9914cc4", new Object[0]);
        }
        File externalCacheDir = Globals.getApplication().getExternalCacheDir();
        if (externalCacheDir == null) {
            return null;
        }
        return externalCacheDir.getAbsolutePath() + "/.deviceidInfo/ttid.dat";
    }

    private static boolean isTTIDInvalid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1697cf87", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str);
    }

    public static String getTTIDPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c099b04", new Object[0]);
        }
        String str = null;
        String string = BuiltConfig.getString(R.string.ttidStore);
        String str2 = "ttid type " + string;
        if (odn.ZIP_COMMENT_TTID_TYPE.equals(string)) {
            str = odn.a(Globals.getApplication());
        }
        if (StringUtils.isEmpty(str)) {
            try {
                str = BuiltConfig.getString(R.string.ttid);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str == null ? "600000" : str;
    }
}
