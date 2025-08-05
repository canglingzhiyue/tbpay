package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.a;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* loaded from: classes.dex */
public class jgx implements jgw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMETER_APP_VERSION = "appVersion";

    /* renamed from: a  reason: collision with root package name */
    private final int f29546a = 100;

    static {
        kge.a(797875508);
        kge.a(430556039);
    }

    @Override // tb.jgw
    public boolean a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("656bbc4f", new Object[]{this, hashMap})).booleanValue() : a.a(hashMap);
    }

    @Override // tb.jgw
    public boolean b(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("616d4b2e", new Object[]{this, hashMap})).booleanValue();
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return false;
        }
        try {
            String[] split = ((String) hashMap.get("appVersion")).split("\\.");
            if (split != null && split.length == 4) {
                return a(split[3], 100);
            }
            return false;
        } catch (Throwable th) {
            TLog.loge("TaobaoGrayVersion", "TaobaoGrayVersion.isGayVersion ", th);
            return false;
        }
    }

    private boolean a(String str, int i) throws NumberFormatException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue() : Integer.parseInt(str) < i;
    }
}
