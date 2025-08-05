package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.h;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchPopView;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.v;
import com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import java.util.HashMap;
import java.util.Map;
import tb.hhs;
import tb.hhw;
import tb.hin;
import tb.his;
import tb.hit;
import tb.iou;
import tb.irn;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class d extends iou {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup b;
    private ViewGroup c;
    private DXRootView d;
    private Handler e;
    private GoodListSearchPopView f;
    private View g;

    static {
        kge.a(1885780817);
    }

    public static /* synthetic */ ViewGroup a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("364d869d", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ Handler b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a798b7cf", new Object[]{dVar}) : dVar.e;
    }

    public d(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(cVar);
        this.b = viewGroup;
        this.c = viewGroup2;
        this.e = new Handler();
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.g = view;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (d() == null) {
        } else {
            this.f = new GoodListSearchPopView(d(), this.b);
            this.f.show();
            com.taobao.android.live.plugin.atype.flexalocal.good.view.search.b.a(d().g(), d().m());
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (d() == null || jSONObject == null || !jSONObject.containsKey("jumpUrl")) {
        } else {
            a.a().k().a(d().f(), jSONObject.getString("jumpUrl"));
            if (a.a().j() == null) {
                return;
            }
            a.a().j().a("order_entry", null);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (d() == null) {
        } else {
            String string = jSONObject.getString("jumpUrl");
            TaoLiveWebBottomFragment.a aVar = new TaoLiveWebBottomFragment.a();
            aVar.a(new irn((Activity) d().f(), string));
            int f = hin.f(d().f());
            int b = hin.b();
            float f2 = (f <= 0 || b <= 0) ? 0.725f : (f * 0.725f) / b;
            int[] iArr = new int[2];
            if (this.g != null && v.b.a("goodlist", "enableLiveCartH", true)) {
                this.g.getLocationInWindow(iArr);
                int height = (f - iArr[1]) - this.g.getHeight();
                if (height > 0 && height < f) {
                    f2 = ((f * 0.725f) + height) / b;
                }
            }
            his.b("TopBarEventHandler", "onCartLiveHandler | height=" + f2 + "  location[0]=" + iArr[0] + " location[1]=" + iArr[1]);
            aVar.c(f2);
            aVar.a(false);
            aVar.a(d().f());
            aVar.a().show(((FragmentActivity) d().f()).getSupportFragmentManager(), "goods_weex_bottom");
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (d() == null || jSONObject == null || !jSONObject.containsKey("jumpUrl")) {
        } else {
            Boolean bool = pmd.a().c().a().get("isTBLiveAPP");
            if (bool != null && bool.booleanValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-url", "a2141.8001249");
                pmd.a().e().b((Map<String, String>) hashMap);
            }
            a.a().k().a(d().f(), jSONObject.getString("jumpUrl"));
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("action_type", "购物车");
            hashMap2.put("feed_id", d().g());
            hashMap2.put("account_id", d().m());
            hashMap2.put("user_id", pmd.a().q().a());
            hashMap2.put("source", "pageone");
            if (a.a().j() == null) {
                return;
            }
            a.a().j().a("gouwuche_button_task_click", hashMap2);
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1590a630", new Object[]{this, dXRuntimeContext, cVar, jSONObject});
            return;
        }
        if (this.d == null) {
            this.d = hhs.a().b(d().f(), com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar) ? "taolive_gl_header_entry_pop" : "taolive_goods_btn_pop");
        }
        if (this.d == null) {
            his.b("TopBarEventHandler", "onMoreClick | mEntryPopView is empty.");
            return;
        }
        hhs.a().a(this.d, jSONObject, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d.getLayoutParams());
        layoutParams.gravity = 5;
        layoutParams.rightMargin = hin.a(dXRuntimeContext.D(), d().f(), 7.0f);
        layoutParams.topMargin = hin.a(dXRuntimeContext.D(), d().f(), 50.0f);
        int[] iArr = new int[2];
        dXRuntimeContext.s().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.c.getLocationOnScreen(iArr2);
        layoutParams.topMargin = (iArr[1] - iArr2[1]) + dXRuntimeContext.s().getHeight();
        ((FrameLayout) this.c).addView(this.d, layoutParams);
        h.c(this.d, null);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    d.this.b();
                }
            }
        });
        hit.a(jSONObject, true);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            h.d(this.d, new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else {
                        d.b(d.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (d.a(d.this) == null) {
                                } else {
                                    d.a(d.this).setOnClickListener(null);
                                    d.a(d.this).setClickable(false);
                                    d.a(d.this).removeAllViews();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        GoodListSearchPopView goodListSearchPopView = this.f;
        if (goodListSearchPopView == null) {
            return;
        }
        goodListSearchPopView.destroy();
    }

    public static int a(JSONObject jSONObject, int i, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a4d9ac", new Object[]{jSONObject, new Integer(i), new Boolean(z)})).intValue();
        }
        if (jSONObject != null && jSONObject.containsKey("topRightEntranceList")) {
            JSONArray jSONArray = jSONObject.getJSONArray("topRightEntranceList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                his.b("TopBarEventHandler", "replaceLiveCartCount | list empty.");
            } else {
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (TextUtils.equals(hhw.ENTRY_TYPE_LIVE_CART, jSONObject2.getString("type"))) {
                        String string = jSONObject2.getString("count");
                        int a2 = l.a(string, 0);
                        if (a2 <= 0 || a2 <= i || !z) {
                            z2 = false;
                        }
                        if (z2) {
                            jSONObject2.put("count", (Object) Integer.toString(i));
                            jSONObject2.put("realCount", (Object) string);
                        }
                        if (!z2) {
                            return -1;
                        }
                        return a2;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    public static int a(LiveItemCategoriesResponseData liveItemCategoriesResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db9dffb", new Object[]{liveItemCategoriesResponseData})).intValue();
        }
        if (liveItemCategoriesResponseData != null && liveItemCategoriesResponseData.topRightEntranceList != null && !liveItemCategoriesResponseData.topRightEntranceList.isEmpty()) {
            for (int i = 0; i < liveItemCategoriesResponseData.topRightEntranceList.size(); i++) {
                JSONObject jSONObject = liveItemCategoriesResponseData.topRightEntranceList.get(i);
                if (jSONObject != null && TextUtils.equals(hhw.ENTRY_TYPE_LIVE_CART, jSONObject.getString("type"))) {
                    return l.a(jSONObject.getString("count"), 0);
                }
            }
        }
        return -1;
    }
}
