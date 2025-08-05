package com.alibaba.poplayer.trigger;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fki;
import tb.kge;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private h f3209a;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final f f3210a;

        static {
            kge.a(526412893);
            f3210a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9629a93c", new Object[0]) : f3210a;
        }
    }

    static {
        kge.a(-800778358);
    }

    /* renamed from: lambda$-lYMkXw43qsylsjBfOAaTVmvcMs */
    public static /* synthetic */ void m245lambda$lYMkXw43qsylsjBfOAaTVmvcMs(f fVar, String str, String str2, boolean z) {
        fVar.b(str, str2, z);
    }

    /* renamed from: lambda$FXffeKbBJ73jRqT-Vog_4qUUkxE */
    public static /* synthetic */ void m246lambda$FXffeKbBJ73jRqTVog_4qUUkxE(f fVar, JSONObject jSONObject) {
        fVar.b(jSONObject);
    }

    public static /* synthetic */ void lambda$fatcqBmLRVqJuToILuJkSEsgzUQ(f fVar, BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, fki fkiVar) {
        fVar.b(baseConfigItem, str, str2, jSONObject, fkiVar);
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9629a93c", new Object[0]) : a.a();
    }

    private f() {
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f299534", new Object[]{this, hVar});
        } else {
            this.f3209a = hVar;
        }
    }

    public void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.f3209a == null) {
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$f$FXffeKbBJ73jRqT-Vog_4qUUkxE
                @Override // java.lang.Runnable
                public final void run() {
                    f.m246lambda$FXffeKbBJ73jRqTVog_4qUUkxE(f.this, jSONObject);
                }
            });
        }
    }

    public /* synthetic */ void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        try {
            this.f3209a.a(jSONObject.getString(h.KEY_URI_SET), jSONObject.getString(h.KEY_INDEX_MAP), jSONObject.getString(h.KEY_NO_ALG_FILTER_MAP), jSONObject.getJSONObject(h.KEY_TRACK_MAP), jSONObject.getString("traceId"), jSONObject.getLongValue(h.KEY_DEAL_START_TIME), jSONObject.getLongValue(h.KEY_DEAL_END_TIME), jSONObject.getLongValue(h.KEY_SDK_WAIT_TIME), false);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerNotifyTrigger.triggerPreDeal.error", th);
        }
    }

    public void a(final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        } else if (this.f3209a == null) {
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$f$-lYMkXw43qsylsjBfOAaTVmvcMs
                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f.m245lambda$lYMkXw43qsylsjBfOAaTVmvcMs(f.this, str, str2, z);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552009f7", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            this.f3209a.a(str, str2, "", z, false);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerNotifyTrigger.triggerSubPageSwitch.error", th);
        }
    }

    public void a(final BaseConfigItem baseConfigItem, final String str, final String str2, final JSONObject jSONObject, final fki fkiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998bd45a", new Object[]{this, baseConfigItem, str, str2, jSONObject, fkiVar});
        } else if (baseConfigItem == null || this.f3209a == null) {
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$f$fatcqBmLRVqJuToILuJkSEsgzUQ
                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$fatcqBmLRVqJuToILuJkSEsgzUQ(f.this, baseConfigItem, str, str2, jSONObject, fkiVar);
                }
            });
        }
    }

    public /* synthetic */ void b(BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, fki fkiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98d09b", new Object[]{this, baseConfigItem, str, str2, jSONObject, fkiVar});
            return;
        }
        try {
            this.f3209a.a(baseConfigItem, str, str2, jSONObject, fkiVar);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerNotifyTrigger.triggerSubPageSwitch.error", th);
        }
    }
}
