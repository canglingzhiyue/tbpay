package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tconhook.InlinePatch;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.log.TLog;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.update.framework.d;
import java.io.File;
import java.io.IOException;
import tb.rfo;
import tb.rfz;

/* loaded from: classes9.dex */
public class rfm extends d implements rfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String c;
    private int d = -1;
    private boolean e = false;
    private boolean f = false;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final rfm f33118a;

        static {
            kge.a(-414461472);
            f33118a = new rfm();
        }

        public static /* synthetic */ rfm a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rfm) ipChange.ipc$dispatch("f0a0385", new Object[0]) : f33118a;
        }
    }

    static {
        kge.a(1823433276);
        kge.a(-108454860);
    }

    public static /* synthetic */ Object ipc$super(rfm rfmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rfz
    public void patchProcessListener(rfz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0ecef", new Object[]{this, aVar});
        }
    }

    @Override // tb.rfz
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        File[] listFiles;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
        } else if (jSONObject != null && this.k && this.b != null) {
            try {
                String string = jSONObject.getString("baseVersion");
                int intValue = jSONObject.getIntValue("patchVersion");
                String string2 = jSONObject.getString("patchUrl");
                boolean booleanValue = jSONObject.getBooleanValue("rollback");
                String string3 = jSONObject.getString("md5");
                boolean containsKey = jSONObject.containsKey("beta");
                if ((!StringUtils.isEmpty(string2) || booleanValue) && string != null && string.equals(rgq.getVersionName())) {
                    if (str.equals(rfx.SCAN)) {
                        a("C++ inlinepatch updating ......");
                    }
                    synchronized (this) {
                        if (a()) {
                            return;
                        }
                        if (this.d == intValue) {
                            return;
                        }
                        if (booleanValue) {
                            if (this.d == -1) {
                                return;
                            }
                            rfo.a a2 = new rfo(string2, string3, this.c, this.b).a();
                            if (a2 != null && a2.b) {
                                File[] listFiles2 = a2.f33122a.listFiles();
                                if (listFiles2 == null) {
                                    TLog.loge("tconhook", "failed to read patch files: " + string2);
                                    rfn.onPatchStageFailure("install", 0L, 3, "failed_to_read_patch_files", (long) intValue, containsKey);
                                    return;
                                }
                                for (File file : listFiles2) {
                                    InlinePatch.uninstall(file.getAbsolutePath());
                                }
                            }
                            this.d = -1;
                            a("", "");
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = intValue;
                        rfn.onPatchStageSuccess("revupdate", 0L, 0, "", j, containsKey);
                        rfo.a b = new rfo(string2, string3, this.c, this.b).b();
                        if (b != null && b.b && (listFiles = b.f33122a.listFiles()) != null) {
                            rfn.onPatchStageSuccess("download", System.currentTimeMillis() - currentTimeMillis, 1, "download_success", j, containsKey);
                            for (File file2 : listFiles) {
                                int install = InlinePatch.install(file2.getAbsolutePath());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                String name = file2.getName();
                                if (install != 0) {
                                    TLog.loge("tconhook", name + " patch failed");
                                    i = install;
                                    rfn.onPatchStageFailure("install", currentTimeMillis2 - currentTimeMillis, install, name + "_install_error_code:" + install, j, containsKey);
                                } else {
                                    TLog.loge("tconhook", name + " patch success");
                                    i = install;
                                    rfn.onPatchStageSuccess("install", currentTimeMillis2 - currentTimeMillis, install, name + "_install_error_code:" + install, j, containsKey);
                                    rfn.onPatchSuccess(j, containsKey);
                                }
                                if (rfx.SCAN.equals(str)) {
                                    a("C++ inlinepatch updating result: " + i);
                                }
                            }
                            this.d = intValue;
                            a(String.valueOf(this.d), containsKey ? InstantPatchChangeInfo.TYPE_BETA : InstantPatchChangeInfo.TYPE_RELEASE);
                        } else {
                            TLog.loge("tconhook", "failed to download and unzip patch: " + string2);
                            rfn.onPatchStageFailure("download", System.currentTimeMillis() - currentTimeMillis, 1, "down_and_unzip_error", j, containsKey);
                        }
                    }
                }
            } catch (Throwable th) {
                TLog.loge("tconhook", th.getMessage());
            }
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.rfm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(rfy.sContext, str, 1).show();
                    }
                }
            });
        }
    }

    @Override // com.taobao.update.framework.d
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.k) {
        } else {
            int currentRuntimeCpuArchValue = rgn.getCurrentRuntimeCpuArchValue(context);
            if (currentRuntimeCpuArchValue == 8) {
                this.b = iju.ABI_ARM64;
            } else if (currentRuntimeCpuArchValue == 7) {
                this.b = iju.ABI_ARM;
            }
            this.c = context.getFilesDir().getAbsolutePath() + "/tconcrasper";
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String versionName = rgq.getVersionName();
            if (!versionName.equals(defaultSharedPreferences.getString("inlinepatch_mainversion", ""))) {
                defaultSharedPreferences.edit().putString("inlinepatch_mainversion", versionName).putString("inlinepatch_effective_version", "").putString("inlinepatch_effective_type", "").apply();
                try {
                    File file = new File(this.c);
                    if (file.exists()) {
                        rgm.deleteDir(file);
                    }
                } catch (Exception unused) {
                }
            }
            File file2 = new File(this.c);
            if (!file2.exists()) {
                this.k = file2.mkdir();
            } else {
                this.k = true;
            }
        }
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            PreferenceManager.getDefaultSharedPreferences(rfy.sContext).edit().putString("inlinepatch_effective_version", str).putString("inlinepatch_effective_type", str2).apply();
        } catch (Exception unused) {
            TLog.loge("tconhook", "Failed to update local patch version");
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            this.e = true;
            final File file = new File(this.c + "/inlinepatch_nativecrash_0.sig");
            if (file.exists()) {
                file.delete();
                this.f = true;
            } else {
                this.f = false;
            }
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.NATIVE_ONLY, new OnFileCreatedListener() { // from class: tb.rfm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tcrash.OnFileCreatedListener
                public void onFileCreated(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b8cac13e", new Object[]{this, str});
                        return;
                    }
                    try {
                        file.createNewFile();
                    } catch (IOException unused) {
                    }
                }
            });
        }
        return this.f;
    }

    public static rfm instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rfm) ipChange.ipc$dispatch("c7e486d1", new Object[0]) : a.a();
    }
}
