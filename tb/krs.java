package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;

/* loaded from: classes7.dex */
public class krs implements tmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30282a;

    static {
        kge.a(777911783);
        kge.a(-961336107);
    }

    public krs(ljs ljsVar) {
        this.f30282a = ljsVar;
    }

    @Override // tb.tmu
    public void a(tmv tmvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c90002f", new Object[]{this, tmvVar, str, str2});
        } else if (!StringUtils.equals("icon_and_miniapp_nomore_2019_v1", str)) {
        } else {
            a(tmvVar, str2);
        }
    }

    private void a(tmv tmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543515a5", new Object[]{this, tmvVar, str});
            return;
        }
        IIconService iIconService = (IIconService) this.f30282a.a(IIconService.class);
        if (iIconService == null) {
            return;
        }
        iIconService.passPopLayerData(tmvVar, str);
    }
}
