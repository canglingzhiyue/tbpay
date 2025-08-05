package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.utils.k;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static pfa b;

    /* renamed from: a  reason: collision with root package name */
    public String f32580a = null;
    private a c;

    /* loaded from: classes8.dex */
    public interface a {
        String a();

        void a(Activity activity, boolean z, Map<String, String> map);

        void a(com.taobao.alilive.aliliveframework.frame.a aVar, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap);

        void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj);

        void a(e eVar);

        void a(e eVar, Object obj);

        void a(e eVar, Object obj, String str);

        void a(String str);

        boolean a(Context context);

        void b(e eVar, Object obj);

        boolean b();

        String c();
    }

    static {
        kge.a(-383968773);
    }

    public static pfa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfa) ipChange.ipc$dispatch("f091953", new Object[0]);
        }
        if (b == null) {
            synchronized (pfa.class) {
                if (b == null) {
                    b = new pfa();
                }
            }
        }
        return b;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("53058fd5", new Object[]{this}) : this.c;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916fe2b0", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public static pfa a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfa) ipChange.ipc$dispatch("83a302be", new Object[]{aVar});
        }
        if (k.a(aVar)) {
            return k.b(aVar).a();
        }
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            hashMap.put("frameContext", String.valueOf(aVar.hashCode()));
        }
        o.a(aVar, 19999, "highlight_adapter_refactor", hashMap);
        return a();
    }
}
