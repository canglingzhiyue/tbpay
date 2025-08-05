package com.taobao.themis.ability_taobao;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.resource.c;
import com.taobao.themis.pub.titlebar.action.e;
import com.taobao.themis.utils.TMSResourceUtils;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTitleBarBridge$setRightItem$3 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CountDownLatch $countDownLatch;
    public final /* synthetic */ Ref.ObjectRef $frame;
    public final /* synthetic */ String $icon;
    public final /* synthetic */ View.OnClickListener $onClickListener;
    public final /* synthetic */ ITMSPage $page;
    public final /* synthetic */ com.taobao.themis.kernel.container.ui.titlebar.b $titleBar;
    public final /* synthetic */ TMSTitleBarBridge this$0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/taobao/themis/ability_taobao/TMSTitleBarBridge$setRightItem$3$3$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22310a;
        public final /* synthetic */ TMSTitleBarBridge$setRightItem$3 b;

        public a(View view, TMSTitleBarBridge$setRightItem$3 tMSTitleBarBridge$setRightItem$3) {
            this.f22310a = view;
            this.b = tMSTitleBarBridge$setRightItem$3;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, com.alibaba.fastjson.JSONObject] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            Ref.ObjectRef objectRef = this.b.$frame;
            TMSTitleBarBridge tMSTitleBarBridge = this.b.this$0;
            com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.b.$titleBar;
            View view = this.f22310a;
            objectRef.element = TMSTitleBarBridge.$ipChange;
            this.b.$countDownLatch.countDown();
            this.f22310a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSTitleBarBridge$setRightItem$3(TMSTitleBarBridge tMSTitleBarBridge, com.taobao.themis.kernel.container.ui.titlebar.b bVar, Ref.ObjectRef objectRef, ITMSPage iTMSPage, CountDownLatch countDownLatch, String str, View.OnClickListener onClickListener) {
        super(0);
        this.this$0 = tMSTitleBarBridge;
        this.$titleBar = bVar;
        this.$frame = objectRef;
        this.$page = iTMSPage;
        this.$countDownLatch = countDownLatch;
        this.$icon = str;
        this.$onClickListener = onClickListener;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [T, com.alibaba.fastjson.JSONObject] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        e eVar = (e) this.$titleBar.getAction(e.class);
        if (eVar != null) {
            Ref.ObjectRef objectRef = this.$frame;
            TMSTitleBarBridge tMSTitleBarBridge = this.this$0;
            com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.$titleBar;
            Activity o = this.$page.b().o();
            q.b(o, "page.getInstance().activity");
            eVar.a(o);
            objectRef.element = TMSTitleBarBridge.$ipChange;
            this.$countDownLatch.countDown();
        }
        if (!TextUtils.isEmpty(this.$icon)) {
            String str = this.$icon;
            q.a((Object) str);
            TMSResourceUtils.ResourceType a3 = TMSResourceUtils.a(str);
            q.b(a3, "TMSResourceUtils.getResourceType(icon!!)");
            if (a3 != TMSResourceUtils.ResourceType.INTERNAL) {
                this.$titleBar.addRightButton(this.$icon, this.$onClickListener);
            } else {
                com.taobao.themis.open.extension.e eVar2 = (com.taobao.themis.open.extension.e) this.$page.b().b(com.taobao.themis.open.extension.e.class);
                c a4 = eVar2 != null ? eVar2.a(this.$icon) : null;
                if (a4 != null && (a2 = a4.a()) != null) {
                    this.$titleBar.addRightButton(new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeByteArray(a2, 0, a2.length)), this.$onClickListener);
                }
            }
        }
        if (this.$titleBar.getAction(e.class) == null) {
            this.$countDownLatch.countDown();
        } else if (((JSONObject) this.$frame.element) == null) {
            e eVar3 = (e) this.$titleBar.getAction(e.class);
            if (eVar3 == null) {
                return;
            }
            Activity o2 = this.$page.b().o();
            q.b(o2, "page.getInstance().activity");
            View a5 = eVar3.a(o2);
            if (a5 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = a5.getViewTreeObserver();
            q.b(viewTreeObserver, "view.viewTreeObserver");
            viewTreeObserver.addOnGlobalLayoutListener(new a(a5, this));
        } else {
            this.$countDownLatch.countDown();
        }
    }
}
