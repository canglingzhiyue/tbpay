package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class gkm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private gjz f28369a;
    private Map<String, gke> b = new ConcurrentHashMap();
    private Map<String, gkl> c = new ConcurrentHashMap();

    static {
        kge.a(1824014798);
    }

    public gkm(gjz gjzVar) {
        this.f28369a = gjzVar;
    }

    public void a(gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea664781", new Object[]{this, gjzVar});
            return;
        }
        this.f28369a = gjzVar;
        try {
            a(gke.BIZ_CONTEXT_RECORD, new gkd(this.f28369a));
            a(gke.SWITCH_BOOLEAN, new gkg());
            a(gke.SWITCH_STRING, new gkh());
            a(gkl.DP_BIZ_CONTEXT, new gkk(this.f28369a));
        } catch (GatewayException e) {
            e.printStackTrace();
        }
    }

    public gke a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gke) ipChange.ipc$dispatch("7c6fbe33", new Object[]{this, str}) : this.b.get(str);
    }

    public gkl b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gkl) ipChange.ipc$dispatch("7d1c6aab", new Object[]{this, str}) : this.c.get(str);
    }

    public void a(String str, gke gkeVar) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a554901", new Object[]{this, str, gkeVar});
        } else if (this.b.containsKey(str)) {
            throw new GatewayException("register action duplicate");
        } else {
            if (gkeVar == null) {
                return;
            }
            this.b.put(str, gkeVar);
        }
    }

    public void a(String str, gkl gklVar) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a58779a", new Object[]{this, str, gklVar});
        } else if (this.c.containsKey(str)) {
            throw new GatewayException("register dataProvider duplicate");
        } else {
            if (gklVar == null) {
                return;
            }
            this.c.put(str, gklVar);
        }
    }
}
