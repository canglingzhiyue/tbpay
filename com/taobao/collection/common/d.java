package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.SwitchOption;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SwitchOption.CollectionType f16914a;
    private Code b;
    private Object c;

    static {
        kge.a(2110664084);
    }

    public SwitchOption.CollectionType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwitchOption.CollectionType) ipChange.ipc$dispatch("d6047770", new Object[]{this}) : this.f16914a;
    }

    public void a(SwitchOption.CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89a3f6a", new Object[]{this, collectionType});
        } else {
            this.f16914a = collectionType;
        }
    }

    public Code b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Code) ipChange.ipc$dispatch("25979707", new Object[]{this}) : this.b;
    }

    public void a(Code code) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f867ab86", new Object[]{this, code});
        } else {
            this.b = code;
        }
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }
}
