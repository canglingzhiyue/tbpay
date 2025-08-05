package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.c;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDarkMode;

/* loaded from: classes.dex */
public class llv implements IInfoFlowDarkMode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-579456123);
        kge.a(-1203555994);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDarkMode
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : c.a(context);
    }
}
