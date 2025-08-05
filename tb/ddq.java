package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.i;

/* loaded from: classes4.dex */
public class ddq extends ddm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1350631171);
    }

    public static byte[] a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9775d81", new Object[]{str, str2, new Integer(i), new Integer(i2)});
        }
        try {
            return new i.a().a("targetService", str).a("streamId", str2).a("fromStreamSeqNum", Integer.valueOf(i)).a("toStreamSeqNum", Integer.valueOf(i2)).a().toString().getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("SyncDO", "buildData err", th, new Object[0]);
            return null;
        }
    }
}
