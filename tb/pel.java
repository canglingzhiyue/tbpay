package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* loaded from: classes8.dex */
public class pel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32571a = "pel";
    private pee b;
    private pem<String> c;

    public pel(pee peeVar) {
        this.b = peeVar;
    }

    public boolean a(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956b015b", new Object[]{this, str, tLiveMsg})).booleanValue();
        }
        if (!this.b.c()) {
            String str2 = "deduplication[" + this.b.f32564a + riy.BRACKET_START_STR + str + ")]:" + tLiveMsg;
            per.a(per.MODULE_POINT_DEDUPLICATION, per.ERROR_CODE_NO_RUNNING, str2);
            pex.a(f32571a, str2);
            return false;
        }
        pem<String> pemVar = this.c;
        if (pemVar == null) {
            String str3 = "deduplication[mDeduplicationSet is null (" + str + ")]:" + tLiveMsg;
            per.a(per.MODULE_POINT_DEDUPLICATION, per.ERROR_CODE_LISTENER_IS_NULL, str3);
            pex.a(f32571a, str3);
            return false;
        } else if (pemVar.a(tLiveMsg.messageId)) {
            per.a(per.MODULE_POINT_DEDUPLICATION, "isDeduplication:true;source:" + str + ";subtype:" + tLiveMsg.type);
            return true;
        } else {
            per.a(per.MODULE_POINT_DEDUPLICATION, "isDeduplication:false;source:" + str + ";subtype:" + tLiveMsg.type);
            pex.a(f32571a, "deduplication[重复数据上报(" + str + ")]:" + tLiveMsg);
            return false;
        }
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
        } else {
            this.c = new pem<>(this.b.b.f21436a);
        }
    }

    public void b(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f64766", new Object[]{this, pehVar});
            return;
        }
        this.c.a();
        this.c = null;
    }
}
