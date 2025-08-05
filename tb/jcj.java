package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.event.b;
import java.util.List;

/* loaded from: classes5.dex */
public class jcj extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_ON_FULLPAGE_VIDEO_MESSAGE = "onFullPageVideoMessage";

    /* renamed from: a  reason: collision with root package name */
    private final aa f29450a;

    static {
        kge.a(1512954349);
    }

    public static /* synthetic */ Object ipc$super(jcj jcjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public jcj(aa aaVar) {
        this.f29450a = aaVar;
        this.i = 2;
        spz.c("GlobalMessageToHomeHandler", "GlobalMessageToHomeHandler 初始化成功: " + aaVar);
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
        }
        if (TextUtils.equals(spyVar.c, "VSMSG_registerFilter")) {
            return spy.BIZ_TNODE_HOME.equals(spyVar.f33836a);
        }
        if (!this.j.isEmpty()) {
            return this.j.contains(spyVar.c);
        }
        return false;
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spy.BIZ_TNODE_HOME.equals(spyVar.f33836a) && TextUtils.equals(spyVar.c, "VSMSG_registerFilter")) {
            a(c(spyVar));
        } else {
            b(spyVar);
        }
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            spz.c("GlobalMessageToHomeHandler", "【setFilterMessages】VSMSG_registerFilter register message");
            if (!this.j.isEmpty()) {
                return;
            }
            this.j.addAll(list);
        }
    }

    private void b(spy spyVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
        } else if (spyVar == null) {
            spz.c("GlobalMessageToHomeHandler", "向 TAB2 首页发送消息失败，ShortVideoMessage 为空");
        } else {
            aa aaVar = this.f29450a;
            if (aaVar == null) {
                spz.c("GlobalMessageToHomeHandler", "向 TAB2 首页发送消息失败，TNode 为空");
                return;
            }
            ab k = aaVar.k();
            if (k == null) {
                spz.c("GlobalMessageToHomeHandler", "向 TAB2 首页发送消息失败，TNodeEngine 为空");
                return;
            }
            if (!spy.MSG_SHOW_TABBAR.equals(spyVar.c) && !spy.MSG_HIDE_TABBAR.equals(spyVar.c)) {
                z = false;
            }
            if (z && sjt.u()) {
                spz.c("GlobalMessageToHomeHandler", "向 TAB2 首页发送消息tabbar相关被过滤");
                return;
            }
            k.a(0, this.f29450a, MSG_ON_FULLPAGE_VIDEO_MESSAGE, (String) null, spyVar.a(), (b) null);
            spz.a("GlobalMessageToHomeHandler", "向 TAB2 首页发送消息: " + spyVar.toString());
        }
    }
}
