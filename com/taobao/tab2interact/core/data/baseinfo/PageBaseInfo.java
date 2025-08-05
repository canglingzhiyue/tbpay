package com.taobao.tab2interact.core.data.baseinfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public final class PageBaseInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private State f19763a;
    private Map<String, String> b;

    /* loaded from: classes8.dex */
    public enum State {
        CREATE("create"),
        START("start"),
        STOP("stop"),
        DESTROY("destroy");
        
        private final String text;

        State(String str) {
            this.text = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    static {
        kge.a(-2098650144);
    }

    public final State a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (State) ipChange.ipc$dispatch("d29dcb0c", new Object[]{this}) : this.f19763a;
    }

    public final void a(State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b282cc", new Object[]{this, state});
        } else {
            this.f19763a = state;
        }
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }
}
