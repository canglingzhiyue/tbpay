package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.buy.toggle.a;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.message.message_open_api.ICallService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.arc;

@AURAExtensionImpl(code = "alibuy.impl.nextrpc.prefetch")
/* loaded from: classes4.dex */
public final class dua implements IAURANextRPCPrefetchExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f26982a;
    private AURAGlobalData b;

    static {
        kge.a(-1334417100);
        kge.a(17395952);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26982a = qVar;
        }
    }

    @Override // com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (map == null) {
        } else {
            ard a2 = arc.a();
            a2.a("预请求 节省 = " + map.get(IAURANextRPCPrefetchExtension.DATA_SAVE_TIME), arc.a.a().a("AURA/performance").a("type", str).a("api", map.get("data_key")).a("hitTime", map.get(IAURANextRPCPrefetchExtension.DATA_HIT_TIME)).a("startTime", map.get(IAURANextRPCPrefetchExtension.DATA_START_TIME)).a("startTime", map.get(IAURANextRPCPrefetchExtension.DATA_START_TIME)).a("receiveDataTime", map.get(IAURANextRPCPrefetchExtension.DATA_RESPONSE_TIME)).b());
            a(map);
            String d = a.d();
            HashMap hashMap = new HashMap();
            hashMap.put("c1", bap.a(bba.b(map)));
            bap.b("下单预请求", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.purchase.prefetch", "prefetch", d, hashMap, str);
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.b == null || map == null) {
        } else {
            String str = map.get(IAURANextRPCPrefetchExtension.DATA_SAVE_TIME);
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) this.f26982a.a("purchaseFrom", String.class));
            arrayList.add((String) this.f26982a.a("itemCount", String.class));
            arrayList.add((String) this.f26982a.a("bucket", String.class));
            HashMap hashMap = new HashMap();
            hashMap.put("savaTime", Long.valueOf(StringUtils.isEmpty(str) ? 0L : Long.valueOf(str).longValue()));
            ifz.a("prefetchSaveTime", hashMap, arrayList, null, 0.001f);
        }
    }

    @Override // com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension
    public asj a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asj) ipChange.ipc$dispatch("1c2e2220", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2});
        }
        if (a.g()) {
            asj asjVar = new asj();
            asjVar.a(true);
            return asjVar;
        }
        String string = AliBuyPerfSwitcher.getString("prefetchCompareWhiteList", "websiteLanguage");
        List<String> list = null;
        try {
            if (!StringUtils.isEmpty(string)) {
                list = Arrays.asList(string.split(","));
            }
        } catch (Throwable unused) {
        }
        return a(aURANextRPCEndpoint, aURANextRPCEndpoint2, list);
    }

    private asj a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asj) ipChange.ipc$dispatch("3c28f00f", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2, list});
        }
        asj asjVar = new asj();
        if (StringUtils.isEmpty(aURANextRPCEndpoint2.getKey()) || !aURANextRPCEndpoint2.getKey().equals(aURANextRPCEndpoint.getKey())) {
            asjVar.b().put("missKey", "apiKey");
            asjVar.b().put("missMsg", "missApi");
            asjVar.b().put("prefetchValue", aURANextRPCEndpoint.getKey());
            asjVar.b().put("realValue", aURANextRPCEndpoint2.getKey());
        } else if (aURANextRPCEndpoint2.isNeedEncode() != aURANextRPCEndpoint.isNeedEncode()) {
            asjVar.b().put("missKey", ICallService.KEY_NEED_ECODE);
            asjVar.b().put("missMsg", "missEcode");
            asjVar.b().put("prefetchValue", String.valueOf(aURANextRPCEndpoint.isNeedEncode()));
            asjVar.b().put("realValue", String.valueOf(aURANextRPCEndpoint2.isNeedEncode()));
        } else if (aURANextRPCEndpoint2.isNeedSession() != aURANextRPCEndpoint.isNeedSession()) {
            asjVar.b().put("missKey", "needSession");
            asjVar.b().put("missMsg", "missSession");
            asjVar.b().put("prefetchValue", String.valueOf(aURANextRPCEndpoint.isNeedSession()));
            asjVar.b().put("realValue", String.valueOf(aURANextRPCEndpoint2.isNeedSession()));
        } else if (a(aURANextRPCEndpoint.getDataParams(), aURANextRPCEndpoint2.getDataParams(), list, asjVar) && a(aURANextRPCEndpoint.getRequestHeaders(), aURANextRPCEndpoint2.getRequestHeaders(), list, asjVar)) {
            asjVar.a(true);
        }
        return asjVar;
    }

    private boolean a(Map<String, String> map, Map<String, String> map2, List<String> list, asj asjVar) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7bd1cb5", new Object[]{this, map, map2, list, asjVar})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null) {
            asjVar.b().put("prefetchValue", "is null");
            return false;
        } else if (map2 == null) {
            asjVar.b().put("realValue", "is null");
            return false;
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key2 = entry.getKey();
                if (key2 == null) {
                    return true;
                }
                if (!xiv.a(key2, map.get(key2), map2.get(key2), list, asjVar)) {
                    return false;
                }
            }
            Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
            while (it.hasNext() && (key = it.next().getKey()) != null) {
                if (!xiv.a(key, map.get(key), map2.get(key), list, asjVar)) {
                    return false;
                }
            }
            return true;
        }
    }
}
