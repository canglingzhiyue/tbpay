package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2040080882);
    }

    public String getIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return null;
    }

    public w onCallConstructor(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("5786263e", new Object[]{this, aVar});
        }
        return null;
    }

    public w onCallFunction(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
        }
        return null;
    }

    public void onDetached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa39278", new Object[]{this});
        }
    }

    public w onGetProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("7aea3b56", new Object[]{this, dVar, wVar, str});
        }
        wVar.a();
        return null;
    }

    public void onSetProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str, w wVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c173e482", new Object[]{this, dVar, wVar, str, wVar2});
            return;
        }
        wVar.a();
        wVar2.a();
    }

    public w onGetNamedProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("13e3db6b", new Object[]{this, dVar, wVar, str});
        }
        wVar.a();
        return null;
    }

    public w onSetNamedProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str, w wVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("8fdbd713", new Object[]{this, dVar, wVar, str, wVar2});
        }
        wVar.a();
        wVar2.a();
        return null;
    }

    public int onQueryNamedProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4c4bc72", new Object[]{this, dVar, wVar, str})).intValue();
        }
        wVar.a();
        return 0;
    }

    public boolean onDeleteNamedProperty(com.alibaba.jsi.standard.d dVar, w wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26dcfb04", new Object[]{this, dVar, wVar, str})).booleanValue();
        }
        wVar.a();
        return true;
    }

    public w[] onEnumerateNamedProperty(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w[]) ipChange.ipc$dispatch("bc7e775e", new Object[]{this, dVar, wVar});
        }
        wVar.a();
        return null;
    }

    public w onGetIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("24174676", new Object[]{this, dVar, wVar, new Integer(i)});
        }
        wVar.a();
        return null;
    }

    public w onSetIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar, int i, w wVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("e7ad3a40", new Object[]{this, dVar, wVar, new Integer(i), wVar2});
        }
        wVar.a();
        wVar2.a();
        return null;
    }

    public int onQueryIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53fbab99", new Object[]{this, dVar, wVar, new Integer(i)})).intValue();
        }
        wVar.a();
        return 0;
    }

    public boolean onDeleteIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a85b49", new Object[]{this, dVar, wVar, new Integer(i)})).booleanValue();
        }
        wVar.a();
        return true;
    }

    public w[] onEnumerateIndexedProperty(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w[]) ipChange.ipc$dispatch("cfd72c56", new Object[]{this, dVar, wVar});
        }
        wVar.a();
        return null;
    }
}
