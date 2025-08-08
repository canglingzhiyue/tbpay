package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mzt implements mzs<myy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31340a = "x-ctx-tid";
    private final String b = "x-ctx-sid";
    private final String c = "x-ctx-bag_";
    private final boolean d;

    static {
        kge.a(-2012733553);
        kge.a(-591344146);
    }

    public mzt(boolean z) {
        this.d = z;
    }

    @Override // tb.mzs
    public void a(mzn mznVar, myy myyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae235ada", new Object[]{this, mznVar, myyVar});
            return;
        }
        myyVar.a("x-ctx-tid", mznVar.a());
        myyVar.a("x-ctx-sid", mznVar.b());
        for (Map.Entry<String, String> entry : mznVar.c()) {
            myyVar.a(a("x-ctx-bag_" + entry.getKey()), a(entry.getValue()));
        }
    }

    @Override // tb.mzs
    public mzn a(myy myyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mzn) ipChange.ipc$dispatch("8be5547a", new Object[]{this, myyVar});
        }
        HashMap hashMap = new HashMap();
        String str = null;
        String str2 = null;
        for (Map.Entry<String, String> entry : myyVar) {
            String b = b(entry.getKey());
            String b2 = b(entry.getValue());
            if (b.equals("x-ctx-tid")) {
                str2 = b2;
            } else if (b.equals("x-ctx-sid")) {
                str = b2;
            } else if (b.startsWith("x-ctx-bag_")) {
                hashMap.put(b.substring(10), b2);
            }
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            return new mzn(str2, str, hashMap);
        }
        return null;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!this.d) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (!this.d) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }
}
