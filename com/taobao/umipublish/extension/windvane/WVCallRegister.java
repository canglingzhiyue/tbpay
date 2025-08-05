package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.av;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.taolive.room.utils.ag;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import com.vivo.push.PushClientConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;
import tb.ten;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0017J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00172\u0006\u0010\u0018\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/WVCallRegister;", "", "()V", "abilityMap", "", "", "Lcom/taobao/umipublish/extension/windvane/Item;", ag.KEY_TAOKE_BIZSCENE, PushClientConstants.TAG_PKG_NAME, e.RECORD_EXECUTE, "", "actionName", "params", "Lcom/alibaba/fastjson/JSONObject;", "context", "Landroid/content/Context;", "wvCallBackContext", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "getWVCall", "Lcom/taobao/umipublish/extension/windvane/call/WindvaneCall;", "registerWVCall", "", "callClass", "Ljava/lang/Class;", "isRemote", "callClassName", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class WVCallRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WVCallRegister INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Item> f23322a;

    static {
        kge.a(-290809897);
        WVCallRegister wVCallRegister = new WVCallRegister();
        INSTANCE = wVCallRegister;
        f23322a = new LinkedHashMap();
        wVCallRegister.a(UmiWvPlugin.OPEN_REEDIT_PAGE, "com.taobao.umipublish.extension.windvane.call.OpenReEditPageCall");
        wVCallRegister.a(UmiWvPlugin.OPEN_ASR_WINDOW, "com.taobao.umipublish.extension.windvane.call.OpenAsrWindowCall");
        wVCallRegister.a(UmiWvPlugin.OPEN_AI_DRESS_ALBUM_PAGE, "com.taobao.umipublish.extension.windvane.call.OpenAIDressAlbumCall");
        wVCallRegister.a(UmiWvPlugin.LINK_PUBLISH_ACTION, "com.taobao.umipublish.extension.windvane.call.LinkPublishCall");
        wVCallRegister.a(UmiWvPlugin.GET_FLOAT_WEB_PAGE_PARAMS, "com.taobao.umipublish.extension.windvane.call.GetFloatWebPageParamsCall");
        wVCallRegister.a(UmiWvPlugin.CLOSE_FLOAT_WEB_PAGE, "com.taobao.umipublish.extension.windvane.call.CloseFloatWebPageCall");
        wVCallRegister.a(UmiWvPlugin.ASYNC_PUBLISH_FIRE_NOTIFICATION, "com.taobao.umipublish.extension.windvane.call.AsyncPublishFireNotificationCall");
        wVCallRegister.a(UmiWvPlugin.ASYNC_PUBLISH_CANCEL, "com.taobao.umipublish.extension.windvane.call.AsyncPublishCancelCall");
        wVCallRegister.a(UmiWvPlugin.OPEN_WEEX_FLOAT_PAGE_ACTION, "com.taobao.umipublish.extension.windvane.call.OpenWeexFloatPageCall");
        wVCallRegister.a(UmiWvPlugin.CLOSE_WEEX_FLOAT_PAGE_ACTION, "com.taobao.umipublish.extension.windvane.call.CloseWeexFloatPageCall");
        wVCallRegister.a(UmiWvPlugin.GET_FLOAT_WEEX_PAGE_PARAMS, "com.taobao.umipublish.extension.windvane.call.GetFloatWeexPageParamsCall");
        wVCallRegister.a(UmiWvPlugin.OPEN_AI_FACE_COLLECTION, "com.taobao.umipublish.extension.windvane.call.OpenAIPhotoFaceCollectionCall");
        wVCallRegister.a(UmiWvPlugin.QUICK_PUBLISH, "com.taobao.umipublish.extension.windvane.call.QuickPublishCall");
    }

    private WVCallRegister() {
    }

    public final void a(String actionName, String callClassName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, actionName, callClassName});
            return;
        }
        q.d(actionName, "actionName");
        q.d(callClassName, "callClassName");
        a(actionName, callClassName, true);
    }

    public final void a(String actionName, String callClassName, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, actionName, callClassName, new Boolean(z)});
            return;
        }
        q.d(actionName, "actionName");
        q.d(callClassName, "callClassName");
        f23322a.put(actionName, new Item(actionName, callClassName, z, null));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.taobao.umipublish.extension.windvane.call.WindvaneCall] */
    private final WindvaneCall a(final String str, final Context context, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindvaneCall) ipChange.ipc$dispatch("2d633310", new Object[]{this, str, context, wVCallBackContext});
        }
        final Item item = f23322a.get(str);
        if (item == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (WindvaneCall) 0;
        av.a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.WVCallRegister$getWVCall$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Class c;
                T t;
                WindvaneCall windvaneCall;
                if (!TextUtils.isEmpty(Item.this.a())) {
                    String a2 = Item.this.a();
                    c = a2 != null ? Class.forName(a2) : null;
                } else {
                    c = Item.this.c();
                }
                Ref.ObjectRef objectRef2 = objectRef;
                if (c == null || (windvaneCall = (WindvaneCall) c.newInstance()) == null) {
                    t = 0;
                } else {
                    windvaneCall.setContext(wVCallBackContext, context);
                    t tVar = t.INSTANCE;
                    t = windvaneCall;
                }
                objectRef2.element = t;
            }
        }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.WVCallRegister$getWVCall$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v1, types: [T, com.taobao.umipublish.extension.windvane.call.WindvaneCall] */
            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Ref.ObjectRef.this.element = (WindvaneCall) 0;
                u.d(WindvaneCall.TAG, "create windvane call error. actionName:" + str + " className:" + item.a());
                UmiPublishMonitor.a().b(WindvaneCall.TAG, "-1", "create windvane call error", null);
            }
        });
        return (WindvaneCall) objectRef.element;
    }

    public final boolean a(String actionName, JSONObject params, Context context, final WVCallBackContext wvCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a303decb", new Object[]{this, actionName, params, context, wvCallBackContext})).booleanValue();
        }
        q.d(actionName, "actionName");
        q.d(params, "params");
        q.d(context, "context");
        q.d(wvCallBackContext, "wvCallBackContext");
        Item item = f23322a.get(actionName);
        if (item == null) {
            return false;
        }
        if (item.b()) {
            final WVCallRegister$execute$windvaneCall$1 wVCallRegister$execute$windvaneCall$1 = new WVCallRegister$execute$windvaneCall$1(actionName, context, wvCallBackContext, params);
            if (ten.a("guangguang", false)) {
                wVCallRegister$execute$windvaneCall$1.mo2427invoke();
            } else {
                ten.a(context, "guangguang", new ten.a() { // from class: com.taobao.umipublish.extension.windvane.WVCallRegister$execute$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ten.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            ruk.this.mo2427invoke();
                        }
                    }

                    @Override // tb.ten.a
                    public void a(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        } else {
                            wvCallBackContext.error();
                        }
                    }
                });
            }
            return true;
        }
        WindvaneCall a2 = a(actionName, context, wvCallBackContext);
        if (a2 != null) {
            a2.call(params);
        }
        return a2 != null;
    }
}
