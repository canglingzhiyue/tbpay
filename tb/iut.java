package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import de.greenrobot.event.EventBusException;
import de.greenrobot.event.c;
import java.util.HashSet;
import java.util.Set;
import tb.iul;

/* loaded from: classes6.dex */
public abstract class iut implements iul, ium {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Activity mActivity;
    private imn mCore;
    private final ium mParent;
    private final Set<String> mScopes;
    private final Set<iul> mChildren = new HashSet();
    private c mEventBus = null;
    private final Set<Object> mSubscribers = new HashSet();

    static {
        kge.a(-860926879);
        kge.a(-1747045540);
        kge.a(-969874032);
    }

    public abstract String getLogTag();

    @Override // tb.iul
    public String getScopeTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this});
        }
        return null;
    }

    public void onChildAdded(iul iulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9ea73a", new Object[]{this, iulVar});
        }
    }

    public void onChildRemoved(iul iulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816919da", new Object[]{this, iulVar});
        }
    }

    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        }
    }

    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
        }
    }

    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
        }
    }

    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
        }
    }

    public void onCtxStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c591371", new Object[]{this});
        }
    }

    public iut(Activity activity, ium iumVar) {
        this.mActivity = activity;
        this.mParent = iumVar;
        this.mCore = this.mParent.getCore();
        ium iumVar2 = this.mParent;
        int i = 0;
        if (iumVar2 instanceof iut) {
            iut iutVar = (iut) iumVar2;
            iutVar.addChild(this);
            String scopeTag = getScopeTag();
            this.mScopes = new HashSet(iutVar.getScopes().size() + (scopeTag != null ? 1 : i));
            this.mScopes.addAll(iutVar.getScopes());
            if (scopeTag == null) {
                return;
            }
            this.mScopes.add(scopeTag);
            return;
        }
        String scopeTag2 = getScopeTag();
        this.mScopes = new HashSet(scopeTag2 != null ? 1 : i);
        if (scopeTag2 == null) {
            return;
        }
        this.mScopes.add(scopeTag2);
    }

    @Override // tb.iul
    public void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        destroyComponent();
        ium iumVar = this.mParent;
        if (!(iumVar instanceof iut)) {
            return;
        }
        ((iut) iumVar).removeChild(this);
    }

    public final void addChild(iul iulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82114fb2", new Object[]{this, iulVar});
            return;
        }
        this.mChildren.add(iulVar);
        onChildAdded(iulVar);
    }

    public final void removeChild(iul iulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e171322f", new Object[]{this, iulVar});
            return;
        }
        this.mChildren.remove(iulVar);
        onChildRemoved(iulVar);
    }

    public final void destroyComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a20b12a", new Object[]{this});
            return;
        }
        if (this.mChildren.size() > 0) {
            for (iul iulVar : this.mChildren) {
                if (iulVar instanceof iut) {
                    ((iut) iulVar).destroyComponent();
                } else if (iulVar instanceof itd) {
                    ((itd) iulVar).x();
                }
            }
        }
        c obtainScopeEventBus = getRoot().obtainScopeEventBus();
        for (Object obj : this.mSubscribers) {
            obtainScopeEventBus.c(obj);
        }
        onComponentDestroy();
    }

    public final Set<String> getScopes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("65c13c8b", new Object[]{this}) : this.mScopes;
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this.mActivity;
    }

    @Override // tb.iul
    public final ium getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ium) ipChange.ipc$dispatch("5382cbde", new Object[]{this}) : this.mParent;
    }

    public final void postEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            getRoot().obtainScopeEventBus().d(obj);
        }
    }

    public final void subscribeEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204d3013", new Object[]{this, obj});
            return;
        }
        try {
            getRoot().obtainScopeEventBus().a(obj);
            this.mSubscribers.add(obj);
        } catch (EventBusException e) {
            c().b().a(getLogTag(), "register event throws exception", e, false);
        }
    }

    public final void unsubscribeEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ba62c", new Object[]{this, obj});
            return;
        }
        getRoot().obtainScopeEventBus().c(obj);
        this.mSubscribers.remove(obj);
    }

    public final boolean postScopeEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c9cf17", new Object[]{this, obj, str})).booleanValue();
        }
        iul findComponentOfScope = findComponentOfScope(str);
        if (findComponentOfScope == null) {
            logError("scope not found: " + str + " for: " + obj.toString());
            return false;
        }
        findComponentOfScope.obtainScopeEventBus().d(obj);
        return true;
    }

    public final boolean subscribeScopeEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ccdd541", new Object[]{this, obj, str})).booleanValue();
        }
        iul findComponentOfScope = findComponentOfScope(str);
        if (findComponentOfScope == null) {
            logError("scope not found: " + str + " for consumer: " + obj.toString());
            return false;
        }
        c obtainScopeEventBus = findComponentOfScope.obtainScopeEventBus();
        if (!obtainScopeEventBus.b(obj)) {
            obtainScopeEventBus.a(obj);
        }
        return true;
    }

    public final boolean unsubscribeScopeEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a319308", new Object[]{this, obj, str})).booleanValue();
        }
        iul findComponentOfScope = findComponentOfScope(str);
        if (findComponentOfScope == null) {
            logError("unregister scope not found:" + str + "for consumer" + obj.toString());
            return false;
        }
        findComponentOfScope.obtainScopeEventBus().c(obj);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb.iul] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tb.iul] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [tb.iul] */
    public iul findComponentOfScope(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("be9435dc", new Object[]{this, str});
        }
        iut iutVar = this;
        while (!StringUtils.equals(iutVar.getScopeTag(), str)) {
            ium parent = iutVar.getParent();
            if (parent instanceof iul) {
                iutVar = (iul) parent;
                continue;
            } else {
                iutVar = 0;
                continue;
            }
            if (iutVar == 0) {
                break;
            }
        }
        return iutVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb.iul] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [tb.iul] */
    public final <T> T findParentOfClass(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a801e27a", new Object[]{this, cls});
        }
        iut iutVar = this;
        do {
            ium parent = iutVar.getParent();
            if (cls.isInstance(parent)) {
                return cls.cast(parent);
            }
            if (parent instanceof iul) {
                iutVar = (iul) parent;
                continue;
            } else {
                iutVar = 0;
                continue;
            }
        } while (iutVar != 0);
        return null;
    }

    public iul getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("e346cb07", new Object[]{this});
        }
        iul iulVar = this;
        while (true) {
            ium parent = iulVar.getParent();
            if (!(parent instanceof iul)) {
                return iulVar;
            }
            iulVar = (iul) parent;
        }
    }

    @Override // tb.iul
    public final <T> T searchWidgetInSubTree(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac60b709", new Object[]{this, cls});
        }
        if (cls.isInstance(this)) {
            return cls.cast(this);
        }
        if (this.mChildren.isEmpty()) {
            return null;
        }
        for (iul iulVar : this.mChildren) {
            T t = (T) iulVar.searchWidgetInSubTree(cls);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final <T> T searchWidget(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("35160968", new Object[]{this, cls}) : (T) getRoot().searchWidgetInSubTree(cls);
    }

    @Override // tb.iul
    public final c obtainScopeEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cb3494d9", new Object[]{this});
        }
        if (this.mEventBus == null) {
            this.mEventBus = com.taobao.android.searchbaseframe.util.c.a();
        }
        return this.mEventBus;
    }

    @Override // tb.iul
    public final void onCtxPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690eaf2", new Object[]{this});
            return;
        }
        for (iul iulVar : this.mChildren) {
            iulVar.onCtxPauseInternal();
        }
        onCtxPause();
    }

    @Override // tb.iul
    public final void onCtxResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd57b79", new Object[]{this});
            return;
        }
        for (iul iulVar : this.mChildren) {
            iulVar.onCtxResumeInternal();
        }
        onCtxResume();
    }

    @Override // tb.iul
    public final void onCtxDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92298f6", new Object[]{this});
            return;
        }
        for (iul iulVar : this.mChildren) {
            iulVar.onCtxDestroyInternal();
        }
        onCtxDestroy();
    }

    @Override // tb.iul
    public void onCtxStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da57fdce", new Object[]{this});
            return;
        }
        for (iul iulVar : this.mChildren) {
            iulVar.onCtxStopInternal();
        }
        onCtxStop();
    }

    public final void logError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f57b0b5", new Object[]{this, str});
        } else {
            c().b().b(getLogTag(), str);
        }
    }

    public final void logWarn(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff976fb", new Object[]{this, str});
        } else {
            c().b().d(getLogTag(), str);
        }
    }

    public View findView(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i)}) : this.mActivity.findViewById(i);
    }

    @Override // tb.ium
    public final imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : this.mCore;
    }

    public final imn c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("1e695152", new Object[]{this}) : this.mCore;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : getClass().getSimpleName();
    }

    @Override // tb.iul
    public final void printTree(StringBuilder sb, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc8aa", new Object[]{this, sb, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append(toString());
        sb.append(":");
        sb.append(getScopeTag() != null ? getScopeTag() : "");
        sb.append('\n');
        if (this.mChildren.size() == 0) {
            return;
        }
        for (iul iulVar : this.mChildren) {
            iulVar.printTree(sb, i + 1);
        }
    }

    @Override // tb.iul
    public final boolean travel(iul.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f64c3738", new Object[]{this, aVar})).booleanValue();
        }
        if (!aVar.a(this)) {
            return false;
        }
        if (this.mChildren.size() != 0) {
            aVar.a();
            for (iul iulVar : this.mChildren) {
                if (!iulVar.travel(aVar)) {
                    return false;
                }
            }
            aVar.b();
        }
        return true;
    }

    public JSONObject dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this}) : new JSONObject();
    }
}
