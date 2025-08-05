package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.ArrayList;
import tb.kge;
import tb.ply;

/* loaded from: classes5.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d c;

    /* renamed from: a  reason: collision with root package name */
    private Handler f13613a = new HandlerC0527a();
    private final ArrayList<ChatMessage> b = new ArrayList<>();
    private final boolean d = ply.q();

    static {
        kge.a(962760152);
        kge.a(126412073);
    }

    public static /* synthetic */ d a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6d6c264b", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ ArrayList b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("34825fad", new Object[]{aVar}) : aVar.b;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c
    public boolean a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4873583", new Object[]{this, chatMessage})).booleanValue();
        }
        if (!this.d || chatMessage == null || !b(chatMessage)) {
            return false;
        }
        this.b.add(chatMessage);
        return true;
    }

    private boolean b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fddb8ac4", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage != null && chatMessage.renders != null && !chatMessage.renders.isEmpty()) {
            return TextUtils.equals(chatMessage.renders.get("showMod"), "BOTTOM");
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c241ef", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.f13613a.sendEmptyMessage(10086);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f13613a.removeCallbacksAndMessages(null);
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.c
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        d dVar = this.c;
        if (dVar == null) {
            return null;
        }
        return dVar.b();
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.bottom.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class HandlerC0527a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2014513023);
        }

        public HandlerC0527a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 10086) {
            } else {
                removeMessages(10086);
                sendEmptyMessageDelayed(10086, 500L);
                if (a.a(a.this) == null) {
                    return;
                }
                a.a(a.this).a(a.b(a.this));
                a.a(a.this).a();
                a.b(a.this).clear();
            }
        }
    }
}
