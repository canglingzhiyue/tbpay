package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public class oje implements osn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f32115a;

    static {
        kge.a(593892471);
        kge.a(963302453);
    }

    public oje(ljs ljsVar) {
        this.f32115a = ljsVar;
    }

    @Override // tb.osn
    public int a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352a7d6", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f32115a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("DataServiceWindVaneProvider", "findBottomPosition mainFeedsViewService is null");
            return -1;
        }
        return iMainFeedsViewService.findBottomPosition(i, z);
    }

    @Override // tb.osn
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f32115a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("DataServiceWindVaneProvider", "findTopPosition mainFeedsViewService is null");
            return -1;
        }
        return iMainFeedsViewService.findTopPosition(i);
    }

    @Override // tb.osn
    public double b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253bde", new Object[]{this, str, new Integer(i)})).doubleValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f32115a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("DataServiceWindVaneProvider", "getViewExposureRatio mainFeedsViewService is null");
            return -1.0d;
        }
        return iMainFeedsViewService.getViewExposureRatio(i);
    }
}
