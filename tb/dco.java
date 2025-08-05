package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class dco {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_CONN_SERVICES_V1 = "conn_services_v1.lock";
    public static final String FILE_SCS = "scs_v1.lock";

    /* renamed from: a  reason: collision with root package name */
    private static Context f26690a;

    static {
        kge.a(1676200023);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: Throwable -> 0x00b1, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00b1, blocks: (B:10:0x0039, B:12:0x0047, B:18:0x0059, B:23:0x0076, B:25:0x007c, B:31:0x0088, B:36:0x00a4), top: B:78:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[Catch: Throwable -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Throwable -> 0x00b1, blocks: (B:10:0x0039, B:12:0x0047, B:18:0x0059, B:23:0x0076, B:25:0x007c, B:31:0x0088, B:36:0x00a4), top: B:78:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dco.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    private static String a(Context context, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("923fc750", new Object[]{context, randomAccessFile});
        }
        a(context);
        return a(randomAccessFile);
    }

    private static void a(Context context, RandomAccessFile randomAccessFile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a79ad1a", new Object[]{context, randomAccessFile, str});
            return;
        }
        a(context);
        a(randomAccessFile, str);
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f26690a != null) {
        } else {
            if (context == null && (context = jzv.a()) == null) {
                throw new NullPointerException("context is NULL");
            }
            f26690a = context.getApplicationContext();
        }
    }

    private static String a(RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca3f0a48", new Object[]{randomAccessFile});
        }
        try {
            String readLine = randomAccessFile.readLine();
            ALog.i("SyncChannelSwitch", "readFromFile", "line", readLine);
            return readLine;
        } catch (Throwable th) {
            ALog.e("SyncChannelSwitch", "readFromFile", th, new Object[0]);
            return null;
        }
    }

    private static void a(RandomAccessFile randomAccessFile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2262c922", new Object[]{randomAccessFile, str});
            return;
        }
        try {
            randomAccessFile.setLength(0L);
            randomAccessFile.seek(0L);
            randomAccessFile.write(str.getBytes());
            ALog.i("SyncChannelSwitch", "saveToFile success", new Object[0]);
        } catch (Throwable th) {
            ALog.e("SyncChannelSwitch", "saveToFile", th, new Object[0]);
        }
    }
}
