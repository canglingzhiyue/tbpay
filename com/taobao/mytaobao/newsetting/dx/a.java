package com.taobao.mytaobao.newsetting.dx;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import kotlin.Metadata;
import tb.kge;
import tb.mxx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0013"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/DXApplicationLinkEventHandler;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "()V", "handle", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "launchApplication", "context", "Landroid/content/Context;", "uriStr", "", "packageName", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.newsetting.dx.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0735a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public RunnableC0735a(ServiceProvider serviceProvider, String str, String str2) {
            this.b = serviceProvider;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PageService pageService;
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ServiceProvider serviceProvider = this.b;
            if (serviceProvider == null || (pageService = (PageService) serviceProvider.service(PageService.class)) == null || (activity = pageService.getActivity()) == null) {
                return;
            }
            a.a(a.this, activity, this.c, this.d);
        }
    }

    static {
        kge.a(465307624);
        kge.a(778700337);
    }

    public static final /* synthetic */ void a(a aVar, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ff5646", new Object[]{aVar, context, str, str2});
        } else {
            aVar.a(context, str, str2);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (mxx.a()) {
        } else {
            String str = null;
            Object data = action != null ? action.getData() : null;
            if (!(data instanceof JSONObject)) {
                data = null;
            }
            JSONObject jSONObject = (JSONObject) data;
            if (jSONObject == null || (string = jSONObject.getString("url")) == null) {
                return;
            }
            Object data2 = action.getData();
            if (!(data2 instanceof JSONObject)) {
                data2 = null;
            }
            JSONObject jSONObject2 = (JSONObject) data2;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("packageName");
            }
            com.taobao.android.behavix.utils.e.a().post(new RunnableC0735a(serviceProvider, string, str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        r0.setPackage(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:6:0x001b, B:8:0x0020, B:15:0x002d, B:17:0x003d, B:22:0x0047, B:23:0x004a), top: B:28:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.mytaobao.newsetting.dx.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            r1[r5] = r7
            java.lang.String r5 = "d18de974"
            r0.ipc$dispatch(r5, r1)
            return
        L1b:
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L29
            int r0 = r0.length()     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L2d
            return
        L2d:
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L53
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r6)     // Catch: java.lang.Exception -> L53
            r6 = r7
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> L53
            if (r6 == 0) goto L45
            int r6 = r6.length()     // Catch: java.lang.Exception -> L53
            if (r6 != 0) goto L44
            goto L45
        L44:
            r2 = 0
        L45:
            if (r2 != 0) goto L4a
            r0.setPackage(r7)     // Catch: java.lang.Exception -> L53
        L4a:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r6)     // Catch: java.lang.Exception -> L53
            r5.startActivity(r0)     // Catch: java.lang.Exception -> L53
            return
        L53:
            r5 = move-exception
            r5.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.newsetting.dx.a.a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
