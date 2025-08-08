package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import tb.kge;
import tb.plx;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(793221967);
    }

    public void a(ViewGroup viewGroup, ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4157ad64", new Object[]{this, viewGroup, chatTopMessage});
        } else if (viewGroup == null || chatTopMessage == null || chatTopMessage.mData == null) {
        } else {
            if (StringUtils.isEmpty(chatTopMessage.mDxTemplateName)) {
                plx.b("EntranceAreaDXRender", "renderEntranceItem | template name is Empty.");
                return;
            }
            viewGroup.removeAllViews();
            DXRootView createDX = com.taobao.android.live.plugin.proxy.f.m().createDX(viewGroup.getContext(), chatTopMessage.mDxTemplateName);
            if (createDX == null) {
                return;
            }
            viewGroup.addView(createDX);
            com.taobao.android.live.plugin.proxy.f.m().renderDX(createDX, chatTopMessage.mData);
        }
    }
}
