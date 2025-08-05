package com.taobao.themis.open.extension;

import android.view.MotionEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J$\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0005H&J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000eH&¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/extension/IGameJSRuntimeExtension;", "Lcom/taobao/themis/kernel/extension/page/IPageExtension;", Constants.Event.SLOT_LIFECYCLE.ATTACH, "", "destroy", "", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "executeJSFramework", "executeJSInCurrentThread", "script", "", "name", "", "sourceMapUrl", "executeMainPackage", "fireGlobalEventInMainContext", "params", "Lcom/alibaba/fastjson/JSONObject;", "keepAlive", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "initBackend", "canvasId", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface b extends g {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-121807286);
        }

        public static void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226b4f54", new Object[]{bVar});
            } else {
                g.a.a(bVar);
            }
        }

        public static void a(b bVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbf118ff", new Object[]{bVar, page});
                return;
            }
            q.d(page, "page");
            g.a.a(bVar, page);
        }

        public static void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b7a55", new Object[]{bVar});
            } else {
                g.a.c(bVar);
            }
        }
    }

    void a(String str, JSONObject jSONObject, boolean z);

    void a(String str, String str2);

    void a(byte[] bArr, String str, String str2);

    boolean a(MotionEvent motionEvent);

    void c(String str);

    void d();

    void g();

    void h();
}
