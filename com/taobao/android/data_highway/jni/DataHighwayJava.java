package com.taobao.android.data_highway.jni;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.ktm;

/* loaded from: classes4.dex */
public class DataHighwayJava implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile a MTOP = null;
    private static final String TAG = "DataHighwayJava";

    static {
        kge.a(-693454345);
        kge.a(1028243835);
    }

    public static void setMTOP(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e2441d", new Object[]{aVar});
        } else {
            MTOP = aVar;
        }
    }

    public static void requestCPP(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0fea8", new Object[]{new Integer(i), str, new Integer(i2), str2, str3, str4, new Integer(i3), str5, str6});
        } else if (i2 <= 0 || TextUtils.isEmpty(str2) || str4 == null) {
        } else {
            try {
                MTOP.a(i, str, i2, str2, str3, str4, i3, str5, str6);
            } catch (Throwable th) {
                ktm.a("requestError", th.getMessage());
                Log.e(TAG, "JSONArray error");
            }
        }
    }
}
