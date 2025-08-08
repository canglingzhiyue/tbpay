package com.taobao.tao.util;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.taobao.util.a;
import android.taobao.util.b;
import android.taobao.util.h;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.virtual_thread.CarrierCachedPoolImpl;
import com.taobao.tao.Globals;
import java.io.File;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes.dex */
public class TTIDChangeTrend {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String OLD_TTID = "old_ttid";
    private static final String TAG = "TTIDChangeTrend";
    private static String mCurrentUseTTID;
    private static String mOldUseTTID;

    static {
        kge.a(859152037);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            saveTTIDPreference();
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            saveTTIDExternal();
        }
    }

    public static void setCurrentUseTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343d2b3c", new Object[]{str});
        } else {
            mCurrentUseTTID = str;
        }
    }

    public static void setOldUseTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593df24e", new Object[]{str});
        } else {
            mOldUseTTID = str;
        }
    }

    public static void setAndSaveOldUseTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7d6b1e", new Object[]{str});
            return;
        }
        mOldUseTTID = str;
        saveOldTTIDAndVersion();
    }

    public static final String getCurrentUseTTID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d03a57a", new Object[0]) : mCurrentUseTTID;
    }

    public static final String getOldUseTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee86da28", new Object[0]);
        }
        if (mOldUseTTID == null) {
            getAndSaveOldTTID();
        }
        return mOldUseTTID;
    }

    private static void getAndSaveOldTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e361272b", new Object[0]);
            return;
        }
        getOldTTIDAndVersion();
        String str = "getAndSaveOldTTID(): oldTTID=" + mOldUseTTID;
        if (mOldUseTTID != null) {
            return;
        }
        mOldUseTTID = mCurrentUseTTID;
        saveOldTTIDAndVersion();
    }

    public static void printAllInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8990609", new Object[0]);
            return;
        }
        String str = "oldTTID=" + getOldUseTTID() + ", currentUseTTID=" + getCurrentUseTTID() + ", systemTTID=" + getTTIDFromSystem();
    }

    private static void getOldTTIDAndVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cba2034", new Object[0]);
            return;
        }
        getTTIDPreference();
        if (mOldUseTTID != null) {
            return;
        }
        getTTIDExternal();
    }

    private static void saveOldTTIDAndVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d89c6d", new Object[0]);
        } else {
            CarrierCachedPoolImpl.a().a(new Coordinator.TaggedRunnable("saveTTID") { // from class: com.taobao.tao.util.TTIDChangeTrend.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TTIDChangeTrend.access$000();
                    TTIDChangeTrend.access$100();
                }
            });
        }
    }

    private static void getTTIDPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2bd5633", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences(TAG, 0);
        if (sharedPreferences == null) {
            return;
        }
        mOldUseTTID = sharedPreferences.getString(OLD_TTID, null);
    }

    private static void getTTIDExternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4196563", new Object[0]);
            return;
        }
        String tTIDSaveFileName = getTTIDSaveFileName();
        if (StringUtils.isEmpty(tTIDSaveFileName)) {
            return;
        }
        File file = new File(tTIDSaveFileName);
        if (!file.exists()) {
            return;
        }
        try {
            byte[] read = FileAccesser.read(tTIDSaveFileName);
            if (read == null) {
                return;
            }
            mOldUseTTID = new String(b.b(h.a(Globals.getApplication()).getBytes(), a.b(read)));
        } catch (Exception unused) {
            file.delete();
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
        return externalCacheDir.getAbsolutePath() + "/.deviceidInfo/oldttid.dat";
    }

    private static void saveTTIDPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fdec9a", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences(TAG, 0);
        if (sharedPreferences == null) {
            k.a(TAG, "getSharedPreferences error");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit == null) {
            k.a(TAG, "getSharedPreferences error");
            return;
        }
        edit.putString(OLD_TTID, mOldUseTTID);
        edit.commit();
    }

    private static void saveTTIDExternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638a698a", new Object[0]);
            return;
        }
        String tTIDSaveFileName = getTTIDSaveFileName();
        if (StringUtils.isEmpty(tTIDSaveFileName)) {
            return;
        }
        File file = new File(tTIDSaveFileName);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileAccesser.write(tTIDSaveFileName, ByteBuffer.wrap(a.a(b.a(h.a(Globals.getApplication()).getBytes(), mOldUseTTID.getBytes(b.ISO88591)))));
        } catch (Exception unused) {
            k.a(TAG, "save ttid to external failed");
        }
    }

    public static String getTTIDFromSystem() {
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
                String tTIDFromApk = getTTIDFromApk(file.getAbsolutePath() + "/" + str);
                if (tTIDFromApk != null) {
                    return tTIDFromApk;
                }
            }
        }
        return null;
    }

    private static String getTTIDFromApk(String str) {
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
            assetManager.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assetManager, str);
            Resources resources = Globals.getApplication().getResources();
            Resources resources2 = new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            return resources2.getString(resources2.getIdentifier("ttid", "string", TaoHelper.getPackageName()));
        } catch (Exception unused) {
            return null;
        }
    }
}
