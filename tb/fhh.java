package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Class<? extends CardInnerCommonNode>> f27943a;

    static {
        kge.a(229084643);
        f27943a = new HashMap<>();
    }

    public static Class<? extends CardInnerCommonNode> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("582938df", new Object[]{str});
        }
        Class<? extends CardInnerCommonNode> cls = f27943a.get(str);
        return cls == null ? CardInnerCommonNode.class : cls;
    }
}
