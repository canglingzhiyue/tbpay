package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhc;

/* loaded from: classes2.dex */
public class bhd extends bhc<Fragment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f25897a;
    private final bhc.b<Fragment> b;

    static {
        kge.a(-1789137303);
    }

    @Override // tb.bhc
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : bgp.FRAGMENT;
    }

    private bhd(Context context, String str, Bundle bundle, bhc.b<Fragment> bVar) {
        super(context, str, bundle);
        this.f25897a = bundle;
        this.b = bVar;
    }

    public static a a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88b18a21", new Object[]{context, str}) : new a(context, str);
    }

    @Override // tb.bhc
    public bhc.b<Fragment> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("c2b5f57e", new Object[]{this}) : this.b;
    }

    /* loaded from: classes2.dex */
    public static class a extends bhc.a<bhd, a, Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Bundle d;
        private bhc.b e;

        static {
            kge.a(-2042213312);
        }

        public a f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c2b669be", new Object[]{this}) : this;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [tb.bhc, tb.bhd] */
        @Override // tb.bhc.a
        public /* synthetic */ bhd b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhc) ipChange.ipc$dispatch("16b46940", new Object[]{this}) : e();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [tb.bhd$a, tb.bhc$a] */
        @Override // tb.bhc.a
        public /* synthetic */ a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhc.a) ipChange.ipc$dispatch("fefa6221", new Object[]{this}) : f();
        }

        private a(Context context, String str) {
            super(context, str);
        }

        public bhd e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhd) ipChange.ipc$dispatch("2dc9597c", new Object[]{this}) : new bhd(this.f25896a, this.b, this.d, this.e);
        }

        public a a(bhc.b<Fragment> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b9e070e", new Object[]{this, bVar});
            }
            this.e = bVar;
            return f();
        }

        @Override // tb.bhc.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.f25896a == null || !(this.f25896a instanceof Activity)) {
                throw new IllegalArgumentException("context can not be null and must be activity context!");
            } else {
                if (this.b != null && !StringUtils.isEmpty(this.b)) {
                    return;
                }
                throw new IllegalArgumentException("className can not be null");
            }
        }
    }
}
