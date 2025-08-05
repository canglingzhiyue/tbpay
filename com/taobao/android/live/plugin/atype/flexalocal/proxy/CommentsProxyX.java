package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.ImportantEventFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.e;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import tb.hfv;
import tb.kge;

/* loaded from: classes6.dex */
public class CommentsProxyX implements ICommentsProxy, ICommentsProxy.a, ICommentsProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2022787915);
        kge.a(-591922209);
        kge.a(-1190534108);
        kge.a(1424413491);
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getChatFrame3Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("9edde138", new Object[]{this}) : ChatFrame3.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getMessageCardFrame3Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("fd18ec25", new Object[]{this}) : MessageCardFrame3.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getImportantEventFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("fc112bed", new Object[]{this}) : ImportantEventFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.a
    public String getEnhancedTypeQuestionAnswer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5dc720f", new Object[]{this}) : new hfv().getEnhancedTypeQuestionAnswer();
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageTimeoutTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("eacdcafb", new Object[]{this}) : new e().getImportantMessageTimeoutTime();
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageIntervalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("2197bec1", new Object[]{this}) : new e().getImportantMessageIntervalTime();
    }
}
