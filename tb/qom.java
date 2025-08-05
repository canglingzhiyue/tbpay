package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class qom implements qon {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMMON_TOTAL_LENGTH = 250;

    /* renamed from: a  reason: collision with root package name */
    private final Object f32989a = new Object();
    private StringBuilder b;
    private Formatter c;

    public String a(String str, Object... objArr) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{this, str, objArr});
        }
        synchronized (this.f32989a) {
            if (this.b == null) {
                this.b = new StringBuilder(250);
            } else {
                this.b.setLength(0);
            }
            if (this.c == null) {
                this.c = new Formatter(this.b, Locale.getDefault());
            }
            this.c.format(str, objArr);
            substring = this.b.substring(0);
        }
        return substring;
    }
}
