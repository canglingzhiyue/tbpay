package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* loaded from: classes6.dex */
public class jvo extends jvn implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2005412569);
        kge.a(-1201612728);
    }

    public jvo(MUSDKInstance mUSDKInstance, int i) {
        super(mUSDKInstance, "click", i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            a();
        }
    }
}
