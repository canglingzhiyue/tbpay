package com.taobao.android.live.plugin.proxy.comments;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class CommentsProxy extends g<ICommentsProxy> implements ICommentsProxy, ICommentsProxy.a, ICommentsProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CommentsProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final CommentsProxy f14095a;

        static {
            kge.a(1317784388);
            f14095a = new CommentsProxy();
        }

        public static /* synthetic */ CommentsProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CommentsProxy) ipChange.ipc$dispatch("679be6ed", new Object[0]) : f14095a;
        }
    }

    static {
        kge.a(2089728556);
        kge.a(-591922209);
        kge.a(-1190534108);
        kge.a(1424413491);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : ICommentsProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentsProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveCommentsPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "评论区域/重要消息通知漂条";
    }

    public static CommentsProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommentsProxy) ipChange.ipc$dispatch("76aa6897", new Object[0]) : a.a();
    }

    private CommentsProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[CommentsProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getChatFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9edde138", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        Class<? extends BaseFrame> chatFrame3Class = real != null ? real.getChatFrame3Class() : null;
        e.c("[CommentsProxy#getChatFrame3Class]  value: " + chatFrame3Class);
        return chatFrame3Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getMessageCardFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fd18ec25", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        Class<? extends BaseFrame> messageCardFrame3Class = real != null ? real.getMessageCardFrame3Class() : null;
        e.c("[CommentsProxy#getMessageCardFrame3Class]  value: " + messageCardFrame3Class);
        return messageCardFrame3Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getImportantEventFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fc112bed", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        Class<? extends BaseFrame> importantEventFrameClass = real != null ? real.getImportantEventFrameClass() : null;
        e.c("[CommentsProxy#getImportantEventFrameClass]  value: " + importantEventFrameClass);
        return importantEventFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.a
    public String getEnhancedTypeQuestionAnswer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5dc720f", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        String enhancedTypeQuestionAnswer = real != null ? ((ICommentsProxy.a) real).getEnhancedTypeQuestionAnswer() : null;
        e.c("[CommentsProxy#getImportantEventFrameClass]  value: " + enhancedTypeQuestionAnswer);
        return enhancedTypeQuestionAnswer;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2197bec1", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        Long importantMessageIntervalTime = real != null ? ((ICommentsProxy.b) real).getImportantMessageIntervalTime() : null;
        e.c("[CommentsProxy#getImportantMessageIntervalTime]  value: " + importantMessageIntervalTime);
        return importantMessageIntervalTime;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageTimeoutTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eacdcafb", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        Long importantMessageTimeoutTime = real != null ? ((ICommentsProxy.b) real).getImportantMessageTimeoutTime() : null;
        e.c("[CommentsProxy#getImportantMessageTimeoutTime]  value: " + importantMessageTimeoutTime);
        return importantMessageTimeoutTime;
    }
}
