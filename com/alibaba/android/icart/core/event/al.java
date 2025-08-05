package com.alibaba.android.icart.core.event;

import com.alibaba.android.icart.core.data.model.CartOpenPopupWindowEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import tb.bby;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bei;
import tb.bek;
import tb.bem;
import tb.bmz;
import tb.jqh;
import tb.kge;

/* loaded from: classes2.dex */
public class al extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1899097564);
    }

    public static /* synthetic */ bcb a(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("2080a7f5", new Object[]{alVar}) : alVar.b;
    }

    public static /* synthetic */ bbz b(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("adbb589d", new Object[]{alVar}) : alVar.f25791a;
    }

    public static /* synthetic */ bcb c(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("3af60af7", new Object[]{alVar}) : alVar.b;
    }

    public static /* synthetic */ bcb d(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("c830bc78", new Object[]{alVar}) : alVar.b;
    }

    public static /* synthetic */ bbz e(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("556b6d20", new Object[]{alVar}) : alVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel;
        final CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel2;
        List<IDMComponent> a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || b.getFields() == null) {
            return;
        }
        IDMComponent e = this.b.e("elevator");
        if (e != null && e.isNormalComponent()) {
            bei.a(this.b, "elevator", false);
            this.f25791a.x().b(4);
        }
        DXRootView dXRootView = null;
        try {
            cartOpenPopupWindowEventModel = (CartOpenPopupWindowEventModel) JSON.parseObject(b.getFields().toJSONString(), CartOpenPopupWindowEventModel.class);
            try {
                this.b.o().a(cartOpenPopupWindowEventModel.isNeedRefreshForNoFilter());
            } catch (Exception e2) {
                e = e2;
                UnifyLog.b("OpenCartPopupWindowSubscriber", "parse pop window event error," + e.getMessage());
                cartOpenPopupWindowEventModel2 = cartOpenPopupWindowEventModel;
                a2 = bei.a(this.b, b);
                jSONObject = c().getJSONObject("options");
                if (jSONObject != null) {
                    dXRootView = bek.a(this.f25791a.x().u(), "submit");
                }
                DXRootView dXRootView2 = dXRootView;
                if (cartOpenPopupWindowEventModel2 != null) {
                    a2 = this.f25791a.o().b(a2);
                }
                String string = b.getFields().getString("nextRenderRoot");
                this.f25791a.r().b();
                this.f25791a.x().a(dXRootView2, string, a2, cartOpenPopupWindowEventModel2, new bby.a() { // from class: com.alibaba.android.icart.core.event.al.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.bby.a
                    public void a(com.alibaba.android.icart.core.data.f fVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5598b34f", new Object[]{this, fVar});
                        } else if (fVar == null || fVar.i()) {
                        } else {
                            CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel3 = cartOpenPopupWindowEventModel2;
                            if (cartOpenPopupWindowEventModel3 != null && cartOpenPopupWindowEventModel3.isFilterPopLayer()) {
                                al.a(al.this).s();
                            }
                            bei.a(al.b(al.this));
                            if (bem.c(al.c(al.this))) {
                                bei.b(al.d(al.this));
                            }
                            jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.event.al.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        bek.a(al.e(al.this));
                                    }
                                }
                            }, 300L);
                        }
                    }
                });
                bek.a(this.f25791a);
            }
        } catch (Exception e3) {
            e = e3;
            cartOpenPopupWindowEventModel = null;
        }
        cartOpenPopupWindowEventModel2 = cartOpenPopupWindowEventModel;
        a2 = bei.a(this.b, b);
        jSONObject = c().getJSONObject("options");
        if (jSONObject != null && jSONObject.getBooleanValue("cartIsAboveSubmit")) {
            dXRootView = bek.a(this.f25791a.x().u(), "submit");
        }
        DXRootView dXRootView22 = dXRootView;
        if (cartOpenPopupWindowEventModel2 != null && cartOpenPopupWindowEventModel2.isFilterPopLayer()) {
            a2 = this.f25791a.o().b(a2);
        }
        String string2 = b.getFields().getString("nextRenderRoot");
        this.f25791a.r().b();
        this.f25791a.x().a(dXRootView22, string2, a2, cartOpenPopupWindowEventModel2, new bby.a() { // from class: com.alibaba.android.icart.core.event.al.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bby.a
            public void a(com.alibaba.android.icart.core.data.f fVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5598b34f", new Object[]{this, fVar});
                } else if (fVar == null || fVar.i()) {
                } else {
                    CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel3 = cartOpenPopupWindowEventModel2;
                    if (cartOpenPopupWindowEventModel3 != null && cartOpenPopupWindowEventModel3.isFilterPopLayer()) {
                        al.a(al.this).s();
                    }
                    bei.a(al.b(al.this));
                    if (bem.c(al.c(al.this))) {
                        bei.b(al.d(al.this));
                    }
                    jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.event.al.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bek.a(al.e(al.this));
                            }
                        }
                    }, 300L);
                }
            }
        });
        bek.a(this.f25791a);
    }
}
