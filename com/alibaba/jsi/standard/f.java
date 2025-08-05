package com.alibaba.jsi.standard;

import com.alibaba.jsi.standard.js.aa;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.k;
import com.alibaba.jsi.standard.js.n;
import com.alibaba.jsi.standard.js.r;
import com.alibaba.jsi.standard.js.t;
import com.alibaba.jsi.standard.js.u;
import com.alibaba.jsi.standard.js.v;
import com.alibaba.jsi.standard.js.w;
import com.alibaba.jsi.standard.js.z;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<com.alibaba.jsi.standard.js.b> f3132a;
    private static AtomicInteger b;
    private static boolean c;
    private static boolean d;
    private static boolean e;

    static {
        kge.a(694539808);
        f3132a = new HashSet();
        b = new AtomicInteger(0);
        c = false;
        d = false;
        e = false;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        if (b.addAndGet(z ? 1 : -1) > 0) {
            z2 = true;
        }
        c = z2;
    }

    public static void a(d dVar, com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f8cace", new Object[]{dVar, bVar});
        } else if (!c) {
        } else {
            if (dVar == null) {
                throw new NullPointerException("Pass null JSContext with object: " + bVar);
            }
            d = true;
            dVar.g().objectCreated(bVar);
        }
    }

    public static void a(JSEngine jSEngine, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8948257", new Object[]{jSEngine, aaVar});
        } else if (!c) {
        } else {
            d = true;
            if (jSEngine == null) {
                return;
            }
            jSEngine.objectCreated(aaVar);
        }
    }

    public static void a(com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba10ed3b", new Object[]{bVar});
        } else if (!c) {
        } else {
            synchronized (f3132a) {
                f3132a.add(bVar);
                e = true;
            }
        }
    }

    public static void b(d dVar, com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf59cead", new Object[]{dVar, bVar});
        } else if (!d || dVar == null) {
        } else {
            dVar.g().objectDeleted(bVar);
        }
    }

    public static void b(JSEngine jSEngine, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adf3736", new Object[]{jSEngine, aaVar});
        } else if (!d || jSEngine == null) {
        } else {
            jSEngine.objectDeleted(aaVar);
        }
    }

    public static void b(com.alibaba.jsi.standard.js.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e50259a", new Object[]{bVar});
        } else if (!e) {
        } else {
            synchronized (f3132a) {
                f3132a.remove(bVar);
                if (f3132a.size() != 0) {
                    z = true;
                }
                e = z;
            }
        }
    }

    public static void a(d dVar, Set<com.alibaba.jsi.standard.js.b> set, String str, int i) {
        com.alibaba.jsi.standard.js.c cVar;
        JSEngine jSEngine;
        com.alibaba.jsi.standard.js.c cVar2;
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6126bd4f", new Object[]{dVar, set, str, new Integer(i)});
        } else if (c) {
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            HashSet hashSet7 = new HashSet();
            HashSet hashSet8 = new HashSet();
            HashSet hashSet9 = new HashSet();
            HashSet hashSet10 = new HashSet();
            HashSet hashSet11 = new HashSet();
            HashSet hashSet12 = new HashSet();
            int size = set.size();
            for (com.alibaba.jsi.standard.js.b bVar : set) {
                int i2 = size;
                if (bVar instanceof u) {
                    hashSet2.add(bVar);
                } else if (bVar instanceof com.alibaba.jsi.standard.js.d) {
                    hashSet3.add(bVar);
                } else if (bVar instanceof com.alibaba.jsi.standard.js.e) {
                    hashSet4.add(bVar);
                } else if (bVar instanceof j) {
                    hashSet5.add(bVar);
                } else if (bVar instanceof k) {
                    hashSet6.add(bVar);
                } else if (bVar instanceof r) {
                    hashSet7.add(bVar);
                } else if ((bVar instanceof com.alibaba.jsi.standard.js.g) || (bVar instanceof n) || (bVar instanceof t) || (bVar instanceof v)) {
                    hashSet8.add(bVar);
                } else if (bVar instanceof z) {
                    hashSet9.add(bVar);
                } else if (bVar instanceof com.alibaba.jsi.standard.js.i) {
                    hashSet12.add(bVar);
                } else if (bVar instanceof aa) {
                    hashSet11.add(bVar);
                } else {
                    hashSet10.add(bVar);
                }
                size = i2;
            }
            int i3 = size;
            if (dVar != null) {
                jSEngine = dVar.g();
                cVar = new com.alibaba.jsi.standard.js.c(jSEngine);
            } else {
                cVar = null;
                jSEngine = null;
            }
            try {
                g.b(" ");
                g.b("*** *** *** *** ***  Alive Java JS Objects  *** *** *** *** ***");
                cVar2 = cVar;
            } catch (Throwable th) {
                th = th;
                cVar2 = cVar;
            }
            try {
                g.b("JSEngine: " + str);
                if (jSEngine != null) {
                    List<d> contexts = jSEngine.getContexts();
                    int min = Math.min(contexts.size(), i);
                    if (contexts.size() > 0) {
                        hashSet = hashSet11;
                        int i4 = 0;
                        g.b(String.format(Locale.US, "JSContext (%d of %d):", Integer.valueOf(min), Integer.valueOf(contexts.size())));
                        Iterator<d> it = contexts.iterator();
                        while (it.hasNext()) {
                            d next = it.next();
                            int i5 = i4 + 1;
                            if (i5 > min) {
                                break;
                            }
                            g.b("  * " + next.e());
                            it = it;
                            i4 = i5;
                        }
                    } else {
                        hashSet = hashSet11;
                        g.b("JSContext: none");
                    }
                } else {
                    hashSet = hashSet11;
                }
                g.b("Objects count: " + i3);
                b(dVar, hashSet2, "JSSymbol", i);
                b(dVar, hashSet3, "JSArray", i);
                b(dVar, hashSet4, "JSArrayBuffer", i);
                b(dVar, hashSet5, "JSFunction", i);
                b(dVar, hashSet6, "JSMap", i);
                b(dVar, hashSet7, "JSSet", i);
                b(dVar, hashSet8, "JSPrimitiveObject", i);
                b(dVar, hashSet10, "JSObject", i);
                b(dVar, hashSet9, "JSWeakValue", i);
                b(dVar, hashSet, DXMonitorConstant.DX_MONITOR_TEMPLATE, i);
                b(dVar, hashSet12, "JSException", i);
                synchronized (f3132a) {
                    b(null, f3132a, "OutOfEngineObjects", i);
                }
                g.b("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
                g.b(" ");
                if (cVar2 == null) {
                    return;
                }
                cVar2.b();
            } catch (Throwable th2) {
                th = th2;
                if (cVar2 != null) {
                    cVar2.b();
                }
                throw th;
            }
        }
    }

    private static void b(d dVar, Set<com.alibaba.jsi.standard.js.b> set, String str, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce83910", new Object[]{dVar, set, str, new Integer(i)});
        } else if (set.size() != 0) {
            g.b(String.format(Locale.US, "%s (%d of %d):", str, Integer.valueOf(Math.min(set.size(), i)), Integer.valueOf(set.size())));
            for (com.alibaba.jsi.standard.js.b bVar : set) {
                i2++;
                if (i2 > i) {
                    return;
                }
                String str2 = "  * " + bVar.toString();
                if (dVar != null && (bVar instanceof w)) {
                    str2 = str2 + " (" + ((w) bVar).a_(dVar) + riy.BRACKET_END_STR;
                }
                g.b(str2);
            }
        }
    }
}
