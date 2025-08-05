package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes4.dex */
public class dpp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f26893a = 6;
    private final Object b = new Object();
    private StringBuilder c;
    private Formatter d;

    static {
        kge.a(1231507126);
    }

    private String a(String str, Object... objArr) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{this, str, objArr});
        }
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new StringBuilder(250);
            } else {
                this.c.setLength(0);
            }
            if (this.d == null) {
                this.d = new Formatter(this.c, Locale.getDefault());
            }
            this.d.format(str, objArr);
            substring = this.c.substring(0);
        }
        return substring;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i >= this.f26893a;
    }

    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{this, str, str2, objArr});
        } else {
            a(str2, objArr);
        }
    }

    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{this, str, str2, objArr});
        } else {
            a(str2, objArr);
        }
    }

    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{this, str, str2, objArr});
        } else {
            a(str2, objArr);
        }
    }

    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else {
            Log.e(str, a(str2, objArr));
        }
    }
}
