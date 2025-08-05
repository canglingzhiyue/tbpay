package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes9.dex */
public class rjk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGENAME_ORANGE = "weitao_switch";

    /* renamed from: a  reason: collision with root package name */
    private static rjk f33183a;

    private rjk() {
    }

    public static synchronized rjk a() {
        synchronized (rjk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rjk) ipChange.ipc$dispatch("f0a124b", new Object[0]);
            }
            if (f33183a == null) {
                f33183a = new rjk();
            }
            return f33183a;
        }
    }

    private String a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aba112c3", new Object[]{this, str, str2, str3, new Integer(i)});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i == 1) {
            return str3;
        }
        if (i == 2) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        return null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : TextUtils.equals(a("weitao_switch", "enable_async_init_publish", "true", 2), "true");
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : TextUtils.equals(a("weitao_switch", "enable_async_publish", "true", 2), "true");
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : TextUtils.equals(a("weitao_switch", "startDownloadDxTemplate", "false", 2), "true");
    }
}
