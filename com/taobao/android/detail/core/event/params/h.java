package com.taobao.android.detail.core.event.params;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public String f9721a;
    public String b;
    public String c;
    public String d;
    public View.OnClickListener e;

    static {
        kge.a(1005020440);
    }

    private h(a aVar) {
        this.f9721a = aVar.f9722a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        emu.a("com.taobao.android.detail.core.event.params.ServiceBannerParams");
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9722a;
        public String b;
        public String c;
        public String d;
        public View.OnClickListener e;

        static {
            kge.a(1472439279);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4735fed", new Object[]{this, str});
            }
            this.f9722a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e79f132e", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cacac66f", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("adf679b0", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fea1748c", new Object[]{this, onClickListener});
            }
            this.e = onClickListener;
            return this;
        }

        public h a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("4dfe680", new Object[]{this}) : new h(this);
        }
    }
}
