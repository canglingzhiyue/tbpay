package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lhs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30624a = -1;

    static {
        kge.a(971458098);
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.f30624a;
        if (i2 < 0) {
            ldf.d("RecommendRealIndexCreator", "infoFlowCardStartPosition is -1");
            return -1;
        }
        int i3 = i - i2;
        if (i3 >= 0) {
            return i3;
        }
        ldf.d("RecommendRealIndexCreator", "recIndex < 0");
        return -1;
    }

    public void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
        } else {
            this.f30624a = liy.a(ljsVar);
        }
    }
}
