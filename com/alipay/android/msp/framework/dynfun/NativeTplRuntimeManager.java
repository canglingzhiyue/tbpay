package com.alipay.android.msp.framework.dynfun;

import android.util.Pair;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UtilsMig;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class NativeTplRuntimeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = true;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<TplIdentity, WeakReference<FBDocument>> f4706a = new ConcurrentHashMap<>();

    public static synchronized void registerTpl(TplIdentity tplIdentity, WeakReference<FBDocument> weakReference) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("703e1923", new Object[]{tplIdentity, weakReference});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "registerTpl", "id=" + tplIdentity + " ref=" + weakReference);
            if (tplIdentity == null) {
                return;
            }
            FBDocument fBDocument = (FBDocument) UtilsMig.deref(weakReference);
            if (fBDocument != null) {
                unregisterTpl(fBDocument);
            }
            f4706a.put(tplIdentity, weakReference);
            LogUtil.record(1, "NativeTplRuntimeManager", "registerTpl", "curr=" + f4706a);
        }
    }

    public static synchronized void unregisterTpl(TplIdentity tplIdentity) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4cb9d74", new Object[]{tplIdentity});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "id=".concat(String.valueOf(tplIdentity)));
            f4706a.remove(tplIdentity);
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "curr=" + f4706a);
        }
    }

    public static synchronized void unregisterTpl(FBDocument fBDocument) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f322242", new Object[]{fBDocument});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "doc=".concat(String.valueOf(fBDocument)));
            for (TplIdentity tplIdentity : f4706a.keySet()) {
                if (((FBDocument) UtilsMig.deref(f4706a.get(tplIdentity))) == fBDocument) {
                    f4706a.remove(tplIdentity);
                }
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "unregisterTpl", "curr=" + f4706a);
        }
    }

    public static synchronized void garbageRemoval(int i) {
        synchronized (NativeTplRuntimeManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0618fc5", new Object[]{new Integer(i)});
                return;
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "garbageRemoval", "bizCtxId=".concat(String.valueOf(i)));
            for (TplIdentity tplIdentity : b(TplIdentity.generateSpec(null, Integer.valueOf(i), null))) {
                f4706a.remove(tplIdentity);
            }
            for (TplIdentity tplIdentity2 : f4706a.keySet()) {
                if (((FBDocument) UtilsMig.deref(f4706a.get(tplIdentity2))) == null) {
                    f4706a.remove(tplIdentity2);
                }
            }
            LogUtil.record(1, "NativeTplRuntimeManager", "garbageRemoval", "curr=" + f4706a);
        }
    }

    public static Pair<TplIdentity, FBDocument> findOneTpl(TplIdentity tplIdentity) {
        FBDocument fBDocument;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a008eeaf", new Object[]{tplIdentity});
        }
        LogUtil.record(1, "NativeTplRuntimeManager", "findOneTpl", "spec=" + tplIdentity + ", curr=" + f4706a);
        TplIdentity a2 = a(tplIdentity);
        if (a2 == null || (fBDocument = (FBDocument) UtilsMig.deref(f4706a.get(a2))) == null) {
            return null;
        }
        LogUtil.record(1, "NativeTplRuntimeManager", "findOneTpl", "found=" + a2 + "," + fBDocument);
        return new Pair<>(a2, fBDocument);
    }

    public static List<Pair<TplIdentity, FBDocument>> findAllTpl(TplIdentity tplIdentity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6c81e7", new Object[]{tplIdentity});
        }
        LogUtil.record(1, "NativeTplRuntimeManager", "findAllTpl", "spec=" + tplIdentity + ", curr=" + f4706a);
        ArrayList arrayList = new ArrayList();
        List<TplIdentity> b = b(tplIdentity);
        if (b.isEmpty()) {
            return arrayList;
        }
        for (TplIdentity tplIdentity2 : b) {
            FBDocument fBDocument = (FBDocument) UtilsMig.deref(f4706a.get(tplIdentity2));
            if (fBDocument != null) {
                arrayList.add(new Pair(tplIdentity2, fBDocument));
            }
        }
        LogUtil.record(1, "NativeTplRuntimeManager", "findAllTpl", "found=".concat(String.valueOf(arrayList)));
        return arrayList;
    }

    private static TplIdentity a(TplIdentity tplIdentity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TplIdentity) ipChange.ipc$dispatch("dc6283e6", new Object[]{tplIdentity});
        }
        for (TplIdentity tplIdentity2 : f4706a.keySet()) {
            if (TplIdentity.matchSpec(tplIdentity, tplIdentity2)) {
                return tplIdentity2;
            }
        }
        return null;
    }

    private static List<TplIdentity> b(TplIdentity tplIdentity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5258521", new Object[]{tplIdentity});
        }
        ArrayList arrayList = new ArrayList();
        for (TplIdentity tplIdentity2 : f4706a.keySet()) {
            if (TplIdentity.matchSpec(tplIdentity, tplIdentity2)) {
                arrayList.add(tplIdentity2);
            }
        }
        return arrayList;
    }

    public static boolean drmEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c604402d", new Object[0])).booleanValue() : DynConstants.a();
    }
}
