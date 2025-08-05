package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* loaded from: classes5.dex */
public abstract class snb<E extends MtopRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public E b;
    public RemoteBusiness c = RemoteBusiness.build(fa_(), e.c());

    static {
        kge.a(-1828798335);
    }

    public abstract String a();

    public abstract String b();

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "UNIT_TRADE";
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        return null;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : "";
    }

    public snb(E e) {
        this.b = e;
        g();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.b.toData();
    }

    private MtopRequest fa_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("a93505b6", new Object[]{this});
        }
        String j = j();
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(j);
        mtopRequest.setApiName(a());
        mtopRequest.setVersion(b());
        mtopRequest.setNeedEcode(e());
        mtopRequest.setNeedSession(f());
        return mtopRequest;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.mo1305reqMethod(d());
        String c = c();
        if (TextUtils.equals("UNIT_TRADE", c) || TextUtils.equals("UNIT_GUIDE", c)) {
            this.c.mo1328setUnitStrategy(c);
        }
        if (h()) {
            this.c.mo1335useWua();
        }
        Map<String, String> i = i();
        if (i != null && !i.isEmpty()) {
            this.c.mo1297headers(i);
        }
        if (!TextUtils.isEmpty(m())) {
            this.c.mo1310setBizTopic(m());
        }
        this.c.mo1333upstreamCompress(l());
    }

    public snb a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snb) ipChange.ipc$dispatch("24547367", new Object[]{this, handler});
        }
        RemoteBusiness remoteBusiness = this.c;
        if (remoteBusiness != null) {
            remoteBusiness.mo1296handler(handler);
        }
        return this;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.c;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.startRequest();
    }

    public snb a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snb) ipChange.ipc$dispatch("1f480113", new Object[]{this, new Boolean(z)});
        }
        this.c.streamMode(z);
        return this;
    }

    public snb a(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snb) ipChange.ipc$dispatch("ba8b66de", new Object[]{this, mtopListener});
        }
        this.c.registeListener(mtopListener);
        return this;
    }

    public snb a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snb) ipChange.ipc$dispatch("24b60942", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.c.mo1297headers(map);
        }
        return this;
    }

    public MethodEnum d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("27517117", new Object[]{this}) : MethodEnum.GET;
    }
}
