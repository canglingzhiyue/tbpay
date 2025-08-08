package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class ChatTopMessage extends ChatMessage implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HIDE_RANK_LEVEL = -1;
    private static final int SHOW_NORMAL_RANK_LEVEL = 0;
    public JSONObject mData;
    public String mDxTemplateName;
    private String mFansLevel;
    private boolean mIsMerge;
    private int mLeftMargin;
    private String mMedalFrameImg;
    public int mMsgCnt;
    public int mProvType;
    private int mRank;
    private boolean mShowFansIcon;
    public int mShowTime;
    private String mTopMessageBgColor;

    static {
        kge.a(2119586866);
        kge.a(-767529189);
    }

    public ChatTopMessage(int i, ChatMessage chatMessage) {
        this.mMsgCnt = 1;
        this.mRank = 0;
        this.mIsMerge = true;
        this.mShowFansIcon = true;
        this.mLeftMargin = 0;
        this.mShowTime = -1;
        if (chatMessage != null) {
            this.mProvType = i;
            this.mType = chatMessage.mType;
            this.mUserNick = chatMessage.mUserNick;
            this.mContent = chatMessage.mContent;
        }
    }

    public ChatTopMessage(int i, ChatMessage chatMessage, HashMap<String, String> hashMap) {
        this.mMsgCnt = 1;
        this.mRank = 0;
        this.mIsMerge = true;
        this.mShowFansIcon = true;
        this.mLeftMargin = 0;
        this.mShowTime = -1;
        if (chatMessage != null) {
            this.mProvType = i;
            this.mType = chatMessage.mType;
            this.mUserNick = chatMessage.mUserNick;
            this.mContent = chatMessage.mContent;
            if (hashMap == null || hashMap.size() <= 0) {
                return;
            }
            this.renders.putAll(hashMap);
        }
    }

    public ChatTopMessage(int i, String str, String str2, TLiveMsg tLiveMsg) {
        this.mMsgCnt = 1;
        this.mRank = 0;
        this.mIsMerge = true;
        this.mShowFansIcon = true;
        this.mLeftMargin = 0;
        this.mShowTime = -1;
        this.mProvType = i;
        if (StringUtils.isEmpty(str) && tLiveMsg != null) {
            this.mUserNick = tLiveMsg.from;
        } else {
            this.mUserNick = str;
        }
        if (StringUtils.isEmpty(str2)) {
            try {
                this.mContent = (String) JSON.parseObject(new String(tLiveMsg.data)).getObject("content", String.class);
            } catch (Exception unused) {
            }
        } else {
            this.mContent = str2;
        }
        if (i == 1005 || i == 1040 || i == 3008) {
            setRank4FansLevel();
        }
    }

    public ChatTopMessage(int i, String str, String str2, TLiveMsg tLiveMsg, HashMap<String, String> hashMap) {
        this(i, str, str2, tLiveMsg, hashMap, false);
    }

    public ChatTopMessage(int i, String str, String str2, TLiveMsg tLiveMsg, HashMap<String, String> hashMap, boolean z) {
        this(i, str, str2, tLiveMsg);
        if (hashMap != null && hashMap.size() > 0) {
            this.renders.putAll(hashMap);
        }
        this.mShowFansIcon = z;
    }

    public boolean showFansIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("930ff401", new Object[]{this})).booleanValue() : this.mShowFansIcon;
    }

    public void setHideRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ef4797", new Object[]{this});
        } else {
            this.mRank = -1;
        }
    }

    public void setShowRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a45a52", new Object[]{this});
        } else if (this.mRank >= 0) {
        } else {
            this.mRank = 0;
        }
    }

    public String getMedalFrameImg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c23c3e2", new Object[]{this}) : this.mMedalFrameImg;
    }

    public void setMedalFrameImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf49a3c", new Object[]{this, str});
        } else {
            this.mMedalFrameImg = str;
        }
    }

    public boolean isHighRank(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28dbe28", new Object[]{this, new Integer(i)})).booleanValue() : this.mRank == -1;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.f
    public int getRank() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b0b181c", new Object[]{this})).intValue() : this.mRank;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.f
    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.mProvType;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.f
    public int getMsgCnt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f24b8e98", new Object[]{this})).intValue() : this.mMsgCnt;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.f
    public void setMsgCnt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8c2c72", new Object[]{this, new Integer(i)});
        } else {
            this.mMsgCnt = i;
        }
    }

    public String getTopMessageBgColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a61234a3", new Object[]{this}) : this.mTopMessageBgColor;
    }

    public void setTopMessageBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b3679b", new Object[]{this, str});
        } else {
            this.mTopMessageBgColor = str;
        }
    }

    public boolean isMerge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7258eb9", new Object[]{this})).booleanValue() : this.mIsMerge;
    }

    public void setLeftMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406c4f25", new Object[]{this, new Integer(i)});
        } else {
            this.mLeftMargin = i;
        }
    }

    public int getLeftMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c680af85", new Object[]{this})).intValue() : this.mLeftMargin;
    }

    public void setRank4FansLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e595585", new Object[]{this});
        } else {
            this.mRank = 0;
        }
    }

    public void setFansLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6050273", new Object[]{this, str});
        } else {
            this.mFansLevel = str;
        }
    }

    public String getFansLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f9b12cb", new Object[]{this}) : this.mFansLevel;
    }
}
