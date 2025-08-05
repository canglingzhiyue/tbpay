package com.taobao.android.dinamicx.widget.recycler.expose;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fzr;
import tb.fzs;
import tb.fzt;
import tb.fzu;
import tb.fzv;
import tb.fzw;
import tb.kge;

/* loaded from: classes5.dex */
public class ExposeHelperBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f12128a;
    private fzs b;
    private fzt c;
    private final fzr d;
    private fzw e;
    private fzv f;
    private fzu g;
    private long h = 500;
    private REPEAT_MODE i = REPEAT_MODE.NONE;

    /* loaded from: classes5.dex */
    public enum REPEAT_MODE {
        NONE,
        CELL_REPEAT
    }

    static {
        kge.a(1799917910);
    }

    public ExposeHelperBuilder(RecyclerView recyclerView, fzr fzrVar) {
        this.f12128a = recyclerView;
        this.d = fzrVar;
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e429402d", new Object[]{this}) : new c(this.f12128a, this);
    }

    public ExposeHelperBuilder a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("73261213", new Object[]{this, new Long(j)});
        }
        this.h = j;
        return this;
    }

    public ExposeHelperBuilder a(fzs fzsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("e468b276", new Object[]{this, fzsVar});
        }
        this.b = fzsVar;
        return this;
    }

    public ExposeHelperBuilder a(fzt fztVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("1816dd37", new Object[]{this, fztVar});
        }
        this.c = fztVar;
        return this;
    }

    public ExposeHelperBuilder a(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("9622d97", new Object[]{this, new Float(f)});
        }
        this.f = new fzv() { // from class: com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzv
            public float a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : f;
            }
        };
        return this;
    }

    public fzw b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzw) ipChange.ipc$dispatch("16b680ba", new Object[]{this}) : this.e;
    }

    public ExposeHelperBuilder a(REPEAT_MODE repeat_mode, fzw fzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("5b177fa4", new Object[]{this, repeat_mode, fzwVar});
        }
        this.i = repeat_mode;
        if (repeat_mode != REPEAT_MODE.NONE) {
            this.e = fzwVar;
        }
        return this;
    }

    public ExposeHelperBuilder a(fzu fzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeHelperBuilder) ipChange.ipc$dispatch("4bc507f8", new Object[]{this, fzuVar});
        }
        this.g = fzuVar;
        return this;
    }

    public fzs c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzs) ipChange.ipc$dispatch("1e68259d", new Object[]{this}) : this.b;
    }

    public fzu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzu) ipChange.ipc$dispatch("2619cb3a", new Object[]{this}) : this.g;
    }

    public fzt e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzt) ipChange.ipc$dispatch("2dcb707a", new Object[]{this}) : this.c;
    }

    public fzr f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzr) ipChange.ipc$dispatch("357d159b", new Object[]{this}) : this.d;
    }

    public fzv g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzv) ipChange.ipc$dispatch("3d2ebb76", new Object[]{this}) : this.f;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.h;
    }
}
