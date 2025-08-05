package com.taobao.browser.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(343974809);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                List parseArray = JSON.parseArray(str, String.class);
                for (int i = 0; i < parseArray.size(); i++) {
                    if (!((String) parseArray.get(i)).isEmpty() && str2.contains((CharSequence) parseArray.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException e) {
                TLog.logd("UrlUtil", e.getMessage());
            }
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return Pattern.matches(str, str2);
        }
        return false;
    }
}
