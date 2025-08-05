package com.taobao.taolive.room.utils;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import tb.cgl;
import tb.kge;
import tb.pmd;
import tb.ppp;

/* loaded from: classes8.dex */
public class y {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAOLIVE_ONLINE_LIVE_ID = "id=200518454785";

    /* renamed from: a  reason: collision with root package name */
    private static y f21781a;
    private ppp.a b;

    static {
        kge.a(-987861600);
    }

    public static /* synthetic */ ppp.a a(y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppp.a) ipChange.ipc$dispatch("c445ea7b", new Object[]{yVar}) : yVar.b;
    }

    public static /* synthetic */ ppp.a a(y yVar, ppp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppp.a) ipChange.ipc$dispatch("6d46dd38", new Object[]{yVar, aVar});
        }
        yVar.b = aVar;
        return aVar;
    }

    public static y a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y) ipChange.ipc$dispatch("d2b55efe", new Object[0]);
        }
        if (f21781a == null) {
            f21781a = new y();
        }
        return f21781a;
    }

    private y() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.core.f.a().a(pmd.a().u().c(), aw.BIZCODE_TAOBAO);
        com.taobao.taolive.sdk.core.f.a().a(new ISmallWindowStrategy() { // from class: com.taobao.taolive.room.utils.y.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                    return;
                }
                if (!TextUtils.isEmpty(str) && aa.i()) {
                    str = str.replace(y.TAOLIVE_ONLINE_LIVE_ID, "id=" + aa.C());
                }
                if (TextUtils.isEmpty(str)) {
                    str = c.a(str2);
                }
                s.a(view.getContext(), str, null, 67108864, false);
            }
        });
        com.taobao.taolive.sdk.core.f.a().a(new ppp() { // from class: com.taobao.taolive.room.utils.y.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ppp
            public void a(ppp.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc06e48b", new Object[]{this, aVar});
                    return;
                }
                y.a(y.this, aVar);
                pmd.a().u().a(y.a(y.this));
            }
        });
        if (cgl.p() == null) {
            return;
        }
        cgl.p().a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pmd.a().u().b(this.b);
        com.taobao.taolive.sdk.core.f.a().e();
        this.b = null;
        f21781a = null;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TAOLIVE_ONLINE_LIVE_ID.equals("id=" + str)) {
            if (!"id=219181588018".equals("id=" + str)) {
                return false;
            }
        }
        return true;
    }
}
