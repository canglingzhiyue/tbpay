package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.weex_framework.util.a;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes5.dex */
public class gbz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28302a = true;
    private boolean b = true;
    private final Stack<gfx> c = new Stack<>();
    private final gha d;

    static {
        kge.a(-1525382129);
    }

    public gbz(gha ghaVar) {
        this.d = ghaVar;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f28302a = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        a(b());
        return this.f28302a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXExpressionVM{ mVarStack=" + this.c + '}';
    }

    public gfx a(DXRuntimeContext dXRuntimeContext, byte[] bArr, SparseArray<Object> sparseArray, ghg ghgVar, Map map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("bb169515", new Object[]{this, dXRuntimeContext, bArr, sparseArray, ghgVar, map});
        }
        if (bArr == null || bArr.length <= 0) {
            throw new IllegalStateException("DXExpressionVM: empty expression bytes");
        }
        a(dXRuntimeContext, bArr, bArr.length, sparseArray, ghgVar, map);
        if (this.c.size() != 1) {
            throw new IllegalStateException("DXExpressionVM: expression has error count return value");
        }
        return this.c.pop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x0a1f, code lost:
        if (r29.c.pop().I() != false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0a5f, code lost:
        if (r29.c.pop().I() == false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0a61, code lost:
        r5 = (r0 - r19) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0a67, code lost:
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0a68, code lost:
        r6 = r33;
     */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0e59  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0e5d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.dinamicx.DXRuntimeContext r30, byte[] r31, int r32, android.util.SparseArray<java.lang.Object> r33, tb.ghg r34, java.util.Map r35) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 3852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gbz.a(com.taobao.android.dinamicx.DXRuntimeContext, byte[], int, android.util.SparseArray, tb.ghg, java.util.Map):void");
    }

    private gfx a(DXRuntimeContext dXRuntimeContext, String str, ghg ghgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("215b3820", new Object[]{this, dXRuntimeContext, str, ghgVar}) : ghgVar.a(dXRuntimeContext, str).i();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!a()) {
        } else {
            fuw.d("nov_expr", str);
        }
    }

    private boolean a(gfx gfxVar, gfx gfxVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25b4e1a", new Object[]{this, gfxVar, gfxVar2})).booleanValue();
        }
        if (gfxVar2.d() == gfxVar.d()) {
            switch (gfxVar2.d()) {
                case 1:
                    return true;
                case 2:
                    if (gfxVar2.w() == gfxVar.w()) {
                        return true;
                    }
                    break;
                case 3:
                    if (gef.a(gfxVar2.A(), gfxVar.A()) == 0) {
                        return true;
                    }
                    break;
                case 4:
                    if (gfxVar2.E() == gfxVar.E()) {
                        return true;
                    }
                    break;
                case 5:
                    return gfxVar2.i().equals(gfxVar.i());
                case 6:
                case 7:
                case 8:
                case 9:
                    return gfxVar2.b(gfxVar);
                default:
                    throw new IllegalArgumentException("invalid type");
            }
        } else if (gfxVar2.K() == gfxVar.K()) {
            return true;
        }
        return false;
    }

    private gfx a(gfx gfxVar, gfx gfxVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("948d1946", new Object[]{this, gfxVar, gfxVar2, dXRuntimeContext});
        }
        switch (gfxVar.d()) {
            case 1:
                return gfx.e();
            case 2:
                if (!a(gfxVar2)) {
                    throw new IllegalStateException("get property on int is not allowed");
                }
                return gfxVar;
            case 3:
                if (!a(gfxVar2)) {
                    throw new IllegalStateException("get property on float is not allowed");
                }
                return gfxVar;
            case 4:
                if (!a(gfxVar2)) {
                    throw new IllegalStateException("get property on bool is not allowed");
                }
                return gfxVar;
            case 5:
                if (!gfxVar2.k() || !a.ATOM_length.equals(gfxVar2.i())) {
                    if (a(gfxVar2)) {
                        return gfxVar;
                    }
                    throw new IllegalStateException("get property on string is not allowed of key: " + gfxVar2.m());
                }
                return gfx.a(gfxVar.i().length());
            case 6:
                if (gfxVar2.k()) {
                    if (a(gfxVar2)) {
                        return gfxVar;
                    }
                    if (a.ATOM_length.equals(gfxVar2.i()) || "size".equals(gfxVar2.i())) {
                        return gfx.a(gfxVar.o().size());
                    }
                    return a(gfxVar.o(), (int) gfxVar2.y());
                } else if (gfxVar2.v()) {
                    return a(gfxVar.o(), gfxVar2.w());
                } else {
                    throw new IllegalStateException("get property on array is not allowed of key: " + gfxVar2.m());
                }
            case 7:
                if (gfxVar2.k()) {
                    if ("size".equals(gfxVar2.i())) {
                        return gfx.a(gfxVar.r().size());
                    }
                    gfx a2 = a(gfxVar.r(), gfxVar2.i());
                    return (!a2.h() || !a(gfxVar2)) ? a2 : gfxVar;
                }
                throw new IllegalStateException("get property object is not allowed of type: " + gfxVar2.a());
            case 8:
                if (!gfxVar2.k()) {
                    throw new IllegalStateException("get property on builtinObject is not allowed of type: " + gfxVar2.a());
                }
                return gfxVar.s().a(gfxVar2.i());
            case 9:
                throw new IllegalStateException("get property on function is not allowed");
            case 10:
                if (!gfxVar2.k()) {
                    throw new IllegalStateException("get property object is not allowed of type: " + gfxVar2.a());
                } else if ((gfxVar.J() instanceof DXRuntimeContext) && gfxVar2.J().toString().equals("data")) {
                    return gfx.a((Map<String, Object>) ((DXRuntimeContext) gfxVar.J()).e());
                } else {
                    ggx N = dXRuntimeContext.N();
                    if (N != null) {
                        Object a3 = N.a(gfxVar.J(), gfxVar2.J().toString());
                        return (a3 != null || !a(gfxVar2)) ? gfx.a(a3) : gfxVar;
                    }
                    throw new IllegalStateException("get property object is not allowed of type: " + gfxVar2.a());
                }
            default:
                throw new IllegalStateException("Unsupported type: " + gfxVar.d());
        }
    }

    private boolean a(gfx gfxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea2d00c3", new Object[]{this, gfxVar})).booleanValue() : gfxVar.k() && "value".equals(gfxVar.i());
    }

    private gfx a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("32756da6", new Object[]{this, map, str});
        }
        if (map == null) {
            return gfx.e();
        }
        return gfx.a(map.get(str));
    }

    private gfx a(List<Object> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("65eb2a23", new Object[]{this, list, new Integer(i)});
        }
        if (list == null) {
            return gfx.e();
        }
        return gfx.a(list.get(i));
    }

    private static boolean b() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!DinamicXEngine.j() || (listFiles = new File("/data/local/tmp/.expressionVM").listFiles()) == null) {
            return false;
        }
        for (File file : listFiles) {
            if (file.getName().contains(".printCode")) {
                return true;
            }
        }
        return false;
    }
}
