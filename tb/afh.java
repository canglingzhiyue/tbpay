package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.h;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;

/* loaded from: classes5.dex */
public class afh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeexInstance f25309a;
    private p b;

    static {
        kge.a(-339940535);
    }

    public afh(WeexInstance weexInstance) {
        this.f25309a = weexInstance;
        WeexInstance weexInstance2 = this.f25309a;
        if (weexInstance2 != null) {
            weexInstance2.addInstanceListener(new h() { // from class: tb.afh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.h
                public void onDestroyed(WeexInstance weexInstance3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance3});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onEngineException(WeexInstance weexInstance3, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance3, weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onExecuteFailed(WeexInstance weexInstance3, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance3, weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onExecuteSuccess(WeexInstance weexInstance3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance3});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onInitFailed(WeexInstance weexInstance3, boolean z, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance3, new Boolean(z), weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onInitSuccess(WeexInstance weexInstance3, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance3, new Boolean(z)});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onRenderFailed(WeexInstance weexInstance3, boolean z, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance3, new Boolean(z), weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onRenderSuccess(WeexInstance weexInstance3, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance3, new Boolean(z)});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onScriptException(WeexInstance weexInstance3, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance3, weexErrorType, str});
                    }
                }
            });
        }
    }

    public afh(p pVar) {
        this.b = pVar;
        p pVar2 = this.b;
        if (pVar2 != null) {
            pVar2.registerRenderListener(new g() { // from class: tb.afh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar3, int i, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar3, new Integer(i), str});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar3});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar3, int i, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar3, new Integer(i), str});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar3});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar3, int i, String str, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar3, new Integer(i), str, new Boolean(z)});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar3});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar3, int i, String str, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar3, new Integer(i), str, new Boolean(z)});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar3});
                    }
                }
            });
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, str, jSONObject);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        p pVar = this.b;
        if (pVar != null && pVar.canGoBack()) {
            this.b.goBack();
            return true;
        }
        WeexInstance weexInstance = this.f25309a;
        if (weexInstance == null || !weexInstance.canGoBack()) {
            return false;
        }
        this.f25309a.goBack();
        return true;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        p pVar = this.b;
        if (pVar != null) {
            return pVar.getUIContext();
        }
        return this.f25309a.getContext();
    }
}
