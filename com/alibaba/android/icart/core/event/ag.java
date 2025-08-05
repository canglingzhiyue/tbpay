package com.alibaba.android.icart.core.event;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.taobao.R;
import tb.bca;
import tb.bei;
import tb.kge;

/* loaded from: classes2.dex */
public class ag extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1310861599);
    }

    public static /* synthetic */ Object ipc$super(ag agVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ag() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    @Override // com.alibaba.android.ultron.trade.event.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(tb.bmz r19) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.event.ag.b(tb.bmz):void");
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : NetworkStatusHelper.isConnected();
    }

    private void g() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (CheckHoldManager.a().f() == 0) {
            string = this.e.getString(R.string.cart_promotion_calculate_totalTitle_heji);
        } else {
            string = this.e.getString(R.string.cart_promotion_calculate_totalTitle_youhuiqian);
        }
        bei.a(this.g, this.e.getString(R.string.cart_promotion_calculate), string);
        bei.a(this.g, this.f25791a);
        this.f25791a.x().b(4);
    }
}
