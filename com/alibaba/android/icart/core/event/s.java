package com.alibaba.android.icart.core.event;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class s extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-662806866);
    }

    public static /* synthetic */ bcb a(s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("a8d842c3", new Object[]{sVar}) : sVar.b;
    }

    public static /* synthetic */ bbz b(s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("d6b0dc49", new Object[]{sVar}) : sVar.f25791a;
    }

    public static /* synthetic */ bbz c(s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("48976a8", new Object[]{sVar}) : sVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        final String c = this.b.c();
        this.b.c("");
        this.f25791a.x().a(this.h);
        this.f25791a.a(true, (Map<String, String>) null, new jnv() { // from class: com.alibaba.android.icart.core.event.s.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                s.a(s.this).c(c);
                s.b(s.this).x().n();
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                final RecyclerView recyclerView = (RecyclerView) s.c(s.this).x().s();
                recyclerView.post(new Runnable() { // from class: com.alibaba.android.icart.core.event.s.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            recyclerView.scrollToPosition(0);
                        }
                    }
                });
            }
        });
    }
}
