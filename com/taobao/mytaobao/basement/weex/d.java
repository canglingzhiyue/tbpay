package com.taobao.mytaobao.basement.weex;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import tb.kge;
import tb.ljl;
import tb.mtt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/taobao/mytaobao/basement/weex/WeexRenderMonitor;", "Lcom/taobao/mytaobao/basement/listener/IMUSRenderListenerAdapter;", "()V", "onDestroyed", "", "instance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "onFatalException", "Lcom/taobao/android/weex_framework/MUSInstance;", "type", "", "errorMsg", "", "onJSException", "onPrepareSuccess", "onRefreshFailed", "isFatal", "", "onRefreshSuccess", "onRenderFailed", ljl.RENDER_SUCCESS_TIME, "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class d extends mtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2078135059);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2095069906:
                super.onJSException((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case -1774856693:
                super.onPrepareSuccess((p) objArr[0]);
                return null;
            case -1126755247:
                super.onFatalException((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case -163815660:
                super.onRefreshFailed((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 66974264:
                super.onRenderSuccess((p) objArr[0]);
                return null;
            case 855112085:
                super.onDestroyed((MUSDKInstance) objArr[0]);
                return null;
            case 1112741915:
                super.onRenderFailed((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 2094523359:
                super.onRefreshSuccess((p) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            return;
        }
        super.onPrepareSuccess(pVar);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onPrepareSuccess");
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onRenderSuccess");
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(pVar, i, str, z);
        String str2 = "weex onRenderFailed: type=" + i + ",errorMsg=" + str + ",isFatal=" + z;
        TLog.loge(BasementConstants.WEEX_TAG, str2);
        com.taobao.mytaobao.basement.monitor.b.a().a("weexLoad", "onRenderFailed", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) "onRenderFailed");
        jSONObject.put("type", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        jSONObject.put("isFatal", (Object) Boolean.valueOf(z));
        com.taobao.mytaobao.basement.monitor.b.a().a("weexLoadFailed", jSONObject, 1.0d, false);
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        super.onRefreshSuccess(pVar);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onRefreshSuccess");
        com.taobao.mytaobao.basement.monitor.b.a().b("weexLoad");
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRefreshFailed(pVar, i, str, z);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onRefreshFailed: type=" + i + ",errorMsg=" + str + ",isFatal=" + z);
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        super.onFatalException(pVar, i, str);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onFatalException: type=" + i + ",errorMsg=" + str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) "onFatalException");
        jSONObject.put("type", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        com.taobao.mytaobao.basement.monitor.b.a().a("weexLoadFailed", jSONObject, 1.0d, false);
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        super.onJSException(pVar, i, str);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onJSException: type=" + i + ",errorMsg=" + str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) "onJSException");
        jSONObject.put("type", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        com.taobao.mytaobao.basement.monitor.b.a().a("weexLoadFailed", jSONObject, 1.0d, false);
    }

    @Override // tb.mtt, com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        super.onDestroyed(mUSDKInstance);
        TLog.loge(BasementConstants.WEEX_TAG, "weex onDestroyed");
    }
}
