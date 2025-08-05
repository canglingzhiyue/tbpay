package com.tmall.android.dai.trigger;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes9.dex */
public class TriggerMatchResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23726a;
    public String b;
    public TriggerMatchResultCode c;

    /* loaded from: classes9.dex */
    public enum TriggerMatchResultCode {
        TRIGGER_MATCH_RESULT_CODE_SUCCESS,
        TRIGGER_MATCH_RESULT_CODE_UT_OWNER_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_EVENT_ID_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_UT_BATCH_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_CEP_DEFINITION_NOT_MATCH,
        TRIGGER_MATCH_RESULT_CODE_CEP_IN_PROGRESS,
        TRIGGER_MATCH_RESULT_CODE_CEP_INNER_NOT_MATCH
    }

    static {
        kge.a(1878023289);
    }

    public TriggerMatchResult(boolean z, TriggerMatchResultCode triggerMatchResultCode, String str) {
        this.f23726a = z;
        this.b = str;
        this.c = triggerMatchResultCode;
    }

    public static TriggerMatchResult a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TriggerMatchResult) ipChange.ipc$dispatch("8c8f4644", new Object[0]) : new TriggerMatchResult(true, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_SUCCESS, null);
    }

    public static TriggerMatchResult a(TriggerMatchResultCode triggerMatchResultCode, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TriggerMatchResult) ipChange.ipc$dispatch("5c2c90cb", new Object[]{triggerMatchResultCode, str}) : new TriggerMatchResult(false, triggerMatchResultCode, str);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Arrays.asList(TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH, TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARGS_NOT_MATCH).contains(this.c);
    }
}
