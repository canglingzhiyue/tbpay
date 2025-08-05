package org.android.spdy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.sad;

/* loaded from: classes.dex */
public class SecurityGuardCacherImp implements QuicCacher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int XQC_SESSION_CACHE = 2;
    public static final int XQC_TOKEN_CACHE = 1;
    public static final int XQC_TRANS_PARA_CACHE = 3;
    private Class IDynamicDataStoreComponent;
    private Class SecurityGuardManager;
    private Object ddsComp;
    private Method getDynamicDataStoreComp;
    private Method getInstance;
    private Method getStringDDpEx;
    private Method putStringDDpEx;
    private Method removeStringDDpEx;
    private Object sgMgr;
    private final AtomicBoolean isInit = new AtomicBoolean(false);
    private volatile boolean init_ok = false;

    @Override // org.android.spdy.QuicCacher
    public synchronized void init(Context context) {
        if (this.init_ok) {
            return;
        }
        if (sad.x() && SpdyAgent.isInAllowLaunchTimePass(sad.H())) {
            return;
        }
        if (context == null) {
            context = SpdyAgent.getContext();
        }
        if (this.isInit.compareAndSet(false, true)) {
            this.SecurityGuardManager = Class.forName("com.taobao.wireless.security.sdk.SecurityGuardManager");
            this.getInstance = this.SecurityGuardManager.getDeclaredMethod("getInstance", Context.class);
            this.sgMgr = this.getInstance.invoke(null, context);
            if (this.sgMgr == null) {
                return;
            }
            this.getDynamicDataStoreComp = this.SecurityGuardManager.getDeclaredMethod("getDynamicDataStoreComp", new Class[0]);
            this.ddsComp = this.getDynamicDataStoreComp.invoke(this.sgMgr, new Object[0]);
            if (this.ddsComp == null) {
                return;
            }
            this.IDynamicDataStoreComponent = Class.forName("com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent");
            this.putStringDDpEx = this.IDynamicDataStoreComponent.getDeclaredMethod("putStringDDpEx", String.class, String.class, Integer.TYPE);
            this.getStringDDpEx = this.IDynamicDataStoreComponent.getDeclaredMethod("getStringDDpEx", String.class, Integer.TYPE);
            this.removeStringDDpEx = this.IDynamicDataStoreComponent.getDeclaredMethod("removeStringDDpEx", String.class, Integer.TYPE);
            this.init_ok = true;
        }
    }

    @Override // org.android.spdy.QuicCacher
    public boolean store(String str, String str2) {
        try {
            if (checkNotAllowUse()) {
                return false;
            }
            this.putStringDDpEx.invoke(this.ddsComp, str, str2, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // org.android.spdy.QuicCacher
    public byte[] load(String str) {
        String str2;
        try {
            if (!checkNotAllowUse() && (str2 = (String) this.getStringDDpEx.invoke(this.ddsComp, str, 0)) != null) {
                return str2.getBytes(android.taobao.util.b.ISO88591);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override // org.android.spdy.QuicCacher
    public void remove(String str) {
        try {
            if (checkNotAllowUse()) {
                return;
            }
            this.removeStringDDpEx.invoke(this.ddsComp, str, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkNotAllowUse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca60b54", new Object[]{this})).booleanValue();
        }
        if (sad.x()) {
            if (SpdyAgent.isInAllowLaunchTimePass(sad.H())) {
                return true;
            }
            if (!this.init_ok) {
                init(null);
            }
        }
        return !this.init_ok;
    }
}
