package com.alipay.mobile.common.amnet.biz;

import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.utils.config.fmk.ConfigureItem;
import tb.ils;

/* loaded from: classes3.dex */
public enum AmnetConfigureItem implements ConfigureItem {
    AMNET_SINGLE_LINK_CNT("aslc", "1000000", UTConstant.Args.UT_SUCCESS_F),
    BG_SINGLE_LINK_CNT("am_bslc", "1000000", UTConstant.Args.UT_SUCCESS_F),
    AMNET_HW_HB_GRAY("am_hhg", "0,0", "T"),
    AMNET_HW_HB_BLACK("am_hhb", "", "B"),
    AMNET_SHORT_LINK("am_sl", "0,0", "T"),
    AMNET_SHORT_LINK_TIMEOUT("am_slt", "30", UTConstant.Args.UT_SUCCESS_F),
    AMNET_SHORT_LINK_TRIGGER_LIST("am_sltl", "0,0,0,0,0,0,0", UTConstant.Args.UT_SUCCESS_F),
    AMNET_SHORT_FREQ_CONN("am_sfcg", "0,0", "T"),
    AMNET_ST_TO("am_stc", "0,0", "T"),
    BACKGROUND_CONN_INTERVAL("am_bci", "5,20", UTConstant.Args.UT_SUCCESS_F),
    AMNET_MULTI_THREAD("am_mt", "0,0", "T"),
    NET_CHANGE_LINK("am_ncl", "T", UTConstant.Args.UT_SUCCESS_F),
    REPORT_MSG_SWITCH("am_rms", "T", UTConstant.Args.UT_SUCCESS_F),
    REMOVE_REPAIR_KEY("am_rrk", "T", UTConstant.Args.UT_SUCCESS_F),
    CREATE_NEW_LINK("am_cnl", "T", UTConstant.Args.UT_SUCCESS_F),
    TEMPORARY_VALID_TIME("am_tvt", "3", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_DOWNGRADE_PERIOD("b_dp", "7200", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_FAILED_RPC_NUM("b_frn", "6", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_IGNORE_FAILED_RPC_TIME("b_ift", "1000", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_ACTIVATE_NUM("b_an", "3", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_ACTIVATE_TIME("b_at", "30", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_DOWNGRADE_ENABLE("am_bde", "0", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_LOCAL_DOWNGRADE_ENABLE("am_blde", ils.ARCH_BIT64, UTConstant.Args.UT_SUCCESS_F),
    BIFROST_LISTEN_SIGNAL_STRENGTH("b_lss", UTConstant.Args.UT_SUCCESS_F, UTConstant.Args.UT_SUCCESS_F),
    BIFROST_WAKELOCK_SWITCH("b_wl", "1", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_SHORT_LINK("b_sl", ils.ARCH_BIT64, "T"),
    BIFROST_SHORTLINK_RPCLIST("b_slrl", "", UTConstant.Args.UT_SUCCESS_F),
    LONGLINK_CONN_MAX("mars.stn.longlink.connmax", "3", UTConstant.Args.UT_SUCCESS_F),
    BIFROST_DYNAMIC_LIB_FEATURE_SWITCH("b_dlfw", "0,0", "T"),
    BIFROST_DYNAMIC_LIB_DOWNLOAD_INTERVAL("b_dldi", "28800000", UTConstant.Args.UT_SUCCESS_F),
    START_MAIN_PROC_DISPATCH_SWITCH("b_smpds", "T", UTConstant.Args.UT_SUCCESS_F),
    AMNET_FORCE_TLS_VERIFY("ftls_vr", UTConstant.Args.UT_SUCCESS_F, UTConstant.Args.UT_SUCCESS_F),
    LAST_ITEM("$k", "$v", "$t");
    

    /* renamed from: a  reason: collision with root package name */
    private String f5361a;
    private String b;
    private String c;

    AmnetConfigureItem(String str, String str2, String str3) {
        this.b = str2;
        this.f5361a = str;
        this.c = str3;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureItem
    public String getConfigName() {
        return this.f5361a;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureItem
    public double getDoubleValue() {
        try {
            return Double.parseDouble(this.b);
        } catch (Throwable th) {
            LogCatUtil.error("TransportConfigureItem", th);
            return -1.0d;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureItem
    public int getIntValue() {
        try {
            return Integer.parseInt(this.b);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureItem
    public long getLongValue() {
        try {
            return Long.parseLong(this.b);
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureItem
    public String getStringValue() {
        return this.b;
    }

    public String getType() {
        return this.c;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureItem
    public void setValue(String str) {
        this.b = str;
    }
}
