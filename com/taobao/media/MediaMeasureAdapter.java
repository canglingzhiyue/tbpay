package com.taobao.media;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.taobaoavsdk.util.f;
import tb.aks;
import tb.akt;
import tb.kge;
import tb.mjw;
import tb.oyu;

/* loaded from: classes7.dex */
public class MediaMeasureAdapter implements mjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mBucketId;
    private long mExperienceId;
    private int mLastMeausreResult = -1;
    private long mLastMeausreTime;
    private long mReleaseId;

    static {
        kge.a(528532343);
        kge.a(1939611878);
    }

    @Override // tb.mjw
    public int getNetSpeedValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c422db2b", new Object[]{this})).intValue() : f.a() << 3;
    }

    public boolean isLowPerformance(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f237c40", new Object[]{this, mediaPlayControlContext})).booleanValue();
        }
        mediaPlayControlContext.mRuntimeLevel = getRuntimeLevel();
        return Build.VERSION.SDK_INT <= 27 && mediaPlayControlContext.mRuntimeLevel > 2;
    }

    public boolean isLowLevelDevice(MediaPlayControlContext mediaPlayControlContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba31588a", new Object[]{this, mediaPlayControlContext})).booleanValue();
        }
        int deviceLevel = getDeviceLevel();
        mediaPlayControlContext.mRuntimeLevel = deviceLevel;
        try {
            if (oyu.a("lowPerformance")) {
                z = oyu.B().contains(Build.MODEL.replace(" ", ""));
                if (!z) {
                    try {
                        if (isMatchCPUWhiteListRule(oyu.C())) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        AVSDKLog.e(c.MODULE_SDK_PAGE, "get 1080p lowLevel Device whiteList error: " + th.toString());
                        if (deviceLevel != 2) {
                        }
                    }
                }
            } else {
                z = false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return deviceLevel != 2 && !z;
    }

    public boolean isLowPerformanceByAB(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d0c3218", new Object[]{this, mediaPlayControlContext})).booleanValue();
        }
        if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_USE_DEVICE_LEVEL, "true")) || getEnableLowPerformanceFromAB()) {
            return isLowLevelDevice(mediaPlayControlContext);
        }
        return isLowPerformance(mediaPlayControlContext);
    }

    public boolean isLowPerformance(com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffb74da0", new Object[]{this, cVar})).booleanValue();
        }
        cVar.I = getRuntimeLevel();
        return Build.VERSION.SDK_INT <= 27 && cVar.I > 2;
    }

    public boolean isLowLevelDevice(com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80c45096", new Object[]{this, cVar})).booleanValue();
        }
        int deviceLevel = getDeviceLevel();
        cVar.I = deviceLevel;
        return deviceLevel == 2;
    }

    public boolean isLowPerformanceByAB(com.taobao.taobaoavsdk.widget.media.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe30fac8", new Object[]{this, cVar})).booleanValue();
        }
        if (b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_USE_DEVICE_LEVEL, "true")) || getEnableLowPerformanceFromAB()) {
            return isLowLevelDevice(cVar);
        }
        return isLowPerformance(cVar);
    }

    public boolean getEnableLowPerformanceFromAB() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f116cf4b", new Object[]{this})).booleanValue();
        }
        try {
            if (!oyu.a("lowPerformance")) {
                return false;
            }
            z = oyu.A();
            this.mExperienceId = oyu.b("lowPerformance");
            this.mBucketId = oyu.c("lowPerformance");
            this.mReleaseId = oyu.d("lowPerformance");
            return z;
        } catch (Throwable th) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "initLowSpeedPolicyABIfNeeded error: " + th.toString());
            return z;
        }
    }

    private int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        int c = oyu.c();
        if (c >= 0 && c <= 2) {
            return c;
        }
        try {
            return akt.a();
        } catch (Throwable th) {
            AVSDKLog.d("MediaMeasureAdapter", " MediaMeasureAdapter isLowPerformance error:" + th.getMessage());
            return -100;
        }
    }

    private int getRuntimeLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f9ec87c", new Object[]{this})).intValue();
        }
        try {
            if (System.currentTimeMillis() - this.mLastMeausreTime >= 7000 || this.mLastMeausreResult < 0) {
                this.mLastMeausreTime = System.currentTimeMillis();
                this.mLastMeausreResult = aks.a().g().d;
            }
            return this.mLastMeausreResult;
        } catch (Throwable th) {
            AVSDKLog.d("MediaMeasureAdapter", " MediaMeasureAdapter isLowPerformance error:" + th.getMessage());
            return 1;
        }
    }

    public void addLowDeviceExpInfo(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9518e38", new Object[]{this, mediaPlayControlContext});
        } else if (mediaPlayControlContext == null) {
        } else {
            if (mediaPlayControlContext.mExperienceIdSet != null && this.mExperienceId != 0) {
                mediaPlayControlContext.mExperienceIdSet.add(Long.valueOf(this.mExperienceId));
            }
            if (mediaPlayControlContext.mExperienceBucketIdSet != null && this.mBucketId != 0) {
                mediaPlayControlContext.mExperienceBucketIdSet.add(Long.valueOf(this.mBucketId));
            }
            if (mediaPlayControlContext.mExperienceReleaseIdSet == null || this.mReleaseId == 0) {
                return;
            }
            mediaPlayControlContext.mExperienceReleaseIdSet.add(Long.valueOf(this.mReleaseId));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
        r11 = r8.getString("minSDK");
        r2 = r8.getString("minMem");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
        if ("*".equals(r11) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (com.taobao.taobaoavsdk.util.b.b(r11) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
        if (r3 < com.taobao.taobaoavsdk.util.b.b(r11)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
        if ("*".equals(r2) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (com.taobao.taobaoavsdk.util.b.b(r2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r6 < com.taobao.taobaoavsdk.util.b.b(r2)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isMatchCPUWhiteListRule(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "*"
            java.lang.String r1 = "AVSDK"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.media.MediaMeasureAdapter.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L20
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r10
            r0[r4] = r11
            java.lang.String r11 = "1bf4b22b"
            java.lang.Object r11 = r2.ipc$dispatch(r11, r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L20:
            boolean r2 = android.text.StringUtils.isEmpty(r11)
            if (r2 == 0) goto L27
            return r5
        L27:
            java.lang.String r2 = com.taobao.taobaoavsdk.util.b.a()     // Catch: java.lang.Throwable -> Laa
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Laa
            int r6 = tb.oyu.g()     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r7.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = "deivceCPU="
            r7.append(r8)     // Catch: java.lang.Throwable -> Laa
            r7.append(r2)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = " osVersion="
            r7.append(r8)     // Catch: java.lang.Throwable -> Laa
            r7.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = " deviceMem="
            r7.append(r8)     // Catch: java.lang.Throwable -> Laa
            r7.append(r6)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Laa
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r7)     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L58
            return r5
        L58:
            com.alibaba.fastjson.JSONArray r11 = com.alibaba.fastjson.JSON.parseArray(r11)     // Catch: java.lang.Throwable -> Laa
            r7 = 0
        L5d:
            int r8 = r11.size()     // Catch: java.lang.Throwable -> Laa
            if (r7 >= r8) goto Lc3
            java.lang.Object r8 = r11.get(r7)     // Catch: java.lang.Throwable -> Laa
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8     // Catch: java.lang.Throwable -> Laa
            java.lang.String r9 = "targetCPU"
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> Laa
            boolean r9 = r2.equals(r9)     // Catch: java.lang.Throwable -> Laa
            if (r9 == 0) goto La7
            java.lang.String r11 = "minSDK"
            java.lang.String r11 = r8.getString(r11)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "minMem"
            java.lang.String r2 = r8.getString(r2)     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r0.equals(r11)     // Catch: java.lang.Throwable -> Laa
            if (r7 != 0) goto L94
            int r7 = com.taobao.taobaoavsdk.util.b.b(r11)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto Lc3
            int r11 = com.taobao.taobaoavsdk.util.b.b(r11)     // Catch: java.lang.Throwable -> Laa
            if (r3 < r11) goto Lc3
        L94:
            boolean r11 = r0.equals(r2)     // Catch: java.lang.Throwable -> Laa
            if (r11 != 0) goto Lc4
            int r11 = com.taobao.taobaoavsdk.util.b.b(r2)     // Catch: java.lang.Throwable -> Laa
            if (r11 == 0) goto Lc3
            int r11 = com.taobao.taobaoavsdk.util.b.b(r2)     // Catch: java.lang.Throwable -> Laa
            if (r6 < r11) goto Lc3
            goto Lc4
        La7:
            int r7 = r7 + 1
            goto L5d
        Laa:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Judge isMatchWhiteListRule error."
            r0.append(r2)
            java.lang.String r11 = r11.toString()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r1, r11)
        Lc3:
            r4 = 0
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.media.MediaMeasureAdapter.isMatchCPUWhiteListRule(java.lang.String):boolean");
    }
}
