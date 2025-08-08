package com.taobao.android.xsearchplugin.muise;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import tb.kge;

/* loaded from: classes6.dex */
public class t implements Observer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_VALUE_OBSERVER = "XSValueObserver";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.weex_framework.p f16269a;
    private final HashSet<Observable> b = new HashSet<>();

    static {
        kge.a(-1304509823);
        kge.a(1647858998);
    }

    public t(com.taobao.android.weex_framework.p pVar) {
        this.f16269a = pVar;
    }

    public static t a(com.taobao.android.weex_framework.p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("161df12d", new Object[]{pVar, new Boolean(z)});
        }
        t tVar = (t) pVar.getTag(KEY_VALUE_OBSERVER);
        if (tVar != null || !z) {
            return tVar;
        }
        t tVar2 = new t(pVar);
        pVar.setTag(KEY_VALUE_OBSERVER, tVar2);
        return tVar2;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
        } else if (!(observable instanceof r) || !(obj instanceof JSONObject)) {
        } else {
            this.b.add(observable);
            this.f16269a.sendInstanceMessage("MUISE", StringUtils.equals(((r) observable).a(), "page") ? "pageStorageChanged" : "observableMapValue", (JSONObject) obj);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Iterator<Observable> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().deleteObserver(this);
        }
    }
}
