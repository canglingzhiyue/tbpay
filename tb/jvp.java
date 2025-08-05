package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* loaded from: classes6.dex */
public class jvp extends jvn implements View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1351857341);
        kge.a(1426707756);
    }

    public jvp(MUSDKInstance mUSDKInstance, int i) {
        super(mUSDKInstance, "longtap", i);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        a();
        return true;
    }
}
