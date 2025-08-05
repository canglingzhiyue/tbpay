package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.List;
import tb.hgv;
import tb.hgx;
import tb.hir;
import tb.his;
import tb.hiw;
import tb.kge;
import tb.pqj;
import tb.sxt;

/* loaded from: classes5.dex */
public class d extends com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.a<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.live.plugin.atype.flexalocal.good.business.f b;
    private hgx c;
    private com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate.a d;
    private boolean e;
    private boolean f;
    private JSONObject g;

    static {
        kge.a(-263200763);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(d dVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("17a55ac6", new Object[]{dVar, jSONObject});
        }
        dVar.g = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ hgv a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("54dd3245", new Object[]{dVar}) : dVar.f13750a;
    }

    public static /* synthetic */ void a(d dVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55ce57b", new Object[]{dVar, list});
        } else {
            dVar.a(list);
        }
    }

    public static /* synthetic */ JSONObject b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6a1652ab", new Object[]{dVar}) : dVar.g;
    }

    public static /* synthetic */ hgv c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("10c3fe03", new Object[]{dVar}) : dVar.f13750a;
    }

    public static /* synthetic */ hgv d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("eeb763e2", new Object[]{dVar}) : dVar.f13750a;
    }

    public static /* synthetic */ hgv e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("ccaac9c1", new Object[]{dVar}) : dVar.f13750a;
    }

    public d(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(cVar);
        this.e = hir.M();
        this.f = hir.N();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.l != null && this.l.k()) {
            his.b("GoodViewModel", "requestTopOperate isMoveHighlight.");
        } else if (!this.e) {
            his.b("GoodViewModel", "mEnableShowGoodTopOperateView is false.");
        } else if (this.l.r() && !this.f) {
        } else {
            d();
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!hiw.b()) {
        } else {
            b(z);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.l == null) {
            his.b("GoodViewModel", "requestTopOperate mGoodLiveContext is null.");
        } else {
            if (this.d == null) {
                this.d = new com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        } else if (netResponse == null || netResponse.getDataJsonObject() == null || d.a(d.this) == null) {
                        } else {
                            d.a(d.this, pqj.b(netResponse.getDataJsonObject().toString()));
                            ((e) d.c(d.this)).b(d.b(d.this));
                        }
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        } else {
                            onSystemError(i, netResponse, obj);
                        }
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSystemError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        } else if (netResponse == null) {
                        } else {
                            his.b("GoodViewModel", "requestTopOperate error|msg =" + netResponse.getRetMsg());
                        }
                    }
                });
            }
            this.d.a(this.l.g(), this.l.m());
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.l == null) {
        } else {
            final List<String> a2 = sxt.a();
            this.b = new com.taobao.android.live.plugin.atype.flexalocal.good.business.f(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    LiveItemCategoriesResponseData mo1437getData = ((LiveItemCategoriesResponse) netBaseOutDo).mo1437getData();
                    if (mo1437getData != null && mo1437getData.useCdn) {
                        d.a(d.this, a2);
                    } else if (mo1437getData == null) {
                    } else {
                        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s()) {
                            mo1437getData.extraGoodsTabList.clear();
                            org.json.JSONObject dataJsonObject = netResponse.getDataJsonObject();
                            if (dataJsonObject != null) {
                                dataJsonObject.remove("extraGoodsTabList");
                            }
                        }
                        ((e) d.e(d.this)).a(mo1437getData, pqj.b(netResponse.getDataJsonObject().toString()), mo1437getData.defaultCategoryId, a2);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onSystemError(i, netResponse, obj);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        d.a(d.this, a2);
                    }
                }
            });
            this.b.a(this.l, a2, z);
        }
    }

    private void a(final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c = new hgx(String.format("https://live-spare.alicdn.com/liveitem4category/%s/categoryInfos", this.l.g()), LiveItemCategoriesResponseData.class, new hgx.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hgx.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // tb.hgx.a
            public void a(Object obj, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e7dad00", new Object[]{this, obj, new Long(j)});
                } else if (!(obj instanceof LiveItemCategoriesResponseData)) {
                } else {
                    LiveItemCategoriesResponseData liveItemCategoriesResponseData = (LiveItemCategoriesResponseData) obj;
                    ((e) d.d(d.this)).a(liveItemCategoriesResponseData, (JSONObject) JSONObject.toJSON(obj), liveItemCategoriesResponseData.defaultCategoryId, list);
                }
            }
        });
        this.c.a();
    }

    @Override // tb.hgu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.business.f fVar = this.b;
        if (fVar != null) {
            fVar.a();
        }
        hgx hgxVar = this.c;
        if (hgxVar == null) {
            return;
        }
        hgxVar.b();
        this.c = null;
    }
}
