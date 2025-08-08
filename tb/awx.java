package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes2.dex */
public final class awx extends aqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEFAULT_VALUE = "default";
    public static final String KEY_NAME_SPACE = "namespace";
    public static final String KEY_ORANGE_KEY = "key";

    static {
        kge.a(709523984);
    }

    @Override // tb.aqn
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("namespace");
        String str2 = map.get("key");
        String str3 = map.get("default");
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            return Boolean.parseBoolean(str3);
        }
        try {
            return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig(str, str2, String.valueOf(str3)));
        } catch (Exception unused) {
            return Boolean.parseBoolean(str3);
        }
    }
}
