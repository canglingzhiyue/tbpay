package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.f;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.Arrays;
import java.util.HashMap;

@AURAExtensionImpl(code = "tbbuy.impl.event.verifyIdentity")
/* loaded from: classes6.dex */
public final class icx extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "verifyIdentity";

    /* renamed from: a  reason: collision with root package name */
    private aqs f28914a;

    /* loaded from: classes6.dex */
    public interface a {
        void verify(Context context, String str, b bVar);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(boolean z, String str, String str2);
    }

    static {
        kge.a(159704849);
    }

    public static /* synthetic */ Object ipc$super(icx icxVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "verifyIdentity";
    }

    public static /* synthetic */ aqs a(icx icxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("93aabbe9", new Object[]{icxVar}) : icxVar.f28914a;
    }

    public static /* synthetic */ void a(icx icxVar, Context context, AURAEventIO aURAEventIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0d5444", new Object[]{icxVar, context, aURAEventIO, str});
        } else {
            icxVar.a(context, aURAEventIO, str);
        }
    }

    public static /* synthetic */ void a(icx icxVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ec3fd8", new Object[]{icxVar, context, str});
        } else {
            icxVar.a(context, str);
        }
    }

    public static /* synthetic */ void a(icx icxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c021b69a", new Object[]{icxVar, new Boolean(z)});
        } else {
            icxVar.a(z);
        }
    }

    @Override // tb.arv
    public void b(final AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        final Context e = b().e();
        if (e == null) {
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null || TextUtils.isEmpty(c.getString(BaseJsExecutor.NAME_VERIFY_TOKEN))) {
            a(e, com.alibaba.ability.localization.b.a(R.string.purchase_taobao_app_1029_1_19077));
            return;
        }
        final String string = c.getString(BaseJsExecutor.NAME_VERIFY_TOKEN);
        a aVar = (a) AliAdaptServiceManager.getInstance().findAliAdaptService(a.class);
        if (aVar == null) {
            arc.a().c("AliBuyRPVerifyEvent", "innerHandleEvent", "verify service is null");
            a(e, com.alibaba.ability.localization.b.a(R.string.purchase_taobao_app_1029_1_19077));
            return;
        }
        a(true);
        try {
            aVar.verify(e, string, new b() { // from class: tb.icx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.icx.b
                public void a(boolean z, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
                        return;
                    }
                    icx.a(icx.this, false);
                    if (z) {
                        icx.a(icx.this, e, aURAEventIO, string);
                        return;
                    }
                    icx.a(icx.this, e, str2);
                    icx.a(icx.this).a(new com.alibaba.android.aura.b(1, "AURAEventServiceDomain", str, str2));
                }
            });
        } catch (Exception unused) {
            a(false);
        }
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f28914a = aqsVar;
    }

    private void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (!(context instanceof Activity)) {
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: tb.icx.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBToast.makeText(context, str, 1L).show();
                    }
                }
            });
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        f fVar = (f) b().a(dtl.USERDATA_KEY_STATUS_MANAGER, f.class);
        if (fVar == null) {
            return;
        }
        if (z) {
            fVar.a((Boolean) false);
        } else {
            fVar.a();
        }
    }

    private void a(Context context, final AURAEventIO aURAEventIO, String str) {
        AURARenderComponent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb52596", new Object[]{this, context, aURAEventIO, str});
            return;
        }
        final s b2 = b().b();
        if (b2 == null || (d = aURAEventIO.getEventModel().d()) == null) {
            return;
        }
        b2.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(a(d, str))), new aqq() { // from class: tb.icx.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str2, Object... objArr) {
                if (str2.hashCode() == 112764847) {
                    super.a((c) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                super.a(cVar);
                com.alibaba.android.aura.service.event.c.a(b2, "adjust", aURAEventIO.getEventModel());
            }
        });
        a(context, com.alibaba.ability.localization.b.a(R.string.purchase_taobao_app_1029_1_19069));
    }

    private com.alibaba.android.umf.datamodel.service.rule.a a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("11c615ae", new Object[]{this, aURARenderComponent, str});
        }
        com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.b = aURARenderComponent.key;
        aVar.c.f2137a = new HashMap();
        aVar.c.f2137a.put(BaseJsExecutor.NAME_VERIFY_TOKEN, str);
        aVar.d.f2137a = new HashMap();
        aVar.d.b = new HashMap();
        aVar.d.c = new HashMap();
        if (aURARenderComponent.data != null) {
            if (aURARenderComponent.data.fields != null) {
                aVar.d.f2137a.putAll(aURARenderComponent.data.fields);
            }
            if (aURARenderComponent.data.events != null) {
                aVar.d.b.putAll(aURARenderComponent.data.events);
            }
            if (aURARenderComponent.data.localFields != null) {
                aVar.d.c.putAll(aURARenderComponent.data.localFields);
            }
        }
        return aVar;
    }
}
