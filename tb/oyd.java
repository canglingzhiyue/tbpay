package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class oyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f32478a = new HashMap();
    private String b = "";

    static {
        kge.a(899189621);
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            String query = uri.getQuery();
            if (StringUtils.isEmpty(query)) {
                return;
            }
            this.b = query;
            this.f32478a = a(this.b);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f32478a;
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }
}
