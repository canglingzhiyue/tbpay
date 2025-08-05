package com.taobao.homepage.view.manager;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import tb.kge;
import tb.lbo;
import tb.mjx;
import tb.ohv;

/* loaded from: classes7.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OnScreenChangedListener f17325a;

    static {
        kge.a(-1556221933);
    }

    public o(lbo lboVar) {
        a(lboVar);
    }

    private void a(final lbo lboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f278c67f", new Object[]{this, lboVar});
        } else if (!com.taobao.homepage.utils.b.b() && !com.taobao.homepage.utils.b.c()) {
        } else {
            this.f17325a = new OnScreenChangedListener() { // from class: com.taobao.homepage.view.manager.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                    }
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        return;
                    }
                    lbo lboVar2 = lboVar;
                    if (lboVar2 == null) {
                        return;
                    }
                    ohv e = lboVar2.e();
                    if (e != null) {
                        e.p();
                    }
                    if (!com.taobao.homepage.utils.b.c()) {
                        return;
                    }
                    mjx i2 = lboVar.i();
                    IHomeSubTabController z = com.taobao.tao.topmultitab.c.a().z();
                    if (i2 == null || z == null) {
                        return;
                    }
                    i2.b(z.isEnableToSecondFloor());
                }
            };
            h.a().c(this.f17325a);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f17325a == null) {
        } else {
            h.a().d(this.f17325a);
        }
    }
}
