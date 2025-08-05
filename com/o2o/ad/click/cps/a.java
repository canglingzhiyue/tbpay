package com.o2o.ad.click.cps;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.dbe;
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
    private String f8102a = com.taobao.muniontaobaosdk.util.b.b();

    static {
        kge.a(-1133411512);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b4183ff", new Object[]{aVar}) : aVar.f8102a;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        O2OCpsSendRequest o2OCpsSendRequest = new O2OCpsSendRequest();
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        dhq dhqVar = new dhq(null, dhm.DEFAULT_NO_RETRY, o2OCpsSendRequest, hashMap, O2OCpsSendResponse.class);
        dhqVar.a(new C0303a(hashMap));
        dhg.a().a(dhqVar);
        dbh.a("o2o_cps_request_send", com.taobao.muniontaobaosdk.util.b.a(hashMap), "req_id=" + this.f8102a);
        dbe.a("o2o_cps_request_send", new String[0]);
    }

    /* renamed from: com.o2o.ad.click.cps.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0303a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Map<String, String> b;

        static {
            kge.a(1405351885);
            kge.a(-744181563);
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
        }

        private C0303a(Map<String, String> map) {
            this.b = map;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            dbh.a("o2o_cps_request_success", "req_id=" + a.a(a.this));
            dbe.a("o2o_cps_request_success", com.taobao.muniontaobaosdk.util.b.a(this.b));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            dbh.a("o2o_cps_request_fail", "req_id=" + a.a(a.this));
            dbe.a("o2o_cps_request_fail", "error_code=" + str, "error_msg=" + str2);
        }
    }
}
