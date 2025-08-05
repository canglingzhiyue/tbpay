package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.e;
import com.taobao.android.detail2.core.framework.view.manager.a;

/* loaded from: classes5.dex */
public class flj implements a.InterfaceC0465a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f28029a;
    private fmd b;

    static {
        kge.a(1959837170);
        kge.a(1060619383);
    }

    public flj(e eVar, fmd fmdVar) {
        this.f28029a = eVar;
        this.b = fmdVar;
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.a.InterfaceC0465a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "从ND页开始滑动");
        this.f28029a.a("NewDetail", true);
        this.f28029a.b(a.PAGE_TYPE_SECOND_PAGE);
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.a.InterfaceC0465a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "从二级页开始滑动");
        this.f28029a.a(a.PAGE_TYPE_SECOND_PAGE, true);
        this.f28029a.b("NewDetail");
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.a.InterfaceC0465a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "滑动到ND页，页面是否切换" + z);
        this.f28029a.a(a.PAGE_TYPE_SECOND_PAGE);
        this.f28029a.c("NewDetail");
        if (z) {
            return;
        }
        c(false);
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.a.InterfaceC0465a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "滑动到二级页，页面是否切换" + z);
        this.f28029a.a("NewDetail");
        this.f28029a.c(a.PAGE_TYPE_SECOND_PAGE);
        if (!z) {
            return;
        }
        c(true);
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isOpenSecondPage", (Object) Boolean.valueOf(z));
        this.b.a("nativeSlideCallBack", jSONObject);
    }
}
