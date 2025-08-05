package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ozv extends pnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Boolean> f32518a = new HashMap();

    static {
        kge.a(-373164550);
    }

    public ozv() {
        this.f32518a.put("isNotTaobaoAPP", false);
        this.f32518a.put("isTBLiveAPP", false);
        this.f32518a.put("DisableCommitAddPV", false);
        this.f32518a.put("closeBgVideoPlay", false);
    }

    @Override // tb.pnc, tb.pnd
    public Map<String, Boolean> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f32518a;
    }
}
