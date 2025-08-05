package com.taobao.android.scancode.common.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.scancode.common.util.a;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes6.dex */
public class ScancodeCallback extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME_SCAN = "scan";
    public static final String ACTION_NAME_SCAN_FACE = "scanFace";
    public static final String PARAM_CODE = "code";
    public static final String PARAM_TYPE = "type";
    private static final String TAG = "scan_common_ScancodeCallback";
    private volatile a scancode;

    public static /* synthetic */ Object ipc$super(ScancodeCallback scancodeCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        m.c(TAG, "call initialize ~~~");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        m.e(TAG, "execute: action=" + str);
        if (str.equals("scan")) {
            scan(wVCallBackContext, str2);
            return true;
        } else if (!str.equals(ACTION_NAME_SCAN_FACE)) {
            return false;
        } else {
            scanFace(wVCallBackContext, str2);
            return true;
        }
    }

    @WindVaneInterface
    public void scan(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c14d4b", new Object[]{this, wVCallBackContext, str});
            return;
        }
        m.e(TAG, "call scan");
        checkScancodeIfExist(this.mContext).a(new a.InterfaceC0570a() { // from class: com.taobao.android.scancode.common.jsbridge.ScancodeCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.scancode.common.util.a.InterfaceC0570a
            public void a(ScancodeResult scancodeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cacfb6b2", new Object[]{this, scancodeResult});
                    return;
                }
                r rVar = new r();
                rVar.a("code", scancodeResult.code);
                if (scancodeResult.type != null) {
                    rVar.a("type", scancodeResult.type.toString());
                }
                rVar.a("url", scancodeResult.url);
                rVar.a("detectResult", scancodeResult.detectResult);
                rVar.a("resourceURL", scancodeResult.resourceURL);
                rVar.b();
                m.e(ScancodeCallback.TAG, "scanResult:-- " + rVar.d());
                wVCallBackContext.success(rVar);
            }
        });
    }

    @WindVaneInterface
    public void scanFace(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9619108", new Object[]{this, wVCallBackContext, str});
        } else {
            checkScancodeIfExist(this.mContext).a(new a.InterfaceC0570a() { // from class: com.taobao.android.scancode.common.jsbridge.ScancodeCallback.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.scancode.common.util.a.InterfaceC0570a
                public void a(ScancodeResult scancodeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cacfb6b2", new Object[]{this, scancodeResult});
                        return;
                    }
                    r rVar = new r();
                    rVar.a("code", scancodeResult.code);
                    if (scancodeResult.type != null) {
                        rVar.a("type", scancodeResult.type.toString());
                    }
                    rVar.a("url", scancodeResult.url);
                    rVar.a("detectResult", scancodeResult.detectResult);
                    rVar.a("resourceURL", scancodeResult.resourceURL);
                    rVar.b();
                    wVCallBackContext.success(rVar.d());
                }
            }, str, ScancodeType.FACE);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        m.e(TAG, MessageID.onDestroy);
        if (this.scancode == null) {
            return;
        }
        this.scancode.a();
        this.scancode = null;
    }

    public a checkScancodeIfExist(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("90ac8284", new Object[]{this, context});
        }
        if (this.scancode == null) {
            this.scancode = new a(context);
        }
        return this.scancode;
    }
}
