package tb;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public interface svn extends com.taobao.tbmobilesmartapi.core.a {

    /* loaded from: classes8.dex */
    public static class a {
        public String b;
        public boolean d;
        public boolean e;
        public List<String> f;
        public b g;

        /* renamed from: a  reason: collision with root package name */
        public String f33924a = "";
        public boolean c = false;

        static {
            kge.a(733355967);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static final int FLAG_INSERT_CURRENT_NEXT = 1;
        public static final int INSERT = 1;
        public static final int REPLACE = 2;

        /* renamed from: a  reason: collision with root package name */
        public HashMap f33925a;
        public int b;
        public String c;
        public int d;
        public int e = 0;

        static {
            kge.a(-1599336577);
        }
    }

    /* loaded from: classes8.dex */
    public interface c {
        boolean a();

        boolean a(List<String> list);
    }

    void a(com.taobao.tbmobilesmartapi.core.c cVar);

    void a(c cVar);
}
