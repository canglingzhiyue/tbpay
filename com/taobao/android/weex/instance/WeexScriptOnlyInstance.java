package com.taobao.android.weex.instance;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.g;
import tb.jue;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexScriptOnlyInstance extends WeexInstanceImpl implements jue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(702908620);
        kge.a(-1157132446);
    }

    public static /* synthetic */ Object ipc$super(WeexScriptOnlyInstance weexScriptOnlyInstance, String str, Object... objArr) {
        if (str.hashCode() == 743373420) {
            return super.getExtend((Class) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static WeexScriptOnlyInstance create(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexScriptOnlyInstance) ipChange.ipc$dispatch("57989017", new Object[]{gVar});
        }
        WeexScriptOnlyInstance weexScriptOnlyInstance = new WeexScriptOnlyInstance(gVar);
        postInstanceCreate(weexScriptOnlyInstance, gVar.l);
        return weexScriptOnlyInstance;
    }

    public WeexScriptOnlyInstance(g gVar) {
        super(gVar);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls}) : cls == jue.class ? this : (T) super.getExtend(cls);
    }

    public void a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb8b5a", new Object[]{this, jSONArray, str});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.scriptOnlyRegister(this.mNativePtr, jSONArray.toJSONString(), str);
        }
    }

    public void a(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5039783f", new Object[]{this, weexValueArr});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.scriptOnlyExecute(this.mNativePtr, weexValueArr);
        }
    }

    public void a(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6034fd1a", new Object[]{this, str, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.scriptOnlyDispatchEvent(this.mNativePtr, str, weexValue);
        }
    }
}
