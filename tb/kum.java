package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tbpoplayer.view.c;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class kum {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_FINISH = 2;
    public static final int ON_START = 1;
    public static final int ON_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<String, a> f30329a;

    static {
        kge.a(1429572123);
        f30329a = new WeakHashMap<>();
    }

    public static void a(String str, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccb4c9d", new Object[]{str, aVar});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a aVar2 = f30329a.get(str);
            if (aVar2 == null) {
                aVar2 = new a(aVar);
                f30329a.put(str, aVar2);
            }
            c.a().a(str, aVar2);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        f30329a.remove(str);
        c.a().a(str);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        a aVar = f30329a.get(str);
        if (aVar != null) {
            return aVar.f30330a;
        }
        return 0;
    }

    /* loaded from: classes7.dex */
    public static class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f30330a;
        private c.a b;

        static {
            kge.a(-698910191);
            kge.a(1745427343);
        }

        private a(c.a aVar) {
            this.f30330a = 0;
            this.b = aVar;
        }

        @Override // com.taobao.tbpoplayer.view.c.a
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                return;
            }
            e.e("poplayer_lifecycle", "sourceName:", str, " onStart");
            this.f30330a = 1;
            c.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(str, jSONObject);
        }

        @Override // com.taobao.tbpoplayer.view.c.a
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
                return;
            }
            e.e("poplayer_lifecycle", "sourceName:", str, " onFinish");
            this.f30330a = 2;
            c.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.b(str, jSONObject);
        }
    }
}
