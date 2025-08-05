package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"setRecommendSwitch"})
/* loaded from: classes3.dex */
public class k extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public class a implements com.alibaba.wireless.aliprivacyext.recommendation.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.wireless.aliprivacyext.plugins.b f4244a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(com.alibaba.wireless.aliprivacyext.plugins.b bVar, Context context, String str) {
            this.f4244a = bVar;
            this.b = context;
            this.c = str;
        }

        @Override // com.alibaba.wireless.aliprivacyext.recommendation.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            k.a(k.this, this.f4244a, "调用成功", (Map) null);
            k.a(k.this, this.b, this.c, true, null);
        }

        @Override // com.alibaba.wireless.aliprivacyext.recommendation.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            com.alibaba.wireless.aliprivacy.c.a("SetRecommendSwitchApi", str);
            k.b(k.this, this.f4244a, com.alibaba.wireless.aliprivacyext.jsbridge.a.d, null);
            k.a(k.this, this.b, this.c, false, str);
        }
    }

    public static /* synthetic */ void a(k kVar, com.alibaba.wireless.aliprivacyext.plugins.b bVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d3dd1f", new Object[]{kVar, bVar, str, map});
        } else {
            kVar.a(bVar, str, map);
        }
    }

    public static /* synthetic */ void b(k kVar, com.alibaba.wireless.aliprivacyext.plugins.b bVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3850860", new Object[]{kVar, bVar, str, map});
        } else {
            kVar.b(bVar, str, map);
        }
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(k kVar, Context context, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5551f024", new Object[]{kVar, context, str, new Boolean(z), str2});
        } else {
            kVar.a(context, str, z, str2);
        }
    }

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        a(context, str2);
        JSONObject a2 = com.alibaba.wireless.aliprivacyext.f.a(str2);
        if (a2 == null) {
            a(context, str2, false, "param is null");
            b(bVar, "参数异常", null);
            return true;
        }
        boolean booleanValue = a2.getBoolean("switch").booleanValue();
        if (com.alibaba.wireless.aliprivacyext.recommendation.a.b(context)) {
            com.alibaba.wireless.aliprivacyext.recommendation.a.a(context, booleanValue);
            a(bVar, "调用成功", null);
            a(context, str2, true, (String) null);
            return true;
        }
        com.alibaba.wireless.aliprivacyext.recommendation.c.a().a(booleanValue, true, (com.alibaba.wireless.aliprivacyext.recommendation.d) new a(bVar, context, str2));
        return true;
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            TrackLog.trackModifyRecommendStatusLogStart(context, str, "CROJSBridge");
        }
    }

    private void a(Context context, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6258534", new Object[]{this, context, str, new Boolean(z), str2});
        } else {
            TrackLog.trackModifyRecommendStatusLogEnd(context, str, "CROJSBridge", z, str2);
        }
    }
}
