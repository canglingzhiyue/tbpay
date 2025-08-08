package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.d;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* loaded from: classes7.dex */
public class nlk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nll f31561a;

    static {
        kge.a(314839480);
    }

    public nlk(nll nllVar) {
        this.f31561a = nllVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            a(false, "no item key");
            ldf.d("WindvaneRequestPolicy", "shouldHappen !isCurrentItemKeyValid return false");
            return false;
        } else if (!c()) {
            a(false, "no item id");
            ldf.d("WindvaneRequestPolicy", "shouldHappen !isCurrentItemIdValid return false");
            return false;
        } else if (!d()) {
            a(false, "windvane not expired");
            ldf.d("WindvaneRequestPolicy", "shouldHappen !isWindvaneExpired return false");
            return false;
        } else if (!e() && !f()) {
            a(false, "not main edition");
            ldf.d("WindvaneRequestPolicy", "shouldHappen !isMainEdition && !isInternational return false");
            return false;
        } else if (!HomePageUtility.a(j.a("v5WindvaneEnable", "true"))) {
            a(false, "degrade");
            ldf.d("WindvaneRequestPolicy", "shouldHappen !enableWindvane return false");
            return false;
        } else if (this.f31561a.c().contains(this.f31561a.b())) {
            b(false, "current exposed");
            ldf.d("WindvaneRequestPolicy", "shouldHappen !containsItemKey return false");
            return false;
        } else if (HomePageUtility.a(j.a("enableWindvaneNearbyFilter", "true")) && h() && g()) {
            b(false, "next or prev exposed");
            ldf.d("WindvaneRequestPolicy", "shouldHappen isNearbyItemExposed return false");
            return false;
        } else {
            a(true, "");
            return true;
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f31561a.b());
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f31561a.a());
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f31561a.f() <= 0 || this.f31561a.e() <= 0 || System.currentTimeMillis() > ((long) (this.f31561a.e() + this.f31561a.f()));
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : StringUtils.equals("main", i.a());
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : StringUtils.equals(h.HOMEPAGE_HTAO, i.a());
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        int indexOf = this.f31561a.d().indexOf(this.f31561a.b());
        if (indexOf > 0 && this.f31561a.c().contains(this.f31561a.d().get(indexOf - 1))) {
            return true;
        }
        return indexOf < this.f31561a.d().size() - 1 && this.f31561a.c().contains(this.f31561a.d().get(indexOf + 1));
    }

    private void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        a.a("dataProcess", "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitor  needRequest: " + z + "reason" + str);
        String str2 = z ? "windvane_request_need" : "windvane_request_not_need";
        if (str == null) {
            str = "";
        }
        ksr.a("windvane_request_filter", "1.0", str2, "", str);
    }

    private void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31b0915", new Object[]{this, new Boolean(z), str});
            return;
        }
        a.a("dataProcess", "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitorFail needRequest: " + z + "reason" + str);
        String str2 = z ? "windvane_request_need" : "windvane_request_not_need";
        if (str == null) {
            str = "";
        }
        ksr.a("windvane_request_filter", "1.0", str2, "-999", str, (String) null, (String) null);
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        nll nllVar = this.f31561a;
        if (nllVar == null) {
            a.a("dataProcess", "WindvaneRequestPolicy", "scene is null");
            return true;
        }
        String g = nllVar.g();
        if (StringUtils.isEmpty(g)) {
            a.a("dataProcess", "WindvaneRequestPolicy", "containerId is empty");
            return true;
        } else if (d.f(g) == null) {
            return true;
        } else {
            String a2 = a(d.f(g).b(g), "wvNeighborCardEnable");
            a.a("dataProcess", "WindvaneRequestPolicy", "containerId：" + g + ", value : " + a2);
            return a2 == null || !Boolean.parseBoolean(a2);
        }
    }

    private String a(AwesomeGetContainerData awesomeGetContainerData, String str) {
        IContainerInnerDataModel<SectionModel> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d4341b2", new Object[]{this, awesomeGetContainerData, str});
        }
        if (awesomeGetContainerData != null && (base = awesomeGetContainerData.getBase()) != null && (ext = base.getExt()) != null && ext.containsKey(str)) {
            return ext.getString(str);
        }
        return null;
    }
}
