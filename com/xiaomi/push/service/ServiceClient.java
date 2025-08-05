package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.push.fi;
import com.xiaomi.push.he;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hj;
import com.xiaomi.push.hs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;

/* loaded from: classes9.dex */
public class ServiceClient {

    /* renamed from: a  reason: collision with other field name */
    private static ServiceClient f859a;

    /* renamed from: a  reason: collision with other field name */
    private static String f860a;

    /* renamed from: a  reason: collision with other field name */
    private Context f861a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f864a;

    /* renamed from: b  reason: collision with other field name */
    private Messenger f865b;
    private static String b = hs.a(5) + "-";

    /* renamed from: a  reason: collision with root package name */
    private static long f24604a = 0;

    /* renamed from: a  reason: collision with other field name */
    private Messenger f862a = null;

    /* renamed from: a  reason: collision with other field name */
    private List<Message> f863a = new ArrayList();

    /* renamed from: b  reason: collision with other field name */
    private boolean f866b = false;

    private ServiceClient(Context context) {
        this.f864a = false;
        this.f861a = context.getApplicationContext();
        if (m2221a()) {
            com.xiaomi.channel.commonutils.logger.b.c("use miui push service");
            this.f864a = true;
        }
    }

    private Intent a() {
        if (!isMiuiPushServiceEnabled()) {
            Intent intent = new Intent(this.f861a, XMPushService.class);
            intent.putExtra(bj.E, this.f861a.getPackageName());
            b();
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setPackage("com.xiaomi.xmsf");
        intent2.setClassName("com.xiaomi.xmsf", m2217a());
        intent2.putExtra(bj.E, this.f861a.getPackageName());
        m2219a();
        return intent2;
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a  reason: collision with other method in class */
    private String m2217a() {
        try {
            return this.f861a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            if (i < map.size()) {
                sb.append(",");
            }
            i++;
        }
        return sb.toString();
    }

    private Map<String, String> a(List<NameValuePair> list) {
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                if (nameValuePair != null) {
                    hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m2219a() {
        this.f861a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f861a, XMPushService.class), 2, 1);
    }

    /* renamed from: a  reason: collision with other method in class */
    private synchronized void m2220a(Intent intent) {
        if (this.f866b) {
            Message a2 = a(intent);
            if (this.f863a.size() >= 50) {
                this.f863a.remove(0);
            }
            this.f863a.add(a2);
        } else if (this.f865b == null) {
            this.f861a.bindService(intent, new bv(this), 1);
            this.f866b = true;
            this.f863a.clear();
            this.f863a.add(a(intent));
        } else {
            try {
                this.f865b.send(a(intent));
            } catch (RemoteException unused) {
                this.f865b = null;
                this.f866b = false;
            }
        }
    }

    private void a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(bj.r, str);
        intent.putExtra(bj.u, str2);
        intent.putExtra(bj.y, str3);
        intent.putExtra(bj.A, str5);
        intent.putExtra(bj.z, str4);
        intent.putExtra(bj.B, z);
        intent.putExtra(bj.I, f860a);
        intent.putExtra(bj.M, this.f862a);
        if (map != null && map.size() > 0) {
            String a2 = a(map);
            if (!TextUtils.isEmpty(a2)) {
                intent.putExtra(bj.C, a2);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String a3 = a(map2);
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        intent.putExtra(bj.D, a3);
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m2221a() {
        if (com.xiaomi.push.aa.f88a) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f861a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    private void b() {
        this.f861a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f861a, XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (f859a == null) {
            f859a = new ServiceClient(context);
        }
        return f859a;
    }

    public static String getSession() {
        return f860a;
    }

    public static void setSession(String str) {
        f860a = str;
    }

    public boolean batchSendMessage(hg[] hgVarArr, boolean z) {
        if (!com.xiaomi.push.bg.b(this.f861a)) {
            return false;
        }
        Intent a2 = a();
        Bundle[] bundleArr = new Bundle[hgVarArr.length];
        for (int i = 0; i < hgVarArr.length; i++) {
            String a3 = fi.a();
            if (!TextUtils.isEmpty(a3)) {
                String[] strArr = null;
                he heVar = new he("pf", null, strArr, strArr);
                he heVar2 = new he("sent", null, strArr, strArr);
                heVar2.m2003a(a3);
                heVar.a(heVar2);
                hgVarArr[i].a(heVar);
            }
            com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hgVarArr[i].mo2009a());
            bundleArr[i] = hgVarArr[i].mo2009a();
        }
        if (bundleArr.length <= 0) {
            return false;
        }
        a2.setAction(bj.g);
        a2.putExtra(bj.I, f860a);
        a2.putExtra("ext_packets", bundleArr);
        a2.putExtra("ext_encrypt", z);
        return startServiceSafely(a2);
    }

    public void checkAlive() {
        Intent a2 = a();
        a2.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(a2);
    }

    public boolean closeChannel() {
        Intent a2 = a();
        a2.setAction(bj.i);
        return startServiceSafely(a2);
    }

    public boolean closeChannel(String str) {
        Intent a2 = a();
        a2.setAction(bj.i);
        a2.putExtra(bj.u, str);
        return startServiceSafely(a2);
    }

    public boolean closeChannel(String str, String str2) {
        Intent a2 = a();
        a2.setAction(bj.i);
        a2.putExtra(bj.u, str);
        a2.putExtra(bj.r, str2);
        return startServiceSafely(a2);
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z, a(list), a(list2));
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent a2 = a();
        a2.setAction(bj.j);
        a(a2, str, str2, str3, str4, str5, z, map, map2);
        return startServiceSafely(a2);
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f864a;
    }

    public boolean notifyMessage(Bundle bundle, String str, String str2) {
        if (bundle == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Failed to notify message: bundle|userId|chid may be empty");
            return false;
        }
        Intent a2 = a();
        if (bundle == null) {
            return false;
        }
        a2.setAction(bj.o);
        a2.putExtras(bundle);
        com.xiaomi.channel.commonutils.logger.b.e("notify: chid=" + str2 + " bundle:" + bundle);
        return startServiceSafely(a2);
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z) {
        Intent a2 = a();
        a2.setAction(bj.d);
        a(a2, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(a2);
        return 0;
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return openChannel(str, str2, str3, str4, str5, a(list), a(list2), z);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        resetConnection(str, str2, str3, str4, str5, z, a(list), a(list2));
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent a2 = a();
        a2.setAction(bj.k);
        a(a2, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(a2);
    }

    public boolean sendIQ(hf hfVar) {
        if (!com.xiaomi.push.bg.b(this.f861a)) {
            return false;
        }
        Intent a2 = a();
        Bundle mo2009a = hfVar.mo2009a();
        if (mo2009a == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hfVar.mo2009a());
        a2.setAction(bj.f);
        a2.putExtra(bj.I, f860a);
        a2.putExtra("ext_packet", mo2009a);
        return startServiceSafely(a2);
    }

    public boolean sendMessage(hg hgVar, boolean z) {
        if (!com.xiaomi.push.bg.b(this.f861a)) {
            return false;
        }
        Intent a2 = a();
        String a3 = fi.a();
        if (!TextUtils.isEmpty(a3)) {
            String[] strArr = null;
            he heVar = new he("pf", null, strArr, strArr);
            he heVar2 = new he("sent", null, strArr, strArr);
            heVar2.m2003a(a3);
            heVar.a(heVar2);
            hgVar.a(heVar);
        }
        Bundle mo2009a = hgVar.mo2009a();
        if (mo2009a == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hgVar.mo2009a());
        a2.setAction(bj.e);
        a2.putExtra(bj.I, f860a);
        a2.putExtra("ext_packet", mo2009a);
        a2.putExtra("ext_encrypt", z);
        return startServiceSafely(a2);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String str3;
        if (!com.xiaomi.push.bg.b(this.f861a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent a2 = a();
        if (bArr == null) {
            return false;
        }
        a2.setAction(bj.e);
        a2.putExtra(bj.I, f860a);
        a2.putExtra("ext_raw_packet", bArr);
        int indexOf = str.indexOf("@");
        String str4 = null;
        String substring = indexOf != -1 ? str.substring(0, indexOf) : null;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            str4 = str.substring(indexOf + 1, lastIndexOf);
            str3 = str.substring(lastIndexOf + 1);
        } else {
            str3 = null;
        }
        a2.putExtra(bj.r, substring);
        a2.putExtra(bj.s, str4);
        a2.putExtra(bj.t, str3);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        long j = f24604a;
        f24604a = 1 + j;
        sb.append(j);
        String sb2 = sb.toString();
        a2.putExtra("ext_pkt_id", sb2);
        a2.putExtra("ext_chid", str2);
        com.xiaomi.channel.commonutils.logger.b.e("SEND: chid=" + str2 + ", packetId=" + sb2);
        return startServiceSafely(a2);
    }

    public boolean sendPresence(hj hjVar) {
        if (!com.xiaomi.push.bg.b(this.f861a)) {
            return false;
        }
        Intent a2 = a();
        Bundle mo2009a = hjVar.mo2009a();
        if (mo2009a == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + hjVar.mo2009a());
        a2.setAction(bj.h);
        a2.putExtra(bj.I, f860a);
        a2.putExtra("ext_packet", mo2009a);
        return startServiceSafely(a2);
    }

    public void setMessenger(Messenger messenger) {
        this.f862a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (com.xiaomi.push.j.m2117a() || Build.VERSION.SDK_INT < 26) {
                this.f861a.startService(intent);
                return true;
            }
            m2220a(intent);
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    @Deprecated
    public void updateChannelInfo(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        updateChannelInfo(str, a(list), a(list2));
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent a2 = a();
        a2.setAction(bj.l);
        if (map != null) {
            String a3 = a(map);
            if (!TextUtils.isEmpty(a3)) {
                a2.putExtra(bj.C, a3);
            }
        }
        if (map2 != null) {
            String a4 = a(map2);
            if (!TextUtils.isEmpty(a4)) {
                a2.putExtra(bj.D, a4);
            }
        }
        a2.putExtra(bj.u, str);
        startServiceSafely(a2);
    }
}
