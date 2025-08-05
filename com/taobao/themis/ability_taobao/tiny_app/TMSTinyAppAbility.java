package com.taobao.themis.ability_taobao.tiny_app;

import android.app.Activity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsTinyAppAbility;
import com.taobao.android.abilityidl.ability.TinyAppCheckAddIconButtonResult;
import com.taobao.android.abilityidl.ability.cr;
import com.taobao.android.abilityidl.ability.cs;
import com.taobao.android.abilityidl.ability.eh;
import com.taobao.themis.kernel.ability.c;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import com.taobao.themis.pub_kit.guide.i;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.als;
import tb.gml;
import tb.kge;
import tb.qpm;
import tb.qrc;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/ability_taobao/tiny_app/TMSTinyAppAbility;", "Lcom/taobao/android/abilityidl/ability/AbsTinyAppAbility;", "()V", "addUserActiveAddIconListener", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "callback", "Lcom/taobao/android/abilityidl/ability/ITinyAppUserActiveAddIconEvents;", "checkAddIconButton", "Lcom/taobao/android/abilityidl/ability/ITinyAppCheckAddIconButtonEvents;", "removeUserActiveAddIconListener", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "showActiveReplacePopup", "showICONChangeGuide", "params", "Lcom/taobao/android/abilityidl/ability/TinyAppICONChangeGuideParams;", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTinyAppAbility extends AbsTinyAppAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/ability_taobao/tiny_app/TMSTinyAppAbility$addUserActiveAddIconListener$1", "Lcom/taobao/themis/kernel/ability/TMSMegaEventManager$EventListener;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "", "event", "", "params", "Lcom/alibaba/fastjson/JSON;", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cs f22312a;

        public a(cs csVar) {
            this.f22312a = csVar;
        }

        @Override // com.taobao.themis.kernel.ability.c.a
        public void a(String event, JSON json) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
                return;
            }
            q.d(event, "event");
            this.f22312a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/ability_taobao/tiny_app/TMSTinyAppAbility$showActiveReplacePopup$2", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gml f22313a;
        public final /* synthetic */ ITMSPage b;

        public b(gml gmlVar, ITMSPage iTMSPage) {
            this.f22313a = gmlVar;
            this.b = iTMSPage;
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
                this.f22313a.a(new ErrorResult("FORBID_ADD_TO_HOME_PAGE", "不允许添加当前轻应用至首页"));
            } else {
                Activity o = this.b.b().o();
                q.b(o, "page.getInstance().activity");
                new i(o, pubUserGuideModule, null, 4, null).a();
            }
        }
    }

    static {
        kge.a(1865371500);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void addUserActiveAddIconListener(als context, cs callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67a49f0", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        c.a("userActiveAddIcon", new a(callback));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void removeUserActiveAddIconListener(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79b84b2", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        c.a("userActiveAddIcon");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void showActiveReplacePopup(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda77994", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
        }
        if (titleBar == null || ((com.taobao.themis.pub.titlebar.action.a) titleBar.getAction(com.taobao.themis.pub.titlebar.action.a.class)) == null) {
            callback.a(new ErrorResult("FORBID_ADD_TO_HOME_PAGE", "不允许添加当前轻应用至首页"));
        } else {
            qrc.a(a2.b(), new b(callback, a2));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void showICONChangeGuide(als context, eh params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d4ca21", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (!(titleBar instanceof PubTitleBar)) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        int a3 = ((PubTitleBar) titleBar).showIconChangeStrongGuide(2, params.f8840a, params.b).a();
        if (a3 == 0) {
            return;
        }
        switch (a3) {
            case 100:
                callback.a(new ErrorResult("ALREADY_SHOW", "已展示过添加Icon弹窗"));
                return;
            case 101:
                callback.a(new ErrorResult("BEYOND_FATIGUE", "超出疲劳度"));
                return;
            case 102:
                callback.a(new ErrorResult("TINY_APP_SERVER_FORBID_SHOW", "轻应用服务端不允许展示"));
                return;
            case 103:
                callback.a(new ErrorResult("SHORT_STAY", "停留时长不满足条件"));
                return;
            case 104:
                callback.a(new ErrorResult("FORBID_ADD_TO_HOME_PAGE", "不允许添加当前轻应用至首页"));
                return;
            default:
                return;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void checkAddIconButton(als context, cr callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef0c4f9", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (!(titleBar instanceof PubTitleBar)) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        TinyAppCheckAddIconButtonResult tinyAppCheckAddIconButtonResult = new TinyAppCheckAddIconButtonResult();
        if (titleBar.getAction(com.taobao.themis.pub.titlebar.action.a.class) == null) {
            z = false;
        }
        tinyAppCheckAddIconButtonResult.isShowing = Boolean.valueOf(z);
        callback.a(tinyAppCheckAddIconButtonResult);
    }
}
