package com.taobao.taobao.scancode.gateway.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;
import tb.kge;

/* loaded from: classes8.dex */
public class n {
    static {
        kge.a(513095569);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MaResult f21282a;
        private String b;

        static {
            kge.a(815668559);
        }

        public MaResult a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MaResult) ipChange.ipc$dispatch("56353992", new Object[]{this}) : this.f21282a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MaResultWrapper{maResult=" + this.f21282a + ", from='" + this.b + "'}";
        }

        public a(MaResult maResult, String str) {
            this.f21282a = maResult;
            this.b = str;
        }
    }
}
