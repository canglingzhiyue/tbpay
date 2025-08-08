package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class UserMotionConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UserMotionConfig";
    @JSONField(name = "page")
    public String page;
    @JSONField(name = "uniqueId")
    public String uid;

    static {
        kge.a(8400913);
    }

    public static boolean isValid(UserMotionConfig userMotionConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1629ecbb", new Object[]{userMotionConfig})).booleanValue() : userMotionConfig != null && !StringUtils.isEmpty(userMotionConfig.uid) && !StringUtils.isEmpty(userMotionConfig.page);
    }
}
