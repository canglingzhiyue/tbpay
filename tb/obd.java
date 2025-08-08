package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.constants.a;

/* loaded from: classes8.dex */
public class obd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1873246502);
    }

    public void a(Context context, TPTargetType tPTargetType, String str, oak oakVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc23ba6", new Object[]{this, context, tPTargetType, str, oakVar});
        } else if (tPTargetType == null || StringUtils.isEmpty(str)) {
        } else {
            String a2 = obc.a(tPTargetType);
            a(context, str, oakVar);
            if (!StringUtils.isEmpty(a2) && !a.b) {
                obc.d(context, a2);
            }
            oakVar.a(true);
        }
    }

    public void a(Context context, String str, oak oakVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d44f21", new Object[]{this, context, str, oakVar});
        } else if (StringUtils.isEmpty(str)) {
            if (oakVar == null) {
                return;
            }
            oakVar.a("remote service return data is null!");
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(nyg.TAO_FLAG + ShareBizAdapter.getInstance().getAppEnv().b().getPackageName(), str));
                } else {
                    ((android.text.ClipboardManager) context.getSystemService("clipboard")).setText(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (oakVar == null) {
                return;
            }
            oakVar.b(str);
        }
    }
}
