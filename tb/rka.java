package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.assistant.display.AssistantView;
import com.taobao.wireless.link.controller.b;
import com.taobao.wireless.link.model.MessageData;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class rka extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static rka f33198a;

        static {
            kge.a(-59992739);
            f33198a = new rka();
        }

        public static /* synthetic */ rka a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rka) ipChange.ipc$dispatch("f0a14d6", new Object[0]) : f33198a;
        }
    }

    static {
        kge.a(885211274);
    }

    public static rka a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rka) ipChange.ipc$dispatch("f0a14d6", new Object[0]) : a.a();
    }

    private rka() {
    }

    @Override // com.taobao.wireless.link.controller.b
    public void a(final Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28b6b9b", new Object[]{this, context, messageData});
            return;
        }
        new HashMap().put(bah.KEY_MESSAGE_DATA, messageData.assistant_title);
        rki.a(rki.ARG1_ASSISTANT_GET_MESSAGE, messageData.activity_id, messageData.message_id, null);
        rkk a2 = rkk.a(context);
        messageData.msg_arrive_time = rkj.a();
        if (rkj.b(context)) {
            rjw.a(a2, messageData);
            rjw.b(a2, messageData);
            rkg.a("link_tag", "MessageCenter === execute === 锁屏状态不处理消息，亮屏回到桌面再处理");
        } else if (TextUtils.equals(com.taobao.wireless.link.controller.a.a().f23587a.assistant_type, "close")) {
            rkg.a("link_tag", "MessageCenter === execute === 推送开关，关闭小助手");
            rjw.c(a2);
            rjw.a(context, a2, messageData.activity_id);
            rjw.b(context, messageData.activity_id);
            rju.a().b(context, false);
            AssistantView.updateAssistantView(0, messageData.assistant_title, messageData.assistant_pic_url);
            com.taobao.wireless.link.controller.a.a().b().postDelayed(new Runnable() { // from class: tb.rka.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rju.a().b(context);
                    }
                }
            }, 8000L);
        } else if (!TextUtils.equals(com.taobao.wireless.link.controller.a.a().f23587a.assistant_type, "msg") || !rjw.f(context)) {
        } else {
            rjw.a(a2, messageData);
            rjw.b(a2, messageData);
            String a3 = rjw.a(context);
            rjv a4 = rjw.a(context, a2, a3, messageData.activity_id);
            if (!TextUtils.isEmpty(messageData.assistant_logo_url)) {
                a4.c = messageData.assistant_logo_url;
            }
            a4.d = rkj.a();
            rjw.a(a2, messageData.activity_id, a3, a4);
            String str = messageData.activity_id;
            rjw.a(context, str, a3, a4.d + "");
            rkg.a("link_tag", "MessageCenter === execute === 开始渲染小助手，清除待显示的消息");
            com.taobao.wireless.link.assistant.display.a.a(context);
        }
    }
}
