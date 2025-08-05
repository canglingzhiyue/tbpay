package tb;

import android.taobao.windvane.extra.core.WVCore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class tbt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String H5_PRELOAD_FIRST_CHUNK = "h5PreloadFirstChunk";
    public static final String PARSE_MANIFEST_URL = "parseManifestUrl";
    public static final String PRELOAD_FIRST_CHUNK = "preloadFirstChunk";
    public static final String PRE_RENDER = "preRender";
    public static final String PRE_REQUEST = "preRequest";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f34015a;

    static {
        kge.a(-593439474);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!ldj.a("isNeedProcessUCSupport", false)) {
            b(str, str2);
            return true;
        }
        Boolean bool = f34015a;
        if (bool != null) {
            return bool.booleanValue();
        }
        b(str, str2);
        return f34015a.booleanValue();
    }

    private static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (f34015a != null) {
        } else {
            Boolean valueOf = Boolean.valueOf(WVCore.getInstance().isUCSupport());
            f34015a = valueOf;
            if (valueOf.booleanValue()) {
                return;
            }
            tbw tbwVar = tbw.INSTANCE;
            tbwVar.a("ucNotSupport", "ucUnSupport", "uc没有初始化,当前阶段是" + str2, "campaign", str, "");
        }
    }
}
