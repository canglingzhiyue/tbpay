package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.EventProcessResult;
import com.tmall.android.dai.trigger.protocol.a;
import com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlj extends a<Map<String, String>, List<Map<String, String>>, rln<List<Map<String, String>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CEP.CepTriggerProtocol";
    public boolean d;
    private final com.tmall.android.dai.trigger.protocol.cep.pattern.a e;

    static {
        kge.a(1508334731);
    }

    public List<Map<String, String>> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffc624b", new Object[]{this, map});
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.lang.Object] */
    @Override // com.tmall.android.dai.trigger.protocol.a
    public /* synthetic */ List<Map<String, String>> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("45d4372c", new Object[]{this, map}) : b(map);
    }

    public rlj(String str, com.tmall.android.dai.trigger.protocol.cep.pattern.a aVar, rln<List<Map<String, String>>> rlnVar, String str2) {
        super(str, aVar, rlnVar, str2);
        this.d = true;
        this.e = aVar;
        this.e.a(new CepNative.a() { // from class: tb.rlj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative.a
            public void a(List<Map<String, String>> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                } else {
                    rlj.this.c.a(list);
                }
            }
        });
    }

    @Override // com.tmall.android.dai.trigger.protocol.a
    public EventProcessResult a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventProcessResult) ipChange.ipc$dispatch("b5fa90a7", new Object[]{this, map});
        }
        this.e.a(map);
        return EventProcessResult.RESULT_CONSUMED;
    }

    @Override // com.tmall.android.dai.trigger.protocol.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!(this.c instanceof rlk)) {
            return null;
        }
        return ((rlk) this.c).a();
    }
}
