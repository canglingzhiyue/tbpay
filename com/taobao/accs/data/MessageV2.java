package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.n;
import java.io.UnsupportedEncodingException;
import org.android.agoo.common.Config;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes.dex */
public class MessageV2 extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_AAID = "aaid";
    private static final String KEY_COMMONID = "commonDeviceId";
    private static final String KEY_FLOATENABLE = "floatingEnable";
    private static final String KEY_LANGUAGE = "language";
    private static final String KEY_NOTIFYENABLE = "notifyEnable";
    private static final String KEY_OAID = "oaid";
    private static final String KEY_REGID = "regId";
    private static final String KEY_ROMINFO = "romInfo";
    private static final String KEY_SITE = "site";
    private static final String KEY_TOKEN = "deviceToken";
    private static final String KEY_UMID = "umidToken";
    private static final String KEY_UTDID = "utdid";
    private static final String KEY_VENDOR = "supportVendor";
    private static final String KEY_VERSION = "version";
    private static final String TAG = "BindAppMessageV2";
    public String aaid;
    public String commonDeviceId;
    public String deviceToken;
    public String floatingEnable;
    public String language;
    public String notifyEnable;
    public String regId;
    public String romInfo;
    public String site;
    public String umidToken;
    public String supportVendor = "0";
    public String version = "2";

    static {
        kge.a(1030951720);
    }

    @Override // com.taobao.accs.data.Message
    public void buildData() throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c486bbf", new Object[]{this});
        } else if (this.command == null || this.command.intValue() == 100 || this.command.intValue() == 102) {
        } else {
            Context context = GlobalClientInfo.getContext();
            String q = l.q(context);
            if (StringUtils.isEmpty(q)) {
                this.regId = null;
                this.version = "1";
                ALog.e(TAG, "regid null, degrade to V1", new Object[0]);
            } else {
                ALog.i(TAG, "set again", "regId", this.regId, "id", q);
                this.regId = q;
            }
            switch (this.command.intValue()) {
                case 1:
                    this.data = buidJsonObject().a("version", this.version).a("deviceToken", this.deviceToken).a(KEY_NOTIFYENABLE, this.notifyEnable).a(KEY_ROMINFO, this.romInfo).a(KEY_FLOATENABLE, this.floatingEnable).a("umidToken", this.umidToken).a(KEY_AAID, this.aaid).a(KEY_COMMONID, this.commonDeviceId).a("regId", this.regId).a("utdid", UtilityImpl.getDeviceId(context)).a(KEY_VENDOR, this.supportVendor).a("oaid", UtilityImpl.getOAID(context)).a("language", this.language).a("site", this.site).a().toString().getBytes("utf-8");
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.data = buidJsonObject().a("regId", this.regId).a("utdid", UtilityImpl.getDeviceId(context)).a().toString().getBytes("utf-8");
                    return;
                default:
                    return;
            }
        }
    }

    public static MessageV2 buildBindApp(String str, String str2, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageV2) ipChange.ipc$dispatch("9c8f83a9", new Object[]{str, str2, context, intent});
        }
        Message buildBindApp = Message.buildBindApp(str, str2, context, intent);
        MessageV2 messageV2 = null;
        if (buildBindApp instanceof MessageV2) {
            messageV2 = (MessageV2) buildBindApp;
            messageV2.deviceToken = Config.getDeviceToken(context);
            String str3 = "1";
            messageV2.notifyEnable = "true".equals(com.taobao.accs.utl.c.f(context)) ? str3 : "0";
            UtilityImpl.saveNotificationState(context, Constants.SP_CHANNEL_FILE_NAME, messageV2.notifyEnable);
            messageV2.language = UtilityImpl.getLanguageTag(context);
            messageV2.site = UtilityImpl.getSite(context);
            UtilityImpl.saveStringPairsToSp(context, Constants.SP_FILE_NAME, Pair.create(Constants.KEY_LANGUAGE_TAG, messageV2.language), Pair.create("site", messageV2.site));
            messageV2.romInfo = n.b().a();
            messageV2.umidToken = getUmidToken(context);
            messageV2.regId = l.q(context);
            messageV2.floatingEnable = "true".equals(String.valueOf(com.taobao.accs.utl.c.g(context))) ? str3 : "0";
            if (!Launcher_InitPush.isSupportPush()) {
                str3 = "0";
            }
            messageV2.supportVendor = str3;
        }
        return messageV2;
    }

    private static String getUmidToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718eef", new Object[]{context});
        }
        int i = AccsClientConfig.mEnv;
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            i2 = 0;
        }
        try {
            return SecurityGuardManager.getInstance(context).getUMIDComp().getSecurityToken(i2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
