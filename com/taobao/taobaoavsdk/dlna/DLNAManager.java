package com.taobao.taobaoavsdk.dlna;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.LinkedList;
import tb.kge;
import tb.ozr;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class DLNAManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    private static DLNAManager mDLNAManager;
    private boolean mObjReady;
    public a mSearchCallback;
    public b mStartCallback;
    private HashMap<String, String> mStatMap = new HashMap<>();
    public c mStopCallback;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);

        void a(LinkedList<DLNADeviceInfo> linkedList);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(int i);
    }

    /* loaded from: classes8.dex */
    public interface c {
    }

    private static void OnEventNotify(Object obj, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b89d650", new Object[]{obj, new Integer(i), str, str2});
        }
    }

    private static void OnLog(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ceb72", new Object[]{obj, str});
        }
    }

    private native long _createObjInNative(int i);

    private native boolean _initRo(String str);

    private native long _refreshInNative();

    private native long _releaseInNative();

    private native long _startInNative(long j, String[] strArr);

    private native long _stopInNative();

    static {
        kge.a(29992553);
        TAG = "AVSDK-dlna";
        mDLNAManager = null;
    }

    public static synchronized DLNAManager getInstance() {
        synchronized (DLNAManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DLNAManager) ipChange.ipc$dispatch("7847d7fa", new Object[0]);
            }
            if (mDLNAManager == null) {
                DLNAManager dLNAManager = new DLNAManager();
                mDLNAManager = dLNAManager;
                dLNAManager.init();
            }
            return mDLNAManager;
        }
    }

    private DLNAManager() {
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        log("init");
        String a2 = ozr.e().a();
        if (TextUtils.isEmpty(a2)) {
            log("get so path fail.");
            return;
        }
        if (!TaobaoMediaPlayer.isLibLoaded()) {
            TaobaoMediaPlayer.loadLibrariesOnce(null);
            if (!TaobaoMediaPlayer.isLibLoaded()) {
                log("load player so fails");
                return;
            }
        }
        log("init osPath=" + a2);
        if (_initRo(a2)) {
            return;
        }
        log("init so fail.");
    }

    private void createObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e10162", new Object[]{this});
            return;
        }
        long _createObjInNative = _createObjInNative(2000);
        log("init result=" + _createObjInNative);
        if (_createObjInNative != 0) {
            return;
        }
        this.mObjReady = true;
    }

    private void createObjIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf818b4", new Object[]{this});
        } else if (this.mObjReady) {
        } else {
            createObj();
        }
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        AVSDKLog.e(str2, this + ", " + str);
    }

    public void updateStat(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db542e6f", new Object[]{this, hashMap});
        } else if (hashMap == null || hashMap.size() == 0) {
        } else {
            this.mStatMap.putAll(hashMap);
        }
    }

    public void searchProjectionScreenDevice(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fc4c3b", new Object[]{this, aVar});
            return;
        }
        createObjIfNeeded();
        log("searchProjectionScreenDevice, " + aVar + ", mObjReady=" + this.mObjReady);
        if (!this.mObjReady) {
            aVar.a(-99);
            return;
        }
        this.mSearchCallback = aVar;
        long _refreshInNative = _refreshInNative();
        log("searchProjectionScreenDevice, result=" + _refreshInNative);
        if (_refreshInNative >= 0) {
            return;
        }
        getInstance().mSearchCallback.a(-1);
    }

    public void startProjectScreenToDevice(DLNADeviceInfo dLNADeviceInfo, HashMap<String, String> hashMap, b bVar) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670135e9", new Object[]{this, dLNADeviceInfo, hashMap, bVar});
            return;
        }
        createObjIfNeeded();
        log("startProjectScreenToDevice " + dLNADeviceInfo + ", " + hashMap + ", " + bVar + ", mObjReady=" + this.mObjReady);
        if (!this.mObjReady) {
            if (bVar == null) {
                return;
            }
            bVar.a(-99);
        } else if (hashMap == null || hashMap.size() == 0) {
        } else {
            this.mStartCallback = bVar;
            String str = hashMap.get("projectScreenPlayUrl");
            String str2 = hashMap.get("projectScreenPlayUrlBackup");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return;
                }
                i = 1;
            }
            String[] strArr = new String[i];
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                strArr[0] = str;
                strArr[1] = str2;
            } else if (!TextUtils.isEmpty(str)) {
                strArr[0] = str;
            } else if (!TextUtils.isEmpty(str2)) {
                strArr[1] = str2;
            }
            long _startInNative = _startInNative(dLNADeviceInfo.deviceId, strArr);
            log("startProjectScreenToDevice, result=" + _startInNative);
            if (_startInNative >= 0) {
                return;
            }
            OnStartResult(null, (int) _startInNative);
        }
    }

    public void stopProjectScreenToDevice(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2b535e", new Object[]{this, cVar});
            return;
        }
        createObjIfNeeded();
        log("stopProjectScreenToDevice, " + cVar + ", mObjReady=" + this.mObjReady);
        if (!this.mObjReady) {
            return;
        }
        this.mStopCallback = cVar;
        long _stopInNative = _stopInNative();
        log("stopProjectScreenToDevice, stopResult=" + _stopInNative);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        long _releaseInNative = _releaseInNative();
        this.mStopCallback = null;
        this.mSearchCallback = null;
        this.mStartCallback = null;
        this.mObjReady = false;
        log("release, releaseResult=" + _releaseInNative);
    }

    private static void OnRefreshResult(Object obj, long[] jArr, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a5f474", new Object[]{obj, jArr, strArr});
            return;
        }
        String str = TAG;
        AVSDKLog.e(str, "OnRefreshResult, callback=" + getInstance().mSearchCallback + ", ids=" + jArr + ", names=" + strArr);
        if (getInstance().mSearchCallback == null) {
            return;
        }
        if (jArr != null && strArr != null && jArr.length > 0 && jArr.length == strArr.length) {
            LinkedList<DLNADeviceInfo> linkedList = new LinkedList<>();
            for (int i = 0; i < jArr.length; i++) {
                DLNADeviceInfo dLNADeviceInfo = new DLNADeviceInfo();
                dLNADeviceInfo.deviceId = jArr[i];
                dLNADeviceInfo.deviceName = "" + strArr[i];
                linkedList.add(dLNADeviceInfo);
            }
            getInstance().mSearchCallback.a(linkedList);
            return;
        }
        getInstance().mSearchCallback.a(-1);
    }

    private static void OnStartResult(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8caa1320", new Object[]{obj, new Integer(i)});
            return;
        }
        String str = TAG;
        AVSDKLog.e(str, "OnStartResult, resultCode=" + i);
        if (getInstance().mStartCallback == null) {
            return;
        }
        getInstance().mStartCallback.a(i);
        getInstance().mStartCallback = null;
    }

    private static void OnTrace(Object obj, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc4b0c4", new Object[]{obj, new Integer(i), str});
            return;
        }
        String str2 = TAG;
        AVSDKLog.e(str2, "OnTrace, traceType=" + i + ", info=" + str);
        commitStat(i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void commitStat(int r13, java.lang.String r14) {
        /*
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.taobaoavsdk.dlna.DLNAManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L1c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r13)
            r0[r4] = r2
            r0[r3] = r14
            java.lang.String r13 = "4f95d99b"
            r1.ipc$dispatch(r13, r0)
            return
        L1c:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L6a
            r1.<init>()     // Catch: java.lang.Exception -> L6a
            com.taobao.taobaoavsdk.dlna.DLNAManager r2 = getInstance()     // Catch: java.lang.Exception -> L6a
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.mStatMap     // Catch: java.lang.Exception -> L6a
            r1.putAll(r2)     // Catch: java.lang.Exception -> L6a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L6a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L6a
            r2 = r0
        L33:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> L68
            if (r6 == 0) goto L86
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L68
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r7.<init>()     // Catch: java.lang.Exception -> L68
            r7.append(r2)     // Catch: java.lang.Exception -> L68
            java.lang.String r8 = ","
            r7.append(r8)     // Catch: java.lang.Exception -> L68
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Exception -> L68
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L68
            r7.append(r8)     // Catch: java.lang.Exception -> L68
            java.lang.String r8 = "="
            r7.append(r8)     // Catch: java.lang.Exception -> L68
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L68
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L68
            r7.append(r6)     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Exception -> L68
            goto L33
        L68:
            r1 = move-exception
            goto L6c
        L6a:
            r1 = move-exception
            r2 = r0
        L6c:
            java.lang.String r6 = com.taobao.taobaoavsdk.dlna.DLNAManager.TAG
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "commitStat exception. "
            r7.append(r8)
            java.lang.String r1 = r1.toString()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r6, r1)
        L86:
            com.ut.mini.l r1 = com.ut.mini.l.getInstance()
            java.lang.String r1 = r1.getCurrentPageName()
            r6 = 4
            java.lang.String[] r12 = new java.lang.String[r6]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "artcDlnaTraceType="
            r6.append(r7)
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            r12[r4] = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "artcDlnaTraceData="
            r13.append(r4)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12[r3] = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "pageName="
            r13.append(r14)
            if (r1 != 0) goto Lc5
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12[r5] = r13
            r13 = 3
            r12[r13] = r2
            r8 = 19997(0x4e1d, float:2.8022E-41)
            java.lang.String r7 = "Page_Video"
            java.lang.String r9 = "Page_Video_Button-TBPlayerScreenCast"
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            com.taobao.statistic.TBS.Ext.commitEvent(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.dlna.DLNAManager.commitStat(int, java.lang.String):void");
    }
}
