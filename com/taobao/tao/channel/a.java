package com.taobao.tao.channel;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.tao.channel.mtop.GetPanelInfoResponseData;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.ShareAppRegister;
import com.ut.share.SharePlatform;
import com.ut.share.business.ShareTargetType;
import com.ut.share.utils.InstalledPackages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.nyk;
import tb.nyl;
import tb.nza;
import tb.nzm;
import tb.obh;

/* loaded from: classes8.dex */
public class a implements nza {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOMO_PKG = "com.immomo.momo";
    public static final String QQ_LITE_PKG = "com.tencent.qqlite";
    public static final String QQ_PKG = "com.tencent.mobileqq";
    public static final String WEIXIN_PKG = "com.tencent.mm";
    private static HashMap<String, String> b;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<com.taobao.share.globalmodel.a> f19854a = new ArrayList<>();

    /* renamed from: com.taobao.tao.channel.a$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19855a = new int[TaoPasswordShareType.values().length];

        static {
            try {
                f19855a[TaoPasswordShareType.ShareTypeOther.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19855a[TaoPasswordShareType.ShareTypeQQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19855a[TaoPasswordShareType.ShareTypeWeixin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(984453943);
        kge.a(125622555);
        b = null;
    }

    public ArrayList<com.taobao.share.globalmodel.a> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.f19854a;
    }

    @Override // tb.nza
    public ArrayList<com.taobao.share.globalmodel.a> a(ArrayList<String> arrayList, Map<String, String> map) {
        com.taobao.share.globalmodel.a b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9935155d", new Object[]{this, arrayList, map});
        }
        ArrayList<String> a2 = a(arrayList);
        b(a2);
        this.f19854a.clear();
        Map<String, String> a3 = a(map);
        for (int i = 0; i < a2.size(); i++) {
            String str = a2.get(i);
            if (a(str) && (b2 = b(str)) != null) {
                if (a3 != null) {
                    b2.e(a3.get(str));
                }
                this.f19854a.add(b2);
            }
        }
        return this.f19854a;
    }

    public void a(Map<String, String> map, List<GetPanelInfoResponseData.ChannelListBean> list, List<GetPanelInfoResponseData.ToolListBean> list2, boolean z) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f515fcb5", new Object[]{this, map, list, list2, new Boolean(z)});
            return;
        }
        ArrayList arrayList2 = null;
        if (com.alibaba.ability.localization.b.b()) {
            if (list == null || list.size() == 0) {
                if (list2 == null || list2.size() <= 0) {
                    a((ArrayList<String>) null, map);
                    return;
                } else {
                    a(map, list2, z);
                    return;
                }
            }
        } else if (list == null || list.size() == 0) {
            this.f19854a.clear();
            if (list2 == null || list2.size() <= 0) {
                this.f19854a.add(b(ShareTargetType.Share2Copy.getValue()));
                return;
            } else {
                a(map, list2, z);
                return;
            }
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<String> arrayList5 = new ArrayList<>();
        HashMap hashMap = new HashMap();
        for (GetPanelInfoResponseData.ChannelListBean channelListBean : list) {
            arrayList3.add(channelListBean.getType());
            if ("2".equals(channelListBean.getChannelSource())) {
                arrayList4.add(channelListBean.getType());
            } else {
                channelListBean.setChannelSource("1");
                arrayList5.add(channelListBean.getType());
            }
            hashMap.put(channelListBean.getType(), channelListBean);
        }
        ArrayList<String> a2 = a(arrayList5);
        b(a2);
        if (obh.a()) {
            arrayList2 = arrayList4;
        }
        if (arrayList2 == null || arrayList2.size() <= 0) {
            arrayList3 = a2;
        } else {
            ArrayList arrayList6 = new ArrayList();
            Iterator<String> it = arrayList3.iterator();
            int i = 0;
            while (it.hasNext()) {
                String next = it.next();
                if (!a2.contains(next) && !arrayList2.contains(next)) {
                    if (c().containsKey(next) && a2.contains(c().get(next))) {
                        if (arrayList3.size() > i) {
                            arrayList3.set(i, c().get(next));
                        }
                    } else {
                        arrayList6.add(next);
                    }
                }
                i++;
            }
            if (arrayList6.size() > 0) {
                arrayList3.removeAll(arrayList6);
            }
        }
        this.f19854a.clear();
        Map<String, String> a3 = a(map);
        b(hashMap);
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            String str = arrayList3.get(i2);
            if ((!z || nyl.e(str)) && a(str)) {
                com.taobao.share.globalmodel.a b2 = b(str);
                if (b2 == null) {
                    GetPanelInfoResponseData.ChannelListBean channelListBean2 = hashMap.get(str);
                    if (channelListBean2 != null && "2".equals(channelListBean2.getChannelSource())) {
                        b2 = new com.taobao.share.globalmodel.a();
                    }
                }
                if (a3 != null) {
                    b2.e(a3.get(str));
                }
                if (!hashMap.containsKey(str) || hashMap.get(str) == null) {
                    arrayList = arrayList3;
                } else {
                    GetPanelInfoResponseData.ChannelListBean channelListBean3 = hashMap.get(str);
                    String icon = channelListBean3.getIcon();
                    String title = channelListBean3.getTitle();
                    String action = channelListBean3.getAction();
                    arrayList = arrayList3;
                    String channelSource = channelListBean3.getChannelSource();
                    b2.d(str);
                    b2.a(false);
                    if (!StringUtils.isEmpty(icon)) {
                        b2.b(icon);
                    }
                    if (!StringUtils.isEmpty(title)) {
                        b2.c(title);
                    }
                    if (!StringUtils.isEmpty(action)) {
                        b2.a(action);
                    }
                    if ("2".equals(channelListBean3.getChannelSource())) {
                        b2.g(channelSource);
                    } else {
                        b2.g("1");
                    }
                    b2.h(channelListBean3.getTopIcon());
                }
                this.f19854a.add(b2);
                i2++;
                arrayList3 = arrayList;
            }
            arrayList = arrayList3;
            i2++;
            arrayList3 = arrayList;
        }
        a(a3, list2, z);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ArrayList<com.taobao.share.globalmodel.a> arrayList = this.f19854a;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.f19854a.clear();
        com.taobao.share.globalmodel.a b2 = b(ShareTargetType.Share2Copy.getValue());
        if (b2 == null) {
            return;
        }
        this.f19854a.add(b2);
    }

    private void a(Map<String, String> map, List<GetPanelInfoResponseData.ToolListBean> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4e8f86", new Object[]{this, map, list, new Boolean(z)});
        } else if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                GetPanelInfoResponseData.ToolListBean toolListBean = list.get(i);
                String type = toolListBean.getType();
                if (!z || nyl.e(type)) {
                    com.taobao.share.globalmodel.a aVar = null;
                    if (toolListBean.getToolSource() == null || "1".equals(toolListBean.getToolSource())) {
                        aVar = b(type);
                    } else if (obh.a() || !StringUtils.isEmpty(toolListBean.getToolUrl())) {
                        aVar = new com.taobao.share.globalmodel.a();
                        aVar.d(toolListBean.getType());
                        aVar.f(toolListBean.getTitle());
                        aVar.c(1);
                        aVar.a(true);
                        aVar.g("2");
                        aVar.a(toolListBean.getToolUrl());
                        aVar.i(JSON.toJSONString(toolListBean));
                    }
                    if (aVar != null) {
                        if (!StringUtils.isEmpty(toolListBean.getTitle())) {
                            aVar.c(toolListBean.getTitle());
                        }
                        if (!StringUtils.isEmpty(toolListBean.getIcon())) {
                            aVar.b(toolListBean.getIcon());
                        }
                        if (map != null) {
                            aVar.e(map.get(type));
                        }
                        this.f19854a.add(aVar);
                    }
                }
            }
        }
    }

    @Override // tb.nza
    public ArrayList<com.taobao.share.globalmodel.a> a(boolean z) {
        ArrayList<String> a2;
        com.taobao.share.globalmodel.a b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9e6cc946", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            a2 = b();
        } else {
            a2 = a((ArrayList<String>) null);
        }
        b(a2);
        this.f19854a.clear();
        for (int i = 0; i < a2.size(); i++) {
            String str = a2.get(i);
            if (a(str) && (b2 = b(str)) != null) {
                this.f19854a.add(b2);
            }
        }
        return this.f19854a;
    }

    private Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        if (map != null && map.containsKey(nyk.KEY_SHARE_CONFIG_SINAWEIBO)) {
            map.put(ShareTargetType.Share2SinaWeibo.getValue(), map.get(nyk.KEY_SHARE_CONFIG_SINAWEIBO));
        }
        return map;
    }

    private void b(Map<String, GetPanelInfoResponseData.ChannelListBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null || !map.containsKey(nyk.KEY_SHARE_CONFIG_SINAWEIBO)) {
        } else {
            map.put(ShareTargetType.Share2SinaWeibo.getValue(), map.get(nyk.KEY_SHARE_CONFIG_SINAWEIBO));
        }
    }

    private ArrayList<String> a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a85ead1c", new Object[]{this, arrayList});
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList == null || arrayList.size() == 0) {
            if (com.alibaba.ability.localization.b.b()) {
                arrayList2.add(ShareTargetType.Share2Copy.getValue());
                arrayList2.add(ShareTargetType.Share2Weixin.getValue());
                arrayList2.add(ShareTargetType.Share2QQ.getValue());
                arrayList2.add(ShareTargetType.Share2SinaWeibo.getValue());
                arrayList2.add(ShareTargetType.Share2DingTalk.getValue());
                arrayList2.add(ShareTargetType.Share2Alipay.getValue());
                arrayList2.add(ShareTargetType.Share2QRCode.getValue());
                arrayList2.add(ShareTargetType.Share2ScanCode.getValue());
                arrayList2.add(ShareTargetType.Share2SMS.getValue());
            } else {
                arrayList2.add(ShareTargetType.Share2Copy.getValue());
                arrayList2.add(ShareTargetType.Share2Messenger.getValue());
                arrayList2.add(ShareTargetType.Share2Line.getValue());
                arrayList2.add(ShareTargetType.Share2Telegram.getValue());
                arrayList2.add(ShareTargetType.Share2WeChat.getValue());
                arrayList2.add(ShareTargetType.Share2WhatsApp.getValue());
                arrayList2.add(ShareTargetType.Share2Instagram.getValue());
                arrayList2.add(ShareTargetType.Share2Facebook.getValue());
            }
            return arrayList2;
        }
        HashMap<String, String> c = c();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = c.get(arrayList.get(i));
            if (!ShareTargetType.Share2Contact.getValue().equals(str) && !StringUtils.isEmpty(str) && !arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    private ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (com.alibaba.ability.localization.b.b()) {
            arrayList.add(ShareTargetType.Share2Copy.getValue());
            arrayList.add(ShareTargetType.Share2QQ.getValue());
            arrayList.add(ShareTargetType.Share2Weixin.getValue());
            arrayList.add(ShareTargetType.Share2SinaWeibo.getValue());
            arrayList.add(ShareTargetType.Share2SMS.getValue());
            arrayList.add(ShareTargetType.Share2QRCode.getValue());
            arrayList.add(ShareTargetType.Share2ScanCode.getValue());
        } else {
            arrayList.add(ShareTargetType.Share2Copy.getValue());
            arrayList.add(ShareTargetType.Share2Messenger.getValue());
            arrayList.add(ShareTargetType.Share2Line.getValue());
            arrayList.add(ShareTargetType.Share2Telegram.getValue());
            arrayList.add(ShareTargetType.Share2WeChat.getValue());
            arrayList.add(ShareTargetType.Share2WhatsApp.getValue());
            arrayList.add(ShareTargetType.Share2Instagram.getValue());
            arrayList.add(ShareTargetType.Share2Facebook.getValue());
        }
        return arrayList;
    }

    private HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this});
        }
        if (b == null) {
            HashMap<String, String> hashMap = new HashMap<>(44);
            b = hashMap;
            hashMap.put(ShareTargetType.Share2Copy.getValue(), ShareTargetType.Share2Copy.getValue());
            b.put("1", ShareTargetType.Share2Copy.getValue());
            b.put(ShareTargetType.Share2SinaWeibo.getValue(), ShareTargetType.Share2SinaWeibo.getValue());
            b.put("2", ShareTargetType.Share2SinaWeibo.getValue());
            b.put(nyk.KEY_SHARE_CONFIG_SINAWEIBO, ShareTargetType.Share2SinaWeibo.getValue());
            b.put(ShareTargetType.Share2Weixin.getValue(), ShareTargetType.Share2Weixin.getValue());
            b.put("3", ShareTargetType.Share2Weixin.getValue());
            b.put(ShareTargetType.Share2WeixinTimeline.getValue(), ShareTargetType.Share2WeixinTimeline.getValue());
            b.put("4", ShareTargetType.Share2WeixinTimeline.getValue());
            b.put(ShareTargetType.Share2QRCode.getValue(), ShareTargetType.Share2QRCode.getValue());
            b.put("5", ShareTargetType.Share2QRCode.getValue());
            b.put(ShareTargetType.Share2Wangxin.getValue(), ShareTargetType.Share2Wangxin.getValue());
            b.put("6", ShareTargetType.Share2Wangxin.getValue());
            b.put(ShareTargetType.Share2TaoPassword.getValue(), ShareTargetType.Share2TaoPassword.getValue());
            b.put("8", ShareTargetType.Share2TaoPassword.getValue());
            b.put(ShareTargetType.Share2Alipay.getValue(), ShareTargetType.Share2Alipay.getValue());
            b.put("10", ShareTargetType.Share2Alipay.getValue());
            b.put(ShareTargetType.Share2QQ.getValue(), ShareTargetType.Share2QQ.getValue());
            b.put(AgooConstants.ACK_FLAG_NULL, ShareTargetType.Share2QQ.getValue());
            b.put(ShareTargetType.Share2IShopping.getValue(), ShareTargetType.Share2IShopping.getValue());
            b.put(AgooConstants.ACK_PACK_NOBIND, ShareTargetType.Share2IShopping.getValue());
            b.put(ShareTargetType.Share2IPresent.getValue(), ShareTargetType.Share2IPresent.getValue());
            b.put("16", ShareTargetType.Share2IPresent.getValue());
            b.put(ShareTargetType.Share2DingTalk.getValue(), ShareTargetType.Share2DingTalk.getValue());
            b.put("17", ShareTargetType.Share2DingTalk.getValue());
            b.put("0", ShareTargetType.Share2Contact.getValue());
            b.put(ShareTargetType.Share2Contact.getValue(), ShareTargetType.Share2Contact.getValue());
            b.put(ShareTargetType.Share2ScanCode.getValue(), ShareTargetType.Share2ScanCode.getValue());
            b.put("18", ShareTargetType.Share2ScanCode.getValue());
            b.put(ShareTargetType.Share2SMS.getValue(), ShareTargetType.Share2SMS.getValue());
            b.put(ShareTargetType.Share2Messenger.getValue(), ShareTargetType.Share2Messenger.getValue());
            b.put("19", ShareTargetType.Share2Messenger.getValue());
            b.put(ShareTargetType.Share2Line.getValue(), ShareTargetType.Share2Line.getValue());
            b.put("20", ShareTargetType.Share2Line.getValue());
            b.put(ShareTargetType.Share2Telegram.getValue(), ShareTargetType.Share2Telegram.getValue());
            b.put(AgooConstants.REPORT_MESSAGE_NULL, ShareTargetType.Share2Telegram.getValue());
            b.put(ShareTargetType.Share2WeChat.getValue(), ShareTargetType.Share2WeChat.getValue());
            b.put(AgooConstants.REPORT_ENCRYPT_FAIL, ShareTargetType.Share2WeChat.getValue());
            b.put(ShareTargetType.Share2WhatsApp.getValue(), ShareTargetType.Share2WhatsApp.getValue());
            b.put(AgooConstants.REPORT_DUPLICATE_FAIL, ShareTargetType.Share2WhatsApp.getValue());
            b.put(ShareTargetType.Share2Instagram.getValue(), ShareTargetType.Share2Instagram.getValue());
            b.put(AgooConstants.REPORT_NOT_ENCRYPT, ShareTargetType.Share2Instagram.getValue());
            b.put(ShareTargetType.Share2Facebook.getValue(), ShareTargetType.Share2Facebook.getValue());
            b.put("25", ShareTargetType.Share2Facebook.getValue());
        }
        return b;
    }

    private void b(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
            return;
        }
        if (arrayList.contains(ShareTargetType.Share2TaoPassword.getValue())) {
            e.b().f19631a = false;
            if (!arrayList.contains(ShareTargetType.Share2Weixin.getValue())) {
                arrayList.add(ShareTargetType.Share2Weixin.getValue());
            }
            arrayList.remove(ShareTargetType.Share2TaoPassword.getValue());
        }
        if (!e.b().f19631a && arrayList.contains(ShareTargetType.Share2WeixinTimeline.getValue())) {
            arrayList.remove(ShareTargetType.Share2WeixinTimeline.getValue());
            if (!arrayList.contains(ShareTargetType.Share2Weixin.getValue())) {
                arrayList.add(ShareTargetType.Share2Weixin.getValue());
            }
        }
        if (StringUtils.equals("item", e.b().c()) || StringUtils.equals("guang", e.b().c())) {
            return;
        }
        arrayList.remove(ShareTargetType.Share2IShopping.getValue());
        arrayList.remove(ShareTargetType.Share2IPresent.getValue());
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        nzm shareChannel = ShareBizAdapter.getInstance().getShareChannel();
        if (ShareTargetType.Share2Copy.getValue().equals(str)) {
            return ShareApi.getInstance().canShare(e.b().e(), SharePlatform.Copy) && nyk.a("copy");
        } else if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            Context e = e.b().e();
            ShareAppRegister.registerWeibo(shareChannel.b(), shareChannel.c());
            return ShareApi.getInstance().canShare(e, SharePlatform.SinaWeibo) && nyk.a(nyk.KEY_SHARE_CONFIG_SINAWEIBO);
        } else if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            return new InstalledPackages(e.b().e(), "com.tencent.mm").installedApp() && nyk.a(nyk.KEY_SHARE_CONFIG_WEIXIN);
        } else if (ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
            return new InstalledPackages(e.b().e(), "com.tencent.mm").installedApp() && nyk.a(nyk.KEY_SHARE_CONFIG_WEIXINTIMELINE);
        } else if (ShareTargetType.Share2QRCode.getValue().equals(str) || ShareTargetType.Share2ScanCode.getValue().equals(str)) {
            return nyk.a("qrcode");
        } else {
            if (ShareTargetType.Share2Wangxin.getValue().equals(str)) {
                Context e2 = e.b().e();
                ShareAppRegister.registerWangxin(shareChannel.a());
                return ShareApi.getInstance().canShare(e2, SharePlatform.Wangxin) && nyk.a(nyk.KEY_SHARE_CONFIG_WANGXIN);
            } else if (ShareTargetType.Share2TaoPassword.getValue().equals(str)) {
                return nyk.a("taopassword") && a(e.b().e(), TaoPasswordShareType.ShareTypeWeixin);
            } else if (ShareTargetType.Share2Alipay.getValue().equals(str)) {
                Context e3 = e.b().e();
                ShareAppRegister.registerAlipay(shareChannel.d());
                return ShareApi.getInstance().canShare(e3, SharePlatform.Alipay) && nyk.a("alipay");
            } else if (ShareTargetType.Share2QQ.getValue().equals(str)) {
                return nyk.a("qq") && a(e.b().e(), TaoPasswordShareType.ShareTypeQQ);
            } else if (ShareTargetType.Share2IShopping.getValue().equals(str)) {
                return nyk.a(nyk.KEY_SHARE_CONFIG_ISHOPPING);
            } else {
                if (ShareTargetType.Share2DingTalk.getValue().equals(str)) {
                    Context e4 = e.b().e();
                    ShareAppRegister.registerDingTalk(shareChannel.e());
                    return nyk.a("dingtalk") && ShareApi.getInstance().canShare(e4, SharePlatform.DingTalk);
                } else if (ShareTargetType.Share2IPresent.getValue().equals(str)) {
                    return nyk.a(nyk.KEY_SHARE_CONFIG_IPRESENT);
                } else {
                    if (ShareTargetType.Share2SMS.getValue().equals(str)) {
                        return nyk.a("sms");
                    }
                    if (ShareTargetType.Share2Messenger.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.Messenger);
                    } else if (ShareTargetType.Share2Line.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.Line);
                    } else if (ShareTargetType.Share2Telegram.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.Telegram);
                    } else if (ShareTargetType.Share2WeChat.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.WeChat);
                    } else if (ShareTargetType.Share2WhatsApp.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.WhatsApp);
                    } else if (ShareTargetType.Share2Instagram.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.Instagram);
                    } else if (ShareTargetType.Share2Facebook.getValue().equals(str)) {
                        return !com.alibaba.ability.localization.b.b() && ShareApi.getInstance().canShare(e.b().e(), SharePlatform.Facebook);
                    } else if (StringUtils.isEmpty(str)) {
                        return false;
                    } else {
                        return nyk.a(str);
                    }
                }
            }
        }
    }

    public void a(TBShareContent tBShareContent) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            List arrayList = new ArrayList();
            String str = "";
            if (StringUtils.equals(tBShareContent.templateId, "detail")) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(tBShareContent.imageUrl);
                hashMap.put("images", arrayList2);
                hashMap.put("title", tBShareContent.description == null ? str : tBShareContent.description);
                if (tBShareContent.extraParams != null) {
                    str = tBShareContent.extraParams.get("price");
                }
                hashMap.put("price", str);
                if (tBShareContent.templateParams != null && tBShareContent.templateParams.size() != 0) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        arrayList = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (arrayList.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (!StringUtils.isEmpty((String) tBShareContent.templateParams.get("price"))) {
                        return;
                    }
                    tBShareContent.templateParams.put("price", hashMap.get("price"));
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
                return;
            }
            List list = arrayList;
            if (StringUtils.equals(tBShareContent.templateId, "live")) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tBShareContent.imageUrl);
                hashMap.put("images", arrayList3);
                hashMap.put("title", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("title"));
                hashMap.put("price", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("bottomText"));
                hashMap.put("headImg", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("topLogo"));
                hashMap.put("userNick", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("topTitle"));
                hashMap.put("statusIcon", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("bottomLogo"));
                if (tBShareContent.businessInfo != null) {
                    str = tBShareContent.businessInfo.get("descriptionImage");
                }
                hashMap.put("brandIcon", str);
                if (tBShareContent.templateParams != null && tBShareContent.templateParams.size() != 0) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        list = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (list.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("price"))) {
                        tBShareContent.templateParams.put("price", hashMap.get("price"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("headImg"))) {
                        tBShareContent.templateParams.put("headImg", hashMap.get("headImg"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("userNick"))) {
                        tBShareContent.templateParams.put("userNick", hashMap.get("userNick"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("statusIcon"))) {
                        tBShareContent.templateParams.put("statusIcon", hashMap.get("statusIcon"));
                    }
                    if (!StringUtils.isEmpty((String) tBShareContent.templateParams.get("brandIcon"))) {
                        return;
                    }
                    tBShareContent.templateParams.put("brandIcon", hashMap.get("brandIcon"));
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
            } else if (StringUtils.equals(tBShareContent.templateId, "shop")) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("imageleft"));
                arrayList4.add(tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("imageRight1"));
                arrayList4.add(tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("imageRight2"));
                hashMap.put("images", arrayList4);
                hashMap.put("title", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("shopName"));
                hashMap.put("brandIcon", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("shopLogo"));
                if (tBShareContent.businessInfo != null) {
                    str = tBShareContent.businessInfo.get("shopLevel");
                }
                hashMap.put("levelIcon", str);
                if (tBShareContent.businessInfo != null && tBShareContent.businessInfo.get("bottomDesc") != null) {
                    hashMap.put("tags", JSON.parseArray(String.valueOf(tBShareContent.businessInfo.get("bottomDesc")), String.class));
                } else {
                    hashMap.put("tags", new ArrayList());
                }
                if (tBShareContent.templateParams != null && tBShareContent.templateParams.size() != 0) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        parseArray = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    } else {
                        parseArray = (tBShareContent.templateParams.get("images") == null || !(tBShareContent.templateParams.get("images") instanceof JSONArray)) ? list : JSON.parseArray(JSON.toJSONString(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (parseArray.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("brandIcon"))) {
                        tBShareContent.templateParams.put("brandIcon", hashMap.get("brandIcon"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("levelIcon"))) {
                        tBShareContent.templateParams.put("levelIcon", hashMap.get("levelIcon"));
                    }
                    ArrayList arrayList5 = null;
                    try {
                        arrayList5 = (ArrayList) tBShareContent.templateParams.get("tags");
                    } catch (Throwable unused) {
                    }
                    if (arrayList5 == null && (tBShareContent.templateParams.get("tags") instanceof String)) {
                        try {
                            arrayList5 = (ArrayList) JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("tags")), String.class);
                        } catch (Throwable unused2) {
                        }
                    }
                    if (arrayList5 != null && arrayList5.size() != 0) {
                        return;
                    }
                    tBShareContent.templateParams.put("tags", hashMap.get("tags"));
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
            } else if (StringUtils.equals(tBShareContent.templateId, "group")) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(tBShareContent.imageUrl);
                hashMap.put("images", arrayList6);
                hashMap.put("title", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("groupDesc"));
                hashMap.put("price", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("groupFlag"));
                hashMap.put("headImg", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("groupImage"));
                hashMap.put("userNick", tBShareContent.businessInfo == null ? str : tBShareContent.businessInfo.get("groupName"));
                hashMap.put("brandIcon", String.valueOf(R.drawable.share_group_icon));
                if (tBShareContent.businessInfo != null) {
                    str = tBShareContent.businessInfo.get("groupVister");
                }
                hashMap.put("description", str);
                if (tBShareContent.templateParams != null && tBShareContent.templateParams.size() != 0) {
                    if (tBShareContent.templateParams.get("images") != null && (tBShareContent.templateParams.get("images") instanceof String)) {
                        list = JSON.parseArray(String.valueOf(tBShareContent.templateParams.get("images")), String.class);
                    }
                    if (list.size() == 0) {
                        tBShareContent.templateParams.put("images", hashMap.get("images"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("title"))) {
                        tBShareContent.templateParams.put("title", hashMap.get("title"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("price"))) {
                        tBShareContent.templateParams.put("price", hashMap.get("price"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("headImg"))) {
                        tBShareContent.templateParams.put("headImg", hashMap.get("headImg"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("userNick"))) {
                        tBShareContent.templateParams.put("userNick", hashMap.get("userNick"));
                    }
                    if (StringUtils.isEmpty((String) tBShareContent.templateParams.get("brandIcon"))) {
                        tBShareContent.templateParams.put("brandIcon", hashMap.get("brandIcon"));
                    }
                    if (!StringUtils.isEmpty((String) tBShareContent.templateParams.get("description"))) {
                        return;
                    }
                    tBShareContent.templateParams.put("description", hashMap.get("description"));
                    return;
                }
                tBShareContent.templateParams = hashMap;
                TLog.loge("ChannelBusiness", "content.templateParams null了 ");
            } else if (!StringUtils.equals(tBShareContent.templateId, "weex")) {
            } else {
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(tBShareContent.templateParams);
                hashMap2.put("extParams", hashMap3);
                TLog.loge("ChannelBusiness", "weex layoutid");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static com.taobao.share.globalmodel.a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.globalmodel.a) ipChange.ipc$dispatch("7d86359d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        com.taobao.share.globalmodel.a aVar = new com.taobao.share.globalmodel.a();
        aVar.g("1");
        if (ShareTargetType.Share2Copy.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17829));
            aVar.d(ShareTargetType.Share2Copy.getValue());
            aVar.b(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i2/O1CN01dCbyFl1lyIEzcuYjO_!!6000000004887-2-tps-192-192.png");
            aVar.c(1);
            aVar.a(true);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17829));
            return aVar;
        } else if (ShareTargetType.Share2HUABAO.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.share_save_image));
            aVar.d(ShareTargetType.Share2HUABAO.getValue());
            aVar.b(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i4/O1CN013yK1eS1Lsdd57p6jC_!!6000000001355-2-tps-192-192.png");
            aVar.c(1);
            aVar.a(true);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.share_save_image));
            return aVar;
        } else if (ShareTargetType.Share2SinaWeibo.getValue().equals(str) || StringUtils.equals(str, nyk.KEY_SHARE_CONFIG_SINAWEIBO)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17877));
            aVar.d(ShareTargetType.Share2SinaWeibo.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.tb_share_weibo);
            aVar.b("https://img.alicdn.com/tfs/TB11VY0d8Cw3KVjSZFlXXcJkFXa-180-180.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17868));
            return aVar;
        } else if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17850));
            aVar.d(ShareTargetType.Share2Weixin.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_wechat_session);
            aVar.b("https://gw.alicdn.com/imgextra/i3/O1CN01Hi2Ibp29kbAxiy69i_!!6000000008106-2-tps-192-192.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17859));
            return aVar;
        } else if (ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17864));
            aVar.d(ShareTargetType.Share2WeixinTimeline.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_wechat_timeline);
            aVar.b("https://gw.alicdn.com/tfs/TB1zxE9eNn1gK0jSZKPXXXvUXXa-192-192.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17837));
            return aVar;
        } else if (ShareTargetType.Share2QRCode.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17856));
            aVar.d(ShareTargetType.Share2QRCode.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/tfs/TB1ja83dGmWBuNjy1XaXXXCbXXa-108-108.png");
            aVar.b(-1);
            aVar.c(1);
            aVar.a(true);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17856));
            return aVar;
        } else if (ShareTargetType.Share2ScanCode.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17883));
            aVar.d(ShareTargetType.Share2ScanCode.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/tfs/TB1yW0MdKSSBuNjy0FlXXbBpVXa-108-108.png");
            aVar.b(-1);
            aVar.c(1);
            aVar.a(true);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17883));
            return aVar;
        } else if (ShareTargetType.Share2Wangxin.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17845));
            aVar.d(ShareTargetType.Share2Wangxin.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_wangxin);
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17834));
            return aVar;
        } else if (ShareTargetType.Share2TaoPassword.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17850));
            aVar.d(ShareTargetType.Share2TaoPassword.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_wechat_session);
            aVar.b("https://gw.alicdn.com/tfs/TB1nv0BdFGWBuNjy0FbXXb4sXXa-162-162.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17859));
            return aVar;
        } else if (ShareTargetType.Share2Alipay.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17875));
            aVar.d(ShareTargetType.Share2Alipay.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_alipay);
            aVar.b("https://img.alicdn.com/tfs/TB1B8LTd8OD3KVjSZFFXXcn9pXa-180-180.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17840));
            return aVar;
        } else if (ShareTargetType.Share2QQ.getValue().equals(str)) {
            aVar.c("QQ");
            aVar.d(ShareTargetType.Share2QQ.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i3/O1CN01lxXIWh1DesW4ASFYs_!!6000000000242-2-tps-192-192.png");
            aVar.b(R.drawable.share_qq);
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17852));
            return aVar;
        } else if (ShareTargetType.Share2IShopping.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17830));
            aVar.d(ShareTargetType.Share2IShopping.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_ishopping);
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17854));
            return aVar;
        } else if (ShareTargetType.Share2DingTalk.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17833));
            aVar.d(ShareTargetType.Share2DingTalk.getValue());
            aVar.a(-1);
            aVar.b(R.drawable.share_dingtalk);
            aVar.b("https://img.alicdn.com/tfs/TB1qAT1d8Cw3KVjSZR0XXbcUpXa-180-180.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17828));
            return aVar;
        } else if (ShareTargetType.Share2IPresent.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17843));
            aVar.d(ShareTargetType.Share2IPresent.getValue());
            aVar.b(-1);
            aVar.c(1);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17843));
            return aVar;
        } else if (ShareTargetType.Share2SMS.getValue().equals(str)) {
            aVar.c(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17844));
            aVar.d(ShareTargetType.Share2SMS.getValue());
            aVar.b(R.drawable.share_sms);
            aVar.a(-1);
            aVar.b("https://img.alicdn.com/tfs/TB1CRrZd8Kw3KVjSZFOXXarDVXa-180-180.png");
            aVar.c(2);
            aVar.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17846));
            return aVar;
        } else if (ShareTargetType.Share2Messenger.getValue().equals(str) && !com.alibaba.ability.localization.b.b()) {
            aVar.c("Messenger");
            aVar.d(ShareTargetType.Share2Messenger.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i4/O1CN01TnCti81khyo53VjdA_!!6000000004716-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to Messenger");
            return aVar;
        } else if (ShareTargetType.Share2Line.getValue().equals(str) && !com.alibaba.ability.localization.b.b()) {
            aVar.c("Line");
            aVar.d(ShareTargetType.Share2Line.getValue());
            aVar.a(-1);
            aVar.b("https://img.alicdn.com/imgextra/i1/O1CN01sXejBA1S1hA9Fovxa_!!6000000002187-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to Line");
            return aVar;
        } else if (ShareTargetType.Share2Telegram.getValue().equals(str) && !com.alibaba.ability.localization.b.b()) {
            aVar.c("Telegram");
            aVar.d(ShareTargetType.Share2Telegram.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i3/O1CN01kxgkLg26SnDiBGxHW_!!6000000007661-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to Telegram");
            return aVar;
        } else if (ShareTargetType.Share2WeChat.getValue().equals(str) && !com.alibaba.ability.localization.b.b()) {
            aVar.c("WeChat");
            aVar.d(ShareTargetType.Share2WeChat.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i1/O1CN01Ztg1he1MMrleXo8QU_!!6000000001421-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to WeChat");
            return aVar;
        } else if (ShareTargetType.Share2WhatsApp.getValue().equals(str) && !com.alibaba.ability.localization.b.b()) {
            aVar.c("WhatsApp");
            aVar.d(ShareTargetType.Share2WhatsApp.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i1/O1CN01AbH0Ds1wrqjJCBzyD_!!6000000006362-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to WhatsApp");
            return aVar;
        } else if (ShareTargetType.Share2Instagram.getValue().equals(str) && !com.alibaba.ability.localization.b.b()) {
            aVar.c("Instagram");
            aVar.d(ShareTargetType.Share2Instagram.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i3/O1CN01d7dTB01SK0zyXoEGL_!!6000000002227-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to Instagram");
            return aVar;
        } else if (!ShareTargetType.Share2Facebook.getValue().equals(str) || com.alibaba.ability.localization.b.b()) {
            return null;
        } else {
            aVar.c("Facebook");
            aVar.d(ShareTargetType.Share2Facebook.getValue());
            aVar.a(-1);
            aVar.b("https://gw.alicdn.com/imgextra/i2/O1CN01YTKiHv1Q4KCN6dTMR_!!6000000001922-2-tps-192-192.png");
            aVar.c(2);
            aVar.f("Share to Facebook");
            return aVar;
        }
    }

    public static boolean a(Context context, TaoPasswordShareType taoPasswordShareType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a46bd3ca", new Object[]{context, taoPasswordShareType})).booleanValue();
        }
        int i = AnonymousClass1.f19855a[taoPasswordShareType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (!new InstalledPackages(context, "com.tencent.mobileqq").installedApp()) {
                    return new InstalledPackages(context, "com.tencent.qqlite").installedApp();
                }
                return true;
            } else if (i == 3) {
                return new InstalledPackages(context, "com.tencent.mm").installedApp();
            }
        }
        return false;
    }
}
