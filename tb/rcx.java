package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rcx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_SCENE = "biz_scene";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f33081a = new HashMap();

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final rcx f33082a;

        static {
            kge.a(1543181453);
            f33082a = new rcx();
        }
    }

    static {
        kge.a(-1651154685);
    }

    public static rcx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rcx) ipChange.ipc$dispatch("f09f997", new Object[0]) : a.f33082a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f33081a.put(str, rdu.a(str2, ""));
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f33081a.putAll(map);
        }
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f33081a;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        String str3 = this.f33081a.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f33081a.get("umi_pub_session");
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.f33081a.get(str);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : "1".equals(this.f33081a.get("async_merge_video"));
    }
}
