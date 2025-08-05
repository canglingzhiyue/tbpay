package com.taobao.themis.inside.adapter;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.themis.kernel.adapter.IMegaAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.o;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.als;
import tb.kge;
import tb.qqb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSMegaAdapter;", "Lcom/taobao/themis/kernel/adapter/IMegaAdapter;", "()V", "getPageFromAbilityContext", "Lcom/taobao/themis/kernel/page/ITMSPage;", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "Companion", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSMegaAdapter implements IMegaAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-1251635200);
        kge.a(1004828400);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.adapter.IMegaAdapter
    public ITMSPage getPageFromAbilityContext(als context) {
        f a2;
        qqb b;
        ITMSPage iTMSPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("5c50687e", new Object[]{this, context});
        }
        q.d(context, "context");
        ITMSPage iTMSPage2 = null;
        ITMSPage iTMSPage3 = null;
        try {
            View g = context.g();
            if (g instanceof WVUCWebView) {
                Object externalContext = ((WVUCWebView) g).getExternalContext(i.MEGA_BRIDGE_PAGE_KEY);
                if (!(externalContext instanceof ITMSPage)) {
                    externalContext = null;
                }
                iTMSPage3 = (ITMSPage) externalContext;
            }
            if (iTMSPage3 == null) {
                Object d = context.d();
                if (!(d instanceof HashMap)) {
                    d = null;
                }
                HashMap hashMap = (HashMap) d;
                Object obj = hashMap != null ? hashMap.get("instance") : null;
                if (obj instanceof p) {
                    Object tag = ((p) obj).getTag(i.MEGA_BRIDGE_PAGE_KEY);
                    if (!(tag instanceof ITMSPage)) {
                        tag = null;
                    }
                    iTMSPage = (ITMSPage) tag;
                } else if (obj instanceof WeexInstance) {
                    Object tag2 = ((WeexInstance) obj).getTag(i.MEGA_BRIDGE_PAGE_KEY);
                    if (!(tag2 instanceof ITMSPage)) {
                        tag2 = null;
                    }
                    iTMSPage = (ITMSPage) tag2;
                } else {
                    iTMSPage = null;
                }
                iTMSPage3 = iTMSPage;
            }
            if (iTMSPage3 == null) {
                Object c = context.c(i.MEGA_BRIDGE_PAGE_KEY);
                if (!(c instanceof ITMSPage)) {
                    c = null;
                }
                iTMSPage3 = (ITMSPage) c;
            }
            if (iTMSPage3 != null) {
                return iTMSPage3;
            }
            Context f = context.f().f();
            if (f != null && (a2 = o.a(f)) != null && (b = a2.b()) != null) {
                iTMSPage2 = b.c();
            }
            return iTMSPage2;
        } catch (Throwable th) {
            TMSLogger.b("TMSMegaAdapter", "getPageFromAbilityContext", th);
            return iTMSPage3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSMegaAdapter$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(490830664);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
