package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.flexbox.layoutmanager.container.dx.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.fvb;
import tb.ogg;
import tb.ruk;
import tb.rul;
import tb.rva;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/taobao/android/dinamicx/notification/DXNotificationResult;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DxContainer$createView$1 extends Lambda implements rul<fvb, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f20232a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Ref.ObjectRef e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ a.b h;
    public final /* synthetic */ long i;
    public final /* synthetic */ rul j;
    public final /* synthetic */ rva k;
    public final /* synthetic */ DXTemplateItem l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createView$1(a aVar, String str, long j, String str2, Ref.ObjectRef objectRef, int i, int i2, a.b bVar, long j2, rul rulVar, rva rvaVar, DXTemplateItem dXTemplateItem) {
        super(1);
        this.f20232a = aVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = objectRef;
        this.f = i;
        this.g = i2;
        this.h = bVar;
        this.i = j2;
        this.j = rulVar;
        this.k = rvaVar;
        this.l = dXTemplateItem;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainer$createView$1$3  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static final class AnonymousClass3 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
            super(0);
        }

        @Override // tb.ruk
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2427invoke() {
            mo2427invoke();
            return t.INSTANCE;
        }

        @Override // tb.ruk
        /* renamed from: invoke  reason: collision with other method in class */
        public final void mo2427invoke() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                DxContainer$createView$1.this.f20232a.a(DxContainer$createView$1.this.f, DxContainer$createView$1.this.g, DxContainer$createView$1.this.b, DxContainer$createView$1.this.c, DxContainer$createView$1.this.d, DxContainer$createView$1.this.h, DxContainer$createView$1.this.j, DxContainer$createView$1.this.k);
            }
        }
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(fvb fvbVar) {
        invoke2(fvbVar);
        return t.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [com.taobao.android.dinamicx.template.download.DXTemplateItem, T] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(fvb it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4341799d", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        a aVar = this.f20232a;
        if (a.$ipChange) {
            return;
        }
        try {
            if (it.f28139a != null) {
                a aVar2 = this.f20232a;
                if (a.$ipChange != null) {
                    ogg.a("DxContainer", "当前成功下载的模板个数：" + it.f28139a.size());
                    List<DXTemplateItem> list = it.f28139a;
                    q.b(list, "it.finishedTemplateItems");
                    for (DXTemplateItem dXTemplateItem : list) {
                        if (q.a((Object) dXTemplateItem.f11925a, (Object) this.b)) {
                            ogg.a("DxContainer", "下载成功模板：name:" + this.b + ",version:" + this.c + ",url:" + this.d);
                            Ref.ObjectRef objectRef = this.e;
                            a aVar3 = this.f20232a;
                            DinamicXEngine dinamicXEngine = a.$ipChange;
                            q.a(dinamicXEngine);
                            objectRef.element = dinamicXEngine.a(dXTemplateItem);
                            a aVar4 = this.f20232a;
                            int i = this.f;
                            int i2 = this.g;
                            DXTemplateItem targetDXTemplateItem = (DXTemplateItem) this.e.element;
                            q.b(targetDXTemplateItem, "targetDXTemplateItem");
                            a.b bVar = this.h;
                            long j = this.i;
                            rul rulVar = this.j;
                            rva rvaVar = this.k;
                            View unused = a.$ipChange;
                        }
                    }
                    List<DXTemplateItem> list2 = it.b;
                    if (list2 != null) {
                        for (DXTemplateItem dXTemplateItem2 : list2) {
                            if (q.a((Object) dXTemplateItem2.f11925a, (Object) this.b)) {
                                d dVar = d.INSTANCE;
                                String str = this.l.f11925a;
                                q.b(str, "sourceDXTemplateItem.name");
                                DXTemplateItem b = dVar.b(str);
                                if (b == null) {
                                    b = this.l;
                                }
                                a aVar5 = this.f20232a;
                                String str2 = this.b;
                                String str3 = "下载模板失败:" + this.b;
                                new DxContainer$createView$1$$special$$inlined$forEach$lambda$1(b, this);
                                View unused2 = a.$ipChange;
                            }
                        }
                    }
                }
            }
            rul rulVar2 = this.j;
            if (rulVar2 == null) {
                return;
            }
            rulVar2.mo2421invoke(it);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("下载回调执行异常:");
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            sb.append(message);
            ogg.a("DxContainer", sb.toString());
            a aVar6 = this.f20232a;
            String str4 = this.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("下载回调执行异常:");
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            sb2.append(message2);
            sb2.toString();
            kotlin.a.a(th);
            new AnonymousClass3();
            View unused3 = a.$ipChange;
        }
    }
}
