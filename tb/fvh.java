package tb;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.share.ui.engine.friend.a;

/* loaded from: classes.dex */
public class fvh extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LocalImageParser";

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Context b = e.b();
        int a2 = a(e.b(), str);
        if (a2 == 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return b.getDrawable(a2);
        }
        return b.getResources().getDrawable(a2);
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return context.getResources().getIdentifier(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
        } catch (Exception e) {
            Log.e(TAG, "Get layout parser exception", e);
            return 0;
        }
    }
}
