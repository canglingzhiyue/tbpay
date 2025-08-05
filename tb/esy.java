package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jqi;

/* loaded from: classes6.dex */
public final class esy extends jqi.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1180868315);
    }

    @Override // tb.jqi.a
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -657323943) {
            if (hashCode != -236978027) {
                if (hashCode == 404131443 && str.equals("checkDXMemoCacheBeforeDownload")) {
                    c = 0;
                }
            } else if (str.equals("uploadUltronPerformanceToUT")) {
                c = 2;
            }
        } else if (str.equals("enableUltronPerformance")) {
            c = 1;
        }
        if (c == 0) {
            return bxd.a(str, false);
        }
        if (c == 1) {
            return bxd.a(str, true);
        }
        if (c == 2) {
            return bxd.a(str, false);
        }
        return bxd.a(str, z);
    }

    @Override // tb.jqi.a
    public float a(String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : bxd.a(str, f);
    }

    @Override // tb.jqi.a
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : bxd.a(str, i);
    }

    @Override // tb.jqi.a
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue() : bxd.a(str, j);
    }

    @Override // tb.jqi.a
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : bxd.a(str, str2);
    }
}
