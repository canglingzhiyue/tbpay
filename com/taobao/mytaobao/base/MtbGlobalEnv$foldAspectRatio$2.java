package com.taobao.mytaobao.base;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.gbg;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbGlobalEnv$foldAspectRatio$2 extends Lambda implements ruk<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv$foldAspectRatio$2 INSTANCE = new MtbGlobalEnv$foldAspectRatio$2();

    public MtbGlobalEnv$foldAspectRatio$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Float mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("b20f2348", new Object[]{this});
        }
        Float f = null;
        if (!c.q()) {
            return f;
        }
        Application application = Globals.getApplication();
        int q = l.q(application);
        if (q == 0) {
            return Float.valueOf(2.31f);
        }
        if (q != 2) {
            return f;
        }
        int b = gbg.b(application);
        return b != 0 ? Float.valueOf(gbg.c(application) / b) : f;
    }
}
