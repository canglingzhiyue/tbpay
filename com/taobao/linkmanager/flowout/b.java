package com.taobao.linkmanager.flowout;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.f;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import com.taobao.linkmanager.flowout.data.FloutWhiteListBean;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f17706a;
    private static Application b;
    private static Map<String, String> c;
    private static FloutNewConfigData d;

    public static /* synthetic */ FloutNewConfigData a(FloutNewConfigData floutNewConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloutNewConfigData) ipChange.ipc$dispatch("434ba52e", new Object[]{floutNewConfigData});
        }
        d = floutNewConfigData;
        return floutNewConfigData;
    }

    public static /* synthetic */ Map a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        c = map;
        return map;
    }

    public static /* synthetic */ Map e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[0]) : c;
    }

    public static /* synthetic */ Application f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("c7b16ebc", new Object[0]) : b;
    }

    public static /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else {
            h();
        }
    }

    static {
        kge.a(2106896292);
        f17706a = "{\"floutEnable\":true,\"floutWhiteList\":[{\"name\":\"支付宝\",\"packageName\":\"com.eg.android.AlipayGphone\",\"schemes\":[\"alipays\",\"alipay\",\"alipayshare\",\"alipayhk\"]},{\"name\":\"天猫\",\"packageName\":\"com.tmall.wireless\",\"schemes\":[\"tmall\"],\"supportAfcLink\":true,\"link\":\"tmall://page.tm/appLink?h5Url=${url}\"},{\"name\":\"优酷\",\"packageName\":\"com.youku.phone\",\"schemes\":[\"youku\"]},{\"name\":\"UC浏览器\",\"packageName\":\"com.UCMobile\",\"schemes\":[\"uclink\"],\"link\":\"uclink://www.uc.cn/cc77796ca7c25dff9607d31b29effc07?action=open_url&src_pkg=com.taobao.taobao&src_ch=tbmessagepull&url=${url}\"},{\"name\":\"闲鱼\",\"packageName\":\"com.taobao.fleamarket\",\"schemes\":[\"fleamarket\"]},{\"name\":\"考拉\",\"packageName\":\"com.kaola\",\"schemes\":[\"kaola\"]},{\"name\":\"微信\",\"packageName\":\"com.tencent.mm\",\"schemes\":[\"weixin\"]},{\"name\":\"今日头条\",\"packageName\":\"com.ss.android.article.news\",\"schemes\":[\"tbopen23261993\",\"bytedance\"]},{\"name\":\"新浪微博\",\"packageName\":\"com.sina.weibo\",\"schemes\":[\"tbopen23208668\",\"sinaweibo\",\"weibosdk\",\"weibosdk2.5\",\"sinaweibohd\"]},{\"name\":\"手机 QQ\",\"packageName\":\"com.tencent.mobileqq\",\"schemes\":[\"mqq\"]},{\"name\":\"上汽名爵\",\"packageName\":\"com.saicmotor.mg\",\"schemes\":[\"mgtocapp\"]},{\"name\":\"斑马网络\",\"packageName\":\"com.cloudy.jun\",\"schemes\":[\"baojun\"]},{\"name\":\"子弹短信\",\"packageName\":\"com.bullet.messenger\",\"schemes\":[\"bulletmessage\"]},{\"name\":\"飞聊\",\"packageName\":\"com.feiliao.flipchat.android\",\"schemes\":[\"imrocketshare\"]},{\"name\":\"AppStore\",\"packageName\":\"com.itms-apps\",\"schemes\":[\"itms-apps\"]},{\"name\":\"虎扑识货\",\"packageName\":\"com.hupu.shihuo\",\"schemes\":[\"tbopen23022129\",\"shihuo\"]},{\"name\":\"淘宝旅行\",\"packageName\":\"com.taobao.travel\",\"schemes\":[\"taobaotravel\"]},{\"name\":\"1688\",\"packageName\":\"com.alibaba.wireless\",\"schemes\":[\"wireless1688\"]},{\"name\":\"斑马智行\",\"packageName\":\"org.zxq.teleri\",\"schemes\":[\"smarttravel\"]},{\"name\":\"手机淘宝\",\"packageName\":\"com.taobao.taobao4iphone\",\"schemes\":[]},{\"name\":\"百度云\",\"packageName\":\"com.downloading.main.baiduyundownload\",\"schemes\":[\"baiduyunmbox\",\"baidunetdisk\",\"baiduyun\"]},{\"name\":\"阿里云\",\"packageName\":\"com.alibaba.aliyun\",\"schemes\":[\"aliyun\"]},{\"name\":\"爱奇艺\",\"packageName\":\"com.qiyi.video\",\"schemes\":[\"iqiyi\"]},{\"name\":\"旺信\",\"packageName\":\"com.alibaba.mobileim\",\"schemes\":[\"wangxin\",\"wangxinshare\",\"wangxincomm\"]},{\"name\":\"大众点评\",\"packageName\":\"com.dianping.v1\",\"schemes\":[\"dianping\"]},{\"name\":\"陌陌\",\"packageName\":\"com.immomo.momo\",\"schemes\":[\"momochat\"]},{\"name\":\"钱盾\",\"packageName\":\"com.ali.money.shield\",\"schemes\":[\"qiandun\"]},{\"name\":\"虾米音乐\",\"packageName\":\"fm.xiami.main\",\"schemes\":[\"xiami\"]},{\"name\":\"e淘\",\"packageName\":\"com.taobao.etao\",\"schemes\":[\"etao\"]},{\"name\":\"阿里小号\",\"packageName\":\"com.alicom.smartdail\",\"schemes\":[\"mytel\"]},{\"name\":\"钉钉\",\"packageName\":\"com.alibaba.android.rimet\",\"schemes\":[\"dingtalk\",\"dingtalk-open\"]},{\"name\":\"飞猪\",\"packageName\":\"com.taobao.trip\",\"schemes\":[\"alitrip\"]},{\"name\":\"千牛\",\"packageName\":\"com.taobao.qianniu\",\"schemes\":[\"dingoair3dtesxirmqpncn\",\"topmobile\"]},{\"name\":\"亲淘app\",\"packageName\":\"com.taobao.litetao\",\"schemes\":[\"taobaolite\"]},{\"name\":\"荣威\",\"packageName\":\"com.saicmotor.tocapp\",\"schemes\":[\"tocappforbindcar\"]},{\"name\":\"Test-flight\",\"packageName\":\"Test-flight\",\"schemes\":[\"itms-beta\"]}],\"floutIdEnable\":false,\"floutIdWhiteList\":[\"b9b3c5093a1971de\",\"8617ab96f88d12c0\",\"a8537b2b2b9ac2ba\"],\"floutIdList\":[{\"floutId\":\"browser_dp\",\"scene\":\"browser\",\"packageNames\":[\"com.UCMobile\"]}],\"systemActions\":[\"tel\"],\"androidActions\":[\"com.android.systemui\",\"com.android.settings\",\"android.intent.action.MAIN\",\"android.intent.action.CREATE_DOCUMENT\",\"android.content.pm.action.REQUEST_PERMISSIONS\",\"android.media.action.IMAGE_CAPTURE\",\"android.intent.action.DIAL\",\"android.intent.action.CALL\",\"android.intent.action.SENDTO\",\"android.intent.action.SEND\",\"android.intent.action.CAMERA_BUTTON\",\"android.media.action.IMAGE_CAPTURE\",\"android.intent.action.GET_CONTENT\",\"android.intent.action.PICK\",\"android.intent.action.chooser\",\"android.intent.action.CHOOSER\",\"android.intent.action.WEB_SEARCH\",\"android.intent.action.web_search\",\"android.intent.action.taobao.address.editor\",\"android.intent.action.taobao.address.book\",\"android.intent.action.taobao.address.area\",\"android.intent.action.taobao.address.add\",\"android.intent.action.INSERT_OR_EDIT\",\"android.bluetooth.adapter.action.REQUEST_ENABLE\",\"android.settings.action.MANAGE_OVERLAY_PERMISSION\",\"android.intent.action.VIEW\",\"com.huawei.intent.action.hwCHOOSER\",\"android.intent.action.hwCHOOSER\",\"android.settings.APPLICATION_DETAILS_SETTINGS\"],\"floutDisplaceEnable\":true,\"floutDiplaceData\":{\"defaultApp\":\"com.UCMobile\",\"displaceRules\":[{}],\"blackUrlList\":[{\"type\":\"host\",\"url\":\"\"},{\"type\":\"hostAndPath\",\"url\":\"\"}]},\"blockTip\":\"正在努力尝试跳转，请先逛逛其他内容~\"}";
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        b = application;
        OrangeConfig.getInstance().registerListener(new String[]{c.CUSTOM_OUT_CONFIG_V2}, new com.taobao.orange.d() { // from class: com.taobao.linkmanager.flowout.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                b.a(OrangeConfig.getInstance().getConfigs(str));
                if (b.e() != null) {
                    f.a(b.f()).a(c.LOCAL_OUT_CONFIG, b.e());
                }
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutConfig === initConfig === 获取到的配置：" + b.e());
                String str2 = (String) b.e().get("newFloutConfig");
                if (!TextUtils.isEmpty(str2)) {
                    b.a((FloutNewConfigData) JSON.parseObject(str2, FloutNewConfigData.class));
                }
                b.g();
            }
        }, false);
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        FlowOutConfigData a2 = a();
        if (a2 == null) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutConfig === refreshCacheMap === flowOutConfig为空，不更新内存缓存");
            return;
        }
        Set<String> keySet = e.f17709a.keySet();
        if (keySet.size() == 0) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutConfig === refreshCacheMap === cacheList为空，不更新内存缓存");
            return;
        }
        for (String str : keySet) {
            for (FloutWhiteListBean floutWhiteListBean : a2.floutWhiteList) {
                String[] strArr = floutWhiteListBean.schemes;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (TextUtils.equals(str, strArr[i]) && !TextUtils.equals(floutWhiteListBean.packageName, e.f17709a.get(str))) {
                        e.f17709a.put(str, floutWhiteListBean.packageName);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public static FlowOutConfigData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowOutConfigData) ipChange.ipc$dispatch("3db25f74", new Object[0]);
        }
        Map<String, String> map = c;
        if (map == null || map.size() == 0) {
            c = f.a(b).a(c.LOCAL_OUT_CONFIG);
        }
        Map<String, String> map2 = c;
        if (map2 == null || map2.size() == 0) {
            FlowOutConfigData flowOutConfigData = (FlowOutConfigData) JSON.parseObject(f17706a, FlowOutConfigData.class);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutConfig === getFlowOutConfig === 获取到的本地默认配置为：" + f17706a);
            return flowOutConfigData;
        }
        FlowOutConfigData flowOutConfigData2 = (FlowOutConfigData) JSON.parseObject(c.get("config"), FlowOutConfigData.class);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutConfig === getFlowOutConfig === 获取到的数据map：" + c);
        return flowOutConfigData2;
    }

    public static FloutNewConfigData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloutNewConfigData) ipChange.ipc$dispatch("512e35b1", new Object[0]);
        }
        FloutNewConfigData floutNewConfigData = d;
        if (floutNewConfigData != null) {
            return floutNewConfigData;
        }
        Map<String, String> a2 = f.a(b).a(c.LOCAL_OUT_CONFIG);
        if (a2 == null) {
            return null;
        }
        String str = a2.get("newFloutConfig");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        FloutNewConfigData floutNewConfigData2 = (FloutNewConfigData) JSON.parseObject(str, FloutNewConfigData.class);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowOutConfig === getNewFloutConfig === SP获取到的数据：" + str);
        return floutNewConfigData2;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        FloutNewConfigData b2 = b();
        if (b2 == null) {
            return true;
        }
        return b2.shareEnable;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        FloutNewConfigData b2 = b();
        if (b2 == null) {
            return false;
        }
        return b2.defaultInterruptEnable;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        FloutNewConfigData b2 = b();
        if (b2 == null) {
            return false;
        }
        return b2.securityControlEnable;
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[0])).longValue();
        }
        FloutNewConfigData b2 = b();
        if (b2 == null) {
            return 0L;
        }
        return b2.securityControlSecs;
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        FloutNewConfigData b2 = b();
        if (b2 == null) {
            return 0;
        }
        return b2.securityControlLevel;
    }
}
