package mtopsdk.framework.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.Request;
import mtopsdk.network.domain.b;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Mtop f25000a;
    public MtopRequest b;
    public MtopResponse c;
    public MtopNetworkProp d = new MtopNetworkProp();
    public MtopListener e;
    public ApiID f;
    public MtopStatistics g;
    public String h;
    public Map<String, String> i;
    public ResponseSource j;
    public Request k;
    public String l;
    public Map<String, String> m;
    public b n;
    public MtopBuilder o;
    public int p;
    public boolean q;
    public Class<?> r;
    public boolean s;
    public boolean t;
    public boolean u;

    static {
        kge.a(-156394230);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.k == null) {
            return "";
        }
        return ", headerFields=" + this.k.c;
    }
}
