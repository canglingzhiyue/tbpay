package com.taobao.android.behavir;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.d;
import com.taobao.android.behavix.adapter.BXBRBridge;
import tb.drp;
import tb.kge;

/* loaded from: classes.dex */
public class c implements BXBRBridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f9131a;

    /* renamed from: com.taobao.android.behavir.c$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9132a = new int[BXBRBridge.ExtAction.values().length];

        static {
            try {
                f9132a[BXBRBridge.ExtAction.UPLOAD_UPP_PLAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9132a[BXBRBridge.ExtAction.UPLOAD_UPP_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9132a[BXBRBridge.ExtAction.UPDATE_SCENE_ARGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(1519087497);
        kge.a(153141268);
        f9131a = new c();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("31d34719", new Object[0]) : f9131a;
    }

    private c() {
    }

    @Override // com.taobao.android.behavix.adapter.BXBRBridge.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.android.behavir.init.a.a();
        }
    }

    @Override // com.taobao.android.behavix.adapter.BXBRBridge.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.android.behavir.init.b.a();
        }
    }

    @Override // com.taobao.android.behavix.adapter.BXBRBridge.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.behavir.config.a.a().d();
        com.taobao.android.behavir.config.a.a().e();
    }

    @Override // com.taobao.android.behavix.adapter.BXBRBridge.a
    public void a(BXBRBridge.ExtAction extAction, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c24b3", new Object[]{this, extAction, objArr});
        } else if (extAction == null) {
        } else {
            try {
                int i = AnonymousClass1.f9132a[extAction.ordinal()];
                if (i != 1 && i != 2 && i == 3) {
                    BehaviR.getInstance().updateScene((drp) objArr[0]);
                }
            } catch (Exception e) {
                d.a("BXBRProxy", e);
            }
        }
    }
}
