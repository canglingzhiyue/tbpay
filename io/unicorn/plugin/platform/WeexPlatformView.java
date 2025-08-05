package io.unicorn.plugin.platform;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.rtw;

/* loaded from: classes9.dex */
public abstract class WeexPlatformView implements f, Serializable {
    private static final String TAG = "UnicornPlatformView";
    private Context mContext;
    private e mInvokerExecutor;
    private com.taobao.android.weex_framework.platform.c mInvokersHolder;
    private int mViewId;
    private String mWhiteScreenInfo;
    private k nestedScrollManager;
    private final String KEY_BOOL_WHITE_SCREEN = "isWhiteScreen";
    private final String KEY_WHITE_MSG = "message";
    private HashMap<String, String> mWhiteScreenInfoMap = new HashMap<>();

    static {
        kge.a(1118007321);
        kge.a(1173050744);
        kge.a(1028243835);
    }

    public WeexPlatformView(Context context, int i) {
        this.mContext = context;
        this.mViewId = i;
    }

    private void dispatchPlatformViewMessage(String str, JSONArray jSONArray) {
        if (((str.hashCode() == -907680051 && str.equals("scroll")) ? (char) 0 : (char) 65535) != 0) {
            return;
        }
        scroll(jSONArray);
    }

    private void scroll(JSONArray jSONArray) {
        try {
            if (this.nestedScrollManager == null) {
                return;
            }
            this.nestedScrollManager.a(jSONArray.getBoolean(0), jSONArray.getDouble(1));
        } catch (Exception e) {
            Log.e("Weex", "dispatchPlatformViewMessage:" + e.toString());
        }
    }

    private void updateProperties(Map<String, String> map) {
        if (this.mInvokersHolder.a()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            com.taobao.android.weex_framework.platform.b a2 = this.mInvokersHolder.a(entry.getKey());
            if (a2 != null) {
                try {
                    Type[] a3 = a2.a();
                    if (a3.length != 1) {
                        Log.e(TAG, "setXXX method only supports one parameter：" + a2);
                    } else {
                        a2.a(this, e.a(a3[0], entry.getValue()));
                    }
                } catch (Exception e) {
                    Log.e(TAG, " Invoker " + a2.toString(), e);
                }
            }
        }
    }

    public WeexValue CallUINodeMethod(String str, WeexValue[] weexValueArr) {
        k kVar;
        com.taobao.android.weex_framework.platform.b a2 = this.mInvokersHolder.a(str, weexValueArr.length > 0);
        if (a2 != null) {
            return WeexValueImpl.convert(this.mInvokerExecutor.a(this, a2, weexValueArr));
        }
        if (!"scroll".equals(str) || (kVar = this.nestedScrollManager) == null) {
            return null;
        }
        kVar.a(((Boolean) weexValueArr[0].getValue()).booleanValue(), ((Double) weexValueArr[1].getValue()).doubleValue());
        return null;
    }

    public void attach(com.taobao.android.weex_framework.platform.c cVar, e eVar) {
        this.mInvokersHolder = cVar;
        this.mInvokerExecutor = eVar;
    }

    public void bindData(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        if (hashMap != null) {
            onUpdateStyles(hashMap);
        }
        if (hashMap2 != null) {
            onUpdateAttrs(hashMap2);
        }
        if (hashSet != null) {
            onUpdateEvents(hashSet);
        }
        onCreated();
    }

    public boolean checkIsWhiteScreen() {
        if (getView() == null) {
            return true;
        }
        return rtw.b(getView()) && rtw.a(getView().getParent()) && !rtw.a(getView(), 3);
    }

    public Map<String, String> checkWhiteScreenInfo() {
        this.mWhiteScreenInfoMap.put("isWhiteScreen", String.valueOf(checkIsWhiteScreen()));
        this.mWhiteScreenInfoMap.put("message", String.valueOf(this.mWhiteScreenInfo));
        return this.mWhiteScreenInfoMap;
    }

    @Override // io.unicorn.plugin.platform.f
    public void dispose() {
        onDispose();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fireEvent(String str) {
        this.mInvokerExecutor.a(this.mViewId, str, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fireEvent(String str, Object obj) {
        this.mInvokerExecutor.a(this.mViewId, str, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getContext() {
        return this.mContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MUSDKInstance getMUSInstance() {
        return this.mInvokerExecutor.a();
    }

    public k getNestedScrollManager() {
        return this.nestedScrollManager;
    }

    @Override // io.unicorn.plugin.platform.f
    public abstract View getView();

    /* JADX INFO: Access modifiers changed from: protected */
    public int getViewId() {
        return this.mViewId;
    }

    protected WeexInstance getWeexInstance() {
        return this.mInvokerExecutor.b();
    }

    @Override // io.unicorn.plugin.platform.f
    public void onActivityDestroy() {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onActivityPause() {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onActivityResume() {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onActivityStart() {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onActivityStop() {
    }

    public void onAddEvent(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreated() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDispose() {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onFlutterViewAttached(View view) {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onFlutterViewDetached() {
    }

    @Deprecated
    public void onInputConnectionLocked() {
    }

    @Deprecated
    public void onInputConnectionUnlocked() {
    }

    protected void onInvokeUnknownMethod(String str, JSONArray jSONArray) {
        if ("scroll".equals(str)) {
            dispatchPlatformViewMessage(str, jSONArray);
        }
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onReceivedMessage(String str, JSONArray jSONArray, b bVar) {
    }

    @Deprecated
    public void onReceivedMessage(String str, JSONObject jSONObject, b bVar) {
    }

    @Deprecated
    public void onReceivedRender(JSONArray jSONArray, b bVar) {
    }

    @Deprecated
    public void onReceivedRender(JSONObject jSONObject, b bVar) {
    }

    public void onRemoveEvent(String str) {
    }

    @Deprecated
    public void onResume() {
    }

    @Override // io.unicorn.plugin.platform.f
    public void onUpdateAttrs(Map<String, String> map) {
        updateProperties(map);
    }

    public void onUpdateEvents(HashSet<String> hashSet) {
    }

    public void onUpdateStyles(Map<String, String> map) {
        updateProperties(map);
    }

    public void setWeexPlatformListDelegate(d dVar) {
        if (this.nestedScrollManager == null) {
            this.nestedScrollManager = new k(this, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setWhiteScreenInfo(String str) {
        this.mWhiteScreenInfo = str;
    }
}
