package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes.dex */
public class rjl implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1764222561);
        kge.a(-234059470);
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }
}
