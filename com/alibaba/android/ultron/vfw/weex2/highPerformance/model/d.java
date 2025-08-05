package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f2791a;
    public final b b;
    public final f c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    static {
        kge.a(271253880);
    }

    private d(String str, b bVar, f fVar, String str2, String str3, String str4, String str5) {
        this.f2791a = str;
        this.b = bVar;
        this.c = fVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private b b;
        private f c;
        private String e;
        private String f;
        private String g;

        /* renamed from: a  reason: collision with root package name */
        private String f2792a = "";
        private String d = UltronTradeHybridStage.ON_RENDER_END;

        static {
            kge.a(-2041257905);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed93ba59", new Object[]{this, str});
            }
            this.f2792a = str;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e057d2cf", new Object[]{this, bVar});
            }
            this.b = bVar;
            return this;
        }

        public a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4f5dc1d3", new Object[]{this, fVar});
            }
            this.c = fVar;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3334fcf8", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78d63f97", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("be778236", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("418c4d5", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c43325c0", new Object[]{this}) : new d(this.f2792a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
