package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* loaded from: classes4.dex */
public class ane {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VIEW_TYPE = -1;

    /* renamed from: a  reason: collision with root package name */
    private final DXRootView f25453a;

    static {
        kge.a(1583053889);
    }

    public ane(DXRootView dXRootView) {
        this.f25453a = dXRootView;
    }

    public DXRootView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("a106546f", new Object[]{this}) : this.f25453a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        DXRootView dXRootView = this.f25453a;
        if (dXRootView != null && dXRootView.getDxTemplateItem() != null && !StringUtils.isEmpty(this.f25453a.getDxTemplateItem().f11925a)) {
            return this.f25453a.getDxTemplateItem().f11925a.hashCode();
        }
        return -1;
    }
}
