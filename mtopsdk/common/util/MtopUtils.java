package mtopsdk.common.util;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Character;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tb.ado;
import tb.kge;

/* loaded from: classes.dex */
public final class MtopUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char[] LOWER_CASE_ENCRYPT_CHARS;
    public static final int MTOP_BIZID = 4099;
    private static final char[] NUMBER_ENCRYPT_CHARS;
    private static final String TAG = "mtopsdk.MtopUtils";
    private static final char[] UPPER_CASE_ENCRYPT_CHARS;
    public static final List<String> apiWhiteList;
    private static AtomicInteger counter = null;
    private static volatile Context mContext = null;
    private static volatile String mProcessName = null;
    private static final int mask = Integer.MAX_VALUE;
    private static AtomicInteger ssrCounter;

    static {
        kge.a(1546275235);
        counter = new AtomicInteger();
        ssrCounter = new AtomicInteger();
        apiWhiteList = Collections.singletonList("mtop.common.gettimestamp$*");
        UPPER_CASE_ENCRYPT_CHARS = new char[]{d.LEVEL_E, 'T', 'A', 'O', d.LEVEL_I, 'N', 'S', 'R', 'H', d.LEVEL_L, d.LEVEL_D, 'C', 'U', 'M', 'F', 'P', 'G', d.LEVEL_W, 'Y', 'B', d.LEVEL_V, 'K', 'X', 'J', 'Q', 'Z'};
        LOWER_CASE_ENCRYPT_CHARS = new char[]{'e', 't', 'a', 'o', 'i', 'n', 's', 'r', 'h', 'l', 'd', 'c', 'u', 'm', 'f', 'p', 'g', 'w', 'y', 'b', 'v', 'k', 'x', 'j', 'q', 'z'};
        NUMBER_ENCRYPT_CHARS = new char[]{'8', '6', '1', '5', '9', '2', '3', '0', '4', '7'};
    }

    public static long convertTimeFormatGMT2Long(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be8101dc", new Object[]{str})).longValue();
        }
        if (StringUtils.isBlank(str)) {
            return -1L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = null;
        try {
            date = simpleDateFormat.parse(str);
        } catch (Exception unused) {
            TBSdkLog.e(TAG, "[convertTimeFormatGMT2Long]parse gmt timeformat error");
        }
        if (date == null) {
            return -1L;
        }
        return date.getTime() / 1000;
    }

    public static int createIntSeqNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d16cee7", new Object[0])).intValue() : counter.incrementAndGet() & Integer.MAX_VALUE;
    }

    public static int createSsrIntSeqNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf817a61", new Object[0])).intValue() : ssrCounter.incrementAndGet() & Integer.MAX_VALUE;
    }

    public static boolean isMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean isApkDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f1efe4", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = getContext();
        }
        if (context != null) {
            return (context.getApplicationInfo().flags & 2) != 0;
        }
        TBSdkLog.e(TAG, "[isApkDebug] context is null!");
        return false;
    }

    public static String urlDecode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9d9a48", new Object[]{str, str2});
        }
        if (StringUtils.isBlank(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (Exception e) {
            TBSdkLog.e(TAG, "[urlDecode] URLDecoder decode error. input=" + str + ", charset= " + str2, e);
            return null;
        }
    }

    public static Serializable readObject(File file, String str) {
        Serializable serializable;
        File file2;
        ObjectInputStream objectInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("d8581e0d", new Object[]{file, str});
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                file2 = new File(file, str);
            } catch (Throwable th) {
                th = th;
                serializable = null;
            }
        } catch (IOException unused) {
        }
        if (!file2.exists()) {
            return null;
        }
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        try {
            objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream2));
            serializable = (Serializable) objectInputStream.readObject();
        } catch (Throwable th2) {
            th = th2;
            serializable = null;
        }
        try {
            objectInputStream.close();
            fileInputStream2.close();
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = fileInputStream2;
            try {
                TBSdkLog.w(TAG, String.format("readObject error.fileDir={%s},fileName={%s}", file, str), th);
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return serializable;
            } catch (Throwable th4) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th4;
            }
        }
        return serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean writeObject(java.io.Serializable r10, java.io.File r11, java.lang.String r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r10
            r1[r4] = r11
            r1[r2] = r12
            java.lang.String r10 = "1b03af5e"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1f:
            r0 = 0
            boolean r1 = r11.exists()     // Catch: java.lang.Throwable -> L74
            if (r1 != 0) goto L29
            r11.mkdirs()     // Catch: java.lang.Throwable -> L74
        L29:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            r6.append(r12)     // Catch: java.lang.Throwable -> L74
            java.util.Random r7 = new java.util.Random     // Catch: java.lang.Throwable -> L74
            r7.<init>()     // Catch: java.lang.Throwable -> L74
            r8 = 10
            int r7 = r7.nextInt(r8)     // Catch: java.lang.Throwable -> L74
            r6.append(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L74
            r1.<init>(r11, r6)     // Catch: java.lang.Throwable -> L74
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L67
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L67
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L67
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L67
            r0.writeObject(r10)     // Catch: java.lang.Throwable -> L67
            r0.flush()     // Catch: java.lang.Throwable -> L67
            r0.close()     // Catch: java.lang.Throwable -> L67
            r6.close()     // Catch: java.io.IOException -> L92
            goto L92
        L64:
            r10 = move-exception
            r0 = r6
            goto L9e
        L67:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r6
            r6 = r9
            goto L76
        L6d:
            r6 = move-exception
            r9 = r6
            r6 = r1
            r1 = r9
            goto L76
        L72:
            r10 = move-exception
            goto L9e
        L74:
            r1 = move-exception
            r6 = r0
        L76:
            java.lang.String r7 = "mtopsdk.MtopUtils"
            java.lang.String r8 = "writeObject error.fileDir={%s},fileName={%s},object={%s}"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L72
            r3[r5] = r11     // Catch: java.lang.Throwable -> L72
            r3[r4] = r12     // Catch: java.lang.Throwable -> L72
            r3[r2] = r10     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = java.lang.String.format(r8, r3)     // Catch: java.lang.Throwable -> L72
            mtopsdk.common.util.TBSdkLog.w(r7, r10, r1)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L90
            r0.close()     // Catch: java.io.IOException -> L90
        L90:
            r1 = r6
            r4 = 0
        L92:
            if (r4 == 0) goto L9d
            java.io.File r10 = new java.io.File
            r10.<init>(r11, r12)
            boolean r4 = r1.renameTo(r10)
        L9d:
            return r4
        L9e:
            if (r0 == 0) goto La3
            r0.close()     // Catch: java.io.IOException -> La3
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.writeObject(java.io.Serializable, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readFile(java.lang.String r9) {
        /*
            java.lang.String r0 = "mtopsdk.MtopUtils"
            com.android.alibaba.ip.runtime.IpChange r1 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L19
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r9
            java.lang.String r9 = "f08cf7fa"
            java.lang.Object r9 = r1.ipc$dispatch(r9, r0)
            byte[] r9 = (byte[]) r9
            return r9
        L19:
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L51 java.io.FileNotFoundException -> L6c
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L51 java.io.FileNotFoundException -> L6c
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L51 java.io.FileNotFoundException -> L6c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L51 java.io.FileNotFoundException -> L6c
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4b
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L43 java.io.FileNotFoundException -> L6e java.lang.Throwable -> L87
        L2d:
            int r7 = r5.read(r6)     // Catch: java.lang.Throwable -> L43 java.io.FileNotFoundException -> L6e java.lang.Throwable -> L87
            r8 = -1
            if (r7 == r8) goto L38
            r2.write(r6, r4, r7)     // Catch: java.lang.Throwable -> L43 java.io.FileNotFoundException -> L6e java.lang.Throwable -> L87
            goto L2d
        L38:
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Throwable -> L43 java.io.FileNotFoundException -> L6e java.lang.Throwable -> L87
            r2.close()     // Catch: java.io.IOException -> L3f
        L3f:
            r5.close()     // Catch: java.io.IOException -> L86
            goto L86
        L43:
            r6 = move-exception
            goto L54
        L45:
            r9 = move-exception
            r2 = r1
            goto L88
        L48:
            r6 = move-exception
            r2 = r1
            goto L54
        L4b:
            r2 = r1
            goto L6e
        L4d:
            r9 = move-exception
            r2 = r1
            r5 = r2
            goto L88
        L51:
            r6 = move-exception
            r2 = r1
            r5 = r2
        L54:
            java.lang.String r7 = "readFile error.filePath={%s}"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L87
            r3[r4] = r9     // Catch: java.lang.Throwable -> L87
            java.lang.String r9 = java.lang.String.format(r7, r3)     // Catch: java.lang.Throwable -> L87
            mtopsdk.common.util.TBSdkLog.w(r0, r9, r6)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L68
            goto L69
        L68:
        L69:
            if (r5 == 0) goto L86
            goto L3f
        L6c:
            r2 = r1
            r5 = r2
        L6e:
            java.lang.String r6 = "readFile error.filePath={%s} is not found."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L87
            r3[r4] = r9     // Catch: java.lang.Throwable -> L87
            java.lang.String r9 = java.lang.String.format(r6, r3)     // Catch: java.lang.Throwable -> L87
            mtopsdk.common.util.TBSdkLog.w(r0, r9)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L83
            r2.close()     // Catch: java.io.IOException -> L82
            goto L83
        L82:
        L83:
            if (r5 == 0) goto L86
            goto L3f
        L86:
            return r1
        L87:
            r9 = move-exception
        L88:
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.io.IOException -> L8e
            goto L8f
        L8e:
        L8f:
            if (r5 == 0) goto L94
            r5.close()     // Catch: java.io.IOException -> L94
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.readFile(java.lang.String):byte[]");
    }

    public static String convertUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("652ec3f3", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + str;
            }
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                } else {
                    int indexOf2 = str.indexOf("#");
                    if (indexOf2 != -1) {
                        str = str.substring(0, indexOf2);
                    }
                }
                return str;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static Context getContext() {
        if (mContext == null) {
            synchronized (MtopUtils.class) {
                if (mContext == null) {
                    try {
                        Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                        Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                        mContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        TBSdkLog.e(TAG, "getContext through reflection error.");
                    }
                }
            }
        }
        return mContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        mtopsdk.common.util.MtopUtils.mProcessName = r2.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (mtopsdk.common.util.TBSdkLog.isLogEnable(mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        mtopsdk.common.util.TBSdkLog.i(mtopsdk.common.util.MtopUtils.TAG, "get current processName succeed,processName=" + mtopsdk.common.util.MtopUtils.mProcessName);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getCurrentProcessName(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L16
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "f9f5f1b6"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L16:
            if (r4 != 0) goto L1b
            java.lang.String r4 = mtopsdk.common.util.MtopUtils.mProcessName
            return r4
        L1b:
            java.lang.String r0 = mtopsdk.common.util.MtopUtils.mProcessName
            if (r0 != 0) goto L88
            java.lang.Class<mtopsdk.common.util.MtopUtils> r0 = mtopsdk.common.util.MtopUtils.class
            monitor-enter(r0)
            java.lang.String r1 = mtopsdk.common.util.MtopUtils.mProcessName     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L83
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            if (r4 == 0) goto L83
            int r2 = r4.size()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            if (r2 <= 0) goto L83
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
        L42:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            if (r2 == 0) goto L83
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            int r3 = r2.pid     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            if (r3 != r1) goto L42
            java.lang.String r4 = r2.processName     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            mtopsdk.common.util.MtopUtils.mProcessName = r4     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            mtopsdk.common.util.TBSdkLog$LogEnable r4 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            boolean r4 = mtopsdk.common.util.TBSdkLog.isLogEnable(r4)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            if (r4 == 0) goto L83
            java.lang.String r4 = "mtopsdk.MtopUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            java.lang.String r2 = "get current processName succeed,processName="
            r1.append(r2)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            java.lang.String r2 = mtopsdk.common.util.MtopUtils.mProcessName     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            r1.append(r2)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            mtopsdk.common.util.TBSdkLog.i(r4, r1)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L85
            goto L83
        L79:
            r4 = move-exception
            java.lang.String r1 = "mtopsdk.MtopUtils"
            java.lang.String r2 = "get current processName failed."
            mtopsdk.common.util.TBSdkLog.e(r1, r2, r4)     // Catch: java.lang.Throwable -> L85
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            goto L88
        L85:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r4
        L88:
            java.lang.String r4 = mtopsdk.common.util.MtopUtils.mProcessName
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.getCurrentProcessName(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2.importance == 100) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        mtopsdk.common.util.TBSdkLog.e(mtopsdk.common.util.MtopUtils.TAG, "get current process is background succeed, result=" + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCurrentProcessBackground(android.content.Context r6) {
        /*
            java.lang.String r0 = "mtopsdk.MtopUtils"
            com.android.alibaba.ip.runtime.IpChange r1 = mtopsdk.common.util.MtopUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r6
            java.lang.String r6 = "4992b017"
            java.lang.Object r6 = r1.ipc$dispatch(r6, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            mtopsdk.mtop.global.SwitchConfig r1 = mtopsdk.mtop.global.SwitchConfig.getInstance()
            boolean r1 = r1.getProcessBgMethodNew()
            if (r1 != 0) goto L2b
            boolean r6 = mtopsdk.xstate.a.b()
            return r6
        L2b:
            if (r6 != 0) goto L2e
            return r4
        L2e:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "activity"
            java.lang.Object r6 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L77
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch: java.lang.Throwable -> L77
            java.util.List r6 = r6.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L91
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L77
            if (r2 <= 0) goto L91
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L77
        L4a:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L91
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L77
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> L77
            int r5 = r2.pid     // Catch: java.lang.Throwable -> L77
            if (r5 != r1) goto L4a
            int r6 = r2.importance     // Catch: java.lang.Throwable -> L77
            r1 = 100
            if (r6 == r1) goto L61
            r4 = 1
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "get current process is background succeed, result="
            r6.append(r1)     // Catch: java.lang.Throwable -> L77
            r6.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L77
            mtopsdk.common.util.TBSdkLog.e(r0, r6)     // Catch: java.lang.Throwable -> L77
            goto L91
        L77:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get current process whether background exception, "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            mtopsdk.common.util.TBSdkLog.e(r0, r6)
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.MtopUtils.isCurrentProcessBackground(android.content.Context):boolean");
    }

    public static boolean isAppOpenMock(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cee985a", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = getContext();
        }
        if (context == null) {
            TBSdkLog.e(TAG, "[isAppOpenMock] context is null!");
            return false;
        }
        try {
            byte[] readFile = readFile(context.getFilesDir().getCanonicalPath() + "/mock/openMock.json");
            if (readFile != null) {
                try {
                    return new JSONObject(new String(readFile)).getBoolean("openMock");
                } catch (Exception e) {
                    TBSdkLog.e(TAG, "[isAppOpenMock]parse openMock flag error in isOpenMock.json .", e);
                }
            }
            return false;
        } catch (IOException e2) {
            TBSdkLog.e(TAG, "[isAppOpenMock] parse ExternalFilesDir/mock/openMock.json filePath error.", e2);
            return false;
        }
    }

    public static String caesarEncrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18570047", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = UPPER_CASE_ENCRYPT_CHARS[charAt - 'A'];
            } else if (charAt >= 'a' && charAt <= 'z') {
                charAt = LOWER_CASE_ENCRYPT_CHARS[charAt - 'a'];
            } else if (charAt >= '0' && charAt <= '9') {
                charAt = NUMBER_ENCRYPT_CHARS[charAt - '0'];
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final boolean isContainChineseCharacter(String str) {
        char[] charArray;
        Character.UnicodeBlock of;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4b8933b", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        for (char c : str.toCharArray()) {
            try {
                of = Character.UnicodeBlock.of(c);
            } catch (Throwable unused) {
                if (c < 19968) {
                    continue;
                } else if (c <= 40959) {
                    return true;
                }
            }
            if (of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
                return true;
            }
        }
        return false;
    }
}
