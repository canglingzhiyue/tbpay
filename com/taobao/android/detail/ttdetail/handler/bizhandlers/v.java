package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.List;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class v implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openShopPromotion";

    /* renamed from: a  reason: collision with root package name */
    public List<Resource.g> f10725a = null;
    private FragmentActivity b;
    private eyx c;

    static {
        kge.a(1263054382);
        kge.a(1967244270);
    }

    public v(Context context, eyx eyxVar) {
        if (context instanceof FragmentActivity) {
            this.b = (FragmentActivity) context;
        }
        this.c = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        if (b.containsKey("open_sale_promotion")) {
            this.f10725a = com.taobao.android.detail.ttdetail.utils.z.a(b.getJSONArray("open_sale_promotion"), new z.a<Resource.g>() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.v.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.ttdetail.data.meta.Resource$g, java.lang.Object] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ Resource.g convert(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public Resource.g a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Resource.g) ipChange2.ipc$dispatch("200439ac", new Object[]{this, obj}) : new Resource.g((JSONObject) obj);
                }
            });
        }
        eyx eyxVar = this.c;
        if (eyxVar == null) {
            return false;
        }
        ShopPromotionFragment.startFragment(this.b, "店铺优惠", this.f10725a, eyxVar);
        return true;
    }
}
