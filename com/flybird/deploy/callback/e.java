package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.a;
import tb.cum;

/* loaded from: classes4.dex */
public interface e {
    public static final e alwaysFalse = new a();

    /* loaded from: classes4.dex */
    public static final class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.flybird.deploy.callback.e
        public void askUserShouldRetry(cum<Boolean, Void, Void> cumVar, a.C0256a c0256a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a681cd29", new Object[]{this, cumVar, c0256a});
            } else {
                cumVar.apply(Boolean.FALSE);
            }
        }
    }

    void askUserShouldRetry(cum<Boolean, Void, Void> cumVar, a.C0256a c0256a);
}
