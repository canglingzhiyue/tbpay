package com.taobao.android.diagnose.snapshot;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.android.diagnose.common.DiagnoseType;
import com.taobao.android.diagnose.common.g;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.snapshot.e;
import com.taobao.android.diagnose.v;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.log.TLog;
import com.taobao.tinct.impl.collect.ChangeRecord;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String d;

    /* renamed from: a */
    public com.taobao.android.diagnose.collector.e f11729a;
    private File b = new File(com.taobao.android.diagnose.c.a().g(), "snapshot");
    private b c;

    /* renamed from: lambda$Y3MuVCbvntUKh-XL32aK0pQayPU */
    public static /* synthetic */ void m913lambda$Y3MuVCbvntUKhXL32aK0pQayPU(e eVar, File file) {
        eVar.d(file);
    }

    public static /* synthetic */ File a(e eVar, String str, DiagnoseType diagnoseType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("92d33c93", new Object[]{eVar, str, diagnoseType}) : eVar.a(str, diagnoseType);
    }

    static {
        kge.a(1775768988);
        a();
    }

    public e(Context context) {
        if (!this.b.exists()) {
            this.b.mkdirs();
        }
        this.c = new f(context);
    }

    public static synchronized String a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
            }
            String str = d;
            d = c();
            com.taobao.android.diagnose.config.a.a(com.taobao.android.diagnose.c.a().b(), d);
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo("snapshotID", d);
            v.a("SnapshotManager", String.format("updateSnapshotID from %s to %s", str, d));
            return str;
        }
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        com.taobao.android.diagnose.model.a d2 = com.taobao.android.diagnose.c.a().d();
        String str = d2 != null ? d2.i().utdid : "";
        String a2 = g.a();
        String a3 = com.taobao.orange.util.c.a(String.format("%d_%s_%s", Long.valueOf(System.currentTimeMillis()), a2, str));
        return TextUtils.isEmpty(a3) ? String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), a2) : a3;
    }

    public synchronized void a(String str, DiagnoseType diagnoseType, com.taobao.android.diagnose.model.a aVar, Map<String, String> map) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f5f392", new Object[]{this, str, diagnoseType, aVar, map});
            return;
        }
        try {
            if (this.f11729a != null && diagnoseType != DiagnoseType.NativeCrash) {
                this.f11729a.b();
            }
            b = b(str, diagnoseType, aVar, map);
        } catch (Exception e) {
            v.a("SnapshotManager", "Failed to uploadDiagnoseInfo: ", e);
        }
        if (!TextUtils.isEmpty(b)) {
            if (!a(a(str, diagnoseType), b)) {
                TLog.loge("Diagnose", "SnapshotManager", "Failed to save the diagnose to file.");
                com.taobao.android.diagnose.common.b.a(str, diagnoseType.getIndex(), 7);
                if (diagnoseType == DiagnoseType.JavaCrash || diagnoseType == DiagnoseType.NativeCrash) {
                    a(diagnoseType, str, b);
                }
                return;
            }
            com.taobao.android.diagnose.common.b.a(str, diagnoseType.getIndex(), 2);
            if (diagnoseType == DiagnoseType.NativeCrash) {
                return;
            }
            a(diagnoseType, str, b);
            return;
        }
        com.taobao.android.diagnose.common.b.a(str, diagnoseType.getIndex(), 9);
        TLog.loge("Diagnose", "SnapshotManager", "Failed to formatDiagnoseInfo.");
    }

    private void a(final File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            return;
        }
        v.a("SnapshotManager", "upload snapshotFile: " + file.getName());
        if (!file.exists()) {
            TLog.loge("Diagnose", "SnapshotManager", "The snapshot file is not exist: " + file.getAbsolutePath());
        } else if (!com.taobao.android.diagnose.config.a.d()) {
            v.d("SnapshotManager", "Diagnose upload is disable");
        } else {
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.snapshot.-$$Lambda$e$Y3MuVCbvntUKh-XL32aK0pQayPU
                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.m913lambda$Y3MuVCbvntUKhXL32aK0pQayPU(e.this, file);
                }
            });
        }
    }

    public /* synthetic */ void d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f396c522", new Object[]{this, file});
            return;
        }
        try {
            String name = file.getName();
            if (!name.endsWith(".snapshot")) {
                file.delete();
                return;
            }
            String[] split = name.substring(0, name.lastIndexOf(".snapshot")).split("_");
            if (split.length != 2) {
                return;
            }
            String str = split[0];
            String str2 = split[1];
            String b = b(file);
            if (TextUtils.isEmpty(b)) {
                file.delete();
                TLog.loge("Diagnose", "SnapshotManager", "The snapshot file is empty: " + file.getAbsolutePath());
                return;
            }
            a(DiagnoseType.parseByType(str2), str, b);
        } catch (Exception e) {
            v.a("SnapshotManager", "uploadSnapshotFile runnable: ", e);
        }
    }

    public boolean a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr == null || strArr.length < 3 || !"scene_native_crash".equals(strArr[0])) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - Long.parseLong(strArr[2]) > 43200000) {
                return false;
            }
            String absolutePath = a(strArr[1], DiagnoseType.NativeCrash).getAbsolutePath();
            String[] list = this.b.list();
            if (list != null) {
                for (String str : list) {
                    if (absolutePath.equals(str)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        File[] listFiles = this.b.listFiles($$Lambda$e$IkuLznEU5Cq2sthL9UqsxrKd8wU.INSTANCE);
        if (listFiles == null || listFiles.length == 0) {
            v.a("SnapshotManager", "Can't find the snapshot file");
            return;
        }
        for (File file : listFiles) {
            try {
                if (System.currentTimeMillis() - file.lastModified() < com.taobao.android.diagnose.config.a.f() * 86400000) {
                    a(file);
                } else {
                    file.delete();
                }
            } catch (Exception e) {
                v.a("SnapshotManager", "uploadSnapshotFiles", e);
            }
        }
    }

    public static /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{file})).booleanValue();
        }
        if (file.isFile()) {
            if (file.getName().endsWith(".snapshot")) {
                return true;
            }
            file.delete();
        }
        return false;
    }

    private void a(DiagnoseType diagnoseType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30416cf", new Object[]{this, diagnoseType, str, str2});
        } else if (!com.taobao.android.diagnose.config.a.d()) {
            com.taobao.android.diagnose.common.b.a(str, diagnoseType.getIndex(), 6);
            v.d("SnapshotManager", "Diagnose upload is disable");
        } else {
            v.a("SnapshotManager", "uploadDiagnoseInfo: " + str);
            this.c.a(str, str2, new AnonymousClass1(diagnoseType));
            com.taobao.android.diagnose.common.b.a(str, diagnoseType.getIndex(), 3);
        }
    }

    /* renamed from: com.taobao.android.diagnose.snapshot.e$1 */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ DiagnoseType f11730a;

        public static /* synthetic */ void lambda$TiNpUcjG4Egj_mHU0_3V6Tpe57c(AnonymousClass1 anonymousClass1, String str, DiagnoseType diagnoseType) {
            anonymousClass1.a(str, diagnoseType);
        }

        public AnonymousClass1(DiagnoseType diagnoseType) {
            e.this = r1;
            this.f11730a = diagnoseType;
        }

        @Override // com.taobao.android.diagnose.snapshot.c
        public void a(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            com.taobao.android.diagnose.common.c a2 = com.taobao.android.diagnose.common.c.a();
            final DiagnoseType diagnoseType = this.f11730a;
            a2.a(new Runnable() { // from class: com.taobao.android.diagnose.snapshot.-$$Lambda$e$1$TiNpUcjG4Egj_mHU0_3V6Tpe57c
                @Override // java.lang.Runnable
                public final void run() {
                    e.AnonymousClass1.lambda$TiNpUcjG4Egj_mHU0_3V6Tpe57c(e.AnonymousClass1.this, str, diagnoseType);
                }
            });
        }

        public /* synthetic */ void a(String str, DiagnoseType diagnoseType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99c1b8b1", new Object[]{this, str, diagnoseType});
                return;
            }
            com.taobao.android.diagnose.common.b.a(str, diagnoseType.getIndex(), 4);
            TLog.loge("Diagnose", "SnapshotManager", "Success to upload diagnose info: " + str);
            File a2 = e.a(e.this, str, diagnoseType);
            if (!a2.exists() || !a2.delete()) {
                return;
            }
            v.a("SnapshotManager", "Delete file after upload: " + a2.getName());
        }

        @Override // com.taobao.android.diagnose.snapshot.c
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            com.taobao.android.diagnose.common.b.a(str, this.f11730a.getIndex(), 5);
            TLog.loge("Diagnose", "SnapshotManager", String.format("Upload diagnose info %s failed. ErrorCode=%s,ErrorMsg=%s", str, str2, str3));
        }
    }

    private String b(String str, DiagnoseType diagnoseType, com.taobao.android.diagnose.model.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f154dcf", new Object[]{this, str, diagnoseType, aVar, map});
        }
        v.a("SnapshotManager", "formatDiagnoseInfo: " + str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snapshotID", (Object) str);
            jSONObject.put("type", Integer.valueOf(diagnoseType.getIndex()));
            jSONObject.put("triggerTime", Long.valueOf(System.currentTimeMillis()));
            jSONObject.put("background", aVar.b());
            ChangeRecord g = aVar.g();
            if (g != null) {
                JSONObject jSONObject2 = new JSONObject();
                if (!g.orangeChangeMap.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (OrangeChangeInfo orangeChangeInfo : g.orangeChangeMap.values()) {
                        if (!orangeChangeInfo.isExpire()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(NotificationStyle.NOTIFICATION_STYLE, (Object) orangeChangeInfo.getNameSpace());
                            jSONObject3.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, (Object) orangeChangeInfo.getVersion());
                            jSONObject3.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_gray, (Object) Boolean.valueOf(orangeChangeInfo.isGray()));
                            jSONObject3.put("used", (Object) Boolean.valueOf(orangeChangeInfo.isUsed()));
                            jSONObject3.put("time", (Object) Long.valueOf(orangeChangeInfo.getUpdateTime()));
                            jSONArray.add(jSONObject3);
                        }
                    }
                    jSONObject2.put("orange", (Object) jSONArray);
                }
                if (!g.abInfoMap.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (ABChangeInfo aBChangeInfo : g.abInfoMap.values()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("experimentId", (Object) aBChangeInfo.getExperimentId());
                        jSONObject4.put("bucketId", (Object) aBChangeInfo.getBucketId());
                        jSONObject4.put("publishId", (Object) aBChangeInfo.getPublishId());
                        jSONArray2.add(jSONObject4);
                    }
                    jSONObject2.put("ab", (Object) jSONArray2);
                }
                if (g.instantPatchInfo != null && !TextUtils.isEmpty(g.instantPatchInfo.getVersion())) {
                    JSONArray jSONArray3 = new JSONArray();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("type", (Object) Baggage.Amnet.SECURITY_INSTANT);
                    jSONObject5.put("version", (Object) g.instantPatchInfo.getVersion());
                    jSONArray3.add(jSONObject5);
                    jSONObject2.put("escort", (Object) jSONArray3);
                }
                String customTinctTag = g.getCustomTinctTag();
                if (!TextUtils.isEmpty(customTinctTag)) {
                    jSONObject2.put("custom", (Object) customTinctTag);
                }
                jSONObject.put("changeInfo", (Object) jSONObject2);
            }
            List<PageInfo> j = aVar.j();
            if (!j.isEmpty()) {
                jSONObject.put("historyPages", (Object) j);
            }
            jSONObject.put("netInfo", aVar.e());
            com.taobao.android.diagnose.model.b f = aVar.f();
            if (f != null) {
                jSONObject.put("runtimeInfo", f.a());
            }
            if (!aVar.h().isEmpty()) {
                jSONObject.put("flag", aVar.h());
            }
            jSONObject.put(RVConstants.EXTRA_APPINFO, aVar.i());
            jSONObject.put(com.taobao.tao.log.statistics.d.PARAM_IS_INNER, Boolean.valueOf(aVar.i().isInner));
            if (map != null && !map.isEmpty()) {
                jSONObject.put("typeInfo", (Object) map);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            v.a("SnapshotManager", "Failed to formatDiagnoseInfo: ", e);
            return null;
        }
    }

    private File a(String str, DiagnoseType diagnoseType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("be4573fc", new Object[]{this, str, diagnoseType}) : new File(this.b, String.format("%s_%d%s", str, Integer.valueOf(diagnoseType.getIndex()), ".snapshot"));
    }

    private boolean a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{this, file, str})).booleanValue();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();
            channel.write(Charset.forName("utf8").encode(str));
            if (channel != null) {
                channel.close();
            }
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            v.a("SnapshotManager", "saveDiagnoseToFile", e);
            return false;
        }
    }

    private String b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa476700", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            v.a("SnapshotManager", "readDiagnoseFromFile", e);
        }
        return sb.toString();
    }
}
