package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;

/* loaded from: classes9.dex */
public class rjs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f33185a;

    static {
        kge.a(-1929755953);
    }

    public rjs(String str) {
        this.f33185a = new StringBuilder(str);
    }

    public rjs a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjs) ipChange.ipc$dispatch("953f53af", new Object[]{this, str, str2});
        }
        this.f33185a.append(a());
        try {
            this.f33185a.append(URLEncoder.encode(str, "UTF-8"));
            this.f33185a.append("=");
            this.f33185a.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (Exception unused) {
        }
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f33185a.toString();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        char a2 = a(this.f33185a);
        return ('?' == a2 || '&' == a2) ? "" : this.f33185a.indexOf("?") >= 0 ? "&" : "?";
    }

    private char a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Character) ipChange.ipc$dispatch("5279f0b0", new Object[]{this, sb})).charValue() : sb.charAt(sb.length() - 1);
    }
}
