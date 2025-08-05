package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.l;

/* loaded from: classes4.dex */
public class ddp extends ddm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";

    /* renamed from: a  reason: collision with root package name */
    public String f26711a;
    public String b;
    public String c;

    static {
        kge.a(-1025071588);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        try {
            i.a aVar = new i.a();
            aVar.a("cmd", this.e).a("appKey", this.f26711a);
            if (TextUtils.isEmpty(this.b)) {
                aVar.a("utdid", this.c);
            } else {
                aVar.a("deviceId", this.b);
            }
            if (l.s(GlobalClientInfo.getContext())) {
                aVar.a("regId", l.q(GlobalClientInfo.getContext()));
                aVar.a("utdid", UtilityImpl.getDeviceId(GlobalClientInfo.getContext()));
            }
            String jSONObject = aVar.a().toString();
            ALog.i("SwitchDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    public static byte[] a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("573d7f4f", new Object[]{str, str2, str3, new Boolean(z)});
        }
        ddp ddpVar = new ddp();
        ddpVar.f26711a = str;
        ddpVar.b = str2;
        ddpVar.c = str3;
        if (z) {
            ddpVar.e = JSON_CMD_ENABLEPUSH;
        } else {
            ddpVar.e = JSON_CMD_DISABLEPUSH;
        }
        return ddpVar.a();
    }
}
