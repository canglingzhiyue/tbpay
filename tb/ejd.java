package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ejd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1451607420);
        emu.a("com.taobao.android.detail.core.standard.base.api.aurasupport.AuraDataApi");
    }

    public static void a(View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6bf190", new Object[]{view, str, obj});
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) view.getTag(R.id.standard_detail_view_data);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        concurrentHashMap.put(str, obj);
        view.setTag(R.id.standard_detail_view_data, concurrentHashMap);
    }

    public static Object a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("432e0efe", new Object[]{view, str});
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) view.getTag(R.id.standard_detail_view_data);
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }
}
