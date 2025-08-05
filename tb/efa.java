package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.fragment.BundleProductInfoFragment;
import com.taobao.android.detail.core.detail.kit.fragment.ProductInfoFragment;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class efa implements j<com.taobao.android.detail.core.event.basic.j> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27258a;

    static {
        kge.a(-195255961);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(com.taobao.android.detail.core.event.basic.j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, jVar}) : a(jVar);
    }

    public i a(com.taobao.android.detail.core.event.basic.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("924ea0a7", new Object[]{this, jVar});
        }
        if (jVar != null && jVar.a() != null && !jVar.a().isEmpty() && jVar.b) {
            try {
                String a2 = b.a(R.string.x_detail_app_title_product_info);
                if (!TextUtils.isEmpty(jVar.c)) {
                    a2 = jVar.c;
                }
                ProductInfoFragment.startFragment(this.f27258a, a2, jVar.a());
            } catch (Exception unused) {
            }
            return i.SUCCESS;
        } else if (jVar != null && jVar.a() != null && !jVar.a().isEmpty()) {
            try {
                ProductInfoFragment.startFragment(this.f27258a, b.a(R.string.x_detail_app_title_product_info), jVar.a());
            } catch (Exception unused2) {
            }
            return i.SUCCESS;
        } else if (jVar != null && jVar.b() != null && !jVar.b().isEmpty()) {
            try {
                BundleProductInfoFragment.startFragment(this.f27258a, b.a(R.string.x_detail_app_title_product_info), jVar.b());
            } catch (Exception unused3) {
            }
            return i.SUCCESS;
        } else {
            return i.FAILURE;
        }
    }

    public efa(DetailCoreActivity detailCoreActivity) {
        this.f27258a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.entrance.OpenProductParamsSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
