package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;

/* loaded from: classes4.dex */
public class eog extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SkuPageModel.SkuChoiceVO f27498a;
    public String b = "";

    static {
        kge.a(-1179377197);
    }

    public eog(SkuPageModel.SkuChoiceVO skuChoiceVO) {
        this.f27498a = skuChoiceVO;
        emu.a("com.taobao.android.detail.datasdk.event.sku.SkuChoiceChangedEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27498a;
    }
}
