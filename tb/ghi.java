package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.core.EditionSwitchServiceImpl;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ghi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<Class<? extends ghn>, ghn> f28330a;

    static {
        kge.a(2045650535);
        HashMap<Class<? extends ghn>, ghn> hashMap = new HashMap<>(2);
        f28330a = hashMap;
        hashMap.put(ghm.class, new EditionSwitchServiceImpl());
    }

    public static <T extends ghn> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return (T) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("271aeb04", new Object[]{cls}) : f28330a.get(cls));
    }
}
