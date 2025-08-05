package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b;
import tb.mto;

/* loaded from: classes7.dex */
public class lto implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30920a;
    private IMainFeedsViewService<?> b;

    static {
        kge.a(1313592352);
        kge.a(-1965245184);
    }

    public lto(ljs ljsVar) {
        this.f30920a = ljsVar;
        this.b = (IMainFeedsViewService) this.f30920a.a(IMainFeedsViewService.class);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b
    public int a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352a7d6", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return 0;
        }
        return iMainFeedsViewService.findBottomPosition(i, z);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return 0;
        }
        return iMainFeedsViewService.findTopPosition(i);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b
    public double b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253bde", new Object[]{this, str, new Integer(i)})).doubleValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        return iMainFeedsViewService != null ? iMainFeedsViewService.getViewExposureRatio(i) : mto.a.GEO_NOT_SUPPORT;
    }
}
