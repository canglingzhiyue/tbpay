package com.taobao.tlog.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.f;
import java.util.ArrayList;
import java.util.List;
import tb.olo;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_UDF_SWITCH = "tlog_udf_switch";

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(TLOG_UDF_SWITCH)) {
            z = defaultSharedPreferences.getBoolean(TLOG_UDF_SWITCH, true);
        }
        if (z) {
            for (String str : b(context)) {
                a(str);
            }
            return;
        }
        Log.e("TLogUdfUploaderManager", "The udf switch is disable!");
    }

    private static List<String> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30c7e468", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.taobao.mediatrace.TLogMediaTraceUploader");
        return arrayList;
    }

    private static boolean a(String str) {
        olo oloVar;
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            String str2 = "setUdfUploader " + str;
            Object newInstance = Class.forName(str).newInstance();
            if ((newInstance instanceof olo) && (oloVar = (olo) newInstance) != null) {
                f.a().a(oloVar.getBizCode(), oloVar);
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        TLog.loge("TLOG", "TLogUdfUploaderManager", "Failed to set udf uploader: " + str);
        return false;
    }
}
