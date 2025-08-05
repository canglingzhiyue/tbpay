package com.alipay.security.mobile.rpc;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class ReadSettingServerUrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ReadSettingServerUrl mInstance;
    private String mUrl = "https://mobilegw.alipay.com/mgw.htm";

    public static ReadSettingServerUrl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReadSettingServerUrl) ipChange.ipc$dispatch("fa88b152", new Object[0]);
        }
        if (mInstance == null) {
            synchronized (ReadSettingServerUrl.class) {
                if (mInstance == null) {
                    mInstance = new ReadSettingServerUrl();
                }
            }
        }
        return mInstance;
    }

    public String getmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce709fe1", new Object[]{this}) : this.mUrl;
    }

    public void setmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94229cb5", new Object[]{this, str});
        } else {
            this.mUrl = str;
        }
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
        } catch (Exception e) {
            String str = "isDebug exception.  " + e.toString();
            return false;
        }
    }

    public final String getGWFURL(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2075be6e", new Object[]{this, context});
        }
        if (isDebug(context)) {
            return getValue(context, "content://com.alipay.setting/GWFServerUrl", this.mUrl);
        }
        return this.mUrl;
    }

    public static String getValue(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a052a686", new Object[]{context, str, str2});
        }
        Cursor query = context.getContentResolver().query(Uri.parse(str), null, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.moveToFirst();
            String string = query.getString(0);
            query.close();
            String str3 = "getValue.  cursor exist.  uri=[" + str + "]  ret=[" + string + riy.ARRAY_END_STR;
            return string;
        }
        if (query != null && !query.isClosed()) {
            query.close();
        }
        return str2;
    }
}
