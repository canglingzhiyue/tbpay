package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cfr implements cfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.cfq
    public AuthStatus a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("6b915b6c", new Object[]{this, context, str});
        }
        c.a("MChecker", "checkPermission:" + str);
        AuthStatus authStatus = AuthStatus.UNKNOWN;
        int checkSelfPermission = context.checkSelfPermission(str);
        return checkSelfPermission == 0 ? AuthStatus.GRANTED : checkSelfPermission == -1 ? (!(context instanceof Activity) || !((Activity) context).shouldShowRequestPermissionRationale(str)) ? AuthStatus.FIRST_TIME_OR_NEVER_AGAIN : AuthStatus.SHOULD_SHOW_RATIONALE : authStatus;
    }
}
