package com.taobao.android.detail.wrapper.ext.event.subscriber.sku;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.icart.event.h;
import com.taobao.android.sku.utils.r;
import com.taobao.android.trade.event.i;
import com.taobao.tao.newsku.NewSkuModel;
import tb.dya;
import tb.ecs;
import tb.emu;
import tb.eqb;
import tb.ixt;
import tb.jcv;
import tb.kge;
import tb.qqy;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f11299a;
    private DetailCoreActivity b;

    static {
        kge.a(1465145090);
    }

    public static /* synthetic */ DetailCoreActivity a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("1ef948cc", new Object[]{eVar}) : eVar.b;
    }

    public e(DetailCoreActivity detailCoreActivity, d dVar) {
        this.b = detailCoreActivity;
        this.f11299a = dVar;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy");
    }

    public i a(OpenSkuEvent openSkuEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("bfe4d370", new Object[]{this, openSkuEvent});
        }
        dya y = this.b.y();
        SkuPageModel h = y.h();
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = y.t;
        if (cVar == null) {
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        if (b(a(y), openSkuEvent)) {
            h = openSkuEvent.e;
        }
        SkuPageModel skuPageModel = h;
        if (skuPageModel == null) {
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        String a2 = a(skuPageModel);
        JSONObject jSONObject = new JSONObject();
        a(skuPageModel, jSONObject);
        boolean equals = OpenSkuEvent.BIZ_TYPE_SEND_GIFT.equals(openSkuEvent.f);
        String a3 = ecs.a(openSkuEvent.f9953a);
        if (a(openSkuEvent, skuPageModel)) {
            a(y, openSkuEvent, skuPageModel, cVar, a3, equals, a2, jSONObject);
        }
        com.taobao.android.detail.core.event.video.c.d(this.b, null);
        b(openSkuEvent);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private FeatureNode a(dya dyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureNode) ipChange.ipc$dispatch("3edc286e", new Object[]{this, dyaVar});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = dyaVar.t;
        if (cVar != null && cVar.f10055a != null) {
            return eqb.f(cVar.f10055a);
        }
        return null;
    }

    private boolean b(FeatureNode featureNode, OpenSkuEvent openSkuEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3743aa8", new Object[]{this, featureNode, openSkuEvent})).booleanValue() : (featureNode == null || !featureNode.bundleItem || openSkuEvent.e == null) ? false : true;
    }

    private String a(SkuPageModel skuPageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98d3fd18", new Object[]{this, skuPageModel});
        }
        if (skuPageModel.isChildrecBundleItem() && (skuPageModel.extras instanceof NewSkuModel)) {
            return ((NewSkuModel) skuPageModel.extras).getSkuId();
        }
        DetailCoreActivity detailCoreActivity = this.b;
        return (detailCoreActivity == null || detailCoreActivity.f9411a == null || StringUtils.isEmpty(this.b.f9411a.b)) ? "" : this.b.f9411a.b;
    }

    private void a(final SkuPageModel skuPageModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d85368", new Object[]{this, skuPageModel, jSONObject});
        } else if (!skuPageModel.isChildrecBundleItem()) {
        } else {
            jSONObject.put("id_biz_size_chart", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$1
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_relatedAuctions", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$2
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_area", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$3
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_quantity", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$4
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_installment", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$5
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_service", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$6
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_strategic", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$7
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put(h.KEY_BUY_METHOD_IN_EVENT, (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$8
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_buy_method_desc", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$9
                {
                    put("gone", (Object) true);
                }
            });
            jSONObject.put("id_biz_maochao_cpu", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenSkuSubscriberProxy$10
                {
                    put("gone", (Object) true);
                }
            });
            if (skuPageModel.mNewSkuCombineData != null) {
                jSONObject.put("bundleItem", (Object) skuPageModel.mNewSkuCombineData);
            }
            ((DetailActivity) this.b).ak();
            ((DetailActivity) this.b).v.a(new ixt() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.e.1
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
                        if (!"CONFIRM_DISMISS".equals(string)) {
                            if (!"IMG_PREVIEW_LONG_CLK".equals(string)) {
                                return;
                            }
                            com.taobao.android.detail.core.utils.i.d("[sku][share]OpenSkuSubscriberProxy", "IMG_PREVIEW_LONG_CLK CombineGood share");
                            ((DetailActivity) e.a(e.this)).c(jSONObject2);
                            return;
                        }
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("buyNow");
                        if (jSONObject3 == null || jSONObject3.isEmpty()) {
                            return;
                        }
                        String string2 = jSONObject3.getString("skuId");
                        if (StringUtils.isEmpty(string2) || !(skuPageModel.extras instanceof NewSkuModel)) {
                            return;
                        }
                        ((NewSkuModel) skuPageModel.extras).checkSkuId(string2);
                    }
                }
            });
        }
    }

    private boolean a(OpenSkuEvent openSkuEvent, SkuPageModel skuPageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91a9da43", new Object[]{this, openSkuEvent, skuPageModel})).booleanValue();
        }
        DetailCoreActivity detailCoreActivity = this.b;
        if (!(detailCoreActivity instanceof DetailActivity)) {
            return false;
        }
        DetailActivity detailActivity = (DetailActivity) detailCoreActivity;
        if (detailActivity.v == null || !detailActivity.v.a(skuPageModel.isH5Sku())) {
            return false;
        }
        return detailActivity.v.g();
    }

    private void a(dya dyaVar, OpenSkuEvent openSkuEvent, SkuPageModel skuPageModel, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, String str, boolean z, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52235d8", new Object[]{this, dyaVar, openSkuEvent, skuPageModel, cVar, str, new Boolean(z), str2, jSONObject});
            return;
        }
        DetailActivity detailActivity = (DetailActivity) this.b;
        detailActivity.v.a(new jcv() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jcv
            public void a(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    return;
                }
                r.a(e.a(e.this), qqy.SKU_MSG_JS_CRASHED, 1);
                ((DetailActivity) e.a(e.this)).ak();
            }
        });
        detailActivity.v.a(str, z, skuPageModel.isCharityItem(), str2, jSONObject, new f(this.b));
        detailActivity.v.a();
    }

    public void b(OpenSkuEvent openSkuEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4d5de0", new Object[]{this, openSkuEvent});
        } else if (this.b.f9411a == null) {
        } else {
            DetailCoreActivity detailCoreActivity = this.b;
            if (!(detailCoreActivity instanceof DetailActivity) || ((DetailActivity) detailCoreActivity).v == null) {
                return;
            }
            long j = this.b.f9411a.G;
            if (j <= 0) {
                return;
            }
            ((DetailActivity) this.b).v.a(SystemClock.uptimeMillis() - j, ecs.b(openSkuEvent.f9953a));
            this.b.f9411a.G = 0L;
        }
    }
}
