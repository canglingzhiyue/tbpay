package com.taobao.android.layoutmanager.adapter.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes5.dex */
public class ad implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1114154022);
        kge.a(-1531719641);
    }

    /* loaded from: classes5.dex */
    public static class a implements NotifyManager.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private C0507a f13114a;

        static {
            kge.a(-60866097);
            kge.a(1419203533);
        }

        /* renamed from: com.taobao.android.layoutmanager.adapter.impl.ad$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0507a implements aek {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public NotifyManager.h f13115a;

            static {
                kge.a(-272707152);
                kge.a(1845411121);
            }

            public C0507a(NotifyManager.h hVar) {
                this.f13115a = hVar;
            }

            @Override // tb.aek
            public ael onEvent(int i, aej aejVar, Object... objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
                }
                if (i != 3005 || objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) {
                    return null;
                }
                try {
                    JSONObject parseObject = JSON.parseObject((String) objArr[0]);
                    if (this.f13115a == null) {
                        return null;
                    }
                    this.f13115a.a(parseObject);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        public a(NotifyManager.h hVar) {
            this.f13114a = new C0507a(hVar);
            aem.a().a(this.f13114a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.f13114a == null) {
            } else {
                aem.a().b(this.f13114a);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.v
    public NotifyManager.g a(NotifyManager.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotifyManager.g) ipChange.ipc$dispatch("29be9bef", new Object[]{this, hVar}) : new a(hVar);
    }
}
