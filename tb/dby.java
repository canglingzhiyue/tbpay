package tb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class dby {
    public static final dby e;

    /* renamed from: a  reason: collision with root package name */
    public List<dbu> f26669a;
    public List<dbw> b;
    public final Map<String, List<dbx>> c;
    public List<dbx> d;

    static {
        kge.a(-1363270144);
        e = new dby();
    }

    public dby() {
        new CopyOnWriteArrayList();
        this.f26669a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new ConcurrentHashMap();
        this.d = Collections.synchronizedList(new ArrayList());
        Collections.synchronizedList(new ArrayList());
    }

    public void a(String str, String str2, int i, String str3) {
        Iterator<dbx> it;
        Iterator<dbx> it2;
        String str4 = "handleException:" + str + "-" + str2 + "-" + i + "-" + str3;
        List<dbx> list = this.c.get(str);
        if (list != null && list.size() > 0) {
            while (list.iterator().hasNext()) {
                String str5 = "ExceptionHandler for moduleName:" + str + " --- " + it2.next().getClass().getName();
            }
        }
        if (this.d.size() > 0) {
            while (this.d.iterator().hasNext()) {
                String str6 = "Global ExceptionHandler:" + it.next().getClass().getName();
            }
        }
    }
}
