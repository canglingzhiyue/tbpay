package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.bm;
import com.xiaomi.push.bu;
import com.xiaomi.push.di;
import com.xiaomi.push.fc;
import com.xiaomi.push.fd;
import com.xiaomi.push.fn;
import com.xiaomi.push.ic;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.io;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.is;
import com.xiaomi.push.it;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.iz;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.jf;
import com.xiaomi.push.jh;
import com.xiaomi.push.jj;
import com.xiaomi.push.jl;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.js;
import com.xiaomi.push.service.ax;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes9.dex */
public class am {

    /* renamed from: a  reason: collision with root package name */
    private static am f24310a;

    /* renamed from: a  reason: collision with other field name */
    private static Object f45a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static Queue<String> f46a;

    /* renamed from: a  reason: collision with other field name */
    private Context f47a;

    private am(Context context) {
        this.f47a = context.getApplicationContext();
        if (this.f47a == null) {
            this.f47a = context;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        return com.xiaomi.push.service.al.b(context, str, map, i);
    }

    private PushMessageHandler.a a(iy iyVar, boolean z, byte[] bArr, String str, int i, Intent intent) {
        fd a2;
        String packageName;
        String m1919a;
        int i2;
        String str2;
        MiPushMessage miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        miPushMessage = null;
        ArrayList arrayList3 = null;
        miPushMessage = null;
        try {
            jn a3 = ai.a(this.f47a, iyVar);
            if (a3 == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized message. " + iyVar.f658a);
                fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, "18");
                s.c(this.f47a, iyVar, z);
                return null;
            }
            ic a4 = iyVar.a();
            com.xiaomi.channel.commonutils.logger.b.m1618a("processing a message, action=", a4, ", hasNotified=", Boolean.valueOf(z));
            switch (an.f24311a[a4.ordinal()]) {
                case 1:
                    if (!iyVar.m2110b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    } else if (b.m1665a(this.f47a).m1676e() && !z) {
                        com.xiaomi.channel.commonutils.logger.b.m1616a("receive a message in pause state. drop it");
                        fd.a(this.f47a).a(this.f47a.getPackageName(), fc.m1919a(i), str, "12");
                        return null;
                    } else {
                        jf jfVar = (jf) a3;
                        io a5 = jfVar.a();
                        if (a5 == null) {
                            com.xiaomi.channel.commonutils.logger.b.d("receive an empty message without push content, drop it");
                            fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, AgooConstants.REPORT_ENCRYPT_FAIL);
                            s.d(this.f47a, iyVar, z);
                            return null;
                        }
                        int intExtra = intent.getIntExtra("notification_click_button", 0);
                        if (z) {
                            if (com.xiaomi.push.service.al.m2275a(iyVar)) {
                                MiPushClient.reportIgnoreRegMessageClicked(this.f47a, a5.m2060a(), iyVar.m2102a(), iyVar.f665b, a5.b());
                            } else {
                                ip ipVar = iyVar.m2102a() != null ? new ip(iyVar.m2102a()) : new ip();
                                if (ipVar.m2069a() == null) {
                                    ipVar.a(new HashMap());
                                }
                                ipVar.m2069a().put("notification_click_button", String.valueOf(intExtra));
                                MiPushClient.reportMessageClicked(this.f47a, a5.m2060a(), ipVar, a5.b());
                            }
                        }
                        if (!z) {
                            if (!TextUtils.isEmpty(jfVar.d()) && MiPushClient.aliasSetTime(this.f47a, jfVar.d()) < 0) {
                                MiPushClient.addAlias(this.f47a, jfVar.d());
                            } else if (!TextUtils.isEmpty(jfVar.c()) && MiPushClient.topicSubscribedTime(this.f47a, jfVar.c()) < 0) {
                                MiPushClient.addTopic(this.f47a, jfVar.c());
                            }
                        }
                        String str3 = (iyVar.f659a == null || iyVar.f659a.m2069a() == null) ? null : iyVar.f659a.f573a.get("jobkey");
                        String str4 = str3;
                        if (TextUtils.isEmpty(str3)) {
                            str3 = a5.m2060a();
                        }
                        if (z || !m1644a(this.f47a, str3)) {
                            MiPushMessage generateMessage = PushMessageHelper.generateMessage(jfVar, iyVar.m2102a(), z);
                            if (generateMessage.getPassThrough() == 0 && !z && com.xiaomi.push.service.al.m2276a(generateMessage.getExtra())) {
                                com.xiaomi.push.service.al.m2271a(this.f47a, iyVar, bArr);
                                return null;
                            }
                            String a6 = com.xiaomi.push.service.al.a(generateMessage.getExtra(), intExtra);
                            com.xiaomi.channel.commonutils.logger.b.m1618a("receive a message, msgid=", a5.m2060a(), ", jobkey=", str3, ", btn=", Integer.valueOf(intExtra), ", typeId=", a6, ", hasNotified=", Boolean.valueOf(z));
                            if (z && generateMessage.getExtra() != null && !TextUtils.isEmpty(a6)) {
                                Map<String, String> extra = generateMessage.getExtra();
                                if (intExtra != 0 && iyVar.m2102a() != null) {
                                    ao.a(this.f47a).a(iyVar.m2102a().c(), intExtra);
                                }
                                if (com.xiaomi.push.service.al.m2275a(iyVar)) {
                                    Intent a7 = a(this.f47a, iyVar.f665b, extra, intExtra);
                                    a7.putExtra("eventMessageType", i);
                                    a7.putExtra("messageId", str);
                                    a7.putExtra("jobkey", str4);
                                    if (a7 == null) {
                                        com.xiaomi.channel.commonutils.logger.b.m1616a("Getting Intent fail from ignore reg message. ");
                                        fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, AgooConstants.REPORT_DUPLICATE_FAIL);
                                        return null;
                                    }
                                    String c = a5.c();
                                    if (!TextUtils.isEmpty(c)) {
                                        a7.putExtra("payload", c);
                                    }
                                    this.f47a.startActivity(a7);
                                    s.a(this.f47a, iyVar);
                                    fd.a(this.f47a).a(this.f47a.getPackageName(), fc.m1919a(i), str, 3006, a6);
                                    com.xiaomi.channel.commonutils.logger.b.m1617a("PushMessageProcessor", "start business activity succ");
                                } else {
                                    Context context = this.f47a;
                                    Intent a8 = a(context, context.getPackageName(), extra, intExtra);
                                    if (a8 != null) {
                                        if (!a6.equals(bj.c)) {
                                            a8.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                            a8.putExtra("eventMessageType", i);
                                            a8.putExtra("messageId", str);
                                            a8.putExtra("jobkey", str4);
                                        }
                                        this.f47a.startActivity(a8);
                                        s.a(this.f47a, iyVar);
                                        com.xiaomi.channel.commonutils.logger.b.m1617a("PushMessageProcessor", "start activity succ");
                                        fd.a(this.f47a).a(this.f47a.getPackageName(), fc.m1919a(i), str, 1006, a6);
                                        if (a6.equals(bj.c)) {
                                            fd.a(this.f47a).a(this.f47a.getPackageName(), fc.m1919a(i), str, AgooConstants.ACK_FLAG_NULL);
                                        }
                                    } else {
                                        com.xiaomi.channel.commonutils.logger.b.c("PushMessageProcessor", "missing target intent for message: " + a5.m2060a() + ", typeId=" + a6);
                                    }
                                }
                                com.xiaomi.channel.commonutils.logger.b.m1617a("PushMessageProcessor", "pre-def msg process done.");
                                return null;
                            }
                            miPushMessage = generateMessage;
                        } else {
                            com.xiaomi.channel.commonutils.logger.b.m1616a("drop a duplicate message, key=" + str3);
                            fd a9 = fd.a(this.f47a);
                            String packageName2 = this.f47a.getPackageName();
                            String m1919a2 = fc.m1919a(i);
                            a9.c(packageName2, m1919a2, str, "2:" + str3);
                        }
                        if (iyVar.m2102a() == null && !z) {
                            a(jfVar, iyVar);
                            break;
                        }
                    }
                    break;
                case 2:
                    jd jdVar = (jd) a3;
                    String str5 = b.m1665a(this.f47a).f65a;
                    if (TextUtils.isEmpty(str5) || !TextUtils.equals(str5, jdVar.m2142a())) {
                        com.xiaomi.channel.commonutils.logger.b.m1616a("bad Registration result:");
                        fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, AgooConstants.REPORT_MESSAGE_NULL);
                        return null;
                    }
                    long m1654a = ao.a(this.f47a).m1654a();
                    if (m1654a > 0 && SystemClock.elapsedRealtime() - m1654a > QrCodeData.QR_CODE_VALID_PERIOD) {
                        com.xiaomi.channel.commonutils.logger.b.m1616a("The received registration result has expired.");
                        fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, "26");
                        return null;
                    }
                    b.m1665a(this.f47a).f65a = null;
                    if (jdVar.f722a == 0) {
                        b.m1665a(this.f47a).b(jdVar.f734e, jdVar.f735f, jdVar.f741l);
                        FCMPushHelper.persistIfXmsfSupDecrypt(this.f47a);
                        a2 = fd.a(this.f47a);
                        packageName = this.f47a.getPackageName();
                        m1919a = fc.m1919a(i);
                        i2 = 6006;
                        str2 = "1";
                    } else {
                        a2 = fd.a(this.f47a);
                        packageName = this.f47a.getPackageName();
                        m1919a = fc.m1919a(i);
                        i2 = 6006;
                        str2 = "2";
                    }
                    a2.a(packageName, m1919a, str, i2, str2);
                    if (!TextUtils.isEmpty(jdVar.f734e)) {
                        arrayList3 = new ArrayList();
                        arrayList3.add(jdVar.f734e);
                    }
                    MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f362a, arrayList3, jdVar.f722a, jdVar.f733d, null, jdVar.m2143a());
                    ao.a(this.f47a).m1663d();
                    return generateCommandMessage;
                case 3:
                    if (!iyVar.m2110b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((jj) a3).f800a == 0) {
                        b.m1665a(this.f47a).m1667a();
                        MiPushClient.clearExtras(this.f47a);
                    }
                    PushMessageHandler.a();
                    break;
                case 4:
                    jh jhVar = (jh) a3;
                    if (jhVar.f775a == 0) {
                        MiPushClient.addTopic(this.f47a, jhVar.b());
                    }
                    if (!TextUtils.isEmpty(jhVar.b())) {
                        arrayList2 = new ArrayList();
                        arrayList2.add(jhVar.b());
                    }
                    com.xiaomi.channel.commonutils.logger.b.e("resp-cmd:" + fn.COMMAND_SUBSCRIBE_TOPIC + ", " + jhVar.a());
                    return PushMessageHelper.generateCommandMessage(fn.COMMAND_SUBSCRIBE_TOPIC.f362a, arrayList2, jhVar.f775a, jhVar.f781d, jhVar.c(), null);
                case 5:
                    jl jlVar = (jl) a3;
                    if (jlVar.f820a == 0) {
                        MiPushClient.removeTopic(this.f47a, jlVar.b());
                    }
                    if (!TextUtils.isEmpty(jlVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(jlVar.b());
                    }
                    com.xiaomi.channel.commonutils.logger.b.e("resp-cmd:" + fn.COMMAND_UNSUBSCRIBE_TOPIC + ", " + jlVar.a());
                    return PushMessageHelper.generateCommandMessage(fn.COMMAND_UNSUBSCRIBE_TOPIC.f362a, arrayList, jlVar.f820a, jlVar.f826d, jlVar.c(), null);
                case 6:
                    di.a(this.f47a.getPackageName(), this.f47a, a3, ic.Command, bArr.length);
                    ix ixVar = (ix) a3;
                    String b = ixVar.b();
                    List<String> m2096a = ixVar.m2096a();
                    if (ixVar.f646a == 0) {
                        if (TextUtils.equals(b, fn.COMMAND_SET_ACCEPT_TIME.f362a) && m2096a != null && m2096a.size() > 1) {
                            MiPushClient.addAcceptTime(this.f47a, m2096a.get(0), m2096a.get(1));
                            if (!"00:00".equals(m2096a.get(0)) || !"00:00".equals(m2096a.get(1))) {
                                b.m1665a(this.f47a).a(false);
                            } else {
                                b.m1665a(this.f47a).a(true);
                            }
                            m2096a = a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), m2096a);
                        } else if (TextUtils.equals(b, fn.COMMAND_SET_ALIAS.f362a) && m2096a != null && m2096a.size() > 0) {
                            MiPushClient.addAlias(this.f47a, m2096a.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_UNSET_ALIAS.f362a) && m2096a != null && m2096a.size() > 0) {
                            MiPushClient.removeAlias(this.f47a, m2096a.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_SET_ACCOUNT.f362a) && m2096a != null && m2096a.size() > 0) {
                            MiPushClient.addAccount(this.f47a, m2096a.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_UNSET_ACCOUNT.f362a) && m2096a != null && m2096a.size() > 0) {
                            MiPushClient.removeAccount(this.f47a, m2096a.get(0));
                        } else if (TextUtils.equals(b, fn.COMMAND_CHK_VDEVID.f362a)) {
                            return null;
                        }
                    }
                    List<String> list = m2096a;
                    com.xiaomi.channel.commonutils.logger.b.e("resp-cmd:" + b + ", " + ixVar.a());
                    return PushMessageHelper.generateCommandMessage(b, list, ixVar.f646a, ixVar.f654d, ixVar.c(), null);
                case 7:
                    di.a(this.f47a.getPackageName(), this.f47a, a3, ic.Notification, bArr.length);
                    if (a3 instanceof it) {
                        it itVar = (it) a3;
                        String a10 = itVar.a();
                        com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + itVar.b() + ", code:" + itVar.f616a + ", " + a10);
                        if (im.DisablePushMessage.f538a.equalsIgnoreCase(itVar.f623d)) {
                            if (itVar.f616a == 0) {
                                synchronized (af.class) {
                                    if (af.a(this.f47a).m1643a(a10)) {
                                        af.a(this.f47a).c(a10);
                                        if ("syncing".equals(af.a(this.f47a).a(au.DISABLE_PUSH))) {
                                            af.a(this.f47a).a(au.DISABLE_PUSH, "synced");
                                            MiPushClient.clearNotification(this.f47a);
                                            MiPushClient.clearLocalNotificationType(this.f47a);
                                            PushMessageHandler.a();
                                            ao.a(this.f47a).m1660b();
                                        }
                                    }
                                }
                                break;
                            } else if ("syncing".equals(af.a(this.f47a).a(au.DISABLE_PUSH))) {
                                synchronized (af.class) {
                                    if (af.a(this.f47a).m1643a(a10)) {
                                        if (af.a(this.f47a).a(a10) < 10) {
                                            af.a(this.f47a).b(a10);
                                            ao.a(this.f47a).a(true, a10);
                                        } else {
                                            af.a(this.f47a).c(a10);
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (im.EnablePushMessage.f538a.equalsIgnoreCase(itVar.f623d)) {
                            if (itVar.f616a == 0) {
                                synchronized (af.class) {
                                    if (af.a(this.f47a).m1643a(a10)) {
                                        af.a(this.f47a).c(a10);
                                        if ("syncing".equals(af.a(this.f47a).a(au.ENABLE_PUSH))) {
                                            af.a(this.f47a).a(au.ENABLE_PUSH, "synced");
                                        }
                                    }
                                }
                                break;
                            } else if ("syncing".equals(af.a(this.f47a).a(au.ENABLE_PUSH))) {
                                synchronized (af.class) {
                                    if (af.a(this.f47a).m1643a(a10)) {
                                        if (af.a(this.f47a).a(a10) < 10) {
                                            af.a(this.f47a).b(a10);
                                            ao.a(this.f47a).a(false, a10);
                                        } else {
                                            af.a(this.f47a).c(a10);
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (im.ThirdPartyRegUpdate.f538a.equalsIgnoreCase(itVar.f623d)) {
                            b(itVar);
                            break;
                        } else if (im.UploadTinyData.f538a.equalsIgnoreCase(itVar.f623d)) {
                            a(itVar);
                            break;
                        }
                        af.a(this.f47a).c(a10);
                        break;
                    } else if (a3 instanceof jb) {
                        jb jbVar = (jb) a3;
                        if ("registration id expired".equalsIgnoreCase(jbVar.f683d)) {
                            List<String> allAlias = MiPushClient.getAllAlias(this.f47a);
                            List<String> allTopic = MiPushClient.getAllTopic(this.f47a);
                            List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f47a);
                            String acceptTime = MiPushClient.getAcceptTime(this.f47a);
                            com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + jbVar.f683d + ", " + jbVar.m2128a());
                            MiPushClient.reInitialize(this.f47a, iq.RegIdExpired);
                            for (String str6 : allAlias) {
                                MiPushClient.removeAlias(this.f47a, str6);
                                MiPushClient.setAlias(this.f47a, str6, null);
                            }
                            for (String str7 : allTopic) {
                                MiPushClient.removeTopic(this.f47a, str7);
                                MiPushClient.subscribe(this.f47a, str7, null);
                            }
                            for (String str8 : allUserAccount) {
                                MiPushClient.removeAccount(this.f47a, str8);
                                MiPushClient.setUserAccount(this.f47a, str8, null);
                            }
                            String[] split = acceptTime.split(",");
                            if (split.length == 2) {
                                MiPushClient.removeAcceptTime(this.f47a);
                                MiPushClient.addAcceptTime(this.f47a, split[0], split[1]);
                                break;
                            }
                        } else if (im.ClientInfoUpdateOk.f538a.equalsIgnoreCase(jbVar.f683d)) {
                            if (jbVar.m2129a() != null && jbVar.m2129a().containsKey("app_version")) {
                                b.m1665a(this.f47a).m1668a(jbVar.m2129a().get("app_version"));
                                break;
                            }
                        } else if (im.AwakeApp.f538a.equalsIgnoreCase(jbVar.f683d)) {
                            if (iyVar.m2110b() && jbVar.m2129a() != null && jbVar.m2129a().containsKey("awake_info")) {
                                Context context2 = this.f47a;
                                o.a(context2, b.m1665a(context2).m1666a(), az.a(this.f47a).a(ih.AwakeInfoUploadWaySwitch.a(), 0), jbVar.m2129a().get("awake_info"));
                                break;
                            }
                        } else {
                            try {
                                if (im.NormalClientConfigUpdate.f538a.equalsIgnoreCase(jbVar.f683d)) {
                                    ja jaVar = new ja();
                                    jm.a(jaVar, jbVar.m2134a());
                                    ba.a(az.a(this.f47a), jaVar);
                                } else if (im.CustomClientConfigUpdate.f538a.equalsIgnoreCase(jbVar.f683d)) {
                                    iz izVar = new iz();
                                    jm.a(izVar, jbVar.m2134a());
                                    ba.a(az.a(this.f47a), izVar);
                                } else if (im.SyncInfoResult.f538a.equalsIgnoreCase(jbVar.f683d)) {
                                    av.a(this.f47a, jbVar);
                                    break;
                                } else if (im.ForceSync.f538a.equalsIgnoreCase(jbVar.f683d)) {
                                    com.xiaomi.channel.commonutils.logger.b.m1616a("receive force sync notification");
                                    av.a(this.f47a, false);
                                    break;
                                } else if (im.CancelPushMessage.f538a.equals(jbVar.f683d)) {
                                    com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + jbVar.f683d + ", " + jbVar.m2128a());
                                    if (jbVar.m2129a() != null) {
                                        int i3 = -2;
                                        if (jbVar.m2129a().containsKey(bj.P)) {
                                            String str9 = jbVar.m2129a().get(bj.P);
                                            if (!TextUtils.isEmpty(str9)) {
                                                try {
                                                    i3 = Integer.parseInt(str9);
                                                } catch (NumberFormatException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i3 >= -1) {
                                            MiPushClient.clearNotification(this.f47a, i3);
                                        } else {
                                            MiPushClient.clearNotification(this.f47a, jbVar.m2129a().containsKey(bj.N) ? jbVar.m2129a().get(bj.N) : "", jbVar.m2129a().containsKey(bj.O) ? jbVar.m2129a().get(bj.O) : "");
                                        }
                                    }
                                    a(jbVar);
                                    break;
                                } else {
                                    try {
                                        if (im.HybridRegisterResult.f538a.equals(jbVar.f683d)) {
                                            jd jdVar2 = new jd();
                                            jm.a(jdVar2, jbVar.m2134a());
                                            MiPushClient4Hybrid.onReceiveRegisterResult(this.f47a, jdVar2);
                                        } else if (im.HybridUnregisterResult.f538a.equals(jbVar.f683d)) {
                                            jj jjVar = new jj();
                                            jm.a(jjVar, jbVar.m2134a());
                                            MiPushClient4Hybrid.onReceiveUnregisterResult(this.f47a, jjVar);
                                        } else if (!im.PushLogUpload.f538a.equals(jbVar.f683d)) {
                                            if (im.DetectAppAlive.f538a.equals(jbVar.f683d)) {
                                                com.xiaomi.channel.commonutils.logger.b.b("receive detect msg");
                                                b(jbVar);
                                                break;
                                            } else if (com.xiaomi.push.service.j.a(jbVar)) {
                                                com.xiaomi.channel.commonutils.logger.b.b("receive notification handle by cpra");
                                                break;
                                            }
                                        }
                                        break;
                                    } catch (js e2) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e2);
                                        break;
                                    }
                                }
                                break;
                            } catch (js unused) {
                                break;
                            }
                        }
                    }
                    break;
            }
            return miPushMessage;
        } catch (u e3) {
            com.xiaomi.channel.commonutils.logger.b.a(e3);
            a(iyVar);
            fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, "19");
            s.c(this.f47a, iyVar, z);
            return null;
        } catch (js e4) {
            com.xiaomi.channel.commonutils.logger.b.a(e4);
            com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. is the reg expired?");
            fd.a(this.f47a).b(this.f47a.getPackageName(), fc.m1919a(i), str, "20");
            s.c(this.f47a, iyVar, z);
            return null;
        }
    }

    private PushMessageHandler.a a(iy iyVar, byte[] bArr) {
        String str;
        jn a2;
        String str2 = null;
        try {
            a2 = ai.a(this.f47a, iyVar);
        } catch (u e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (js e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an un-recognized message. " + iyVar.f658a);
            return null;
        }
        ic a3 = iyVar.a();
        com.xiaomi.channel.commonutils.logger.b.m1616a("message arrived: processing an arrived message, action=" + a3);
        if (an.f24311a[a3.ordinal()] != 1) {
            return null;
        }
        if (!iyVar.m2110b()) {
            str = "message arrived: receiving an un-encrypt message(SendMessage).";
        } else {
            jf jfVar = (jf) a2;
            io a4 = jfVar.a();
            if (a4 != null) {
                if (iyVar.f659a != null && iyVar.f659a.m2069a() != null) {
                    str2 = iyVar.f659a.f573a.get("jobkey");
                }
                MiPushMessage generateMessage = PushMessageHelper.generateMessage(jfVar, iyVar.m2102a(), false);
                generateMessage.setArrivedMessage(true);
                com.xiaomi.channel.commonutils.logger.b.m1616a("message arrived: receive a message, msgid=" + a4.m2060a() + ", jobkey=" + str2);
                return generateMessage;
            }
            str = "message arrived: receive an empty message without push content, drop it";
        }
        com.xiaomi.channel.commonutils.logger.b.d(str);
        return null;
    }

    public static am a(Context context) {
        if (f24310a == null) {
            f24310a = new am(context);
        }
        return f24310a;
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f47a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE) {
            MiPushClient.reInitialize(this.f47a, iq.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    public static void a(Context context, String str) {
        synchronized (f45a) {
            f46a.remove(str);
            b.m1665a(context);
            SharedPreferences a2 = b.a(context);
            String a3 = bm.a(f46a, ",");
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            com.xiaomi.push.p.a(edit);
        }
    }

    private void a(it itVar) {
        String a2 = itVar.a();
        com.xiaomi.channel.commonutils.logger.b.b("receive ack " + a2);
        Map<String, String> m2083a = itVar.m2083a();
        if (m2083a != null) {
            String str = m2083a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.b("receive ack : messageId = " + a2 + "  realSource = " + str);
            bu.a(this.f47a).a(a2, str, Boolean.valueOf(itVar.f616a == 0));
        }
    }

    private void a(iy iyVar) {
        com.xiaomi.channel.commonutils.logger.b.m1616a("receive a message but decrypt failed. report now.");
        jb jbVar = new jb(iyVar.m2102a().f571a, false);
        jbVar.c(im.DecryptMessageFail.f538a);
        jbVar.b(iyVar.m2103a());
        jbVar.d(iyVar.f665b);
        jbVar.f678a = new HashMap();
        jbVar.f678a.put(com.taobao.accs.common.Constants.SP_KEY_REG_ID, MiPushClient.getRegId(this.f47a));
        ao.a(this.f47a).a((ao) jbVar, ic.Notification, false, (ip) null);
    }

    private void a(jb jbVar) {
        it itVar = new it();
        itVar.c(im.CancelPushMessageACK.f538a);
        itVar.a(jbVar.m2128a());
        itVar.a(jbVar.a());
        itVar.b(jbVar.b());
        itVar.e(jbVar.c());
        itVar.a(0L);
        itVar.d("success clear push message.");
        ao.a(this.f47a).a(itVar, ic.Notification, false, true, null, false, this.f47a.getPackageName(), b.m1665a(this.f47a).m1666a(), false);
    }

    private void a(jf jfVar, iy iyVar) {
        ip m2102a = iyVar.m2102a();
        if (m2102a != null) {
            m2102a = bs.a(m2102a.m2067a());
        }
        is isVar = new is();
        isVar.b(jfVar.b());
        isVar.a(jfVar.m2151a());
        isVar.a(jfVar.a().a());
        if (!TextUtils.isEmpty(jfVar.c())) {
            isVar.c(jfVar.c());
        }
        if (!TextUtils.isEmpty(jfVar.d())) {
            isVar.d(jfVar.d());
        }
        isVar.a(jm.m2179a(this.f47a, iyVar));
        ao.a(this.f47a).a((ao) isVar, ic.AckMessage, m2102a);
    }

    private void a(String str, long j, e eVar) {
        au a2 = l.a(eVar);
        if (a2 == null) {
            return;
        }
        if (j == 0) {
            synchronized (af.class) {
                if (af.a(this.f47a).m1643a(str)) {
                    af.a(this.f47a).c(str);
                    if ("syncing".equals(af.a(this.f47a).a(a2))) {
                        af.a(this.f47a).a(a2, "synced");
                    }
                }
            }
        } else if (!"syncing".equals(af.a(this.f47a).a(a2))) {
            af.a(this.f47a).c(str);
        } else {
            synchronized (af.class) {
                if (af.a(this.f47a).m1643a(str)) {
                    if (af.a(this.f47a).a(str) < 10) {
                        af.a(this.f47a).b(str);
                        ao.a(this.f47a).a(str, a2, eVar, "retry");
                    } else {
                        af.a(this.f47a).c(str);
                    }
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1644a(Context context, String str) {
        synchronized (f45a) {
            b.m1665a(context);
            SharedPreferences a2 = b.a(context);
            if (f46a == null) {
                String[] split = a2.getString("pref_msg_ids", "").split(",");
                f46a = new LinkedList();
                for (String str2 : split) {
                    f46a.add(str2);
                }
            }
            if (f46a.contains(str)) {
                return true;
            }
            f46a.add(str);
            if (f46a.size() > 25) {
                f46a.poll();
            }
            String a3 = bm.a(f46a, ",");
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            com.xiaomi.push.p.a(edit);
            return false;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m1645a(iy iyVar) {
        Map<String, String> m2069a = iyVar.m2102a() == null ? null : iyVar.m2102a().m2069a();
        if (m2069a == null) {
            return false;
        }
        String str = m2069a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }

    private void b(it itVar) {
        long j;
        e eVar;
        com.xiaomi.channel.commonutils.logger.b.c("ASSEMBLE_PUSH : " + itVar.toString());
        String a2 = itVar.a();
        Map<String, String> m2083a = itVar.m2083a();
        if (m2083a != null) {
            String str = m2083a.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + ag.FCM.name())) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : receive fcm token sync ack");
                i.b(this.f47a, e.ASSEMBLE_PUSH_FCM, str);
                j = itVar.f616a;
                eVar = e.ASSEMBLE_PUSH_FCM;
            } else {
                if (!str.contains("brand:" + ag.HUAWEI.name())) {
                    if (!str.contains("channel:" + ag.HUAWEI.name())) {
                        if (!str.contains("brand:" + ag.OPPO.name())) {
                            if (!str.contains("channel:" + ag.OPPO.name())) {
                                if (!str.contains("brand:" + ag.VIVO.name())) {
                                    if (!str.contains("channel:" + ag.VIVO.name())) {
                                        return;
                                    }
                                }
                                com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                i.b(this.f47a, e.ASSEMBLE_PUSH_FTOS, str);
                                a(a2, itVar.f616a, e.ASSEMBLE_PUSH_FTOS);
                                return;
                            }
                        }
                        com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : receive COS token sync ack");
                        i.b(this.f47a, e.ASSEMBLE_PUSH_COS, str);
                        j = itVar.f616a;
                        eVar = e.ASSEMBLE_PUSH_COS;
                    }
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : receive hw token sync ack");
                i.b(this.f47a, e.ASSEMBLE_PUSH_HUAWEI, str);
                j = itVar.f616a;
                eVar = e.ASSEMBLE_PUSH_HUAWEI;
            }
            a(a2, j, eVar);
        }
    }

    private void b(iy iyVar) {
        ip m2102a = iyVar.m2102a();
        if (m2102a != null) {
            m2102a = bs.a(m2102a.m2067a());
        }
        is isVar = new is();
        isVar.b(iyVar.m2103a());
        isVar.a(m2102a.m2068a());
        isVar.a(m2102a.m2066a());
        if (!TextUtils.isEmpty(m2102a.m2073b())) {
            isVar.c(m2102a.m2073b());
        }
        isVar.a(jm.m2179a(this.f47a, iyVar));
        ao.a(this.f47a).a((ao) isVar, ic.AckMessage, false, m2102a);
    }

    private void b(jb jbVar) {
        Map<String, String> m2129a = jbVar.m2129a();
        if (m2129a == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("detect failed because null");
            return;
        }
        String str = (String) ax.a(m2129a, "pkgList", (Object) null);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("detect failed because empty");
            return;
        }
        Map<String, String> m1947a = com.xiaomi.push.g.m1947a(this.f47a, str);
        if (m1947a == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("detect failed because get status illegal");
            return;
        }
        String str2 = m1947a.get("alive");
        String str3 = m1947a.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.b("detect failed because no alive process");
            return;
        }
        jb jbVar2 = new jb();
        jbVar2.a(jbVar.m2128a());
        jbVar2.b(jbVar.b());
        jbVar2.d(jbVar.c());
        jbVar2.c(im.DetectAppAliveResult.f538a);
        jbVar2.f678a = new HashMap();
        jbVar2.f678a.put("alive", str2);
        if (Boolean.parseBoolean((String) ax.a(m2129a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            jbVar2.f678a.put("notAlive", str3);
        }
        ao.a(this.f47a).a((ao) jbVar2, ic.Notification, false, (ip) null);
    }

    public PushMessageHandler.a a(Intent intent) {
        String str;
        fd a2;
        String packageName;
        String str2;
        fd a3;
        String packageName2;
        String format;
        String action = intent.getAction();
        com.xiaomi.channel.commonutils.logger.b.m1616a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an empty message, drop");
                fd.a(this.f47a).a(this.f47a.getPackageName(), intent, "12");
                return null;
            }
            iy iyVar = new iy();
            try {
                jm.a(iyVar, byteArrayExtra);
                b m1665a = b.m1665a(this.f47a);
                ip m2102a = iyVar.m2102a();
                if (iyVar.a() == ic.SendMessage && m2102a != null && !m1665a.m1676e() && !booleanExtra) {
                    m2102a.a("mrt", stringExtra);
                    m2102a.a("mat", Long.toString(System.currentTimeMillis()));
                    if (!m1645a(iyVar)) {
                        b(iyVar);
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.b("this is a mina's message, ack later");
                        m2102a.a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(m2102a.m2066a()));
                        m2102a.a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) jm.m2179a(this.f47a, iyVar)));
                    }
                }
                String str3 = "";
                if (iyVar.a() == ic.SendMessage && !iyVar.m2110b()) {
                    if (com.xiaomi.push.service.al.m2275a(iyVar)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = iyVar.b();
                        if (m2102a != null) {
                            str3 = m2102a.m2068a();
                        }
                        objArr[1] = str3;
                        com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                        a3 = fd.a(this.f47a);
                        packageName2 = this.f47a.getPackageName();
                        format = String.format("13: %1$s", iyVar.b());
                    } else {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = iyVar.b();
                        if (m2102a != null) {
                            str3 = m2102a.m2068a();
                        }
                        objArr2[1] = str3;
                        com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                        a3 = fd.a(this.f47a);
                        packageName2 = this.f47a.getPackageName();
                        format = String.format("14: %1$s", iyVar.b());
                    }
                    a3.a(packageName2, intent, format);
                    s.a(this.f47a, iyVar, booleanExtra);
                    return null;
                } else if (iyVar.a() == ic.SendMessage && iyVar.m2110b() && com.xiaomi.push.service.al.m2275a(iyVar) && (!booleanExtra || m2102a == null || m2102a.m2069a() == null || !m2102a.m2069a().containsKey("notify_effect"))) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = iyVar.b();
                    if (m2102a != null) {
                        str3 = m2102a.m2068a();
                    }
                    objArr3[1] = str3;
                    com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                    fd.a(this.f47a).a(this.f47a.getPackageName(), intent, String.format("25: %1$s", iyVar.b()));
                    s.b(this.f47a, iyVar, booleanExtra);
                    return null;
                } else if (m1665a.m1674c() || iyVar.f658a == ic.Registration) {
                    if (!m1665a.m1674c() || !m1665a.m1677f()) {
                        return a(iyVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (iyVar.f658a != ic.UnRegistration) {
                        s.e(this.f47a, iyVar, booleanExtra);
                        MiPushClient.unregisterPush(this.f47a);
                    } else if (iyVar.m2110b()) {
                        m1665a.m1667a();
                        MiPushClient.clearExtras(this.f47a);
                        PushMessageHandler.a();
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt unregistration message");
                    }
                } else if (com.xiaomi.push.service.al.m2275a(iyVar)) {
                    return a(iyVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                } else {
                    s.e(this.f47a, iyVar, booleanExtra);
                    boolean m1675d = m1665a.m1675d();
                    com.xiaomi.channel.commonutils.logger.b.d("receive message without registration. need re-register!registered?" + m1675d);
                    fd.a(this.f47a).a(this.f47a.getPackageName(), intent, AgooConstants.ACK_PACK_ERROR);
                    if (m1675d) {
                        a();
                    }
                }
            } catch (js e) {
                e = e;
                a2 = fd.a(this.f47a);
                packageName = this.f47a.getPackageName();
                str2 = "16";
                a2.a(packageName, intent, str2);
                com.xiaomi.channel.commonutils.logger.b.a(e);
                return null;
            } catch (Exception e2) {
                e = e2;
                a2 = fd.a(this.f47a);
                packageName = this.f47a.getPackageName();
                str2 = "17";
                a2.a(packageName, intent, str2);
                com.xiaomi.channel.commonutils.logger.b.a(e);
                return null;
            }
        } else if ("com.xiaomi.mipush.ERROR".equals(action)) {
            MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
            iy iyVar2 = new iy();
            try {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 != null) {
                    jm.a(iyVar2, byteArrayExtra2);
                }
            } catch (js unused) {
            }
            miPushCommandMessage.setCommand(String.valueOf(iyVar2.a()));
            miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
            miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
            com.xiaomi.channel.commonutils.logger.b.d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
            return miPushCommandMessage;
        } else if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra3 == null) {
                com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an empty message, drop");
                return null;
            }
            iy iyVar3 = new iy();
            try {
                jm.a(iyVar3, byteArrayExtra3);
                b m1665a2 = b.m1665a(this.f47a);
                if (com.xiaomi.push.service.al.m2275a(iyVar3)) {
                    str = "message arrived: receive ignore reg message, ignore!";
                } else if (!m1665a2.m1674c()) {
                    str = "message arrived: receive message without registration. need unregister or re-register!";
                } else if (!m1665a2.m1674c() || !m1665a2.m1677f()) {
                    return a(iyVar3, byteArrayExtra3);
                } else {
                    str = "message arrived: app info is invalidated";
                }
                com.xiaomi.channel.commonutils.logger.b.d(str);
            } catch (Exception e3) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to deal with arrived message. " + e3);
            }
        }
        return null;
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long parseLong = ((((Long.parseLong(list.get(0).split(":")[0]) * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long parseLong2 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong / 60), Long.valueOf(parseLong % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong2 / 60), Long.valueOf(parseLong2 % 60)));
        return arrayList;
    }
}
