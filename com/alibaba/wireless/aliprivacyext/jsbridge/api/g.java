package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cga;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"openAuthSettings"})
/* loaded from: classes3.dex */
public class g extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public class a implements cga {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.wireless.aliprivacyext.plugins.b f4243a;

        public a(com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
            this.f4243a = bVar;
        }

        @Override // tb.cga
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
                return;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("action", "open_settings");
            g.a(g.this, this.f4243a, "调用成功", hashMap);
        }

        @Override // tb.cga
        public void a(Exception exc, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2d60db", new Object[]{this, exc, intent});
                return;
            }
            com.alibaba.wireless.aliprivacy.c.b("OpenSettingsApi", "OpenSettingsApi failed", exc);
            g.b(g.this, this.f4243a, com.alibaba.wireless.aliprivacyext.jsbridge.a.d, null);
        }
    }

    public static /* synthetic */ void a(g gVar, com.alibaba.wireless.aliprivacyext.plugins.b bVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe4761b", new Object[]{gVar, bVar, str, map});
        } else {
            gVar.a(bVar, str, map);
        }
    }

    public static /* synthetic */ void b(g gVar, com.alibaba.wireless.aliprivacyext.plugins.b bVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6595a15c", new Object[]{gVar, bVar, str, map});
        } else {
            gVar.b(bVar, str, map);
        }
    }

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        com.alibaba.wireless.aliprivacyext.c.a().a(context, new a(bVar));
        return true;
    }
}
