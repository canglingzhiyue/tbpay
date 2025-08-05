package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.j;

/* loaded from: classes9.dex */
public class rov extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean d;

    public rov(String str, String str2, String str3, boolean z) {
        this.f24058a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[retryable:" + this.d + " code:" + this.f24058a + " subcode:" + this.b + " info:" + this.c + riy.ARRAY_END_STR;
    }
}
