package tb;

import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.e;

/* loaded from: classes.dex */
public class mow implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.monitor.procedure.e
    public IPage a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage) ipChange.ipc$dispatch("e21dac27", new Object[]{this, view, new Boolean(z)}) : new mov().a(true).a(view).b(z).a();
    }

    @Override // com.taobao.monitor.procedure.e
    public IPage a(Fragment fragment, String str, String str2, View view, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage) ipChange.ipc$dispatch("57381271", new Object[]{this, fragment, str, str2, view, new Boolean(z)}) : new mov().b(fragment).c(str).d(str2).a(true).a(view).b(z).a();
    }
}
