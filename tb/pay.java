package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.model.common.AccountInfo;

/* loaded from: classes8.dex */
public class pay implements cgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-83844015);
        kge.a(-143433957);
    }

    @Override // tb.cgz
    public void a(Context context, AccountInfo accountInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea60d39", new Object[]{this, context, accountInfo, new Boolean(z)});
            return;
        }
        String str = accountInfo.accountInfoUrl;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        Nav.from(context).toUri(str);
    }
}
