package tb;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.contacts.data.member.ContactMember;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.contacts.data.member.ShareResultMember;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.core.contacts.control.ContactsSendShareBusiness;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoMclContactsSendshareResponseData;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.globalmodel.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.a;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes8.dex */
public class oij implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(188772549);
        kge.a(-2068678803);
    }

    public static /* synthetic */ void a(oij oijVar, String str, String str2, Map map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1868173", new Object[]{oijVar, str, str2, map, str3});
        } else {
            oijVar.a(str, str2, map, str3);
        }
    }

    @Override // tb.oiq
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        TBShareContent j = e.b().j();
        if (j == null) {
            return;
        }
        String str2 = j.description;
        f g = e.b().g();
        if (g != null && !TextUtils.isEmpty(g.f19632a)) {
            str2 = g.f19632a + " " + str2;
        }
        if (map == null || map.size() == 0) {
            a(b.a(R.string.share_app_share), str2);
            return;
        }
        Properties properties = new Properties();
        properties.put("Type", "RecentlyContacts");
        j.fillUTProperties(properties);
        TBS.Ext.commitEvent("ShareTypes", properties);
        a(str, str2, map);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TBShareContent j = e.b().j();
        if (j == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("itemDescription", str2);
        bundle.putString("itemPic", j.imageUrl);
        bundle.putString("itemUrl", j.url);
        bundle.putString("itemId", e.b().f());
        bundle.putString("itemType", e.b().c());
        bundle.putString("businessId", j.businessId);
        bundle.putBoolean("isShowShare", false);
        bundle.putString(MspGlobalDefine.EXTENDINFO, JSON.toJSONString((Object) j.activityParams, true));
        bundle.putString("shareId", j.shareId);
        bundle.putString("suId", j.suId);
        String config = OrangeConfig.getInstance().getConfig("android_share", "moreContactsWeexUrl", "https://market.m.taobao.com/apps/market/msgrax/share_address_book.html?wh_weex=true");
        if (TextUtils.isEmpty(config)) {
            config = "http://m.taobao.com/go/importcontacts.html";
        } else {
            bundle.putString(a.SHARE_CONTENT_KEY, JSON.toJSONString(j));
        }
        Nav.from(nym.a().getApplicationContext()).withExtras(bundle).toUri(config);
    }

    private void a(final String str, String str2, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            a(new ContactsSendShareBusiness(nym.a().getApplicationContext(), new com.taobao.share.core.contacts.control.a(nym.a().getApplicationContext()), new ContactsSendShareBusiness.a() { // from class: tb.oij.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.share.core.contacts.control.ContactsSendShareBusiness.a
                public void a(ComTaobaoMclContactsSendshareResponseData comTaobaoMclContactsSendshareResponseData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("75936105", new Object[]{this, comTaobaoMclContactsSendshareResponseData});
                    } else if (comTaobaoMclContactsSendshareResponseData == null) {
                        TBS.Page.ctrlClicked(CT.Button, "GotoChat");
                        if (ShareBizAdapter.getInstance().getFriendsProvider() == null) {
                            return;
                        }
                        ShareBizAdapter.getInstance().getFriendsProvider().a(null);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(Arrays.asList(comTaobaoMclContactsSendshareResponseData.getSendSuccessList()));
                        String str3 = (String) map.get("ccode");
                        if (TextUtils.isEmpty(str3)) {
                            str3 = ((ShareResultMember) arrayList.get(0)).getUserId();
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str3 = (String) map.get("userId");
                        }
                        oij.a(oij.this, str, str3, map, comTaobaoMclContactsSendshareResponseData.intercept);
                    }
                }

                @Override // com.taobao.share.core.contacts.control.ContactsSendShareBusiness.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        AppMonitor.Alarm.commitFail("share", "Share", "SHARE_FAILED_CONTACTS", b.a(R.string.taobao_app_1010_1_17832));
                    }
                }
            }), str2, map);
        }
    }

    private void a(ContactsSendShareBusiness contactsSendShareBusiness, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45dedd67", new Object[]{this, contactsSendShareBusiness, str, map});
            return;
        }
        ArrayList<ContactMember> arrayList = new ArrayList<>();
        ContactMember contactMember = new ContactMember();
        RecentMember recentMember = new RecentMember();
        recentMember.setCcode(map.get("ccode"));
        recentMember.setHeadUrl(map.get("headUrl"));
        recentMember.setPhone(map.get("phone"));
        recentMember.setName(map.get("name"));
        recentMember.setUserId(map.get("userId"));
        recentMember.setTimeStamp(a(map.get("timeStamp"), System.currentTimeMillis()));
        recentMember.setTaoFlag(map.get("taoFlag"));
        recentMember.setTaoFriendName(map.get("taoFriendName"));
        if ("true".equals(map.get("taoFriend"))) {
            recentMember.setTaoFriend(true);
        } else {
            recentMember.setTaoFriend(false);
        }
        recentMember.setType(Integer.parseInt(map.get("type")));
        recentMember.setRecordNum(Integer.parseInt(map.get("recordNum")));
        contactMember.setData(recentMember);
        arrayList.add(contactMember);
        contactsSendShareBusiness.startShare(arrayList, "", "", "1");
    }

    private void a(String str, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80c2013", new Object[]{this, str, str2, map, str3});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            TBS.Page.ctrlClicked(CT.Button, "GotoChat");
            Bundle bundle = new Bundle();
            HashMap hashMap = new HashMap();
            hashMap.put(MessageNavProcessorV2.KEY_BIZ_CONFIG_TYPE, "mpm_chat");
            hashMap.put(MessageNavProcessorV2.KEY_DATASOURCE_TYPE, "im_cc");
            String str4 = map.get("type");
            if (String.valueOf(2).equals(str4) || String.valueOf(4).equals(str4)) {
                bundle.putString("conversation_code", str2);
                hashMap.put("conversation_code", str2);
            } else {
                bundle.putLong("amp_uid", Long.valueOf(str2).longValue());
                bundle.putString("amp_displayname", map.get("name"));
                hashMap.put("amp_uid", str2);
                hashMap.put("amp_displayname", map.get("name"));
                if ("1".equals(str3)) {
                    TBShareContent j = e.b().j();
                    if (j == null) {
                        return;
                    }
                    hashMap.put(aw.PARAM_SHAQRE_ITEM_ID, e.b().f());
                    hashMap.put("shareTitle", j.description);
                    hashMap.put("sharePrice", j.extraParams != null ? j.extraParams.get("price") : "");
                    hashMap.put("shareImage", j.imageUrl);
                    hashMap.put("shareUrl", j.url);
                    hashMap.put("msgType", "1");
                    hashMap.put("shareType", j.shareScene);
                    hashMap.put("activityId", j.businessId);
                }
            }
            String str5 = "?" + a(hashMap);
            TLog.logd("TBShareFriendHandler", " extInfo:" + str5);
            Nav.from(nym.a()).withExtras(bundle).toUri(ShareBizAdapter.getInstance().getFriendsProvider().a() + str5);
        } else {
            TLog.loge(nym.UNUSED_CODE_TAG, " userid empty and ContactsShareFinishPushView has been del!!!");
        }
        AppMonitor.Alarm.commitSuccess("share", "Share");
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getValue())) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(String.format("%s=%s", entry.getKey(), URLEncoder.encode(entry.getValue())));
            }
        }
        return sb.toString();
    }

    private long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            return TextUtils.isEmpty(str) ? j : Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }
}
