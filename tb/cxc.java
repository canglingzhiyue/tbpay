package tb;

import android.content.Context;
import com.huawei.agconnect.core.b;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.cww;

/* loaded from: classes4.dex */
public class cxc implements cwu {

    /* renamed from: a  reason: collision with root package name */
    private final String f26580a;
    private final Context b;
    private final String c;
    private final cwr d;
    private final cxe e;
    private final cxf f;
    private final Map<String, String> g;
    private final List<b> h;
    private final Map<String, String> i = new HashMap();

    public cxc(Context context, String str, cwr cwrVar, InputStream inputStream, Map<String, String> map, List<b> list, String str2) {
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        str = str == null ? this.b.getPackageName() : str;
        this.c = str;
        if (inputStream != null) {
            this.e = new cxi(inputStream, str);
            cxa.a(inputStream);
        } else {
            this.e = new cxl(this.b, str);
        }
        this.f = new cxf(this.e);
        if (cwrVar == cwr.UNKNOWN || !"1.0".equals(this.e.a("/configuration_version", null))) {
            this.d = (cwrVar == null || cwrVar == cwr.UNKNOWN) ? cxa.a(this.e.a("/region", null), this.e.a("/agcgw/url", null)) : cwrVar;
            this.g = cxa.a(map);
            this.h = list;
            this.f26580a = str2 == null ? e() : str2;
            return;
        }
        throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
    }

    private String b(String str) {
        Map<String, cww.a> a2 = cww.a();
        if (!a2.containsKey(str)) {
            return null;
        }
        if (this.i.containsKey(str)) {
            return this.i.get(str);
        }
        cww.a aVar = a2.get(str);
        if (aVar == null) {
            return null;
        }
        String a3 = aVar.a(this);
        this.i.put(str, a3);
        return a3;
    }

    private String e() {
        return String.valueOf(("{packageName='" + this.c + "', routePolicy=" + this.d + ", reader=" + this.e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.g).toString().hashCode() + '}').hashCode());
    }

    @Override // tb.cwu
    public String a() {
        return this.f26580a;
    }

    @Override // tb.cwu
    public String a(String str) {
        return a(str, null);
    }

    public String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String a2 = cxa.a(str);
        String str3 = this.g.get(a2);
        if (str3 != null) {
            return str3;
        }
        String b = b(a2);
        if (b != null) {
            return b;
        }
        String a3 = this.e.a(a2, str2);
        return cxf.a(a3) ? this.f.a(a3, str2) : a3;
    }

    @Override // tb.cwu
    public Context b() {
        return this.b;
    }

    @Override // tb.cwu
    public cwr c() {
        cwr cwrVar = this.d;
        return cwrVar == null ? cwr.UNKNOWN : cwrVar;
    }

    public List<b> d() {
        return this.h;
    }
}
