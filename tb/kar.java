package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes6.dex */
public abstract class kar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f29921a;

    public abstract String a();

    static {
        kge.a(173268113);
        try {
            Class.forName("com.taobao.tao.log.TLog");
            f29921a = true;
        } catch (Exception unused) {
            f29921a = false;
        }
    }

    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{this, str, str2, objArr});
        } else if (f29921a) {
            AdapterForTLog.logd(a(str), a(str2, objArr));
        } else {
            a(str);
            a(str2, objArr);
        }
    }

    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else if (f29921a) {
            AdapterForTLog.loge(a(str), a(str2, objArr));
        } else {
            Log.e(a(str), a(str2, objArr));
        }
    }

    public void b(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56a1899", new Object[]{this, str, str2, th, objArr});
        } else if (f29921a) {
            AdapterForTLog.loge(a(str), a(str2, objArr), th);
        } else {
            Log.e(a(str), a(str2, objArr), th);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return " " + a() + " " + str;
    }

    private String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{this, str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(objArr[i] != null ? objArr[i] : "");
                sb.append(":");
                sb.append(objArr[i2] != null ? objArr[i2] : "");
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }
}
