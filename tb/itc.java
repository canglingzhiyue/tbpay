package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class itc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29304a;
    private HashMap<String, Integer> b = new HashMap<>();

    static {
        kge.a(-956005931);
    }

    public itc(int i) {
        this.f29304a = i;
    }

    public int a(BaseTypedBean baseTypedBean, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83f864ff", new Object[]{this, baseTypedBean, listStyle})).intValue();
        }
        if (baseTypedBean == null) {
            return 0;
        }
        String str = baseTypedBean.type;
        if (TextUtils.isEmpty(str) || str.length() == 0) {
            return 0;
        }
        Integer num = this.b.get(str);
        if (num == null) {
            num = Integer.valueOf(this.f29304a);
            this.f29304a += 2;
            this.b.put(str, num);
        }
        return listStyle == ListStyle.LIST ? num.intValue() : num.intValue() + 1;
    }
}
