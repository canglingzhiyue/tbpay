package com.tmall.android.dai.trigger.protocol.cep.pattern;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;
import tb.rlh;

/* loaded from: classes9.dex */
public class a implements rlh<Map<String, String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CEP.TriggerPattern";

    /* renamed from: a  reason: collision with root package name */
    private CepNative f23731a;

    static {
        kge.a(-800581762);
        kge.a(82360998);
    }

    @Override // tb.rlh
    public ArrayList<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        return null;
    }

    public a(CepNative cepNative) {
        this.f23731a = cepNative;
    }

    public void a(CepNative.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e2c47d", new Object[]{this, aVar});
        } else {
            this.f23731a.setMatchSuccessCallback(aVar);
        }
    }

    @Override // tb.rlh
    public TriggerMatchResult a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("255eb52f", new Object[]{this, map});
        }
        int onUserEvent = this.f23731a.onUserEvent(map);
        if (onUserEvent == 0) {
            return TriggerMatchResult.a();
        }
        if (onUserEvent == 1) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_DEFINITION_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode, "cep invalid event : " + onUserEvent);
        } else if (onUserEvent == 2) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode2 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_IN_PROGRESS;
            return TriggerMatchResult.a(triggerMatchResultCode2, "cep partial match : " + onUserEvent);
        } else if (onUserEvent == 3) {
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode3 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_INNER_NOT_MATCH;
            return TriggerMatchResult.a(triggerMatchResultCode3, "cep inner not match : " + onUserEvent);
        } else {
            return TriggerMatchResult.a(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_CEP_INNER_NOT_MATCH, "undefined return code");
        }
    }
}
