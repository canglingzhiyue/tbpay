package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f2799a;
    public final String b;
    private List<String> c;
    public final List<String> d;

    static {
        kge.a(88905119);
    }

    private h(String str, String str2, List<String> list) {
        this.f2799a = str;
        this.b = str2;
        this.d = list;
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2800a = "";
        private String b = UltronTradeHybridStage.ON_RENDER_END;
        private List<String> c;

        static {
            kge.a(-250651274);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed958bd5", new Object[]{this, str});
            }
            this.f2800a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3336ce74", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2796a5ce", new Object[]{this, list});
            }
            this.c = list;
            return this;
        }

        public h a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("c433263c", new Object[]{this}) : new h(this.f2800a, this.b, this.c);
        }
    }
}
