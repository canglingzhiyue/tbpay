package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.pub_kit.utils.h;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/TBPubKitUtils;", "", "()V", "addFoot", "", "appId", "", "getHomeData", "context", "Landroid/content/Context;", "callback", "Lcom/taobao/themis/pub_kit/utils/TBPubKitUtils$HomeDataCallback;", "jumpToTBHome", IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, "Landroid/graphics/Bitmap;", "HomeDataCallback", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TBPubKitUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TBPubKitUtils INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/TBPubKitUtils$HomeDataCallback;", "", "onResult", "", "homeData", "Lcom/alibaba/fastjson/JSONObject;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/alibaba/fastjson/JSONObject;", "onResult"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements h.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22802a;

        public b(a aVar) {
            this.f22802a = aVar;
        }

        @Override // com.taobao.themis.pub_kit.utils.h.b
        public final void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                this.f22802a.a(jSONObject);
            }
        }
    }

    static {
        kge.a(1599519899);
        INSTANCE = new TBPubKitUtils();
    }

    private TBPubKitUtils() {
    }

    @JvmStatic
    public static final void jumpToTBHome(Context context, String appId, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51996d9", new Object[]{context, appId, bitmap});
            return;
        }
        q.d(context, "context");
        q.d(appId, "appId");
        h.a(context, appId, bitmap, null, 8, null);
    }

    @JvmStatic
    public static final void addFoot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f6be00", new Object[]{str});
        } else {
            com.taobao.themis.pub_kit.foot.a.a(str);
        }
    }

    @JvmStatic
    public static final void getHomeData(Context context, String appId, a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c725e97d", new Object[]{context, appId, callback});
            return;
        }
        q.d(context, "context");
        q.d(appId, "appId");
        q.d(callback, "callback");
        h.a(context, appId, new b(callback));
    }
}
