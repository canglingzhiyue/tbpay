package com.taobao.android.behavix.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class BXBRBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f9165a;

    /* loaded from: classes4.dex */
    public enum ExtAction {
        UPLOAD_UPP_PLAN,
        UPLOAD_UPP_CONFIG,
        UPDATE_SCENE_ARGS
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(ExtAction extAction, Object... objArr);

        void b();

        void c();

        void d();
    }

    static {
        kge.a(-1241182264);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b159a9b4", new Object[]{aVar});
        } else {
            f9165a = aVar;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        a aVar = f9165a;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        a aVar = f9165a;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        a aVar = f9165a;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    public static void a(ExtAction extAction, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c24b3", new Object[]{extAction, objArr});
            return;
        }
        a aVar = f9165a;
        if (aVar == null) {
            return;
        }
        aVar.a(extAction, objArr);
    }
}
