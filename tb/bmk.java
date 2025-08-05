package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class bmk extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "platform";

    static {
        kge.a(-1010388222);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list != null && list.size() > 0) {
            String valueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(valueOf) && "Android".equalsIgnoreCase(valueOf)) {
                return true;
            }
        }
        return false;
    }
}
