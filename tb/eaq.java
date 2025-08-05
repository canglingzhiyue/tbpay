package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.main.c;

/* loaded from: classes4.dex */
public class eaq extends eap<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-305229376);
    }

    @Override // tb.eap
    public boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270b187a", new Object[]{this, cVar})).booleanValue();
        }
        return true;
    }

    @Override // tb.eap
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public eaq(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.DinamicCommonViewHolder");
    }
}
