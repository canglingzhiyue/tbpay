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
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fdd implements j<fcu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27822a;
    private OpenSkuEvent b;

    static {
        kge.a(-561578344);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fcu fcuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcuVar}) : a(fcuVar);
    }

    public fdd(DetailCoreActivity detailCoreActivity) {
        this.f27822a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.bottom.BuyNowClickedSubscriber");
    }

    private OpenSkuEvent a(SkuBottomBarStyleDTO skuBottomBarStyleDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenSkuEvent) ipChange.ipc$dispatch("209b0897", new Object[]{this, skuBottomBarStyleDTO});
        }
        if (this.b == null) {
            this.b = new OpenSkuEvent(null);
        }
        this.b.f9953a = skuBottomBarStyleDTO;
        Context applicationContext = this.f27822a.getApplicationContext();
        if (eqb.f(this.f27822a.y().i().f10055a).needOpenGradient) {
            this.b.b = ContextCompat.getDrawable(applicationContext, R.drawable.detail_gradient_color_orange);
            this.b.d = ContextCompat.getDrawable(applicationContext, R.drawable.detail_gradient_color_orange);
            this.b.c = ContextCompat.getDrawable(applicationContext, R.drawable.detail_gradient_color_yellow);
        }
        a();
        OpenSkuEvent openSkuEvent = this.b;
        openSkuEvent.i = true;
        return openSkuEvent;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (OpenSkuEvent.BIZ_TYPE_MULTI_METHOD_BUY.equals(this.b.f) && !b()) {
            this.b.f = "";
        }
        if (!b()) {
            return;
        }
        this.b.f = OpenSkuEvent.BIZ_TYPE_MULTI_METHOD_BUY;
    }

    public i a(fcu fcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("cb3ec8af", new Object[]{this, fcuVar});
        }
        if (!epo.g().b()) {
            epo.g().a(true);
            return a.SUCCESS;
        }
        this.f27822a.f = System.currentTimeMillis();
        this.f27822a.g = "buyNow";
        Log.e("SKU trace", "click time " + this.f27822a.f);
        dya y = this.f27822a.y();
        SkuPageModel h = y.h();
        if (h == null) {
            return a.FAILURE;
        }
        if (fcuVar != null) {
            y.v = fcuVar.a();
            y.w = fcuVar.b();
        }
        if (eip.j) {
            f.a(this.f27822a, a(SkuBottomBarStyleDTO.CONFIRM_BUY));
            return a.SUCCESS;
        }
        if (!h.isH5Sku() && !h.showSku() && !h.buyNowShowSku()) {
            DetailActivity detailActivity = null;
            DetailCoreActivity detailCoreActivity = this.f27822a;
            if (detailCoreActivity instanceof DetailActivity) {
                detailActivity = (DetailActivity) detailCoreActivity;
            }
            if (detailActivity != null && detailActivity.v.k()) {
                detailActivity.v.c();
                detailActivity.v.a("bottombar_style_confirm_buy", false, false, (String) null, (JSONObject) null, com.taobao.android.detail.ttdetail.handler.bizhandlers.f.EVENT_TYPE_ALTERNATIVE);
            }
        } else {
            f.a(this.f27822a, a(SkuBottomBarStyleDTO.CONFIRM_BUY));
        }
        return a.SUCCESS;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return ((FeatureNode) this.f27822a.y().t.f10055a.b("feature", FeatureNode.class)).creditBuy && ecu.x;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
