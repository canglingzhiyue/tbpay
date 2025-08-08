package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class ppe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32795a;
    private String b;
    private Map<String, String> c;
    private boolean d;
    private ppb e;
    private a f;

    static {
        kge.a(51748654);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public ppe(ppb ppbVar) {
        this.e = ppbVar;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f32795a = str;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        a aVar = this.f;
        if (aVar != null && aVar.z() != null && this.f.z().aJ_() != null && this.f.z().aJ_().a() != null) {
            ibt a2 = this.f.z().aJ_().a();
            ibu b = this.f.z().aJ_().b();
            this.c.put("spmCnt", a2.f());
            this.c.put("entrySpm", a2.r());
            this.c.put("spmUrl", a2.b());
            this.c.put("entryLiveSource", a2.p());
            this.c.put("pvId", a2.e());
            this.c.put("feedtype", a2.g());
            this.c.put(pqq.KEY_LIVE_SOURCE, a2.N());
            this.c.put("clickId", b.d());
        }
        ppb ppbVar = this.e;
        if (ppbVar != null && ppbVar.b() != null) {
            this.c.put("ad", this.e.b().h() ? "1" : "");
        }
        ppb ppbVar2 = this.e;
        if (ppbVar2 != null && ppbVar2.d() != null) {
            this.c.put("kandianId", this.e.d().c());
        }
        ppb ppbVar3 = this.e;
        if (ppbVar3 != null && ppbVar3.c() != null) {
            this.c.put("watchId", this.e.c().b());
        }
        this.c.put("accountId", this.f32795a);
        this.c.put("contentId", this.b);
        this.c.put("originPage", "Livewatch");
        this.c.put("appKey", "21646297");
        this.c.putAll(c());
        return this.c;
    }

    private Map<String, String> c() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            if (this.f != null && this.f.z() != null && this.f.z().aJ_() != null && this.f.z().aJ_().a() != null) {
                String i = this.f.z().aJ_().a().i();
                if (StringUtils.isEmpty(i)) {
                    return hashMap;
                }
                Uri parse = Uri.parse(i);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames.contains("boostType")) {
                    hashMap.put("boostType", parse.getQueryParameter("boostType"));
                }
                if (queryParameterNames.contains("isBoost")) {
                    hashMap.put("isBoost", parse.getQueryParameter("isBoost"));
                }
                for (String str : u.aV().split(",")) {
                    if (queryParameterNames.contains(str)) {
                        hashMap.put(str, parse.getQueryParameter(str));
                    }
                }
            }
        } catch (Exception e) {
            q.b("LiveBasicData", "getOtherInteractiveParams catch exception:" + e.getMessage());
        }
        return hashMap;
    }
}
