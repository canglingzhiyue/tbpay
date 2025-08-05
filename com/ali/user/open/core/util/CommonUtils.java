package com.ali.user.open.core.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.broadcast.LoginAction;
import com.ali.user.open.core.callback.FailureCallback;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.ResultCode;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.channels.FileLock;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class CommonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BAICHUAN_TAG = "baichuan_mp";
    public static final String TAG = "ucc.CommonUtils";
    public static String mAppVersion;
    private static String sProcessName;

    static {
        kge.a(1064261641);
    }

    public static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
        } else {
            sendUT(str, null);
        }
    }

    public static void sendUT(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483ed10d", new Object[]{str, map});
        } else if (TextUtils.isEmpty(str) || AliMemberSDK.getService(UserTrackerService.class) == null) {
        } else {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send(str, map);
        }
    }

    public static void onFailure(final FailureCallback failureCallback, final ResultCode resultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c299f967", new Object[]{failureCallback, resultCode});
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.util.CommonUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FailureCallback failureCallback2 = FailureCallback.this;
                    if (failureCallback2 == null) {
                        return;
                    }
                    failureCallback2.onFailure(resultCode.code, resultCode.message);
                }
            });
        }
    }

    public static void onFailure(final FailureCallback failureCallback, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515f30d3", new Object[]{failureCallback, new Integer(i), str});
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.util.CommonUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FailureCallback failureCallback2 = FailureCallback.this;
                    if (failureCallback2 == null) {
                        return;
                    }
                    failureCallback2.onFailure(i, str);
                }
            });
        }
    }

    public static void toastSystemException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7bb1c0", new Object[0]);
        } else {
            toast("member_sdk_system_exception");
        }
    }

    public static void toast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{str});
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.util.CommonUtils.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(KernelContext.getApplicationContext(), ResourceUtils.getString(str), 0).show();
                    }
                }
            });
        }
    }

    public static boolean isNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f701db90", new Object[0])).booleanValue();
        }
        if (KernelContext.getApplicationContext() != null) {
            return isNetworkAvailable(KernelContext.getApplicationContext());
        }
        return true;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo[] allNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING)) {
                return true;
            }
        }
        return false;
    }

    public static String getNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context});
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connectivityManager == null) {
            SDKLogger.w(TAG, "can not get Context.CONNECTIVITY_SERVICE");
            return "none";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo.getState()) {
                return "wifi";
            }
        } else {
            SDKLogger.w(TAG, "can not get ConnectivityManager.TYPE_WIFI");
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo2.getState()) {
                return "gprs";
            }
        } else {
            SDKLogger.w(TAG, "can not get ConnectivityManager.TYPE_MOBILE");
        }
        return "none";
    }

    public static String getLocalIPAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5be1b41", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    public static String toString(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79e33bfe", new Object[]{th});
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String getHashString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80ae507d", new Object[]{bArr});
        }
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static void sendBroadcast(LoginAction loginAction, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33453437", new Object[]{loginAction, map});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(loginAction.name());
        intent.setPackage(KernelContext.getApplicationContext().getPackageName());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        KernelContext.getApplicationContext().sendBroadcast(intent);
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        if (mAppVersion == null) {
            try {
                PackageInfo packageInfo = KernelContext.getApplicationContext().getPackageManager().getPackageInfo(KernelContext.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    mAppVersion = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return mAppVersion;
    }

    public static String getAndroidAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28488a69", new Object[0]);
        }
        return "android_" + getAppVersion();
    }

    public static boolean getDarkModeStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89bf2c44", new Object[]{context})).booleanValue();
        }
        if (ConfigManager.getInstance().getThemeDataProvider() != null) {
            return ConfigManager.getInstance().getThemeDataProvider().isDark();
        }
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void addExt(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374c365e", new Object[]{map});
        } else if (!ConfigManager.getInstance().isMiniProgram() || map == null) {
        } else {
            map.put("sdkPlatform", BAICHUAN_TAG);
        }
    }

    public static void addExt(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eda45d7", new Object[]{jSONObject});
        } else if (!ConfigManager.getInstance().isMiniProgram() || jSONObject == null) {
        } else {
            try {
                jSONObject.put("sdkPlatform", BAICHUAN_TAG);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void handleWebviewDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad18885", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 29) {
            try {
                HashSet<String> hashSet = new HashSet();
                String absolutePath = context.getDataDir().getAbsolutePath();
                String processName = getProcessName(context);
                if (!TextUtils.equals(context.getPackageName(), processName)) {
                    if (TextUtils.isEmpty(processName)) {
                        processName = context.getPackageName();
                    }
                    WebView.setDataDirectorySuffix(processName);
                    String str = "_" + processName;
                    hashSet.add(absolutePath + "/app_webview" + str + "/webview_data.lock");
                    if (isHuaweiRom()) {
                        hashSet.add(absolutePath + "/app_hws_webview" + str + "/webview_data.lock");
                    }
                } else {
                    String str2 = "_" + processName;
                    hashSet.add(absolutePath + "/app_webview/webview_data.lock");
                    hashSet.add(absolutePath + "/app_webview" + str2 + "/webview_data.lock");
                    if (isHuaweiRom()) {
                        hashSet.add(absolutePath + "/app_hws_webview/webview_data.lock");
                        hashSet.add(absolutePath + "/app_hws_webview" + str2 + "/webview_data.lock");
                    }
                }
                for (String str3 : hashSet) {
                    File file = new File(str3);
                    if (file.exists()) {
                        tryLockOrRecreateFile(file);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void tryLockOrRecreateFile(File file) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4237dc72", new Object[]{file});
            return;
        }
        try {
            FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
            if (tryLock != null) {
                tryLock.close();
            } else {
                createFile(file, file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (file.exists()) {
                z = file.delete();
            }
            createFile(file, z);
        }
    }

    private static void createFile(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4713e", new Object[]{file, new Boolean(z)});
        } else if (!z) {
        } else {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isHuaweiRom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b30f816a", new Object[0])).booleanValue();
        }
        try {
            return Build.MANUFACTURER.toUpperCase().contains("HUAWEI");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a6: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:53:0x00a6 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getProcessName(android.content.Context r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.core.util.CommonUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            java.lang.String r7 = "7512d303"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L15:
            java.lang.String r0 = com.ali.user.open.core.util.CommonUtils.sProcessName
            if (r0 == 0) goto L1a
            return r0
        L1a:
            java.lang.Class<com.ali.user.open.core.util.CommonUtils> r0 = com.ali.user.open.core.util.CommonUtils.class
            monitor-enter(r0)
            java.lang.String r1 = com.ali.user.open.core.util.CommonUtils.sProcessName     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L25
            java.lang.String r7 = com.ali.user.open.core.util.CommonUtils.sProcessName     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            return r7
        L25:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lb2
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r5.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r6 = "/proc/"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r5.append(r1)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r6 = "/cmdline"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
            r4.<init>()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
        L4f:
            int r5 = r3.read()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
            if (r5 <= 0) goto L5a
            char r5 = (char) r5     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
            r4.append(r5)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
            goto L4f
        L5a:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
            com.ali.user.open.core.util.CommonUtils.sProcessName = r4     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La5
            r3.close()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> Lb2
            goto L68
        L64:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> Lb2
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            return r4
        L6a:
            r4 = move-exception
            goto L70
        L6c:
            r7 = move-exception
            goto La7
        L6e:
            r4 = move-exception
            r3 = r2
        L70:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> La5
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lb2
            goto L7d
        L79:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Lb2
        L7d:
            java.lang.String r3 = "activity"
            java.lang.Object r7 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lb2
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch: java.lang.Throwable -> Lb2
            java.util.List r7 = r7.getRunningAppProcesses()     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lb2
        L8d:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto La3
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> Lb2
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> Lb2
            int r4 = r3.pid     // Catch: java.lang.Throwable -> Lb2
            if (r4 != r1) goto L8d
            java.lang.String r7 = r3.processName     // Catch: java.lang.Throwable -> Lb2
            com.ali.user.open.core.util.CommonUtils.sProcessName = r7     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            return r7
        La3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            return r2
        La5:
            r7 = move-exception
            r2 = r3
        La7:
            if (r2 == 0) goto Lb1
            r2.close()     // Catch: java.lang.Exception -> Lad java.lang.Throwable -> Lb2
            goto Lb1
        Lad:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lb2
        Lb1:
            throw r7     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.util.CommonUtils.getProcessName(android.content.Context):java.lang.String");
    }
}
