package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.h;
import com.taobao.mmad.data.BaseMmAdModel;

/* loaded from: classes7.dex */
public class tjf implements tje {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1954666586);
        kge.a(-1841757186);
    }

    @Override // tb.tje
    public boolean a(tiq tiqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe071cb", new Object[]{this, tiqVar, new Integer(i)})).booleanValue();
        }
        stv.a("PopRule", "PopRule verify start.");
        BaseMmAdModel b = tiqVar.d().b();
        h.a("").d().a();
        if (!StringUtils.isEmpty(b.animationType) && "1".equals(b.animationType)) {
            if (stu.b(b.animationLottie) == null) {
                tjo.a(tiqVar.d().e(), b);
                stv.a("PopRule", "PopRule verify error, animationLottie not exist local.");
                return false;
            } else if ("commercialAdVideo".equals(b.bizType) && stu.b(b.videoUrl) == null) {
                tjo.b(tiqVar.d().e(), b);
                stv.a("PopRule", "PopRule verify error, videoUrl not exist local.");
                return false;
            }
        }
        stv.a("PopRule", "PopRule verify end. ret=true");
        return true;
    }
}
