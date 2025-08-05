package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

@AURAExtensionImpl(code = "tbwaitpay.impl.render.creator.freeNode.actionBar")
/* loaded from: classes6.dex */
public final class jti extends ayf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1381828010);
    }

    @Override // tb.ayf
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "actionBar";
    }

    @Override // tb.ayf
    public void a(View view) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        Context e = a().e();
        if (!(e instanceof Activity) || (viewGroup = (ViewGroup) ((Activity) e).findViewById(R.id.tb_wait_pay_detail_custom_action_bar)) == null) {
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }
}
