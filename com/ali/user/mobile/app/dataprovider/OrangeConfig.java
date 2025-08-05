package com.ali.user.mobile.app.dataprovider;

import android.text.TextUtils;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import tb.kge;

/* loaded from: classes2.dex */
public class OrangeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String DEFAULT_VALUE = "none";

    static {
        kge.a(1861882510);
    }

    public BooleanOrangeResult needRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BooleanOrangeResult) ipChange.ipc$dispatch("6aabcb50", new Object[]{this}) : doBooleanReadOrangeConfig(LoginSwitch.ENABLE_REGISTER);
    }

    public BooleanOrangeResult needHelp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BooleanOrangeResult) ipChange.ipc$dispatch("48442472", new Object[]{this}) : doBooleanReadOrangeConfig(LoginSwitch.ENABLE_HELP);
    }

    public BooleanOrangeResult needFindPassword() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BooleanOrangeResult) ipChange.ipc$dispatch("9ac5bb1f", new Object[]{this}) : doBooleanReadOrangeConfig(LoginSwitch.ENABLE_FIND_PASSWORD);
    }

    public BooleanOrangeResult isNeedUpdateUTAccount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BooleanOrangeResult) ipChange.ipc$dispatch("14055544", new Object[]{this}) : doBooleanReadOrangeConfig(LoginSwitch.ENABLE_UPDATE_UT);
    }

    private BooleanOrangeResult doBooleanReadOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BooleanOrangeResult) ipChange.ipc$dispatch("51e34ddc", new Object[]{this, str});
        }
        BooleanOrangeResult booleanOrangeResult = new BooleanOrangeResult();
        String config = LoginSwitch.getConfig(str, "none");
        if (TextUtils.equals(config, "none")) {
            booleanOrangeResult.orangeExist = false;
        } else {
            booleanOrangeResult.orangeExist = true;
            booleanOrangeResult.value = TextUtils.equals("true", config);
        }
        return booleanOrangeResult;
    }

    public StringOrangeResult helpLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringOrangeResult) ipChange.ipc$dispatch("8f8cb1b9", new Object[]{this}) : doStringReadOrangeConfig(LoginSwitch.HELP_LINK);
    }

    public StringOrangeResult customProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringOrangeResult) ipChange.ipc$dispatch("76b8ab07", new Object[]{this});
        }
        String language = LanguageUtil.getLanguage();
        return doStringReadOrangeConfig("custom_protocol_" + language);
    }

    public StringOrangeResult doStringReadOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringOrangeResult) ipChange.ipc$dispatch("37ae4a", new Object[]{this, str});
        }
        StringOrangeResult stringOrangeResult = new StringOrangeResult();
        String config = LoginSwitch.getConfig(str, "none");
        if (TextUtils.equals(config, "none")) {
            stringOrangeResult.orangeExist = false;
        } else {
            stringOrangeResult.orangeExist = true;
            stringOrangeResult.value = config;
        }
        return stringOrangeResult;
    }

    public IntOrangeResult getMaxSessionSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntOrangeResult) ipChange.ipc$dispatch("5fd34999", new Object[]{this}) : doIntReadOrangeConfig(LoginSwitch.MAX_SESSION_NUM);
    }

    public IntOrangeResult getMaxHistorySize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntOrangeResult) ipChange.ipc$dispatch("9382485b", new Object[]{this}) : doIntReadOrangeConfig(LoginSwitch.MAX_HISTORY_NUM);
    }

    public IntOrangeResult getMtopTimeOutMilliSecond() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntOrangeResult) ipChange.ipc$dispatch("9691da64", new Object[]{this}) : doIntReadOrangeConfig(LoginSwitch.RPC_TIMEOUT_MS);
    }

    private IntOrangeResult doIntReadOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntOrangeResult) ipChange.ipc$dispatch("e214acce", new Object[]{this, str});
        }
        IntOrangeResult intOrangeResult = new IntOrangeResult();
        String config = LoginSwitch.getConfig(str, "none");
        if (TextUtils.equals(config, "none")) {
            intOrangeResult.orangeExist = false;
        } else {
            intOrangeResult.orangeExist = true;
            try {
                intOrangeResult.value = Integer.parseInt(config);
            } catch (Throwable unused) {
                intOrangeResult.orangeExist = false;
            }
        }
        return intOrangeResult;
    }
}
