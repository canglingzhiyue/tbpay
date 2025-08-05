package com.taobao.search.musie.taowise;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public interface b {
    public static final a MuiseViewFactory = a.f19282a;

    Object a(String str);

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f19282a;
        private static b b;

        static {
            kge.a(-1765523072);
            f19282a = new a();
        }

        private a() {
        }

        public final b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("68f4f3c", new Object[]{this}) : b;
        }

        public final void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f2557c", new Object[]{this, bVar});
            } else {
                b = bVar;
            }
        }
    }
}
