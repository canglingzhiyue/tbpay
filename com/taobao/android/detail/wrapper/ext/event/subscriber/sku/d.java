package com.taobao.android.detail.wrapper.ext.event.subscriber.sku;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.icart.event.h;
import com.taobao.android.sku.utils.r;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.tao.newsku.NewSkuModel;
import tb.dya;
import tb.ecs;
import tb.eei;
import tb.eip;
import tb.emu;
import tb.epo;
import tb.ixt;
import tb.jcv;
import tb.kge;
import tb.qqy;

/* loaded from: classes5.dex */
public class d extends eei<OpenSkuEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_NORMAL = "normal";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11296a;
    private e b;
    private OpenSkuEvent c;

    static {
        kge.a(798122700);
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber";
    }

    public static /* synthetic */ DetailCoreActivity a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("e618e82d", new Object[]{dVar}) : dVar.f11296a;
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((OpenSkuEvent) event);
    }

    public d(DetailCoreActivity detailCoreActivity) {
        this.f11296a = detailCoreActivity;
        this.b = new e(detailCoreActivity, this);
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber");
    }

    public i a(OpenSkuEvent openSkuEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("bfe4d370", new Object[]{this, openSkuEvent});
        }
        if (!epo.g().b()) {
            epo.g().a(true);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        dya y = this.f11296a.y();
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = y.t;
        String a2 = ecs.a(cVar);
        if (!StringUtils.isEmpty(a2) && openSkuEvent != null && openSkuEvent.f9953a == SkuBottomBarStyleDTO.CONFIRM_BUY) {
            DetailCoreActivity detailCoreActivity = this.f11296a;
            com.taobao.android.sku.weex.c.a(detailCoreActivity, "onSKUEntryClick", a2, detailCoreActivity.h);
        }
        this.c = openSkuEvent;
        if (eip.j) {
            return this.b.a(openSkuEvent);
        }
        final SkuPageModel h = y.h();
        if (h == null || cVar == null) {
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        DetailCoreActivity detailCoreActivity2 = this.f11296a;
        String str = (detailCoreActivity2 == null || detailCoreActivity2.f9411a == null || StringUtils.isEmpty(this.f11296a.f9411a.b)) ? "" : this.f11296a.f9411a.b;
        JSONObject jSONObject = new JSONObject();
        if (h.isChildrecBundleItem()) {
            if (h.extras instanceof NewSkuModel) {
                str = ((NewSkuModel) h.extras).getSkuId();
            }
            jSONObject.put("id_biz_size_chart", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$1
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_relatedAuctions", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$2
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_area", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$3
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_quantity", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$4
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_installment", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$5
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_service", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$6
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_strategic", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$7
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put(h.KEY_BUY_METHOD_IN_EVENT, (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$8
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_buy_method_desc", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$9
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_maochao_cpu", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriber$10
                {
                    put("gone", (Object) true);
                }
            });
            if (h.mNewSkuCombineData != null) {
                jSONObject.put("bundleItem", (Object) h.mNewSkuCombineData);
            }
            ((DetailActivity) this.f11296a).ak();
            ((DetailActivity) this.f11296a).v.a(new ixt() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ixt
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    } else if (jSONObject2 == null) {
                    } else {
                        String string = jSONObject2.getString("actionFrom");
                        if (StringUtils.isEmpty(string)) {
                            string = "NULL";
                        }
                        char c = 65535;
                        int hashCode = string.hashCode();
                        if (hashCode != -1270295406) {
                            if (hashCode == 1722726347 && string.equals("CONFIRM_DISMISS")) {
                                c = 0;
                            }
                        } else if (string.equals("IMG_PREVIEW_LONG_CLK")) {
                            c = 1;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                return;
                            }
                            com.taobao.android.detail.core.utils.i.d("[sku][share]OpenSkuSubscriber", "IMG_PREVIEW_LONG_CLK CombineGood share");
                            ((DetailActivity) d.a(d.this)).c(jSONObject2);
                            return;
                        }
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("buyNow");
                        if (jSONObject3 == null || jSONObject3.isEmpty()) {
                            return;
                        }
                        String string2 = jSONObject3.getString("skuId");
                        if (StringUtils.isEmpty(string2) || !(h.extras instanceof NewSkuModel)) {
                            return;
                        }
                        ((NewSkuModel) h.extras).checkSkuId(string2);
                    }
                }
            });
        }
        String str2 = str;
        boolean equals = OpenSkuEvent.BIZ_TYPE_SEND_GIFT.equals(openSkuEvent.f);
        String a3 = ecs.a(openSkuEvent.f9953a);
        DetailCoreActivity detailCoreActivity3 = this.f11296a;
        if ((detailCoreActivity3 instanceof DetailActivity) && ((DetailActivity) detailCoreActivity3).v != null && ((DetailActivity) this.f11296a).v.a(h.isH5Sku()) && ((DetailActivity) this.f11296a).v.a(new jcv() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jcv
            public void a(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    return;
                }
                r.a(d.a(d.this), qqy.SKU_MSG_JS_CRASHED, 1);
                ((DetailActivity) d.a(d.this)).ak();
            }
        }) && ((DetailActivity) this.f11296a).v.a(a3, equals, h.isCharityItem(), str2, jSONObject)) {
            ((DetailActivity) this.f11296a).v.a();
        }
        com.taobao.android.detail.core.event.video.c.d(this.f11296a, null);
        this.b.b(openSkuEvent);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
