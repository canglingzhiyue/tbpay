package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.adapterimpl.favorite.business.FavoriteResponseData;
import com.taobao.taolive.adapterimpl.favorite.business.a;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class pae implements pmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<pmo> f32524a = new CopyOnWriteArrayList();

    static {
        kge.a(1835188890);
        kge.a(6048154);
    }

    public static /* synthetic */ void a(pae paeVar, pmq pmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82411a0", new Object[]{paeVar, pmqVar});
        } else {
            paeVar.a(pmqVar);
        }
    }

    @Override // tb.pmr
    public void a(pmo pmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e72b86", new Object[]{this, pmoVar});
        } else if (pmoVar == null || this.f32524a.contains(pmoVar)) {
        } else {
            this.f32524a.add(pmoVar);
        }
    }

    @Override // tb.pmr
    public void b(pmo pmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86a3207", new Object[]{this, pmoVar});
        } else if (pmoVar == null) {
        } else {
            this.f32524a.remove(pmoVar);
        }
    }

    @Override // tb.pmr
    public void a(final pmp pmpVar, final pms pmsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aeb637f", new Object[]{this, pmpVar, pmsVar});
        } else {
            new a(new d() { // from class: tb.pae.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    FavoriteResponseData favoriteResponseData = (FavoriteResponseData) netBaseOutDo.mo1437getData();
                    if (favoriteResponseData.retCode == 1) {
                        pmq pmqVar = new pmq();
                        pmqVar.f32763a = pmpVar.f32762a;
                        pmqVar.b = true;
                        pms pmsVar2 = pmsVar;
                        if (pmsVar2 != null) {
                            pmsVar2.a(pmqVar);
                        }
                        pae.a(pae.this, pmqVar);
                        return;
                    }
                    pms pmsVar3 = pmsVar;
                    if (pmsVar3 == null) {
                        return;
                    }
                    pmsVar3.a("" + favoriteResponseData.retCode, favoriteResponseData.retTitle);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else if (pmsVar == null) {
                    } else {
                        pmsVar.a(netResponse != null ? netResponse.getRetCode() : "0", netResponse != null ? netResponse.getRetMsg() : "服务出错了");
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            }).a(pmpVar.f32762a);
        }
    }

    private void a(pmq pmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e81444", new Object[]{this, pmqVar});
            return;
        }
        pmn pmnVar = new pmn();
        pmnVar.f32761a = pmqVar.f32763a;
        pmnVar.b = pmqVar.b;
        for (pmo pmoVar : this.f32524a) {
            pmoVar.onFavoriteChange(pmnVar);
        }
    }
}
