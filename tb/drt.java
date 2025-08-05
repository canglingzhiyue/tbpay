package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class drt extends drp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float A;
    public float B;
    public String C;
    public String D;
    public String E;
    public String y;
    public long z;

    static {
        kge.a(-1756064230);
    }

    @Override // tb.drp
    public HashMap<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("exposeSeries", this.y);
        hashMap.put("exposeEndTime", Long.valueOf(this.z));
        hashMap.put("stayMaxArea", Float.valueOf(this.A));
        hashMap.put("halfAreaDuration", Float.valueOf(this.B));
        hashMap.put("actionArg1", this.C);
        hashMap.put("actionArg2", this.D);
        hashMap.put("actionArg3", this.E);
        return hashMap;
    }
}
