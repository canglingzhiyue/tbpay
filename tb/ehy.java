package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ehy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f27315a = new HashMap();
    private static final Map<String, lyu> b = new HashMap();

    private lyu b(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (lyu) Class.forName(str).newInstance();
        } catch (Exception e) {
            TLog.loge(a.a(), "IntroductoryCallbackManager", "instantiateCallback error", e);
            return null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f27315a.put("tab2", "com.taobao.android.layoutmanager.module.NavigationTabModule");
        }
    }

    public lyu a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyu) ipChange.ipc$dispatch("7c723a8c", new Object[]{this, str});
        }
        lyu lyuVar = b.get(str);
        if (lyuVar == null && (lyuVar = b(f27315a.get(str))) != null) {
            b.put(str, lyuVar);
        }
        return lyuVar;
    }
}
