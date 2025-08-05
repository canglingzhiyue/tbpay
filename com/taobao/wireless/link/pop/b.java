package com.taobao.wireless.link.pop;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f23617a;

        static {
            kge.a(-1391979436);
            f23617a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b2a169f0", new Object[0]) : f23617a;
        }
    }

    static {
        kge.a(-7238271);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b2a169f0", new Object[0]) : a.a();
    }

    private b() {
    }

    public boolean a(Context context, int i, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e50e48d", new Object[]{this, context, new Integer(i), popMessageData})).booleanValue();
        }
        if (popMessageData == null) {
            rkg.a("link_tag", "PopMessageVerifier === verify == 消息对象为空，不显示pop");
            rki.a(rki.ARG1_POP_NOT_DATA, "", "", null);
            return false;
        } else if (!rkj.c(context)) {
            rkg.a("link_tag", "PopMessageVerifier === verify == 没有悬浮窗权限，不显示pop");
            return false;
        } else if (rkj.b(context)) {
            rkg.a("link_tag", "PopMessageVerifier === verify === 锁屏状态不处理消息，亮屏回到桌面再处理");
            rki.a(rki.ARG1_POP_SCREEN_LOCK, popMessageData.messageId, "", null);
            return false;
        } else if (rjt.a().d) {
            rkg.a("link_tag", "PopMessageVerifier === verify == app在前台，不显示桌面push");
            rki.a(rki.ARG1_POP_IN_FRONT, popMessageData.messageId, "", null);
            return false;
        } else if (!d.g(context)) {
            rkg.a("link_tag", "PopMessageVerifier === verify == 本地没有要展示的消息，主动发起mtop请求拉取");
            c.b(context, i);
            return false;
        } else if (!d.b(context, popMessageData)) {
            rkg.a("link_tag", "PopMessageVerifier === verify == 消息体不完整");
            rki.a(rki.ARG1_POP_DATA_NOT_COMPLETE, popMessageData.messageId, "", null);
            return false;
        } else if (rkj.a() > popMessageData.expireTime) {
            rkg.a("link_tag", "PopMessageVerifier === verify == 消息体过期，不显示桌面push");
            rki.a(rki.ARG1_POP_DATA_EXPIRE, popMessageData.messageId, "", null);
            return false;
        } else if (d.b(popMessageData)) {
            rkg.a("link_tag", "PopMessageVerifier === verify == 在手淘版本黑名单，不支持桌面push");
            rki.a(rki.ARG1_POP_DATA_IN_BLACK, popMessageData.messageId, "", null);
            return false;
        } else if (d.a(context)) {
            return true;
        } else {
            rkg.a("link_tag", "PopMessageVerifier === verify == 机型和系统版本，不支持桌面消息：" + popMessageData.messageType);
            rki.a(rki.ARG1_POP_NOT_IN_WHITELIST, popMessageData.messageId, "", null);
            return false;
        }
    }
}
