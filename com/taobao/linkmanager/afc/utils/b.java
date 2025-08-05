package com.taobao.linkmanager.afc.utils;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.StringUtil;
import com.taobao.tao.Globals;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import java.util.Map;
import tb.kge;
import tb.koh;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1214252472);
    }

    public static /* synthetic */ String a(com.taobao.flowcustoms.afc.a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dab99a61", new Object[]{aVar, str}) : b(aVar, str);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        a();
        b(application);
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else {
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    public static synchronized void a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            if (c()) {
                b();
            }
        }
    }

    private static synchronized void b() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.remove("appGuide");
            edit.apply();
        }
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        if (defaultSharedPreferences == null) {
            return false;
        }
        String string = defaultSharedPreferences.getString("appGuide", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            String str = new String(Base64.decode(string.getBytes(), 0), "UTF-8");
            int indexOf = str.indexOf("|");
            int i = indexOf + 1;
            long parseLong = Long.parseLong(str.substring(0, indexOf)) + (Long.parseLong(str.substring(i, str.indexOf("|", i))) * 1000);
            long serverTime = TimestampSynchronizer.getServerTime();
            return parseLong > 0 && serverTime > 0 && serverTime - parseLong > 0;
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.b("appGuide", e.toString());
            return false;
        }
    }

    public static synchronized void a(final com.taobao.flowcustoms.afc.a aVar) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc9b6d95", new Object[]{aVar});
            } else {
                com.taobao.flowcustoms.afc.utils.d.b.a(new Runnable() { // from class: com.taobao.linkmanager.afc.utils.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Map<String, String> map = com.taobao.flowcustoms.afc.b.a().f17180a;
                        String replace = Base64.encodeToString(b.a(com.taobao.flowcustoms.afc.a.this, map != null ? map.get("visitValidTime") : "86400").getBytes(), 0).replace("\n", "");
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
                        edit.putString("appGuide", replace);
                        edit.apply();
                    }
                });
            }
        }
    }

    private static String b(com.taobao.flowcustoms.afc.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1399fb00", new Object[]{aVar, str});
        }
        if (aVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TimestampSynchronizer.getServerTime());
        stringBuffer.append("|");
        stringBuffer.append(str);
        stringBuffer.append("|");
        if (!StringUtil.isBlank(aVar.i)) {
            stringBuffer.append(aVar.i);
        }
        stringBuffer.append("|");
        if (aVar.m != null) {
            String str2 = aVar.m.get("shopId");
            if (!StringUtil.isBlank(str2)) {
                stringBuffer.append(str2);
            }
            stringBuffer.append("|");
            String str3 = aVar.m.get("itemId");
            if (!StringUtil.isBlank(str3)) {
                stringBuffer.append(str3);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(aVar.j)) {
                stringBuffer.append(aVar.j);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(aVar.f17179a)) {
                stringBuffer.append(aVar.f17179a);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(aVar.y)) {
                stringBuffer.append(aVar.y);
            }
            stringBuffer.append("|");
            String str4 = aVar.m.get(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            if (!StringUtil.isBlank(str4)) {
                stringBuffer.append(str4);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(aVar.k)) {
                stringBuffer.append(aVar.k);
            }
            stringBuffer.append("|");
            String str5 = aVar.m.get(koh.SOURCE_VC);
            if (!StringUtil.isBlank(str5)) {
                stringBuffer.append(str5);
            }
            stringBuffer.append("|");
            String str6 = aVar.f17179a;
            if (str6 != null) {
                stringBuffer.append(str6);
            }
        } else {
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
            stringBuffer.append("|");
        }
        return stringBuffer.toString();
    }
}
