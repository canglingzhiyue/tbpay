package com.taobao.mytaobao.newsetting.dx;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.search.common.util.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.mxj;
import tb.mxx;
import tb.mxz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DXSettingUriLinkEventHandler;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "()V", "handle", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "verifyUri", "", "url", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class b implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider b;
        public final /* synthetic */ JSONObject c;

        public a(ServiceProvider serviceProvider, JSONObject jSONObject) {
            this.b = serviceProvider;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PageService pageService;
            Activity activity;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ServiceProvider serviceProvider = this.b;
            if (serviceProvider == null || (pageService = (PageService) serviceProvider.service(PageService.class)) == null || (activity = pageService.getActivity()) == null) {
                return;
            }
            String string = this.c.getString("simpleLinkUrl");
            String str = string;
            if (!(str == null || str.length() == 0)) {
                Nav.from(activity).toUriSimple(string);
                return;
            }
            String string2 = this.c.getString("url");
            String str2 = string2;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            if (mxj.a("verifyScheme", false)) {
                string2 = b.a(b.this, string2);
            }
            if (!mxz.g || (!q.a((Object) "https://m.taobao.com/go/mytaobao/newpaysettings", (Object) string2) && !q.a((Object) "http://m.taobao.com/go/newmytaobaocommonsettings2", (Object) string2) && !q.a((Object) "http://m.taobao.com/go/newmytaobaohelpsettings", (Object) string2))) {
                Nav.from(activity).toUri(string2);
            } else {
                Nav.from(activity).skipAllProcessors().toUri(string2);
            }
        }
    }

    static {
        kge.a(310018488);
        kge.a(778700337);
    }

    public static final /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d631941", new Object[]{bVar, str}) : bVar.a(str);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (mxx.a()) {
        } else {
            Object data = action != null ? action.getData() : null;
            if (!(data instanceof JSONObject)) {
                data = null;
            }
            JSONObject jSONObject3 = (JSONObject) data;
            if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("settingItem")) == null || (jSONObject2 = jSONObject.getJSONObject("linkStyle")) == null) {
                return;
            }
            com.taobao.android.behavix.utils.e.a().post(new a(serviceProvider, jSONObject2));
        }
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        q.a((Object) parse, "Uri.parse(uri)");
        String scheme = parse.getScheme();
        if (scheme != null && (!(!q.a((Object) "http", (Object) scheme)) || !(!q.a((Object) "https", (Object) scheme)))) {
            return str;
        }
        return k.HTTPS_PREFIX + str;
    }
}
