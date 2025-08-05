package com.taobao.message.sp.framework.implement;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleConversationContent;
import com.taobao.message.sp.framework.model.SimpleConversationIdentifier;
import com.taobao.message.sp.framework.model.SimpleMessageSummary;
import com.taobao.message.sp.framework.model.SimpleMsgCode;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpConversationListRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpConversationListResponse;
import com.taobao.message.sp.framework.service.ISimpleConversationService;
import com.taobao.message.sp.framework.service.SimpleConversationCache;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\nH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBaseConversationService;", "Lcom/taobao/message/sp/framework/service/ISimpleConversationService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "createConversation", "", "targetId", "observer", "Lcom/taobao/message/kit/core/IObserver;", "", "getChannelType", "getIdentifier", "getListConversationsChannelList", "", "listConversations", "count", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "parseConversation", "conversationObject", "Lcom/alibaba/fastjson/JSONObject;", "parseConversationList", "jsonData", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public abstract class SimpleBaseConversationService implements ISimpleConversationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        kge.a(-898349445);
        kge.a(2070126457);
    }

    public abstract List<String> getListConversationsChannelList();

    public SimpleBaseConversationService(String mIdentifier, String mChannelType) {
        q.c(mIdentifier, "mIdentifier");
        q.c(mChannelType, "mChannelType");
        this.mIdentifier = mIdentifier;
        this.mChannelType = mChannelType;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleConversationService
    public void createConversation(String targetId, IObserver<Boolean> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5d578e", new Object[]{this, targetId, observer});
            return;
        }
        q.c(targetId, "targetId");
        q.c(observer, "observer");
        observer.onError(new IllegalAccessException("not implement"));
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleConversationService
    public void listConversations(int i, IObserver<List<SimpleConversation>> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b008f4", new Object[]{this, new Integer(i), observer});
            return;
        }
        q.c(observer, "observer");
        TraceUtil.asyncTraceBegin("simpleTab", "listConversations", 1111111);
        MtopTaobaoWirelessAmpConversationListRequest mtopTaobaoWirelessAmpConversationListRequest = new MtopTaobaoWirelessAmpConversationListRequest();
        mtopTaobaoWirelessAmpConversationListRequest.setFetchCount(i);
        mtopTaobaoWirelessAmpConversationListRequest.setStartTime("0");
        mtopTaobaoWirelessAmpConversationListRequest.setMsgChannelTypeList(JSON.toJSONString(getListConversationsChannelList()));
        mtopTaobaoWirelessAmpConversationListRequest.setSource("mtop");
        mtopTaobaoWirelessAmpConversationListRequest.setAppName("bentley");
        long currentTimeMillis = System.currentTimeMillis();
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabSimpleOpenCache");
        if (isFeatureOpened) {
            String msgSimpleTab = SharedPreferencesUtil.getStringSharedPreference("msgSimpleTab");
            if (!TextUtils.isEmpty(msgSimpleTab)) {
                q.a((Object) msgSimpleTab, "msgSimpleTab");
                List<SimpleConversation> parseConversationList = parseConversationList(msgSimpleTab);
                StringBuilder sb = new StringBuilder();
                sb.append("listConversations cache");
                sb.append((parseConversationList != null ? Integer.valueOf(parseConversationList.size()) : null).intValue());
                TLog.loge("SimpleConversationService", sb.toString());
                SimpleConversationCache.INSTANCE.addData(parseConversationList);
                observer.onNext(parseConversationList);
            }
        }
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmpConversationListRequest).registerListener((IRemoteListener) new SimpleBaseConversationService$listConversations$1(this, currentTimeMillis, observer, isFeatureOpened)).startRequest(MtopTaobaoWirelessAmpConversationListResponse.class);
    }

    private final SimpleConversation parseConversation(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("f350a9ef", new Object[]{this, jSONObject});
        }
        SimpleConversation simpleConversation = new SimpleConversation();
        simpleConversation.setConversationContent(new SimpleConversationContent());
        SimpleConversationContent conversationContent = simpleConversation.getConversationContent();
        q.a((Object) conversationContent, "conversation.conversationContent");
        conversationContent.setLastMessageSummary(new SimpleMessageSummary());
        simpleConversation.setConversationIdentifier(new SimpleConversationIdentifier());
        SimpleConversationIdentifier conversationIdentifier = simpleConversation.getConversationIdentifier();
        q.a((Object) conversationIdentifier, "conversation.conversationIdentifier");
        conversationIdentifier.setTarget(new SimpleTarget());
        JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
        if (jSONObject2 != null) {
            SimpleConversationIdentifier conversationIdentifier2 = simpleConversation.getConversationIdentifier();
            q.a((Object) conversationIdentifier2, "conversation.conversationIdentifier");
            conversationIdentifier2.setBizType(jSONObject2.getString("bizType"));
            simpleConversation.setConversationCode(jSONObject2.getString("conversationId"));
            simpleConversation.setModifyTime(jSONObject2.getLongValue(SimpleProfile.KEY_MODIFY_TIME));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("lastMessage");
        if (jSONObject3 != null) {
            SimpleConversationContent conversationContent2 = simpleConversation.getConversationContent();
            q.a((Object) conversationContent2, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary = conversationContent2.getLastMessageSummary();
            q.a((Object) lastMessageSummary, "conversation.conversatio…ontent.lastMessageSummary");
            lastMessageSummary.setSendTime(jSONObject3.getLongValue(RemoteMessageConst.SEND_TIME));
            SimpleConversationContent conversationContent3 = simpleConversation.getConversationContent();
            q.a((Object) conversationContent3, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary2 = conversationContent3.getLastMessageSummary();
            q.a((Object) lastMessageSummary2, "conversation.conversatio…ontent.lastMessageSummary");
            lastMessageSummary2.setContent(jSONObject3.getString("content"));
            SimpleConversationContent conversationContent4 = simpleConversation.getConversationContent();
            q.a((Object) conversationContent4, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary3 = conversationContent4.getLastMessageSummary();
            q.a((Object) lastMessageSummary3, "conversation.conversatio…ontent.lastMessageSummary");
            if (TextUtils.isEmpty(lastMessageSummary3.getContent())) {
                SimpleConversationContent conversationContent5 = simpleConversation.getConversationContent();
                q.a((Object) conversationContent5, "conversation.conversationContent");
                SimpleMessageSummary lastMessageSummary4 = conversationContent5.getLastMessageSummary();
                q.a((Object) lastMessageSummary4, "conversation.conversatio…ontent.lastMessageSummary");
                lastMessageSummary4.setContent(DisplayUtil.localizedString(R.string.mp_click_to_view_details));
            }
            SimpleConversationContent conversationContent6 = simpleConversation.getConversationContent();
            q.a((Object) conversationContent6, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary5 = conversationContent6.getLastMessageSummary();
            q.a((Object) lastMessageSummary5, "conversation.conversatio…ontent.lastMessageSummary");
            lastMessageSummary5.setCode(new SimpleMsgCode(jSONObject3.getString(RemoteMessageConst.MSGID)));
        }
        simpleConversation.setChannelType(jSONObject.getString("msgChannelType"));
        simpleConversation.setRemindType(jSONObject.getIntValue("remindType"));
        simpleConversation.setPosition(jSONObject.getIntValue("position"));
        JSONObject jSONObject4 = jSONObject.getJSONObject("targetUser");
        if (jSONObject4 != null) {
            SimpleConversationIdentifier conversationIdentifier3 = simpleConversation.getConversationIdentifier();
            q.a((Object) conversationIdentifier3, "conversation.conversationIdentifier");
            conversationIdentifier3.setTarget(SimpleTarget.obtain("3", jSONObject4.getString("userId")));
            SimpleConversationContent conversationContent7 = simpleConversation.getConversationContent();
            q.a((Object) conversationContent7, "conversation.conversationContent");
            conversationContent7.setConversationName(jSONObject4.getString(SimpleProfile.KEY_DISPLAYNAME));
            SimpleConversationContent conversationContent8 = simpleConversation.getConversationContent();
            q.a((Object) conversationContent8, "conversation.conversationContent");
            conversationContent8.setHeadUrl(jSONObject4.getString("headUrl"));
        }
        SimpleConversationContent conversationContent9 = simpleConversation.getConversationContent();
        q.a((Object) conversationContent9, "conversation.conversationContent");
        conversationContent9.setUnReadNumber(jSONObject.getIntValue("unReadNum"));
        return simpleConversation;
    }

    private final List<SimpleConversation> parseConversationList(String str) {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e83bef82", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && (parseArray = JSON.parseArray(str)) != null && parseArray.size() > 0) {
            int size = parseArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = parseArray.getJSONObject(i);
                q.a((Object) jSONObject, "jsonArray.getJSONObject(i)");
                SimpleConversation parseConversation = parseConversation(jSONObject);
                if (parseConversation != null) {
                    arrayList.add(parseConversation);
                }
            }
        }
        return arrayList;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleDataService
    public String getIdentifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.mIdentifier;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleDataService
    public String getChannelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this}) : this.mChannelType;
    }
}
