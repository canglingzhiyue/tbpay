package tb;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fdc implements j<fct> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27821a;

    static {
        kge.a(-1936261515);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fct fctVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fctVar}) : a(fctVar);
    }

    public fdc(DetailCoreActivity detailCoreActivity) {
        this.f27821a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.bottom.AddCartClickedSubscriber");
    }

    public i a(fct fctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b796f52e", new Object[]{this, fctVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27821a;
        if (detailCoreActivity == null || detailCoreActivity.y() == null) {
            return a.FAILURE;
        }
        this.f27821a.f = System.currentTimeMillis();
        this.f27821a.g = tfu.ADD_CART;
        Log.e("SKU trace", "click time " + this.f27821a.f);
        SkuPageModel h = this.f27821a.y().h();
        if (!eip.j && !h.isH5Sku() && !h.showSku()) {
            DetailActivity detailActivity = null;
            DetailCoreActivity detailCoreActivity2 = this.f27821a;
            if (detailCoreActivity2 instanceof DetailActivity) {
                detailActivity = (DetailActivity) detailCoreActivity2;
            }
            if (detailActivity != null && detailActivity.v.k()) {
                detailActivity.v.c();
                detailActivity.v.a("bottombar_style_confirm_addcart", false, false, (String) null, (JSONObject) null, "add_cart");
            }
            return a.SUCCESS;
        }
        SkuBottomBarStyleDTO skuBottomBarStyleDTO = SkuBottomBarStyleDTO.CONFIRM_ADD_CART;
        d a2 = f.a(this.f27821a);
        OpenSkuEvent openSkuEvent = new OpenSkuEvent(skuBottomBarStyleDTO);
        Context applicationContext = this.f27821a.getApplicationContext();
        if (eqb.f(this.f27821a.y().i().f10055a).needOpenGradient) {
            openSkuEvent.b = ContextCompat.getDrawable(applicationContext, R.drawable.detail_gradient_color_orange);
            openSkuEvent.d = ContextCompat.getDrawable(applicationContext, R.drawable.detail_gradient_color_orange);
            openSkuEvent.c = ContextCompat.getDrawable(applicationContext, R.drawable.detail_gradient_color_yellow);
        }
        a2.a(openSkuEvent);
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
