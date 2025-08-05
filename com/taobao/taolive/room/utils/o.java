package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.kge;
import tb.plx;
import tb.ply;
import tb.pmd;
import tb.pnh;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f21774a;
        public int b;

        static {
            kge.a(-492912039);
        }

        public a(int i, int i2) {
            this.f21774a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(1971185505);
    }

    public static pnh a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnh) ipChange.ipc$dispatch("7c73e12a", new Object[]{str}) : a(str, new a(d.e(), d.f()));
    }

    public static pnh a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnh) ipChange.ipc$dispatch("e09dc69b", new Object[]{str, aVar}) : a(str, aVar, true);
    }

    public static pnh a(String str, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnh) ipChange.ipc$dispatch("8043e329", new Object[]{str, aVar, new Boolean(z)});
        }
        if (ply.z()) {
            ImageStrategyConfig imageStrategyConfig = null;
            if (!z) {
                imageStrategyConfig = ImageStrategyConfig.a("liveroom").c(false).a();
            }
            str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(aVar.f21774a), Integer.valueOf(aVar.b), imageStrategyConfig);
            plx.a("ImageUtils", "imageUrl = " + str);
        }
        return pmd.a().l().a(str);
    }
}
