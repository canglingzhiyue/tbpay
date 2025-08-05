package com.taobao.tab2interact.core.data.baseinfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class TabBaseInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private State f19764a;
    private Map<String, String> b;
    private final String c;

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
        kge.a(1356240514);
    }

    public TabBaseInfo(String type) {
        q.d(type, "type");
        this.c = type;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final State a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (State) ipChange.ipc$dispatch("dfb892ae", new Object[]{this}) : this.f19764a;
    }

    public final void a(State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851b64a8", new Object[]{this, state});
        } else {
            this.f19764a = state;
        }
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }
}
