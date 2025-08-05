package com.taobao.android.ai;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ai.api.IAfterBuyAiApi;
import com.taobao.android.task.Coordinator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bhc;
import tb.bhf;
import tb.kge;
import tb.ldf;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f9010a = new AtomicBoolean(false);
    private final InterfaceC0347a b;

    /* renamed from: com.taobao.android.ai.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0347a {
        void a(IAfterBuyAiApi iAfterBuyAiApi);

        void a(String str);
    }

    static {
        kge.a(-1548144255);
    }

    public static /* synthetic */ bhc.b a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("43fbf99f", new Object[]{aVar}) : aVar.b();
    }

    public static /* synthetic */ d b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b61cff1", new Object[]{aVar}) : aVar.a();
    }

    public static /* synthetic */ AtomicBoolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("398cccaa", new Object[]{aVar}) : aVar.f9010a;
    }

    public static /* synthetic */ InterfaceC0347a d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0347a) ipChange.ipc$dispatch("7bed1530", new Object[]{aVar}) : aVar.b;
    }

    public a(InterfaceC0347a interfaceC0347a) {
        this.b = interfaceC0347a;
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f9010a.get()) {
            ldf.d("AfterBuyAiDownloader", "ready download");
        } else {
            this.f9010a.set(true);
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.ai.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ldf.d("AfterBuyAiDownloader", "executeLoad start");
                    h.a(context).a(j.a().a(bhf.a(context, IAfterBuyAiApi.class).a(a.a(a.this)).a()).a()).a(a.b(a.this));
                }
            });
        }
    }

    private d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("73895d34", new Object[]{this}) : new d() { // from class: com.taobao.android.ai.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                a.c(a.this).set(false);
                a.d(a.this).a(exc.getMessage());
                ldf.d("AfterBuyAiDownloader", "bundle开始安装失败");
            }
        };
    }

    private bhc.b<Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("3b3ecf02", new Object[]{this}) : new bhc.b<Object>() { // from class: com.taobao.android.ai.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(Object obj, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    return;
                }
                ldf.d("AfterBuyAiDownloader", "onInstantiate ：" + obj);
                if (!(obj instanceof IAfterBuyAiApi)) {
                    ldf.d("AfterBuyAiDownloader", "!(o instanceof IAfterBuyAiApi)");
                    InterfaceC0347a d = a.d(a.this);
                    d.a("加载返回的对象类型不匹配, Object : " + obj);
                    return;
                }
                ldf.d("AfterBuyAiDownloader", "bundle加载成功");
                a.c(a.this).set(true);
                a.d(a.this).a((IAfterBuyAiApi) obj);
            }

            @Override // tb.bhc.b
            public void a(String str, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    return;
                }
                a.c(a.this).set(false);
                a.d(a.this).a(str);
                ldf.d("AfterBuyAiDownloader", "bundle加载失败");
            }
        };
    }
}
