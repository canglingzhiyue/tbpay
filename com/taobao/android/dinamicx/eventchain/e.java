package com.taobao.android.dinamicx.eventchain;

import com.heytap.mcssdk.constant.MessageConstant;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static final e EVENT_CHAIN_ERROR_ABILITY_EXEC_RESULT_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_ABILITY_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_ABILITY_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_CONTEXT_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_EXECUTE_CONTEXT_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_EXECUTE_EVENTCHIAN_CONTEXT_IS_NULL;
    public static final e EVENT_CHAIN_ERROR_MEGAC_EXECUTE_CONTEXT_IS_NULL;

    /* renamed from: a  reason: collision with root package name */
    public int f11851a;
    public String b;

    static {
        kge.a(212461894);
        EVENT_CHAIN_ERROR_ABILITY_IS_NULL = new e(1, "event ability is null");
        EVENT_CHAIN_ERROR_ABILITY_EXEC_RESULT_IS_NULL = new e(2, "event ability callback params is null");
        EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_CONTEXT_IS_NULL = new e(4097, "event atomic execute context is null");
        EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_ABILITY_IS_NULL = new e(4098, "event atomic execute ability is null");
        EVENT_CHAIN_ERROR_EXECUTE_CONTEXT_IS_NULL = new e(8193, "event chain execute context is null");
        EVENT_CHAIN_ERROR_EXECUTE_EVENTCHIAN_CONTEXT_IS_NULL = new e(MessageConstant.CommandId.COMMAND_UNREGISTER, "event chain execute eventchian context is null");
        EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL = new e(MessageConstant.CommandId.COMMAND_STATISTIC, "event chain execute atomic context is null");
        EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL = new e(MessageConstant.CommandId.COMMAND_SET_ALIAS, "event chain execute atomic eventnode is null");
        EVENT_CHAIN_ERROR_MEGAC_EXECUTE_CONTEXT_IS_NULL = new e(12293, "event mega execute context is null");
    }

    public e(int i, String str) {
        this.f11851a = i;
        this.b = str;
    }
}
