package com.taobao.tao.messagekit.base.network;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;
import tb.jew;
import tb.kge;
import tb.olu;
import tb.omg;

/* loaded from: classes8.dex */
public class b implements jew<com.taobao.tao.messagekit.core.model.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<olu> f20779a;

    static {
        kge.a(-1132133986);
        kge.a(1964946585);
        f20779a = new SparseArray<>();
    }

    public static olu a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (olu) ipChange.ipc$dispatch("e665a753", new Object[]{new Integer(i)});
        }
        olu oluVar = f20779a.get(i);
        if (!omg.c() || oluVar != null) {
            return oluVar;
        }
        throw new Error("connection " + i + " not bind");
    }

    public static <T> void a(int i, olu.a<List<com.taobao.tao.messagekit.core.model.b>, T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e550936", new Object[]{new Integer(i), aVar});
            return;
        }
        olu a2 = a(i);
        if (a2 == null) {
            return;
        }
        a2.a(aVar);
    }

    public static <R> void a(int i, olu.b<olu.c<R>, List<com.taobao.tao.messagekit.core.model.b>> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e557d95", new Object[]{new Integer(i), bVar});
            return;
        }
        olu a2 = a(i);
        if (a2 == null) {
            return;
        }
        a2.a(bVar);
    }

    public static void a(olu oluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f826f5a0", new Object[]{oluVar});
        } else {
            f20779a.put(oluVar.d(), oluVar);
        }
    }

    public void a(com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
            return;
        }
        olu a2 = a(bVar.k);
        MsgLog.a("NetworkManager", "UpStream >", Integer.valueOf(bVar.k));
        if (a2 != null) {
            a2.a(bVar);
        } else {
            MsgLog.c("NetworkManager", "Connection", Integer.valueOf(bVar.k), "not found");
        }
    }

    @Override // tb.jew
    public /* synthetic */ void accept(com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b028bfab", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }
}
