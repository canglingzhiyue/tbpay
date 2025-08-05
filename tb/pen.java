package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class pen {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32573a = "pen";
    private pee b;
    private List<pnr> c = new ArrayList();

    public pen(pee peeVar) {
        this.b = peeVar;
    }

    public void a(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f6a024", new Object[]{this, pnrVar});
            return;
        }
        this.c.remove(pnrVar);
        this.c.add(pnrVar);
    }

    public void b(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879a6a5", new Object[]{this, pnrVar});
        } else {
            this.c.remove(pnrVar);
        }
    }

    public boolean a(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956b015b", new Object[]{this, str, tLiveMsg})).booleanValue();
        }
        if (!this.b.c()) {
            String str2 = "dispatch[" + this.b.f32564a + riy.BRACKET_START_STR + str + ")]:" + tLiveMsg;
            per.a(per.MODULE_POINT_PROVIDER, per.ERROR_CODE_NO_RUNNING, str2);
            pex.a(f32573a, str2);
            return false;
        } else if (this.c.isEmpty()) {
            String str3 = "dispatch[业务方没有订阅回调(" + str + ")]:" + tLiveMsg;
            per.a(per.MODULE_POINT_PROVIDER, per.ERROR_CODE_LISTENER_IS_NULL, str3);
            pex.a(f32573a, str3);
            return false;
        } else {
            per.a(per.MODULE_POINT_PROVIDER, "source:" + str + ";subtype:" + tLiveMsg.type);
            for (pnr pnrVar : this.c) {
                pnrVar.a(tLiveMsg);
            }
            return true;
        }
    }

    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        } else if (!this.b.c()) {
            String str = f32573a;
            pex.a(str, "error[" + this.b.f32564a + "]:" + i + " " + obj);
        } else if (this.c.isEmpty()) {
            String str2 = f32573a;
            pex.a(str2, "error[业务方没有订阅回调]:" + i + " " + obj);
        } else {
            for (pnr pnrVar : this.c) {
                pnrVar.a(i, obj);
            }
        }
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
        } else {
            this.c.clear();
        }
    }
}
