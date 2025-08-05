package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.w;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.j;

/* loaded from: classes5.dex */
public class ctt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26524a = false;

    static {
        kge.a(1436075105);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : j.d();
    }

    private boolean a(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76609dbd", new Object[]{this, feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isOpenDetailAndNewBuy();
        }
        return false;
    }

    private boolean b(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87166a7e", new Object[]{this, feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isOpenDetailAndAddCartAndBuyNow();
        }
        return false;
    }

    public void a(eyx eyxVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf0e14", new Object[]{this, eyxVar});
        } else if (this.f26524a || eyxVar == null || eyxVar.a() == null || !a()) {
        } else {
            Feature feature = (Feature) eyxVar.a().a(Feature.class);
            if (a(feature)) {
                str = "BUYNOW";
            } else {
                str = b(feature) ? "ADDCART_AND_BUYNOW" : "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            eyxVar.c().a(w.a(str, (String) null), new RuntimeAbilityParam[0]);
            this.f26524a = true;
        }
    }
}
