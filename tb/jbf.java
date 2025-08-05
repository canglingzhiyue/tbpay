package tb;

import java.io.File;

/* loaded from: classes.dex */
public class jbf {
    public static final long KEEP_ALIVE_TIME;
    public static final boolean METHOD_TRACE;
    public static final int ORANGE_FAKE;
    public static final int TOTAL_GLOBAL_HANDLER_COUNT;

    static {
        jaw jawVar = new jaw(jbb.a().a(new File(jar.a().getFilesDir(), ".orange_fake.txt")));
        ORANGE_FAKE = jawVar.a("ORANGE_FAKE", -1);
        KEEP_ALIVE_TIME = jawVar.a("KEEP_ALIVE_TIME", 3000);
        METHOD_TRACE = jawVar.a("METHOD_TRACE", true);
        TOTAL_GLOBAL_HANDLER_COUNT = jawVar.a("TOTAL_GLOBAL_HANDLER_COUNT", 1);
    }
}
