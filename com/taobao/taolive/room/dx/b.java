package com.taobao.taolive.room.dx;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import tb.kge;
import tb.pkt;

/* loaded from: classes8.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile b d;

    static {
        kge.a(1279307358);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1642240928) {
            super.a((Context) objArr[0]);
            return null;
        } else if (hashCode == -83293931) {
            super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    @Override // com.taobao.taolive.room.dx.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "live";
    }

    public static b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("81573674", new Object[0]);
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    @Override // com.taobao.taolive.room.dx.a
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        super.a(context);
        if (!aa.ck()) {
            return;
        }
        pkt.c().a(context);
    }

    @Override // com.taobao.taolive.room.dx.a, com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        super.onSuccess(i, netResponse, netBaseOutDo, obj);
        if (!aa.ck()) {
            return;
        }
        pkt.c().onSuccess(i, netResponse, netBaseOutDo, obj);
    }

    @Override // com.taobao.taolive.room.dx.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        d = null;
        if (!aa.ck()) {
            return;
        }
        pkt.c().b();
    }

    public DinamicXEngine d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("fa9f483c", new Object[]{this}) : this.f21619a;
    }
}
