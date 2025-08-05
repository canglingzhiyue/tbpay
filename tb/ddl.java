package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.l;

/* loaded from: classes.dex */
public class ddl extends ddm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_CMD_REMOVEALIAS = "removeAlias";
    public static final String JSON_CMD_REMOVEALLALIAS = "unbindAllAlias";
    public static final String JSON_CMD_SETALIAS = "setAlias";
    public static final String JSON_PUSH_USER_TOKEN = "pushAliasToken";

    /* renamed from: a  reason: collision with root package name */
    public String f26708a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-252114978);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        try {
            i.a a2 = new i.a().a("cmd", this.e).a("appKey", this.f26708a).a("deviceId", this.b).a("alias", this.c).a(JSON_PUSH_USER_TOKEN, this.d);
            if (l.s(GlobalClientInfo.getContext())) {
                a2.a("regId", l.q(GlobalClientInfo.getContext()));
                a2.a("utdid", UtilityImpl.getDeviceId(GlobalClientInfo.getContext()));
            }
            String jSONObject = a2.a().toString();
            ALog.i("AliasDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    public static byte[] a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c0bf3957", new Object[]{str, str2, str3});
        }
        ddl ddlVar = new ddl();
        ddlVar.f26708a = str;
        ddlVar.b = str2;
        ddlVar.c = str3;
        ddlVar.e = JSON_CMD_SETALIAS;
        return ddlVar.a();
    }

    public static byte[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4dba22e1", new Object[]{str, str2});
        }
        ddl ddlVar = new ddl();
        ddlVar.f26708a = str;
        ddlVar.b = str2;
        ddlVar.e = JSON_CMD_REMOVEALLALIAS;
        return ddlVar.a();
    }

    public static byte[] b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c6c304b6", new Object[]{str, str2, str3});
        }
        ddl ddlVar = new ddl();
        ddlVar.f26708a = str;
        ddlVar.b = str2;
        ddlVar.d = str3;
        ddlVar.e = JSON_CMD_REMOVEALIAS;
        return ddlVar.a();
    }

    public static byte[] c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ccc6d015", new Object[]{str, str2, str3});
        }
        ddl ddlVar = new ddl();
        ddlVar.f26708a = str;
        ddlVar.b = str2;
        ddlVar.c = str3;
        ddlVar.e = JSON_CMD_REMOVEALIAS;
        return ddlVar.a();
    }
}
