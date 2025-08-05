package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.d;
import com.taobao.alimama.tkcps.TaokeBaseUtil;
import com.taobao.alimama.utils.c;

/* loaded from: classes4.dex */
public class dgg implements dgf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-327534227);
        kge.a(1012980445);
    }

    @Override // tb.dgf
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (c.h()) {
            TaokeBaseUtil.a(str);
            d.a().a(str);
        } else {
            TaokeBaseUtil.b(str);
        }
        return str;
    }
}
