package com.taobao.orange.aidl;

import android.os.RemoteException;
import com.taobao.orange.aidl.ParcelableConfigListener;
import com.taobao.orange.c;
import com.taobao.orange.d;
import com.taobao.orange.f;
import com.taobao.orange.g;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeConfigListenerStub extends ParcelableConfigListener.Stub {
    private boolean append;
    private c mListener;

    static {
        kge.a(-491891229);
    }

    public OrangeConfigListenerStub(c cVar) {
        this.append = true;
        this.mListener = cVar;
    }

    public OrangeConfigListenerStub(c cVar, boolean z) {
        this.append = true;
        this.append = z;
        this.mListener = cVar;
    }

    public boolean isAppend() {
        return this.append;
    }

    @Override // com.taobao.orange.aidl.ParcelableConfigListener
    public void onConfigUpdate(String str, Map map) throws RemoteException {
        c cVar = this.mListener;
        if (cVar instanceof f) {
            ((f) cVar).onConfigUpdate(str);
        } else if (cVar instanceof g) {
            ((g) this.mListener).onConfigUpdate(str, Boolean.parseBoolean((String) ((HashMap) map).get("fromCache")));
        } else if (!(cVar instanceof d)) {
        } else {
            ((d) cVar).onConfigUpdate(str, (HashMap) map);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.mListener.equals(((OrangeConfigListenerStub) obj).mListener);
        }
        return false;
    }

    public int hashCode() {
        return this.mListener.hashCode();
    }
}
