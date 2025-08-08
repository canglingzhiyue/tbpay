package com.taobao.monitor.impl.util;

import android.app.Activity;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj}) : obj == null ? "" : obj.getClass().getName();
    }

    public static String b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj}) : obj == null ? "" : obj.getClass().getSimpleName();
    }

    public static String a(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity});
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return "";
        }
        String dataString = intent.getDataString();
        return !StringUtils.isEmpty(dataString) ? dataString : "";
    }
}
