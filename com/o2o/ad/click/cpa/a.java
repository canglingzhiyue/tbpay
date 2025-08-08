package com.o2o.ad.click.cpa;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import java.util.HashMap;
import java.util.Map;
import tb.dbe;
import tb.dbg;
import tb.dbh;
import tb.dhf;
import tb.dhg;
import tb.dhm;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f8099a;
    private Map<String, String> b;
    private String c;

    static {
        kge.a(-335225082);
    }

    public static /* synthetic */ Map a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9617c488", new Object[]{aVar}) : aVar.b;
    }

    public a(String str, String str2, Map<String, String> map) {
        this.f8099a = str;
        this.c = str2;
        this.b = map;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "O2O_A2_" + com.taobao.muniontaobaosdk.util.b.a();
    }

    private String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        if (StringUtils.isEmpty(this.f8099a)) {
            return "";
        }
        String a2 = a();
        O2OCpaSendRequest o2OCpaSendRequest = new O2OCpaSendRequest();
        Map a3 = dbg.a(this.f8099a);
        if (a3 == null) {
            a3 = new HashMap();
        }
        Map map2 = a3;
        map2.put(JarvisConstant.KEY_ACTION_ID, a2);
        map2.put("actionType", this.c);
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        dhq dhqVar = new dhq(this.f8099a, dhm.DEFAULT_NO_RETRY, o2OCpaSendRequest, map2, O2OCpaSendResponse.class);
        dhqVar.a(new C0302a());
        dhg.a().a(dhqVar);
        dbh.a("o2o_cpa_request_send", com.taobao.muniontaobaosdk.util.b.a(this.b));
        dbe.a("o2o_cpa_request_send", com.taobao.muniontaobaosdk.util.b.a(this.b));
        return a2;
    }

    public String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map}) : b(map);
    }

    /* renamed from: com.o2o.ad.click.cpa.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0302a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1232024825);
            kge.a(-744181563);
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
        }

        public C0302a() {
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            dbh.a("o2o_cpa_request_success", com.taobao.muniontaobaosdk.util.b.a(a.a(a.this)));
            dbe.a("o2o_cpa_request_success", com.taobao.muniontaobaosdk.util.b.a(a.a(a.this)));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            dbh.a("o2o_cpa_request_fail", com.taobao.muniontaobaosdk.util.b.a(a.a(a.this)));
            dbe.a("o2o_cpa_request_fail", "error_code=" + str, "error_msg=" + str2);
        }
    }
}
