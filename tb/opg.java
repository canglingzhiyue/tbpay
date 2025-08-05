package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.request.a;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.intf.MtopPrefetch;

/* loaded from: classes.dex */
public class opg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final opv f32259a = new opv(opr.c(), opr.b());

    static {
        kge.a(1580097635);
    }

    public static /* synthetic */ opv a(opg opgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (opv) ipChange.ipc$dispatch("ab98c3bf", new Object[]{opgVar}) : opgVar.f32259a;
    }

    public static /* synthetic */ void a(opg opgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ec27bc", new Object[]{opgVar, str});
        } else {
            opgVar.a(str);
        }
    }

    public static /* synthetic */ void b(opg opgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d4effd", new Object[]{opgVar, str});
        } else {
            opgVar.b(str);
        }
    }

    public void a(RemoteBusiness remoteBusiness, a aVar, final AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52dbad", new Object[]{this, remoteBusiness, aVar, awesomeGetRequestParams});
            return;
        }
        try {
            long parseLong = TextUtils.isEmpty(aVar.e) ? 5000L : Long.parseLong(aVar.e);
            remoteBusiness.mo1301prefetchComparator((MtopPrefetch.IPrefetchComparator) new jlw());
            remoteBusiness.mo1299prefetch(parseLong, aVar.f, new MtopPrefetch.IPrefetchCallback() { // from class: tb.opg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
                public void onPrefetch(String str, HashMap<String, String> hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                        return;
                    }
                    opg.a(opg.this).a(awesomeGetRequestParams, str, hashMap);
                    opg.a(opg.this, str);
                    opg.b(opg.this, str);
                    lap.a("recmdPrefetch", "PrefetchRequest", "MtopPrefetch.IPrefetchCallback: type=" + str);
                }
            }).startRequest();
            this.f32259a.a(awesomeGetRequestParams);
            lap.a("recmdPrefetch", "PrefetchRequest", "发送预加载请求，当前的时间是：" + System.currentTimeMillis());
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PrefetchRequest", "prefetch request failed, " + e);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
            opr.c("success");
        } else {
            opr.c("failed");
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            oph.a(str);
        }
    }
}
