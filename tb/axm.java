package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.event.quantityChange")
/* loaded from: classes2.dex */
public final class axm extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f25672a;
    public static final String b;

    public static /* synthetic */ Object ipc$super(axm axmVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "quantityChange";
    }

    public static /* synthetic */ q a(axm axmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("c920943d", new Object[]{axmVar}) : axmVar.b();
    }

    static {
        kge.a(840008467);
        f25672a = b.a(R.string.taobao_app_2180_1_29334);
        b = b.a(R.string.taobao_app_2180_1_29335);
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        View v;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        s b2 = b().b();
        if (b2 == null) {
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (eventModel.e() == null || eventModel.e().length < 2 || d == null) {
            return;
        }
        Object obj = null;
        if (eventModel.e().length == 2) {
            obj = eventModel.e()[1];
        } else if (eventModel.e().length == 3) {
            obj = eventModel.e()[2];
        }
        if (!(obj instanceof String)) {
            return;
        }
        String str = (String) obj;
        char c = 65535;
        switch (str.hashCode()) {
            case -2136975704:
                if (str.equals("showQuantity")) {
                    c = 0;
                    break;
                }
                break;
            case -1361636432:
                if (str.equals("change")) {
                    c = 4;
                    break;
                }
                break;
            case -722779155:
                if (str.equals("hideQuantity")) {
                    c = 1;
                    break;
                }
                break;
            case 95321666:
                if (str.equals("increase")) {
                    c = 2;
                    break;
                }
                break;
            case 573606046:
                if (str.equals("decrease")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            a(b2, d, str);
        } else if (c != 2 && c != 3 && c != 4) {
        } else {
            if (str.equals("change")) {
                Object c2 = eventModel.c(d.EXT_KEY_DX_RUNTIME_CONTEXT);
                if (!(c2 instanceof DXRuntimeContext) || (v = ((DXRuntimeContext) c2).v()) == null) {
                    return;
                }
                Object tag = v.getTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY);
                if (!(tag instanceof List)) {
                    return;
                }
                List list = (List) tag;
                if (list.size() < 2) {
                    return;
                }
                Object obj2 = list.get(1);
                if (obj2 instanceof CharSequence) {
                    try {
                        intValue = Integer.valueOf(obj2.toString()).intValue();
                    } catch (Exception unused) {
                        return;
                    }
                } else if (!(obj2 instanceof Integer)) {
                    return;
                } else {
                    intValue = ((Integer) obj2).intValue();
                }
                a(b2, aURAEventIO, d, str, intValue);
                return;
            }
            a(b2, aURAEventIO, d, str, 0);
        }
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    private void a(s sVar, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47515256", new Object[]{this, sVar, aURARenderComponent, str});
            return;
        }
        com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.d.f2137a = new HashMap();
        aVar.d.c = new HashMap();
        aVar.d.b = new HashMap();
        aVar.b = aURARenderComponent.key;
        if (aURARenderComponent.data != null) {
            if (aURARenderComponent.data.fields != null) {
                aVar.d.f2137a.putAll(aURARenderComponent.data.fields);
            }
            if (aURARenderComponent.data.localFields != null) {
                aVar.d.c.putAll(aURARenderComponent.data.localFields);
            }
            if (aURARenderComponent.data.events != null) {
                aVar.d.b.putAll(aURARenderComponent.data.events);
            }
        }
        HashMap hashMap = new HashMap();
        if (str.equals("showQuantity")) {
            hashMap.put("showQuantity", "true");
        } else if (str.equals("hideQuantity")) {
            hashMap.put("showQuantity", "false");
        }
        aVar.c.f2137a = hashMap;
        aVar.c.c = hashMap;
        aVar.c.b = new HashMap();
        sVar.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(aVar)), null);
    }

    private void a(s sVar, AURAEventIO aURAEventIO, AURARenderComponent aURARenderComponent, String str, int i) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500fd159", new Object[]{this, sVar, aURAEventIO, aURARenderComponent, str, new Integer(i)});
            return;
        }
        Context e = b().e();
        if (e == null || aURARenderComponent.data == null || aURARenderComponent.data.fields == null) {
            return;
        }
        com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.d.f2137a = new HashMap();
        aVar.d.c = new HashMap();
        aVar.d.b = new HashMap();
        aVar.b = aURARenderComponent.key;
        if (aURARenderComponent.data != null) {
            if (aURARenderComponent.data.fields != null) {
                aVar.d.f2137a.putAll(aURARenderComponent.data.fields);
            }
            if (aURARenderComponent.data.localFields != null) {
                aVar.d.c.putAll(aURARenderComponent.data.localFields);
            }
            if (aURARenderComponent.data.events != null) {
                aVar.d.b.putAll(aURARenderComponent.data.events);
            }
        }
        int a2 = a(aURARenderComponent.data.fields.get("quantity"));
        int a3 = a(aURARenderComponent.data.fields.get("step"));
        int a4 = a(aURARenderComponent.data.fields.get("min"));
        int a5 = a(aURARenderComponent.data.fields.get("max"));
        if (a2 < 0 || a3 < 0 || a4 < 0 || a5 < 0) {
            a(sVar, aVar, a2);
            return;
        }
        HashMap hashMap = new HashMap();
        int hashCode = str.hashCode();
        if (hashCode == -1361636432) {
            if (str.equals("change")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 95321666) {
            if (hashCode == 573606046 && str.equals("decrease")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("increase")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            int i2 = a3 + a2;
            if (i2 > a5) {
                bat.a(e, f25672a);
                a(sVar, aVar, a2);
                return;
            }
            hashMap.put("quantity", String.valueOf(i2));
        } else if (c == 1) {
            int i3 = a2 - a3;
            if (i3 < a4) {
                bat.a(e, b);
                a(sVar, aVar, a2);
                return;
            }
            hashMap.put("quantity", String.valueOf(i3));
        } else if (c != 2) {
            return;
        } else {
            if (i < a4) {
                bat.a(e, b);
                a(sVar, aVar, a2);
                return;
            } else if (i > a5) {
                bat.a(e, f25672a);
                a(sVar, aVar, a2);
                return;
            } else {
                hashMap.put("quantity", String.valueOf(i));
            }
        }
        aVar.c.f2137a = hashMap;
        aVar.c.c = aVar.d.c;
        aVar.c.b = new HashMap();
        sVar.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(aVar)), new a(aURAEventIO));
    }

    private void a(s sVar, com.alibaba.android.umf.datamodel.service.rule.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57b201f", new Object[]{this, sVar, aVar, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("quantity", String.valueOf(i));
        aVar.c.f2137a = hashMap;
        aVar.c.c = aVar.d.c;
        aVar.c.b = new HashMap();
        sVar.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(aVar)), null);
    }

    private int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, obj})).intValue();
        }
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj).intValue();
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* loaded from: classes2.dex */
    public class a extends aqq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AURAEventIO b;

        static {
            kge.a(-982514299);
        }

        @Override // tb.aqq, tb.aqs
        public void a(com.alibaba.android.aura.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            }
        }

        public a(AURAEventIO aURAEventIO) {
            this.b = aURAEventIO;
        }

        @Override // tb.aqq
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                return;
            }
            s b = axm.a(axm.this).b();
            if (b == null) {
                return;
            }
            com.alibaba.android.aura.service.event.c.a(b, "adjust", this.b.getEventModel());
        }
    }
}
