package tb;

import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode;
import com.taobao.android.gateway.dinamic.expressionv2.a;
import com.taobao.android.gateway.dinamic.expressionv2.f;
import java.util.List;

/* loaded from: classes.dex */
public class gmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<String, DinamicASTNode> f28376a;

    static {
        kge.a(1723018537);
        f28376a = new LruCache<>(32);
    }

    public static Object a(String str, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f8733b10", new Object[]{str, gmfVar});
        }
        DinamicASTNode dinamicASTNode = gkn.f28370a ? f28376a.get(str) : null;
        if (dinamicASTNode == null) {
            Pair<List, List> a2 = new f().a(str);
            if (a2 != null) {
                a aVar = new a();
                aVar.a(gmfVar);
                DinamicASTNode a3 = aVar.a(a2);
                if (a3 != null) {
                    if (gkn.f28370a) {
                        f28376a.put(str, a3);
                    }
                    Object a4 = a(a3, str, gmfVar);
                    if (a4 != null) {
                        return a4;
                    }
                } else {
                    com.taobao.android.gateway.util.a.a("build AST Tree error!");
                }
            } else {
                com.taobao.android.gateway.util.a.a("token error!");
                return str;
            }
        } else {
            dinamicASTNode.a(gmfVar);
            Object a5 = a(dinamicASTNode, str, gmfVar);
            if (a5 != null && a5 != gkn.NL) {
                return a5;
            }
        }
        return null;
    }

    private static Object a(DinamicASTNode dinamicASTNode, String str, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7763a593", new Object[]{dinamicASTNode, str, gmfVar}) : dinamicASTNode.a();
    }
}
