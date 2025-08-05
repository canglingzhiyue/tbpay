package com.taobao.mytaobao.dataservice.datasource;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/mytaobao/dataservice/datasource/ReceiveDataSchema;", "", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/tao/stream/MtopStreamResponse;", p1.d, "Lmtopsdk/mtop/domain/BaseOutDo;", "p2", "", "p3", "(Lcom/taobao/tao/stream/MtopStreamResponse;Lmtopsdk/mtop/domain/BaseOutDo;ILjava/lang/Object;)V", "getP1", "()Lmtopsdk/mtop/domain/BaseOutDo;", "getP2", "()I", "getP3", "()Ljava/lang/Object;", "getResponse", "()Lcom/taobao/tao/stream/MtopStreamResponse;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.tao.stream.d f18374a;
    private final BaseOutDo b;
    private final int c;
    private final Object d;

    static {
        kge.a(1639602250);
    }

    public f(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        this.f18374a = dVar;
        this.b = baseOutDo;
        this.c = i;
        this.d = obj;
    }

    public final com.taobao.tao.stream.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.stream.d) ipChange.ipc$dispatch("db956a24", new Object[]{this}) : this.f18374a;
    }

    public final BaseOutDo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseOutDo) ipChange.ipc$dispatch("507947b3", new Object[]{this}) : this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public final Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : this.d;
    }
}
