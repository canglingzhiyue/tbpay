package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;

/* loaded from: classes6.dex */
public class isr {
    static {
        kge.a(318284765);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ListStyle f29282a;
        public com.taobao.android.meta.data.a b;

        static {
            kge.a(298620668);
        }

        public a(ListStyle listStyle) {
            this.f29282a = listStyle;
        }

        public static a a(ListStyle listStyle, com.taobao.android.meta.data.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cbb6b4e0", new Object[]{listStyle, aVar});
            }
            a aVar2 = new a(listStyle);
            aVar2.b = aVar;
            return aVar2;
        }
    }

    /* loaded from: classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29283a;
        public JSONObject b;
        public a c;
        public a d;

        /* loaded from: classes6.dex */
        public interface a {
            void a(Object obj);
        }

        static {
            kge.a(-1922216831);
        }

        public c(String str, JSONObject jSONObject, a aVar, a aVar2) {
            this.f29283a = str;
            this.b = jSONObject;
            this.c = aVar;
            this.d = aVar2;
        }

        public static c a(String str, JSONObject jSONObject, a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1bc211c9", new Object[]{str, jSONObject, aVar, aVar2}) : new c(str, jSONObject, aVar, aVar2);
        }
    }
}
