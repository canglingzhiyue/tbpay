package tb;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.activity.base.BaseActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.model.datamodel.node.JhsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class eeq implements j<p> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RefreshDetailSubscriber";
    public String UNKNOW_ERR = b.a(R.string.taodetail_server_busy);

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27242a;
    private p b;

    static {
        kge.a(1972601030);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(eeq eeqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("cff86bb2", new Object[]{eeqVar}) : eeqVar.f27242a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, pVar}) : a(pVar);
    }

    public eeq(DetailCoreActivity detailCoreActivity) {
        this.f27242a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.RefreshDetailSubscriber");
    }

    public i a(p pVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("83d95ad", new Object[]{this, pVar});
        }
        dya y = this.f27242a.y();
        boolean a2 = a(y, pVar);
        com.taobao.android.detail.core.utils.i.d(TAG, "needNativeRefresh: " + a2);
        if (a2) {
            z = c(y, pVar);
            com.taobao.android.detail.core.utils.i.d(TAG, "localRefresh result: " + z);
        }
        if (!a2 || !z) {
            this.b = pVar;
            b(y, pVar);
            com.taobao.android.detail.core.utils.i.d(TAG, "remoteRefresh finish");
        }
        return a.SUCCESS;
    }

    private boolean a(dya dyaVar, p pVar) {
        VerticalNode g;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d87ab54a", new Object[]{this, dyaVar, pVar})).booleanValue() : (pVar == null || pVar.c == null || !pVar.c.c || dyaVar == null || dyaVar.t == null || !dyaVar.t.d() || (g = eqb.g(dyaVar.t.f10055a)) == null || !g.jhsNode.needNativeRefresh.booleanValue() || g.jhsNode.status != JhsNode.b.f9974a) ? false : true;
    }

    private void b(final dya dyaVar, final p pVar) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9308207", new Object[]{this, dyaVar, pVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (pVar.f || pVar.g) {
            hashMap.putAll(dyaVar.A());
        }
        if (!rjq.a(pVar.f9712a)) {
            hashMap.put(mrm.KEY_AREA_ID, pVar.f9712a);
        }
        if (!rjq.a(pVar.b)) {
            hashMap.put("addressId", pVar.b);
        }
        if (pVar.h) {
            if (!StringUtils.isEmpty(pVar.i)) {
                hashMap.put(DetailCoreActivity.DETAIL_ITEM_ID, pVar.i);
                hashMap.put("id", pVar.i);
                hashMap.put("item_id", pVar.i);
            }
            if (!StringUtils.isEmpty(pVar.j)) {
                hashMap.put("skuId", pVar.j);
            }
        }
        if (dyaVar.f() == null) {
            z = false;
        }
        dyaVar.a(new e.c() { // from class: tb.eeq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                eeq eeqVar = eeq.this;
                eeqVar.a(mtopResponse, eeq.a(eeqVar));
            }

            @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
            public void a(enh enhVar) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e72cc599", new Object[]{this, enhVar});
                    return;
                }
                com.taobao.android.detail.core.utils.i.d(eeq.TAG, "remoteRefresh 详情重刷 onSuccess回调");
                if (enhVar == null || enhVar.b == null) {
                    return;
                }
                if (pVar.f || pVar.h) {
                    dyaVar.a(enhVar.c, false);
                    return;
                }
                p pVar2 = pVar;
                if (pVar2 != null && pVar2.e != null) {
                    dyaVar.a(enhVar.b, false);
                    f.a(eeq.a(eeq.this), pVar.e);
                    return;
                }
                if (dyaVar.f() == null) {
                    z2 = false;
                }
                if (z2 != z) {
                    dyaVar.a(enhVar.b, false);
                } else {
                    dyaVar.a(enhVar.b);
                }
            }
        }, hashMap);
        com.taobao.android.detail.core.utils.i.d(TAG, "remoteRefresh 详情重刷");
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [tb.eeq$2] */
    private boolean c(final dya dyaVar, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9e64ecc", new Object[]{this, dyaVar, pVar})).booleanValue();
        }
        if (pVar.c == null) {
            return false;
        }
        try {
            final com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = dyaVar.t.f10055a;
            if (pVar.c.f9717a != null) {
                com.taobao.android.detail.core.utils.i.d(TAG, "canbuy: " + pVar.c.f9717a);
                eqb.e(bVar).isBuyEnable = pVar.c.f9717a.booleanValue();
                bVar.a().getJSONObject("trade").put("buyEnable", (Object) pVar.c.f9717a);
            }
            if (pVar.c.b != null) {
                com.taobao.android.detail.core.utils.i.d(TAG, "status : " + pVar.c.b);
                eqb.g(bVar).jhsNode.status = pVar.c.b.shortValue();
                bVar.a().getJSONObject("vertical").getJSONObject("jhs").put("status", (Object) pVar.c.b);
            }
            bVar.a().getJSONObject("layout").put(SyncConstant.KEY_LAYOUTID, (Object) eqb.g(bVar).jhsNode.refreshLayoutId);
            if (this.f27242a.o() != null) {
                this.f27242a.o().setVisibility(0);
            }
            new AsyncTask<String, Long, eng>() { // from class: tb.eeq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [tb.eng, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ eng doInBackground(String[] strArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(eng engVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, engVar});
                    } else {
                        a(engVar);
                    }
                }

                public eng a(String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (eng) ipChange2.ipc$dispatch("4801add1", new Object[]{this, strArr}) : new emy(eeq.a(eeq.this)).a(bVar).b;
                }

                public void a(eng engVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e72c513a", new Object[]{this, engVar});
                        return;
                    }
                    super.onPostExecute(engVar);
                    if (eeq.a(eeq.this).o() != null) {
                        eeq.a(eeq.this).o().setVisibility(8);
                    }
                    com.taobao.android.detail.core.utils.i.d(eeq.TAG, "onPostExecute controller.rebuildLayout");
                    dyaVar.a(engVar);
                }
            }.execute(new String[0]);
            return true;
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(TAG, TAG, e);
            if (this.f27242a.o() != null) {
                this.f27242a.o().setVisibility(8);
            }
            return false;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public boolean a(MtopResponse mtopResponse, BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db408649", new Object[]{this, mtopResponse, baseActivity})).booleanValue();
        }
        if (mtopResponse == null) {
            epo.a(this.UNKNOW_ERR);
            return true;
        } else if (mtopResponse.isApiSuccess()) {
            return false;
        } else {
            if (mtopResponse.isSessionInvalid()) {
                return true;
            }
            if (mtopResponse.isNetworkError() && !NetworkUtils.a(epo.a())) {
                com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = new com.taobao.android.detail.core.detail.kit.view.widget.base.a(baseActivity, baseActivity);
                aVar.a((String) null);
                aVar.a();
                return true;
            }
            epo.a(b.a(R.string.taodetail_server_busy));
            return true;
        }
    }
}
