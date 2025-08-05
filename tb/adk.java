package tb;

import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class adk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AIR_TAG = "wxAirTag";
    public static final String KEY_CONTENT_VERSION = "x-air-content-version";
    public static final String KEY_ENV = "x-air-env";
    public static final String KEY_GREY = "x-air-grey";

    /* renamed from: a  reason: collision with root package name */
    public String f25268a;
    public String b;
    public String c;

    static {
        kge.a(-1677053464);
    }

    public adk(String str, String str2, String str3) {
        this.f25268a = str;
        this.b = str2;
        this.c = str3;
        m.a("GreyPageInfo", "GreyPageInfo() called with: URL = [" + str + "], envParam = [" + str2 + "], isGreyPage = [" + str3 + riy.ARRAY_END_STR);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f25268a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str == null || str.isEmpty()) {
            z = false;
        } else {
            sb.append(KEY_ENV);
            sb.append("=");
            sb.append(this.b);
        }
        String str2 = this.b;
        if (str2 != null && !str2.isEmpty()) {
            if (z) {
                sb.append("&");
            }
            sb.append(KEY_GREY);
            sb.append("=");
            sb.append(this.c);
        }
        String sb2 = sb.toString();
        m.a("GreyPageInfo", "generateOutputString: " + sb2);
        return sb2;
    }
}
