package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.lifeCycle.linkage")
/* loaded from: classes2.dex */
public final class ayi extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25689a = "AURALinkageLifeCycleExtension";

    static {
        kge.a(2006567);
    }

    public static /* synthetic */ Object ipc$super(ayi ayiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1123044641) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.beforeFlowExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        }
    }

    @Override // tb.arn, tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, a aVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, aVar);
        if (!"aura.workflow.float".equals(aVar.d())) {
            return;
        }
        Serializable data = aURAInputData.getData();
        if (!(data instanceof AURAParseIO)) {
            return;
        }
        AURAParseIO aURAParseIO = (AURAParseIO) data;
        List<com.alibaba.android.aura.datamodel.parse.a> data2 = aURAParseIO.getData();
        if (bau.a(data2)) {
            return;
        }
        String rootKey = aURAParseIO.getRootKey();
        if (StringUtils.isEmpty(rootKey) || (a2 = data2.get(0).a()) == null) {
            return;
        }
        a(a2, rootKey);
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        AURAGlobalData c = c();
        if (c == null) {
            return;
        }
        c.update("floatRawProtocol", JSONObject.parseObject(jSONObject.toJSONString()));
        c.update("floatRootKey", str);
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
