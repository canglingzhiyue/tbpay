package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.taobao.windvane.config.j;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUCPrecacheManager implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCPrecacheManager";
    private static WVUCPrecacheManager mInstance = null;
    private static boolean sCanClearByCommonConfig = false;
    private static boolean sCanClearByZcacheUpdate = false;
    private static boolean sCanPrecacheByCommonConfig = false;
    private static boolean sCanPrecacheByZcacheUpdate = false;
    private static boolean sHasInitUrlSet = false;
    private static boolean sHasPrecache = false;
    private static boolean sLastEnableUCPrecache = false;
    private static String sLastPrecachePackageName = null;
    private static long sLastPrecacheTime = 0;
    private static final long sMaxPrecacheTime = 3600000;
    private static HashSet<String> sPreMemCacheUrlSet;
    private static HashSet<String> sPrecacheDocResMap;
    private Handler mPrecacheHandler;

    /* loaded from: classes2.dex */
    public static class WVUCPrecacheManagerHolder {
        public static final WVUCPrecacheManager sInstance;

        static {
            kge.a(1494780492);
            sInstance = new WVUCPrecacheManager();
        }

        private WVUCPrecacheManagerHolder() {
        }
    }

    static {
        kge.a(-22080477);
        kge.a(1845411121);
        mInstance = null;
        sHasInitUrlSet = false;
        sHasPrecache = false;
        sCanClearByCommonConfig = false;
        sCanClearByZcacheUpdate = false;
        sCanPrecacheByCommonConfig = false;
        sCanPrecacheByZcacheUpdate = false;
        sLastEnableUCPrecache = false;
        sLastPrecachePackageName = "";
        sLastPrecacheTime = -1L;
        sPreMemCacheUrlSet = new HashSet<>();
        sPrecacheDocResMap = new HashSet<>();
    }

    public static WVUCPrecacheManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCPrecacheManager) ipChange.ipc$dispatch("432cac70", new Object[0]) : WVUCPrecacheManagerHolder.sInstance;
    }

    private WVUCPrecacheManager() {
        this.mPrecacheHandler = null;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            aem.a().a(this);
        }
    }

    public static void resetClearConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6915dfa7", new Object[0]);
            return;
        }
        sCanClearByCommonConfig = false;
        sCanClearByZcacheUpdate = false;
    }

    public static void resetPrecacheConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a93e97", new Object[0]);
            return;
        }
        sCanPrecacheByCommonConfig = false;
        sCanPrecacheByZcacheUpdate = false;
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (i == 6008) {
            notifyUpdateZcache((String) objArr[0]);
            return null;
        } else if (i != 6012) {
            return null;
        } else {
            notifyUpdateCommonConfig();
            return null;
        }
    }

    private static void notifyUpdateZcache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d9b66b", new Object[]{str});
        } else if (TextUtils.isEmpty(str) || !str.equals(sLastPrecachePackageName)) {
        } else {
            sCanClearByZcacheUpdate = true;
            sCanPrecacheByZcacheUpdate = true;
            updatePreMemCacheUrls();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void notifyUpdateCommonConfig() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto Lf
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "8acf4a6"
            r0.ipc$dispatch(r2, r1)
            return
        Lf:
            android.taobao.windvane.config.k r0 = android.taobao.windvane.config.j.commonConfig
            boolean r0 = r0.O
            android.taobao.windvane.config.k r1 = android.taobao.windvane.config.j.commonConfig
            java.lang.String r1 = r1.P
            boolean r3 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastEnableUCPrecache
            r4 = 1
            if (r3 == 0) goto L24
            if (r0 != 0) goto L24
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanClearByCommonConfig = r4
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanPrecacheByCommonConfig = r2
        L22:
            r2 = 1
            goto L2f
        L24:
            boolean r3 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastEnableUCPrecache
            if (r3 != 0) goto L2f
            if (r0 == 0) goto L2f
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanClearByCommonConfig = r4
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanPrecacheByCommonConfig = r4
            goto L22
        L2f:
            java.lang.String r3 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastPrecachePackageName
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L42
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanClearByCommonConfig = r4
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L41
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sCanPrecacheByCommonConfig = r4
        L41:
            r2 = 1
        L42:
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastEnableUCPrecache = r0
            android.taobao.windvane.extra.uc.WVUCPrecacheManager.sLastPrecachePackageName = r1
            if (r2 != 0) goto L4c
            boolean r0 = android.taobao.windvane.extra.uc.WVUCPrecacheManager.sHasInitUrlSet
            if (r0 != 0) goto L4f
        L4c:
            updatePreMemCacheUrls()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCPrecacheManager.notifyUpdateCommonConfig():void");
    }

    private static void updatePreMemCacheUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f06a72", new Object[0]);
        } else if (!j.commonConfig.O || TextUtils.isEmpty(sLastPrecachePackageName)) {
            sPreMemCacheUrlSet = new HashSet<>();
        } else {
            ael a2 = aem.a().a(6011, sLastPrecachePackageName);
            if (!a2.f25290a || a2.b == null || !(a2.b instanceof HashSet)) {
                return;
            }
            sPreMemCacheUrlSet = (HashSet) a2.b;
            sHasInitUrlSet = true;
        }
    }

    public static boolean canClearPrecache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("720990c7", new Object[0])).booleanValue();
        }
        if (!sHasPrecache) {
            return false;
        }
        if (sCanClearByCommonConfig || sCanClearByZcacheUpdate) {
            return true;
        }
        return sLastPrecacheTime > 0 && System.currentTimeMillis() - sLastPrecacheTime > 3600000;
    }

    public static boolean canPrecache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c673d3ba", new Object[0])).booleanValue();
        }
        if (j.commonConfig.O && !TextUtils.isEmpty(sLastPrecachePackageName)) {
            if (!sHasInitUrlSet) {
                sHasInitUrlSet = true;
                updatePreMemCacheUrls();
            }
            HashSet<String> hashSet = sPreMemCacheUrlSet;
            if (hashSet != null && hashSet.size() > 0) {
                return sCanPrecacheByCommonConfig || sCanPrecacheByZcacheUpdate || !sHasPrecache;
            }
        }
        return false;
    }

    public static void setHasPrecache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250a97d6", new Object[]{new Boolean(z)});
            return;
        }
        sHasPrecache = z;
        if (z) {
            sLastPrecacheTime = System.currentTimeMillis();
        } else {
            sLastPrecacheTime = -1L;
        }
    }

    public static HashSet<String> preMemCacheUrlSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("978d02a7", new Object[0]) : sPreMemCacheUrlSet;
    }

    public boolean canPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611139de", new Object[]{this, str})).booleanValue();
        }
        if (!j.commonConfig.Q || TextUtils.isEmpty(str)) {
            return false;
        }
        if (sPreMemCacheUrlSet.isEmpty()) {
            return true;
        }
        Iterator<String> it = sPreMemCacheUrlSet.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean hasPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec2854", new Object[]{this, str})).booleanValue();
        }
        if (str.indexOf("#") > 0) {
            str = str.substring(0, str.indexOf("#"));
        }
        return sPrecacheDocResMap.contains(str);
    }

    public void addPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49df5f29", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.indexOf("#") > 0) {
                str = str.substring(0, str.indexOf("#"));
            }
            sPrecacheDocResMap.add(str);
            sendClearPrecacheDocMessage(str);
        }
    }

    public void clearPrecacheDoc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce86fd", new Object[]{this, str});
            return;
        }
        if (str.indexOf("#") > 0) {
            str = str.substring(0, str.indexOf("#"));
        }
        sPrecacheDocResMap.remove(str);
    }

    private void sendClearPrecacheDocMessage(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbc7aa4", new Object[]{this, str});
        } else if (sPrecacheDocResMap.size() <= 0) {
        } else {
            if (this.mPrecacheHandler == null) {
                this.mPrecacheHandler = new Handler();
            }
            this.mPrecacheHandler.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCPrecacheManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVUCPrecacheManager.this.clearPrecacheDoc(str);
                    }
                }
            }, 10000L);
        }
    }
}
