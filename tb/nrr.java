package tb;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.HashMap;
import java.util.Map;
import tb.qzl;

/* loaded from: classes7.dex */
public class nrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ohp b;
    private a d;
    private final Map<String, nrt> c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final qzl.a f31699a = c();

    static {
        kge.a(-119498823);
    }

    public static /* synthetic */ ohp a(nrr nrrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ohp) ipChange.ipc$dispatch("324c9785", new Object[]{nrrVar}) : nrrVar.b;
    }

    public nrr(View view, Activity activity, lbo lboVar) {
        this.b = new ohp(view, activity, lboVar);
        oql.a().o().a(this.f31699a, (String) null);
        a(activity, lboVar, this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.a();
        oql.a().o().b(this.f31699a, (String) null);
        this.c.clear();
        e.e("StraightSecondFloorController", "destroy");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
            return;
        }
        this.d = aVar;
        e.e("StraightSecondFloorController", "更新配置");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(i);
        }
    }

    public void a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8961210", new Object[]{this, refreshState, refreshState2});
            return;
        }
        e.e("StraightSecondFloorController", "onRefreshStateChanged oldState: " + refreshState + ", newState: " + refreshState2);
        if (this.c.isEmpty()) {
            e.e("StraightSecondFloorController", "onRefreshStateChanged mStatusProcessorMap == null");
        } else if (this.d == null) {
            e.e("StraightSecondFloorController", "onRefreshStateChanged mSecondFloorConfig == null");
        } else {
            for (Map.Entry<String, nrt> entry : this.c.entrySet()) {
                nrt value = entry.getValue();
                if (value.a(refreshState, refreshState2)) {
                    value.a(this.d);
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null) {
            e.e("StraightSecondFloorController", "secondBackHome mSecondFloorConfig == null");
        } else {
            nrt nrtVar = this.c.get("backToHome");
            if (nrtVar == null) {
                return;
            }
            nrtVar.a(this.d);
        }
    }

    private qzl.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qzl.a) ipChange.ipc$dispatch("37b7083c", new Object[]{this}) : new qzl.a() { // from class: tb.nrr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qzl.a
            public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96bbefbd", new Object[]{this, jSONObject, iContainerDataModel, str});
                    return;
                }
                nrr.a(nrr.this).c();
                e.e("StraightSecondFloorController", "请求回来了");
            }
        };
    }

    private void a(Activity activity, lbo lboVar, ohp ohpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39197a2a", new Object[]{this, activity, lboVar, ohpVar});
            return;
        }
        ohm ohmVar = new ohm(ohpVar, lboVar);
        odh odhVar = new odh(ohpVar, activity);
        odj odjVar = new odj(lboVar, activity);
        odi odiVar = new odi(activity, ohpVar, lboVar);
        odf odfVar = new odf(activity, lboVar);
        ohn ohnVar = new ohn(ohpVar, lboVar);
        this.c.put("startPull", ohmVar);
        this.c.put("prepareToSecondFloor", odhVar);
        this.c.put("startEnterSecondFloor", odjVar);
        this.c.put("secondFloorEnd", odiVar);
        this.c.put("backToHome", odfVar);
        this.c.put("staticState", ohnVar);
    }
}
