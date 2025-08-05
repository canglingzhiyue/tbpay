package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class gkk implements gkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private gjz f28368a;

    static {
        kge.a(-481835347);
        kge.a(41894641);
    }

    public gkk(gjz gjzVar) {
        this.f28368a = gjzVar;
    }

    @Override // tb.gkl
    public Object a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8e00aaf9", new Object[]{this, list});
        }
        if (list == null || list.size() < 2 || list.get(0) == null || list.get(1) == null) {
            return "";
        }
        String obj = list.get(0).toString();
        if (TextUtils.isEmpty(obj)) {
            return "";
        }
        Object obj2 = list.get(1);
        JSONObject a2 = this.f28368a.a(obj);
        return a2 != null ? a2.get(obj2) : "";
    }
}
