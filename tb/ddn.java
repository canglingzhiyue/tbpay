package tb;

import android.content.Context;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.l;

/* loaded from: classes4.dex */
public class ddn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f26709a;

    static {
        kge.a(-714081848);
        f26709a = ddn.class.getSimpleName();
    }

    public static byte[] a(Context context, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("21e07c", new Object[]{context, new Integer(i), new Long(j)});
        }
        try {
            return new i.a().a("id", Integer.valueOf(i)).a("utdid", UTDevice.getUtdid(context)).a("appKey", ACCSManager.mDefaultAppkey).a("regId", l.s(context) ? l.q(context) : "").a("happenTime", Long.valueOf(j)).a("type", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE).a().toString().getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e(f26709a, "buildEventData", th, new Object[0]);
            return null;
        }
    }
}
