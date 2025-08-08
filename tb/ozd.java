package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.cache.library.p;

/* loaded from: classes8.dex */
public class ozd implements oza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1617167851);
        kge.a(1373991493);
    }

    @Override // tb.oza
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String queryParameter = Uri.parse(str).getQueryParameter(oyw.VIDEO_CACHE_ID);
        return StringUtils.isEmpty(queryParameter) ? p.e(str) : queryParameter;
    }
}
