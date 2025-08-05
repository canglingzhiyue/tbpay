package com.taobao.android.dinamic.expressionv2;

import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.DinamicASTNode;
import java.util.List;
import tb.fpa;
import tb.fpd;
import tb.fpq;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<String, DinamicASTNode> f11748a;

    static {
        kge.a(93805778);
        kge.a(414312971);
        f11748a = new LruCache<>(32);
    }

    public static Object a(String str, String str2, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("af1ccca0", new Object[]{str, str2, fpdVar});
        }
        DinamicASTNode dinamicASTNode = com.taobao.android.dinamic.f.f11749a ? f11748a.get(str) : null;
        if (dinamicASTNode == null) {
            Pair<List, List> a2 = new f().a(str);
            if (a2 != null) {
                a aVar = new a();
                aVar.a(fpdVar);
                DinamicASTNode a3 = aVar.a(a2);
                if (a3 != null) {
                    if (com.taobao.android.dinamic.f.f11749a) {
                        f11748a.put(str, a3);
                    }
                    Object a4 = a(a3, str, fpdVar);
                    if (a4 != null) {
                        return a4;
                    }
                } else {
                    fpa.a("build AST Tree error!");
                }
            } else {
                fpa.a("token error!");
            }
        } else {
            dinamicASTNode.a(fpdVar);
            Object a5 = a(dinamicASTNode, str, fpdVar);
            if (a5 != null && a5 != com.taobao.android.dinamic.f.NL) {
                return a5;
            }
        }
        return null;
    }

    private static Object a(DinamicASTNode dinamicASTNode, String str, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("be79f638", new Object[]{dinamicASTNode, str, fpdVar}) : dinamicASTNode.a();
    }

    public static void a(View view, String str, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a74a0a", new Object[]{view, str, fpdVar});
            return;
        }
        DinamicASTNode dinamicASTNode = null;
        if (com.taobao.android.dinamic.f.f11749a) {
            dinamicASTNode = f11748a.get(str);
        }
        if (dinamicASTNode == null) {
            Pair<List, List> a2 = new f().a(str);
            if (a2 == null) {
                return;
            }
            a aVar = new a();
            aVar.a(fpdVar);
            DinamicASTNode a3 = aVar.a(a2);
            if (a3 == null) {
                return;
            }
            if (com.taobao.android.dinamic.f.f11749a) {
                f11748a.put(str, a3);
            }
            a(view, a3);
            return;
        }
        dinamicASTNode.a(fpdVar);
        a(view, dinamicASTNode);
    }

    private static void a(View view, DinamicASTNode dinamicASTNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937f5a9c", new Object[]{view, dinamicASTNode});
        } else if (dinamicASTNode != null) {
            if (dinamicASTNode.f11745a == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod) {
                try {
                    ((d) dinamicASTNode).a(view);
                } catch (ClassCastException unused) {
                    fpa.d(com.taobao.android.dinamic.e.TAG, "root node class cast error!");
                }
            } else if (dinamicASTNode.f11745a == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeSerialBlock) {
                int size = dinamicASTNode.b.size();
                for (int i = 0; i < size; i++) {
                    DinamicASTNode dinamicASTNode2 = dinamicASTNode.b.get(i);
                    if (dinamicASTNode2.f11745a == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod) {
                        try {
                            ((d) dinamicASTNode2).a(view);
                        } catch (ClassCastException unused2) {
                            fpa.d(com.taobao.android.dinamic.e.TAG, "child node class cast error!");
                            return;
                        }
                    }
                }
            }
        }
    }

    public static DinamicASTNode[] b(View view, String str, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicASTNode[]) ipChange.ipc$dispatch("dc3fe4e0", new Object[]{view, str, fpdVar});
        }
        DinamicASTNode dinamicASTNode = com.taobao.android.dinamic.f.f11749a ? f11748a.get(str) : null;
        if (dinamicASTNode == null) {
            Pair<List, List> a2 = new f().a(str);
            if (a2 != null) {
                a aVar = new a();
                aVar.a(fpdVar);
                DinamicASTNode a3 = aVar.a(a2);
                if (a3 != null) {
                    if (com.taobao.android.dinamic.f.f11749a) {
                        f11748a.put(str, a3);
                    }
                    return b(view, a3);
                }
            }
            return null;
        }
        dinamicASTNode.a(fpdVar);
        return b(view, dinamicASTNode);
    }

    private static DinamicASTNode[] b(View view, DinamicASTNode dinamicASTNode) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicASTNode[]) ipChange.ipc$dispatch("fc1c9732", new Object[]{view, dinamicASTNode});
        }
        if (dinamicASTNode == null) {
            return null;
        }
        if (dinamicASTNode.f11745a == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod) {
            try {
                ((d) dinamicASTNode).c();
                return new DinamicASTNode[]{dinamicASTNode};
            } catch (ClassCastException unused) {
                fpa.d(com.taobao.android.dinamic.e.TAG, "root node class cast error!");
                return null;
            }
        } else if (dinamicASTNode.f11745a != DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeSerialBlock || (size = dinamicASTNode.b.size()) <= 0) {
            return null;
        } else {
            for (int i = 0; i < size; i++) {
                DinamicASTNode dinamicASTNode2 = dinamicASTNode.b.get(i);
                if (dinamicASTNode2 instanceof d) {
                    ((d) dinamicASTNode2).c();
                }
            }
            return (DinamicASTNode[]) dinamicASTNode.b.toArray(new DinamicASTNode[size]);
        }
    }

    public static void a(View view, String str, fpd fpdVar, fpq fpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5e0033", new Object[]{view, str, fpdVar, fpqVar});
            return;
        }
        try {
            DinamicASTNode[] b = b(view, str, fpdVar);
            if (b == null || b.length <= 0) {
                return;
            }
            for (int i = 0; i < b.length; i++) {
                com.taobao.android.dinamic.dinamic.d c = com.taobao.android.dinamic.e.c(b[i].d);
                if (c != null && (b[i] instanceof d)) {
                    c.a(view, ((d) b[i]).b(), fpdVar.e());
                }
            }
        } catch (Throwable unused) {
            fpdVar.c().b().a(com.taobao.android.dinamic.view.a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, fpqVar.f28098a);
        }
    }
}
