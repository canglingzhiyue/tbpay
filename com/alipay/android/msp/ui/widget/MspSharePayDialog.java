package com.alipay.android.msp.ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.MspPaycodeChannelActivity;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MspSharePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_MERCHANT_PAYMENT = "is_merchant_payment";

    public static /* synthetic */ void a(JSONObject jSONObject, MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1111bc", new Object[]{jSONObject, mspTradeContext, new Boolean(z)});
        } else {
            b(jSONObject, mspTradeContext, z);
        }
    }

    public static /* synthetic */ void a(JSONObject jSONObject, MspTradeContext mspTradeContext, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7dba58c", new Object[]{jSONObject, mspTradeContext, new Boolean(z), context});
        } else {
            c(jSONObject, mspTradeContext, z);
        }
    }

    public static /* synthetic */ void a(String str, String str2, MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6490e2a4", new Object[]{str, str2, mspTradeContext});
        } else {
            b(str, str2, mspTradeContext);
        }
    }

    public static /* synthetic */ void b(JSONObject jSONObject, MspTradeContext mspTradeContext, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f489cf0d", new Object[]{jSONObject, mspTradeContext, new Boolean(z), context});
        } else {
            d(jSONObject, mspTradeContext, z);
        }
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable th) {
            LogUtil.record(1, "isPkgInstalled:".concat(String.valueOf(str)), th.getMessage());
            return false;
        }
    }

    public static void processSel(Context context, JSONObject jSONObject, MspTradeContext mspTradeContext) {
        EventAction createMspEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521e2ec6", new Object[]{context, jSONObject, mspTradeContext});
            return;
        }
        String string = jSONObject.getString("channel");
        if (!TextUtils.equals(string, "code") && !a(context, "com.eg.android.AlipayGphone")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("failact");
            if (jSONObject2 == null || (createMspEvent = MspEventCreator.get().createMspEvent("MspSharePayDialog.processSel", jSONObject2)) == null) {
                return;
            }
            createMspEvent.setFromLocalEvent(true);
            ActionsCreator.get(mspTradeContext).createEventAction(createMspEvent);
        } else if (TextUtils.equals(string, SubstituteConstants.KEY_CHANNEL_FRIENDS)) {
            c(jSONObject, mspTradeContext, false);
        } else if (TextUtils.equals(string, "code")) {
            b(jSONObject, mspTradeContext, false);
        } else if (!TextUtils.equals(string, "phone")) {
        } else {
            d(jSONObject, mspTradeContext, false);
        }
    }

    public static void processSdk(Context context, JSONObject jSONObject, MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f59e2e6", new Object[]{context, jSONObject, mspTradeContext});
        } else if (jSONObject != null) {
            try {
                String string = jSONObject.getString("params");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.remove("params");
                    JSONObject parseObject = JSON.parseObject(string);
                    for (String str : parseObject.keySet()) {
                        jSONObject.put(str, (Object) parseObject.getString(str));
                    }
                }
                JSONArray jSONArray = jSONObject.getJSONArray("channels");
                List parseArray = JSONObject.parseArray(JSONObject.toJSONString(jSONArray), String.class);
                int size = parseArray.size();
                if (size == 1) {
                    if (TextUtils.equals(jSONArray.getString(0), SubstituteConstants.KEY_CHANNEL_FRIENDS)) {
                        c(jSONObject, mspTradeContext, false);
                    } else if (TextUtils.equals(jSONArray.getString(0), "code")) {
                        b(jSONObject, mspTradeContext, true);
                    } else if (TextUtils.equals(jSONArray.getString(0), "phone")) {
                        d(jSONObject, mspTradeContext, false);
                    } else if (TextUtils.equals(jSONArray.getString(0), "shareToken")) {
                        b("/shareppay/shareToken", "{}", mspTradeContext);
                    }
                } else {
                    if (size <= 1) {
                        return;
                    }
                    a(context, parseArray, jSONObject, mspTradeContext);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void processWallet(Context context, JSONObject jSONObject, MspTradeContext mspTradeContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767b47c9", new Object[]{context, jSONObject, mspTradeContext});
        } else if (jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("channel");
                if (!TextUtils.isEmpty(string) && (parseObject = JSON.parseObject(string)) != null && parseObject.size() > 0) {
                    ArrayList arrayList = new ArrayList(parseObject.keySet());
                    int size = parseObject.size();
                    if (size != 1) {
                        if (size <= 1) {
                            return;
                        }
                        a(context, arrayList, jSONObject, mspTradeContext);
                    } else if (TextUtils.equals((CharSequence) arrayList.get(0), SubstituteConstants.KEY_CHANNEL_FRIENDS)) {
                        if (mspTradeContext.isFromWallet()) {
                            z = false;
                        }
                        c(jSONObject, mspTradeContext, z);
                    } else if (TextUtils.equals((CharSequence) arrayList.get(0), "code")) {
                        b(jSONObject, mspTradeContext, false);
                    } else if (TextUtils.equals((CharSequence) arrayList.get(0), "phone")) {
                        if (mspTradeContext.isFromWallet()) {
                            z = false;
                        }
                        d(jSONObject, mspTradeContext, z);
                    } else if (!TextUtils.equals((CharSequence) arrayList.get(0), "shareToken")) {
                    } else {
                        b("/shareppay/shareToken", "{}", mspTradeContext);
                    }
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    private static void a(final Context context, List<String> list, final JSONObject jSONObject, final MspTradeContext mspTradeContext) {
        List<String> list2 = list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7229c41", new Object[]{context, list2, jSONObject, mspTradeContext});
        } else if (mspTradeContext != null) {
            final MspWindowFrame mspWindowFrame = null;
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.share_app_layout, (ViewGroup) null);
            ((TextView) relativeLayout.findViewById(R.id.share_item0_subtitle)).setText(LanguageHelper.localizedStringForKey("share_aliapy_friend_content", context.getString(R.string.share_aliapy_friend_content), new Object[0]));
            ((TextView) relativeLayout.findViewById(R.id.share_item1_subtitle)).setText(LanguageHelper.localizedStringForKey("share_aliapy_contact_content", context.getString(R.string.share_aliapy_contact_content), new Object[0]));
            ((TextView) relativeLayout.findViewById(R.id.share_item2_subtitle)).setText(LanguageHelper.localizedStringForKey("share_code_content", context.getString(R.string.share_code_content), new Object[0]));
            ((TextView) relativeLayout.findViewById(R.id.share_item3_subtitle)).setText(LanguageHelper.localizedStringForKey("share_code_content", context.getString(R.string.share_code_content), new Object[0]));
            final Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setContentView(relativeLayout);
            dialog.show();
            if (dialog.getWindow() != null) {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            final MspUIClient mspUIClient = mspTradeContext.getMspUIClient();
            if (mspUIClient != null && mspUIClient.getFrameStack() != null) {
                mspWindowFrame = mspUIClient.getFrameStack().getTopTplOrNativeFrame();
            }
            SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Close, SpmHelper.Action.Exposure, mspTradeContext.getBizId(), mspWindowFrame);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.ui.widget.MspSharePayDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    MspUIClient mspUIClient2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Close, SpmHelper.Action.Clicked, MspTradeContext.this.getBizId(), mspWindowFrame);
                    if (!MspTradeContext.this.isFromWallet() || (mspUIClient2 = mspUIClient) == null) {
                        return;
                    }
                    if (mspUIClient2.getFrameStack().getTopTplFrame() == null) {
                        LogUtil.record(1, "SharePayDialog", "getCurrentDefaultWindow == null");
                    } else {
                        LogUtil.record(1, "SharePayDialog tplid:", mspUIClient.getFrameStack().getTopTplFrame().getTplId());
                    }
                    if (mspUIClient.getFrameStack().getTopTplFrame() != null && mspUIClient.getFrameStack().getTopTplFrame().getTplId().contains("cashier-channel-logo-flex")) {
                        return;
                    }
                    MspTradeContext.this.exit(0);
                }
            });
            boolean hasAlipayWallet = DeviceInfo.hasAlipayWallet(context);
            int[] iArr = {R.id.share_item0, R.id.share_item1, R.id.share_item2, R.id.share_item3};
            int[] iArr2 = {R.id.share_item0_title, R.id.share_item1_title, R.id.share_item2_title, R.id.share_item3_title};
            int[] iArr3 = {R.id.share_item0_subtitle, R.id.share_item1_subtitle, R.id.share_item2_subtitle, R.id.share_item3_subtitle};
            int[] iArr4 = {R.id.share_item0_img, R.id.share_item1_img, R.id.share_item2_img, R.id.share_item3_img};
            int i = 0;
            for (int i2 = 4; i < i2; i2 = 4) {
                View findViewById = relativeLayout.findViewById(iArr[i]);
                TextView textView = (TextView) relativeLayout.findViewById(iArr2[i]);
                TextView textView2 = (TextView) relativeLayout.findViewById(iArr3[i]);
                int[] iArr5 = iArr;
                ImageView imageView = (ImageView) relativeLayout.findViewById(iArr4[i]);
                RelativeLayout relativeLayout2 = relativeLayout;
                findViewById.setVisibility(8);
                if (i < list.size()) {
                    String str = list2.get(i);
                    if (TextUtils.equals(str, SubstituteConstants.KEY_CHANNEL_FRIENDS) && hasAlipayWallet) {
                        textView.setText("发送给支付宝好友");
                        textView2.setText("指定一位好友，让TA帮你付款");
                        imageView.setImageResource(R.drawable.sharepay_channel_friend);
                        SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Friend, SpmHelper.Action.Exposure, mspTradeContext.getBizId(), mspWindowFrame);
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspSharePayDialog.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                MspSharePayDialog.a(JSONObject.this, mspTradeContext, false, context);
                                SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Friend, SpmHelper.Action.Clicked, mspTradeContext.getBizId(), mspWindowFrame);
                            }
                        });
                        findViewById.setVisibility(0);
                    } else if (TextUtils.equals(str, "code")) {
                        textView.setText("面对面扫码");
                        textView2.setText("朋友就在身边，快让TA打开扫一扫");
                        imageView.setImageResource(R.drawable.sharepay_channel_paycode);
                        SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Paycode, SpmHelper.Action.Exposure, mspTradeContext.getBizId(), mspWindowFrame);
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspSharePayDialog.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                MspSharePayDialog.a(JSONObject.this, mspTradeContext, true);
                                SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Paycode, SpmHelper.Action.Clicked, mspTradeContext.getBizId(), mspWindowFrame);
                            }
                        });
                        findViewById.setVisibility(0);
                    } else if (TextUtils.equals(str, "phone") && hasAlipayWallet) {
                        textView.setText("发送给通讯录好友");
                        textView2.setText("还没加TA好友，不要错过这个机会");
                        imageView.setImageResource(R.drawable.sharepay_channel_phone);
                        SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Phone, SpmHelper.Action.Exposure, mspTradeContext.getBizId(), mspWindowFrame);
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspSharePayDialog.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                MspSharePayDialog.b(JSONObject.this, mspTradeContext, false, context);
                                SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_Phone, SpmHelper.Action.Clicked, mspTradeContext.getBizId(), mspWindowFrame);
                            }
                        });
                        findViewById.setVisibility(0);
                    } else if (TextUtils.equals(str, "shareToken")) {
                        textView.setText("发送给微信好友");
                        textView2.setText("找微信好友，让TA出手相助");
                        imageView.setImageResource(R.drawable.sharepay_channel_sharetoken);
                        SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_ShareToken, SpmHelper.Action.Exposure, mspTradeContext.getBizId(), mspWindowFrame);
                        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspSharePayDialog.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                dialog.dismiss();
                                MspSharePayDialog.a("/shareppay/shareToken", "{}", mspTradeContext);
                                SpmHelper.saveControlSpm(SpmHelper.Control.Subpay_Channel_ShareToken, SpmHelper.Action.Clicked, mspTradeContext.getBizId(), mspWindowFrame);
                            }
                        });
                        findViewById.setVisibility(0);
                    }
                    i++;
                    list2 = list;
                    iArr = iArr5;
                    relativeLayout = relativeLayout2;
                }
                i++;
                list2 = list;
                iArr = iArr5;
                relativeLayout = relativeLayout2;
            }
        }
    }

    private static void b(JSONObject jSONObject, MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6937a11b", new Object[]{jSONObject, mspTradeContext, new Boolean(z)});
            return;
        }
        if (mspTradeContext != null) {
            mspTradeContext.getStatisticInfo().addEvent(new StEvent(mspTradeContext.getCurrentWinTpName(), CountValue.T_SUBPAY, CountValue.C_SUBPAY_PROCESS_CODE));
        }
        Bundle bundle = new Bundle();
        bundle.putString("channel", "code");
        bundle.putString("avatar", jSONObject.getString("avatar"));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SHOWNAME, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SHOWNAME));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_REALNAME, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_REALNAME));
        bundle.putString("desc", jSONObject.getString("desc"));
        bundle.putString("amount", jSONObject.getString("amount"));
        bundle.putString("quantity", jSONObject.getString("quantity"));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_DEFAULT_URL, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_DEFAULT_URL));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_GOODS_URL, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_GOODS_URL));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_CODEURL, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_CODEURL));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_TIME, jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_TIME));
        bundle.putBoolean(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON, Boolean.valueOf(jSONObject.getString(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON)).booleanValue());
        bundle.putString(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_LINK, jSONObject.getString(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_LINK));
        bundle.putString(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_NAME, jSONObject.getString(SubstituteConstants.KEY_CODE_DOWNLOAD_BUTTON_NAME));
        if (mspTradeContext != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mspTradeContext.isFromWallet());
            bundle.putString(SubstituteConstants.IS_FROM_WALLET, sb.toString());
        } else {
            bundle.putString(SubstituteConstants.IS_FROM_WALLET, "false");
        }
        bundle.putInt("bizId", mspTradeContext == null ? -1 : mspTradeContext.getBizId());
        bundle.putBoolean("needExit", z);
        if (mspTradeContext == null) {
            return;
        }
        a(mspTradeContext.getMspUIClient(), bundle);
    }

    private static void c(JSONObject jSONObject, MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685e307a", new Object[]{jSONObject, mspTradeContext, new Boolean(z)});
            return;
        }
        if (mspTradeContext != null) {
            mspTradeContext.getStatisticInfo().addEvent(new StEvent(mspTradeContext.getCurrentWinTpName(), CountValue.T_SUBPAY, CountValue.C_SUBPAY_PROCESS_FRINEDS));
        }
        Bundle bundle = new Bundle();
        bundle.putString("channel", a(SubstituteConstants.KEY_CHANNEL_FRIENDS));
        bundle.putString("mode", a(jSONObject.getString("mode")));
        bundle.putString("desc", a(jSONObject.getString("desc")));
        bundle.putString("amount", a(jSONObject.getString("amount")));
        bundle.putString("quantity", a(jSONObject.getString("quantity")));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_DEFAULT_URL, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_DEFAULT_URL)));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_GOODS_URL, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_GOODS_URL)));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN)));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL)));
        bundle.putString(MspGlobalDefine.SESSION, a(jSONObject.getString(MspGlobalDefine.SESSION)));
        bundle.putString(IS_MERCHANT_PAYMENT, a(String.valueOf(z)));
        if (mspTradeContext != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mspTradeContext.isFromWallet());
            bundle.putString(SubstituteConstants.IS_FROM_WALLET, a(sb.toString()));
        } else {
            bundle.putString(SubstituteConstants.IS_FROM_WALLET, a("false"));
        }
        bundle.putString("backScheme", a("alipay://merchantpay?schemeBizType=substitutePay"));
        bundle.putString("backPackage", a(GlobalHelper.getInstance().getPackageName()));
        Intent intent = new Intent();
        intent.setPackage("com.eg.android.AlipayGphone");
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        StringBuilder sb2 = new StringBuilder("alipays://platformapi/startapp?appId=20001099");
        for (String str : bundle.keySet()) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=");
            sb2.append(bundle.getString(str));
        }
        intent.setData(Uri.parse(sb2.toString()));
        intent.putExtras(bundle);
        try {
            MspUIClient mspUIClient = mspTradeContext.getMspUIClient();
            if (mspUIClient.getCurrentPresenter() == null || mspUIClient.getCurrentPresenter().getActivity() == null) {
                return;
            }
            mspUIClient.getCurrentPresenter().getActivity().startActivity(intent);
        } catch (Exception e) {
            if (mspTradeContext == null) {
                return;
            }
            mspTradeContext.getStatisticInfo().addError(ErrorType.WARNING, ErrorCode.START_SCHEME_ERROR, e);
        }
    }

    private static void d(JSONObject jSONObject, MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6784bfd9", new Object[]{jSONObject, mspTradeContext, new Boolean(z)});
            return;
        }
        if (mspTradeContext != null) {
            mspTradeContext.getStatisticInfo().addEvent(new StEvent(mspTradeContext.getCurrentWinTpName(), CountValue.T_SUBPAY, CountValue.C_SUBPAY_PROCESS_PHONE));
        }
        Bundle bundle = new Bundle();
        bundle.putString("channel", a("phone"));
        bundle.putString("desc", a(jSONObject.getString("desc")));
        bundle.putString("amount", a(jSONObject.getString("amount")));
        bundle.putString("quantity", a(jSONObject.getString("quantity")));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_DEFAULT_URL, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_DEFAULT_URL)));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_GOODS_URL, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_GOODS_URL)));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN)));
        bundle.putString(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL, a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL)));
        bundle.putString(MspGlobalDefine.SESSION, a(jSONObject.getString(MspGlobalDefine.SESSION)));
        bundle.putString(IS_MERCHANT_PAYMENT, a(String.valueOf(z)));
        if (mspTradeContext != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mspTradeContext.isFromWallet());
            bundle.putString(SubstituteConstants.IS_FROM_WALLET, a(sb.toString()));
        } else {
            bundle.putString(SubstituteConstants.IS_FROM_WALLET, a("false"));
        }
        bundle.putString("backScheme", a("alipay://merchantpay?schemeBizType=substitutePay"));
        bundle.putString("backPackage", a(GlobalHelper.getInstance().getPackageName()));
        Intent intent = new Intent();
        intent.setPackage("com.eg.android.AlipayGphone");
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        StringBuilder sb2 = new StringBuilder("alipays://platformapi/startapp?appId=20001099");
        for (String str : bundle.keySet()) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=");
            sb2.append(bundle.getString(str));
        }
        intent.setData(Uri.parse(sb2.toString()));
        intent.putExtras(bundle);
        try {
            MspUIClient mspUIClient = mspTradeContext.getMspUIClient();
            if (mspUIClient.getCurrentPresenter() == null || mspUIClient.getCurrentPresenter().getActivity() == null) {
                return;
            }
            mspUIClient.getCurrentPresenter().getActivity().startActivity(intent);
        } catch (Exception e) {
            if (mspTradeContext == null) {
                return;
            }
            mspTradeContext.getStatisticInfo().addError(ErrorType.WARNING, ErrorCode.START_SCHEME_ERROR, e);
        }
    }

    private static void a(MspUIClient mspUIClient, Bundle bundle) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9750c3e9", new Object[]{mspUIClient, bundle});
            return;
        }
        LogUtil.record(4, "MspSharePayDialog", "startPaycodeActivity");
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null || (activity = mspUIClient.getCurrentPresenter().getActivity()) == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(activity.getApplication().getPackageName(), MspPaycodeChannelActivity.class.getCanonicalName()));
        intent.setAction("android.intent.action.VIEW");
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str);
        } catch (Throwable unused) {
            return str;
        }
    }

    private static void b(String str, String str2, MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34511643", new Object[]{str, str2, mspTradeContext});
        } else if (mspTradeContext == null || mspTradeContext.getMspUIClient() == null) {
        } else {
            MspBasePresenter currentPresenter = mspTradeContext.getMspUIClient().getCurrentPresenter();
            if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
                currentPresenter.mo545getIView().showLoadingView(new String[0]);
            }
            ActionsCreator.get(mspTradeContext).createSubmitEventAction(str, str2, EventAction.SubmitType.CommonRequest, 0);
        }
    }
}
