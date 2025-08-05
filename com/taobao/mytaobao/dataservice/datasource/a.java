package com.taobao.mytaobao.dataservice.datasource;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/dataservice/datasource/FinishDataSchema;", "", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/tao/stream/MtopStreamFinishEvent;", p1.d, "", "p2", "(Lcom/taobao/tao/stream/MtopStreamFinishEvent;ILjava/lang/Object;)V", "getP1", "()I", "getP2", "()Ljava/lang/Object;", "getResponse", "()Lcom/taobao/tao/stream/MtopStreamFinishEvent;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.tao.stream.c f18368a;
    private final int b;
    private final Object c;

    static {
        kge.a(748225602);
    }

    public a(com.taobao.tao.stream.c cVar, int i, Object obj) {
        this.f18368a = cVar;
        this.b = i;
        this.c = obj;
    }

    public final com.taobao.tao.stream.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.stream.c) ipChange.ipc$dispatch("db956a05", new Object[]{this}) : this.f18368a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }
}
