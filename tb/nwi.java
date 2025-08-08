package tb;

import mtopsdk.common.util.StringUtils;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class nwi extends nps {
    public static final a Companion;
    private Map<String, String> b;

    static {
        kge.a(2134709823);
        Companion = new a(null);
    }

    public nwi() {
        this(null, 1, null);
    }

    public /* synthetic */ nwi(Map map, int i, o oVar) {
        this((i & 1) != 0 ? null : map);
    }

    public nwi(Map<String, String> map) {
        super("26665", nog.CLICK_TRACE);
        this.b = map;
        Map<String, String> map2 = this.b;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    b(key, value);
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(540114631);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
