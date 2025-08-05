package com.taobao.taolivecontainer;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.psn;
import tb.psq;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ABTEST_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";
    public static boolean g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22052a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;

    static {
        kge.a(-449987821);
        g = false;
    }

    public c() {
        this.f22052a = true;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 5000L;
    }

    public c(psn psnVar) {
        boolean z = true;
        this.f22052a = true;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = 5000L;
        if (psnVar != null) {
            this.f22052a = psq.a(psnVar.a("tblive", "enablePreCreateWebView", "true"));
            this.b = (g || !psq.a(psnVar.a("tblive", "enablePreloadHtml", "true"))) ? false : z;
            this.c = psq.a(psnVar.a("tblive", "enableLoadUrlSSR", "true"));
            this.d = psq.a(psnVar.a("tblive", "enablePreLoadZCache", "true"));
            this.e = psq.a(psnVar.a("tblive", "enablePreRender", "true"));
            this.f = psq.a(psnVar.a("tblive", "minGetTemperatureInterval", IDecisionResult.ENGINE_ERROR), 5000L);
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enablePreCreateWebView", String.valueOf(this.f22052a));
        hashMap.put("enablePreloadHtml", String.valueOf(this.b));
        hashMap.put("enableLoadUrlSSR", String.valueOf(this.c));
        hashMap.put("enablePreLoadZCache", String.valueOf(this.d));
        hashMap.put("enablePreRender", String.valueOf(this.e));
        return hashMap;
    }
}
