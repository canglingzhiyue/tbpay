package tb;

import android.net.Uri;
import android.taobao.windvane.config.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.pha.core.p;
import java.util.Map;

/* loaded from: classes7.dex */
public class nhr extends ngo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31471a;
    private Map<String, Map<String, String>> b;

    public static /* synthetic */ Object ipc$super(nhr nhrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1256747356) {
            if (hashCode != 1628521357) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.b((String) objArr[0]);
        }
        return super.a((String) objArr[0], (String) objArr[1]);
    }

    static {
        kge.a(1287768678);
        f31471a = nhr.class.getSimpleName();
    }

    public nhr(Uri uri, JSONObject jSONObject, JSONArray jSONArray) {
        super(uri, jSONObject);
        if (jSONArray == null || jSONArray.size() <= 0) {
            return;
        }
        a(jSONArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alibaba.fastjson.JSONArray r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nhr.a(com.alibaba.fastjson.JSONArray):void");
    }

    @Override // tb.ngo
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if ("ttid".equals(str)) {
            return a.a().b();
        }
        if ("utdid".equals(str)) {
            return UTDevice.getUtdid(p.e());
        }
        return super.b(str);
    }

    @Override // tb.ngo
    public String a(String str, String str2) {
        Map<String, String> map;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Map<String, Map<String, String>> map2 = this.b;
        return (map2 == null || (map = map2.get(str)) == null || (str3 = map.get(str2)) == null) ? super.a(str, str2) : str3;
    }
}
