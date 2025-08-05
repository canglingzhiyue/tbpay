package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ejc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2114178176);
        emu.a("com.taobao.android.detail.core.standard.AliSDetailGlobalData");
    }

    public static <V> void a(AURAGlobalData aURAGlobalData, String str, Class<V> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e494f5", new Object[]{aURAGlobalData, str, cls});
        } else if (aURAGlobalData == null) {
            ard a2 = arc.a();
            a2.c("AliSDetailGlobalData", "init", "globalData is null,key=" + str);
        } else if (((a) aURAGlobalData.get(str, a.class)) != null) {
        } else {
            aURAGlobalData.update(str, new a(null));
        }
    }

    public static void a(AURAGlobalData aURAGlobalData, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac846924", new Object[]{aURAGlobalData, str, obj});
        } else if (aURAGlobalData == null) {
            ard a2 = arc.a();
            a2.c("AliSDetailGlobalData", "update", "global data is null, cannot update key=" + str);
        } else if (obj == null) {
            aURAGlobalData.update(str, new a(null));
        } else {
            try {
                a aVar = (a) aURAGlobalData.get(str, a.class);
                if (aVar == null) {
                    aURAGlobalData.update(str, new a(obj));
                } else {
                    a.a(aVar, obj);
                }
            } catch (Exception e) {
                ard a3 = arc.a();
                a3.c("AliSDetailGlobalData", "update#setValue exception,key=" + str, e.getMessage());
            }
        }
    }

    public static <V> V b(AURAGlobalData aURAGlobalData, String str, Class<V> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("e099b6fc", new Object[]{aURAGlobalData, str, cls});
        }
        if (aURAGlobalData == null) {
            return null;
        }
        try {
            a aVar = (a) aURAGlobalData.get(str, a.class);
            if (aVar != null) {
                return (V) aVar.a();
            }
            return null;
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("AliSDetailGlobalData", "getValue exception,必须通过 AliSDetailGlobalData#update设置值,key=" + str, e.getMessage());
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class a<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private V f27340a;

        static {
            kge.a(-596605907);
        }

        public static /* synthetic */ void a(a aVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acd045f9", new Object[]{aVar, obj});
            } else {
                aVar.a(obj);
            }
        }

        public a(V v) {
            this.f27340a = v;
        }

        private void a(V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, v});
            } else {
                this.f27340a = v;
            }
        }

        public V a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f27340a;
        }
    }
}
