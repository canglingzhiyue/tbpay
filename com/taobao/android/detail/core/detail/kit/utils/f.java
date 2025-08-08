package com.taobao.android.detail.core.detail.kit.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import java.util.Map;
import java.util.WeakHashMap;
import tb.emu;
import tb.epj;
import tb.epl;
import tb.epm;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ImageLoaderCenter";

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, a> f9547a = new WeakHashMap<>();

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final f f9549a;

        static {
            kge.a(-350712982);
            f9549a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5e143003", new Object[0]) : f9549a;
        }
    }

    static {
        kge.a(1761681043);
    }

    public f() {
        emu.a("com.taobao.android.detail.core.detail.kit.utils.ImageLoaderCenter");
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3c975cde", new Object[]{context});
        }
        f a2 = a();
        a aVar = a2.f9547a.get(context);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        a2.f9547a.put(context, aVar2);
        return aVar2;
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5e143003", new Object[0]) : b.a();
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<DetailImageView, String> f9548a = new WeakHashMap<>();

        static {
            kge.a(-1710314808);
        }

        public void a(DetailImageView detailImageView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28799cb3", new Object[]{this, detailImageView, str});
            } else {
                a(detailImageView, str, null);
            }
        }

        public void a(DetailImageView detailImageView, String str, epm epmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f234efc1", new Object[]{this, detailImageView, str, epmVar});
            } else {
                a(detailImageView, str, epmVar, null);
            }
        }

        public void a(DetailImageView detailImageView, String str, epm epmVar, com.taobao.android.detail.datasdk.protocol.image.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ff3ef", new Object[]{this, detailImageView, str, epmVar, bVar});
            } else {
                a(detailImageView, str, epmVar, bVar, null);
            }
        }

        public void a(DetailImageView detailImageView, String str, epm epmVar, com.taobao.android.detail.datasdk.protocol.image.b bVar, epl eplVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ecdd69e", new Object[]{this, detailImageView, str, epmVar, bVar, eplVar});
            } else if (detailImageView == null) {
            } else {
                this.f9548a.put(detailImageView, str);
                epl.a aVar = new epl.a();
                if (eplVar != null) {
                    aVar.b(eplVar.a()).b(eplVar.e()).a(eplVar.c()).a(eplVar.d()).c(eplVar.b());
                }
                if (epmVar != null) {
                    aVar.c(epmVar.f27510a).d(epmVar.b).b(epmVar.e).c(epmVar.c).a(epmVar.d);
                }
                epj.b().a(str, detailImageView, aVar.a(), bVar);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!this.f9548a.isEmpty()) {
                for (Map.Entry<DetailImageView, String> entry : this.f9548a.entrySet()) {
                    if (entry.getKey() != null && !StringUtils.isEmpty(entry.getValue())) {
                        epj.b().a(entry.getValue(), entry.getKey());
                        com.taobao.android.detail.core.utils.i.d(f.TAG, "load image url :" + entry.getValue());
                    }
                }
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            com.taobao.android.detail.core.utils.i.d(f.TAG, "releaseImg");
            if (this.f9548a.isEmpty()) {
                return;
            }
            for (Map.Entry<DetailImageView, String> entry : this.f9548a.entrySet()) {
                epj.b().a((String) null, entry.getKey());
                com.taobao.android.detail.core.utils.i.d(f.TAG, "release image url :" + entry.getValue());
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.f9548a.isEmpty()) {
            } else {
                this.f9548a.clear();
            }
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!this.f9547a.containsKey(context)) {
        } else {
            a aVar = this.f9547a.get(context);
            if (aVar != null) {
                aVar.c();
            }
            this.f9547a.remove(context);
        }
    }
}
