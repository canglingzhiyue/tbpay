package tb;

/* loaded from: classes4.dex */
public class dhm {
    public static final dhm DEFAULT_NO_RETRY;
    public static final dhm RETRY_FIVE_TIMES;
    public static final dhm RETRY_INFINITY;
    public static final dhm RETRY_TREE_TIMES;

    /* renamed from: a  reason: collision with root package name */
    public final int f26760a;

    static {
        kge.a(812051048);
        DEFAULT_NO_RETRY = new dhm(0);
        RETRY_TREE_TIMES = new dhm(3);
        RETRY_FIVE_TIMES = new dhm(5);
        RETRY_INFINITY = new dhm(Integer.MAX_VALUE);
    }

    public dhm(int i) {
        this.f26760a = i;
    }
}
