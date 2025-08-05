package com.alibaba.jsi.standard.js;

import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class Bridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kContextGenCodeCache = 14;
    public static final int kContextGetException = 12;
    public static final int kContextGetGlobalObject = 10;
    public static final int kContextHasException = 11;
    public static final int kContextThrowException = 13;
    public static final int kJSEngineCreate = 8;
    public static final int kJSEngineGetCurrentType = 6;
    public static final int kJSEngineGetType = 4;
    public static final int kJSEngineMultiJSEngine = 7;
    public static final int kJSEngineNativeInfos = 9;
    public static final int kJSEngineSetStatObjects = 5;

    static {
        kge.a(728024813);
    }

    private static native Object nativeCmd(long j, int i, long j2, long j3, Object[] objArr);

    private static native long nativeCreate(long j, int i, long j2, double d, Object[] objArr);

    public static native void nativeDelete(long j, int i);

    public static Object createJavaPrimitive(int i, boolean z, double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("16b2eaab", new Object[]{new Integer(i), new Boolean(z), new Double(d), str});
        }
        if (i == 1) {
            return f.a(z);
        }
        if (i == 2) {
            return new m((int) d);
        }
        if (i == 3) {
            return new m(d);
        }
        if (i == 4) {
            return new s(str);
        }
        if (i == 6) {
            return z ? y.p() : y.q();
        }
        com.alibaba.jsi.standard.g.b("Create JSI primitive java object with unknown type: " + i);
        return null;
    }

    public static int getPrimitiveType(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2290d761", new Object[]{obj})).intValue();
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (wVar.d()) {
                return 1;
            }
            if (wVar.g()) {
                return ((m) wVar).h() ? 2 : 3;
            } else if (wVar.k()) {
                return 4;
            } else {
                if (wVar.n()) {
                    return 6;
                }
            }
        }
        return 0;
    }

    public static boolean getBooleanValue(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab565006", new Object[]{obj})).booleanValue() : ((f) obj).l_();
    }

    public static double getNumberValue(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8887183", new Object[]{obj})).doubleValue() : ((m) obj).m_();
    }

    public static String getStringValue(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1fc8b873", new Object[]{obj}) : ((s) obj).p_();
    }

    public static boolean voidIsUndefined(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df6fc39", new Object[]{obj})).booleanValue() : ((y) obj).r();
    }

    public static Object get(int i, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d0937858", new Object[]{new Integer(i), new Long(j), obj});
        }
        if (i == 1) {
            return w.class;
        }
        return null;
    }

    public static Object createJava(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("58e30114", new Object[]{new Integer(i), new Long(j), new Long(j2)});
        }
        if (19 == i) {
            return new a(j2);
        }
        com.alibaba.jsi.standard.d context = toContext(j);
        switch (i) {
            case 5:
                return new u(context, j2);
            case 6:
            case 14:
            case 19:
            case 20:
            default:
                com.alibaba.jsi.standard.g.b("Create JSI java object with unknown type: " + i);
                return null;
            case 7:
                return new o(context, j2);
            case 8:
                return new d(context, j2);
            case 9:
                return new k(context, j2);
            case 10:
                return new r(context, j2);
            case 11:
                return new e(context, j2);
            case 12:
                return new j(context, j2);
            case 13:
                return new q(context, j2);
            case 15:
                return new g(context, j2);
            case 16:
                return new n(context, j2);
            case 17:
                return new t(context, j2);
            case 18:
                return new v(context, j2);
            case 21:
                return new i(context, j2);
        }
    }

    public static long getNativePtr(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b643278", new Object[]{obj})).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof w) {
            return ((w) obj).b;
        }
        if (obj instanceof a) {
            return ((a) obj).f3139a;
        }
        if (obj instanceof i) {
            return ((i) obj).b;
        }
        if (!(obj instanceof aa)) {
            return 0L;
        }
        return ((aa) obj).b;
    }

    public static boolean detachNative(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5125f6b1", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (wVar.b != 0) {
                com.alibaba.jsi.standard.f.b(wVar.f3143a, wVar);
                wVar.b = 0L;
            }
            return true;
        } else if (obj instanceof a) {
            a aVar = (a) obj;
            aVar.b = true;
            aVar.f3139a = 0L;
            return true;
        } else if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.b != 0) {
                com.alibaba.jsi.standard.f.b(iVar.f3142a, iVar);
                iVar.b = 0L;
            }
            return true;
        } else if (!(obj instanceof aa)) {
            return false;
        } else {
            aa aaVar = (aa) obj;
            if (aaVar.b != 0) {
                com.alibaba.jsi.standard.f.b(aaVar.f3140a, aaVar);
                aaVar.b = 0L;
            }
            return true;
        }
    }

    public static long createNative(com.alibaba.jsi.standard.d dVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf1f6d0", new Object[]{dVar, new Integer(i)})).longValue() : nativeCreate(contextNativePtr(dVar), i, 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static long createNative(com.alibaba.jsi.standard.d dVar, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1708ec9", new Object[]{dVar, new Integer(i), objArr})).longValue() : nativeCreate(contextNativePtr(dVar), i, 0L, mto.a.GEO_NOT_SUPPORT, objArr);
    }

    public static long createNative(com.alibaba.jsi.standard.d dVar, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a14d5b5c", new Object[]{dVar, new Integer(i), new Long(j)})).longValue() : nativeCreate(contextNativePtr(dVar), i, j, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static long createNative(com.alibaba.jsi.standard.d dVar, int i, long j, double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("885e71ca", new Object[]{dVar, new Integer(i), new Long(j), new Double(d)})).longValue() : nativeCreate(contextNativePtr(dVar), i, j, d, null);
    }

    public static long createNative(com.alibaba.jsi.standard.d dVar, int i, long j, double d, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ab92d8f", new Object[]{dVar, new Integer(i), new Long(j), new Double(d), objArr})).longValue() : nativeCreate(contextNativePtr(dVar), i, j, d, objArr);
    }

    public static long createNative(JSEngine jSEngine, int i, long j, double d, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("780947c2", new Object[]{jSEngine, new Integer(i), new Long(j), new Double(d), objArr})).longValue() : nativeCreate(engineNativePtr(jSEngine), i, j, d, objArr);
    }

    private static long contextNativePtr(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc6f1730", new Object[]{dVar})).longValue();
        }
        if (dVar != null) {
            return dVar.m();
        }
        return 0L;
    }

    private static long engineNativePtr(JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba98222c", new Object[]{jSEngine})).longValue();
        }
        if (jSEngine != null) {
            return jSEngine.getNativeInstance();
        }
        return 0L;
    }

    public static Object cmd(com.alibaba.jsi.standard.d dVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b10151d", new Object[]{dVar, new Integer(i)}) : nativeCmd(contextNativePtr(dVar), i, 0L, 0L, null);
    }

    public static Object cmd(com.alibaba.jsi.standard.d dVar, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f2e94063", new Object[]{dVar, new Integer(i), new Long(j)}) : nativeCmd(contextNativePtr(dVar), i, j, 0L, null);
    }

    public static Object cmd(com.alibaba.jsi.standard.d dVar, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c06056", new Object[]{dVar, new Integer(i), objArr}) : nativeCmd(contextNativePtr(dVar), i, 0L, 0L, objArr);
    }

    public static Object cmd(com.alibaba.jsi.standard.d dVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6357ddd", new Object[]{dVar, new Integer(i), new Long(j), new Long(j2)}) : nativeCmd(contextNativePtr(dVar), i, j, j2, null);
    }

    public static Object cmd(com.alibaba.jsi.standard.d dVar, int i, long j, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4589f350", new Object[]{dVar, new Integer(i), new Long(j), objArr}) : nativeCmd(contextNativePtr(dVar), i, j, 0L, objArr);
    }

    public static Object cmd(com.alibaba.jsi.standard.d dVar, int i, long j, long j2, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e9f2bf96", new Object[]{dVar, new Integer(i), new Long(j), new Long(j2), objArr}) : nativeCmd(contextNativePtr(dVar), i, j, j2, objArr);
    }

    public static Object engineCmd(JSEngine jSEngine, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e04bea9c", new Object[]{jSEngine, new Integer(i), new Long(j)}) : nativeCmd(engineNativePtr(jSEngine), i, j, 0L, null);
    }

    public static Object engineCmd(JSEngine jSEngine, int i, long j, long j2, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b36b134f", new Object[]{jSEngine, new Integer(i), new Long(j), new Long(j2), objArr}) : nativeCmd(engineNativePtr(jSEngine), i, j, j2, objArr);
    }

    private static h unwrap(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("9bcbc3d3", new Object[]{obj}) : (h) obj;
    }

    private static com.alibaba.jsi.standard.d toContext(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.jsi.standard.d) ipChange.ipc$dispatch("b9afd61a", new Object[]{new Long(j)}) : com.alibaba.jsi.standard.d.a(j);
    }

    public static Object onCallFunction(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd3bd1e", new Object[]{obj, obj2}) : unwrap(obj).onCallFunction((a) obj2);
    }

    public static Object onCallConstructor(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cb1d2716", new Object[]{obj, obj2}) : unwrap(obj).onCallConstructor((a) obj2);
    }

    public static Object onGetProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("678ce357", new Object[]{obj, new Long(j), obj2, str}) : unwrap(obj).onGetProperty(toContext(j), (w) obj2, str);
    }

    public static void onSetProperty(Object obj, long j, Object obj2, String str, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32cbacb", new Object[]{obj, new Long(j), obj2, str, obj3});
        } else {
            unwrap(obj).onSetProperty(toContext(j), (w) obj2, str, (w) obj3);
        }
    }

    public static Object onGetNamedProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("57c72f62", new Object[]{obj, new Long(j), obj2, str}) : unwrap(obj).onGetNamedProperty(toContext(j), (w) obj2, str);
    }

    public static Object onSetNamedProperty(Object obj, long j, Object obj2, String str, Object obj3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eb3eca7a", new Object[]{obj, new Long(j), obj2, str, obj3}) : unwrap(obj).onSetNamedProperty(toContext(j), (w) obj2, str, (w) obj3);
    }

    public static int onQueryNamedProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5ed84f5", new Object[]{obj, new Long(j), obj2, str})).intValue() : unwrap(obj).onQueryNamedProperty(toContext(j), (w) obj2, str);
    }

    public static boolean onDeleteNamedProperty(Object obj, long j, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("265b9a47", new Object[]{obj, new Long(j), obj2, str})).booleanValue() : unwrap(obj).onDeleteNamedProperty(toContext(j), (w) obj2, str);
    }

    public static Object[] onEnumerateNamedProperty(Object obj, long j, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("4a39dab5", new Object[]{obj, new Long(j), obj2}) : unwrap(obj).onEnumerateNamedProperty(toContext(j), (w) obj2);
    }

    public static Object onGetIndexedProperty(Object obj, long j, Object obj2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("94bd6c1d", new Object[]{obj, new Long(j), obj2, new Integer(i)}) : unwrap(obj).onGetIndexedProperty(toContext(j), (w) obj2, i);
    }

    public static Object onSetIndexedProperty(Object obj, long j, Object obj2, int i, Object obj3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1e996e0d", new Object[]{obj, new Long(j), obj2, new Integer(i), obj3}) : unwrap(obj).onSetIndexedProperty(toContext(j), (w) obj2, i, (w) obj3);
    }

    public static int onQueryIndexedProperty(Object obj, long j, Object obj2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97826ab6", new Object[]{obj, new Long(j), obj2, new Integer(i)})).intValue() : unwrap(obj).onQueryIndexedProperty(toContext(j), (w) obj2, i);
    }

    public static boolean onDeleteIndexedProperty(Object obj, long j, Object obj2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff3e9ba6", new Object[]{obj, new Long(j), obj2, new Integer(i)})).booleanValue() : unwrap(obj).onDeleteIndexedProperty(toContext(j), (w) obj2, i);
    }

    public static Object[] onEnumerateIndexedProperty(Object obj, long j, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("d14828bd", new Object[]{obj, new Long(j), obj2}) : unwrap(obj).onEnumerateIndexedProperty(toContext(j), (w) obj2);
    }

    public static void onJSCallbackDetached(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eade9c2", new Object[]{obj});
        } else {
            unwrap(obj).onDetached();
        }
    }
}
