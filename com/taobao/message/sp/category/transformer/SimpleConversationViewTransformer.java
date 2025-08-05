package com.taobao.message.sp.category.transformer;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleMessageSummary;
import com.taobao.message.tree.core.model.ContentNode;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleConversationViewTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public static class ViewData {
        public String actionUrl;
        public String contentTip;
        public int contentTipLight;
        public String headIcon;
        public String leftIcon;
        public JSONArray menu;
        public String rightIcon;
        public int stick;
        public String summaryContent;
        public long time;
        public int tipNumber;
        public int tipType;
        public String title;

        static {
            kge.a(1052700356);
        }
    }

    static {
        kge.a(848461391);
        kge.a(1437606424);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        String str = (String) sharedState.getProp("accountId", String.class, "");
        TreeQueryResult treeQueryResult = (TreeQueryResult) sharedState.getOriginData("treeSource", TreeQueryResult.class, null);
        if (treeQueryResult == null) {
            return sharedState;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (ContentNode contentNode : treeQueryResult.list) {
            if ("conversation".equals(contentNode.getOriginalObjectType())) {
                hashMap2.put(contentNode.getNodeId(), conversationViewData((SimpleConversation) treeQueryResult.mergedData.originalDataPool.get("conversation").get(contentNode.getOriginalObjectId()), str, contentNode));
            }
        }
        hashMap.put("conversationViewData", hashMap2);
        return sharedState.updateRuntimeData(hashMap);
    }

    private ViewData conversationViewData(SimpleConversation simpleConversation, String str, ContentNode contentNode) {
        String str2;
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewData) ipChange.ipc$dispatch("57f6eb0", new Object[]{this, simpleConversation, str, contentNode});
        }
        ViewData viewData = new ViewData();
        viewData.title = ValueUtil.getString(contentNode.getComputedData(), "title");
        viewData.headIcon = ValueUtil.getString(contentNode.getComputedData(), "headIcon");
        viewData.tipType = ValueUtil.getInteger(contentNode.getComputedData(), "tipType");
        viewData.tipNumber = ValueUtil.getInteger(contentNode.getComputedData(), "tipNumber");
        SimpleMessageSummary lastMessageSummary = simpleConversation.getConversationContent().getLastMessageSummary();
        if (lastMessageSummary != null) {
            if (!TextUtils.isEmpty(simpleConversation.getConversationContent().getDraft())) {
                viewData.contentTipLight = 1;
                viewData.contentTip = DisplayUtil.localizedString(R.string.mp_draft);
                viewData.summaryContent = simpleConversation.getConversationContent().getDraft();
            } else if (TextUtils.isEmpty(lastMessageSummary.getContent())) {
                viewData.summaryContent = DisplayUtil.localizedString(R.string.mp_no_new_messages);
            } else {
                viewData.summaryContent = lastMessageSummary.getContent();
            }
            if (11 == lastMessageSummary.getStatus()) {
                viewData.leftIcon = ApplicationUtil.getApplication().getString(R.string.uik_icon_arrow_left_fill);
            } else if (13 == lastMessageSummary.getStatus()) {
                viewData.leftIcon = ApplicationUtil.getApplication().getString(R.string.uik_icon_info_fill);
            }
            if (lastMessageSummary.getSendTime() == 0) {
                viewData.time = simpleConversation.getModifyTime();
            } else {
                viewData.time = lastMessageSummary.getSendTime();
            }
        }
        if ((simpleConversation.getRemindType() & 1) == 1) {
            viewData.rightIcon = ApplicationUtil.getApplication().getString(R.string.uik_icon_notice_forbid_fill);
        }
        viewData.stick = simpleConversation.getPosition();
        try {
            str2 = URLEncoder.encode(simpleConversation.getConversationIdentifier().getTarget().getTargetId(), "UTF-8");
        } catch (Throwable th) {
            TLog.loge("SimpleConversationViewTransformer", simpleConversation.toString() + Log.getStackTraceString(th));
            str2 = str3;
        }
        try {
            str3 = URLEncoder.encode(simpleConversation.getConversationCode(), "UTF-8");
        } catch (Throwable th2) {
            TLog.loge("SimpleConversationViewTransformer", simpleConversation.toString() + Log.getStackTraceString(th2));
        }
        viewData.actionUrl = String.format("http://tb.cn/n/im/dynamic/chat.html?targetType=%s&targetId=%s&bizType=%s&ccode=%s&needByPass=false&source=MSGBOX", simpleConversation.getConversationIdentifier().getTarget().getTargetType(), str2, simpleConversation.getConversationIdentifier().getBizType(), str3);
        String localizedString = viewData.stick > 0 ? "取消置顶" : DisplayUtil.localizedString(R.string.mp_top);
        viewData.menu = JSON.parseArray("[{\"type\":\"0\", \"title\":\"" + DisplayUtil.localizedString(R.string.mp_remove) + "\"}, {\"type\":\"1\", \"title\":\"" + localizedString + "\"}]");
        return viewData;
    }
}
