package tb;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public class bgt implements bgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;

    /* renamed from: a  reason: collision with root package name */
    private final String f25886a;
    private bgu c;

    static {
        kge.a(1003510511);
        kge.a(-1754996080);
        b = true;
        try {
            Log.e("FlexaLogger", TLog.class.getSimpleName());
            b = true;
        } catch (Throwable unused) {
            b = false;
        }
    }

    public bgt(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        this.f25886a = str.length() != 0 ? sb2.concat(str) : sb2;
        if (b) {
            this.c = new bgv(this.f25886a);
        }
    }

    @Override // tb.bgu
    public int a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82c81db2", new Object[]{this, str, objArr})).intValue();
        }
        if (b) {
            this.c.a(str, objArr);
        }
        return a(4, str, objArr);
    }

    @Override // tb.bgu
    public int b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a2d52d1", new Object[]{this, str, objArr})).intValue();
        }
        if (b) {
            this.c.b(str, objArr);
        }
        return a(3, str, objArr);
    }

    @Override // tb.bgu
    public int c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("919287f0", new Object[]{this, str, objArr})).intValue();
        }
        if (b) {
            this.c.c(str, objArr);
        }
        return a(5, str, objArr);
    }

    @Override // tb.bgu
    public int d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98f7bd0f", new Object[]{this, str, objArr})).intValue();
        }
        if (b) {
            this.c.d(str, objArr);
        }
        return a(6, str, objArr);
    }

    @Override // tb.bgu
    public int a(Throwable th, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5dd4ad", new Object[]{this, th, str, objArr})).intValue();
        }
        if (b) {
            this.c.a(th, str, objArr);
        }
        if (!Log.isLoggable(bgu.MODULE, 6)) {
            return 0;
        }
        return Log.e(bgu.MODULE, a(this.f25886a, str, objArr), th);
    }

    private int a(int i, String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6848a5f", new Object[]{this, new Integer(i), str, objArr})).intValue();
        }
        if (!Log.isLoggable(bgu.MODULE, i)) {
            return 0;
        }
        return Log.println(i, bgu.MODULE, a(this.f25886a, str, objArr));
    }

    private static String a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b2f110b", new Object[]{str, str2, objArr});
        }
        if (objArr != null && objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e(bgu.MODULE, valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append(riy.ARRAY_END_STR);
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }
}
