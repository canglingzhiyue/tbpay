package com.taobao.themis.mix.h5_render;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.g;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.o;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSTinyH5APIBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSH5APIHandler";
    private WVUCWebView mWebView;

    static {
        kge.a(1789381260);
    }

    public static /* synthetic */ Object ipc$super(TMSTinyH5APIBridge tMSTinyH5APIBridge, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (!(iWVWebView instanceof WVUCWebView)) {
            return;
        }
        this.mWebView = (WVUCWebView) iWVWebView;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        f tMSTinyH5APIBridge;
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            TMSLogger.d(TAG, "execute: wvCallBackContext is null");
            return false;
        } else if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("invalid action");
            TMSLogger.d(TAG, "execute: action is null");
            return false;
        } else if (wVCallBackContext.getWebview() == null) {
            wVCallBackContext.error("system error");
            TMSLogger.d(TAG, "execute: wvCallBackContext.getWebview() is null");
            return false;
        } else {
            Context context = wVCallBackContext.getWebview().getContext();
            WVUCWebView wVUCWebView = this.mWebView;
            if (wVUCWebView != null) {
                tMSTinyH5APIBridge = getInstance(wVUCWebView);
            } else {
                tMSTinyH5APIBridge = getInstance(context);
            }
            if (tMSTinyH5APIBridge == null) {
                invalidEnvironmentCallback(wVCallBackContext);
                return true;
            } else if (!o.f(tMSTinyH5APIBridge)) {
                invalidEnvironmentCallback(wVCallBackContext);
                return true;
            } else {
                WVUCWebView wVUCWebView2 = this.mWebView;
                if (wVUCWebView2 != null) {
                    c = getPage(wVUCWebView2);
                } else {
                    c = tMSTinyH5APIBridge.b().c();
                }
                if (c == null) {
                    invalidEnvironmentCallback(wVCallBackContext);
                    return true;
                }
                JSONObject jSONObject = null;
                if (!StringUtils.isEmpty(str2)) {
                    try {
                        jSONObject = JSON.parseObject(str2);
                    } catch (Exception e) {
                        TMSLogger.b(TAG, "execute: params parse error", e);
                    }
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (tMSTinyH5APIBridge.j() == TMSSolutionType.MINIGAME) {
                    jSONObject.put(TMSJSAPIHandler.DOMAIN_KEY, "widgetFramework");
                }
                c.d().callTMSAbilityAsync(str, jSONObject, new TMSJSAPIHandler.a() { // from class: com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
                    public void a(JSONObject jSONObject2, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4acae4f", new Object[]{this, jSONObject2, bArr});
                        }
                    }

                    @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.a
                    public void a(JSONObject jSONObject2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                        } else if (jSONObject2 != null) {
                            Object obj = jSONObject2.get("error");
                            org.json.JSONObject jSONObject3 = null;
                            try {
                                jSONObject3 = new org.json.JSONObject(jSONObject2.toJSONString());
                            } catch (Exception e2) {
                                TMSLogger.b(TMSTinyH5APIBridge.TAG, "execute: result parse error", e2);
                            }
                            if (obj != null) {
                                r rVar = new r();
                                rVar.a("HY_FAILED");
                                rVar.a(jSONObject3);
                                wVCallBackContext.error(rVar);
                                return;
                            }
                            r rVar2 = new r();
                            rVar2.a("HY_SUCCESS");
                            rVar2.b();
                            rVar2.a(jSONObject3);
                            wVCallBackContext.success(rVar2);
                        } else {
                            wVCallBackContext.error();
                        }
                    }
                });
                return true;
            }
        }
    }

    private f getInstance(Context context) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a15702e5", new Object[]{this, context});
        }
        if (context instanceof MutableContextWrapper) {
            try {
                gVar = (g) ((MutableContextWrapper) context).getBaseContext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (context instanceof g) {
                gVar = (g) context;
            }
            gVar = null;
        }
        if (gVar != null) {
            return gVar.b();
        }
        return null;
    }

    private f getInstance(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4c89bfc8", new Object[]{this, wVUCWebView});
        }
        ITMSPage page = getPage(wVUCWebView);
        if (page == null) {
            return null;
        }
        return page.b();
    }

    private ITMSPage getPage(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("f1947174", new Object[]{this, wVUCWebView});
        }
        Object externalContext = wVUCWebView.getExternalContext(i.MEGA_BRIDGE_PAGE_KEY);
        if (externalContext instanceof ITMSPage) {
            return (ITMSPage) externalContext;
        }
        f tMSTinyH5APIBridge = getInstance(wVUCWebView.getContext());
        if (tMSTinyH5APIBridge == null) {
            return null;
        }
        return tMSTinyH5APIBridge.b().c();
    }

    private void invalidEnvironmentCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e468f45", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("HY_FAILED");
        rVar.a("error", "10");
        rVar.a("errorMessage", "INVALID_ENVIRONMENT");
        wVCallBackContext.error(rVar);
        TMSLogger.d(TAG, "execute: app is null");
    }
}
