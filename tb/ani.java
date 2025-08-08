package tb;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import com.taobao.muniontaobaosdk.util.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ani {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f25454a = new HashMap();
    private Map<String, String> b = new HashMap();
    private Map<String, String> c = new HashMap();
    private String d;

    static {
        kge.a(-1098820272);
    }

    public ani(String str) {
        this.d = str;
    }

    public ani a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ani) ipChange.ipc$dispatch("7c6d0fb8", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.f25454a.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
        }
        return this;
    }

    public ani b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ani) ipChange.ipc$dispatch("7d19bb57", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.f25454a.put("namespace", str);
        }
        return this;
    }

    public ani a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ani) ipChange.ipc$dispatch("24addb6d", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.f25454a.put(TanxArgNames.UT_ARGS.getKey(), b.b(map));
            this.c = map;
        }
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new ayo(this.d, this.f25454a, this.b).a();
        }
    }
}
