package com.taobao.tao.msgcenter.activity;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ConvertUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1946143758);
    }

    public static Bundle convertMsgExtras(Intent intent) {
        Bundle bundle;
        String stringExtra;
        String stringExtra2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d3a64e19", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        try {
            stringExtra = intent.getStringExtra("id");
        } catch (Throwable th) {
            th = th;
            bundle = null;
        }
        if (StringUtils.isEmpty(stringExtra)) {
            return null;
        }
        bundle = new Bundle();
        try {
            bundle.putString("id", stringExtra);
            stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            String stringExtra3 = intent.getStringExtra("task_id");
            if (!StringUtils.isEmpty(stringExtra3)) {
                bundle.putString("task_id", stringExtra3);
            }
        } catch (Throwable th2) {
            th = th2;
            TLog.loge("agoo_push", Log.getStackTraceString(th));
            return bundle;
        }
        if (StringUtils.isEmpty(stringExtra2)) {
            return null;
        }
        bundle.putString(AgooConstants.MESSAGE_BODY, stringExtra2);
        try {
            String string = new JSONObject(stringExtra2).getString("url");
            if (!StringUtils.isEmpty(string)) {
                bundle.putString(TaobaoConstants.MESSAGE_URL, string);
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
