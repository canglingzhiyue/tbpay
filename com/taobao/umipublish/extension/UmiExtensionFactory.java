package com.taobao.umipublish.extension;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class UmiExtensionFactory implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private h mIUmiLifecycle = new k();
    private e mIRecordService = new l();
    private f mITnodeRegister = new m();
    private d mNavExtension = new j();

    static {
        kge.a(1960460494);
        kge.a(-446843967);
    }

    @Override // com.taobao.umipublish.extension.g
    public <T> T getExtension(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("57944325", new Object[]{this, cls});
        }
        if (cls == h.class) {
            return (T) this.mIUmiLifecycle;
        }
        if (cls == e.class) {
            return (T) this.mIRecordService;
        }
        if (cls == f.class) {
            return (T) this.mITnodeRegister;
        }
        if (cls != d.class) {
            return null;
        }
        return (T) this.mNavExtension;
    }
}
