package com.taobao.android.autosize.api;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.tao.log.TLog;

/* loaded from: classes4.dex */
public class TBAutoSizeGuideBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_FOLD_STATUS = "getFoldStatus";
    private static final String GET_MANUFACTURE = "getManufacture";
    private static final String IS_FOLD_DEVICE_ACTION = "isFoldDevice";
    private static final String IS_IN_MAGIC_WINDOW_MODE = "isInMagicWindowMode";
    private static final String IS_PORTRAIT_LAYOUT = "isPortraitLayout";
    private static final String IS_TABLET_ACTION = "isTablet";
    private static final String START_SETTING_ACTIVITY = "startSettingActivity";
    private static final String TAG = "TBAutoSize.PopLayerBridge";

    public static /* synthetic */ Object ipc$super(TBAutoSizeGuideBridge tBAutoSizeGuideBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r10.equals(com.taobao.android.autosize.api.TBAutoSizeGuideBridge.IS_IN_MAGIC_WINDOW_MODE) != false) goto L19;
     */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r10, java.lang.String r11, android.taobao.windvane.jsbridge.WVCallBackContext r12) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.autosize.api.TBAutoSizeGuideBridge.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 4
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L22
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r9
            r1[r6] = r10
            r1[r3] = r11
            r1[r2] = r12
            java.lang.String r10 = "bcd41fd1"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L22:
            android.taobao.windvane.jsbridge.r r0 = new android.taobao.windvane.jsbridge.r
            r0.<init>()
            boolean r1 = android.text.StringUtils.isEmpty(r10)
            java.lang.String r7 = "TBAutoSize.PopLayerBridge"
            java.lang.String r8 = "msg"
            if (r1 == 0) goto L3d
            java.lang.String r10 = "error: webview action is empty!"
            r0.a(r8, r10)
            com.taobao.tao.log.TLog.loge(r7, r10)
            r12.error(r0)
            return r5
        L3d:
            android.taobao.windvane.webview.IWVWebView r1 = r12.getWebview()
            if (r1 != 0) goto L4f
            java.lang.String r10 = "error: webview is empty!"
            r0.a(r8, r10)
            com.taobao.tao.log.TLog.loge(r7, r10)
            r12.error(r0)
            return r5
        L4f:
            r0 = -1
            int r7 = r10.hashCode()
            switch(r7) {
                case -1638876343: goto L94;
                case -1119437941: goto L8a;
                case -899077295: goto L81;
                case -657405329: goto L77;
                case -207343568: goto L6d;
                case -59213635: goto L62;
                case 387468929: goto L58;
                default: goto L57;
            }
        L57:
            goto L9e
        L58:
            java.lang.String r2 = "isFoldDevice"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L9e
            r2 = 1
            goto L9f
        L62:
            java.lang.String r2 = "startSettingActivity"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L9e
            r2 = 6
            goto L9f
        L6d:
            java.lang.String r2 = "isTablet"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L9e
            r2 = 2
            goto L9f
        L77:
            java.lang.String r2 = "isPortraitLayout"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L9e
            r2 = 4
            goto L9f
        L81:
            java.lang.String r3 = "isInMagicWindowMode"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L9e
            goto L9f
        L8a:
            java.lang.String r2 = "getManufacture"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L9e
            r2 = 0
            goto L9f
        L94:
            java.lang.String r2 = "getFoldStatus"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L9e
            r2 = 5
            goto L9f
        L9e:
            r2 = -1
        L9f:
            switch(r2) {
                case 0: goto Lc6;
                case 1: goto Lc2;
                case 2: goto Lbe;
                case 3: goto Lba;
                case 4: goto Lb6;
                case 5: goto La7;
                case 6: goto La3;
                default: goto La2;
            }
        La2:
            return r5
        La3:
            r9.startSettingActivity(r1, r11, r12)
            return r6
        La7:
            com.taobao.android.autosize.config.a r10 = com.taobao.android.autosize.config.a.a()
            boolean r10 = r10.u()
            if (r10 == 0) goto Lb5
            r9.getFoldStatus(r1, r12)
            return r6
        Lb5:
            return r5
        Lb6:
            r9.isPortraitLayout(r1, r12)
            return r6
        Lba:
            r9.isInMagicWindowMode(r1, r12)
            return r6
        Lbe:
            r9.isTablet(r1, r12)
            return r6
        Lc2:
            r9.isFoldDevice(r1, r12)
            return r6
        Lc6:
            r9.getManufacture(r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.api.TBAutoSizeGuideBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private void getManufacture(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3924cf", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("manufacture", Build.MANUFACTURER.toLowerCase());
        TLog.loge(TAG, "manufacture=" + Build.MANUFACTURER.toLowerCase());
        wVCallBackContext.success(rVar);
    }

    private void isFoldDevice(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d16769", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        r rVar = new r();
        boolean d = l.d(iWVWebView.getContext());
        rVar.a("isFolder", Boolean.valueOf(d));
        TLog.loge(TAG, "isFolder=" + d);
        wVCallBackContext.success(rVar);
    }

    private void isTablet(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f16598", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        r rVar = new r();
        boolean b = l.b(iWVWebView.getContext());
        rVar.a(IS_TABLET_ACTION, Boolean.valueOf(b));
        TLog.loge(TAG, "isTablet=" + b);
        wVCallBackContext.success(rVar);
    }

    private void isInMagicWindowMode(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc319c39", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        r rVar = new r();
        boolean b = l.b(getActivity(iWVWebView.getView()));
        rVar.a(IS_IN_MAGIC_WINDOW_MODE, Boolean.valueOf(b));
        TLog.loge(TAG, "isInMagicWindowMode=" + b);
        wVCallBackContext.success(rVar);
    }

    private static Activity getActivity(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("22f2a7a2", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private void isPortraitLayout(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de509457", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        r rVar = new r();
        boolean b = h.a().b((Context) getActivity(iWVWebView.getView()));
        rVar.a(IS_PORTRAIT_LAYOUT, Boolean.valueOf(b));
        TLog.loge(TAG, "isPortraitLayout=" + b);
        wVCallBackContext.success(rVar);
    }

    private void getFoldStatus(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6d031", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        r rVar = new r();
        String a2 = FoldPosture.a(l.q(iWVWebView.getContext()));
        rVar.a("foldStatus", a2);
        TLog.loge(TAG, "foldStatus=" + a2);
        wVCallBackContext.success(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:7:0x0028, B:9:0x0038, B:11:0x0042, B:21:0x006d, B:23:0x0089, B:24:0x008c, B:26:0x0092, B:28:0x0098, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00b5, B:36:0x00bf, B:38:0x00c9, B:20:0x0061, B:14:0x0053), top: B:43:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:7:0x0028, B:9:0x0038, B:11:0x0042, B:21:0x006d, B:23:0x0089, B:24:0x008c, B:26:0x0092, B:28:0x0098, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00b5, B:36:0x00bf, B:38:0x00c9, B:20:0x0061, B:14:0x0053), top: B:43:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:7:0x0028, B:9:0x0038, B:11:0x0042, B:21:0x006d, B:23:0x0089, B:24:0x008c, B:26:0x0092, B:28:0x0098, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00b5, B:36:0x00bf, B:38:0x00c9, B:20:0x0061, B:14:0x0053), top: B:43:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[Catch: Exception -> 0x0114, TRY_LEAVE, TryCatch #0 {Exception -> 0x0114, blocks: (B:7:0x0028, B:9:0x0038, B:11:0x0042, B:21:0x006d, B:23:0x0089, B:24:0x008c, B:26:0x0092, B:28:0x0098, B:29:0x00a0, B:31:0x00aa, B:33:0x00b0, B:34:0x00b5, B:36:0x00bf, B:38:0x00c9, B:20:0x0061, B:14:0x0053), top: B:43:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void startSettingActivity(android.taobao.windvane.webview.IWVWebView r11, java.lang.String r12, android.taobao.windvane.jsbridge.WVCallBackContext r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.api.TBAutoSizeGuideBridge.startSettingActivity(android.taobao.windvane.webview.IWVWebView, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}
