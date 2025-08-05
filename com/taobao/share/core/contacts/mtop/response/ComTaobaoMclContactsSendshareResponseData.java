package com.taobao.share.core.contacts.mtop.response;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.taobao.contacts.data.member.ShareResultMember;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.nym;

/* loaded from: classes8.dex */
public class ComTaobaoMclContactsSendshareResponseData implements Serializable, IMTOPDataObject {
    private static final String TAG = "ComTaobaoMclContactsSendshareResponseData";
    public String feedId;
    public ShareResultMember[] friendList;
    public String intercept;
    public String isBizSuccess;
    public String isOpenActivity;
    public ShareResultMember[] needSendMsgList;
    public String rankPic;
    public ShareResultMember[] sendSuccessList;
    public String shareType;
    public ShareResultMember[] tf;

    static {
        kge.a(-1521855534);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public String getIntercept() {
        return this.intercept;
    }

    public void setIntercept(String str) {
        this.intercept = str;
    }

    public ShareResultMember[] getFriendList() {
        return this.friendList;
    }

    public void setFriendList(ShareResultMember[] shareResultMemberArr) {
        this.friendList = decryptFriend(shareResultMemberArr);
    }

    private ShareResultMember[] decryptFriend(ShareResultMember[] shareResultMemberArr) {
        if (shareResultMemberArr == null) {
            return shareResultMemberArr;
        }
        for (ShareResultMember shareResultMember : shareResultMemberArr) {
            shareResultMember.setName(decrypt(shareResultMember.getName()));
            shareResultMember.setPhone(decrypt(shareResultMember.getPhone()));
            shareResultMember.setUserNick(shareResultMember.getUserId());
        }
        return shareResultMemberArr;
    }

    private String decrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            str = SecurityGuardManager.getInstance(nym.a()).getStaticDataEncryptComp().staticSafeDecrypt(16, "share_secret", str, "");
        } catch (Exception e) {
            Log.e("decrypt", "failed : " + e.getMessage());
        }
        Log.e("decrypt", "decrypt dst : " + str);
        return str;
    }

    public ShareResultMember[] getSendSuccessList() {
        return this.sendSuccessList;
    }

    public void setSendSuccessList(ShareResultMember[] shareResultMemberArr) {
        this.sendSuccessList = decryptFriend(shareResultMemberArr);
    }

    public ShareResultMember[] getNeedSendMsgList() {
        return this.needSendMsgList;
    }

    public void setNeedSendMsgList(ShareResultMember[] shareResultMemberArr) {
        this.needSendMsgList = shareResultMemberArr;
    }

    public ShareResultMember[] getTf() {
        return this.tf;
    }

    public void setTf(ShareResultMember[] shareResultMemberArr) {
        this.tf = shareResultMemberArr;
    }

    public void setIsOpenActivity(String str) {
        this.isOpenActivity = str;
    }

    public String getIsOpenActivity() {
        return this.isOpenActivity;
    }

    public void setIsBizSuccess(String str) {
        this.isBizSuccess = str;
    }

    public String getIsBizSuccess() {
        return this.isBizSuccess;
    }

    public void setFeedId(String str) {
        this.feedId = str;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getShareType() {
        return this.shareType;
    }

    public void setShareType(String str) {
        this.shareType = str;
    }

    public String getRankPic() {
        return this.rankPic;
    }

    public void setRankPic(String str) {
        this.rankPic = str;
    }
}
