package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class gbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f28274a;

    static {
        kge.a(2083961455);
        HashMap<String, String> hashMap = new HashMap<>();
        f28274a = hashMap;
        hashMap.put(a.ATOM_EXT_button, "按钮");
        f28274a.put("img", "图片");
        f28274a.put("input", "编辑框");
        f28274a.put("link", "链接");
        f28274a.put("search", "搜索栏");
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : f28274a.get(str));
    }
}
