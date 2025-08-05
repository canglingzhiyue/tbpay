package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.statistic.TBS;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes8.dex */
public class oig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, a> f32086a;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public oiq f32087a;
        public String b;
        public String c;

        static {
            kge.a(-2060766749);
        }

        public a(oiq oiqVar, String str, String str2) {
            this.f32087a = oiqVar;
            this.b = str;
            this.c = str2;
        }
    }

    static {
        kge.a(-982830465);
        f32086a = null;
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        a a2 = a(str);
        if (a2 != null) {
            a(str, a2.b, a2.c);
            a2.f32087a.a(str, map);
            return;
        }
        nyy.c("ShareHandlerAdapter", "share err handlers null");
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2d0431ca", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, a> a2 = a();
        if (ShareTargetType.Share2Weixin.getValue().equals(str) && e.b().f19631a) {
            return a2.get(str + "_SDK");
        }
        return a2.get(str);
    }

    private static void a(String str, String str2, String str3) {
        TBShareContent j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (TextUtils.isEmpty(str) || (j = e.b().j()) == null) {
        } else {
            String str4 = j.businessId;
            if (ShareTargetType.Share2Contact.getValue().equals(str)) {
                return;
            }
            Properties properties = new Properties();
            if (!TextUtils.isEmpty(str3)) {
                properties.put("Type", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                properties.put("bizID", str4);
            }
            j.fillUTProperties(properties);
            TBS.Ext.commitEvent("ShareTypes", properties);
        }
    }

    private static HashMap<String, a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]);
        }
        if (f32086a == null) {
            HashMap<String, a> hashMap = new HashMap<>();
            f32086a = hashMap;
            hashMap.put(ShareTargetType.Share2Copy.getValue(), new a(new oim(), "Copy", "copy"));
            f32086a.put(ShareTargetType.Share2QQ.getValue(), new a(new oim(), "TaoPassword-QQ", "taopassword_qq"));
            f32086a.put(ShareTargetType.Share2Weixin.getValue(), new a(new oim(), "TaoPassword-WeiXin", "taopassword_weixin"));
            HashMap<String, a> hashMap2 = f32086a;
            hashMap2.put(ShareTargetType.Share2Weixin.getValue() + "_SDK", new a(new oik(), "WeChatSDK_Chat", "wxfriend"));
            f32086a.put(ShareTargetType.Share2WeixinTimeline.getValue(), new a(new oik(), "WeChatSDK_Quan", "wxtimeline"));
            f32086a.put(ShareTargetType.Share2Alipay.getValue(), new a(new oik(), "Alipay", "alipay"));
            f32086a.put(ShareTargetType.Share2SinaWeibo.getValue(), new a(new oik(), "SinaWeibo", nyk.KEY_SHARE_CONFIG_SINAWEIBO));
            f32086a.put(ShareTargetType.Share2Wangxin.getValue(), new a(new oik(), "WangXin", nyk.KEY_SHARE_CONFIG_WANGXIN));
            f32086a.put(ShareTargetType.Share2DingTalk.getValue(), new a(new oik(), "DingTalk", "dingtalk"));
            f32086a.put(ShareTargetType.Share2Contact.getValue(), new a(new oij(), "Contacts", "contacts"));
            f32086a.put(ShareTargetType.Share2QRCode.getValue(), new a(new oii(), "QRCode", "QRCode"));
            f32086a.put(ShareTargetType.Share2ScanCode.getValue(), new a(new oih(), "QRCode-Scan", "QRCode-Scan"));
            f32086a.put(ShareTargetType.Share2IShopping.getValue(), new a(new oil(), "Guangjie", "guangjie"));
            f32086a.put(ShareTargetType.Share2IPresent.getValue(), new a(new oil(), "Present", "present"));
            f32086a.put(ShareTargetType.Share2SMS.getValue(), new a(new oim(), "taopassword-sms", "taopassword-sms"));
            f32086a.put(ShareTargetType.Share2Messenger.getValue(), new a(new tka(), "Messenger", "Messenger"));
            f32086a.put(ShareTargetType.Share2Telegram.getValue(), new a(new tka(), "Telegram", "Telegram"));
            f32086a.put(ShareTargetType.Share2WeChat.getValue(), new a(new tka(), "WeChat", "WeChat"));
            f32086a.put(ShareTargetType.Share2WhatsApp.getValue(), new a(new tka(), "WhatsApp", "WhatsApp"));
            f32086a.put(ShareTargetType.Share2Instagram.getValue(), new a(new tka(), "Instagram", "Instagram"));
            f32086a.put(ShareTargetType.Share2Facebook.getValue(), new a(new tka(), "Facebook", "Facebook"));
            f32086a.put(ShareTargetType.Share2I18Napp.getValue(), new a(new tka(), "I18Napp", "I18Napp"));
            f32086a.put(ShareTargetType.Share2Line.getValue(), new a(new tka(), "Line", "Line"));
        }
        return f32086a;
    }
}
