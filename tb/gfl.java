package tb;

import android.util.Pair;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.c;
import com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class gfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c<gfn> f28311a;
    public com.taobao.android.dinamicx.model.b<gfm> b;
    public SparseArray<byte[]> c;
    public SparseArray<Object> d;
    public Map<String, gfq> g;
    public gfo h;
    public Map<Integer, List<DXExtensionSectionLoader.a>> j;
    public List<gfh> l;
    public Map<String, ggk> e = Collections.synchronizedMap(new LinkedHashMap());
    public List<gfi> f = new ArrayList();
    public b i = new b();
    public a k = new a();
    public float m = 1.0f;
    public float n = 1.0f;
    public int o = 0;
    public int p = 0;
    public float q = 0.0f;
    public float r = 0.0f;
    public float s = 0.0f;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public DXNativeLogicEngine f28312a;

        static {
            kge.a(-1281208235);
        }

        public a() {
        }
    }

    /* loaded from: classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public List<Pair<String, byte[]>> f28313a;

        static {
            kge.a(-1153313246);
        }

        public b() {
        }
    }

    static {
        kge.a(1924721933);
    }

    public c<gfn> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("df391b0f", new Object[]{this}) : this.f28311a;
    }

    public List<Pair<String, byte[]>> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.i.f28313a;
    }

    public void a(List<Pair<String, byte[]>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.i.f28313a = list;
        }
    }

    public void a(c<gfn> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856047cf", new Object[]{this, cVar});
        } else {
            this.f28311a = cVar;
        }
    }

    public com.taobao.android.dinamicx.model.b<gfm> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("f87970f2", new Object[]{this}) : this.b;
    }

    public void a(com.taobao.android.dinamicx.model.b<gfm> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855fd370", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public SparseArray<byte[]> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("6b9778ee", new Object[]{this}) : this.c;
    }

    public void a(SparseArray<byte[]> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e00dcb", new Object[]{this, sparseArray});
        } else {
            this.c = sparseArray;
        }
    }

    public SparseArray<Object> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("6c44248d", new Object[]{this}) : this.d;
    }

    public void b(SparseArray<Object> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac8d60c", new Object[]{this, sparseArray});
        } else {
            this.d = sparseArray;
        }
    }

    public void a(Map<Integer, List<DXExtensionSectionLoader.a>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public void b(List<gfh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.l = list;
        }
    }

    public List<gfh> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.l;
    }

    public List<DXExtensionSectionLoader.a> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        Map<Integer, List<DXExtensionSectionLoader.a>> map = this.j;
        if (map != null) {
            return map.get(1);
        }
        return null;
    }

    public Map<String, ggk> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.e;
    }

    public void b(Map<String, ggk> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public List<gfi> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.f;
    }

    public void c(List<gfi> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public DXNativeLogicEngine j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXNativeLogicEngine) ipChange.ipc$dispatch("3b9cfdfd", new Object[]{this}) : this.k.f28312a;
    }

    public void a(DXNativeLogicEngine dXNativeLogicEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781e060", new Object[]{this, dXNativeLogicEngine});
        } else {
            this.k.f28312a = dXNativeLogicEngine;
        }
    }

    public gfl a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfl) ipChange.ipc$dispatch("1f426fcd", new Object[]{this, new Boolean(z)});
        }
        gfl gflVar = new gfl();
        gflVar.f28311a = this.f28311a;
        gflVar.b = this.b;
        gflVar.c = this.c;
        gflVar.d = this.d;
        gflVar.f = this.f;
        gflVar.g = this.g;
        gflVar.h = this.h;
        gflVar.i = this.i;
        gflVar.j = this.j;
        gflVar.k = this.k;
        Map<String, ggk> map = this.e;
        if (map == null) {
            return gflVar;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            gflVar.e = linkedHashMap;
            for (Map.Entry<String, ggk> entry : this.e.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().a());
            }
            if (this.l != null) {
                ArrayList arrayList = new ArrayList();
                gflVar.l = arrayList;
                for (gfh gfhVar : this.l) {
                    arrayList.add(gfhVar.a());
                }
            }
        } else {
            gflVar.e = map;
            gflVar.l = this.l;
        }
        gflVar.m = this.m;
        gflVar.n = this.n;
        gflVar.o = this.o;
        gflVar.p = this.p;
        gflVar.q = this.q;
        gflVar.r = this.r;
        gflVar.s = this.s;
        return gflVar;
    }

    public Map<String, gfq> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.g;
    }

    public void c(Map<String, gfq> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public gfo l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfo) ipChange.ipc$dispatch("63a71ec3", new Object[]{this}) : this.h;
    }

    public float m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158664", new Object[]{this})).floatValue() : this.m;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public float n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de5", new Object[]{this})).floatValue() : this.n;
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.n = f;
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.o;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.p;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public float q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de468", new Object[]{this})).floatValue() : this.q;
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.q = f;
        }
    }

    public float r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbe9", new Object[]{this})).floatValue() : this.r;
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
        } else {
            this.r = f;
        }
    }

    public float s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136a", new Object[]{this})).floatValue() : this.s;
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f)});
        } else {
            this.s = f;
        }
    }
}
