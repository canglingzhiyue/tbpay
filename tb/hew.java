package tb;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.view.View;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.af;
import com.taobao.android.litecreator.sdk.editor.ai;
import com.taobao.android.litecreator.sdk.editor.v;
import com.taobao.android.litecreator.sdk.editor.x;
import com.taobao.android.litecreator.sdk.framework.container.ut.a;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ios;

/* loaded from: classes5.dex */
public abstract class hew {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ai o;
    public af p;
    public Map<String, MutableLiveData> q = new HashMap();
    public Context r;

    static {
        kge.a(1201315502);
    }

    public abstract hew C();

    public abstract a K();

    public abstract void L();

    public abstract void M();

    public abstract ios.a N();

    public abstract boolean O();

    public abstract String P();

    public abstract boolean Q();

    public abstract void Y_();

    public abstract void Z_();

    public abstract void a(View view, heu heuVar);

    public abstract void a(LCBubble lCBubble, LCBubble.b bVar);

    public abstract void a(CharSequence charSequence);

    public abstract void a(hez hezVar);

    public abstract boolean b(View view);

    public abstract void d(boolean z);

    public abstract MutableLiveData f(String str);

    public abstract void g(String str);

    public Context G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4376de46", new Object[]{this}) : this.r;
    }

    public x a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("55650e6a", new Object[]{this});
        }
        ai aiVar = this.o;
        if (aiVar != null) {
            return aiVar.f();
        }
        return null;
    }

    public ai H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ai) ipChange.ipc$dispatch("bdab3545", new Object[]{this}) : this.o;
    }

    public af I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (af) ipChange.ipc$dispatch("af54db07", new Object[]{this}) : this.p;
    }

    public <T extends v> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e493a19", new Object[]{this, cls});
        }
        x a2 = a();
        boolean z = a2 == null;
        u.a(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL onDestroy, LCContext ,imageEditor==null is=" + z);
        return a2 != null ? a2 : I();
    }

    public <T extends v> List<T> b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2da1953", new Object[]{this, cls});
        }
        ArrayList arrayList = new ArrayList();
        af afVar = this.p;
        if (afVar != null) {
            arrayList.add(afVar);
        } else {
            ai aiVar = this.o;
            if (aiVar != null) {
                arrayList.addAll(aiVar.h());
            }
        }
        return arrayList;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4284fc4", new Object[]{this})).intValue();
        }
        ai aiVar = this.o;
        if (aiVar == null) {
            return 0;
        }
        return aiVar.e();
    }

    public void a(ai aiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eecac6", new Object[]{this, aiVar});
        } else {
            this.o = aiVar;
        }
    }

    public void e(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4819e4ad", new Object[]{this, afVar});
        } else {
            this.p = afVar;
        }
    }
}
