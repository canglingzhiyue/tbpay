package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class sbw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ByteBuffer a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("351f15a9", new Object[0]) : ByteBuffer.allocate(0);
    }
}
