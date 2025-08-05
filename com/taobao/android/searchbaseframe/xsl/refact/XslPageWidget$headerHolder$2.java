package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.htm;
import tb.ruk;

/* loaded from: classes6.dex */
public final class XslPageWidget$headerHolder$2 extends Lambda implements ruk<htm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h $metaConfig;
    public final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslPageWidget$headerHolder$2(o oVar, h hVar) {
        super(0);
        this.this$0 = oVar;
        this.$metaConfig = hVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final htm mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htm) ipChange.ipc$dispatch("3b36c3e6", new Object[]{this}) : new htm(this.$metaConfig.X(), this.this$0);
    }
}
