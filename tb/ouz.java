package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ouz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f32446a = new StringBuilder();

    static {
        kge.a(163249259);
    }

    public ouz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouz) ipChange.ipc$dispatch("7c738940", new Object[]{this, str});
        }
        if (f(str)) {
            this.f32446a.append(ado.URL_SEPARATOR);
            return this;
        }
        StringBuilder sb = this.f32446a;
        sb.append(str);
        sb.append(HttpConstant.SCHEME_SPLIT);
        return this;
    }

    public ouz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouz) ipChange.ipc$dispatch("7d2034df", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        this.f32446a.append(str);
        return this;
    }

    public ouz c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouz) ipChange.ipc$dispatch("7dcce07e", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        this.f32446a.append(str);
        return this;
    }

    public ouz d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouz) ipChange.ipc$dispatch("7e798c1d", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        StringBuilder sb = this.f32446a;
        sb.append("?");
        sb.append(str);
        return this;
    }

    public ouz e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouz) ipChange.ipc$dispatch("7f2637bc", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        StringBuilder sb = this.f32446a;
        sb.append("#");
        sb.append(str);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f32446a.toString();
    }

    private boolean f(String str) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
