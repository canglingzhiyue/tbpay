package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public class bgv implements bgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25887a;

    static {
        kge.a(359800275);
        kge.a(-1754996080);
    }

    @Override // tb.bgu
    public int a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82c81db2", new Object[]{this, str, objArr})).intValue();
        }
        return 0;
    }

    @Override // tb.bgu
    public int b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a2d52d1", new Object[]{this, str, objArr})).intValue();
        }
        return 0;
    }

    public bgv(String str) {
        this.f25887a = null;
        this.f25887a = str;
    }

    @Override // tb.bgu
    public int c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("919287f0", new Object[]{this, str, objArr})).intValue();
        }
        TLog.logw(bgu.MODULE, "", a(this.f25887a, str, objArr));
        return 0;
    }

    @Override // tb.bgu
    public int d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98f7bd0f", new Object[]{this, str, objArr})).intValue();
        }
        TLog.loge(bgu.MODULE, "", a(this.f25887a, str, objArr));
        return 0;
    }

    @Override // tb.bgu
    public int a(Throwable th, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5dd4ad", new Object[]{this, th, str, objArr})).intValue();
        }
        TLog.loge(bgu.MODULE, "", a(this.f25887a, str, objArr), th);
        return 0;
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
                String join = StringUtils.join(", ", objArr);
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
