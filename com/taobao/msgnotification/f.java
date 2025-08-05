package com.taobao.msgnotification;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.taobao.util.k;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.base.ABService;
import com.taobao.message.notification.base.EnvService;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.BannerAssembleNotification;
import com.taobao.msgnotification.notifications.BannerPicNotification;
import com.taobao.msgnotification.notifications.PicPriceNotification;
import com.taobao.msgnotification.notifications.PicTextLargeExpandNotification;
import com.taobao.msgnotification.notifications.template.PicText;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.kge;
import tb.mst;
import tb.msu;
import tb.msv;
import tb.msy;
import tb.mto;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1870481565);
    }

    public static IOldAgooNotification a(Intent intent, Intent intent2, Context context) {
        IOldAgooNotification b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOldAgooNotification) ipChange.ipc$dispatch("4950ea9", new Object[]{intent, intent2, context});
        }
        if (intent == null) {
            return null;
        }
        MsgNotficationDTO a2 = msy.a(intent);
        Bundle b2 = msy.b(intent);
        String str = "";
        AppMonitor.Counter.commit("accs", "agoo_arrive_biz_id", b2 != null ? b2.getString("id") : str, mto.a.GEO_NOT_SUPPORT);
        String[] strArr = new String[2];
        strArr[0] = null;
        StringBuilder sb = new StringBuilder();
        sb.append("messageId=");
        sb.append(b2 != null ? b2.getString("id") : str);
        strArr[1] = sb.toString();
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_biz_id", null, null, strArr);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" agoo_arrive_biz_id, messageId=");
        if (b2 != null) {
            str = b2.getString("id");
        }
        sb2.append(str);
        TLog.loge("agoo_push", sb2.toString());
        if (a2 == null) {
            return null;
        }
        try {
            TLog.loge("AgooNotficationFactory", "AgooNotificationFactory view_type=" + a2.view_type + ",data.personalImgUrl=" + a2.personalImgUrl);
            if (Build.VERSION.SDK_INT < 24) {
                a2.sceneTemplateId = 131004;
                PicText picText = new PicText();
                picText.title = a2.title;
                picText.subTitle = a2.text;
                picText.bigIcon = a2.personalImgUrl;
                a2.sceneTemplateData = new JSONObject(JSON.toJSONString(picText));
            }
            a(b2, "newPushStyle", b() ? "1" : "0");
            return (a2.sceneTemplateId == -1 || !a() || (b = b(context, a2, b2, intent2)) == null) ? a(context, a2, b2, intent2) : b;
        } catch (Throwable th) {
            k.a("AgooNotficationFactory", "showSystemMsg is error,e=" + th.toString());
            TLog.loge("AgooNotficationFactory", Log.getStackTraceString(th));
            return null;
        }
    }

    private static IOldAgooNotification a(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOldAgooNotification) ipChange.ipc$dispatch("89b8f13d", new Object[]{context, msgNotficationDTO, bundle, intent});
        }
        int i = msgNotficationDTO.view_type;
        if (i == 1) {
            return new mst(context, msgNotficationDTO, bundle, intent);
        }
        if (i == 2) {
            return new d(1, context, msgNotficationDTO, bundle, intent);
        }
        if (i == 3) {
            return new d(2, context, msgNotficationDTO, bundle, intent);
        }
        if (i == 4) {
            return new c(context, msgNotficationDTO, bundle, intent);
        }
        return new msu(context, msgNotficationDTO, bundle, intent);
    }

    private static void a(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abb7e80", new Object[]{bundle, str, str2});
            return;
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(bundle.getString(AgooConstants.MESSAGE_BODY));
            com.alibaba.fastjson.JSONObject jSONObject = parseObject.getJSONObject(Constants.KEY_EXTS);
            if (jSONObject != null) {
                String string = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                if (!TextUtils.isEmpty(string)) {
                    com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(string);
                    parseObject2.put(str, (Object) str2);
                    jSONObject.put(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS, (Object) parseObject2.toString());
                } else {
                    com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                    jSONObject2.put(str, (Object) str2);
                    jSONObject.put(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS, (Object) jSONObject2.toString());
                }
            }
            if (parseObject == null) {
                return;
            }
            bundle.putString(AgooConstants.MESSAGE_BODY, parseObject.toString());
        } catch (Throwable unused) {
        }
    }

    private static IOldAgooNotification b(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOldAgooNotification) ipChange.ipc$dispatch("d6581be", new Object[]{context, msgNotficationDTO, bundle, intent});
        }
        switch (msgNotficationDTO.sceneTemplateId) {
            case 131003:
                bundle.putString("show_type", "0");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片海报Banner");
                return new BannerPicNotification(context, msgNotficationDTO, bundle, intent);
            case 131004:
                bundle.putString("show_type", "2");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片加文本");
                return new msv(context, msgNotficationDTO, bundle, intent);
            case 131005:
                bundle.putString("show_type", "3");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片加价格Banner");
                return new PicPriceNotification(context, msgNotficationDTO, bundle, intent);
            case 131006:
                bundle.putString("show_type", "1");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "组合海报Banner");
                return new BannerAssembleNotification(context, msgNotficationDTO, bundle, intent);
            case 131007:
                bundle.putString("show_type", "4");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片文本加展开大图");
                return new PicTextLargeExpandNotification(context, msgNotficationDTO, bundle, intent);
            default:
                return null;
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (EnvUtil.isNightMode()) {
            return false;
        }
        return b() && TextUtils.equals("true", OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableSceneTemplate", String.valueOf(EnvService.instance().checkBrand("oppo"))));
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equals(ABService.instance().getABResult("pushStyle", "messageModule", "enableShading"));
    }
}
