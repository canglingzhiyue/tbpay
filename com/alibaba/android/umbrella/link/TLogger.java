package com.alibaba.android.umbrella.link;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.n;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.io.Serializable;
import java.util.Map;
import java.util.Random;
import tb.bpt;

/* loaded from: classes2.dex */
public final class TLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Random f2818a = new Random();
    private static volatile AliLogInterface b;

    /* loaded from: classes2.dex */
    public static final class LinkLogTLogDO implements Serializable {
        public String umb1;
        public String umb10;
        public String umb11;
        public String umb12;
        public String umb13;
        public String umb14;
        public String umb15;
        public String umb16;
        public String umb17;
        public String umb18;
        public String umb19;
        public String umb2;
        public Object umb20;
        public String umb21;
        public String umb22;
        public String umb23;
        public String umb24;
        public String umb25;
        public String umb26;
        public String umb27;
        public String umb28;
        public String umb29;
        public String umb3;
        public String umb30;
        public String umb31;
        public String umb32;
        public String umb33;
        public String umb34;
        public String umb35;
        public String umb4;
        public String umb5;
        public String umb6;
        public String umb7;
        public String umb8;
        public String umb9;
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77fd3a2", new Object[]{bVar});
            return;
        }
        AliLogInterface a2 = a();
        if (a2 == null) {
            return;
        }
        String a3 = bpt.a(b(bVar));
        int nextInt = f2818a.nextInt(Integer.MAX_VALUE);
        int length = a3.length();
        if (length < 10240) {
            a(a2, bVar, a3, nextInt, "-1");
            return;
        }
        int i2 = 0;
        while (i < length) {
            int i3 = i + AccsConnection.DATA_PACKAGE_MAX;
            a(a2, bVar, a3.substring(i, Math.min(i3, length)), nextInt, String.valueOf(i2));
            i2++;
            i = i3;
        }
    }

    private static void a(AliLogInterface aliLogInterface, b bVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a36e50", new Object[]{aliLogInterface, bVar, str, new Integer(i), str2});
            return;
        }
        aliLogInterface.d("umbrella", "umbrella", bVar.b() + "↕︎" + bVar.c() + "↕︎" + bVar.i() + "↕︎" + i + "↕︎" + str2 + "↕︎" + str);
    }

    private static LinkLogTLogDO b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkLogTLogDO) ipChange.ipc$dispatch("c114a4b8", new Object[]{bVar});
        }
        LinkLogTLogDO linkLogTLogDO = new LinkLogTLogDO();
        linkLogTLogDO.umb1 = bVar.b();
        linkLogTLogDO.umb2 = bVar.c();
        linkLogTLogDO.umb3 = bVar.d();
        linkLogTLogDO.umb4 = bVar.f();
        linkLogTLogDO.umb5 = bVar.g();
        linkLogTLogDO.umb6 = bVar.h();
        linkLogTLogDO.umb7 = bVar.i();
        linkLogTLogDO.umb8 = bVar.j();
        linkLogTLogDO.umb9 = bVar.k();
        linkLogTLogDO.umb10 = String.valueOf(bVar.m());
        linkLogTLogDO.umb11 = String.valueOf(bVar.n());
        linkLogTLogDO.umb12 = bVar.a();
        linkLogTLogDO.umb13 = bVar.l();
        linkLogTLogDO.umb20 = bVar.p() == null ? "" : bVar.p().b();
        Map<UMDimKey, Object> o = bVar.o();
        if (o == null) {
            return linkLogTLogDO;
        }
        linkLogTLogDO.umb21 = bpt.a(o.get(UMDimKey.DIM_1));
        linkLogTLogDO.umb22 = bpt.a(o.get(UMDimKey.DIM_2));
        linkLogTLogDO.umb23 = bpt.a(o.get(UMDimKey.DIM_3));
        linkLogTLogDO.umb24 = bpt.a(o.get(UMDimKey.DIM_4));
        linkLogTLogDO.umb25 = bpt.a(o.get(UMDimKey.DIM_5));
        linkLogTLogDO.umb26 = bpt.a(o.get(UMDimKey.DIM_6));
        linkLogTLogDO.umb27 = bpt.a(o.get(UMDimKey.DIM_7));
        linkLogTLogDO.umb28 = bpt.a(o.get(UMDimKey.DIM_8));
        linkLogTLogDO.umb29 = bpt.a(o.get(UMDimKey.DIM_9));
        linkLogTLogDO.umb30 = bpt.a(o.get(UMDimKey.DIM_10));
        linkLogTLogDO.umb31 = bpt.a(o.get(UMDimKey.TAG_1));
        linkLogTLogDO.umb32 = bpt.a(o.get(UMDimKey.TAG_2));
        linkLogTLogDO.umb33 = bpt.a(o.get(UMDimKey.TAG_3));
        linkLogTLogDO.umb34 = bpt.a(o.get(UMDimKey.TAG_4));
        linkLogTLogDO.umb35 = bpt.a(o.get(UMDimKey.TAG_5));
        return linkLogTLogDO;
    }

    private static AliLogInterface a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogInterface) ipChange.ipc$dispatch("584ac75d", new Object[0]);
        }
        if (b == null) {
            synchronized (TLogger.class) {
                if (b == null) {
                    b = n.a();
                }
            }
        }
        return b;
    }
}
