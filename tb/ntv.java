package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class ntv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(282347106);
    }

    public static void a(Activity activity, CommonSearchContext commonSearchContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5791d8bf", new Object[]{activity, commonSearchContext, str});
        } else if (StringUtils.isEmpty(str)) {
            q.a("SearchPoplayerUtil", "SRP不调用poplayer:传给poplayer的url为空");
        } else {
            if (r.aF()) {
                if (str.startsWith("elderSearch")) {
                    str = "elderSearch";
                }
                if (str.startsWith("inSearchElder")) {
                    str = "inSearchElder";
                }
            }
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            String str2 = cag.PAGE_SCHEME + str;
            String packageName = Globals.getApplication().getPackageName();
            q.a("SearchPoplayerUtil", "call poplayer: " + packageName);
            intent.setPackage(packageName);
            intent.putExtra("event", str2);
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            q.a("SearchPoplayerUtil", "SRP调用poplayer成功啦, evenValue是:" + str2);
        }
    }
}
