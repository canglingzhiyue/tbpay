package com.alibaba.android.icart.core.event;

import android.app.Activity;
import android.os.Build;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bca;
import tb.bed;
import tb.bei;
import tb.bga;
import tb.bmz;
import tb.hjs;
import tb.kge;

/* loaded from: classes2.dex */
public class q extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;
    private static final String k;
    private static final String l;
    private static final String m;

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b68d6e", new Object[]{qVar, str});
        } else {
            qVar.b(str);
        }
    }

    public static /* synthetic */ void a(q qVar, String str, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e433e46a", new Object[]{qVar, str, jSONObject, jSONArray});
        } else {
            qVar.a(str, jSONObject, jSONArray);
        }
    }

    public static /* synthetic */ void b(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4611af", new Object[]{qVar, str});
        } else {
            qVar.c(str);
        }
    }

    static {
        kge.a(1232313541);
        c = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21679);
        k = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21677);
        l = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21670);
        m = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21646);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        JSONArray f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (this.h == null || (f = f()) == null || f.size() == 0) {
        } else {
            a(f);
        }
    }

    private JSONArray f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("215b3ab1", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        String tag = this.h.getTag();
        if ("item".equals(tag)) {
            JSONObject c2 = c();
            if (c2 == null && c2.size() == 0) {
                bga.a.b("iCart", "CartShare", "SHARE_EVENT_FIELD_EMPTY", "eventFields为空");
                bed.a("eventFields为空");
                return null;
            }
            String string = c2.getString("itemId");
            String string2 = c2.getString("skuId");
            String string3 = c2.getString("quantity");
            if (StringUtils.isEmpty(string)) {
                bga.a.b("iCart", "CartShare", "SHARE_EVENT_FIELD_ITEM_ID_EMPTY", "eventFields.itemId为空");
                bed.a("eventFields.itemId为空");
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) string);
            if (StringUtils.isEmpty(string2)) {
                string2 = "";
            }
            jSONObject.put("skuId", (Object) string2);
            if (StringUtils.isEmpty(string3)) {
                string3 = "";
            }
            jSONObject.put("count", (Object) string3);
            a(jSONObject, this.h.getFields());
            jSONArray.add(jSONObject);
        } else if ("submit".equals(tag)) {
            List<IDMComponent> c3 = bei.c(this.f25791a.H());
            if (c3 == null || c3.size() == 0) {
                String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21676);
                com.alibaba.android.icart.core.widget.d.a(this.e, a2);
                bed.a(a2);
                return null;
            }
            for (IDMComponent iDMComponent : c3) {
                jSONArray.add(a(iDMComponent));
            }
        } else if ("bundleHeader".equals(tag)) {
            List<IDMComponent> i = bei.i(bei.k(this.h));
            if (i == null) {
                String a3 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21649);
                com.alibaba.android.icart.core.widget.d.a(this.e, a3);
                bed.a(a3);
                return null;
            }
            for (IDMComponent iDMComponent2 : i) {
                if (iDMComponent2 != null && StringUtils.equals(iDMComponent2.getTag(), "item")) {
                    jSONArray.add(a(iDMComponent2));
                }
            }
        }
        return jSONArray;
    }

    private JSONObject a(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("da29630c", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return null;
        }
        String string = fields.getString("itemId");
        String string2 = fields.getString("quantity");
        JSONObject jSONObject = fields.getJSONObject("sku");
        String string3 = jSONObject != null ? jSONObject.getString("skuId") : "";
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) string);
        if (StringUtils.isEmpty(string3)) {
            string3 = "";
        }
        jSONObject2.put("skuId", (Object) string3);
        if (StringUtils.isEmpty(string2)) {
            string2 = "";
        }
        jSONObject2.put("count", (Object) string2);
        a(jSONObject2, fields);
        return jSONObject2;
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharecart.share.publish");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "nativeCart");
        jSONObject.put("itemPOStr", (Object) jSONArray.toJSONString());
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1335useWua();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.CartItemsShareSubscriber$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    String string = mtopResponse.getDataJsonObject().getString("shareIdStr");
                    if (StringUtils.isEmpty(string)) {
                        q.a(q.this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21666));
                        bga.a.b("iCart", "CartShare", "SHARE_ID_EMPTY", "获取ShareId为空");
                        return;
                    }
                    q.b(q.this, string);
                } catch (Throwable th) {
                    q.a(q.this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21666));
                    bga.a.a("iCart", "requestShareId", th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                q.a(q.this, mtopResponse.getRetMsg());
                bga.a.b("iCart", "CartShare", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }
        });
        build.startRequest();
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject("shareExtParam")) == null || jSONObject3.isEmpty()) {
        } else {
            jSONObject.put("shareExtParam", (Object) jSONObject3);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.alibaba.android.icart.core.widget.d.a(this.e, str);
        bed.a(str);
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharecart.share.consume");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shareId", (Object) str);
        jSONObject.put("type", (Object) "nativeCart");
        jSONObject.put(com.ap.zlz.toyger.zdoc.b.INFO_PAGE_NUMBER, (Object) 1);
        jSONObject.put("hasMore", (Object) true);
        jSONObject.put("pageSize", (Object) 10);
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1335useWua();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.CartItemsShareSubscriber$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    JSONObject jSONObject2 = JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                    if (jSONObject2.getBooleanValue("expired")) {
                        q.a(q.this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21663));
                    } else {
                        q.a(q.this, str, jSONObject2.getJSONObject("cartInfo"), jSONObject2.getJSONArray(hjs.UNDER_TAKE_GOODS_LIST));
                    }
                } catch (Throwable th) {
                    q.a(q.this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21666));
                    bga.a.a("iCart", "requestShareConsume", th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                q.a(q.this, mtopResponse.getRetMsg());
                bga.a.b("iCart", "CartShare", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }
        });
        build.startRequest();
    }

    private void a(String str, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1901e26", new Object[]{this, str, jSONObject, jSONArray});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            b(com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21666));
            bga.a.b("iCart", "CartShare", "SHARE_CART_INFO_EMPTY", "cartInfo为空");
        } else if (jSONArray == null || jSONArray.size() == 0) {
            b(com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21653));
            bga.a.b("iCart", "CartShare", "SHARE_ITEM_LIST_EMPTY", "itemList为空");
        } else {
            ShareContent shareContent = new ShareContent();
            shareContent.businessId = Build.VERSION.SDK_INT > 21 ? "nativesharecart2" : "nativesharecart2_android4";
            shareContent.title = c;
            shareContent.description = k;
            shareContent.imageUrl = "//gw.alicdn.com/imgextra/i3/O1CN01oF02SK1FwOxKZITOy_!!6000000000551-2-tps-783-783.png";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("weexURL", (Object) (g() ? "https://market.m.taobao.com/app/tmall-wireless/share-embedded/sharenativecartembedded?wh_weex=true" : "https://market.wapa.taobao.com/app/tmall-wireless/share-embedded/sharenativecartembedded?wh_weex=true"));
            jSONObject2.put("useBroadcast", (Object) true);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(hjs.UNDER_TAKE_GOODS_LIST, (Object) jSONArray);
            jSONObject.put("itemInfo", (Object) jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("footerText", (Object) l);
            jSONObject4.put("qrText", (Object) m);
            jSONObject4.put("showMask", (Object) false);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("data", (Object) jSONObject);
            jSONObject5.put("config", (Object) jSONObject4);
            jSONObject2.put("shareInfo", (Object) jSONObject5);
            shareContent.templateParams = jSONObject2.getInnerMap();
            shareContent.url = String.format(g() ? "https://web.m.taobao.com/app/mtb/cart-sharing-front/cartshareback?pha=true&disableNav=YES&source=cartShare&shareId=%s" : "https://web.wapa.taobao.com/app/mtb/cart-sharing-front/cartshareback?pha=true&disableNav=YES&source=cartShare&shareId=%s", str);
            ShareBusiness.getInstance();
            ShareBusiness.share((Activity) this.e, shareContent);
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a();
    }
}
