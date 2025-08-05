package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public interface myx<C> {

    /* loaded from: classes.dex */
    public static final class a<C> implements myx<C> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final myx<myu> BINARY;
        public static final myx<myv> BINARY_EXTRACT;
        public static final myx<myw> BINARY_INJECT;
        public static final myx<myy> HTTP_HEADERS;
        public static final myx<myy> TEXT_MAP;
        public static final myx<mza> TEXT_MAP_EXTRACT;
        public static final myx<mzc> TEXT_MAP_INJECT;

        /* renamed from: a  reason: collision with root package name */
        private final String f31328a;

        private a(String str) {
            this.f31328a = str;
        }

        static {
            kge.a(870213720);
            kge.a(-1470865927);
            TEXT_MAP = new a("TEXT_MAP");
            TEXT_MAP_INJECT = new a("TEXT_MAP_INJECT");
            TEXT_MAP_EXTRACT = new a("TEXT_MAP_EXTRACT");
            HTTP_HEADERS = new a("HTTP_HEADERS");
            BINARY = new a("BINARY");
            BINARY_INJECT = new a("BINARY_INJECT");
            BINARY_EXTRACT = new a("BINARY_EXTRACT");
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return a.class.getSimpleName() + "." + this.f31328a;
        }
    }
}
