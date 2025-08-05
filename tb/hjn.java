package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes6.dex */
public class hjn implements Comparator<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<ItemIdentifier> f28702a;

    static {
        kge.a(-1736972121);
        kge.a(-2099169482);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : 8 == i || 1 == i || 2 == i;
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(e eVar, e eVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, eVar, eVar2})).intValue() : a(eVar, eVar2);
    }

    public hjn(List<ItemIdentifier> list) {
        this.f28702a = list;
    }

    public int a(e eVar, e eVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89ce1ee5", new Object[]{this, eVar, eVar2})).intValue();
        }
        if (eVar == null && eVar2 == null) {
            return 0;
        }
        if (eVar == null || eVar2 == null) {
            return eVar == null ? -1 : 1;
        } else if (a(eVar.f13845a) || a(eVar2.f13845a)) {
            return eVar2.b - eVar.b;
        } else {
            int a2 = hjm.a(this.f28702a, eVar.b, eVar.f);
            int a3 = hjm.a(this.f28702a, eVar2.b, eVar2.f);
            return (!a.h() || (a2 >= 0 && a3 >= 0)) ? a2 - a3 : a3 - a2;
        }
    }
}
