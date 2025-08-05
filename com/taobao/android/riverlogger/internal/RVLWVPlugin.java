package com.taobao.android.riverlogger.internal;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.h;
import com.taobao.android.riverlogger.inspector.i;
import com.taobao.android.riverlogger.j;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class RVLWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private i _localChannel;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1850771058);
    }

    public static /* synthetic */ Object ipc$super(RVLWVPlugin rVLWVPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Handler access$000(RVLWVPlugin rVLWVPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("78069f6a", new Object[]{rVLWVPlugin}) : rVLWVPlugin.mainHandler;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "openRemote")) {
            JSONObject a2 = b.a(str2);
            String str4 = null;
            if (a2 != null) {
                str4 = a2.optString("server");
                if (str4.isEmpty()) {
                    str4 = a2.optString("appWsUrl");
                    str3 = a2.optString("debugId");
                } else {
                    str3 = a2.optString("id");
                }
            } else {
                str3 = null;
            }
            j.a(str4, str3, new h() { // from class: com.taobao.android.riverlogger.internal.RVLWVPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.h
                public void a(final boolean z, final String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str5});
                    } else {
                        RVLWVPlugin.access$000(RVLWVPlugin.this).post(new Runnable() { // from class: com.taobao.android.riverlogger.internal.RVLWVPlugin.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                r rVar = new r();
                                if (z) {
                                    wVCallBackContext.success(rVar);
                                    return;
                                }
                                String str6 = str5;
                                if (str6 == null) {
                                    str6 = "Unknown error";
                                }
                                rVar.a("msg", str6);
                                wVCallBackContext.error(rVar);
                            }
                        });
                    }
                }
            });
            return true;
        } else if (TextUtils.equals(str, "postLocalMessage")) {
            getLocalChannel().a(b.a(str2), new com.taobao.android.riverlogger.inspector.h() { // from class: com.taobao.android.riverlogger.internal.RVLWVPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.inspector.h
                public void a(final JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    } else {
                        RVLWVPlugin.access$000(RVLWVPlugin.this).post(new Runnable() { // from class: com.taobao.android.riverlogger.internal.RVLWVPlugin.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                r rVar = new r();
                                rVar.a(jSONObject);
                                wVCallBackContext.success(rVar);
                            }
                        });
                    }
                }
            });
            return true;
        } else if (!TextUtils.equals(str, "subscribeLocalMessage")) {
            return false;
        } else {
            getLocalChannel().b(b.a(str2), new com.taobao.android.riverlogger.inspector.h() { // from class: com.taobao.android.riverlogger.internal.RVLWVPlugin.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.inspector.h
                public void a(final JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    } else {
                        RVLWVPlugin.access$000(RVLWVPlugin.this).post(new Runnable() { // from class: com.taobao.android.riverlogger.internal.RVLWVPlugin.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                r rVar = new r();
                                rVar.a(jSONObject);
                                rVar.b();
                                wVCallBackContext.successAndKeepAlive(rVar.d());
                            }
                        });
                    }
                }
            });
            return true;
        }
    }

    private i getLocalChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("6779185", new Object[]{this});
        }
        if (this._localChannel == null) {
            this._localChannel = new i();
        }
        return this._localChannel;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        i iVar = this._localChannel;
        if (iVar == null) {
            return;
        }
        iVar.c("local page close");
    }
}
