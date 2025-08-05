package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class DXResult<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NORMAL = 0;
    public static final int PRE_RENDER = 1;
    public static final int PRE_RENDER_X = 2;

    /* renamed from: a  reason: collision with root package name */
    public T f11780a;
    private s b;
    private aa c;
    private Map<String, String> d;
    private int e = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface HitStatus {
    }

    static {
        kge.a(-1736409436);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.e;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public DXResult(T t) {
        this.f11780a = t;
    }

    public DXResult(s sVar) {
        this.b = sVar;
    }

    public DXResult(T t, s sVar) {
        this.f11780a = t;
        this.b = sVar;
    }

    public DXResult() {
    }

    public s a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("a0545d19", new Object[]{this}) : this.b;
    }

    public void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea75199", new Object[]{this, sVar});
        } else {
            this.b = sVar;
        }
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.f11780a = t;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        s sVar = this.b;
        return sVar != null && sVar.c.size() > 0;
    }

    public aa c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("52b57808", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new aa();
        }
        return this.c;
    }

    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1556bf04", new Object[]{this, aaVar});
        } else {
            this.c = aaVar;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }
}
