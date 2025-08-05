package com.taobao.themis.ability.basic.prerender;

import android.taobao.windvane.export.prerender.f;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility;
import com.taobao.android.abilityidl.ability.ClientPrerenderPrerenderAttachDetail;
import com.taobao.android.abilityidl.ability.fy;
import com.taobao.android.abilityidl.ability.gc;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.als;
import tb.gml;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/ability/basic/prerender/TMSClientPrerenderAbility;", "Lcom/taobao/android/abilityidl/ability/AbsClientPrerenderAbility;", "()V", "addPrerenderAttachEventListener", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "callback", "Lcom/taobao/android/abilityidl/ability/IClientPrerenderAddPrerenderAttachEvents;", "removePrerenderAttachEventListener", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "reportPrerenderStatus", "params", "Lcom/taobao/android/abilityidl/ability/ClientPrerenderReportPrerenderStatusParams;", "start", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSClientPrerenderAbility extends AbsClientPrerenderAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/ability/basic/prerender/TMSClientPrerenderAbility$addPrerenderAttachEventListener$1", "Landroid/taobao/windvane/export/prerender/IPrerenderAttachListener;", "onAttach", "", "url", "", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements android.taobao.windvane.export.prerender.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gc f22293a;

        public a(gc gcVar) {
            this.f22293a = gcVar;
        }

        @Override // android.taobao.windvane.export.prerender.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            ClientPrerenderPrerenderAttachDetail clientPrerenderPrerenderAttachDetail = new ClientPrerenderPrerenderAttachDetail();
            if (str == null) {
                return;
            }
            clientPrerenderPrerenderAttachDetail.url = str;
            this.f22293a.a(clientPrerenderPrerenderAttachDetail);
        }
    }

    static {
        kge.a(-1831104636);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void addPrerenderAttachEventListener(als context, gc callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cd66f9", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        View g = context.g();
        if (g instanceof WVUCWebView) {
            ((WVUCWebView) g).getWebViewContext().addPrerenderAttachEventListener(new a(callback));
        } else {
            callback.a(a$a.b("failed to addPrerenderAttachEventListener"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void removePrerenderAttachEventListener(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1629efcd", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        View g = context.g();
        if (g instanceof WVUCWebView) {
            ((WVUCWebView) g).getWebViewContext().removePrerenderAttachEventListener();
        } else {
            callback.a(a$a.b("failed to removePrerenderAttachEventListener"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void reportPrerenderStatus(als context, fy params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e486952", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        View g = context.g();
        if ((g instanceof WVUCWebView) && params.f8878a) {
            ((WVUCWebView) g).getWebViewContext().notifyPrerenderSuccess();
        } else {
            callback.a(a$a.b("failed to reportPrerenderStatus"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void start(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae396a1b", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        f.INSTANCE.a(new TMSClientPrerenderAbility$start$1(callback));
    }
}
