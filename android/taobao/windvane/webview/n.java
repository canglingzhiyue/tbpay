package android.taobao.windvane.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.config.t;
import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(845598286);
    }

    public static boolean a(final String str, Context context, final g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1101be42", new Object[]{str, context, gVar})).booleanValue();
        }
        if (!gVar.canUseGlobalUrlConfig() && !gVar.canUseUrlConfig()) {
            return false;
        }
        if (t.a().i(str)) {
            gVar.setAllowAllOpen(true);
            return false;
        } else if (gVar.allowAllOpen()) {
            android.taobao.windvane.monitor.a.commitFail(t.MONITOR_POINT_NEW_SECURITY_ALLOW, 5, "allowAll名单允许", str);
            return false;
        } else {
            Uri uri = null;
            try {
                uri = Uri.parse(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (uri == null) {
                return true;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (!StringUtils.isEmpty(scheme) && !StringUtils.isEmpty(host) && ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
                if (t.a().g(str)) {
                    if (context instanceof MutableContextWrapper) {
                        context = ((MutableContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof Activity)) {
                        return false;
                    }
                    final Activity activity = (Activity) context;
                    Intent intent = new Intent("NON_WHITELIST_URL_VISIT");
                    intent.putExtra("url", str);
                    intent.putExtra("whitelistAvailable", 1);
                    intent.putExtra("from", "windvane");
                    if (context != null) {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
                    }
                    AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle("提示");
                    title.setMessage("下个页面不受我们控制哦，使用时请注意安全" + scheme + HttpConstant.SCHEME_SPLIT + host).setPositiveButton("浏览器打开", new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.webview.n.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            try {
                                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                if (gVar.getPageLoadedCount() > 0 || !(gVar instanceof IWVWebView)) {
                                    return;
                                }
                                ((IWVWebView) gVar).back();
                            } catch (Throwable unused) {
                            }
                        }
                    }).setNegativeButton(ILocalizationService.CANCEL, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.webview.n.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else if (g.this.getPageLoadedCount() <= 0) {
                                activity.finish();
                            } else {
                                g gVar2 = g.this;
                                if (!(gVar2 instanceof IWVWebView)) {
                                    return;
                                }
                                ((IWVWebView) gVar2).refresh();
                            }
                        }
                    }).setCancelable(false).create().show();
                    StringBuilder sb = new StringBuilder();
                    sb.append("doFilter() called with: url = [");
                    sb.append(str);
                    sb.append("] block");
                    android.taobao.windvane.util.m.e("WVURLFilter", sb.toString());
                    return true;
                }
                android.taobao.windvane.util.m.b("WVURLFilter", "doFilter() called with: url = [" + str + "] allow");
            }
            return false;
        }
    }
}
