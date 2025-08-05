package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;

/* loaded from: classes8.dex */
public class peq extends peo implements pnr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "peq";

    public peq(pee peeVar, peg pegVar) {
        super(peeVar, pegVar);
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
            return;
        }
        pmd.a().j().a(pehVar.f32566a, pehVar.b, this.f32574a.h);
        pmd.a().j().a(pehVar.f32566a, pehVar.b, TextUtils.isEmpty(pehVar.c) ? null : pehVar.c, pehVar.d, "tb", pehVar.e, pehVar.f, new Object[0]);
        pmd.a().j().a(pehVar.f32566a, pehVar.c, this);
    }

    public void b(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f64766", new Object[]{this, pehVar});
            return;
        }
        pmd.a().j().b(this.f32574a.d, this.f32574a.e, TextUtils.isEmpty(this.f32574a.f) ? null : this.f32574a.f, this.f32574a.g, "tb", pehVar.e, pehVar.f, new Object[0]);
        this.b = null;
    }

    public void a(TLiveMsg tLiveMsg, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4fbcbe", new Object[]{this, tLiveMsg, pnqVar});
        } else {
            pmd.a().j().a(this.f32574a.d, tLiveMsg, pnqVar, new Object[0]);
        }
    }

    public void a(Map<String, Double> map, boolean z, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0744b4", new Object[]{this, map, new Boolean(z), pnqVar});
        } else {
            pmd.a().j().a(this.f32574a.d, this.f32574a.e, map, z, pnqVar, new Object[0]);
        }
    }

    public void a(int i, int i2, int i3, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873eb598", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), pnqVar});
        } else {
            pmd.a().j().a(this.f32574a.d, this.f32574a.e, i, i2, i3, pnqVar, new Object[0]);
        }
    }

    @Override // tb.pnr
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
        } else if (!this.f32574a.c()) {
            String str = "onDispatch[" + this.f32574a.f32564a + riy.BRACKET_START_STR + "pm)]:" + tLiveMsg;
            per.a(per.MODULE_POINT_PM_RECEIVE, per.ERROR_CODE_NO_RUNNING, str);
            pex.a(c, str);
        } else if (tLiveMsg != null) {
            tLiveMsg.sendFullTags = this.f32574a.i.a(this.f32574a.c, tLiveMsg.messageId, tLiveMsg.type);
            this.f32574a.i.a(2, "pm", tLiveMsg, this.f32574a);
            if (this.b != null) {
                per.a(per.MODULE_POINT_PM_RECEIVE, "subtype:" + tLiveMsg.type);
                this.b.a("pm", tLiveMsg);
                return;
            }
            String str2 = "onError[OnErrorListener is null]:" + this.f32574a.f32564a + " " + tLiveMsg;
            per.a(per.MODULE_POINT_PM_RECEIVE, per.ERROR_CODE_LISTENER_IS_NULL, str2);
            pex.a(c, str2);
        } else {
            per.a(per.MODULE_POINT_PM_RECEIVE, per.ERROR_CODE_DATA_NULL, "onDispatch[onError]:liveMsg is null");
            pex.a(c, "onDispatch[onError]:liveMsg is null");
        }
    }

    @Override // tb.pnr
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        String str = "onError:" + i + " " + obj;
        pex.a(c, str);
        per.a(per.MODULE_POINT_PM_RECEIVE, per.ERROR_CODE_LISTENER_ERROR, str);
        if (this.b != null) {
            this.b.a(i, obj);
            return;
        }
        pex.a(c, "onError[OnErrorListener is null]:" + this.f32574a.f32564a);
    }
}
