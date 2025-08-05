package com.taobao.taolive.sdk.model.message;

import android.text.SpannableString;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.UserAvatar;
import com.taobao.taolive.sdk.model.interact.CommentGoodInfo;
import com.taobao.taolive.sdk.model.interact.MedalLevelEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ChatMessage implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static List<Integer> COLOR_RANGE = null;
    public static final String KEY_MEDAL_LIST_DT = "medalList";
    public static final String KEY_MEDAL_LIST_TB = "taobaoMedalList";
    public int actionRes;
    public String actionUrl;
    public int bgColor;
    public ChatItemCommonData chatItemCommonData;
    public List<SpannableString> mCommentIcons;
    public String mCommentId;
    public String mContent;
    public ArrayList<UserAvatar> mEnterUsers;
    public JSONObject mExtraParams;
    public SpannableString mFansLight;
    private List<MedalLevelEntity> mMedalLevelList;
    public long mMessageId;
    public int mNickColor;
    public String mOrignalUserNick;
    public long mReceivedTimestamp;
    public List<SpannableString> mSpannableContent;
    public long mTimestamp;
    public String mUserIcon;
    public long mUserId;
    public String mUserNick;
    public MessageType mType = MessageType.TXT;
    public boolean isAnchor = false;
    public boolean scrollToMsg = false;
    public HashMap<String, String> renders = new HashMap<>();
    public Map<String, Object> userData = new HashMap();
    public ArrayList<CommentGoodInfo> commodities = new ArrayList<>();
    public boolean isOnScreen = true;
    public int mTextColor = 0;
    private Random mRandom = new Random();

    /* loaded from: classes8.dex */
    public static class ChatItemCommonData implements INetDataObject {
        public String bizType;
        public com.alibaba.fastjson.JSONObject data;
        public String showType;
        public String templateName;
        public String voName;

        static {
            kge.a(-1541799796);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public enum MessageType {
        ENTER,
        TXT,
        ZAN,
        FOLLOW,
        TRADE,
        VOTE,
        TASKREWARD,
        GOOD_RATE
    }

    static {
        kge.a(-1865876264);
        kge.a(-540945145);
        ArrayList arrayList = new ArrayList();
        COLOR_RANGE = arrayList;
        arrayList.add(Integer.valueOf(R.color.taolive_chat_color1));
        COLOR_RANGE.add(Integer.valueOf(R.color.taolive_chat_color2));
        COLOR_RANGE.add(Integer.valueOf(R.color.taolive_chat_color3));
        COLOR_RANGE.add(Integer.valueOf(R.color.taolive_chat_color4));
    }

    public ChatMessage() {
        List<Integer> list = COLOR_RANGE;
        this.mNickColor = list.get(this.mRandom.nextInt(list.size())).intValue();
    }

    public static ChatMessage createConventionMessage(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("9081e31f", new Object[]{str, str2, new Integer(i)});
        }
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mNickColor = i;
        chatMessage.mType = MessageType.TXT;
        chatMessage.mUserNick = str;
        chatMessage.mContent = str2;
        return chatMessage;
    }

    public void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
        } else {
            this.bgColor = i;
        }
    }

    public int getBgColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1061a262", new Object[]{this})).intValue() : this.bgColor;
    }

    public List<MedalLevelEntity> getMedalLevelList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5703a33f", new Object[]{this}) : this.mMedalLevelList;
    }

    public void setMedalLevelList(List<MedalLevelEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5008c505", new Object[]{this, list});
        } else {
            this.mMedalLevelList = list;
        }
    }
}
