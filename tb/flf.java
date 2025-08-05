package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.a;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.android.t;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class flf implements DetailDataManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SECOND_PLACE_HOLDER_NID = "localSecondPlaceHolderNid";

    /* renamed from: a  reason: collision with root package name */
    public fmd f28027a;
    public DetailDataManager b;
    public b c;

    static {
        kge.a(690985706);
        kge.a(681360126);
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public void a(boolean z, String str, d dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903e0c8", new Object[]{this, new Boolean(z), str, dVar, new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean a(boolean z, String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecde17e7", new Object[]{this, new Boolean(z), str, new Integer(i), dVar})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean b(boolean z, String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd576de8", new Object[]{this, new Boolean(z), str, new Integer(i), dVar})).booleanValue();
        }
        return true;
    }

    public flf(b bVar, fmd fmdVar, DetailDataManager detailDataManager) {
        this.c = bVar;
        this.f28027a = fmdVar;
        this.b = detailDataManager;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean a(boolean z, int i, JSONObject jSONObject, List<d> list, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c830c55f", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
        }
        a(z, jSONObject, list);
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public void a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (z) {
        } else {
            if (i2 == 1) {
                this.f28027a.a(ListViewManager.ListStatus.STATUS_LAST_PAGE);
            } else if (i2 == 2) {
                this.f28027a.a(ListViewManager.ListStatus.STATUS_LOADING);
            } else if (i2 != 3) {
            } else {
                this.f28027a.a(ListViewManager.ListStatus.STATUS_PULL_LOAD_MORE);
            }
        }
    }

    private void a(boolean z, JSONObject jSONObject, List<d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a589f5", new Object[]{this, new Boolean(z), jSONObject, list});
        } else if (jSONObject == null || list == null) {
        } else {
            this.c.h().b(jSONObject.getJSONObject("weexPassGlobalParams"));
            int i = -1;
            JSONObject jSONObject2 = jSONObject.getJSONObject("pageParams");
            if (jSONObject2 != null) {
                i = jSONObject2.getIntValue(BioDetector.EXT_KEY_PAGENUM);
            }
            if (!DetailDataManager.a(z, i)) {
                return;
            }
            d dVar = list.get(0);
            JSONObject jSONObject3 = dVar == null ? new JSONObject() : dVar.H();
            this.c.h().a(jSONObject.getJSONObject("configSwitches"), jSONObject3);
            fky.a(Global.getApplication(), jSONObject3.getJSONObject("optimizeConfig"));
        }
    }

    public void a(boolean z, boolean z2, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96e3208", new Object[]{this, new Boolean(z), new Boolean(z2), str, dVar});
        } else if (dVar == null) {
        } else {
            a(dVar, str);
            if (a(z, dVar)) {
                return;
            }
            b(z, dVar);
            a(z2, str, dVar);
            b(dVar, str);
        }
    }

    public void a(boolean z, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba5438c", new Object[]{this, new Boolean(z), str, dVar});
        } else if (this.f28027a.m() != null && this.f28027a.m().size() > 0) {
            if (z) {
                this.f28027a.a(true, str, dVar);
            } else {
                this.f28027a.a(false, str, dVar);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            if (ipa.an()) {
                arrayList.add(a(dVar.C()));
            }
            this.f28027a.a(arrayList);
        }
    }

    private static fhi a(fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fhi) ipChange.ipc$dispatch("8854c5b4", new Object[]{fkrVar});
        }
        fhi fhiVar = new fhi(fkrVar);
        fhiVar.C = true;
        fhiVar.f = 1;
        fhiVar.k = SECOND_PLACE_HOLDER_NID;
        fhiVar.g = fkrVar.I();
        fhiVar.y = false;
        return fhiVar;
    }

    public void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2dee08", new Object[]{this, dVar, str});
        } else if (!dVar.C) {
            a f = this.c.f();
            fjp.a(f, fjp.SECTION_FIRST_UI_DATA_REFRESH, "itemId=" + str);
        } else {
            a f2 = this.c.f();
            fjp.a(f2, fjp.SECTION_FIRST_UI_DATA_REFRESH_PRE, "itemId=" + str);
        }
    }

    public void b(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4356d049", new Object[]{this, dVar, str});
        } else if (!dVar.C) {
            a f = this.c.f();
            fjp.b(f, fjp.SECTION_FIRST_UI_DATA_REFRESH, "itemId=" + str);
            a f2 = this.c.f();
            fjp.a(f2, fjp.SECTION_FIRST_RECYCLERVIEW, "itemId=" + str);
        } else {
            a f3 = this.c.f();
            fjp.b(f3, fjp.SECTION_FIRST_UI_DATA_REFRESH_PRE, "itemId=" + str);
            a f4 = this.c.f();
            fjp.a(f4, fjp.SECTION_FIRST_RECYCLERVIEW_PRE, "itemId=" + str);
        }
    }

    public boolean a(boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c90882c6", new Object[]{this, new Boolean(z), dVar})).booleanValue();
        }
        if (!(dVar instanceof fhi) || !z || !dVar.F()) {
            return false;
        }
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(this.c.h().k().a());
        a((fhi) dVar);
        fjp.c(dVar, "downgrade", fjp.ERROR_CODE_FIRST_302, "NewDetail首个商品302: " + dVar.k);
        this.c.f().finishNewDetailContainer();
        return true;
    }

    public void b(boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d46f261", new Object[]{this, new Boolean(z), dVar});
            return;
        }
        DetailDataManager detailDataManager = this.b;
        if (!z || dVar.F()) {
            z2 = false;
        }
        detailDataManager.a(z2);
        if (!z || !(dVar instanceof fhi) || !dVar.q()) {
            return;
        }
        fhi fhiVar = (fhi) dVar;
        fky.a(this.c, fhiVar);
        fky.b(this.c, fhiVar);
    }

    private void a(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88d8591", new Object[]{this, fhiVar});
        } else if (this.c.h().x()) {
        } else {
            t.a().a(this.c.g()).a(fhiVar.b());
        }
    }
}
