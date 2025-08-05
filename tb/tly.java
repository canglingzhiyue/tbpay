package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TMSOrangeProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/taobao/domain/URLListSwitcher;", "Lcom/taobao/themis/taobao/domain/ITMSSwitchChecker;", "()V", "defaultList", "", "orangeKey", "orangeNamespace", "shouldSwitchToTMS", "", "navigationInfo", "Lcom/taobao/themis/taobao/domain/NavigationInfo;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tly implements tlu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34204a = "pages.tmall.com/wow/bz/jingmi/1164,pages-fast.m.taobao.com/wow/z/vip/hbqd5/hbqd5.0,pages-fast.m.taobao.com/wow/a/act/tao/tmc/38057/21182/wupr?forceThemis=true,pages-fast.m.taobao.com/wow/a/act/tmall/tmc/38058/21181/wupr?forceThemis=true,pages-fast.m.taobao.com/wow/z/blackvip,pages-fast.m.taobao.com/wow/z/app/tb-vip/month-card-v2";
    private final String b = "h5_to_tms_list";
    private final String c = "pha_tab_config";

    static {
        kge.a(9187310);
        kge.a(848488624);
    }

    @Override // tb.tlu
    public boolean a(tlv navigationInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afa51e", new Object[]{this, navigationInfo})).booleanValue();
        }
        q.d(navigationInfo, "navigationInfo");
        List<String> b = n.b((CharSequence) TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal(this.c, this.b, this.f34204a), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(p.a((Iterable) b, 10));
        for (String str : b) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            arrayList.add(n.b((CharSequence) str).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList<String> arrayList3 = arrayList2;
        if ((arrayList3 instanceof Collection) && arrayList3.isEmpty()) {
            return false;
        }
        for (String str2 : arrayList3) {
            if (n.b((CharSequence) navigationInfo.a(), (CharSequence) str2, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
