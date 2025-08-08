package com.alipay.android.msp.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MspShareTokenDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Dialog showDialog(final Context context, String str, final MspTradeContext mspTradeContext, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f147cd35", new Object[]{context, str, mspTradeContext, new Boolean(z)});
        }
        boolean a2 = a(context, "com.tencent.mm");
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.substitute_sharetoken_dialog, (ViewGroup) null);
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        dialog.show();
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        TextView textView = (TextView) linearLayout.findViewById(R.id.alipay_sharetoken_btn1);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.alipay_sharetoken_btn2);
        ((TextView) linearLayout.findViewById(R.id.title)).setText("你的吱口令已生成");
        ((TextView) linearLayout.findViewById(R.id.content)).setText(str);
        if (mspTradeContext == null) {
            return null;
        }
        MspUIClient mspUIClient = mspTradeContext.getMspUIClient();
        final MspWindowFrame topTplOrNativeFrame = (mspUIClient == null || mspUIClient.getFrameStack() == null) ? null : mspUIClient.getFrameStack().getTopTplOrNativeFrame();
        if (a2) {
            textView.setVisibility(0);
            textView.setText("不粘贴了");
            textView.setTextColor(-7829368);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspShareTokenDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    SpmWrapper.onPageClick(MspWindowFrame.this, "a283.b16425.c40664.d82252", "pay", FeedbackStore.createSpmSessionId(mspTradeContext.getBizId(), MspWindowFrame.this), null, mspTradeContext.getBizId());
                    dialog.dismiss();
                }
            });
            MspWindowFrame mspWindowFrame = topTplOrNativeFrame;
            SpmWrapper.onPageExposure(mspWindowFrame, "a283.b16425.c40664.d82252", "pay", "", FeedbackStore.createSpmSessionId(mspTradeContext.getBizId(), topTplOrNativeFrame), null, mspTradeContext.getBizId());
            textView2.setVisibility(0);
            textView2.setText("去微信粘贴");
            textView2.setTextColor(-15692055);
            SpmWrapper.onPageExposure(mspWindowFrame, "a283.b16425.c40664.d82251", "pay", "", FeedbackStore.createSpmSessionId(mspTradeContext.getBizId(), topTplOrNativeFrame), null, mspTradeContext.getBizId());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspShareTokenDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    SpmWrapper.onPageClick(MspWindowFrame.this, "a283.b16425.c40664.d82251", "pay", FeedbackStore.createSpmSessionId(mspTradeContext.getBizId(), MspWindowFrame.this), null, mspTradeContext.getBizId());
                    dialog.dismiss();
                    final Intent intent = new Intent();
                    intent.setPackage("com.tencent.mm");
                    intent.setAction("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    intent.setData(Uri.parse("weixin://"));
                    final Context applicationContext = context.getApplicationContext();
                    if (z) {
                        mspTradeContext.exit(0);
                    }
                    new Handler(applicationContext.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspShareTokenDialog.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                applicationContext.startActivity(intent);
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    }, 200L);
                }
            });
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText("知道了");
            textView2.setTextColor(-7829368);
            SpmWrapper.onPageExposure(topTplOrNativeFrame, "a283.b16425.c40664.d82252", "pay", "", FeedbackStore.createSpmSessionId(mspTradeContext.getBizId(), topTplOrNativeFrame), null, mspTradeContext.getBizId());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspShareTokenDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    SpmWrapper.onPageClick(MspWindowFrame.this, "a283.b16425.c40664.d82252", "pay", FeedbackStore.createSpmSessionId(mspTradeContext.getBizId(), MspWindowFrame.this), null, mspTradeContext.getBizId());
                    dialog.dismiss();
                }
            });
        }
        PhoneCashierMspEngine.getMspWallet().writeClipData(context, str, "pay");
        return dialog;
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable th) {
            LogUtil.record(1, "isPkgInstalled:".concat(String.valueOf(str)), th.getMessage());
            return false;
        }
    }
}
