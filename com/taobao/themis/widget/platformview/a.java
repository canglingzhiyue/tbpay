package com.taobao.themis.widget.platformview;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex_framework.MUSDKInstance;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/widget/platformview/IEmbedPlatformView;", "", "destroy", "", "getView", "Landroid/view/View;", "onAttach", "instance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "onBindData", "attrs", "Lcom/alibaba/fastjson/JSONObject;", "onReceivedMessage", "action", "", "param", "reload", "setJSEventDelegate", "delegate", "Lcom/taobao/themis/widget/platformview/JSEventDelegate;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface a {
    void destroy();

    View getView();

    void onAttach(MUSDKInstance mUSDKInstance);

    void onBindData(JSONObject jSONObject);

    void onReceivedMessage(String str, JSONObject jSONObject);

    void setJSEventDelegate(b bVar);
}
