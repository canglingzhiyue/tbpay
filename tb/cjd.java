package tb;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.FileManager;
import com.android.alibaba.ip.utils.RefectUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.TaobaoApplication;
import dalvik.system.DexFile;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class cjd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f26302a = null;
    public static int b = 0;
    public static String c = null;
    private static String d = null;
    private static long e = 0;
    private static int f = -1;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d;
    }

    public static boolean a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        d = TaobaoApplication.getProcessName(context);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return false;
        }
        c = applicationInfo.sourceDir;
        String str2 = applicationInfo.nativeLibraryDir;
        String str3 = c;
        if (str3 == null || !new File(str3).exists()) {
            a("InvalidApkPath", context);
            return false;
        }
        if (str2 == null || !new File(str2).exists()) {
            Log.e("TaobaoApplication", "can not find nativeLibDir : " + str2);
        }
        if (Build.VERSION.SDK_INT > 22) {
            return true;
        }
        int myPid = Process.myPid();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    d = runningAppProcessInfo.processName;
                }
                if (runningAppProcessInfo.processName.endsWith(":fixdoat") && runningAppProcessInfo.pid != myPid) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(d)) {
            Log.e("TaobaoApplication", "getProcess failed");
            return false;
        } else if (d.endsWith(":fixdoat")) {
            return true;
        } else {
            if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                    str = "";
                }
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                if (!defaultSharedPreferences.getBoolean("need_dex2oat_" + str, false)) {
                    SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(context);
                    if (!defaultSharedPreferences2.getBoolean("should_reinstall_" + str, false)) {
                        SharedPreferences defaultSharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(context);
                        if (defaultSharedPreferences3.getBoolean("fixdex2oat_" + str, false)) {
                            Log.e("ApkUtils", "replace new dexFile");
                            f(context);
                        }
                        SharedPreferences defaultSharedPreferences4 = PreferenceManager.getDefaultSharedPreferences(context);
                        if (defaultSharedPreferences4.getBoolean("should_checkRes_" + str, false)) {
                            if (!g(context)) {
                                if (!h(context)) {
                                    Toast.makeText(context, "应用安装不完整,请您卸载重新安装!", 1).show();
                                    return false;
                                }
                            } else if (context.getResources().getIdentifier("ttidStore", a.ATOM_String, "com.taobao.taobao") == 0) {
                                Toast.makeText(context, "应用安装不完整,请您卸载重新安装!", 1).show();
                                return false;
                            }
                        }
                    }
                }
                Log.e("ApkUtils", "show reinstall or fixdexoating....");
                return false;
            }
            return true;
        }
    }

    private static boolean g(Context context) {
        AssetManager assets = context.getResources().getAssets();
        Field field = RefectUtils.field(assets, "mStringBlocks");
        field.setAccessible(true);
        Method method = RefectUtils.method(assets, "getCookieName", Integer.TYPE);
        method.setAccessible(true);
        try {
            Object[] objArr = (Object[]) field.get(assets);
            for (int i = 1; i < objArr.length + 1; i++) {
                if (((String) method.invoke(assets, Integer.valueOf(i))).toLowerCase().contains("taobao")) {
                    return true;
                }
            }
            Log.e("ApkUtils", "apk resources add failed");
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    private static boolean h(Context context) {
        AssetManager assets = context.getResources().getAssets();
        Method method = RefectUtils.method(assets, "addAssetPath", String.class);
        method.setAccessible(true);
        try {
            return ((Integer) method.invoke(assets, context.getApplicationInfo().sourceDir)).intValue() != 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static boolean b(android.content.Context r14) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.cjd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r14
            java.lang.String r14 = "9eca1003"
            java.lang.Object r14 = r0.ipc$dispatch(r14, r1)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            return r14
        L19:
            r0 = 0
            android.content.pm.PackageManager r1 = r14.getPackageManager()     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r14.getPackageName()     // Catch: java.lang.Exception -> L27
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r3)     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            int r1 = android.os.Process.myPid()
            android.os.Process.killProcess(r1)
            r1 = r0
        L2f:
            java.lang.String r4 = r1.versionName
            tb.cjd.f26302a = r4
            int r4 = r1.versionCode
            tb.cjd.b = r4
            long r4 = r1.lastUpdateTime
            tb.cjd.e = r4
            java.lang.String r4 = tb.cjd.f26302a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L52
            java.lang.String r4 = "TaobaoApplication"
            java.lang.String r5 = "version name is empty "
            android.util.Log.e(r4, r5)
            int r4 = android.os.Process.myPid()
            android.os.Process.killProcess(r4)
        L52:
            java.io.File r4 = new java.io.File
            java.io.File r5 = r14.getFilesDir()
            java.lang.String r6 = "storage/version_meta"
            r4.<init>(r5, r6)
            boolean r5 = r4.exists()
            if (r5 == 0) goto Lf9
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> Lf4
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lf4
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lf4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r0 = r5.readUTF()     // Catch: java.lang.Throwable -> Lea
            long r6 = r5.readLong()     // Catch: java.lang.Throwable -> Lea
            long r8 = r5.readLong()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = r5.readUTF()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r10 = r5.readUTF()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r11 = "APP_VERSION_TAG"
            java.lang.String r12 = tb.cjd.f26302a     // Catch: java.lang.Throwable -> Lea
            java.lang.System.setProperty(r11, r12)     // Catch: java.lang.Throwable -> Lea
            int r11 = r1.versionCode     // Catch: java.lang.Throwable -> Lea
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lea
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 != 0) goto Lcc
            java.lang.String r6 = r1.versionName     // Catch: java.lang.Throwable -> Lea
            boolean r6 = android.text.TextUtils.equals(r6, r0)     // Catch: java.lang.Throwable -> Lea
            if (r6 == 0) goto Lcc
            long r6 = r1.lastUpdateTime     // Catch: java.lang.Throwable -> Lea
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto Lcc
            android.content.pm.ApplicationInfo r1 = r14.getApplicationInfo()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r1.sourceDir     // Catch: java.lang.Throwable -> Lea
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> Lea
            if (r1 == 0) goto Lcc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r1.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> Lea
            r1.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = ""
            r1.append(r4)     // Catch: java.lang.Throwable -> Lea
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lea
            r1.append(r4)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lea
            boolean r1 = r1.equals(r10)     // Catch: java.lang.Throwable -> Lea
            if (r1 == 0) goto Lcc
            r5.close()     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            return r3
        Lcc:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto Le4
            android.content.SharedPreferences r14 = android.preference.PreferenceManager.getDefaultSharedPreferences(r14)     // Catch: java.lang.Throwable -> Lea
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = "lastInstalledVersionName"
            android.content.SharedPreferences$Editor r14 = r14.putString(r1, r0)     // Catch: java.lang.Throwable -> Lea
            r14.apply()     // Catch: java.lang.Throwable -> Lea
        Le4:
            r5.close()     // Catch: java.lang.Throwable -> Lf9
            goto Lf9
        Le8:
            r14 = move-exception
            goto Lee
        Lea:
            r0 = r5
            goto Lf4
        Lec:
            r14 = move-exception
            r5 = r0
        Lee:
            if (r5 == 0) goto Lf3
            r5.close()     // Catch: java.lang.Throwable -> Lf3
        Lf3:
            throw r14
        Lf4:
            if (r0 == 0) goto Lf9
            r0.close()     // Catch: java.lang.Throwable -> Lf9
        Lf9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cjd.b(android.content.Context):boolean");
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separatorChar + "bundleBaseline");
        File file2 = new File(context.getFilesDir(), "bundleupdate");
        if (file2.exists()) {
            cje.a(file2);
        }
        if (!file.exists()) {
            return;
        }
        cje.a(file);
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        File file = new File(context.getFilesDir(), "storage/version_meta");
        DataOutputStream dataOutputStream = null;
        try {
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                return;
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream2.writeUTF(f26302a);
                dataOutputStream2.writeLong(b);
                dataOutputStream2.writeLong(e);
                dataOutputStream2.writeUTF(c);
                dataOutputStream2.writeUTF(Build.FINGERPRINT + "" + Build.VERSION.SDK_INT);
                dataOutputStream2.flush();
                try {
                    dataOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                dataOutputStream = dataOutputStream2;
                try {
                    Log.e("ApkUtils", "storePackageVersion failed!");
                    if (dataOutputStream == null) {
                        return;
                    }
                    try {
                        dataOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable th) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    if (dataOutputStream3 != null) {
                        try {
                            dataOutputStream3.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused5) {
        }
    }

    private static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{str, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("err_log", 0);
        int i = sharedPreferences.getInt(str, 0);
        if (i >= 3) {
            e(context);
        } else {
            sharedPreferences.edit().putInt(str, i + 1).commit();
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
            return;
        }
        try {
            ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).notify(123, new Notification.Builder(context).setSmallIcon(context.getResources().getIdentifier("icon", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName())).setContentTitle("提示").setAutoCancel(true).setContentText("应用安装不完整,请您卸载重新安装!").build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void f(Context context) {
        Object fieldGet;
        Field field;
        Object[] objArr;
        try {
            Field field2 = RefectUtils.field(cjd.class.getClassLoader(), "pathList");
            if (field2 == null || (fieldGet = RefectUtils.fieldGet(cjd.class.getClassLoader(), field2)) == null || (field = RefectUtils.field(fieldGet, "dexElements")) == null || (objArr = (Object[]) RefectUtils.fieldGet(fieldGet, field)) == null || objArr.length <= 0) {
                return;
            }
            for (Object obj : objArr) {
                if (((DexFile) RefectUtils.fieldGet(obj, RefectUtils.field(obj, "dexFile"))).getName().toLowerCase().contains("taobao")) {
                    RefectUtils.field(obj, "dexFile").set(obj, DexFile.loadDex(new File(c).getPath(), a(new File(c), context.getCodeCacheDir()), 0));
                    return;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6a44c4a", new Object[]{file, file2});
        }
        String name = file.getName();
        if (!name.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
            int lastIndexOf = name.lastIndexOf(".");
            if (lastIndexOf < 0) {
                name = name + FileManager.CLASSES_DEX_SUFFIX;
            } else {
                StringBuilder sb = new StringBuilder(lastIndexOf + 4);
                sb.append((CharSequence) name, 0, lastIndexOf);
                sb.append(FileManager.CLASSES_DEX_SUFFIX);
                name = sb.toString();
            }
        }
        return new File(file2, name).getPath();
    }
}
