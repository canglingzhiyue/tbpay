package com.taobao.umipublish.extension.windvane;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/Item;", "", "actionName", "", "callClassName", "isRemote", "", "callClass", "Ljava/lang/Class;", "Lcom/taobao/umipublish/extension/windvane/call/WindvaneCall;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Class;)V", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "getCallClass", "()Ljava/lang/Class;", "setCallClass", "(Ljava/lang/Class;)V", "getCallClassName", "setCallClassName", "()Z", "setRemote", "(Z)V", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class Item {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f23271a;
    private String b;
    private boolean c;
    private Class<? extends WindvaneCall> d;

    static {
        kge.a(1376008234);
    }

    public Item(String actionName, String str, boolean z, Class<? extends WindvaneCall> cls) {
        q.d(actionName, "actionName");
        this.f23271a = actionName;
        this.b = str;
        this.c = z;
        this.d = cls;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public final Class<? extends WindvaneCall> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : this.d;
    }
}
