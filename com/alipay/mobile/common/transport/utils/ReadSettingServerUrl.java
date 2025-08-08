package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import tb.riy;

/* loaded from: classes3.dex */
public class ReadSettingServerUrl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OFF_SWITCH = "0";
    public static final String ON_SWITCH = "1";

    /* renamed from: a  reason: collision with root package name */
    private static ReadSettingServerUrl f5632a;
    private String b = "https://mobilegw.alipay.com/mgw.htm";
    private String c = "https://mgwapi-tb.alipay.com/mgw.htm";
    private String d = "https://mobilegw-tb-sibling.alipay.com/mgw.htm";
    private String e = "http://amdc.alipay.com/query";
    private String f = null;
    private URL g = null;
    private String h = null;
    private Boolean i = null;
    private String j = null;

    public static synchronized ReadSettingServerUrl getInstance() {
        synchronized (ReadSettingServerUrl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ReadSettingServerUrl) ipChange.ipc$dispatch("9a93a55f", new Object[0]);
            }
            if (f5632a == null) {
                f5632a = new ReadSettingServerUrl();
            }
            return f5632a;
        }
    }

    public String getmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce709fe1", new Object[]{this}) : this.b;
    }

    public void setmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94229cb5", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getBackupGwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b5814d2", new Object[]{this}) : this.d;
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
        } catch (Exception e) {
            LogCatUtil.warn("ReadSettingServerUrl", "isDebug exception.  " + e.toString());
            return false;
        }
    }

    public final URL getGWFURLObj(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("de76e0fc", new Object[]{this, context});
        }
        URL url = this.g;
        if (url != null) {
            return url;
        }
        synchronized (this) {
            if (this.g != null) {
                return this.g;
            }
            this.g = new URL(getGWFURL(context));
            return this.g;
        }
    }

    public final void setCustGwURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8250649b", new Object[]{this, str});
            return;
        }
        this.h = str;
        LogCatUtil.info("ReadSettingServerUrl", "[setCustGwURL] url = " + str);
    }

    public final void setAlipaySetToolPriorityMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8589e8c", new Object[]{this, context});
        } else if (context == null) {
            LogCatUtil.warn("ReadSettingServerUrl", "[setAlipaySetToolPriorityMode] context param is null.");
        } else {
            try {
                if (!isDebug(context)) {
                    return;
                }
                String a2 = a(context, "");
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                this.f = a2;
                setCustGwURL(this.f);
                LogCatUtil.info("ReadSettingServerUrl", "[setAlipaySetToolPriorityMode] Hit set tool, url = " + this.f);
            } finally {
                getGWFURL(context);
            }
        }
    }

    public final String getGWFURL(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2075be6e", new Object[]{this, context});
        }
        if (!StringUtils.isEmpty(this.h)) {
            if (MiscUtils.isDebugger(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit cust gw url = " + this.h);
            }
            return this.h;
        } else if (!StringUtils.isEmpty(this.f)) {
            if (MiscUtils.isDebugger(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit current gw url = " + this.f);
            }
            return this.f;
        } else {
            try {
                String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("mobilegw.url");
                if (!StringUtils.isEmpty(string)) {
                    this.f = string;
                    LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit meta-data, url = " + this.f);
                    return this.f;
                }
            } catch (Exception e) {
                LogCatUtil.warn("ReadSettingServerUrl", "[getGWFURL] Meta data exception = " + e, e);
            }
            if (isDebug(context)) {
                String a2 = a(context);
                if (!StringUtils.isEmpty(a2)) {
                    this.f = a2;
                    LogCatUtil.info("ReadSettingServerUrl", "[getGWFURL] Hit set tool, url = " + this.f);
                }
                return this.f;
            }
            this.f = this.b;
            return this.f;
        }
    }

    public final String getHttpdnsServerUrl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a0f3e0", new Object[]{this, context});
        }
        if (isDebug(context)) {
            return getValue(context, "content://com.alipay.setting/httpdns_url", this.e);
        }
        return this.e;
    }

    public static String getValue(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a052a686", new Object[]{context, str, str2});
        }
        try {
            LogCatUtil.printInfo("ReadSettingServerUrl", "getValue start.");
            Cursor query = context.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (query != null && query.getCount() > 0) {
                query.moveToFirst();
                String string = query.getString(0);
                query.close();
                LogCatUtil.printInfo("ReadSettingServerUrl", "getValue.  cursor exist.  uri=[" + str + "]  ret=[" + string + riy.ARRAY_END_STR);
                return StringUtils.isEmpty(string) ? str2 : string;
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
            return str2;
        } catch (Throwable th) {
            LogCatUtil.warn("ReadSettingServerUrl", "[getValue] Exception = " + th.toString());
            return str2;
        }
    }

    public final Boolean isEnableAmnetSetting(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("640577d2", new Object[]{this, context});
        }
        if (isDebug(context)) {
            LogCatUtil.info("ReadSettingServerUrl", "isEnableAmnetSetting.  debug is true");
            Boolean bool = this.i;
            if (bool != null) {
                return bool;
            }
            String value = getValue(context, "content://com.alipay.setting/XmppUseMmtp", null);
            if ("1".equals(value)) {
                this.i = Boolean.TRUE;
            } else if ("0".equals(value)) {
                this.i = Boolean.FALSE;
            }
            return this.i;
        }
        LogCatUtil.info("ReadSettingServerUrl", "isEnableAmnetSetting.  debug is false");
        return null;
    }

    public final String getAmnetDnsSetting(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfb80da1", new Object[]{this, context});
        }
        try {
            if (isDebug(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "getAmnetDnsSetting. debug is true");
                if (!StringUtils.isEmpty(this.j)) {
                    return this.j;
                }
                String value = getValue(context, "content://com.alipay.setting/amnet_dns_conf", null);
                StringBuilder sb = new StringBuilder();
                sb.append("getAmnetDnsSetting.  amnetDns=[");
                sb.append(StringUtils.isEmpty(value) ? " is null " : value);
                sb.append(riy.ARRAY_END_STR);
                LogCatUtil.info("ReadSettingServerUrl", sb.toString());
                if (!StringUtils.isEmpty(value)) {
                    this.j = value;
                }
                return this.j;
            }
            LogCatUtil.info("ReadSettingServerUrl", "getAmnetDnsSetting.  debug is false");
            return "";
        } catch (Throwable th) {
            LogCatUtil.warn("ReadSettingServerUrl", "getAmnetDnsSetting exception. " + th.toString());
            return "";
        }
    }

    public final Boolean isEnabledNbnetDownloadSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cc9eed30", new Object[]{this, context});
        }
        try {
            if (!isDebug(context)) {
                LogCatUtil.info("ReadSettingServerUrl", "isEnabledNbnetDownloadSwitch.  debug is false, return false.");
                return Boolean.FALSE;
            }
            LogCatUtil.info("ReadSettingServerUrl", "isEnabledNbnetDownloadSwitch. debug is true");
            String value = getValue(context, "content://com.alipay.setting/nbnet_download_switch", null);
            StringBuilder sb = new StringBuilder();
            sb.append("isEnabledNbnetDownloadSwitch.  enable=[");
            sb.append(StringUtils.isEmpty(value) ? " is null " : value);
            sb.append(riy.ARRAY_END_STR);
            LogCatUtil.info("ReadSettingServerUrl", sb.toString());
            if (value != null) {
                return Boolean.valueOf(StringUtils.equals(value, "1"));
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn("ReadSettingServerUrl", "isEnabledNbnetDownloadSwitch exception. " + th.toString());
            return false;
        }
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : a(context, this.b);
    }

    private String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, str}) : getValue(context, "content://com.alipay.setting/GWFServerUrl", str);
    }
}
