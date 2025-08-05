package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;

/* loaded from: classes7.dex */
public class tja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f34141a;
    public String b;

    static {
        kge.a(-1034891267);
    }

    public tja(BaseMmAdModel baseMmAdModel) {
        this.f34141a = baseMmAdModel.cardSkuId;
        this.b = baseMmAdModel.cardItemId;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AddCartModel{cardSkuId='" + this.f34141a + "', cardItemId='" + this.b + "'}";
    }
}
