package tb;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class ecs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void b(DetailCoreActivity detailCoreActivity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10b6d54", new Object[]{detailCoreActivity, str, jSONObject});
        } else {
            c(detailCoreActivity, str, jSONObject);
        }
    }

    static {
        kge.a(1616357483);
        emu.a("com.taobao.android.detail.core.detail.utils.SkuUtils");
    }

    public static String a(SkuBottomBarStyleDTO skuBottomBarStyleDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dc3ecea", new Object[]{skuBottomBarStyleDTO});
        }
        if (skuBottomBarStyleDTO == null) {
            return "bottombar_style_buyaddcart";
        }
        switch (skuBottomBarStyleDTO) {
            case ADD_CART_ONLY:
                return "bottombar_style_addcartonly";
            case BUY_ONLY:
                return "bottombar_style_buyonly";
            case CONFIRM:
                return "bottombar_style_confirm";
            case CONFIRM_ADD_CART:
                return "bottombar_style_confirm_addcart";
            case CONFIRM_BUY:
            case DONATE:
                return "bottombar_style_confirm_buy";
            case SAVE:
                return "bottombar_style_confirm_save";
            default:
                return "bottombar_style_buyaddcart";
        }
    }

    public static String a(c cVar) {
        SkuCoreNode j;
        SkuCoreNode.SkuItem skuItem;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fc3ab5f", new Object[]{cVar}) : (cVar == null || cVar.f10055a == null || (j = eqb.j(cVar.f10055a)) == null || (skuItem = j.skuItem) == null) ? "" : skuItem.skuWeexUrl;
    }

    public static String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(SkuCoreNode.TAG)) != null && (jSONObject3 = jSONObject2.getJSONObject("skuItem")) != null) {
            return jSONObject3.getString("skuWeexUrl");
        }
        return null;
    }

    public static void a(final DetailCoreActivity detailCoreActivity, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875c2893", new Object[]{detailCoreActivity, str, jSONObject});
        } else if (detailCoreActivity == null || detailCoreActivity.isFinishing() || detailCoreActivity.isDestroyed() || detailCoreActivity.X) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c(detailCoreActivity, str, jSONObject);
            } else {
                detailCoreActivity.runOnUiThread(new Runnable() { // from class: tb.ecs.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ecs.b(DetailCoreActivity.this, str, jSONObject);
                        }
                    }
                });
            }
        }
    }

    private static void c(DetailCoreActivity detailCoreActivity, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babab215", new Object[]{detailCoreActivity, str, jSONObject});
        } else if (detailCoreActivity == null || TextUtils.isEmpty(str)) {
        } else {
            final String str2 = detailCoreActivity.h;
            final WeakReference weakReference = new WeakReference(detailCoreActivity);
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: tb.ecs.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    DetailCoreActivity detailCoreActivity2 = (DetailCoreActivity) weakReference.get();
                    if (detailCoreActivity2 != null && !detailCoreActivity2.isFinishing() && !detailCoreActivity2.isDestroyed() && !detailCoreActivity2.X) {
                        detailCoreActivity2.X = true;
                        com.taobao.android.sku.weex.c.a(detailCoreActivity2, str, str2, jSONObject);
                    }
                    return false;
                }
            });
        }
    }

    public static String b(SkuBottomBarStyleDTO skuBottomBarStyleDTO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("23ee75ab", new Object[]{skuBottomBarStyleDTO}) : skuBottomBarStyleDTO == null ? "openSKU" : skuBottomBarStyleDTO == SkuBottomBarStyleDTO.CONFIRM_ADD_CART ? tfu.ADD_CART : skuBottomBarStyleDTO == SkuBottomBarStyleDTO.CONFIRM_BUY ? "buyNow" : "openSKU";
    }
}
