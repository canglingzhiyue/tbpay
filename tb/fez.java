package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.b;
import com.taobao.android.detail.core.detail.widget.container.c;

/* loaded from: classes5.dex */
public class fez implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(698718029);
        kge.a(1760784470);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public c a(String str, NestedScrollContainer.a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("27352caf", new Object[]{this, str, aVar, cVar});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public void a(Activity activity, dyd dydVar, egy egyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32343154", new Object[]{this, activity, dydVar, egyVar});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 102;
    }

    public fez() {
        emu.a("com.taobao.android.detail.wrapper.fragment.desc.controller.WeexDescCreator");
    }
}
