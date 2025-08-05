package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import com.taobao.android.litecreator.sdk.editor.data.base.a;
import com.taobao.android.litecreator.sdk.editor.data.base.b;
import com.taobao.android.litecreator.sdk.editor.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes5.dex */
public abstract class hdz<T> implements v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Stack<T> f28573a = new Stack<>();
    private Stack<T> b = new Stack<>();
    private hes<T> c;

    static {
        kge.a(-776601244);
        kge.a(1014993005);
    }

    public hes<T> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hes) ipChange.ipc$dispatch("3d2f5502", new Object[]{this}) : this.c;
    }

    public void a(hes<T> hesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd17c02", new Object[]{this, hesVar});
        } else {
            this.c = hesVar;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            a(new her(new a()));
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.v
    public b<T> t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5ee5e7ec", new Object[]{this}) : this.c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [T] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    private T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        T a2 = t().a();
        ?? r1 = 0;
        if (a2 instanceof EditableBean) {
            r1 = (T) ((EditableBean) a2).mo940clone();
        }
        if (a2 instanceof List) {
            r1 = (T) new ArrayList();
            for (Object obj : (List) a2) {
                if (obj instanceof EditableBean) {
                    r1.add(((EditableBean) obj).mo940clone());
                }
            }
        }
        return (T) r1;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.b.push(a());
        this.f28573a.clear();
    }
}
