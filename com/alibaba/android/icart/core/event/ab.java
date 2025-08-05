package com.alibaba.android.icart.core.event;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bex;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class ab extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1715713473);
    }

    public static /* synthetic */ bcb a(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("4f91ac6b", new Object[]{abVar}) : abVar.b;
    }

    public static /* synthetic */ IDMComponent b(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("ab4cefdd", new Object[]{abVar}) : abVar.h;
    }

    public static /* synthetic */ bbz c(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("6a070e94", new Object[]{abVar}) : abVar.f25791a;
    }

    public static /* synthetic */ bbz d(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("f741c015", new Object[]{abVar}) : abVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        String string = c().getString("filterItem");
        final String c = this.b.c();
        if (string.equals(c)) {
            str = "";
            z = false;
        } else {
            str = string;
            z = true;
        }
        bbz bbzVar = this.f25791a;
        bex.a(bbzVar, "Page_ShoppingCart_TabCard_ShowAllGroup", "isOpen=" + z);
        this.b.c(str);
        this.f25791a.x().a(this.h);
        if (com.alibaba.android.ultron.trade.utils.e.a(Globals.getApplication()) && z) {
            com.alibaba.android.icart.core.widget.d.a(this.e, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21650));
        }
        this.f25791a.a(true, (Map<String, String>) null, new jnv() { // from class: com.alibaba.android.icart.core.event.ab.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z2, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z2), map});
                    return;
                }
                ab.a(ab.this).c(c);
                ab.c(ab.this).x().a(ab.b(ab.this));
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                final RecyclerView recyclerView = (RecyclerView) ab.d(ab.this).x().s();
                recyclerView.post(new Runnable() { // from class: com.alibaba.android.icart.core.event.ab.1.1
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
