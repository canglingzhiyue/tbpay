package com.taobao.global.setting.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "modifyDataPriorityList", "");
        if (TextUtils.isEmpty(config)) {
            return "mytaobao".equals(str);
        }
        String[] split = config.split(",");
        if (split.length == 1) {
            return split[0].equals(str);
        }
        for (String str2 : split) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
