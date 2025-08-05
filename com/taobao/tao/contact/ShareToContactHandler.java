package com.taobao.tao.contact;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.d;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.share.ui.engine.friend.b;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.friends.model.SourceType;
import com.taobao.tao.friends.model.a;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import tb.kge;
import tb.oif;

/* loaded from: classes8.dex */
public class ShareToContactHandler implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SHARE_CHANNEL = 99998;
    private static final String TAG = "ShareToContactHandler";

    static {
        kge.a(-955687403);
        kge.a(-711230508);
    }

    @Override // com.taobao.share.ui.engine.friend.b.a
    public void shareToContact(ContactInfo contactInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d913e2", new Object[]{this, contactInfo});
            return;
        }
        a wrapToContactsView = wrapToContactsView(convertContactInfoToRecentMember(contactInfo), contactInfo);
        if (wrapToContactsView == null) {
            return;
        }
        com.taobao.tao.sharepanel.weex.a aVar = (com.taobao.tao.sharepanel.weex.a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel();
        (aVar == null ? new oif() : aVar.getShareActionDispatcher()).a(new d(wrapToContactsView.c().desc, wrapToContactsView), ShareBizAdapter.getInstance().getAppEnv().b(), Integer.parseInt(contactInfo.getPosition()));
    }

    public RecentMember convertContactInfoToRecentMember(ContactInfo contactInfo) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (RecentMember) ipChange.ipc$dispatch("2f83675a", new Object[]{this, contactInfo});
        }
        if (contactInfo == null) {
            TLog.logi(TAG, "convertContactInfoToRecentMember: contactInfo is null");
            return null;
        }
        RecentMember recentMember = new RecentMember();
        if (!TextUtils.isEmpty(contactInfo.getUserId())) {
            recentMember.setUserId(contactInfo.getUserId());
        }
        int parseInt = Integer.parseInt(contactInfo.getContactType());
        if (parseInt == 1 || parseInt == 3) {
            if (TextUtils.isEmpty(contactInfo.getUserId())) {
                TLog.logi(TAG, "convertContactInfoToRecentMember: userId is empty");
                return null;
            }
            recentMember.setUserId(contactInfo.getUserId());
            recentMember.setTaoFriendName(contactInfo.getDisplayName());
        } else if (parseInt == 2) {
            if (TextUtils.isEmpty(contactInfo.getGroupId())) {
                TLog.logi(TAG, "convertContactInfoToRecentMember: groupId is empty");
                return null;
            }
            recentMember.setCcode(getCCodeFromGroupId(contactInfo.getGroupId()));
            recentMember.setRecordNum(Integer.parseInt(contactInfo.getGroupUserNum()));
            recentMember.setTaoFriendName(contactInfo.getGroupUserNum() + com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17827));
            recentMember.setUserId((String) null);
        }
        recentMember.setName(contactInfo.getDisplayName());
        recentMember.setType(Integer.parseInt(contactInfo.getContactType()));
        recentMember.setShareChannel((int) SHARE_CHANNEL);
        if (TextUtils.isEmpty(contactInfo.getHeadUrl())) {
            recentMember.setHeadUrl("http://gw.alicdn.com/tfscom/TB1R7JxIpXXXXXDXpXXazxJIVXX-144-144.png");
        } else {
            recentMember.setHeadUrl(contactInfo.getHeadUrl());
        }
        recentMember.setTaoFlag("true");
        if (Integer.parseInt(contactInfo.getSourceType()) != 3) {
            z = true;
        }
        recentMember.setTaoFriend(z);
        recentMember.setBizSubType(contactInfo.getBizSubType());
        return recentMember;
    }

    public a wrapToContactsView(RecentMember recentMember, ContactInfo contactInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("903cc57a", new Object[]{this, recentMember, contactInfo});
        }
        if (recentMember == null || contactInfo == null) {
            TLog.logi(TAG, "wrapToContactsView: recentMember or contactInfo is null");
            return null;
        }
        a aVar = new a();
        aVar.a(recentMember.isTaoFriend() ? SourceType.RECENT : SourceType.RECOMMEND);
        aVar.a(ComponentType.CONTACT_ITEM);
        aVar.a(ShareTargetType.Share2Contact.getValue());
        com.taobao.tao.friends.model.b bVar = new com.taobao.tao.friends.model.b(recentMember.getName(), recentMember.getHeadUrl(), recentMember.getShareChannel(), recentMember.getBizSubType());
        bVar.c = ContactType.CONTINGENT;
        aVar.a(bVar);
        aVar.a(recentMember);
        aVar.c(contactInfo.getPvid());
        aVar.d(contactInfo.getScm());
        aVar.b(aVar.d());
        return aVar;
    }

    public String getCCodeFromGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74913019", new Object[]{this, str});
        }
        try {
            String replace = str.replace(str.substring(str.indexOf("#"), str.indexOf("#") + 2), "");
            return replace.substring(0, replace.length() - 2);
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }
}
