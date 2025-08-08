package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import com.taobao.android.riverlogger.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/alibaba/android/nextrpc/util/NextRPCRVLogger;", "", "()V", "log", "", "code", "", "message", "timestamp", "", "args", "", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class ada {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ada INSTANCE = new ada();

    private ada() {
    }

    public static /* synthetic */ void a(String str, String str2, long j, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81dd342", new Object[]{str, str2, new Long(j), map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i & 8) != 0) {
            map = null;
        }
        a(str, str2, j, map);
    }

    @JvmStatic
    public static final void a(String code, String message, long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550999bd", new Object[]{code, message, new Long(j), map});
            return;
        }
        q.d(code, "code");
        q.d(message, "message");
        try {
            RVLLevel rVLLevel = RVLLevel.Error;
            StringBuilder sb = new StringBuilder();
            sb.append("NextRPC/");
            if (StringUtils.isEmpty(code)) {
                code = "common";
            }
            sb.append(code);
            b a2 = e.a(rVLLevel, sb.toString()).a(RVLLevel.Error);
            if (j <= 0) {
                a2.a(System.currentTimeMillis());
            } else {
                a2.a(j);
            }
            a2.a("message", (Object) message);
            a2.a((Map<String, ?>) map);
            a2.a();
        } catch (Exception unused) {
        }
    }
}
