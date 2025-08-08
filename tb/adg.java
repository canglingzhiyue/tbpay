package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class adg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<Pair<a, Object>> f25265a = new CopyOnWriteArrayList();
    private List<Pair<a, Object>> b = new CopyOnWriteArrayList();

    static {
        kge.a(-848121259);
    }

    public void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258ef415", new Object[]{this, context, aVar});
        } else if (aVar.i) {
            c(context, aVar);
        } else {
            b(context, aVar);
        }
    }

    public Object a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1dc156b5", new Object[]{this, aVar});
        }
        if (aVar.i) {
            return f(aVar);
        }
        return e(aVar);
    }

    public Object c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("adc01373", new Object[]{this, aVar});
        }
        if (aVar.i) {
            return h(aVar);
        }
        return g(aVar);
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fd99de", new Object[]{this, aVar});
        } else if (aVar.i) {
            j(aVar);
        } else {
            i(aVar);
        }
    }

    private void b(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b58374", new Object[]{this, context, aVar});
            return;
        }
        int i = 0;
        for (Pair<a, Object> pair : this.f25265a) {
            if (pair != null && a.a((a) pair.first, aVar)) {
                i++;
            }
        }
        if (i >= aVar.c) {
            jqg.b("UltronTradeHybridPreRenderPool.generateInstance", "currentCount beyond maxCount");
            return;
        }
        for (int i2 = 0; i2 < aVar.c - i; i2++) {
            String a2 = adh.a(context, aVar);
            if (StringUtils.isEmpty(a2)) {
                jqg.b("UltronTradeHybridPreRenderPool.generateInstance", "generatePreRenderInstance failed,count:" + i2);
            } else {
                MUSDKInstance a3 = f.a().a(a2, true);
                if (a3 == null) {
                    jqg.b("UltronTradeHybridPreRenderPool.generateInstance", "getInstanceByPreRenderId failed,count:" + i2);
                } else {
                    abn abnVar = new abn(a3);
                    a3.registerRenderListener(abnVar);
                    a3.setTag("bizLifecycleListener", abnVar);
                    this.f25265a.add(new Pair<>(aVar, a3));
                }
            }
        }
    }

    private void c(Context context, a aVar) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dc12d3", new Object[]{this, context, aVar});
            return;
        }
        int i = 0;
        for (Pair<a, Object> pair : this.b) {
            if (pair != null && a.a((a) pair.first, aVar)) {
                i++;
            }
        }
        if (i >= aVar.c) {
            jqg.b("UltronTradeHybridPreRenderPool.asyncGenerateInstance", "currentCount beyond maxCount");
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true) && (a2 = adh.a(context)) > 0) {
            i3 = a2;
        }
        for (int i4 = 0; i4 < aVar.c - i; i4++) {
            f.a().a(context, i2, i3, aVar, (CopyOnWriteArrayList) this.b);
        }
    }

    private Object e(a aVar) {
        Pair<a, Object> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3dbed031", new Object[]{this, aVar});
        }
        Iterator<Pair<a, Object>> it = this.f25265a.iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = it.next();
            if (pair != null && a.a((a) pair.first, aVar)) {
                break;
            }
        }
        if (pair == null) {
            return null;
        }
        this.f25265a.remove(pair);
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof MUSDKInstance)) {
            return obj;
        }
        jqg.b("UltronTradeHybridPreRenderPool.getInstance", "invalid instance");
        return null;
    }

    private Object f(a aVar) {
        Pair<a, Object> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("85be2e90", new Object[]{this, aVar});
        }
        Iterator<Pair<a, Object>> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = it.next();
            if (pair != null && a.a((a) pair.first, aVar)) {
                break;
            }
        }
        if (pair == null) {
            jqg.b("UltronTradeHybridPreRenderPool.getAsyncInstance", "invalid currentPair");
            return null;
        }
        this.b.remove(pair);
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof p)) {
            return obj;
        }
        jqg.b("UltronTradeHybridPreRenderPool.getAsyncInstance", "invalid instance");
        return null;
    }

    private Object g(a aVar) {
        Pair<a, Object> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cdbd8cef", new Object[]{this, aVar});
        }
        Iterator<Pair<a, Object>> it = this.f25265a.iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = it.next();
            if (pair != null && a.a((a) pair.first, aVar)) {
                break;
            }
        }
        if (pair == null) {
            return null;
        }
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof MUSDKInstance)) {
            return obj;
        }
        jqg.b("UltronTradeHybridPreRenderPool.getBackgroundInstance", "invalid instance");
        return null;
    }

    private Object h(a aVar) {
        Pair<a, Object> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("15bceb4e", new Object[]{this, aVar});
        }
        Iterator<Pair<a, Object>> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = it.next();
            if (pair != null && a.a((a) pair.first, aVar)) {
                break;
            }
        }
        if (pair == null) {
            jqg.b("UltronTradeHybridPreRenderPool.getAsyncBackgroundInstance", "invalid currentPair");
            return null;
        }
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof p)) {
            return obj;
        }
        jqg.b("UltronTradeHybridPreRenderPool.getAsyncBackgroundInstance", "invalid instance");
        return null;
    }

    private void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347fc25", new Object[]{this, aVar});
            return;
        }
        ArrayList<Pair> arrayList = new ArrayList();
        for (Pair<a, Object> pair : this.f25265a) {
            if (pair != null && a.a((a) pair.first, aVar)) {
                arrayList.add(pair);
            }
        }
        for (Pair pair2 : arrayList) {
            this.f25265a.remove(pair2);
            if (pair2.second instanceof String) {
                MUSDKInstance a2 = f.a().a((String) pair2.second, true);
                if (a2 != null) {
                    a2.destroy();
                }
            } else if (pair2.second instanceof MUSDKInstance) {
                ((MUSDKInstance) pair2.second).destroy();
            }
        }
    }

    private void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0977e6", new Object[]{this, aVar});
            return;
        }
        ArrayList<Pair> arrayList = new ArrayList();
        for (Pair<a, Object> pair : this.b) {
            if (pair != null && a.a((a) pair.first, aVar)) {
                arrayList.add(pair);
            }
        }
        for (Pair pair2 : arrayList) {
            this.b.remove(pair2);
            if (pair2.second instanceof String) {
                MUSDKInstance a2 = f.a().a((String) pair2.second, true);
                if (a2 != null) {
                    a2.destroy();
                }
            } else if (pair2.second instanceof MUSDKInstance) {
                ((MUSDKInstance) pair2.second).destroy();
            }
        }
    }
}
