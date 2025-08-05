package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dry extends drp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float A;
    public String B;
    public String C;
    public String D;
    public long y;
    public float z;

    static {
        kge.a(-1913733981);
    }

    @Override // tb.drp
    public HashMap<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("scrollEndTime", Long.valueOf(this.y));
        hashMap.put("scrollSpeedX", Float.valueOf(this.z));
        hashMap.put("scrollSpeedY", Float.valueOf(this.A));
        hashMap.put("actionArg1", this.B);
        hashMap.put("actionArg2", this.C);
        hashMap.put("actionArg3", this.D);
        return hashMap;
    }
}
