package com.taobao.message.sp.chat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.lab.aura.mp_aura_devtool.AuraDevTools;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.sp.chat.handler.SimpleDXRecyclerRefreshHandler;
import com.taobao.message.sp.chat.handler.SimpleLoadMessageEventHandler;
import com.taobao.message.sp.chat.handler.SimpleSendTxtEventHandler;
import com.taobao.message.sp.chat.source.SimpleChatConversationSource;
import com.taobao.message.sp.chat.source.SimpleMessageListSource;
import com.taobao.message.sp.chat.transformer.ChatInputTransformer;
import com.taobao.message.sp.chat.transformer.SimpleConversationBaseInfoTransformer;
import com.taobao.message.sp.chat.transformer.SimpleImageMessageVOTransform;
import com.taobao.message.sp.chat.transformer.SimpleMergeMessageTransformer;
import com.taobao.message.sp.chat.transformer.SimpleMessageComposeTransformer;
import com.taobao.message.sp.chat.transformer.SimpleMessageListDataStatusTransformer;
import com.taobao.message.sp.chat.transformer.SimpleMessageScrollTransformer;
import com.taobao.message.sp.chat.transformer.SimpleMessageSenderViewDataTransformer;
import com.taobao.message.sp.chat.transformer.SimpleMessageViewWrapperTimeTransformer;
import com.taobao.message.sp.chat.transformer.SimpleSplitMessagePartTransformer;
import com.taobao.message.sp.chat.transformer.SimpleSystemMessageVOTransform;
import com.taobao.message.sp.chat.transformer.SimpleVideoMessageVOTransform;
import com.taobao.message.sp.chat.widget.ImageMessageWidget;
import com.taobao.message.sp.chat.widget.SystemMessageWidget;
import com.taobao.message.sp.chat.widget.TextMessageWidget;
import com.taobao.message.sp.chat.widget.VideoMessageWidget;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.Collections;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleChatModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1587746358);
    }

    public static void injectDependencies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496846b", new Object[]{str});
            return;
        }
        SimpleFrameworkModule.injectDependencies(str);
        try {
            if (ApplicationUtil.isDebug()) {
                AuraDevTools.init(ApplicationUtil.getApplication().getBaseContext());
            }
        } catch (Throwable unused) {
        }
        InnerPushNotification.excludeActivityClassNames(Collections.singleton("com.taobao.message.sp.chat.widget.SimpleChatActivity"));
        ComponentFrmModule.initWithNamespace(SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("source.message.data.simpleConversation", SimpleChatConversationSource.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("source.message.data.simpleMessageList", SimpleMessageListSource.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.chat.input", ChatInputTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.messageFlow.simpleMessageSenderView", SimpleMessageSenderViewDataTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("splitTransformer.message.messageFlow.simplePart4msgType", SimpleSplitMessagePartTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("mergeTransformer.message.messageFlow.simpleViewData", SimpleMergeMessageTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("itemTransformer.message.messageFlow.simpleImageMessageView", SimpleImageMessageVOTransform.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("itemTransformer.message.messageFlow.simpleVideoMessageView", SimpleVideoMessageVOTransform.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("itemTransformer.message.messageFlow.simpleSystemMessageView", SimpleSystemMessageVOTransform.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.messageFlow.simpleListStatus", SimpleMessageListDataStatusTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.conversation.simpleBaseInfo", SimpleConversationBaseInfoTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.messageFlow.simpleScroll", SimpleMessageScrollTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.messageFlow.simpleWrapperTimeView", SimpleMessageViewWrapperTimeTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.messageFlow.simpleMessageCompose", SimpleMessageComposeTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("eventhandler.message.chat.txtSendClick", SimpleSendTxtEventHandler.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("eventHandler.message.messageFlow.loadMessage", SimpleLoadMessageEventHandler.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("dxPartRefreshHanlder.message.messageflow.simpleCommon", SimpleDXRecyclerRefreshHandler.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("widget.message.common.text", TextMessageWidget.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("widget.message.common.image", ImageMessageWidget.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("widget.message.common.video", VideoMessageWidget.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("widget.message.common.system", SystemMessageWidget.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
    }
}
