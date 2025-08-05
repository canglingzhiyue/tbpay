package com.taobao.themis.widget.broadcast;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/widget/broadcast/BroadcastChannel;", "", "channelToken", "", "(Ljava/lang/String;)V", "isEmpty", "", "()Z", "mMembers", "Ljava/util/HashMap;", "Lcom/taobao/themis/widget/broadcast/BroadcastMember;", "Lkotlin/collections/HashMap;", "mMsgQueue", "Ljava/util/ArrayList;", "Lcom/taobao/themis/widget/broadcast/BroadcastMsg;", "Lkotlin/collections/ArrayList;", "destroy", "", "exit", "memberInstanceId", com.taobao.android.weex_framework.util.a.ATOM_join, "member", "sendMessage", "instanceId", "msg", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, c> f22915a;
    private final ArrayList<BroadcastMsg> b;
    private final String c;

    static {
        kge.a(1650204421);
    }

    public a(String channelToken) {
        q.d(channelToken, "channelToken");
        this.c = channelToken;
        this.f22915a = new HashMap<>();
        this.b = new ArrayList<>();
    }

    public final boolean a(c member) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93ff6fb", new Object[]{this, member})).booleanValue();
        }
        q.d(member, "member");
        String a2 = member.a();
        if (this.f22915a.containsKey(a2)) {
            return false;
        }
        this.f22915a.put(a2, member);
        if (!this.b.isEmpty()) {
            member.a(this.b);
        }
        return true;
    }

    public final boolean a(String memberInstanceId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, memberInstanceId})).booleanValue();
        }
        q.d(memberInstanceId, "memberInstanceId");
        if (!this.f22915a.containsKey(memberInstanceId)) {
            return false;
        }
        this.f22915a.remove(memberInstanceId);
        return true;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f22915a.isEmpty();
    }

    public final boolean a(String instanceId, BroadcastMsg msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b0b7e70", new Object[]{this, instanceId, msg})).booleanValue();
        }
        q.d(instanceId, "instanceId");
        q.d(msg, "msg");
        if (!this.f22915a.containsKey(instanceId)) {
            return false;
        }
        this.b.add(msg);
        ArrayList<BroadcastMsg> arrayList = new ArrayList<>(1);
        arrayList.add(msg);
        for (c cVar : this.f22915a.values()) {
            if (!TextUtils.equals(cVar.a(), instanceId)) {
                cVar.a(arrayList);
            }
        }
        return true;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f22915a.clear();
        this.b.clear();
    }
}
