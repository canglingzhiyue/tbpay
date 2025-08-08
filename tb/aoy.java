package tb;

import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.StrategyCenter;
import com.alibaba.analytics.core.sync.h;
import com.alibaba.analytics.core.sync.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class aoy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Comparator<aox> d;
    private IStrategyFilter e;
    private String c = "";
    private int f = 0;
    private boolean g = false;

    /* renamed from: a  reason: collision with root package name */
    private List<aox> f25488a = new ArrayList();
    private Set<String> b = new HashSet();

    static {
        kge.a(721420848);
    }

    public aoy() {
        this.d = null;
        this.e = null;
        this.d = new Comparator<aox>() { // from class: tb.aoy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(aox aoxVar, aox aoxVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aoxVar, aoxVar2})).intValue() : a(aoxVar, aoxVar2);
            }

            public int a(aox aoxVar, aox aoxVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10058ea7", new Object[]{this, aoxVar, aoxVar2})).intValue() : aoxVar.b() - aoxVar2.b();
            }
        };
        this.e = new IStrategyFilter() { // from class: tb.aoy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyFilter
            public boolean accept(IConnStrategy iConnStrategy) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue() : iConnStrategy.getIpType() == 0 && iConnStrategy.getIpSource() == 0 && iConnStrategy.getPort() == 443;
            }
        };
    }

    public h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("165ef97f", new Object[]{this});
        }
        if (this.f >= aow.a().g()) {
            this.g = true;
            this.c = "";
            return null;
        }
        try {
            d();
        } catch (Throwable th) {
            apr.b("SipStrategyList", th, new Object[0]);
        }
        List<aox> list = this.f25488a;
        if (list == null || list.isEmpty()) {
            this.c = "";
            return null;
        }
        aox aoxVar = this.f25488a.get(0);
        if (aoxVar == null) {
            this.c = "";
            return null;
        } else if (aoxVar.b() >= aow.a().f()) {
            this.c = "";
            return null;
        } else {
            h hVar = new h();
            hVar.a(aoxVar.a());
            hVar.b(2);
            hVar.c(2);
            this.c = aoxVar.a();
            return hVar;
        }
    }

    public void a(boolean z) {
        List<aox> list;
        aox aoxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (StringUtils.isEmpty(this.c) || (list = this.f25488a) == null || list.isEmpty() || (aoxVar = this.f25488a.get(0)) == null || !this.c.equalsIgnoreCase(aoxVar.a())) {
        } else {
            if (z) {
                aoxVar.a(0);
                this.f = 0;
            } else {
                aoxVar.c();
                this.f++;
                Collections.sort(this.f25488a, this.d);
            }
            e();
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.g) {
            return 0;
        }
        List<IConnStrategy> c = c();
        b(c);
        if (c == null) {
            return 0;
        }
        return c.size();
    }

    private List<IConnStrategy> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : StrategyCenter.getInstance().getConnStrategyListByHost(i.a().e().a(), this.e);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<IConnStrategy> c = c();
        b(c);
        if (c == null || c.size() == 0) {
            this.f25488a.clear();
            this.b.clear();
            apb.a().a(0);
            return;
        }
        boolean a2 = a(c);
        apr.b("SipStrategyList", "shouldRefreshList", Boolean.valueOf(a2));
        if (!a2) {
            return;
        }
        this.f25488a.clear();
        this.b.clear();
        apb.a().a(c.size());
        for (IConnStrategy iConnStrategy : c) {
            String ip = iConnStrategy.getIp();
            this.f25488a.add(new aox(ip, iConnStrategy.getPort()));
            this.b.add(ip);
        }
    }

    private boolean a(List<IConnStrategy> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (this.f25488a.size() != list.size()) {
            return true;
        }
        for (IConnStrategy iConnStrategy : list) {
            if (!this.b.contains(iConnStrategy.getIp())) {
                return true;
            }
        }
        return false;
    }

    private void b(List<IConnStrategy> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (apr.a()) {
            if (list == null || list.size() == 0) {
                apr.b("SipStrategyList", "connStrategyList is Empty");
                return;
            }
            for (IConnStrategy iConnStrategy : list) {
                apr.b("SipStrategyList", c.IP, iConnStrategy.getIp(), "port", Integer.valueOf(iConnStrategy.getPort()), "IpType", Integer.valueOf(iConnStrategy.getIpType()), "IpSource", Integer.valueOf(iConnStrategy.getIpSource()));
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (apr.a()) {
            List<aox> list = this.f25488a;
            if (list == null || list.size() == 0) {
                apr.b("", "sipConnStrategyList is Empty");
                return;
            }
            for (aox aoxVar : this.f25488a) {
                apr.b("SipStrategyList", c.IP, aoxVar.a(), "failCount", Integer.valueOf(aoxVar.b()));
            }
            apr.b("SipStrategyList", "amdcSipFailCountAll", Integer.valueOf(this.f), "AmdcSipFailCountAll config", Integer.valueOf(aow.a().g()));
        }
    }
}
