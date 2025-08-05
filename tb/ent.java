package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import java.util.List;

/* loaded from: classes4.dex */
public class ent extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ResourceNode.j> f27477a;

    static {
        kge.a(-755738921);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "店铺优惠";
    }

    @Override // tb.eoc, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public ent(JSONObject jSONObject) {
        this.f27477a = null;
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenShopPromotionEvent");
        if (jSONObject == null || !jSONObject.containsKey("open_sale_promotion")) {
            return;
        }
        this.f27477a = epw.a(jSONObject.getJSONArray("open_sale_promotion"), new epy<ResourceNode.j>() { // from class: tb.ent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$j, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ ResourceNode.j b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ResourceNode.j a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ResourceNode.j) ipChange.ipc$dispatch("b7eda732", new Object[]{this, obj}) : new ResourceNode.j((JSONObject) obj);
            }
        });
    }

    public ent(b bVar) {
        this.f27477a = null;
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenShopPromotionEvent");
        if (bVar == null) {
            return;
        }
        ResourceNode l = eqb.l(bVar);
        if (l.shopPromotions != null && !l.shopPromotions.isEmpty()) {
            this.f27477a = l.shopPromotions;
        } else {
            this.f27477a = eqb.m(bVar).shopPromotions;
        }
    }
}
