package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.aura.broadcast.AbsAliDetailBroadcastReceiver;
import com.taobao.android.detail.core.aura.broadcast.AbsAliDetailUIRefreshBroadcastReceiver;
import com.taobao.android.detail.core.aura.broadcast.AliDetailSKURefreshBroadcastReceiver;
import com.taobao.android.detail.core.aura.broadcast.AliDetailSkuPVSelectedRefreshBroadcastReceiver;
import com.taobao.android.detail.core.aura.presenter.c;
import com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import tb.dxr;

/* loaded from: classes4.dex */
public class dxt extends dxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final dxv d = new dxx();
    private AliDetailSKURefreshBroadcastReceiver e;
    private AliDetailSkuPVSelectedRefreshBroadcastReceiver f;
    private AliDetailAuraRecyclerView g;

    static {
        kge.a(749950977);
    }

    public static /* synthetic */ Object ipc$super(dxt dxtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dxu
    public /* synthetic */ dxw e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dxw) ipChange.ipc$dispatch("2dca8097", new Object[]{this}) : c();
    }

    public dxt(DetailCoreActivity detailCoreActivity, IAURAPluginCenter[] iAURAPluginCenterArr, dwj dwjVar) {
        this.f27069a = detailCoreActivity;
        this.c = iAURAPluginCenterArr;
        this.b = new c(detailCoreActivity, this);
        this.b.a(this.c);
        a(detailCoreActivity);
        HashMap hashMap = new HashMap();
        hashMap.put("mainRecyclerView", this.g);
        hashMap.put("detailAdapter", dwjVar);
        hashMap.put("token", detailCoreActivity.h);
        this.b.a(hashMap);
        b(detailCoreActivity);
        emu.a("com.taobao.android.detail.core.aura.page.AliDetailAuraMainPage");
    }

    @Override // tb.dxr, tb.dxu
    public s a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("3c3eac55", new Object[]{this}) : this.b.g();
    }

    @Override // tb.dxu
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.g;
    }

    @Override // tb.dxu
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a(jSONObject, new aqq<UMFBaseIO>() { // from class: tb.dxt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqq, tb.aqs
                public void a(com.alibaba.android.aura.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    } else if (bVar == null) {
                    } else {
                        String a2 = j.a("AliDetailAuraMainPage");
                        i.a(a2, "aura main page build error:" + bVar.toString());
                        eca.a(dxt.this.f27069a, (String) null, bVar.toString(), eca.TYPE_DETAIL_AURA);
                    }
                }
            });
        }
    }

    public void a(JSONObject jSONObject, aqq<? extends UMFBaseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6113017", new Object[]{this, jSONObject, aqqVar});
            return;
        }
        i.d(j.a("AliDetailAuraMainPage"), "buildPage start");
        this.b.a("aura.workflow.detailInfo.build", new AURAParseIO(Collections.singletonList(new com.alibaba.android.aura.datamodel.parse.a(jSONObject))), new a(null, aqqVar, this.e, this.f));
        i.d(j.a("AliDetailAuraMainPage"), "buildPage aura executeFlow end");
        f();
        i.d(j.a("AliDetailAuraMainPage"), "buildPage end");
    }

    public dxv c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dxv) ipChange.ipc$dispatch("1e6735ba", new Object[]{this}) : this.d;
    }

    @Override // tb.dxu
    public void a(UMFRuleIO uMFRuleIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2724f84e", new Object[]{this, uMFRuleIO});
        } else if (uMFRuleIO == null) {
        } else {
            this.b.a("aura.workflow.adjustRules", uMFRuleIO, new b(this.e, this.f));
            i.d(j.a("AliDetailAuraMainPage"), "refreshPage aura executeFlow end");
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.g == null) {
        } else {
            if (com.taobao.android.detail.core.aura.utils.a.a(this.f27069a)) {
                this.g.setBackgroundColor(-723724);
            } else {
                this.g.setBackgroundColor(-1);
            }
        }
    }

    @Override // tb.dxu
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.d();
        c(this.f27069a);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (eip.n) {
            this.g = new AliDetailAuraRecyclerView(context);
            this.g.setId(R.id.mainpage2);
            this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.g.setBackgroundColor(-1);
            this.g.setOverScrollMode(2);
            this.g.setVerticalScrollBarEnabled(false);
            this.g.setHorizontalScrollBarEnabled(false);
            i.c(com.taobao.android.detail.core.performance.a.a("AliDetailAuraMainPage"), "AliDetailAuraRecyclerView通过代码create");
        } else {
            this.g = (AliDetailAuraRecyclerView) d.b(context, R.layout.x_detail_main_aura);
            i.c(com.taobao.android.detail.core.performance.a.a("AliDetailAuraMainPage"), "AliDetailAuraRecyclerView通过Layout文件create");
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        if (this.e == null) {
            this.e = new AliDetailSKURefreshBroadcastReceiver(context, this);
        }
        if (this.f == null) {
            this.f = new AliDetailSkuPVSelectedRefreshBroadcastReceiver(context, this);
        }
        AbsAliDetailUIRefreshBroadcastReceiver.a(context, this.e, "com.taobao.sku.intent.action.syncData");
        this.f.a(context, AliDetailSkuPVSelectedRefreshBroadcastReceiver.INTENT_FILTER_ACTION);
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        AliDetailSKURefreshBroadcastReceiver aliDetailSKURefreshBroadcastReceiver = this.e;
        if (aliDetailSKURefreshBroadcastReceiver != null) {
            AbsAliDetailUIRefreshBroadcastReceiver.a(context, aliDetailSKURefreshBroadcastReceiver);
        }
        AliDetailSkuPVSelectedRefreshBroadcastReceiver aliDetailSkuPVSelectedRefreshBroadcastReceiver = this.f;
        if (aliDetailSkuPVSelectedRefreshBroadcastReceiver == null) {
            return;
        }
        aliDetailSkuPVSelectedRefreshBroadcastReceiver.a(context);
    }

    /* loaded from: classes4.dex */
    public static class a extends dxr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<AbsAliDetailBroadcastReceiver> f27075a;

        static {
            kge.a(-436616619);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 112764847) {
                super.a((com.alibaba.android.aura.datamodel.c) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(ViewGroup viewGroup, aqq aqqVar, AbsAliDetailBroadcastReceiver... absAliDetailBroadcastReceiverArr) {
            super(viewGroup, aqqVar);
            this.f27075a = absAliDetailBroadcastReceiverArr != null ? Arrays.asList(absAliDetailBroadcastReceiverArr) : null;
        }

        @Override // tb.dxr.a, tb.aqq
        public void a(com.alibaba.android.aura.datamodel.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                return;
            }
            super.a(cVar);
            List<AbsAliDetailBroadcastReceiver> list = this.f27075a;
            if (list == null) {
                return;
            }
            for (AbsAliDetailBroadcastReceiver absAliDetailBroadcastReceiver : list) {
                absAliDetailBroadcastReceiver.a(cVar.c());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends aqq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<AbsAliDetailBroadcastReceiver> f27076a;

        static {
            kge.a(-1072554430);
        }

        public b(AbsAliDetailBroadcastReceiver... absAliDetailBroadcastReceiverArr) {
            this.f27076a = absAliDetailBroadcastReceiverArr != null ? Arrays.asList(absAliDetailBroadcastReceiverArr) : null;
        }

        @Override // tb.aqq
        public void a(com.alibaba.android.aura.datamodel.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                return;
            }
            List<AbsAliDetailBroadcastReceiver> list = this.f27076a;
            if (list == null) {
                return;
            }
            for (AbsAliDetailBroadcastReceiver absAliDetailBroadcastReceiver : list) {
                absAliDetailBroadcastReceiver.a(cVar.c());
            }
        }
    }
}
