package com.alibaba.triver.triver_shop.newShop;

import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.nav.Nav;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class NativeShopActivity$onFetchDataOk$1 extends Lambda implements rul<View, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$onFetchDataOk$1(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(View view) {
        invoke2(view);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View bottomBarView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, bottomBarView});
            return;
        }
        q.d(bottomBarView, "bottomBarView");
        NativeShopActivity.a(this.this$0, bottomBarView);
        ShopView g = NativeShopActivity.g(this.this$0);
        if (g == null) {
            q.b("shopView");
            throw null;
        }
        View j = NativeShopActivity.j(this.this$0);
        if (j == null) {
            q.b("bottomView");
            throw null;
        }
        g.setBottomView(j);
        NativeShopActivity nativeShopActivity = this.this$0;
        d b = NativeShopActivity.b(nativeShopActivity);
        if (b == null) {
            q.b("shopDataParser");
            throw null;
        }
        NativeShopActivity.b(nativeShopActivity, b.ae());
        DinamicXEngine i = NativeShopActivity.i(this.this$0);
        if (i == null) {
            q.b("dxEngine");
            throw null;
        }
        View j2 = NativeShopActivity.j(this.this$0);
        if (j2 == null) {
            q.b("bottomView");
            throw null;
        }
        d b2 = NativeShopActivity.b(this.this$0);
        if (b2 != null) {
            h.a(i, j2, "offService", b2.ay());
            NativeShopActivity nativeShopActivity2 = this.this$0;
            if (NativeShopActivity.$ipChange) {
                return;
            }
            com.alibaba.triver.triver_shop.d dVar = com.alibaba.triver.triver_shop.d.INSTANCE;
            NativeShopActivity nativeShopActivity3 = this.this$0;
            NativeShopActivity nativeShopActivity4 = nativeShopActivity3;
            d b3 = NativeShopActivity.b(nativeShopActivity3);
            if (b3 == null) {
                q.b("shopDataParser");
                throw null;
            }
            String T = b3.T();
            d b4 = NativeShopActivity.b(this.this$0);
            if (b4 != null) {
                dVar.b(nativeShopActivity4, T, b4.U(), new AnonymousClass1(this.this$0));
                return;
            } else {
                q.b("shopDataParser");
                throw null;
            }
        }
        q.b("shopDataParser");
        throw null;
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$onFetchDataOk$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements rul<JSONObject, t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity) {
            super(1);
            this.this$0 = nativeShopActivity;
        }

        @Override // tb.rul
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return t.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
            } else {
                String string = jSONObject.getString("subjectType");
                String queryParameter = Uri.parse(jSONObject.getString("url")).getQueryParameter("subscribe_bizdata");
                d b = NativeShopActivity.b(this.this$0);
                if (b == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                b.a(queryParameter);
                d b2 = NativeShopActivity.b(this.this$0);
                if (b2 == null) {
                    q.b("shopDataParser");
                    throw null;
                }
                b2.b(string);
                final NativeShopActivity nativeShopActivity = this.this$0;
                nativeShopActivity.runOnUiThread(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.onFetchDataOk.1.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d b3 = NativeShopActivity.b(NativeShopActivity.this);
                        if (b3 == null) {
                            q.b("shopDataParser");
                            throw null;
                        }
                        if (b3.az()) {
                            DinamicXEngine i = NativeShopActivity.i(NativeShopActivity.this);
                            if (i == null) {
                                q.b("dxEngine");
                                throw null;
                            }
                            View j = NativeShopActivity.j(NativeShopActivity.this);
                            if (j == null) {
                                q.b("bottomView");
                                throw null;
                            } else {
                                h.a(i, j, g.KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT, (Object) true);
                                NativeShopActivity.a(NativeShopActivity.this, "Page_Shop_Dynamic_RedDot_Expose");
                            }
                        }
                        d b4 = NativeShopActivity.b(NativeShopActivity.this);
                        if (b4 == null) {
                            q.b("shopDataParser");
                            throw null;
                        } else if (!b4.aA()) {
                        } else {
                            Nav from = Nav.from(NativeShopActivity.this);
                            JSONObject jSONObject2 = jSONObject;
                            d b5 = NativeShopActivity.b(NativeShopActivity.this);
                            if (b5 != null) {
                                from.toUri(h.a(jSONObject2, b5));
                            } else {
                                q.b("shopDataParser");
                                throw null;
                            }
                        }
                    }
                });
            }
        }
    }
}
