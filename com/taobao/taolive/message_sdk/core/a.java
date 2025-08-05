package com.taobao.taolive.message_sdk.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import tb.pev;
import tb.pew;
import tb.pex;
import tb.pmd;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String u = "a";

    /* renamed from: a  reason: collision with root package name */
    public int f21436a = pev.a();
    public HashMap<Integer, Integer> b = new HashMap<>();
    public boolean c;
    public int d;
    public int e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public String[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;

    public a() {
        this.s = false;
        try {
            JSONObject parseObject = JSON.parseObject(pev.b());
            for (String str : parseObject.keySet()) {
                this.b.put(Integer.valueOf(str), parseObject.getInteger(str));
            }
        } catch (Exception unused) {
        }
        this.c = pev.c();
        this.d = pev.d();
        this.e = pev.e();
        this.f = pev.k();
        this.g = pev.l();
        this.h = pev.f();
        this.i = pev.g();
        this.l = pev.h();
        this.j = pev.i();
        this.k = pev.s();
        this.m = pev.m();
        this.n = pev.n();
        this.o = pev.o();
        this.p = pev.p().split(";");
        this.t = pev.j();
        String str2 = u;
        pex.a(str2, "LiveMessageConfig[init]:" + toString());
        this.r = pev.q();
        if (!this.r) {
            this.q = pew.b(pmd.a().t().a("taolive", "liveMsgUsecdn", "enable", "true"));
        } else {
            this.q = true;
        }
        this.s = pev.r();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LiveMessageConfig{deduplicationSize=" + this.f21436a + ", defaultColorRate=" + this.b + ", useCdnFetchMSG=" + this.c + ", cdnFetchMSGInterval=" + this.d + ", cdnFetchMSGIntervalMax=" + this.e + ", cdnFetchMSGURL='" + this.f + "', isAddDeviceIdCdnFetchMSG=" + this.h + ", isNeedCDNMessageGet=" + this.i + ", timeoutCDNMessageGet=" + this.l + ", useHeartbeat=" + this.m + ", heartbeatInterval=" + this.n + ", heartFetchStatusInterval=" + this.o + ", heartbeatCommonExtraParams=" + Arrays.toString(this.p) + ", isLiveMessageLongPullDisable=" + this.j + ", timeoutCDNLongPull=" + this.t + ", cdnLongFetchMSGURL=" + this.g + ", isHeartbeatDisable=" + this.k + '}';
    }
}
