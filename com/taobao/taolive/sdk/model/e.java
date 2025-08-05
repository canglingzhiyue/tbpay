package com.taobao.taolive.sdk.model;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_QUEUE_SIZE = 300;

    /* renamed from: a  reason: collision with root package name */
    private Queue<ChatMessage> f21852a;
    private ConcurrentLinkedQueue<ChatMessage> b;

    static {
        kge.a(1858508411);
    }

    public e() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f21852a = new ConcurrentLinkedDeque();
        } else {
            this.f21852a = new ConcurrentLinkedQueue();
        }
        this.b = new ConcurrentLinkedQueue<>();
    }

    public boolean a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4873583", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null) {
            return false;
        }
        if (p.q() && c(chatMessage)) {
            return this.b.offer(chatMessage);
        }
        return this.f21852a.offer(chatMessage);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!p.q()) {
            return this.f21852a.isEmpty();
        }
        return this.f21852a.isEmpty() && this.b.isEmpty();
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        if (p.q()) {
            return this.f21852a.size() + this.b.size();
        }
        return this.f21852a.size();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) b();
    }

    public ChatMessage d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("d51d2da2", new Object[]{this});
        }
        if (p.q() && this.f21852a.isEmpty()) {
            return this.b.poll();
        }
        return this.f21852a.poll();
    }

    public ChatMessage e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("ef38ac41", new Object[]{this});
        }
        if (p.q() && this.f21852a.isEmpty()) {
            return this.b.peek();
        }
        return this.f21852a.peek();
    }

    public ArrayList<ChatMessage> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b1219bf5", new Object[]{this, new Integer(i)});
        }
        ArrayList<ChatMessage> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            ChatMessage poll = this.f21852a.poll();
            if (poll != null) {
                n.b("TLiveMessageQueue", "messageId = " + poll.mMessageId + "  , size = " + b());
                arrayList.add(poll);
            }
        }
        if (p.q() && !this.b.isEmpty()) {
            arrayList.add(this.b.poll());
        }
        return arrayList;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f21852a.clear();
        this.b.clear();
    }

    private boolean c(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("272fe005", new Object[]{this, chatMessage})).booleanValue();
        }
        if (!p.q() || chatMessage == null || chatMessage.renders == null) {
            return false;
        }
        String str = chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE);
        return "follow".equals(str) || "share".equals(str) || "fandomShare".equals(str);
    }

    public boolean b(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fddb8ac4", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage != null && chatMessage.mCommentId != null) {
            for (ChatMessage chatMessage2 : this.f21852a) {
                if (chatMessage2 != null && chatMessage2.mCommentId != null && chatMessage.mCommentId.equals(chatMessage2.mCommentId)) {
                    return true;
                }
            }
            Iterator<ChatMessage> it = this.b.iterator();
            while (it.hasNext()) {
                ChatMessage next = it.next();
                if (next != null && next.mCommentId != null && chatMessage.mCommentId.equals(next.mCommentId)) {
                    return true;
                }
            }
        }
        return false;
    }
}
