package com.taobao.unit.center.sync.constant;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/unit/center/sync/constant/SyncConstant;", "", "()V", "BIZ_ID", "", "KEY_LAYOUTID", "", SyncConstant.KEY_LAYOUT_ALL_TIMESTAMP, "KEY_TEMPLATEID2LAYOUTID", SyncConstant.KEY_TEMPLATE_ALL_TIMESTAMP, SyncConstant.KEY_TEMPLATE_INC_TIMESTAMP, "MTOP_KEY_TEMPLATEID", "REMOTE_KEY_LAYOUT_ALL_TIMESTAMP", "REMOTE_KEY_LAYOUT_INC_TIMESTAMP", "REMOTE_KEY_TEMPLATE_ALL_TIMESTAMP", "REMOTE_KEY_TEMPLATE_INC_TIMESTAMP", "SYNC_TIMESTAMP_NAMESPACE", RPCDataItems.SWITCH_TAG_LOG, "TB_UNIT_CENTER_VERSION", "getTB_UNIT_CENTER_VERSION", "()I", "TEMPLATEID2LAYOUTID_DEFAULT", "TEMPLATE_PAGE_SIZE", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class SyncConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIZ_ID = 72;
    public static final SyncConstant INSTANCE;
    public static final String KEY_LAYOUTID = "layoutId";
    public static final String KEY_LAYOUT_ALL_TIMESTAMP = "KEY_LAYOUT_ALL_TIMESTAMP";
    public static final String KEY_TEMPLATEID2LAYOUTID = "templateid2layoutid";
    public static final String KEY_TEMPLATE_ALL_TIMESTAMP = "KEY_TEMPLATE_ALL_TIMESTAMP";
    public static final String KEY_TEMPLATE_INC_TIMESTAMP = "KEY_TEMPLATE_INC_TIMESTAMP";
    public static final String MTOP_KEY_TEMPLATEID = "templateId";
    public static final String REMOTE_KEY_LAYOUT_ALL_TIMESTAMP = "layoutAllTs";
    public static final String REMOTE_KEY_LAYOUT_INC_TIMESTAMP = "layoutIncTs";
    public static final String REMOTE_KEY_TEMPLATE_ALL_TIMESTAMP = "templateAllTs";
    public static final String REMOTE_KEY_TEMPLATE_INC_TIMESTAMP = "templateIncTs";
    public static final String SYNC_TIMESTAMP_NAMESPACE = "alimp_card_center_sync";
    public static final String TAG = "cbq@sync";
    private static final int TB_UNIT_CENTER_VERSION;
    public static final String TEMPLATEID2LAYOUTID_DEFAULT = "{\n}";
    public static final long TEMPLATE_PAGE_SIZE = 100;

    static {
        kge.a(137573304);
        INSTANCE = new SyncConstant();
        TB_UNIT_CENTER_VERSION = 1;
    }

    private SyncConstant() {
    }

    public final int getTB_UNIT_CENTER_VERSION() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a4f4be8", new Object[]{this})).intValue() : TB_UNIT_CENTER_VERSION;
    }
}
