package com.taobao.android.detail.mainpic.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.detail.mainpic.widget.VesselViewRootLayout;
import com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge.TBDetailPicGalleryBridge;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public class NewPicGalleryBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_PICGALLERY = "getPicGallery";
    private static final String TAG = "NewPicGalleryBridge";
    public static ArrayDeque<g> sNewMainPicInstanceArray = new ArrayDeque<>();

    public static void init(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ec97ac", new Object[]{gVar});
            return;
        }
        sNewMainPicInstanceArray.add(gVar);
        q.a(TAG, (Class<? extends e>) NewPicGalleryBridge.class);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        com.taobao.android.detail.mainpic.e o;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        UnifyLog.d(TAG, "execute: " + str + ", " + str2);
        if (!ACTION_GET_PICGALLERY.equals(str) || wVCallBackContext == null) {
            return false;
        }
        String str3 = null;
        try {
            str3 = ((JSONObject) JSONObject.parse(str2)).getString(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME);
        } catch (Exception unused) {
        }
        View view = wVCallBackContext.getWebview().getView();
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof VesselViewRootLayout)) {
            parent = parent.getParent();
        }
        if (parent == null || (o = ((VesselViewRootLayout) parent).getNewMainPicInstance().o()) == null) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) o.d());
        jSONObject2.put("sellerId", (Object) o.h());
        jSONObject2.put("sellerType", (Object) o.i());
        jSONObject2.put("shopId", (Object) o.j());
        JSONObject l = o.l();
        if (o.m() != null) {
            if (l == null) {
                l = new JSONObject();
            }
            l.putAll(o.m());
        }
        if (str3 != null && l != null && (jSONObject = l.getJSONObject(str3)) != null) {
            jSONObject2.putAll(jSONObject);
        }
        wVCallBackContext.success(jSONObject2.toJSONString());
        return true;
    }

    public static void destroy(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54162c02", new Object[]{gVar});
            return;
        }
        sNewMainPicInstanceArray.remove(gVar);
        if (!sNewMainPicInstanceArray.isEmpty()) {
            return;
        }
        q.b(TAG);
    }
}
