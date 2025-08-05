package tb;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.VersionInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public class jeg implements jef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CrashApi f29498a;
    private final UncaughtCrashHeader b;

    /* loaded from: classes6.dex */
    public static class a implements UncaughtCrashHeader {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final CrashApi f29499a;

        public a(CrashApi crashApi) {
            this.f29499a = crashApi;
        }

        @Override // com.taobao.android.tcrash.UncaughtCrashHeader
        public void addHeaderInfo(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
                return;
            }
            try {
                this.f29499a.addHeaderInfo(str, str2);
            } catch (Throwable th) {
                jfj.b(th);
            }
        }
    }

    public jeg(jdy jdyVar, boolean z) {
        this.f29498a = new b().b(jdyVar, z);
        CrashApi crashApi = this.f29498a;
        this.b = crashApi != null ? new a(crashApi) : new jeb();
    }

    @Override // tb.jef
    public UncaughtCrashHeader a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("4930c8c3", new Object[]{this}) : this.b;
    }

    @Override // tb.jef
    public void a(ValueCallback<Bundle> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb5ae2e", new Object[]{this, valueCallback});
            return;
        }
        CrashApi crashApi = this.f29498a;
        if (crashApi == null) {
            return;
        }
        crashApi.registerCallback(1, valueCallback);
        this.f29498a.registerCallback(4, valueCallback);
    }

    @Override // tb.jef
    public void a(Callable<String> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d29daa9", new Object[]{this, callable});
            return;
        }
        CrashApi crashApi = this.f29498a;
        if (crashApi == null) {
            return;
        }
        crashApi.registerInfoCallback("UCCore3_5_2_1", 1048576, callable);
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        public boolean a(jdy jdyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef2fcffd", new Object[]{this, jdyVar})).booleanValue();
            }
            HashSet<String> hashSet = new HashSet();
            hashSet.add(LauncherRuntime.PROCESS_UC_SUFFIX);
            hashSet.add(":gpu_process");
            if (jdyVar.d().a("ignoreNativeCrash", false)) {
                String c = jdyVar.c();
                for (String str : hashSet) {
                    if (c.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public Bundle a(jdy jdyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("5f04d5ff", new Object[]{this, jdyVar, new Boolean(z)});
            }
            Bundle bundle = new Bundle();
            String b = jdyVar.b();
            jge jgeVar = new jge(jdyVar.a(), jdyVar.c());
            String str = "app_tombstone/" + jdyVar.c() + "/crashsdk";
            bundle.putBoolean("mBackupLogs", false);
            bundle.putString("mLogsBackupPathName", jgeVar.d().getAbsolutePath());
            bundle.putString("mTagFilesFolderName", str + "/tags");
            bundle.putString("mCrashLogsFolderName", str + "/logs");
            if (z) {
                bundle.putInt("mAnrTraceStrategy", 2);
            } else {
                bundle.putInt("mAnrTraceStrategy", 1);
            }
            bundle.putInt("mMaxAnrLogcatLineCount", 200);
            bundle.putBoolean("mEncryptLog", false);
            bundle.putString("mJavaCrashLogFileName", "java_" + System.currentTimeMillis() + "_java.log");
            long currentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            StringBuilder sb = new StringBuilder();
            sb.append("CrashSDK_3.3.0.0_df_df_df_");
            sb.append(jdyVar.a("APP_KEY", "0"));
            sb.append("_");
            sb.append(b);
            sb.append("_");
            sb.append(currentTimeMillis);
            sb.append("_");
            sb.append(simpleDateFormat.format(new Date(currentTimeMillis)));
            sb.append("_");
            sb.append(a(jdyVar) ? "_ignore_jni.log" : "_jni.log");
            bundle.putString("mNativeCrashLogFileName", sb.toString());
            bundle.putBoolean("enableJavaLog", false);
            bundle.putBoolean("enableUnexpLog", true);
            bundle.putBoolean("mCallJavaDefaultHandler", false);
            bundle.putBoolean("mCallNativeDefaultHandler", true);
            bundle.putBoolean("mZipLog", false);
            bundle.putBoolean("mEnableStatReport", false);
            bundle.putBoolean("useApplicationContext", false);
            bundle.putBoolean("mSyncUploadSetupCrashLogs", false);
            bundle.putBoolean("mSyncUploadLogs", false);
            bundle.putLong("mDisableSignals", 16386L);
            bundle.putLong("mDisableBackgroundSignals", 16384L);
            bundle.putInt("uploadLogDelaySeconds", -1);
            bundle.putInt("mUnexpInfoUpdateInterval", 900);
            bundle.putString("mBuildId", b);
            bundle.putBoolean("mMonitorBattery", false);
            return bundle;
        }

        public CrashApi b(jdy jdyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CrashApi) ipChange.ipc$dispatch("a1ea3d66", new Object[]{this, jdyVar, new Boolean(z)});
            }
            try {
                System.loadLibrary("crashsdk");
                CrashApi createInstanceEx = CrashApi.createInstanceEx(jdyVar.a(), "native", false, a(jdyVar, z));
                createInstanceEx.setForeground(true);
                String b = jdyVar.b();
                VersionInfo versionInfo = new VersionInfo();
                versionInfo.mVersion = b;
                versionInfo.mBuildId = b;
                createInstanceEx.updateVersionInfo(versionInfo);
                return createInstanceEx;
            } catch (Throwable th) {
                jfj.a(th);
                return null;
            }
        }
    }
}
