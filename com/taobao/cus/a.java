package com.taobao.cus;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.cus.CusDataController;
import com.taobao.cus.config.model.CusContentModel;
import com.taobao.cus.config.model.CusModel;
import com.taobao.tao.Globals;
import com.taobao.update.datasource.local.UpdateInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import tb.bgy;
import tb.kge;
import tb.khd;
import tb.khf;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.mre;
import tb.mrh;
import tb.mwh;
import tb.mxr;
import tb.nks;
import tb.nkt;
import tb.noa;
import tb.rfy;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Application f16934a;
    private CusDataController b;

    /* renamed from: com.taobao.cus.a$a */
    /* loaded from: classes7.dex */
    public static class C0650a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final a f16937a;

        static {
            kge.a(-187152976);
            f16937a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("227ec1dd", new Object[0]) : f16937a;
        }
    }

    static {
        kge.a(-901253411);
    }

    /* renamed from: lambda$sis7T8k8LMqO0Rqvo-MyhUP1j5A */
    public static /* synthetic */ void m1055lambda$sis7T8k8LMqO0RqvoMyhUP1j5A(a aVar) {
        aVar.o();
    }

    public static /* synthetic */ CusDataController a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CusDataController) ipChange.ipc$dispatch("c6bc8c48", new Object[]{aVar}) : aVar.b;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("227ec1dd", new Object[0]) : C0650a.a();
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.f16934a = application;
        this.b = new CusDataController();
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.f16934a;
    }

    public void c() {
        CusContentModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!mre.a().b()) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.requestUpdateInfo.isNewStrategyEnable=false.return", new Object[0]);
        } else if (nkt.a(this.f16934a)) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.requestUpdateInfo.isGPChannel=true.return", new Object[0]);
        } else if (!mrh.b(mrh.SP_KEY_IGNORE_NEXT_MTOP_TIME, false) && (a2 = this.b.a()) != null && a2.nextRefreshTime > PopLayer.getReference().getCurrentTimeStamp(false) / 1000) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.requestUpdateInfo.nextRefreshTimeNotReach.nextRefreshTime=%s", Long.valueOf(a2.nextRefreshTime));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("taobao_android");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("canJumpStoreAutoUpdate", (Object) String.valueOf(nkt.b((Context) this.f16934a)));
            if (mre.a().h()) {
                jSONObject.put("arch", (Object) String.valueOf(mwh.a(this.f16934a)));
            } else {
                jSONObject.put("arch", (Object) "-1");
            }
            khd.a().a("promote_update", arrayList, jSONObject, new khf() { // from class: com.taobao.cus.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // tb.khf
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.requestUpdateInfo.onResponseSuccess=%s", str);
                        CusModel cusModel = (CusModel) JSONObject.parseObject(str).getJSONObject("contentMap").getObject("promote_update", CusModel.class);
                        if (!cusModel.success || cusModel.content == null || cusModel.content.isEmpty()) {
                            return;
                        }
                        a.a(a.this).a(cusModel.content.get(0));
                    }
                }

                @Override // tb.khf
                public void b(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.requestUpdateInfo.onResponseError=%s", str);
                    }
                }
            });
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        CusDataController.ApkDownloadContext d = this.b.d();
        if (d == null) {
            return null;
        }
        kmo kmoVar = new kmo();
        kmoVar.b = d.fileSize;
        kmoVar.d = d.fileName;
        return com.taobao.downloader.b.a().a(l(), kmoVar);
    }

    private String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        return nkt.a((Context) PopLayer.getReference().getApp()) + "/appupdate/preDownload/";
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        boolean b = mre.a().b();
        boolean c = mre.a().c();
        boolean a2 = nkt.a(this.f16934a);
        com.alibaba.poplayer.utils.c.b("apkDownload", "", "wifiPreDownloadEnable" + c + ".isNewStrategyEnable=" + b + ".isGPChannel=" + a2);
        return b && c && !a2;
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        try {
            Boolean bool = (Boolean) com.taobao.global.setting.c.a(PopLayer.getReference().getApp(), "architecture").b().a("architecture", mxr.KEY_WIFI_AUTO_DOWNLOAD, true, null);
            if (bool != null) {
                if (bool.equals(Boolean.TRUE)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.isDownloadStrategySettingsEnable.error", th);
            return false;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : e() && m();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.b.c();
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : jSONObject.containsKey(noa.KEY_IS_BETA) && jSONObject.containsKey("batchType") && jSONObject.containsKey("batchCreateTime");
    }

    public String h() {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        try {
            UpdateInfo.UpdateData b = this.b.b();
            if (b != null && b.value != null && !b.value.isEmpty()) {
                JSONObject jSONObject = b.value;
                String string = jSONObject.getString("version");
                if (a(jSONObject)) {
                    boolean booleanValue = jSONObject.getBooleanValue(noa.KEY_IS_BETA);
                    String string2 = jSONObject.getString("batchType");
                    a2 = !booleanValue && "FULL".equals(string2);
                    com.alibaba.poplayer.utils.c.a("Updater.isInUpdatePeriod.isBeta=%s.batchType=%s", Boolean.valueOf(booleanValue), string2);
                } else {
                    a2 = nkt.a(string);
                    com.alibaba.poplayer.utils.c.a("Updater.isInUpdatePeriod.appVersion=%s", string);
                }
                if (a2) {
                    return "";
                }
                com.alibaba.poplayer.utils.c.a("Updater.isInUpdatePeriod.isNotOfficialVersion", new Object[0]);
                return "NOT_OFFICIAL_FULL_VERSION";
            }
            com.alibaba.poplayer.utils.c.a("Updater.isInUpdatePeriod.apkUpdateData=null", new Object[0]);
            return "APK_VALUE_NULL";
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("BaseDownloadCenter.isInUpdatePeriod.error", th);
            return com.taobao.desktop.channel.calendar.a.CALENDAR_ERROR_CATCH;
        }
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            CusDataController.ApkDownloadContext d = this.b.d();
            HashMap hashMap = new HashMap();
            if (d == null) {
                hashMap.put("errorCode", "lastDownloadContextIsNull");
                hashMap.put("success", "false");
                nks.a(nks.MONITOR_POINT_INSTALL_APK, null, hashMap);
                nks.b("PreDownloadInstallApkFail", null, hashMap);
                com.alibaba.poplayer.utils.c.a("PreDownloadCenter.installApk.lastDownloadContext=null", new Object[0]);
                return false;
            } else if (TextUtils.isEmpty(d.filePath)) {
                hashMap.put("errorCode", "filePathIsNull");
                hashMap.put("success", "false");
                nks.a(nks.MONITOR_POINT_INSTALL_APK, d, hashMap);
                nks.b("PreDownloadInstallApkFail", d, hashMap);
                com.alibaba.poplayer.utils.c.a("PreDownloadCenter.installApk.lastDownloadContext.filePath=null", new Object[0]);
                return false;
            } else {
                File file = new File(d.filePath);
                if (file.exists() && file.getPath().endsWith(bgy.APK_EXTENSION)) {
                    context.startActivity(nkt.a(context, file));
                    hashMap.put("errorCode", "");
                    hashMap.put("success", "true");
                    nks.a(nks.MONITOR_POINT_INSTALL_APK, d, hashMap);
                    nks.b(nks.MONITOR_POINT_INSTALL_APK, d, hashMap);
                    return true;
                }
                hashMap.put("errorCode", "fileNotExistOrInvalid");
                hashMap.put("success", "false");
                nks.a(nks.MONITOR_POINT_INSTALL_APK, d, hashMap);
                nks.b("PreDownloadInstallApkFail", d, hashMap);
                com.alibaba.poplayer.utils.c.a("PreDownloadCenter.installApk.lastDownloadContext.fileNotExistOrInvalid", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.installApk.error", th);
            return false;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        nks.b(nks.MONITOR_POINT_START, null, null);
        boolean e = e();
        boolean m = m();
        HashMap hashMap = new HashMap();
        if (!e || !m) {
            if (!e) {
                hashMap.put("errorCode", "downloadStrategyEnableIsFalse");
            } else {
                hashMap.put("errorCode", "downloadStrategySettingsEnableIsFalse");
            }
            hashMap.put("success", "false");
            nks.a(nks.MONITOR_POINT_START, null, hashMap);
            nks.b("PreDownloadStartFail", null, hashMap);
            com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.enable=false.downloadStrategyEnable=%s.downloadStrategySettingsEnable=%s", Boolean.valueOf(e), Boolean.valueOf(m));
        } else if (!g()) {
            hashMap.put("errorCode", "needUpdate=false");
            hashMap.put("success", "false");
            nks.a(nks.MONITOR_POINT_START, null, hashMap);
            nks.b("PreDownloadStartFail", null, hashMap);
            com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.needUpdate=false", new Object[0]);
        } else {
            CusContentModel a2 = this.b.a();
            if (a2 == null) {
                hashMap.put("errorCode", "updateStrategyIsNull");
                hashMap.put("success", "false");
                nks.a(nks.MONITOR_POINT_START, null, hashMap);
                nks.b("PreDownloadStartFail", null, hashMap);
                com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.updateStrategyIsNull", new Object[0]);
            } else if (!"preDownload".equals(a2.updateStrategy)) {
                hashMap.put("errorCode", "updateStrategyNotPreDownload.updateStrategy=" + a2.updateStrategy);
                hashMap.put("success", "false");
                nks.a(nks.MONITOR_POINT_START, null, hashMap);
                nks.b("PreDownloadStartFail", null, hashMap);
                com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.updateStrategyNotPreDownload.updateStrategy=%s", a2.updateStrategy);
            } else if (!a(a2)) {
                hashMap.put("errorCode", "notHitPreDownloadTimeWindow");
                hashMap.put("success", "false");
                nks.a(nks.MONITOR_POINT_START, null, hashMap);
                nks.b("PreDownloadStartFail", null, hashMap);
                com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.notHitPreDownloadTimeWindow", new Object[0]);
            } else {
                final CusDataController.ApkDownloadContext b = b(a2);
                if (b == null) {
                    hashMap.put("errorCode", "apkDownloadContextIsFalse");
                    hashMap.put("success", "false");
                    nks.a(nks.MONITOR_POINT_START, null, hashMap);
                    nks.b("PreDownloadStartFail", null, hashMap);
                    com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.apkDownloadContext=null.return", new Object[0]);
                    return;
                }
                String d = d();
                if (!TextUtils.isEmpty(d)) {
                    hashMap.put("errorCode", "AlreadyExist");
                    hashMap.put("success", "false");
                    nks.a(nks.MONITOR_POINT_START, b, hashMap);
                    nks.b("PreDownloadStartFail", b, hashMap);
                    com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.fileIsReady.return.apkFileReadyPath=%s", d);
                    return;
                }
                com.alibaba.poplayer.utils.c.a("Updater.startPreDownload.", new Object[0]);
                a(b, new kml() { // from class: com.taobao.cus.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        a.this = this;
                    }

                    @Override // tb.kml
                    public void onDownloadProgress(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                        } else {
                            com.alibaba.poplayer.utils.c.a("Updater.startDownload.onDownloadProgress.i=%s", Integer.valueOf(i));
                        }
                    }

                    @Override // tb.kml
                    public void onDownloadError(String str, int i, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                            return;
                        }
                        com.alibaba.poplayer.utils.c.a("Updater.startDownload.onDownloadError.url=%s.errorCode=%s.msg=%s", str, Integer.valueOf(i), str2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("errorCode", String.valueOf(i));
                        hashMap2.put("success", "false");
                        nks.a(nks.MONITOR_POINT_FINISH, b, hashMap2);
                        nks.b("PreDownloadError", b, hashMap2);
                    }

                    @Override // tb.kml
                    public void onDownloadFinish(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                            return;
                        }
                        com.alibaba.poplayer.utils.c.a("Updater.startDownload.onDownloadFinish.url=%s.filePath=%s", str, str2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("errorCode", "");
                        hashMap2.put("success", "true");
                        nks.a(nks.MONITOR_POINT_FINISH, b, hashMap2);
                        nks.b(nks.MONITOR_POINT_FINISH, b, hashMap2);
                    }

                    @Override // tb.kml
                    public void onDownloadStateChange(String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                            return;
                        }
                        com.alibaba.poplayer.utils.c.a("Updater.startDownload.onDownloadStateChange.url=%s.isDownloading=%s", str, Boolean.valueOf(z));
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("url", str);
                        hashMap2.put("isDownloading", String.valueOf(z));
                        nks.b("PreDownloadDownloadStateChange", b, hashMap2);
                    }

                    @Override // tb.kml
                    public void onFinish(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        com.alibaba.poplayer.utils.c.a("Updater.startDownload.onFinish.result=%s", Boolean.valueOf(z));
                        nks.b("PreDownloadOnFinish", b, null);
                    }

                    @Override // tb.kml
                    public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                            return;
                        }
                        com.alibaba.poplayer.utils.c.a("Updater.startDownload.onNetworkLimit.i=%s", Integer.valueOf(i));
                        nks.b("PreDownloadNetWorkLimit", b, null);
                    }
                });
                hashMap.put("errorCode", "");
                hashMap.put("success", "true");
                nks.a(nks.MONITOR_POINT_START, b, hashMap);
                nks.b("PreDownloadStartSuccess", b, hashMap);
            }
        }
    }

    private CusDataController.ApkDownloadContext b(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CusDataController.ApkDownloadContext) ipChange.ipc$dispatch("5f70721", new Object[]{this, cusContentModel});
        }
        if (cusContentModel != null) {
            try {
                if (cusContentModel.success && cusContentModel.downloadApk != null) {
                    CusDataController.ApkDownloadContext apkDownloadContext = new CusDataController.ApkDownloadContext();
                    apkDownloadContext.appVersion = cusContentModel.updateAppVersion;
                    apkDownloadContext.downloadUrl = cusContentModel.downloadApk.url;
                    apkDownloadContext.fileMd5 = cusContentModel.downloadApk.md5;
                    apkDownloadContext.fileSize = Long.parseLong(cusContentModel.downloadApk.fileSize);
                    return apkDownloadContext;
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("UpdateDataController.createApkDownloadContext.error", th);
                return null;
            }
        }
        com.alibaba.poplayer.utils.c.a("UpdateDataController.startPreDownload.mUpdateContentModel=null", new Object[0]);
        return null;
    }

    private long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : mrh.b(mrh.SP_KEY_POP_EXPOSE_TIME, 0L);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        CusContentModel a2 = this.b.a();
        if (a2 == null || a2.freqIntervalSecs <= 0) {
            Object[] objArr = new Object[1];
            objArr[0] = a2 != null ? Long.valueOf(a2.freqIntervalSecs) : "null";
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.checkPopExposeInterval.freqIntervalSecsInValid=%s", objArr);
            return false;
        }
        long c = c(a2);
        if (c <= 0) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.checkPopExposeInterval.nextExposeTime<=0.nextExposeTime=%s", Long.valueOf(c));
            return true;
        }
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        boolean z = c < currentTimeStamp;
        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.checkPopExposeInterval.passInterval=%s.nextExposeTime=%s.freqIntervalSecs=%s.curTime=%s", Boolean.valueOf(z), Long.valueOf(c), Long.valueOf(a2.freqIntervalSecs), Long.valueOf(currentTimeStamp));
        return z;
    }

    public boolean a(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b13023e", new Object[]{this, cusContentModel})).booleanValue();
        }
        if (cusContentModel == null || cusContentModel.freqIntervalSecs <= 0) {
            Object[] objArr = new Object[1];
            objArr[0] = cusContentModel != null ? Long.valueOf(cusContentModel.freqIntervalSecs) : "null";
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.hitPreDownloadTimeWindow.freqIntervalSecsInValid=%s", objArr);
            return false;
        }
        long c = c(cusContentModel);
        if (c <= 0) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.hitPreDownloadTimeWindow.nextExposeTime<=0.nextExposeTime=%s", Long.valueOf(c));
            return true;
        }
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        long g = mre.a().g() * 24 * 3600;
        boolean z = currentTimeStamp > c - g;
        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.hitPreDownloadTimeWindow.canDownload=%s.curTime=%s.nextExposeTime=%s.preDownloadWindowSec=%s", Boolean.valueOf(z), Long.valueOf(currentTimeStamp), Long.valueOf(c), Long.valueOf(g));
        return z;
    }

    private long c(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e664e6c", new Object[]{this, cusContentModel})).longValue();
        }
        long d = d(cusContentModel);
        long e = e(cusContentModel);
        long max = Math.max(e, d);
        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.getNextExposeTime.finalExpectTime=%s.globalPopExpectTime=%s.popLayerPopExpectTime=%s", Long.valueOf(max), Long.valueOf(d), Long.valueOf(e));
        return max;
    }

    private long d(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("500ff48b", new Object[]{this, cusContentModel})).longValue();
        }
        long lastPopTime = rfy.getLastPopTime();
        if (lastPopTime <= 0) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.getGlobalPopExpectTime.lastGlobalPopExposeTime<=0.lastGlobalPopExposeTime=%s", Long.valueOf(lastPopTime));
            return -1L;
        }
        long f = mre.a().f() * 24 * 3600;
        long j = cusContentModel.freqIntervalSecs < f ? cusContentModel.freqIntervalSecs : f;
        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.getGlobalPopExpectTime.intervalSec=%s.freqIntervalSecs=%s.globalPopIntervalSec=%s.", Long.valueOf(j), Long.valueOf(cusContentModel.freqIntervalSecs), Long.valueOf(f));
        long j2 = (1000 * j) + lastPopTime;
        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.getGlobalPopExpectTime.globalPopExpectTime=%s.lastGlobalPopExposeTime=%s.intervalSec=%s", Long.valueOf(j2), Long.valueOf(lastPopTime), Long.valueOf(j));
        return j2;
    }

    private long e(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41b99aaa", new Object[]{this, cusContentModel})).longValue();
        }
        long n = n();
        if (n > 0) {
            return n + (cusContentModel.freqIntervalSecs * 1000);
        }
        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.getPopLayerPopExpectTime.lastPopExposeTime<=0.lastPopExposeTime=%s", Long.valueOf(n));
        return -1L;
    }

    private int a(CusDataController.ApkDownloadContext apkDownloadContext, kml kmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa035309", new Object[]{this, apkDownloadContext, kmlVar})).intValue();
        }
        if (apkDownloadContext == null) {
            return -1;
        }
        try {
            String l = l();
            if (TextUtils.isEmpty(l)) {
                return -1;
            }
            kmo kmoVar = new kmo();
            kmoVar.f30167a = apkDownloadContext.downloadUrl;
            kmoVar.d = apkDownloadContext.appVersion + bgy.APK_EXTENSION;
            if (mre.a().e()) {
                kmoVar.c = apkDownloadContext.fileMd5;
            }
            kmoVar.b = apkDownloadContext.fileSize;
            kmm kmmVar = new kmm();
            kmq kmqVar = new kmq();
            kmqVar.f30169a = "newAPPUpdate";
            kmqVar.h = l;
            kmqVar.d = 4;
            kmmVar.b = kmqVar;
            kmmVar.f30166a = new ArrayList();
            kmmVar.f30166a.add(kmoVar);
            apkDownloadContext.fileName = kmoVar.d;
            apkDownloadContext.filePath = new File(l, kmoVar.d).getAbsolutePath();
            this.b.a(apkDownloadContext);
            return com.taobao.downloader.b.a().a(kmmVar, kmlVar);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.startDownload.error", th);
            return -1;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.cus.-$$Lambda$a$sis7T8k8LMqO0Rqvo-MyhUP1j5A
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.m1055lambda$sis7T8k8LMqO0RqvoMyhUP1j5A(a.this);
                }
            });
        }
    }

    public /* synthetic */ void o() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        try {
            String l = l();
            File[] listFiles = new File(l).listFiles();
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.clearApkFiles.storePath=%s.", l);
            if (listFiles != null && listFiles.length != 0) {
                CusContentModel a2 = this.b.a();
                String str = a2 != null ? a2.updateAppVersion : null;
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    String name = file.getName();
                    Object[] objArr = new Object[i];
                    objArr[0] = name;
                    com.alibaba.poplayer.utils.c.a("BaseDownloadCenter.clearApkFiles.fileName=%s.", objArr);
                    if (!TextUtils.isEmpty(name) && name.endsWith(bgy.APK_EXTENSION)) {
                        String substring = name.substring(0, name.indexOf(bgy.APK_EXTENSION));
                        String versionName = Globals.getVersionName();
                        boolean z = nkt.b(versionName, substring) >= 0;
                        if (!z && !TextUtils.isEmpty(str)) {
                            z = nkt.b(str, substring) != 0;
                        }
                        if (z) {
                            file.delete();
                            HashMap hashMap = new HashMap();
                            hashMap.put("fileName", name);
                            hashMap.put("filePath", file.getAbsolutePath());
                            nks.a(nks.MONITOR_POINT_CLEAR_FILES, null, hashMap);
                            nks.b("clearApkFiles", null, hashMap);
                            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.clearApkFile.本地文件版本低.删除.fileVersion=%s.curAppVersion=%s.targetAppVersion=%s", substring, versionName, str);
                        }
                        com.alibaba.poplayer.utils.c.a("PreDownloadCenter.clearApkFile.shouldDelete=%s.fileVersion=%s.curAppVersion=%s.targetAppVersion=%s", Boolean.valueOf(z), substring, versionName, str);
                    }
                    i2++;
                    i = 1;
                }
                return;
            }
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.clearApkFiles.下载目录无文件", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreDownloadCenter.clearApkFiles.error", th);
        }
    }
}
